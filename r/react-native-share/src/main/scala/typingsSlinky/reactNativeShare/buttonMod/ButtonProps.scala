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
    children: TagMod[Any],
    iconSrc: ImageSourcePropType,
    onPress: () => Unit,
    buttonStyle: StyleProp[ViewProps] = null,
    textStyle: StyleProp[TextProps] = null
  ): ButtonProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], iconSrc = iconSrc.asInstanceOf[js.Any], onPress = js.Any.fromFunction0(onPress))
    if (buttonStyle != null) __obj.updateDynamic("buttonStyle")(buttonStyle.asInstanceOf[js.Any])
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonProps]
  }
}

