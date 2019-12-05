package typingsSlinky.atAntDashDesignReactDashNative

import slinky.core.TagMod
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.Empty
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.android
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.bottom
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.down
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.empty
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.horizontal
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.ios
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.middle
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.top
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.up
import typingsSlinky.reactDashNative.reactDashNativeMod.GestureResponderEvent
import typingsSlinky.reactDashNative.reactDashNativeMod.StyleProp
import typingsSlinky.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@ant-design/react-native.@ant-design/react-native/lib/list/ListItem.ListItemProps> */
trait PartialListItemProps extends js.Object {
  var activeStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var align: js.UndefOr[top | middle | bottom] = js.undefined
  var arrow: js.UndefOr[horizontal | down | up | empty | Empty] = js.undefined
  var children: js.UndefOr[TagMod[Any]] = js.undefined
  var delayLongPress: js.UndefOr[Double] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var error: js.UndefOr[Boolean] = js.undefined
  var extra: js.UndefOr[TagMod[Any]] = js.undefined
  var multipleLine: js.UndefOr[Boolean] = js.undefined
  var onLongPress: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  var onPress: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  var onPressIn: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  var onPressOut: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  var platform: js.UndefOr[android | ios] = js.undefined
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var styles: js.UndefOr[PartialListStyle] = js.undefined
  var thumb: js.UndefOr[TagMod[Any]] = js.undefined
  var wrap: js.UndefOr[Boolean] = js.undefined
}

object PartialListItemProps {
  @scala.inline
  def apply(
    activeStyle: StyleProp[ViewStyle] = null,
    align: top | middle | bottom = null,
    arrow: horizontal | down | up | empty | Empty = null,
    children: TagMod[Any] = null,
    delayLongPress: Int | Double = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    error: js.UndefOr[Boolean] = js.undefined,
    extra: TagMod[Any] = null,
    multipleLine: js.UndefOr[Boolean] = js.undefined,
    onLongPress: /* event */ GestureResponderEvent => Unit = null,
    onPress: /* event */ GestureResponderEvent => Unit = null,
    onPressIn: /* event */ GestureResponderEvent => Unit = null,
    onPressOut: /* event */ GestureResponderEvent => Unit = null,
    platform: android | ios = null,
    style: StyleProp[ViewStyle] = null,
    styles: PartialListStyle = null,
    thumb: TagMod[Any] = null,
    wrap: js.UndefOr[Boolean] = js.undefined
  ): PartialListItemProps = {
    val __obj = js.Dynamic.literal()
    if (activeStyle != null) __obj.updateDynamic("activeStyle")(activeStyle.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (arrow != null) __obj.updateDynamic("arrow")(arrow.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (delayLongPress != null) __obj.updateDynamic("delayLongPress")(delayLongPress.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (!js.isUndefined(multipleLine)) __obj.updateDynamic("multipleLine")(multipleLine.asInstanceOf[js.Any])
    if (onLongPress != null) __obj.updateDynamic("onLongPress")(js.Any.fromFunction1(onLongPress))
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction1(onPress))
    if (onPressIn != null) __obj.updateDynamic("onPressIn")(js.Any.fromFunction1(onPressIn))
    if (onPressOut != null) __obj.updateDynamic("onPressOut")(js.Any.fromFunction1(onPressOut))
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (thumb != null) __obj.updateDynamic("thumb")(thumb.asInstanceOf[js.Any])
    if (!js.isUndefined(wrap)) __obj.updateDynamic("wrap")(wrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialListItemProps]
  }
}

