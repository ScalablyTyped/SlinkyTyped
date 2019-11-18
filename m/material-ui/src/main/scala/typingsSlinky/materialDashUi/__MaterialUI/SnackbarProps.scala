package typingsSlinky.materialDashUi.__MaterialUI

import slinky.core.TagMod
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.reactMod.CSSProperties
import typingsSlinky.react.reactMod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnackbarProps extends js.Object {
  var action: js.UndefOr[TagMod[Any]] = js.undefined
  var autoHideDuration: js.UndefOr[Double] = js.undefined
  var bodyStyle: js.UndefOr[CSSProperties] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var contentStyle: js.UndefOr[CSSProperties] = js.undefined
  var message: TagMod[Any]
  var onActionClick: js.UndefOr[MouseEventHandler[js.Object]] = js.undefined
  var onRequestClose: js.UndefOr[js.Function1[/* reason */ String, Unit]] = js.undefined
  var open: Boolean
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object SnackbarProps {
  @scala.inline
  def apply(
    message: TagMod[Any],
    open: Boolean,
    action: TagMod[Any] = null,
    autoHideDuration: Int | Double = null,
    bodyStyle: CSSProperties = null,
    className: String = null,
    contentStyle: CSSProperties = null,
    onActionClick: SyntheticMouseEvent[js.Object] => Unit = null,
    onRequestClose: /* reason */ String => Unit = null,
    style: CSSProperties = null
  ): SnackbarProps = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (autoHideDuration != null) __obj.updateDynamic("autoHideDuration")(autoHideDuration.asInstanceOf[js.Any])
    if (bodyStyle != null) __obj.updateDynamic("bodyStyle")(bodyStyle.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (contentStyle != null) __obj.updateDynamic("contentStyle")(contentStyle.asInstanceOf[js.Any])
    if (onActionClick != null) __obj.updateDynamic("onActionClick")(js.Any.fromFunction1(onActionClick))
    if (onRequestClose != null) __obj.updateDynamic("onRequestClose")(js.Any.fromFunction1(onRequestClose))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnackbarProps]
  }
}

