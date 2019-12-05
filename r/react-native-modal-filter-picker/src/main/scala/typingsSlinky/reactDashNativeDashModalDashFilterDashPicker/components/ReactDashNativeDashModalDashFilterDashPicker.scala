package typingsSlinky.reactDashNativeDashModalDashFilterDashPicker.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashNative.reactDashNativeMod.FlatListProps
import typingsSlinky.reactDashNative.reactDashNativeMod.KeyboardAvoidingView
import typingsSlinky.reactDashNative.reactDashNativeMod.ListViewProps
import typingsSlinky.reactDashNative.reactDashNativeMod.ModalProps
import typingsSlinky.reactDashNative.reactDashNativeMod.StyleProp
import typingsSlinky.reactDashNative.reactDashNativeMod.TextStyle
import typingsSlinky.reactDashNative.reactDashNativeMod.ViewStyle
import typingsSlinky.reactDashNativeDashModalDashFilterDashPicker.reactDashNativeDashModalDashFilterDashPickerMod.ModalFilterPickerOption
import typingsSlinky.reactDashNativeDashModalDashFilterDashPicker.reactDashNativeDashModalDashFilterDashPickerMod.ModalFilterPickerProps
import typingsSlinky.reactDashNativeDashModalDashFilterDashPicker.reactDashNativeDashModalDashFilterDashPickerMod.default
import typingsSlinky.reactDashNativeDashModalDashFilterDashPicker.reactDashNativeDashModalDashFilterDashPickerStrings.always
import typingsSlinky.reactDashNativeDashModalDashFilterDashPicker.reactDashNativeDashModalDashFilterDashPickerStrings.handle
import typingsSlinky.reactDashNativeDashModalDashFilterDashPicker.reactDashNativeDashModalDashFilterDashPickerStrings.never
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDashNativeDashModalDashFilterDashPicker
  extends ExternalComponentWithAttributesWithRefType[tag.type, default[js.Any]] {
  @JSImport("react-native-modal-filter-picker", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: autoFocus */
  def apply[T /* <: ModalFilterPickerOption */](
    onCancel: () => Unit,
    onSelect: String => Unit,
    options: js.Array[T],
    androidUnderlineColor: String = null,
    cancelButtonStyle: StyleProp[ViewStyle] = null,
    cancelButtonText: String = null,
    cancelButtonTextStyle: StyleProp[TextStyle] = null,
    cancelContainerStyle: StyleProp[ViewStyle] = null,
    filterTextInputContainerStyle: StyleProp[ViewStyle] = null,
    filterTextInputStyle: StyleProp[TextStyle] = null,
    keyboardShouldPersistTaps: never | always | handle = null,
    listContainerStyle: StyleProp[ViewStyle] = null,
    listViewProps: Partial[ListViewProps | FlatListProps[T]] = null,
    modal: ModalProps = null,
    noResultsText: String = null,
    optionTextStyle: StyleProp[TextStyle] = null,
    overlayStyle: StyleProp[KeyboardAvoidingView | ViewStyle] = null,
    placeholderText: String = null,
    placeholderTextColor: String = null,
    renderCancelButton: () => typingsSlinky.react.reactMod._Global_.JSX.Element = null,
    renderList: () => typingsSlinky.react.reactMod._Global_.JSX.Element = null,
    renderOption: (T, /* isSelected */ Boolean) => typingsSlinky.react.reactMod._Global_.JSX.Element = null,
    selectedOption: String = null,
    selectedOptionTextStyle: StyleProp[TextStyle] = null,
    showFilter: js.UndefOr[Boolean] = js.undefined,
    title: String = null,
    titleTextStyle: StyleProp[TextStyle] = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default[js.Any]] = {
    val __obj = js.Dynamic.literal(onCancel = js.Any.fromFunction0(onCancel), onSelect = js.Any.fromFunction1(onSelect), options = options.asInstanceOf[js.Any])
    if (androidUnderlineColor != null) __obj.updateDynamic("androidUnderlineColor")(androidUnderlineColor.asInstanceOf[js.Any])
    if (cancelButtonStyle != null) __obj.updateDynamic("cancelButtonStyle")(cancelButtonStyle.asInstanceOf[js.Any])
    if (cancelButtonText != null) __obj.updateDynamic("cancelButtonText")(cancelButtonText.asInstanceOf[js.Any])
    if (cancelButtonTextStyle != null) __obj.updateDynamic("cancelButtonTextStyle")(cancelButtonTextStyle.asInstanceOf[js.Any])
    if (cancelContainerStyle != null) __obj.updateDynamic("cancelContainerStyle")(cancelContainerStyle.asInstanceOf[js.Any])
    if (filterTextInputContainerStyle != null) __obj.updateDynamic("filterTextInputContainerStyle")(filterTextInputContainerStyle.asInstanceOf[js.Any])
    if (filterTextInputStyle != null) __obj.updateDynamic("filterTextInputStyle")(filterTextInputStyle.asInstanceOf[js.Any])
    if (keyboardShouldPersistTaps != null) __obj.updateDynamic("keyboardShouldPersistTaps")(keyboardShouldPersistTaps.asInstanceOf[js.Any])
    if (listContainerStyle != null) __obj.updateDynamic("listContainerStyle")(listContainerStyle.asInstanceOf[js.Any])
    if (listViewProps != null) __obj.updateDynamic("listViewProps")(listViewProps.asInstanceOf[js.Any])
    if (modal != null) __obj.updateDynamic("modal")(modal.asInstanceOf[js.Any])
    if (noResultsText != null) __obj.updateDynamic("noResultsText")(noResultsText.asInstanceOf[js.Any])
    if (optionTextStyle != null) __obj.updateDynamic("optionTextStyle")(optionTextStyle.asInstanceOf[js.Any])
    if (overlayStyle != null) __obj.updateDynamic("overlayStyle")(overlayStyle.asInstanceOf[js.Any])
    if (placeholderText != null) __obj.updateDynamic("placeholderText")(placeholderText.asInstanceOf[js.Any])
    if (placeholderTextColor != null) __obj.updateDynamic("placeholderTextColor")(placeholderTextColor.asInstanceOf[js.Any])
    if (renderCancelButton != null) __obj.updateDynamic("renderCancelButton")(js.Any.fromFunction0(renderCancelButton))
    if (renderList != null) __obj.updateDynamic("renderList")(js.Any.fromFunction0(renderList))
    if (renderOption != null) __obj.updateDynamic("renderOption")(js.Any.fromFunction2(renderOption))
    if (selectedOption != null) __obj.updateDynamic("selectedOption")(selectedOption.asInstanceOf[js.Any])
    if (selectedOptionTextStyle != null) __obj.updateDynamic("selectedOptionTextStyle")(selectedOptionTextStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(showFilter)) __obj.updateDynamic("showFilter")(showFilter.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleTextStyle != null) __obj.updateDynamic("titleTextStyle")(titleTextStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props]).asInstanceOf[slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashNativeDashModalDashFilterDashPicker.reactDashNativeDashModalDashFilterDashPickerMod.default[js.Any]]]
  }
  type Props = ModalFilterPickerProps[js.Any]
}

