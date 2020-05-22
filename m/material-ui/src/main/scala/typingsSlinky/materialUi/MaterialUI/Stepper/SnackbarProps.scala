package typingsSlinky.materialUi.MaterialUI.Stepper

import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Key
import typingsSlinky.react.mod.LegacyRef
import typingsSlinky.react.mod.MouseEventHandler
import typingsSlinky.react.mod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnackbarProps
  extends Props[ReactComponentClass[typingsSlinky.materialUi.MaterialUI.SnackbarProps]] {
  var action: js.UndefOr[String] = js.undefined
  var autoHideDuration: js.UndefOr[Double] = js.undefined
  var bodyStyle: js.UndefOr[CSSProperties] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var message: String | ReactElement
  var onActionClick: js.UndefOr[MouseEventHandler[js.Object]] = js.undefined
  /** @deprecated Use the open property to control the component instead */
  var onDismiss: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** @deprecated Use the open property to control the component instead */
  var onShow: js.UndefOr[js.Function0[Unit]] = js.undefined
   // DEPRECATED
  var open: Boolean
  /** @deprecated Use the open property to control the component instead */
  var openOnMount: js.UndefOr[Boolean] = js.undefined
   // DEPRECATED
  def onRequestClose(reason: String): Unit
}

object SnackbarProps {
  @scala.inline
  def apply(
    message: String | ReactElement,
    onRequestClose: String => Unit,
    open: Boolean,
    action: String = null,
    autoHideDuration: js.UndefOr[Double] = js.undefined,
    bodyStyle: CSSProperties = null,
    children: TagMod[Any] = null,
    className: String = null,
    key: Key = null,
    onActionClick: SyntheticMouseEvent[js.Object] => Unit = null,
    onDismiss: () => Unit = null,
    onShow: () => Unit = null,
    openOnMount: js.UndefOr[Boolean] = js.undefined,
    ref: js.UndefOr[
      Null | LegacyRef[ReactComponentClass[typingsSlinky.materialUi.MaterialUI.SnackbarProps]]
    ] = js.undefined
  ): SnackbarProps = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], onRequestClose = js.Any.fromFunction1(onRequestClose), open = open.asInstanceOf[js.Any])
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (!js.isUndefined(autoHideDuration)) __obj.updateDynamic("autoHideDuration")(autoHideDuration.get.asInstanceOf[js.Any])
    if (bodyStyle != null) __obj.updateDynamic("bodyStyle")(bodyStyle.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (onActionClick != null) __obj.updateDynamic("onActionClick")(js.Any.fromFunction1(onActionClick))
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(js.Any.fromFunction0(onDismiss))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction0(onShow))
    if (!js.isUndefined(openOnMount)) __obj.updateDynamic("openOnMount")(openOnMount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ref)) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnackbarProps]
  }
}

