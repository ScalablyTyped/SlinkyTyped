package typingsSlinky.antd.anon

import typingsSlinky.antd.localeMod.ModalLocale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Calendar extends js.Object {
  var Calendar: js.UndefOr[js.Object] = js.native
  var DatePicker: js.UndefOr[js.Object] = js.native
  var Modal: js.UndefOr[ModalLocale] = js.native
  var Pagination: js.UndefOr[js.Object] = js.native
  var Popconfirm: js.UndefOr[js.Object] = js.native
  var Select: js.UndefOr[js.Object] = js.native
  var Table: js.UndefOr[js.Object] = js.native
  var TimePicker: js.UndefOr[js.Object] = js.native
  var Transfer: js.UndefOr[js.Object] = js.native
  var Upload: js.UndefOr[js.Object] = js.native
  var exist: Boolean = js.native
  var locale: String = js.native
}

object Calendar {
  @scala.inline
  def apply(exist: Boolean, locale: String): Calendar = {
    val __obj = js.Dynamic.literal(exist = exist.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any])
    __obj.asInstanceOf[Calendar]
  }
  @scala.inline
  implicit class CalendarOps[Self <: Calendar] (val x: Self) extends AnyVal {
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
    def withLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCalendar(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Calendar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalendar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Calendar")(js.undefined)
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
    def withModal(value: ModalLocale): Self = {
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
    @scala.inline
    def withPopconfirm(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Popconfirm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopconfirm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Popconfirm")(js.undefined)
        ret
    }
    @scala.inline
    def withSelect(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Select")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Select")(js.undefined)
        ret
    }
    @scala.inline
    def withTable(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Table")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Table")(js.undefined)
        ret
    }
    @scala.inline
    def withTimePicker(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimePicker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimePicker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimePicker")(js.undefined)
        ret
    }
    @scala.inline
    def withTransfer(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Transfer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransfer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Transfer")(js.undefined)
        ret
    }
    @scala.inline
    def withUpload(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Upload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Upload")(js.undefined)
        ret
    }
  }
  
}

