package typingsSlinky.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebPageFont extends js.Object {
  val Application: js.Any = js.native
  val Creator: Double = js.native
  var FixedWidthFont: String = js.native
  var FixedWidthFontSize: Double = js.native
  @JSName("Office.WebPageFont_typekey")
  var OfficeDotWebPageFont_typekey: WebPageFont = js.native
  var ProportionalFont: String = js.native
  var ProportionalFontSize: Double = js.native
}

object WebPageFont {
  @scala.inline
  def apply(
    Application: js.Any,
    Creator: Double,
    FixedWidthFont: String,
    FixedWidthFontSize: Double,
    OfficeDotWebPageFont_typekey: WebPageFont,
    ProportionalFont: String,
    ProportionalFontSize: Double
  ): WebPageFont = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], FixedWidthFont = FixedWidthFont.asInstanceOf[js.Any], FixedWidthFontSize = FixedWidthFontSize.asInstanceOf[js.Any], ProportionalFont = ProportionalFont.asInstanceOf[js.Any], ProportionalFontSize = ProportionalFontSize.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.WebPageFont_typekey")(OfficeDotWebPageFont_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebPageFont]
  }
  @scala.inline
  implicit class WebPageFontOps[Self <: WebPageFont] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplication(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFixedWidthFont(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FixedWidthFont")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFixedWidthFontSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FixedWidthFontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOfficeDotWebPageFont_typekey(value: WebPageFont): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Office.WebPageFont_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProportionalFont(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProportionalFont")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProportionalFontSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProportionalFontSize")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

