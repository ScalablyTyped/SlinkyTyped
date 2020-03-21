package typingsSlinky.reactNativeElements.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.web.html.`*`.tag
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeElements.mod.ButtonGroupProps
import typingsSlinky.reactNativeElements.mod.ElementObject
import typingsSlinky.reactNativeElements.mod.InnerBorderStyleProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ButtonGroup
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactNativeElements.mod.ButtonGroup] {
  @JSImport("react-native-elements", "ButtonGroup")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    buttons: js.Array[ElementObject | String],
    onPress: Double => Unit,
    Component: ReactComponentClass[_] = null,
    activeOpacity: Int | Double = null,
    buttonStyle: StyleProp[ViewStyle] = null,
    containerBorderRadius: Int | Double = null,
    containerStyle: StyleProp[ViewStyle] = null,
    disabled: Boolean | js.Array[Double] = null,
    disabledSelectedStyle: StyleProp[ViewStyle] = null,
    disabledSelectedTextStyle: StyleProp[TextStyle] = null,
    disabledStyle: StyleProp[ViewStyle] = null,
    disabledTextStyle: StyleProp[TextStyle] = null,
    innerBorderStyle: InnerBorderStyleProperty = null,
    lastBorderStyle: StyleProp[TextStyle | ViewStyle] = null,
    onHideUnderlay: () => Unit = null,
    onShowUnderlay: () => Unit = null,
    selectMultiple: js.UndefOr[Boolean] = js.undefined,
    selectedButtonStyle: StyleProp[ViewStyle] = null,
    selectedIndex: Int | Double = null,
    selectedIndexes: js.Array[Double] = null,
    selectedTextStyle: StyleProp[TextStyle] = null,
    setOpacityTo: /* value */ Double => Unit = null,
    textStyle: StyleProp[TextStyle] = null,
    underlayColor: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactNativeElements.mod.ButtonGroup] = {
    val __obj = js.Dynamic.literal(buttons = buttons.asInstanceOf[js.Any], onPress = js.Any.fromFunction1(onPress))
    if (Component != null) __obj.updateDynamic("Component")(Component.asInstanceOf[js.Any])
    if (activeOpacity != null) __obj.updateDynamic("activeOpacity")(activeOpacity.asInstanceOf[js.Any])
    if (buttonStyle != null) __obj.updateDynamic("buttonStyle")(buttonStyle.asInstanceOf[js.Any])
    if (containerBorderRadius != null) __obj.updateDynamic("containerBorderRadius")(containerBorderRadius.asInstanceOf[js.Any])
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (disabledSelectedStyle != null) __obj.updateDynamic("disabledSelectedStyle")(disabledSelectedStyle.asInstanceOf[js.Any])
    if (disabledSelectedTextStyle != null) __obj.updateDynamic("disabledSelectedTextStyle")(disabledSelectedTextStyle.asInstanceOf[js.Any])
    if (disabledStyle != null) __obj.updateDynamic("disabledStyle")(disabledStyle.asInstanceOf[js.Any])
    if (disabledTextStyle != null) __obj.updateDynamic("disabledTextStyle")(disabledTextStyle.asInstanceOf[js.Any])
    if (innerBorderStyle != null) __obj.updateDynamic("innerBorderStyle")(innerBorderStyle.asInstanceOf[js.Any])
    if (lastBorderStyle != null) __obj.updateDynamic("lastBorderStyle")(lastBorderStyle.asInstanceOf[js.Any])
    if (onHideUnderlay != null) __obj.updateDynamic("onHideUnderlay")(js.Any.fromFunction0(onHideUnderlay))
    if (onShowUnderlay != null) __obj.updateDynamic("onShowUnderlay")(js.Any.fromFunction0(onShowUnderlay))
    if (!js.isUndefined(selectMultiple)) __obj.updateDynamic("selectMultiple")(selectMultiple.asInstanceOf[js.Any])
    if (selectedButtonStyle != null) __obj.updateDynamic("selectedButtonStyle")(selectedButtonStyle.asInstanceOf[js.Any])
    if (selectedIndex != null) __obj.updateDynamic("selectedIndex")(selectedIndex.asInstanceOf[js.Any])
    if (selectedIndexes != null) __obj.updateDynamic("selectedIndexes")(selectedIndexes.asInstanceOf[js.Any])
    if (selectedTextStyle != null) __obj.updateDynamic("selectedTextStyle")(selectedTextStyle.asInstanceOf[js.Any])
    if (setOpacityTo != null) __obj.updateDynamic("setOpacityTo")(js.Any.fromFunction1(setOpacityTo))
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    if (underlayColor != null) __obj.updateDynamic("underlayColor")(underlayColor.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ButtonGroupProps
}

