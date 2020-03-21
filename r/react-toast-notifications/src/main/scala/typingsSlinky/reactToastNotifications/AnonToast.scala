package typingsSlinky.reactToastNotifications

import slinky.core.ReactComponentClass
import typingsSlinky.reactToastNotifications.mod.ToastContainerProps
import typingsSlinky.reactToastNotifications.mod.ToastProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonToast extends js.Object {
  var Toast: js.UndefOr[ReactComponentClass[ToastProps]] = js.undefined
  var ToastContainer: js.UndefOr[ReactComponentClass[ToastContainerProps]] = js.undefined
}

object AnonToast {
  @scala.inline
  def apply(
    Toast: ReactComponentClass[ToastProps] = null,
    ToastContainer: ReactComponentClass[ToastContainerProps] = null
  ): AnonToast = {
    val __obj = js.Dynamic.literal()
    if (Toast != null) __obj.updateDynamic("Toast")(Toast.asInstanceOf[js.Any])
    if (ToastContainer != null) __obj.updateDynamic("ToastContainer")(ToastContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonToast]
  }
}

