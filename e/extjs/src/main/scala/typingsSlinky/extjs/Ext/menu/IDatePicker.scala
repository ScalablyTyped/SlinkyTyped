package typingsSlinky.extjs.Ext.menu

import typingsSlinky.extjs.Ext.picker.IDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDatePicker extends IMenu {
  /** [Config Option] (Boolean) */
  var hideOnClick: js.UndefOr[Boolean] = js.native
  /** [Property] (Ext.picker.Date) */
  var picker: js.UndefOr[IDate] = js.native
  /** [Config Option] (String) */
  var pickerId: js.UndefOr[String] = js.native
}

object IDatePicker {
  @scala.inline
  def apply(): IDatePicker = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDatePicker]
  }
  @scala.inline
  implicit class IDatePickerOps[Self <: IDatePicker] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHideOnClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideOnClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideOnClick")(js.undefined)
        ret
    }
    @scala.inline
    def withPicker(value: IDate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("picker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPicker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("picker")(js.undefined)
        ret
    }
    @scala.inline
    def withPickerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pickerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPickerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pickerId")(js.undefined)
        ret
    }
  }
  
}

