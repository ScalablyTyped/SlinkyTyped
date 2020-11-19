package typingsSlinky.babylonjs.mathSizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Maths/math.size", "Size")
@js.native
class Size protected () extends ISize {
  /**
    * Creates a Size object from the given width and height (floats).
    * @param width width of the new size
    * @param height height of the new size
    */
  def this(width: Double, height: Double) = this()
  
  /**
    * Sums the width and height of two sizes
    * @param otherSize size to add to this size
    * @returns a new Size set as the addition result of the current Size and the given one.
    */
  def add(otherSize: Size): Size = js.native
  
  /**
    * Updates the current size from the given one.
    * @param src the given size
    */
  def copyFrom(src: Size): Unit = js.native
  
  /**
    * Updates in place the current Size from the given floats.
    * @param width width of the new size
    * @param height height of the new size
    * @returns the updated Size.
    */
  def copyFromFloats(width: Double, height: Double): Size = js.native
  
  /**
    * True if the current Size and the given one width and height are strictly equal.
    * @param other the other size to compare against
    * @returns True if the current Size and the given one width and height are strictly equal.
    */
  def equals(other: Size): Boolean = js.native
  
  /**
    * "Size"
    * @returns the string "Size"
    */
  def getClassName(): String = js.native
  
  /**
    * Returns the Size hash code.
    * @returns a hash code for a unique width and height
    */
  def getHashCode(): Double = js.native
  
  /**
    * Multiplies the width and height by numbers
    * @param w factor to multiple the width by
    * @param h factor to multiple the height by
    * @returns a new Size set with the multiplication result of the current Size and the given floats.
    */
  def multiplyByFloats(w: Double, h: Double): Size = js.native
  
  /**
    * Updates in place the current Size from the given floats.
    * @param width width to set
    * @param height height to set
    * @returns the updated Size.
    */
  def set(width: Double, height: Double): Size = js.native
  
  /**
    * Subtracts the width and height of two
    * @param otherSize size to subtract to this size
    * @returns a new Size set as the subtraction result of  the given one from the current Size.
    */
  def subtract(otherSize: Size): Size = js.native
  
  /**
    * The surface of the Size : width * height (float).
    */
  def surface: Double = js.native
}
/* static members */
@JSImport("babylonjs/Maths/math.size", "Size")
@js.native
object Size extends js.Object {
  
  /**
    * Creates a new Size set at the linear interpolation "amount" between "start" and "end"
    * @param start starting size to lerp between
    * @param end end size to lerp between
    * @param amount amount to lerp between the start and end values
    * @returns a new Size set at the linear interpolation "amount" between "start" and "end"
    */
  def Lerp(start: Size, end: Size, amount: Double): Size = js.native
  
  /**
    * Create a new size of zero
    * @returns a new Size set to (0.0, 0.0)
    */
  def Zero(): Size = js.native
}
