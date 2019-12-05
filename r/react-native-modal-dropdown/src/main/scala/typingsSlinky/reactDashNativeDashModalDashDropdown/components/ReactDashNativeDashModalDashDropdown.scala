package typingsSlinky.reactDashNativeDashModalDashDropdown.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashNativeDashModalDashDropdown.reactDashNativeDashModalDashDropdownMod.RNModalDropdown.ModalDropdownProps
import typingsSlinky.reactDashNativeDashModalDashDropdown.reactDashNativeDashModalDashDropdownMod.RNModalDropdown.PositionStyle
import typingsSlinky.reactDashNativeDashModalDashDropdown.reactDashNativeDashModalDashDropdownMod.^
import typingsSlinky.reactDashNativeDashModalDashDropdown.reactDashNativeDashModalDashDropdownStrings.always
import typingsSlinky.reactDashNativeDashModalDashDropdown.reactDashNativeDashModalDashDropdownStrings.handled
import typingsSlinky.reactDashNativeDashModalDashDropdown.reactDashNativeDashModalDashDropdownStrings.never
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDashNativeDashModalDashDropdown
  extends ExternalComponentWithAttributesWithRefType[tag.type, ^] {
  @JSImport("react-native-modal-dropdown", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: disabled */
  def apply(
    accessible: js.UndefOr[Boolean] = js.undefined,
    adjustFrame: /* positionStyle */ PositionStyle => Unit = null,
    animated: js.UndefOr[Boolean] = js.undefined,
    defaultIndex: Int | Double = null,
    defaultValue: String = null,
    dropdownStyle: js.Any = null,
    dropdownTextHighlightStyle: js.Any = null,
    dropdownTextStyle: js.Any = null,
    keyboardShouldPersistTaps: always | never | handled = null,
    onDropdownWillHide: () => Boolean = null,
    onDropdownWillShow: () => Boolean = null,
    onSelect: (/* index */ Double, /* option */ js.Any) => Unit = null,
    options: js.Array[_] = null,
    renderButtonText: /* text */ js.Any => _ = null,
    renderRow: (/* option */ js.Any, /* index */ Double, /* isSelected */ Boolean) => _ = null,
    renderSeparator: () => _ = null,
    scrollEnabled: js.UndefOr[Boolean] = js.undefined,
    showsVerticalScrollIndicator: js.UndefOr[Boolean] = js.undefined,
    style: js.Any = null,
    textStyle: js.Any = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ^] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(accessible)) __obj.updateDynamic("accessible")(accessible.asInstanceOf[js.Any])
    if (adjustFrame != null) __obj.updateDynamic("adjustFrame")(js.Any.fromFunction1(adjustFrame))
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.asInstanceOf[js.Any])
    if (defaultIndex != null) __obj.updateDynamic("defaultIndex")(defaultIndex.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (dropdownStyle != null) __obj.updateDynamic("dropdownStyle")(dropdownStyle.asInstanceOf[js.Any])
    if (dropdownTextHighlightStyle != null) __obj.updateDynamic("dropdownTextHighlightStyle")(dropdownTextHighlightStyle.asInstanceOf[js.Any])
    if (dropdownTextStyle != null) __obj.updateDynamic("dropdownTextStyle")(dropdownTextStyle.asInstanceOf[js.Any])
    if (keyboardShouldPersistTaps != null) __obj.updateDynamic("keyboardShouldPersistTaps")(keyboardShouldPersistTaps.asInstanceOf[js.Any])
    if (onDropdownWillHide != null) __obj.updateDynamic("onDropdownWillHide")(js.Any.fromFunction0(onDropdownWillHide))
    if (onDropdownWillShow != null) __obj.updateDynamic("onDropdownWillShow")(js.Any.fromFunction0(onDropdownWillShow))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction2(onSelect))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (renderButtonText != null) __obj.updateDynamic("renderButtonText")(js.Any.fromFunction1(renderButtonText))
    if (renderRow != null) __obj.updateDynamic("renderRow")(js.Any.fromFunction3(renderRow))
    if (renderSeparator != null) __obj.updateDynamic("renderSeparator")(js.Any.fromFunction0(renderSeparator))
    if (!js.isUndefined(scrollEnabled)) __obj.updateDynamic("scrollEnabled")(scrollEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(showsVerticalScrollIndicator)) __obj.updateDynamic("showsVerticalScrollIndicator")(showsVerticalScrollIndicator.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ModalDropdownProps
}

