package typingsSlinky.reactToastNotifications

import slinky.core.ReactComponentClass
import typingsSlinky.reactToastNotifications.mod.ToastContainerProps
import typingsSlinky.reactToastNotifications.mod.ToastProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonToast extends js.Object {
  var Toast: js.UndefOr[ReactComponentClass[ToastProps]] = js.native
  var ToastContainer: js.UndefOr[ReactComponentClass[ToastContainerProps]] = js.native
}

object AnonToast {
  @scala.inline
  def apply(): AnonToast = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonToast]
  }
  @scala.inline
  implicit class AnonToastOps[Self <: AnonToast] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withToastFunctionComponent(value: ReactComponentClass[ToastProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Toast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToastComponentClass(value: ReactComponentClass[ToastProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Toast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToast(value: ReactComponentClass[ToastProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Toast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToast: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Toast")(js.undefined)
        ret
    }
    @scala.inline
    def withToastContainerFunctionComponent(value: ReactComponentClass[ToastContainerProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ToastContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToastContainerComponentClass(value: ReactComponentClass[ToastContainerProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ToastContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToastContainer(value: ReactComponentClass[ToastContainerProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ToastContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToastContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ToastContainer")(js.undefined)
        ret
    }
  }
  
}

