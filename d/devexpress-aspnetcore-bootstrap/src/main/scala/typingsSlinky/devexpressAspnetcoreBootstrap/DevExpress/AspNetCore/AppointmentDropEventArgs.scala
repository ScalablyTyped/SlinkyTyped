package typingsSlinky.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppointmentDropEventArgs extends EventArgs {
  val dragInformation: js.Array[BootstrapSchedulerAppointmentDragInfo] = js.native
  var handled: Boolean = js.native
  val operation: BootstrapSchedulerAppointmentOperation = js.native
}

object AppointmentDropEventArgs {
  @scala.inline
  def apply(
    dragInformation: js.Array[BootstrapSchedulerAppointmentDragInfo],
    handled: Boolean,
    operation: BootstrapSchedulerAppointmentOperation,
    sender: Control
  ): AppointmentDropEventArgs = {
    val __obj = js.Dynamic.literal(dragInformation = dragInformation.asInstanceOf[js.Any], handled = handled.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppointmentDropEventArgs]
  }
  @scala.inline
  implicit class AppointmentDropEventArgsOps[Self <: AppointmentDropEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDragInformation(value: js.Array[BootstrapSchedulerAppointmentDragInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragInformation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHandled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperation(value: BootstrapSchedulerAppointmentOperation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operation")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

