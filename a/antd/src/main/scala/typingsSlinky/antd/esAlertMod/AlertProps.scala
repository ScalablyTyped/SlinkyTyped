package typingsSlinky.antd.esAlertMod

import org.scalajs.dom.raw.HTMLButtonElement
import slinky.core.TagMod
import slinky.web.SyntheticMouseEvent
import typingsSlinky.antd.antdStrings.error
import typingsSlinky.antd.antdStrings.info
import typingsSlinky.antd.antdStrings.success
import typingsSlinky.antd.antdStrings.warning
import typingsSlinky.react.reactMod.CSSProperties
import typingsSlinky.react.reactMod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlertProps extends js.Object {
  /** Trigger when animation ending of Alert */
  var afterClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  var banner: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  /** Whether Alert can be closed */
  var closable: js.UndefOr[Boolean] = js.undefined
  /** Close text to show */
  var closeText: js.UndefOr[TagMod[Any]] = js.undefined
  /** Additional content of Alert */
  var description: js.UndefOr[TagMod[Any]] = js.undefined
  var icon: js.UndefOr[TagMod[Any]] = js.undefined
  var iconType: js.UndefOr[String] = js.undefined
  /** Content of Alert */
  var message: TagMod[Any]
  /** Callback when close Alert */
  var onClose: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  /** Whether to show icon */
  var showIcon: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  /**
    * Type of Alert styles, options:`success`, `info`, `warning`, `error`
    */
  var `type`: js.UndefOr[success | info | warning | error] = js.undefined
}

object AlertProps {
  @scala.inline
  def apply(
    message: TagMod[Any],
    afterClose: () => Unit = null,
    banner: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    closable: js.UndefOr[Boolean] = js.undefined,
    closeText: TagMod[Any] = null,
    description: TagMod[Any] = null,
    icon: TagMod[Any] = null,
    iconType: String = null,
    onClose: SyntheticMouseEvent[HTMLButtonElement] => Unit = null,
    prefixCls: String = null,
    showIcon: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    `type`: success | info | warning | error = null
  ): AlertProps = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    if (afterClose != null) __obj.updateDynamic("afterClose")(js.Any.fromFunction0(afterClose))
    if (!js.isUndefined(banner)) __obj.updateDynamic("banner")(banner.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(closable)) __obj.updateDynamic("closable")(closable.asInstanceOf[js.Any])
    if (closeText != null) __obj.updateDynamic("closeText")(closeText.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (iconType != null) __obj.updateDynamic("iconType")(iconType.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1(onClose))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (!js.isUndefined(showIcon)) __obj.updateDynamic("showIcon")(showIcon.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlertProps]
  }
}

