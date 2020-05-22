package typingsSlinky.reactNativeShare.buttonMod

import slinky.core.TagMod
import typingsSlinky.reactNative.mod.ImageSourcePropType
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextProps
import typingsSlinky.reactNative.mod.ViewProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonProps extends js.Object {
  var buttonStyle: StyleProp[ViewProps]
  var children: TagMod[Any]
  var iconSrc: ImageSourcePropType
  var textStyle: StyleProp[TextProps]
  def onPress(): Unit
}

object ButtonProps {
  @scala.inline
  def apply(
    iconSrc: ImageSourcePropType,
    onPress: () => Unit,
    buttonStyle: js.UndefOr[Null | StyleProp[ViewProps]] = js.undefined,
    children: TagMod[Any] = null,
    textStyle: js.UndefOr[Null | StyleProp[TextProps]] = js.undefined
  ): ButtonProps = {
    val __obj = js.Dynamic.literal(iconSrc = iconSrc.asInstanceOf[js.Any], onPress = js.Any.fromFunction0(onPress))
    if (!js.isUndefined(buttonStyle)) __obj.updateDynamic("buttonStyle")(buttonStyle.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(textStyle)) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonProps]
  }
}

