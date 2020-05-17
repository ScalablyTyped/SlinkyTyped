package typingsSlinky.activexMsforms.MSForms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLSelect extends js.Object {
  var DisplayValues: js.Any = js.native
  var HTMLName: String = js.native
  @JSName("MSForms.HTMLSelect_typekey")
  var MSFormsDotHTMLSelect_typekey: HTMLSelect = js.native
  var MultiSelect: Boolean = js.native
  var Selected: String = js.native
  var Size: Double = js.native
  var Values: js.Any = js.native
}

object HTMLSelect {
  @scala.inline
  def apply(
    DisplayValues: js.Any,
    HTMLName: String,
    MSFormsDotHTMLSelect_typekey: HTMLSelect,
    MultiSelect: Boolean,
    Selected: String,
    Size: Double,
    Values: js.Any
  ): HTMLSelect = {
    val __obj = js.Dynamic.literal(DisplayValues = DisplayValues.asInstanceOf[js.Any], HTMLName = HTMLName.asInstanceOf[js.Any], MultiSelect = MultiSelect.asInstanceOf[js.Any], Selected = Selected.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.updateDynamic("MSForms.HTMLSelect_typekey")(MSFormsDotHTMLSelect_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLSelect]
  }
  @scala.inline
  implicit class HTMLSelectOps[Self <: HTMLSelect] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplayValues(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisplayValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHTMLName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HTMLName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMSFormsDotHTMLSelect_typekey(value: HTMLSelect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSForms.HTMLSelect_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMultiSelect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MultiSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelected(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Selected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValues(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Values")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

