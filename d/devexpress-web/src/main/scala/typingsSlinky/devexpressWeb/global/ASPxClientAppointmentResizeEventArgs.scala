package typingsSlinky.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientScheduler.AppointmentResize event.
  */
@JSGlobal("ASPxClientAppointmentResizeEventArgs")
@js.native
class ASPxClientAppointmentResizeEventArgs protected ()
  extends typingsSlinky.devexpressWeb.ASPxClientAppointmentResizeEventArgs {
  /**
    * Initializes a new instance of the ASPxClientAppointmentResizeEventArgs class.
    * @param operation An ASPxClientAppointmentOperation object providing methods to perform or cancel the resize operation.
    * @param appointmentId A string containing an appointment identifier.
    * @param oldInterval An  object specifying the appointment's interval before the resize operation.
    * @param newInterval An  object specifying the appointment's interval after the resize operation.
    */
  def this(
    operation: typingsSlinky.devexpressWeb.ASPxClientAppointmentOperation,
    appointmentId: String,
    oldInterval: typingsSlinky.devexpressWeb.ASPxClientTimeInterval,
    newInterval: typingsSlinky.devexpressWeb.ASPxClientTimeInterval
  ) = this()
  /**
    * Gets the resized appointment's identifier.
    */
  /* CompleteClass */
  override var appointmentId: String = js.native
  /**
    * Gets or sets whether default event processing is required.
    */
  /* CompleteClass */
  override var handled: Boolean = js.native
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
  /**
    * Provides access to an object that enables you to choose an operation to perform.
    */
  /* CompleteClass */
  override var operation: typingsSlinky.devexpressWeb.ASPxClientAppointmentOperation = js.native
}

