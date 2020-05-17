package typingsSlinky.antdMobile.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatePicker extends js.Object {
  var DatePicker: js.UndefOr[js.Object] = js.native
  var DatePickerView: js.UndefOr[js.Object] = js.native
  var InputItem: js.UndefOr[js.Object] = js.native
  var Pagination: js.UndefOr[js.Object] = js.native
}

object DatePicker {
  @scala.inline
  def apply(): DatePicker = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatePicker]
  }
  @scala.inline
  implicit class DatePickerOps[Self <: DatePicker] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

