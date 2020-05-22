package typingsSlinky.reactNativeElements.anon

import slinky.core.ReactComponentClass
import slinky.core.TagMod
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.error
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.primary
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.success
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-native-elements.react-native-elements.BadgeProps> */
trait PartialBadgeProps extends js.Object {
  var Component: js.UndefOr[ReactComponentClass[js.Object]] = js.undefined
  var badgeStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  var status: js.UndefOr[primary | success | warning | error] = js.undefined
  var textStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var value: js.UndefOr[TagMod[Any]] = js.undefined
}

object PartialBadgeProps {
  @scala.inline
  def apply(
    Component: ReactComponentClass[js.Object] = null,
    badgeStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    containerStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    onPress: () => Unit = null,
    status: primary | success | warning | error = null,
    textStyle: js.UndefOr[Null | StyleProp[TextStyle]] = js.undefined,
    value: TagMod[Any] = null
  ): PartialBadgeProps = {
    val __obj = js.Dynamic.literal()
    if (Component != null) __obj.updateDynamic("Component")(Component.asInstanceOf[js.Any])
    if (!js.isUndefined(badgeStyle)) __obj.updateDynamic("badgeStyle")(badgeStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(containerStyle)) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction0(onPress))
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (!js.isUndefined(textStyle)) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialBadgeProps]
  }
}

