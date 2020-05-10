package typingsSlinky.chromaJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorSpaces extends js.Object {
  var cmyk: js.Tuple4[Double, Double, Double, Double] = js.native
  var gl: js.Tuple4[Double, Double, Double, Double] = js.native
  var hcl: js.Tuple3[Double, Double, Double] = js.native
  var hsi: js.Tuple3[Double, Double, Double] = js.native
  var hsl: js.Tuple3[Double, Double, Double] = js.native
  var hsv: js.Tuple3[Double, Double, Double] = js.native
  var lab: js.Tuple3[Double, Double, Double] = js.native
  var lch: js.Tuple3[Double, Double, Double] = js.native
  var rgb: js.Tuple3[Double, Double, Double] = js.native
  var rgba: js.Tuple4[Double, Double, Double, Double] = js.native
}

object ColorSpaces {
  @scala.inline
  def apply(
    cmyk: js.Tuple4[Double, Double, Double, Double],
    gl: js.Tuple4[Double, Double, Double, Double],
    hcl: js.Tuple3[Double, Double, Double],
    hsi: js.Tuple3[Double, Double, Double],
    hsl: js.Tuple3[Double, Double, Double],
    hsv: js.Tuple3[Double, Double, Double],
    lab: js.Tuple3[Double, Double, Double],
    lch: js.Tuple3[Double, Double, Double],
    rgb: js.Tuple3[Double, Double, Double],
    rgba: js.Tuple4[Double, Double, Double, Double]
  ): ColorSpaces = {
    val __obj = js.Dynamic.literal(cmyk = cmyk.asInstanceOf[js.Any], gl = gl.asInstanceOf[js.Any], hcl = hcl.asInstanceOf[js.Any], hsi = hsi.asInstanceOf[js.Any], hsl = hsl.asInstanceOf[js.Any], hsv = hsv.asInstanceOf[js.Any], lab = lab.asInstanceOf[js.Any], lch = lch.asInstanceOf[js.Any], rgb = rgb.asInstanceOf[js.Any], rgba = rgba.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorSpaces]
  }
  @scala.inline
  implicit class ColorSpacesOps[Self <: ColorSpaces] (val x: Self) extends AnyVal {
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
    def withGl(value: js.Tuple4[Double, Double, Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHcl(value: js.Tuple3[Double, Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hcl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHsi(value: js.Tuple3[Double, Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hsi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHsl(value: js.Tuple3[Double, Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hsl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHsv(value: js.Tuple3[Double, Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hsv")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLab(value: js.Tuple3[Double, Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lab")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLch(value: js.Tuple3[Double, Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lch")(value.asInstanceOf[js.Any])
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

