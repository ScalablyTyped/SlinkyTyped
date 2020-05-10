package typingsSlinky.antdMobileRn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDatePickerView extends js.Object {
  var DatePicker: js.UndefOr[js.Object] = js.native
  var DatePickerView: js.UndefOr[js.Object] = js.native
  var InputItem: js.UndefOr[js.Object] = js.native
  var Modal: js.UndefOr[js.Object] = js.native
  var Pagination: js.UndefOr[js.Object] = js.native
  var exist: Boolean = js.native
}

object AnonDatePickerView {
  @scala.inline
  def apply(exist: Boolean): AnonDatePickerView = {
    val __obj = js.Dynamic.literal(exist = exist.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDatePickerView]
  }
  @scala.inline
  implicit class AnonDatePickerViewOps[Self <: AnonDatePickerView] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExist(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDatePicker(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DatePicker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatePicker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DatePicker")(js.undefined)
        ret
    }
    @scala.inline
    def withDatePickerView(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DatePickerView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatePickerView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DatePickerView")(js.undefined)
        ret
    }
    @scala.inline
    def withInputItem(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputItem")(js.undefined)
        ret
    }
    @scala.inline
    def withModal(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Modal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Modal")(js.undefined)
        ret
    }
    @scala.inline
    def withPagination(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Pagination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPagination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Pagination")(js.undefined)
        ret
    }
  }
  
}

