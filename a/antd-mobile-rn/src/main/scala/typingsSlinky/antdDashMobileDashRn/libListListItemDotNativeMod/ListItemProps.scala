package typingsSlinky.antdDashMobileDashRn.libListListItemDotNativeMod

import slinky.core.TagMod
import typingsSlinky.antdDashMobileDashRn.Anon_Arrow
import typingsSlinky.antdDashMobileDashRn.antdDashMobileDashRnStrings._empty
import typingsSlinky.antdDashMobileDashRn.antdDashMobileDashRnStrings.android
import typingsSlinky.antdDashMobileDashRn.antdDashMobileDashRnStrings.bottom
import typingsSlinky.antdDashMobileDashRn.antdDashMobileDashRnStrings.down
import typingsSlinky.antdDashMobileDashRn.antdDashMobileDashRnStrings.empty
import typingsSlinky.antdDashMobileDashRn.antdDashMobileDashRnStrings.horizontal
import typingsSlinky.antdDashMobileDashRn.antdDashMobileDashRnStrings.ios
import typingsSlinky.antdDashMobileDashRn.antdDashMobileDashRnStrings.middle
import typingsSlinky.antdDashMobileDashRn.antdDashMobileDashRnStrings.top
import typingsSlinky.antdDashMobileDashRn.antdDashMobileDashRnStrings.up
import typingsSlinky.antdDashMobileDashRn.libListPropsTypeMod.ListItemPropsType
import typingsSlinky.reactDashNative.reactDashNativeMod.StyleProp
import typingsSlinky.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListItemProps extends ListItemPropsType {
  var onClick: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPressIn: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPressOut: js.UndefOr[js.Function0[Unit]] = js.undefined
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var styles: js.UndefOr[Anon_Arrow] = js.undefined
}

object ListItemProps {
  @scala.inline
  def apply(
    activeStyle: StyleProp[ViewStyle] = null,
    align: top | middle | bottom = null,
    arrow: horizontal | down | up | empty | _empty = null,
    children: TagMod[Any] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    error: js.UndefOr[Boolean] = js.undefined,
    extra: TagMod[Any] = null,
    multipleLine: js.UndefOr[Boolean] = js.undefined,
    onClick: () => Unit = null,
    onPressIn: () => Unit = null,
    onPressOut: () => Unit = null,
    platform: android | ios = null,
    style: StyleProp[ViewStyle] = null,
    styles: Anon_Arrow = null,
    thumb: TagMod[Any] = null,
    wrap: js.UndefOr[Boolean] = js.undefined
  ): ListItemProps = {
    val __obj = js.Dynamic.literal()
    if (activeStyle != null) __obj.updateDynamic("activeStyle")(activeStyle.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (arrow != null) __obj.updateDynamic("arrow")(arrow.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (!js.isUndefined(multipleLine)) __obj.updateDynamic("multipleLine")(multipleLine.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction0(onClick))
    if (onPressIn != null) __obj.updateDynamic("onPressIn")(js.Any.fromFunction0(onPressIn))
    if (onPressOut != null) __obj.updateDynamic("onPressOut")(js.Any.fromFunction0(onPressOut))
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (thumb != null) __obj.updateDynamic("thumb")(thumb.asInstanceOf[js.Any])
    if (!js.isUndefined(wrap)) __obj.updateDynamic("wrap")(wrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListItemProps]
  }
}

