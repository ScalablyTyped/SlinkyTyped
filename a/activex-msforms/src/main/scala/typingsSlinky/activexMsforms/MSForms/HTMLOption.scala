package typingsSlinky.activexMsforms.MSForms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLOption extends js.Object {
  var Checked: Boolean = js.native
  val DisplayStyle: fmDisplayStyle = js.native
  var HTMLName: String = js.native
  var HTMLType: String = js.native
  @JSName("MSForms.HTMLOption_typekey")
  var MSFormsDotHTMLOption_typekey: HTMLOption = js.native
  var Value: String = js.native
}

object HTMLOption {
  @scala.inline
  def apply(
    Checked: Boolean,
    DisplayStyle: fmDisplayStyle,
    HTMLName: String,
    HTMLType: String,
    MSFormsDotHTMLOption_typekey: HTMLOption,
    Value: String
  ): HTMLOption = {
    val __obj = js.Dynamic.literal(Checked = Checked.asInstanceOf[js.Any], DisplayStyle = DisplayStyle.asInstanceOf[js.Any], HTMLName = HTMLName.asInstanceOf[js.Any], HTMLType = HTMLType.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("MSForms.HTMLOption_typekey")(MSFormsDotHTMLOption_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLOption]
  }
  @scala.inline
  implicit class HTMLOptionOps[Self <: HTMLOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChecked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Checked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayStyle(value: fmDisplayStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisplayStyle")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withMSFormsDotHTMLOption_typekey(value: HTMLOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSForms.HTMLOption_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

