package typingsSlinky.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Math API.
  */
object math {
  
  /**
    * Conversion factor between degrees and radians.
    * @example
    * // Convert 180 degrees to pi radians
    * var rad = 180 * pc.math.DEG_TO_RAD;
    */
  @JSGlobal("pc.math.DEG_TO_RAD")
  @js.native
  val DEG_TO_RAD: Double = js.native
  
  /**
    * Conversion factor between degrees and radians.
    * @example
    * // Convert pi radians to 180 degrees
    * var deg = Math.PI * pc.math.RAD_TO_DEG;
    */
  @JSGlobal("pc.math.RAD_TO_DEG")
  @js.native
  val RAD_TO_DEG: Double = js.native
  
  /**
    * Convert 3 8 bit Numbers into a single unsigned 24 bit Number.
    * @example
    * // Set result1 to 0x112233 from an array of 3 values
    * var result1 = pc.math.bytesToInt24([0x11, 0x22, 0x33]);
    *
    * // Set result2 to 0x112233 from 3 discrete values
    * var result2 = pc.math.bytesToInt24(0x11, 0x22, 0x33);
    * @param r - A single byte (0-255).
    * @param g - A single byte (0-255).
    * @param b - A single byte (0-255).
    * @returns A single unsigned 24 bit Number.
    */
  @JSGlobal("pc.math.bytesToInt24")
  @js.native
  def bytesToInt24(r: Double, g: Double, b: Double): Double = js.native
  
  /**
    * Convert 4 1-byte Numbers into a single unsigned 32bit Number.
    * @example
    * // Set result1 to 0x11223344 from an array of 4 values
    * var result1 = pc.math.bytesToInt32([0x11, 0x22, 0x33, 0x44]);
    *
    * // Set result2 to 0x11223344 from 4 discrete values
    * var result2 = pc.math.bytesToInt32(0x11, 0x22, 0x33, 0x44);
    * @param r - A single byte (0-255).
    * @param g - A single byte (0-255).
    * @param b - A single byte (0-255).
    * @param a - A single byte (0-255).
    * @returns A single unsigned 32bit Number.
    */
  @JSGlobal("pc.math.bytesToInt32")
  @js.native
  def bytesToInt32(r: Double, g: Double, b: Double, a: Double): Double = js.native
  
  /**
    * Clamp a number between min and max inclusive.
    * @param value - Number to clamp.
    * @param min - Min value.
    * @param max - Max value.
    * @returns The clamped value.
    */
  @JSGlobal("pc.math.clamp")
  @js.native
  def clamp(value: Double, min: Double, max: Double): Double = js.native
  
  /**
    * Converts float number to half float representation.
    * @param val - The float number.
    * @returns A 16 bit number representing half float representation as used by GPU.
    */
  @JSGlobal("pc.math.float2Half")
  @js.native
  def float2Half(`val`: Double): Double = js.native
  
  /**
    * Convert an 24 bit integer into an array of 3 bytes.
    * @example
    * // Set bytes to [0x11, 0x22, 0x33]
    * var bytes = pc.math.intToBytes24(0x112233);
    * @param i - Number holding an integer value.
    * @returns An array of 3 bytes.
    */
  @JSGlobal("pc.math.intToBytes24")
  @js.native
  def intToBytes24(i: Double): js.Array[Double] = js.native
  
  /**
    * Convert an 32 bit integer into an array of 4 bytes.
    * @example
    * // Set bytes to [0x11, 0x22, 0x33, 0x44]
    * var bytes = pc.math.intToBytes32(0x11223344);
    * @param i - Number holding an integer value.
    * @returns An array of 4 bytes.
    */
  @JSGlobal("pc.math.intToBytes32")
  @js.native
  def intToBytes32(i: Double): js.Array[Double] = js.native
  
