package typingsSlinky.reactNativeModalFilterPicker.mod

import slinky.core.facade.ReactElement
import typingsSlinky.reactNative.mod.FlatListProps
import typingsSlinky.reactNative.mod.KeyboardAvoidingView
import typingsSlinky.reactNative.mod.ListViewProps
import typingsSlinky.reactNative.mod.ModalProps
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeModalFilterPicker.reactNativeModalFilterPickerStrings.always
import typingsSlinky.reactNativeModalFilterPicker.reactNativeModalFilterPickerStrings.handle
import typingsSlinky.reactNativeModalFilterPicker.reactNativeModalFilterPickerStrings.never
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModalFilterPickerProps[T /* <: ModalFilterPickerOption */] extends js.Object {
  var androidUnderlineColor: js.UndefOr[String] = js.native
  var autoFocus: js.UndefOr[Boolean] = js.native
  var cancelButtonStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var cancelButtonText: js.UndefOr[String] = js.native
  var cancelButtonTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  var cancelContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var filterTextInputContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var filterTextInputStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  var keyboardShouldPersistTaps: js.UndefOr[never | always | handle] = js.native
  var listContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var listViewProps: js.UndefOr[Partial[ListViewProps | FlatListProps[T]]] = js.native
  var modal: js.UndefOr[ModalProps] = js.native
  var noResultsText: js.UndefOr[String] = js.native
  var optionTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  var options: js.Array[T] = js.native
  // styling props
  var overlayStyle: js.UndefOr[StyleProp[KeyboardAvoidingView | ViewStyle]] = js.native
  var placeholderText: js.UndefOr[String] = js.native
  var placeholderTextColor: js.UndefOr[String] = js.native
  var renderCancelButton: js.UndefOr[js.Function0[ReactElement]] = js.native
  var renderList: js.UndefOr[js.Function0[ReactElement]] = js.native
  var renderOption: js.UndefOr[js.Function2[/* option */ T, /* isSelected */ Boolean, ReactElement]] = js.native
  var selectedOption: js.UndefOr[String] = js.native
  var selectedOptionTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  var showFilter: js.UndefOr[Boolean] = js.native
  var title: js.UndefOr[String] = js.native
  var titleTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  var visible: js.UndefOr[Boolean] = js.native
  def onCancel(): Unit = js.native
  def onSelect(key: String): Unit = js.native
}

object ModalFilterPickerProps {
  @scala.inline
  def apply[T](onCancel: () => Unit, onSelect: String => Unit, options: js.Array[T]): ModalFilterPickerProps[T] = {
    val __obj = js.Dynamic.literal(onCancel = js.Any.fromFunction0(onCancel), onSelect = js.Any.fromFunction1(onSelect), options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalFilterPickerProps[T]]
  }
  @scala.inline
  implicit class ModalFilterPickerPropsOps[Self[t] <: ModalFilterPickerProps[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withOnCancel(value: () => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCancel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnSelect(value: String => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOptions(value: js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAndroidUnderlineColor(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidUnderlineColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAndroidUnderlineColor: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidUnderlineColor")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoFocus(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoFocus: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withCancelButtonStyle(value: StyleProp[ViewStyle]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelButtonStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancelButtonStyle: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelButtonStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withCancelButtonStyleNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelButtonStyle")(null)
        ret
    }
    @scala.inline
    def withCancelButtonText(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelButtonText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancelButtonText: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelButtonText")(js.undefined)
        ret
    }
    @scala.inline
    def withCancelButtonTextStyle(value: StyleProp[TextStyle]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelButtonTextStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancelButtonTextStyle: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelButtonTextStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withCancelButtonTextStyleNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelButtonTextStyle")(null)
        ret
    }
    @scala.inline
    def withCancelContainerStyle(value: StyleProp[ViewStyle]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelContainerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancelContainerStyle: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelContainerStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withCancelContainerStyleNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelContainerStyle")(null)
        ret
    }
    @scala.inline
    def withFilterTextInputContainerStyle(value: StyleProp[ViewStyle]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterTextInputContainerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterTextInputContainerStyle: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterTextInputContainerStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterTextInputContainerStyleNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterTextInputContainerStyle")(null)
        ret
    }
    @scala.inline
    def withFilterTextInputStyle(value: StyleProp[TextStyle]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterTextInputStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterTextInputStyle: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterTextInputStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterTextInputStyleNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterTextInputStyle")(null)
        ret
    }
    @scala.inline
    def withKeyboardShouldPersistTaps(value: never | always | handle): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardShouldPersistTaps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyboardShouldPersistTaps: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardShouldPersistTaps")(js.undefined)
        ret
    }
    @scala.inline
    def withListContainerStyle(value: StyleProp[ViewStyle]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listContainerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListContainerStyle: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listContainerStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withListContainerStyleNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listContainerStyle")(null)
        ret
    }
    @scala.inline
    def withListViewProps(value: Partial[ListViewProps | FlatListProps[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listViewProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListViewProps: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listViewProps")(js.undefined)
        ret
    }
    @scala.inline
    def withModal(value: ModalProps): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModal: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modal")(js.undefined)
        ret
    }
    @scala.inline
    def withNoResultsText(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noResultsText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoResultsText: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noResultsText")(js.undefined)
        ret
    }
    @scala.inline
    def withOptionTextStyle(value: StyleProp[TextStyle]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionTextStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptionTextStyle: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionTextStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withOptionTextStyleNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionTextStyle")(null)
        ret
    }
    @scala.inline
    def withOverlayStyle(value: StyleProp[KeyboardAvoidingView | ViewStyle]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverlayStyle: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withOverlayStyleNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayStyle")(null)
        ret
    }
    @scala.inline
    def withPlaceholderText(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholderText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholderText: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholderText")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholderTextColor(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholderTextColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholderTextColor: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholderTextColor")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderCancelButton(value: () => ReactElement): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderCancelButton")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutRenderCancelButton: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderCancelButton")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderList(value: () => ReactElement): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderList")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutRenderList: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderList")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderOption(value: (/* option */ T, /* isSelected */ Boolean) => ReactElement): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderOption")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRenderOption: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderOption")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedOption(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedOption: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedOption")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedOptionTextStyle(value: StyleProp[TextStyle]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedOptionTextStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedOptionTextStyle: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedOptionTextStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedOptionTextStyleNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedOptionTextStyle")(null)
        ret
    }
    @scala.inline
    def withShowFilter(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowFilter: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleTextStyle(value: StyleProp[TextStyle]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleTextStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleTextStyle: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleTextStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleTextStyleNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleTextStyle")(null)
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
  }
  
}

