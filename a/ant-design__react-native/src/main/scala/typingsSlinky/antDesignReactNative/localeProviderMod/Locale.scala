package typingsSlinky.antDesignReactNative.localeProviderMod

import typingsSlinky.antDesignReactNative.anon.BackspaceLabel
import typingsSlinky.antDesignReactNative.anon.ButtonText
import typingsSlinky.antDesignReactNative.anon.CancelText
import typingsSlinky.antDesignReactNative.anon.Day
import typingsSlinky.antDesignReactNative.anon.DismissText
import typingsSlinky.antDesignReactNative.anon.Done
import typingsSlinky.antDesignReactNative.anon.Extra
import typingsSlinky.antDesignReactNative.anon.NextText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Locale extends js.Object {
  var DatePicker: DismissText = js.native
  var DatePickerView: Day = js.native
  var InputItem: BackspaceLabel = js.native
  var ListView: Done = js.native
  var Modal: ButtonText = js.native
  var Pagination: NextText = js.native
  var Picker: Extra = js.native
  var SearchBar: CancelText = js.native
  /** zh_CN */
  var locale: String = js.native
}

object Locale {
  @scala.inline
  def apply(
    DatePicker: DismissText,
    DatePickerView: Day,
    InputItem: BackspaceLabel,
    ListView: Done,
    Modal: ButtonText,
    Pagination: NextText,
    Picker: Extra,
    SearchBar: CancelText,
    locale: String
  ): Locale = {
    val __obj = js.Dynamic.literal(DatePicker = DatePicker.asInstanceOf[js.Any], DatePickerView = DatePickerView.asInstanceOf[js.Any], InputItem = InputItem.asInstanceOf[js.Any], ListView = ListView.asInstanceOf[js.Any], Modal = Modal.asInstanceOf[js.Any], Pagination = Pagination.asInstanceOf[js.Any], Picker = Picker.asInstanceOf[js.Any], SearchBar = SearchBar.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any])
    __obj.asInstanceOf[Locale]
  }
  @scala.inline
  implicit class LocaleOps[Self <: Locale] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDatePicker(value: DismissText): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DatePicker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDatePickerView(value: Day): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DatePickerView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputItem(value: BackspaceLabel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListView(value: Done): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ListView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModal(value: ButtonText): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Modal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPagination(value: NextText): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Pagination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPicker(value: Extra): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Picker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearchBar(value: CancelText): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SearchBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

