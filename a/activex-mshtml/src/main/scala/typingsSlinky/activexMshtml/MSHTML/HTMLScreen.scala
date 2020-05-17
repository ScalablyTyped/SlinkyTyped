package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLScreen extends js.Object {
  @JSName("MSHTML.HTMLScreen_typekey")
  var MSHTMLDotHTMLScreen_typekey: HTMLScreen = js.native
  val availHeight: Double = js.native
  val availWidth: Double = js.native
  var bufferDepth: Double = js.native
  val colorDepth: Double = js.native
  val constructor: js.Any = js.native
  val deviceXDPI: Double = js.native
  val deviceYDPI: Double = js.native
  val fontSmoothingEnabled: Boolean = js.native
  val height: Double = js.native
  val logicalXDPI: Double = js.native
  val logicalYDPI: Double = js.native
  val pixelDepth: Double = js.native
  val systemXDPI: Double = js.native
  val systemYDPI: Double = js.native
  var updateInterval: Double = js.native
  val width: Double = js.native
}

object HTMLScreen {
  @scala.inline
  def apply(
    MSHTMLDotHTMLScreen_typekey: HTMLScreen,
    availHeight: Double,
    availWidth: Double,
    bufferDepth: Double,
    colorDepth: Double,
    constructor: js.Any,
    deviceXDPI: Double,
    deviceYDPI: Double,
    fontSmoothingEnabled: Boolean,
    height: Double,
    logicalXDPI: Double,
    logicalYDPI: Double,
    pixelDepth: Double,
    systemXDPI: Double,
    systemYDPI: Double,
    updateInterval: Double,
    width: Double
  ): HTMLScreen = {
    val __obj = js.Dynamic.literal(availHeight = availHeight.asInstanceOf[js.Any], availWidth = availWidth.asInstanceOf[js.Any], bufferDepth = bufferDepth.asInstanceOf[js.Any], colorDepth = colorDepth.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], deviceXDPI = deviceXDPI.asInstanceOf[js.Any], deviceYDPI = deviceYDPI.asInstanceOf[js.Any], fontSmoothingEnabled = fontSmoothingEnabled.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], logicalXDPI = logicalXDPI.asInstanceOf[js.Any], logicalYDPI = logicalYDPI.asInstanceOf[js.Any], pixelDepth = pixelDepth.asInstanceOf[js.Any], systemXDPI = systemXDPI.asInstanceOf[js.Any], systemYDPI = systemYDPI.asInstanceOf[js.Any], updateInterval = updateInterval.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.HTMLScreen_typekey")(MSHTMLDotHTMLScreen_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLScreen]
  }
  @scala.inline
  implicit class HTMLScreenOps[Self <: HTMLScreen] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSHTMLDotHTMLScreen_typekey(value: HTMLScreen): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.HTMLScreen_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAvailHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAvailWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBufferDepth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufferDepth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColorDepth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorDepth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConstructor(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constructor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeviceXDPI(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceXDPI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeviceYDPI(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceYDPI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontSmoothingEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSmoothingEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogicalXDPI(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logicalXDPI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogicalYDPI(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logicalYDPI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPixelDepth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelDepth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSystemXDPI(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemXDPI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSystemYDPI(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemYDPI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateInterval")(value.asInstanceOf[js.Any])
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

