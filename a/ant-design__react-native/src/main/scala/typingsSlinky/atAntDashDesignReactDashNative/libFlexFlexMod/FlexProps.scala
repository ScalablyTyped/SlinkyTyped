package typingsSlinky.atAntDashDesignReactDashNative.libFlexFlexMod

import slinky.core.TagMod
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.`column-reverse`
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.`row-reverse`
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.`wrap-reverse`
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.around
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.baseline
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.between
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.center
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.column
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.end
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.nowrap
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.row
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.start
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.stretch
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.wrap
import typingsSlinky.atAntDashDesignReactDashNative.libFlexPropsTypeMod.FlexPropsType
import typingsSlinky.reactDashNative.reactDashNativeMod.StyleProp
import typingsSlinky.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlexProps extends FlexPropsType {
  var onLongPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPressIn: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPressOut: js.UndefOr[js.Function0[Unit]] = js.undefined
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}

object FlexProps {
  @scala.inline
  def apply(
    align: start | center | end | baseline | stretch = null,
    children: TagMod[Any] = null,
    direction: row | `row-reverse` | column | `column-reverse` = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    justify: start | end | center | between | around = null,
    onLongPress: () => Unit = null,
    onPress: () => Unit = null,
    onPressIn: () => Unit = null,
    onPressOut: () => Unit = null,
    style: StyleProp[ViewStyle] = null,
    wrap: nowrap | wrap | `wrap-reverse` = null
  ): FlexProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (justify != null) __obj.updateDynamic("justify")(justify.asInstanceOf[js.Any])
    if (onLongPress != null) __obj.updateDynamic("onLongPress")(js.Any.fromFunction0(onLongPress))
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction0(onPress))
    if (onPressIn != null) __obj.updateDynamic("onPressIn")(js.Any.fromFunction0(onPressIn))
    if (onPressOut != null) __obj.updateDynamic("onPressOut")(js.Any.fromFunction0(onPressOut))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (wrap != null) __obj.updateDynamic("wrap")(wrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlexProps]
  }
}

