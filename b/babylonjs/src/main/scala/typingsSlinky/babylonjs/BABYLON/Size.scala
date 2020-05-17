package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Size extends ISize {
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

object Size {
  @scala.inline
  def apply(
    add: Size => Size,
    copyFrom: Size => Unit,
    copyFromFloats: (Double, Double) => Size,
    equals: Size => Boolean,
    getClassName: () => String,
    getHashCode: () => Double,
    height: Double,
    multiplyByFloats: (Double, Double) => Size,
    set: (Double, Double) => Size,
    subtract: Size => Size,
    surface: () => Double,
    width: Double
  ): Size = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), copyFrom = js.Any.fromFunction1(copyFrom), copyFromFloats = js.Any.fromFunction2(copyFromFloats), equals = js.Any.fromFunction1(equals), getClassName = js.Any.fromFunction0(getClassName), getHashCode = js.Any.fromFunction0(getHashCode), height = height.asInstanceOf[js.Any], multiplyByFloats = js.Any.fromFunction2(multiplyByFloats), set = js.Any.fromFunction2(set), subtract = js.Any.fromFunction1(subtract), surface = js.Any.fromFunction0(surface), width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Size]
  }
  @scala.inline
  implicit class SizeOps[Self <: Size] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: Size => Size): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCopyFrom(value: Size => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyFrom")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCopyFromFloats(value: (Double, Double) => Size): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyFromFloats")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withEquals(value: Size => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equals")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetClassName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getClassName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetHashCode(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHashCode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMultiplyByFloats(value: (Double, Double) => Size): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiplyByFloats")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSet(value: (Double, Double) => Size): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSubtract(value: Size => Size): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtract")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSurface(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("surface")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