  /**
    * Calculates the linear interpolation of two numbers.
    * @param a - Number to linearly interpolate from.
    * @param b - Number to linearly interpolate to.
    * @param alpha - The value controlling the result of interpolation. When alpha is 0,
    * a is returned. When alpha is 1, b is returned. Between 0 and 1, a linear interpolation between
    * a and b is returned. alpha is clamped between 0 and 1.
    * @returns The linear interpolation of two numbers.
    */
  @JSGlobal("pc.math.lerp")
  @js.native
  def lerp(a: Double, b: Double, alpha: Double): Double = js.native
  
  /**
    * Calculates the linear interpolation of two angles ensuring that interpolation
    * is correctly performed across the 360 to 0 degree boundary. Angles are supplied in degrees.
    * @param a - Angle (in degrees) to linearly interpolate from.
    * @param b - Angle (in degrees) to linearly interpolate to.
    * @param alpha - The value controlling the result of interpolation. When alpha is 0,
    * a is returned. When alpha is 1, b is returned. Between 0 and 1, a linear interpolation between
    * a and b is returned. alpha is clamped between 0 and 1.
    * @returns The linear interpolation of two angles.
    */
  @JSGlobal("pc.math.lerpAngle")
  @js.native
  def lerpAngle(a: Double, b: Double, alpha: Double): Double = js.native
  
  /**
    * Returns the next power of 2 for the specified value.
    * @param val - The value for which to calculate the next power of 2.
    * @returns The next power of 2.
    */
  @JSGlobal("pc.math.nextPowerOfTwo")
  @js.native
  def nextPowerOfTwo(`val`: Double): Double = js.native
  
  /**
    * Returns true if argument is a power-of-two and false otherwise.
    * @param x - Number to check for power-of-two property.
    * @returns True if power-of-two and false otherwise.
    */
  @JSGlobal("pc.math.powerOfTwo")
  @js.native
  def powerOfTwo(x: Double): Boolean = js.native
  
  /**
    * Return a pseudo-random number between min and max.
    * The number generated is in the range [min, max), that is inclusive of the minimum but exclusive of the maximum.
    * @param min - Lower bound for range.
    * @param max - Upper bound for range.
    * @returns Pseudo-random number between the supplied range.
    */
  @JSGlobal("pc.math.random")
  @js.native
  def random(min: Double, max: Double): Double = js.native
  
  /**
    * Rounds a number up to nearest multiple.
    * @param numToRound - The number to round up.
    * @param multiple - The multiple to round up to.
    * @returns A number rounded up to nearest multiple.
    */
  @JSGlobal("pc.math.roundUp")
  @js.native
  def roundUp(numToRound: Double, multiple: Double): Double = js.native
  
  /**
    * An improved version of the pc.math.smoothstep function which has zero
    * 1st and 2nd order derivatives at t=0 and t=1.
    * <br/>See http://en.wikipedia.org/wiki/Smoothstep for more details.
    * @param min - The lower bound of the interpolation range.
    * @param max - The upper bound of the interpolation range.
    * @param x - The value to interpolate.
    * @returns The smoothly interpolated value clamped between zero and one.
    */
  @JSGlobal("pc.math.smootherstep")
  @js.native
  def smootherstep(min: Double, max: Double, x: Double): Double = js.native
  
  /**
    * The function interpolates smoothly between two input values based on
    * a third one that should be between the first two. The returned value is clamped
    * between 0 and 1.
    * <br/>The slope (i.e. derivative) of the smoothstep function starts at 0 and ends at 0.
    * This makes it easy to create a sequence of transitions using smoothstep to interpolate
    * each segment rather than using a more sophisticated or expensive interpolation technique.
    * <br/>See http://en.wikipedia.org/wiki/Smoothstep for more details.
    * @param min - The lower bound of the interpolation range.
    * @param max - The upper bound of the interpolation range.
    * @param x - The value to interpolate.
    * @returns The smoothly interpolated value clamped between zero and one.
    */
  @JSGlobal("pc.math.smoothstep")
  @js.native
  def smoothstep(min: Double, max: Double, x: Double): Double = js.native
}
