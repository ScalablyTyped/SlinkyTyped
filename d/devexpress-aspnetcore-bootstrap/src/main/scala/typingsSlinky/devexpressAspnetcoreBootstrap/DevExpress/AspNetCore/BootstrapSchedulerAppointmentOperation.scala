package typingsSlinky.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BootstrapSchedulerAppointmentOperation extends js.Object {
  val instance: js.Any = js.native
  @JSName("apply")
  def apply(): Unit = js.native
  def cancel(): Unit = js.native
}

object BootstrapSchedulerAppointmentOperation {
  @scala.inline
  def apply(apply: () => Unit, cancel: () => Unit, instance: js.Any): BootstrapSchedulerAppointmentOperation = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction0(apply), cancel = js.Any.fromFunction0(cancel), instance = instance.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapSchedulerAppointmentOperation]
  }
  @scala.inline
  implicit class BootstrapSchedulerAppointmentOperationOps[Self <: BootstrapSchedulerAppointmentOperation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApply(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apply")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCancel(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInstance(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instance")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

