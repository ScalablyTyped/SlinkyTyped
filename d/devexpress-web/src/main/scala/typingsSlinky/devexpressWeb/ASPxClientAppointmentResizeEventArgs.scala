package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientScheduler.AppointmentResize event.
  */
@js.native
trait ASPxClientAppointmentResizeEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the resized appointment's identifier.
    */
  var appointmentId: String = js.native
  /**
    * Gets or sets whether default event processing is required.
    */
  var handled: Boolean = js.native
  /**
    * Gets the appointment's interval after resizing.
    */
  var newInterval: ASPxClientTimeInterval = js.native
  /**
    * Gets the appointment's interval before resizing.
    */
  var oldInterval: ASPxClientTimeInterval = js.native
  /**
    * Provides access to an object that enables you to choose an operation to perform.
    */
  var operation: ASPxClientAppointmentOperation = js.native
}

object ASPxClientAppointmentResizeEventArgs {
  @scala.inline
  def apply(
    appointmentId: String,
    handled: Boolean,
    newInterval: ASPxClientTimeInterval,
    oldInterval: ASPxClientTimeInterval,
    operation: ASPxClientAppointmentOperation
  ): ASPxClientAppointmentResizeEventArgs = {
    val __obj = js.Dynamic.literal(appointmentId = appointmentId.asInstanceOf[js.Any], handled = handled.asInstanceOf[js.Any], newInterval = newInterval.asInstanceOf[js.Any], oldInterval = oldInterval.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientAppointmentResizeEventArgs]
  }
  @scala.inline
  implicit class ASPxClientAppointmentResizeEventArgsOps[Self <: ASPxClientAppointmentResizeEventArgs] (val x: Self) extends AnyVal {
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
    def withHandled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handled")(value.asInstanceOf[js.Any])
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
    @scala.inline
    def withOperation(value: ASPxClientAppointmentOperation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operation")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

