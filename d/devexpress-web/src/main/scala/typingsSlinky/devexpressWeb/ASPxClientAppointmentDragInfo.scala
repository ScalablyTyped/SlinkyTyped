package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Stores information about an appointment drag operation.
  */
@js.native
trait ASPxClientAppointmentDragInfo extends js.Object {
  /**
    * Gets the dragged appointment's identifier.
    */
  var appointmentId: String = js.native
  /**
    * Gets the appointment's interval after the drag operation.
    */
  var newInterval: ASPxClientTimeInterval = js.native
  /**
    * Gets resources associated with the appointment after the drag operation.
    */
  var newResources: js.Array[String] = js.native
  /**
    * Gets the appointment's interval before the drag operation.
    */
  var oldInterval: ASPxClientTimeInterval = js.native
  /**
    * Gets resources that were associated with the appointment before the drag operation.
    */
  var oldResources: js.Array[String] = js.native
}

object ASPxClientAppointmentDragInfo {
  @scala.inline
  def apply(
    appointmentId: String,
    newInterval: ASPxClientTimeInterval,
    newResources: js.Array[String],
    oldInterval: ASPxClientTimeInterval,
    oldResources: js.Array[String]
  ): ASPxClientAppointmentDragInfo = {
    val __obj = js.Dynamic.literal(appointmentId = appointmentId.asInstanceOf[js.Any], newInterval = newInterval.asInstanceOf[js.Any], newResources = newResources.asInstanceOf[js.Any], oldInterval = oldInterval.asInstanceOf[js.Any], oldResources = oldResources.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientAppointmentDragInfo]
  }
  @scala.inline
  implicit class ASPxClientAppointmentDragInfoOps[Self <: ASPxClientAppointmentDragInfo] (val x: Self) extends AnyVal {
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
    def withNewInterval(value: ASPxClientTimeInterval): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewResources(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newResources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldInterval(value: ASPxClientTimeInterval): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldResources(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldResources")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

