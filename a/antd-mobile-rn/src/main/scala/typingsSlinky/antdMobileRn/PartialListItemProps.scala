package typingsSlinky.antdMobileRn

import slinky.core.TagMod
import typingsSlinky.antdMobileRn.antdMobileRnStrings._empty
import typingsSlinky.antdMobileRn.antdMobileRnStrings.android
import typingsSlinky.antdMobileRn.antdMobileRnStrings.bottom
import typingsSlinky.antdMobileRn.antdMobileRnStrings.down
import typingsSlinky.antdMobileRn.antdMobileRnStrings.empty
import typingsSlinky.antdMobileRn.antdMobileRnStrings.horizontal
import typingsSlinky.antdMobileRn.antdMobileRnStrings.ios
import typingsSlinky.antdMobileRn.antdMobileRnStrings.middle
import typingsSlinky.antdMobileRn.antdMobileRnStrings.top
import typingsSlinky.antdMobileRn.antdMobileRnStrings.up
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<antd-mobile-rn.antd-mobile-rn/lib/list/ListItem.native.ListItemProps> */
trait PartialListItemProps extends js.Object {
  var activeStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var align: js.UndefOr[top | middle | bottom] = js.undefined
  var arrow: js.UndefOr[horizontal | down | up | empty | _empty] = js.undefined
  var children: js.UndefOr[TagMod[Any]] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var error: js.UndefOr[Boolean] = js.undefined
  var extra: js.UndefOr[TagMod[Any]] = js.undefined
  var multipleLine: js.UndefOr[Boolean] = js.undefined
  var onClick: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPressIn: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPressOut: js.UndefOr[js.Function0[Unit]] = js.undefined
  var platform: js.UndefOr[android | ios] = js.undefined
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var styles: js.UndefOr[AnonArrow] = js.undefined
  var thumb: js.UndefOr[TagMod[Any]] = js.undefined
  var wrap: js.UndefOr[Boolean] = js.undefined
}

object PartialListItemProps {
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
    styles: AnonArrow = null,
    thumb: TagMod[Any] = null,
    wrap: js.UndefOr[Boolean] = js.undefined
  ): PartialListItemProps = {
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
    __obj.asInstanceOf[PartialListItemProps]
  }
}

