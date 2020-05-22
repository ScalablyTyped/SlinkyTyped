package typingsSlinky.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientScheduler.AppointmentResizing event.
  */
@JSGlobal("ASPxClientAppointmentResizingEventArgs")
@js.native
class ASPxClientAppointmentResizingEventArgs protected ()
  extends typingsSlinky.devexpressWeb.ASPxClientAppointmentResizingEventArgs {
  /**
    * Initializes a new instance of the ASPxClientAppointmentResizingEventArgs class.
    * @param mouseEvent A mouse event object related to the resizing operation.
    * @param appointmentId A string containing an appointment identifier.
    * @param oldInterval An  object specifying the appointment's interval before the resize operation.
    * @param newInterval An  object specifying the appointment's interval after the resize operation.
    */
  def this(
    mouseEvent: js.Any,
    appointmentId: String,
    oldInterval: typingsSlinky.devexpressWeb.ASPxClientTimeInterval,
    newInterval: typingsSlinky.devexpressWeb.ASPxClientTimeInterval
  ) = this()
  /**
    * Specifies whether or not an appointment can be resized to the new time interval.
    */
  /* CompleteClass */
  override var allow: Boolean = js.native
  /**
    * Gets the resized appointment's identifier.
    */
  /* CompleteClass */
  override var appointmentId: String = js.native
  /**
    * Gets a mouse event object related to the current appointment resizing operation.
    */
  /* CompleteClass */
  override var mouseEvent: js.Any = js.native
  /**
    * Gets the appointment's interval after resizing.
    */
  /* CompleteClass */
  override var newInterval: typingsSlinky.devexpressWeb.ASPxClientTimeInterval = js.native
  /**
    * Gets the appointment's interval before resizing.
    */
  /* CompleteClass */
  override var oldInterval: typingsSlinky.devexpressWeb.ASPxClientTimeInterval = js.native
}

