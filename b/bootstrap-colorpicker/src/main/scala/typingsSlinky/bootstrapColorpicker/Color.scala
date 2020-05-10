package typingsSlinky.bootstrapColorpicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Color extends js.Object {
  var fallbackFormat: String = js.native
  var fallbackValue: String = js.native
  var hexNumberSignPrefix: Boolean = js.native
  var origFormat: String = js.native
  var value: AnonA = js.native
  /**
    * Set the transparency with a value between 0 and 1.
    */
  def setAlpha(value: Double): Unit = js.native
  /**
    * Set the brightness with a value between 0 and 1.
    */
  def setBrightness(value: Double): Unit = js.native
  /**
    * Set a new color. The value is parsed and tries to do a quess on the format.
    */
  def setColor(value: String): Unit = js.native
  /**
    * Set the HUE with a value between 0 and 1.
    */
  def setHue(value: Double): Unit = js.native
  /**
    * Set the saturation with a value between 0 and 1.
    */
  def setSaturation(value: Double): Unit = js.native
  /**
    * Returns a hash with HSLA values.
    */
  def toHSL(): String = js.native
  /**
    * Returns a string with HEX format for the current color.
    */
  def toHex(): String = js.native
  /**
    * Returns a hash with red, green, blue and alpha.
    */
  def toRGB(): String = js.native
  /**
    * Returns current color as string in specified format.
    */
  def toString(format: ColorFormat): String = js.native
}

object Color {
  @scala.inline
  def apply(
    fallbackFormat: String,
    fallbackValue: String,
    hexNumberSignPrefix: Boolean,
    origFormat: String,
    setAlpha: Double => Unit,
    setBrightness: Double => Unit,
    setColor: String => Unit,
    setHue: Double => Unit,
    setSaturation: Double => Unit,
    toHSL: () => String,
    toHex: () => String,
    toRGB: () => String,
    toString: ColorFormat => String,
    value: AnonA
  ): Color = {
    val __obj = js.Dynamic.literal(fallbackFormat = fallbackFormat.asInstanceOf[js.Any], fallbackValue = fallbackValue.asInstanceOf[js.Any], hexNumberSignPrefix = hexNumberSignPrefix.asInstanceOf[js.Any], origFormat = origFormat.asInstanceOf[js.Any], setAlpha = js.Any.fromFunction1(setAlpha), setBrightness = js.Any.fromFunction1(setBrightness), setColor = js.Any.fromFunction1(setColor), setHue = js.Any.fromFunction1(setHue), setSaturation = js.Any.fromFunction1(setSaturation), toHSL = js.Any.fromFunction0(toHSL), toHex = js.Any.fromFunction0(toHex), toRGB = js.Any.fromFunction0(toRGB), toString = js.Any.fromFunction1(toString), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
  @scala.inline
  implicit class ColorOps[Self <: Color] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFallbackFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFallbackValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHexNumberSignPrefix(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hexNumberSignPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrigFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetAlpha(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAlpha")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetBrightness(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBrightness")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetColor(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setColor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetHue(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetSaturation(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSaturation")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withToHSL(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toHSL")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToHex(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toHex")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToRGB(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toRGB")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToString(value: ColorFormat => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toString")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withValue(value: AnonA): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

