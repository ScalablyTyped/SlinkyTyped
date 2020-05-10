package typingsSlinky.jsoneditor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Color extends js.Object {
  var hex: String = js.native
  var hslString: String = js.native
  var hsla: js.Array[Double] = js.native
  var hslaString: String = js.native
  var rgbString: String = js.native
  var rgba: js.Array[Double] = js.native
  var rgbaString: String = js.native
}

object Color {
  @scala.inline
  def apply(
    hex: String,
    hslString: String,
    hsla: js.Array[Double],
    hslaString: String,
    rgbString: String,
    rgba: js.Array[Double],
    rgbaString: String
  ): Color = {
    val __obj = js.Dynamic.literal(hex = hex.asInstanceOf[js.Any], hslString = hslString.asInstanceOf[js.Any], hsla = hsla.asInstanceOf[js.Any], hslaString = hslaString.asInstanceOf[js.Any], rgbString = rgbString.asInstanceOf[js.Any], rgba = rgba.asInstanceOf[js.Any], rgbaString = rgbaString.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
  @scala.inline
  implicit class ColorOps[Self <: Color] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHslString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hslString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHsla(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hsla")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHslaString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hslaString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRgbString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rgbString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRgba(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rgba")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRgbaString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rgbaString")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

