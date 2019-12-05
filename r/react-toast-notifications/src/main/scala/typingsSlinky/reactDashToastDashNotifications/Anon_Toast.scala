package typingsSlinky.reactDashToastDashNotifications

import slinky.core.ReactComponentClass
import typingsSlinky.reactDashToastDashNotifications.reactDashToastDashNotificationsMod.ToastContainerProps
import typingsSlinky.reactDashToastDashNotifications.reactDashToastDashNotificationsMod.ToastProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Toast extends js.Object {
  var Toast: js.UndefOr[ReactComponentClass[ToastProps]] = js.undefined
  var ToastContainer: js.UndefOr[ReactComponentClass[ToastContainerProps]] = js.undefined
}

object Anon_Toast {
  @scala.inline
  def apply(
    Toast: ReactComponentClass[ToastProps] = null,
    ToastContainer: ReactComponentClass[ToastContainerProps] = null
  ): Anon_Toast = {
    val __obj = js.Dynamic.literal()
    if (Toast != null) __obj.updateDynamic("Toast")(Toast.asInstanceOf[js.Any])
    if (ToastContainer != null) __obj.updateDynamic("ToastContainer")(ToastContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Toast]
  }
}

