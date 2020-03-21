package typingsSlinky.rcNotification.notificationMod

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.TagMod
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Key
import typingsSlinky.react.mod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Omit<rc-notification.rc-notification/lib/Notice.NoticeProps, 'prefixCls' | 'children'> */
trait NoticeContent extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var closable: js.UndefOr[Boolean] = js.undefined
  var closeIcon: js.UndefOr[TagMod[Any]] = js.undefined
  var content: js.UndefOr[TagMod[Any]] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var holder: js.UndefOr[HTMLDivElement] = js.undefined
  var key: js.UndefOr[Key] = js.undefined
  var onClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
  var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var update: js.UndefOr[Boolean] = js.undefined
  var updateKey: js.UndefOr[Key] = js.undefined
}

object NoticeContent {
  @scala.inline
  def apply(
    className: String = null,
    closable: js.UndefOr[Boolean] = js.undefined,
    closeIcon: TagMod[Any] = null,
    content: TagMod[Any] = null,
    duration: Int | Double = null,
    holder: HTMLDivElement = null,
    key: Key = null,
    onClick: SyntheticMouseEvent[HTMLDivElement] => Unit = null,
    onClose: () => Unit = null,
    prefixCls: String = null,
    style: CSSProperties = null,
    update: js.UndefOr[Boolean] = js.undefined,
    updateKey: Key = null
  ): NoticeContent = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(closable)) __obj.updateDynamic("closable")(closable.asInstanceOf[js.Any])
    if (closeIcon != null) __obj.updateDynamic("closeIcon")(closeIcon.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (holder != null) __obj.updateDynamic("holder")(holder.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction0(onClose))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(update)) __obj.updateDynamic("update")(update.asInstanceOf[js.Any])
    if (updateKey != null) __obj.updateDynamic("updateKey")(updateKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoticeContent]
  }
}

