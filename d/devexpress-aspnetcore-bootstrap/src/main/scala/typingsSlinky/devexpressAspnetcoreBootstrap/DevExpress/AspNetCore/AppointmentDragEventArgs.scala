package typingsSlinky.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppointmentDragEventArgs extends EventArgs {
  var allow: Boolean = js.native
  val dragInformation: js.Array[BootstrapSchedulerAppointmentDragInfo] = js.native
  val mouseEvent: js.Any = js.native
}

object AppointmentDragEventArgs {
  @scala.inline
  def apply(
    allow: Boolean,
    dragInformation: js.Array[BootstrapSchedulerAppointmentDragInfo],
    mouseEvent: js.Any,
    sender: Control
  ): AppointmentDragEventArgs = {
    val __obj = js.Dynamic.literal(allow = allow.asInstanceOf[js.Any], dragInformation = dragInformation.asInstanceOf[js.Any], mouseEvent = mouseEvent.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppointmentDragEventArgs]
  }
  @scala.inline
  implicit class AppointmentDragEventArgsOps[Self <: AppointmentDragEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDragInformation(value: js.Array[BootstrapSchedulerAppointmentDragInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragInformation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMouseEvent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseEvent")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

