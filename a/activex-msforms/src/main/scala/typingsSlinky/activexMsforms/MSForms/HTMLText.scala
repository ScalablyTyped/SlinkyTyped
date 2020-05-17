package typingsSlinky.activexMsforms.MSForms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLText extends js.Object {
  var HTMLName: String = js.native
  var HTMLType: String = js.native
  @JSName("MSForms.HTMLText_typekey")
  var MSFormsDotHTMLText_typekey: HTMLText = js.native
  var MaxLength: Double = js.native
  var Value: String = js.native
  var Width: Double = js.native
}

object HTMLText {
  @scala.inline
  def apply(
    HTMLName: String,
    HTMLType: String,
    MSFormsDotHTMLText_typekey: HTMLText,
    MaxLength: Double,
    Value: String,
    Width: Double
  ): HTMLText = {
    val __obj = js.Dynamic.literal(HTMLName = HTMLName.asInstanceOf[js.Any], HTMLType = HTMLType.asInstanceOf[js.Any], MaxLength = MaxLength.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any])
    __obj.updateDynamic("MSForms.HTMLText_typekey")(MSFormsDotHTMLText_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLText]
  }
  @scala.inline
  implicit class HTMLTextOps[Self <: HTMLText] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHTMLName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HTMLName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHTMLType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HTMLType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMSFormsDotHTMLText_typekey(value: HTMLText): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSForms.HTMLText_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

