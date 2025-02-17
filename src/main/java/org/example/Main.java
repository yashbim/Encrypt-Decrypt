package org.example;

import java.sql.Array;

public class Main {
    public static void main(String[] args) {
        String inputText = "Hello World!";
        Encrypt(inputText);
    }

    public static void Encrypt(String inputText) {
        System.out.println(inputText);
        char[] originalTextArray = inputText.toCharArray();
        for (int i = 0; i < inputText.length(); i++) {
            System.out.println(originalTextArray[i]);
        }

        for (int i = 0; i < originalTextArray.length; i=i+2) {
            char temp = 0;
            originalTextArray[i] = temp;
            originalTextArray[i] = originalTextArray[i+1];
            originalTextArray[i+1] = temp;
        }

        System.out.println("==");

        for (int i = 0; i < inputText.length(); i++) {
            System.out.println(originalTextArray[i]);
        }

//        for (int i = 0; i < originalTextArray.length(); i++) {}
    }
}