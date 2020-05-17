package typingsSlinky.oracleOraclejet.anon

import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.auto
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.billion
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.million
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.none
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.number
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.off
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.on
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.percent
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.quadrillion
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.thousand
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.trillion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextType extends js.Object {
  var converter: js.UndefOr[typingsSlinky.oracleOraclejet.ojvalidationBaseMod.Converter[String]] = js.native
  var rendered: js.UndefOr[on | off] = js.native
  var scaling: js.UndefOr[none | thousand | million | billion | trillion | quadrillion | auto] = js.native
  var style: js.UndefOr[js.Object] = js.native
  var text: js.UndefOr[String] = js.native
  var textType: js.UndefOr[percent | number] = js.native
}

object TextType {
  @scala.inline
  def apply(): TextType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextType]
  }
  @scala.inline
  implicit class TextTypeOps[Self <: TextType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConverter(value: typingsSlinky.oracleOraclejet.ojvalidationBaseMod.Converter[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("converter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConverter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("converter")(js.undefined)
        ret
    }
    @scala.inline
    def withRendered(value: on | off): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rendered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRendered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rendered")(js.undefined)
        ret
    }
    @scala.inline
    def withScaling(value: none | thousand | million | billion | trillion | quadrillion | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaling")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withTextType(value: percent | number): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textType")(js.undefined)
        ret
    }
  }
  
}

