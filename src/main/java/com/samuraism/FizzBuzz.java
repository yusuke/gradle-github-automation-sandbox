/*
   Copyright 2021 the original author or authors.

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */
package com.samuraism;

public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(fizzBuzz(i));
        }
    }

    static String fizzBuzz(int i) {
        String out ="";
        if (i%3==0) {
            out += "Fizz";
        }
        if (i%5==0) {
            out += "Buzz";
        }
        if (i % 3 != 0 && i % 5 != 0) {
            out+=i;
        }
        return out;
    }

}
