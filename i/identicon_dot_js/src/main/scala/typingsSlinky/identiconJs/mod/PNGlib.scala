package typingsSlinky.identiconJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PNGlib extends js.Object {
  var depth: Double = js.native
  var height: Double = js.native
  var width: Double = js.native
  /**
    * Returns the image as a base64 encoded string.
    */
  def getBase64(): String = js.native
  /**
    * Returns the png as a string.
    */
  def getDump(): String = js.native
  /**
    * Returns the index of a given pixel in the image data array.
    * @param x The given x coordinate of the pixel.
    * @param y The given y coordinate of the pixel.
    */
  def index(x: Double, y: Double): Double = js.native
}

object PNGlib {
  @scala.inline
  def apply(
    depth: Double,
    getBase64: () => String,
    getDump: () => String,
    height: Double,
    index: (Double, Double) => Double,
    width: Double
  ): PNGlib = {
    val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], getBase64 = js.Any.fromFunction0(getBase64), getDump = js.Any.fromFunction0(getDump), height = height.asInstanceOf[js.Any], index = js.Any.fromFunction2(index), width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PNGlib]
  }
  @scala.inline
  implicit class PNGlibOps[Self <: PNGlib] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDepth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetBase64(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBase64")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDump(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDump")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: (Double, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

