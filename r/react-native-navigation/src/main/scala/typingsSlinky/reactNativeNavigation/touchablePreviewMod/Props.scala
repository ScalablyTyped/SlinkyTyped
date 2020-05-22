package typingsSlinky.reactNativeNavigation.touchablePreviewMod

import slinky.core.TagMod
import typingsSlinky.reactNative.mod.TouchableHighlight
import typingsSlinky.reactNative.mod.TouchableNativeFeedback
import typingsSlinky.reactNative.mod.TouchableOpacity
import typingsSlinky.reactNative.mod.TouchableWithoutFeedback
import typingsSlinky.reactNativeNavigation.anon.ReactTag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var children: TagMod[Any]
  var onPeekIn: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPeekOut: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPressIn: js.UndefOr[js.Function1[/* payload */ ReactTag, Unit]] = js.undefined
  var touchableComponent: js.UndefOr[
    TouchableHighlight | TouchableOpacity | TouchableNativeFeedback | TouchableWithoutFeedback | TagMod[Any]
  ] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    children: TagMod[Any] = null,
    onPeekIn: () => Unit = null,
    onPeekOut: () => Unit = null,
    onPress: () => Unit = null,
    onPressIn: /* payload */ ReactTag => Unit = null,
    touchableComponent: TouchableHighlight | TouchableOpacity | TouchableNativeFeedback | TouchableWithoutFeedback | TagMod[Any] = null
  ): Props = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (onPeekIn != null) __obj.updateDynamic("onPeekIn")(js.Any.fromFunction0(onPeekIn))
    if (onPeekOut != null) __obj.updateDynamic("onPeekOut")(js.Any.fromFunction0(onPeekOut))
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction0(onPress))
    if (onPressIn != null) __obj.updateDynamic("onPressIn")(js.Any.fromFunction1(onPressIn))
    if (touchableComponent != null) __obj.updateDynamic("touchableComponent")(touchableComponent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

