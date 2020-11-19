package typingsSlinky.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
