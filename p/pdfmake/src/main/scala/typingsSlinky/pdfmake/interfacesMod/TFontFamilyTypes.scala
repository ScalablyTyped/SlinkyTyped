package typingsSlinky.pdfmake.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TFontFamilyTypes extends js.Object {
  var bold: js.UndefOr[String] = js.native
  var bolditalics: js.UndefOr[String] = js.native
  var italics: js.UndefOr[String] = js.native
  var normal: js.UndefOr[String] = js.native
}

object TFontFamilyTypes {
  @scala.inline
  def apply(): TFontFamilyTypes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TFontFamilyTypes]
  }
  @scala.inline
  implicit class TFontFamilyTypesOps[Self <: TFontFamilyTypes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBold(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bold")(js.undefined)
        ret
    }
    @scala.inline
    def withBolditalics(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bolditalics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBolditalics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bolditalics")(js.undefined)
        ret
    }
    @scala.inline
    def withItalics(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("italics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItalics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("italics")(js.undefined)
        ret
    }
    @scala.inline
    def withNormal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNormal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normal")(js.undefined)
        ret
    }
  }
  
}

