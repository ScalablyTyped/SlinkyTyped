package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientScheduler.AppointmentResizing event.
  */
@js.native
trait ASPxClientAppointmentResizingEventArgs extends ASPxClientEventArgs {
  /**
    * Specifies whether or not an appointment can be resized to the new time interval.
    */
  var allow: Boolean = js.native
  /**
    * Gets the resized appointment's identifier.
    */
  var appointmentId: String = js.native
  /**
    * Gets a mouse event object related to the current appointment resizing operation.
    */
  var mouseEvent: js.Any = js.native
  /**
    * Gets the appointment's interval after resizing.
    */
  var newInterval: ASPxClientTimeInterval = js.native
  /**
    * Gets the appointment's interval before resizing.
    */
  var oldInterval: ASPxClientTimeInterval = js.native
}

object ASPxClientAppointmentResizingEventArgs {
  @scala.inline
  def apply(
    allow: Boolean,
    appointmentId: String,
    mouseEvent: js.Any,
    newInterval: ASPxClientTimeInterval,
    oldInterval: ASPxClientTimeInterval
  ): ASPxClientAppointmentResizingEventArgs = {
    val __obj = js.Dynamic.literal(allow = allow.asInstanceOf[js.Any], appointmentId = appointmentId.asInstanceOf[js.Any], mouseEvent = mouseEvent.asInstanceOf[js.Any], newInterval = newInterval.asInstanceOf[js.Any], oldInterval = oldInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientAppointmentResizingEventArgs]
  }
  @scala.inline
  implicit class ASPxClientAppointmentResizingEventArgsOps[Self <: ASPxClientAppointmentResizingEventArgs] (val x: Self) extends AnyVal {
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
    def withAppointmentId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointmentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMouseEvent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewInterval(value: ASPxClientTimeInterval): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldInterval(value: ASPxClientTimeInterval): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldInterval")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

