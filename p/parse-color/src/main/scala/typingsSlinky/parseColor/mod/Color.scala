package typingsSlinky.parseColor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Color extends js.Object {
  var cmyk: js.Tuple4[Double, Double, Double, Double] = js.native
  var cmyka: js.Tuple5[Double, Double, Double, Double, Double] = js.native
  var hex: String = js.native
  var hsl: js.Tuple3[Double, Double, Double] = js.native
  var hsla: js.Tuple4[Double, Double, Double, Double] = js.native
  var hsv: js.Tuple3[Double, Double, Double] = js.native
  var hsva: js.Tuple4[Double, Double, Double, Double] = js.native
  var keyword: String = js.native
  var rgb: js.Tuple3[Double, Double, Double] = js.native
  var rgba: js.Tuple4[Double, Double, Double, Double] = js.native
}

object Color {
  @scala.inline
  def apply(
    cmyk: js.Tuple4[Double, Double, Double, Double],
    cmyka: js.Tuple5[Double, Double, Double, Double, Double],
    hex: String,
    hsl: js.Tuple3[Double, Double, Double],
    hsla: js.Tuple4[Double, Double, Double, Double],
    hsv: js.Tuple3[Double, Double, Double],
    hsva: js.Tuple4[Double, Double, Double, Double],
    keyword: String,
    rgb: js.Tuple3[Double, Double, Double],
    rgba: js.Tuple4[Double, Double, Double, Double]
  ): Color = {
    val __obj = js.Dynamic.literal(cmyk = cmyk.asInstanceOf[js.Any], cmyka = cmyka.asInstanceOf[js.Any], hex = hex.asInstanceOf[js.Any], hsl = hsl.asInstanceOf[js.Any], hsla = hsla.asInstanceOf[js.Any], hsv = hsv.asInstanceOf[js.Any], hsva = hsva.asInstanceOf[js.Any], keyword = keyword.asInstanceOf[js.Any], rgb = rgb.asInstanceOf[js.Any], rgba = rgba.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
  @scala.inline
  implicit class ColorOps[Self <: Color] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCmyk(value: js.Tuple4[Double, Double, Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cmyk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCmyka(value: js.Tuple5[Double, Double, Double, Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cmyka")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHsl(value: js.Tuple3[Double, Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hsl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHsla(value: js.Tuple4[Double, Double, Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hsla")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHsv(value: js.Tuple3[Double, Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hsv")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHsva(value: js.Tuple4[Double, Double, Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hsva")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRgb(value: js.Tuple3[Double, Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rgb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRgba(value: js.Tuple4[Double, Double, Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rgba")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

