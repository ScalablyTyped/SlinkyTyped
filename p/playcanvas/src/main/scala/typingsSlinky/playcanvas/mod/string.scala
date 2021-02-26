package typingsSlinky.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Extended String API.
  */
object string {
  
  /**
    * All ASCII letters.
    */
  @JSImport("playcanvas", "string.ASCII_LETTERS")
  @js.native
  val ASCII_LETTERS: String = js.native
  
  /**
    * All lowercase letters.
    */
  @JSImport("playcanvas", "string.ASCII_LOWERCASE")
  @js.native
  val ASCII_LOWERCASE: String = js.native
  
  /**
    * All uppercase letters.
    */
  @JSImport("playcanvas", "string.ASCII_UPPERCASE")
  @js.native
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
  @JSImport("playcanvas", "string.format")
  @js.native
  def format(s: String): String = js.native
  @JSImport("playcanvas", "string.format")
  @js.native
  def format(s: String, arguments: js.Any): String = js.native
  
  /**
    * Get the string for a given code point or set of code points. Polyfill for
    * [`fromCodePoint`]{@link https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/fromCodePoint}.
    * @param args - The code points to convert to a string.
    * @returns The converted string.
    */
  @JSImport("playcanvas", "string.fromCodePoint")
  @js.native
  def fromCodePoint(args: Double*): String = js.native
  
  /**
    * Get the code point number for a character in a string. Polyfill for
    * [`codePointAt`]{@link https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/codePointAt}.
    * @param string - The string to get the code point from.
    * @param [i] - The index in the string.
    * @returns The code point value for the character in the string.
    */
  @JSImport("playcanvas", "string.getCodePoint")
  @js.native
  def getCodePoint(string: String): Double = js.native
  @JSImport("playcanvas", "string.getCodePoint")
  @js.native
  def getCodePoint(string: String, i: Double): Double = js.native
  
  /**
    * Gets an array of all code points in a string.
    * @param string - The string to get code points from.
    * @returns The code points in the string.
    */
  @JSImport("playcanvas", "string.getCodePoints")
  @js.native
  def getCodePoints(string: String): js.Array[Double] = js.native
  
  /**
    * Gets an array of all grapheme clusters (visible symbols) in a string. This is needed because
    * some symbols (such as emoji or accented characters) are actually made up of multiple character codes.
    * @param string - The string to break into symbols.
    * @returns The symbols in the string.
    */
  @JSImport("playcanvas", "string.getSymbols")
  @js.native
  def getSymbols(string: String): js.Array[String] = js.native
  
  /**
    * Convert a string value to a boolean. In non-strict mode (the default), 'true' is converted to true, all other values
    * are converted to false. In strict mode, 'true' is converted to true, 'false' is converted to false, all other values will throw
    * an Exception.
    * @param s - The string to convert.
    * @param [strict] - In strict mode an Exception is thrown if s is not an accepted string value. Defaults to false.
    * @returns The converted value.
    */
  @JSImport("playcanvas", "string.toBool")
  @js.native
  def toBool(s: String): Boolean = js.native
  @JSImport("playcanvas", "string.toBool")
  @js.native
  def toBool(s: String, strict: Boolean): Boolean = js.native
}
