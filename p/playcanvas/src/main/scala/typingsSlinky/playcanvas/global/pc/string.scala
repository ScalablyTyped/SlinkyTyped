package typingsSlinky.playcanvas.global.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Extended String API.
  */
@JSGlobal("pc.string")
@js.native
object string extends js.Object {
  
  /**
    * All ASCII letters.
    */
  val ASCII_LETTERS: String = js.native
  
  /**
    * All lowercase letters.
    */
  val ASCII_LOWERCASE: String = js.native
  
  /**
    * All uppercase letters.
    */
  val ASCII_UPPERCASE: String = js.native
  
  /**
    * Return a string with {n} replaced with the n-th argument.
    * @example
    * var s = pc.string.format("Hello {0}", "world");
    * console.log(s); // Prints "Hello world"
    * @param s - The string to format.
    * @param [arguments] - All other arguments are substituted into the string.
    * @returns The formatted string.
    */
  def format(s: String): String = js.native
  def format(s: String, arguments: js.Any): String = js.native
  
  /**
    * Get the string for a given code point or set of code points. Polyfill for
    * [`fromCodePoint`]{@link https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/fromCodePoint}.
    * @param args - The code points to convert to a string.
    * @returns The converted string.
    */
  def fromCodePoint(args: Double*): String = js.native
  
  /**
    * Get the code point number for a character in a string. Polyfill for
    * [`codePointAt`]{@link https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/codePointAt}.
    * @param string - The string to get the code point from.
    * @param [i] - The index in the string.
    * @returns The code point value for the character in the string.
    */
  def getCodePoint(string: String): Double = js.native
  def getCodePoint(string: String, i: Double): Double = js.native
  
  /**
    * Gets an array of all code points in a string.
    * @param string - The string to get code points from.
    * @returns The code points in the string.
    */
  def getCodePoints(string: String): js.Array[Double] = js.native
  
  /**
    * Gets an array of all grapheme clusters (visible symbols) in a string. This is needed because
    * some symbols (such as emoji or accented characters) are actually made up of multiple character codes.
    * @param string - The string to break into symbols.
    * @returns The symbols in the string.
    */
  def getSymbols(string: String): js.Array[String] = js.native
  
  /**
    * Convert a string value to a boolean. In non-strict mode (the default), 'true' is converted to true, all other values
    * are converted to false. In strict mode, 'true' is converted to true, 'false' is converted to false, all other values will throw
    * an Exception.
    * @param s - The string to convert.
    * @param [strict] - In strict mode an Exception is thrown if s is not an accepted string value. Defaults to false.
    * @returns The converted value.
    */
  def toBool(s: String): Boolean = js.native
  def toBool(s: String, strict: Boolean): Boolean = js.native
}
