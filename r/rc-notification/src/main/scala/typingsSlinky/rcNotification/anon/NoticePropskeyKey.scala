package typingsSlinky.rcNotification.anon

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.TagMod
import slinky.web.SyntheticMouseEvent
import typingsSlinky.rcNotification.noticeMod.DivProps
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Key
import typingsSlinky.react.mod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined rc-notification.rc-notification/lib/Notice.NoticeProps & {  key  :react.react.Key} */
trait NoticePropskeyKey extends js.Object {
  var children: js.UndefOr[TagMod[Any]] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var closable: js.UndefOr[Boolean] = js.undefined
  var closeIcon: js.UndefOr[TagMod[Any]] = js.undefined
  var duration: js.UndefOr[Double | Null] = js.undefined
  /** @private Only for internal usage. We don't promise that we will refactor this */
  var holder: js.UndefOr[HTMLDivElement] = js.undefined
  var key: Key
  var onClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
  var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  var prefixCls: String
  var props: js.UndefOr[DivProps] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var update: js.UndefOr[Boolean] = js.undefined
}

object NoticePropskeyKey {
  @scala.inline
  def apply(
    key: Key,
    prefixCls: String,
    children: TagMod[Any] = null,
    className: String = null,
    closable: js.UndefOr[Boolean] = js.undefined,
    closeIcon: TagMod[Any] = null,
    duration: js.UndefOr[Null | Double] = js.undefined,
    holder: HTMLDivElement = null,
    onClick: SyntheticMouseEvent[HTMLDivElement] => Unit = null,
    onClose: () => Unit = null,
    props: DivProps = null,
    style: CSSProperties = null,
    update: js.UndefOr[Boolean] = js.undefined
  ): NoticePropskeyKey = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(closable)) __obj.updateDynamic("closable")(closable.get.asInstanceOf[js.Any])
    if (closeIcon != null) __obj.updateDynamic("closeIcon")(closeIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (holder != null) __obj.updateDynamic("holder")(holder.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction0(onClose))
    if (props != null) __obj.updateDynamic("props")(props.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(update)) __obj.updateDynamic("update")(update.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoticePropskeyKey]
  }
}

