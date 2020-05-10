package typingsSlinky.jsfl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This object contains all the properties of the Fill color setting of the Tools panel or of a selected shape. To retrieve a Fill object, use document.getCustomFill().
  */
@js.native
trait FlashFill extends js.Object {
  var bitmapIsClipped: Boolean = js.native
  var bitmapPath: String = js.native
  /** Property; the color of the fill, in one of the following formats:
  	 * - A string in the format "#RRGGBB" or "#RRGGBBAA"
  	 * - A hexadecimal number in the format 0xRRGGBB
  	 * - An integer that represents the decimal equivalent of a hexadecimal number
  	 */
  var color: js.Any = js.native
  /** Property; an array of colors in the gradient, expressed as integers. This property is available only if the value of the fill.style property is either "radialGradient" or "linearGradient". See fill.style */
  var colorArray: js.Array[_] = js.native
  var focalPoint: Double = js.native
  var linearRGB: Boolean = js.native
  var matrix: FlashMatrix = js.native
  var overflow: String = js.native
  var posArray: js.Array[Double] = js.native
  var style: String = js.native
}

object FlashFill {
  @scala.inline
  def apply(
    bitmapIsClipped: Boolean,
    bitmapPath: String,
    color: js.Any,
    colorArray: js.Array[_],
    focalPoint: Double,
    linearRGB: Boolean,
    matrix: FlashMatrix,
    overflow: String,
    posArray: js.Array[Double],
    style: String
  ): FlashFill = {
    val __obj = js.Dynamic.literal(bitmapIsClipped = bitmapIsClipped.asInstanceOf[js.Any], bitmapPath = bitmapPath.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], colorArray = colorArray.asInstanceOf[js.Any], focalPoint = focalPoint.asInstanceOf[js.Any], linearRGB = linearRGB.asInstanceOf[js.Any], matrix = matrix.asInstanceOf[js.Any], overflow = overflow.asInstanceOf[js.Any], posArray = posArray.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlashFill]
  }
  @scala.inline
  implicit class FlashFillOps[Self <: FlashFill] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBitmapIsClipped(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitmapIsClipped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBitmapPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitmapPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColor(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColorArray(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorArray")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFocalPoint(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focalPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinearRGB(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linearRGB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatrix(value: FlashMatrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matrix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverflow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosArray(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("posArray")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

