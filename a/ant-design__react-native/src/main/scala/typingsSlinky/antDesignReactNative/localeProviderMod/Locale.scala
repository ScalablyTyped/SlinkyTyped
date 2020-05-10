package typingsSlinky.antDesignReactNative.localeProviderMod

import typingsSlinky.antDesignReactNative.AnonBackspaceLabel
import typingsSlinky.antDesignReactNative.AnonButtonText
import typingsSlinky.antDesignReactNative.AnonCancelText
import typingsSlinky.antDesignReactNative.AnonDay
import typingsSlinky.antDesignReactNative.AnonDismissText
import typingsSlinky.antDesignReactNative.AnonDone
import typingsSlinky.antDesignReactNative.AnonExtra
import typingsSlinky.antDesignReactNative.AnonNextText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Locale extends js.Object {
  var DatePicker: AnonDismissText = js.native
  var DatePickerView: AnonDay = js.native
  var InputItem: AnonBackspaceLabel = js.native
  var ListView: AnonDone = js.native
  var Modal: AnonButtonText = js.native
  var Pagination: AnonNextText = js.native
  var Picker: AnonExtra = js.native
  var SearchBar: AnonCancelText = js.native
  /** zh_CN */
  var locale: String = js.native
}

object Locale {
  @scala.inline
  def apply(
    DatePicker: AnonDismissText,
    DatePickerView: AnonDay,
    InputItem: AnonBackspaceLabel,
    ListView: AnonDone,
    Modal: AnonButtonText,
    Pagination: AnonNextText,
    Picker: AnonExtra,
    SearchBar: AnonCancelText,
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
    def withDatePicker(value: AnonDismissText): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DatePicker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDatePickerView(value: AnonDay): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DatePickerView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputItem(value: AnonBackspaceLabel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListView(value: AnonDone): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ListView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModal(value: AnonButtonText): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Modal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPagination(value: AnonNextText): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Pagination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPicker(value: AnonExtra): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Picker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearchBar(value: AnonCancelText): Self = {
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

