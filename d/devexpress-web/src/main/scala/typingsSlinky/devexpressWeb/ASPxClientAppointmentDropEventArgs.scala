package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientScheduler.AppointmentDrop event.
  */
@js.native
trait ASPxClientAppointmentDropEventArgs extends ASPxClientEventArgs {
  /**
    * Provides information about dropped appointments.
    */
  var dragInformation: js.Array[ASPxClientAppointmentDragInfo] = js.native
  /**
    * Gets or sets a value that specifies whether the event is handled, and the default processing is not required.
    */
  var handled: Boolean = js.native
  /**
    * Provides access to an object that enables you to choose an operation to perform.
    */
  var operation: ASPxClientAppointmentOperation = js.native
}

object ASPxClientAppointmentDropEventArgs {
  @scala.inline
  def apply(
    dragInformation: js.Array[ASPxClientAppointmentDragInfo],
    handled: Boolean,
    operation: ASPxClientAppointmentOperation
  ): ASPxClientAppointmentDropEventArgs = {
    val __obj = js.Dynamic.literal(dragInformation = dragInformation.asInstanceOf[js.Any], handled = handled.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientAppointmentDropEventArgs]
  }
  @scala.inline
  implicit class ASPxClientAppointmentDropEventArgsOps[Self <: ASPxClientAppointmentDropEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDragInformation(value: js.Array[ASPxClientAppointmentDragInfo]): Self = {
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
    def withOperation(value: ASPxClientAppointmentOperation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operation")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

