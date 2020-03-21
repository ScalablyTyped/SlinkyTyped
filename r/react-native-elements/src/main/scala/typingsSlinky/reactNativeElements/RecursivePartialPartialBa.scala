package typingsSlinky.reactNativeElements

import slinky.core.ReactComponentClass
import slinky.core.TagMod
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeElements.mod.RecursivePartial
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.error
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.primary
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.success
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-native-elements.react-native-elements.RecursivePartial<std.Partial<react-native-elements.react-native-elements.BadgeProps>> */
trait RecursivePartialPartialBa extends js.Object {
  var Component: js.UndefOr[RecursivePartial[js.UndefOr[ReactComponentClass[js.Object]]]] = js.undefined
  var badgeStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.undefined
  var containerStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.undefined
  var onPress: js.UndefOr[RecursivePartial[js.UndefOr[js.Function0[Unit]]]] = js.undefined
  var status: js.UndefOr[RecursivePartial[js.UndefOr[primary | success | warning | error]]] = js.undefined
  var textStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]] = js.undefined
  var value: js.UndefOr[RecursivePartial[js.UndefOr[TagMod[Any]]]] = js.undefined
}

object RecursivePartialPartialBa {
  @scala.inline
  def apply(
    Component: RecursivePartial[js.UndefOr[ReactComponentClass[js.Object]]] = null,
    badgeStyle: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]] = null,
    containerStyle: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]] = null,
    onPress: RecursivePartial[js.UndefOr[js.Function0[Unit]]] = null,
    status: RecursivePartial[js.UndefOr[primary | success | warning | error]] = null,
    textStyle: RecursivePartial[js.UndefOr[StyleProp[TextStyle]]] = null,
    value: RecursivePartial[js.UndefOr[TagMod[Any]]] = null
  ): RecursivePartialPartialBa = {
    val __obj = js.Dynamic.literal()
    if (Component != null) __obj.updateDynamic("Component")(Component.asInstanceOf[js.Any])
    if (badgeStyle != null) __obj.updateDynamic("badgeStyle")(badgeStyle.asInstanceOf[js.Any])
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (onPress != null) __obj.updateDynamic("onPress")(onPress.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecursivePartialPartialBa]
  }
}

