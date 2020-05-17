package typingsSlinky.antDesignReactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatePicker extends js.Object {
  var DatePicker: js.UndefOr[DismissText] = js.native
  var DatePickerView: js.UndefOr[Day] = js.native
  var InputItem: js.UndefOr[BackspaceLabel] = js.native
  var ListView: js.UndefOr[Done] = js.native
  var Modal: js.UndefOr[ButtonText] = js.native
  var Pagination: js.UndefOr[NextText] = js.native
  var Picker: js.UndefOr[Extra] = js.native
  var SearchBar: js.UndefOr[CancelText] = js.native
  var exist: Boolean = js.native
  var locale: js.UndefOr[String] = js.native
}

object DatePicker {
  @scala.inline
  def apply(exist: Boolean): DatePicker = {
    val __obj = js.Dynamic.literal(exist = exist.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatePicker]
  }
  @scala.inline
  implicit class DatePickerOps[Self <: DatePicker] (val x: Self) extends AnyVal {
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
    def withDatePicker(value: DismissText): Self = {
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
    def withDatePickerView(value: Day): Self = {
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
    def withInputItem(value: BackspaceLabel): Self = {
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
    def withListView(value: Done): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ListView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ListView")(js.undefined)
        ret
    }
    @scala.inline
    def withModal(value: ButtonText): Self = {
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
    def withPagination(value: NextText): Self = {
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
    def withPicker(value: Extra): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Picker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPicker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Picker")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchBar(value: CancelText): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SearchBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchBar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SearchBar")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
  }
  
}

