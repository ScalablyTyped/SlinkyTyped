package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientScheduler.AppointmentDrag event.
  */
@js.native
trait ASPxClientAppointmentDragEventArgs extends ASPxClientEventArgs {
  /**
    * Specifies whether or not appointments can be dropped into the intervals over which they are currently dragged.
    */
  var allow: Boolean = js.native
  /**
    * Provides information about dragged appointments.
    */
  var dragInformation: js.Array[ASPxClientAppointmentDragInfo] = js.native
  /**
    * Gets a mouse event object related to the current drag operation.
    */
  var mouseEvent: js.Any = js.native
}

object ASPxClientAppointmentDragEventArgs {
  @scala.inline
  def apply(allow: Boolean, dragInformation: js.Array[ASPxClientAppointmentDragInfo], mouseEvent: js.Any): ASPxClientAppointmentDragEventArgs = {
    val __obj = js.Dynamic.literal(allow = allow.asInstanceOf[js.Any], dragInformation = dragInformation.asInstanceOf[js.Any], mouseEvent = mouseEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientAppointmentDragEventArgs]
  }
  @scala.inline
  implicit class ASPxClientAppointmentDragEventArgsOps[Self <: ASPxClientAppointmentDragEventArgs] (val x: Self) extends AnyVal {
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
    def withDragInformation(value: js.Array[ASPxClientAppointmentDragInfo]): Self = {
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

