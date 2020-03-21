package typingsSlinky.antdMobileRn.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.antdMobileRn.AnonNativeEvent
import typingsSlinky.antdMobileRn.searchBarIndexNativeMod.SearchBarNativeProps
import typingsSlinky.antdMobileRn.searchBarStyleIndexNativeMod.ISearchBarStyle
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SearchBar
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.antdMobileRn.mod.SearchBar] {
  @JSImport("antd-mobile-rn", "SearchBar")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: autoFocus, disabled, placeholder */
  def apply(
    styles: ISearchBarStyle,
    cancelText: String = null,
    defaultValue: String = null,
    focused: js.UndefOr[Boolean] = js.undefined,
    maxLength: Int | Double = null,
    onBlur: () => Unit = null,
    onCancel: /* value */ String => Unit = null,
    onChange: /* value */ String => Unit = null,
    onChangeText: /* text */ String => Unit = null,
    onClear: /* value */ String => Unit = null,
    onFocus: () => Unit = null,
    onSubmit: /* value */ String => Unit = null,
    onSubmitEditing: /* event */ AnonNativeEvent => Unit = null,
    showCancelButton: js.UndefOr[Boolean] = js.undefined,
    style: StyleProp[TextStyle] = null,
    value: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.antdMobileRn.mod.SearchBar] = {
    val __obj = js.Dynamic.literal(styles = styles.asInstanceOf[js.Any])
    if (cancelText != null) __obj.updateDynamic("cancelText")(cancelText.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(focused)) __obj.updateDynamic("focused")(focused.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction0(onBlur))
    if (onCancel != null) __obj.updateDynamic("onCancel")(js.Any.fromFunction1(onCancel))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onChangeText != null) __obj.updateDynamic("onChangeText")(js.Any.fromFunction1(onChangeText))
    if (onClear != null) __obj.updateDynamic("onClear")(js.Any.fromFunction1(onClear))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction0(onFocus))
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction1(onSubmit))
    if (onSubmitEditing != null) __obj.updateDynamic("onSubmitEditing")(js.Any.fromFunction1(onSubmitEditing))
    if (!js.isUndefined(showCancelButton)) __obj.updateDynamic("showCancelButton")(showCancelButton.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = SearchBarNativeProps
}

