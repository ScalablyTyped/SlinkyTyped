package typingsSlinky.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BootstrapSchedulerAppointmentDragInfo extends js.Object {
  val appointmentId: String = js.native
  val instance: js.Any = js.native
  val newInterval: BootstrapTimeInterval | Null = js.native
  val oldInterval: BootstrapTimeInterval | Null = js.native
}

object BootstrapSchedulerAppointmentDragInfo {
  @scala.inline
  def apply(appointmentId: String, instance: js.Any): BootstrapSchedulerAppointmentDragInfo = {
    val __obj = js.Dynamic.literal(appointmentId = appointmentId.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapSchedulerAppointmentDragInfo]
  }
  @scala.inline
  implicit class BootstrapSchedulerAppointmentDragInfoOps[Self <: BootstrapSchedulerAppointmentDragInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppointmentId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointmentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstance(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewInterval(value: BootstrapTimeInterval): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewIntervalNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newInterval")(null)
        ret
    }
    @scala.inline
    def withOldInterval(value: BootstrapTimeInterval): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldIntervalNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldInterval")(null)
        ret
    }
  }
  
}

