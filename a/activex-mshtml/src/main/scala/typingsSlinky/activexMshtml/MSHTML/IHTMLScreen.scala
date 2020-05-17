package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHTMLScreen extends js.Object {
  @JSName("MSHTML.IHTMLScreen_typekey")
  var MSHTMLDotIHTMLScreen_typekey: IHTMLScreen = js.native
  val availHeight: Double = js.native
  val availWidth: Double = js.native
  var bufferDepth: Double = js.native
  val colorDepth: Double = js.native
  val fontSmoothingEnabled: Boolean = js.native
  val height: Double = js.native
  var updateInterval: Double = js.native
  val width: Double = js.native
}

object IHTMLScreen {
  @scala.inline
  def apply(
    MSHTMLDotIHTMLScreen_typekey: IHTMLScreen,
    availHeight: Double,
    availWidth: Double,
    bufferDepth: Double,
    colorDepth: Double,
    fontSmoothingEnabled: Boolean,
    height: Double,
    updateInterval: Double,
    width: Double
  ): IHTMLScreen = {
    val __obj = js.Dynamic.literal(availHeight = availHeight.asInstanceOf[js.Any], availWidth = availWidth.asInstanceOf[js.Any], bufferDepth = bufferDepth.asInstanceOf[js.Any], colorDepth = colorDepth.asInstanceOf[js.Any], fontSmoothingEnabled = fontSmoothingEnabled.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], updateInterval = updateInterval.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.IHTMLScreen_typekey")(MSHTMLDotIHTMLScreen_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHTMLScreen]
  }
  @scala.inline
  implicit class IHTMLScreenOps[Self <: IHTMLScreen] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSHTMLDotIHTMLScreen_typekey(value: IHTMLScreen): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.IHTMLScreen_typekey")(value.asInstanceOf[js.Any])
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

