package typingsSlinky.antd.libNotificationMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.TagMod
import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArgsProps extends js.Object {
  var bottom: js.UndefOr[Double] = js.undefined
  var btn: js.UndefOr[TagMod[Any]] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var description: js.UndefOr[TagMod[Any]] = js.undefined
  var duration: js.UndefOr[Double | Null] = js.undefined
  var getContainer: js.UndefOr[js.Function0[HTMLElement]] = js.undefined
  var icon: js.UndefOr[TagMod[Any]] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  var message: TagMod[Any]
  var onClick: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  var placement: js.UndefOr[NotificationPlacement] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var top: js.UndefOr[Double] = js.undefined
  val `type`: js.UndefOr[IconType] = js.undefined
}

object ArgsProps {
  @scala.inline
  def apply(
    message: TagMod[Any],
    bottom: Int | Double = null,
    btn: TagMod[Any] = null,
    className: String = null,
    description: TagMod[Any] = null,
    duration: Int | Double = null,
    getContainer: () => HTMLElement = null,
    icon: TagMod[Any] = null,
    key: String = null,
    onClick: () => Unit = null,
    onClose: () => Unit = null,
    placement: NotificationPlacement = null,
    prefixCls: String = null,
    style: CSSProperties = null,
    top: Int | Double = null,
    `type`: IconType = null
  ): ArgsProps = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (btn != null) __obj.updateDynamic("btn")(btn.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (getContainer != null) __obj.updateDynamic("getContainer")(js.Any.fromFunction0(getContainer))
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction0(onClick))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction0(onClose))
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgsProps]
  }
}

