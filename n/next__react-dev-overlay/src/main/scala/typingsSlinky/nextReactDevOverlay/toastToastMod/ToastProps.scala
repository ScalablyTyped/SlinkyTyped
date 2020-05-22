package typingsSlinky.nextReactDevOverlay.toastToastMod

import org.scalajs.dom.raw.HTMLDivElement
import slinky.web.SyntheticMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToastProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* ev */ SyntheticMouseEvent[HTMLDivElement], Unit]] = js.undefined
}

object ToastProps {
  @scala.inline
  def apply(className: String = null, onClick: /* ev */ SyntheticMouseEvent[HTMLDivElement] => Unit = null): ToastProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    __obj.asInstanceOf[ToastProps]
  }
}

