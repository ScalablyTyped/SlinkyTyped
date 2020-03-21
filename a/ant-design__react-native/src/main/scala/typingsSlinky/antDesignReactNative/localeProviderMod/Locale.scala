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

trait Locale extends js.Object {
  var DatePicker: AnonDismissText
  var DatePickerView: AnonDay
  var InputItem: AnonBackspaceLabel
  var ListView: AnonDone
  var Modal: AnonButtonText
  var Pagination: AnonNextText
  var Picker: AnonExtra
  var SearchBar: AnonCancelText
  /** zh_CN */
  var locale: String
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
}

