package typingsSlinky.photonui.photonui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// -----------------------------------
@js.native
trait Color extends Base {
  var alpha: Double = js.native
  var blue: Double = js.native
  var brightness: Double = js.native
  var green: Double = js.native
  var hexString: String = js.native
  var hue: Double = js.native
   // readonly
  var red: Double = js.native
  var rgbString: String = js.native
   // readonly
  var rgbaString: String = js.native
  var saturation: Double = js.native
  def getRGB(): js.Array[Double] = js.native
  def getRGBA(): js.Array[Double] = js.native
  def setHSB(hue: Double, saturation: Double, brightness: Double): Unit = js.native
  def setRGB(red: Double, green: Double, blue: Double): Unit = js.native
  def setRGBA(red: Double, green: Double, blue: Double, alpha: Double): Unit = js.native
}

object Color {
  @scala.inline
  def apply(
    alpha: Double,
    blue: Double,
    brightness: Double,
    destroy: () => Unit,
    getRGB: () => js.Array[Double],
    getRGBA: () => js.Array[Double],
    green: Double,
    hexString: String,
    hue: Double,
    red: Double,
    registerCallback: (String, String, js.Function, js.Any) => Unit,
    removeCallback: String => Unit,
    rgbString: String,
    rgbaString: String,
    saturation: Double,
    setHSB: (Double, Double, Double) => Unit,
    setRGB: (Double, Double, Double) => Unit,
    setRGBA: (Double, Double, Double, Double) => Unit
  ): Color = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], blue = blue.asInstanceOf[js.Any], brightness = brightness.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), getRGB = js.Any.fromFunction0(getRGB), getRGBA = js.Any.fromFunction0(getRGBA), green = green.asInstanceOf[js.Any], hexString = hexString.asInstanceOf[js.Any], hue = hue.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any], registerCallback = js.Any.fromFunction4(registerCallback), removeCallback = js.Any.fromFunction1(removeCallback), rgbString = rgbString.asInstanceOf[js.Any], rgbaString = rgbaString.asInstanceOf[js.Any], saturation = saturation.asInstanceOf[js.Any], setHSB = js.Any.fromFunction3(setHSB), setRGB = js.Any.fromFunction3(setRGB), setRGBA = js.Any.fromFunction4(setRGBA))
    __obj.asInstanceOf[Color]
  }
  @scala.inline
  implicit class ColorOps[Self <: Color] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlpha(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBrightness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brightness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetRGB(value: () => js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRGB")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetRGBA(value: () => js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRGBA")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGreen(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("green")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHexString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hexString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("red")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRgbString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rgbString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRgbaString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rgbaString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSaturation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saturation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetHSB(value: (Double, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHSB")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSetRGB(value: (Double, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRGB")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSetRGBA(value: (Double, Double, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRGBA")(js.Any.fromFunction4(value))
        ret
    }
  }
  
}

