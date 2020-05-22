package typingsSlinky.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientScheduler.AppointmentToolTipShowing event.
  */
@JSGlobal("ASPxClientAppointmentToolTipShowingEventArgs")
@js.native
class ASPxClientAppointmentToolTipShowingEventArgs protected ()
  extends typingsSlinky.devexpressWeb.ASPxClientAppointmentToolTipShowingEventArgs {
  /**
    * Initializes a new instance of the ASPxClientAppointmentToolTipShowingEventArgs class.
    * @param appointment An ASPxClientAppointment object representing the appointment.
    */
  def this(appointment: typingsSlinky.devexpressWeb.ASPxClientAppointment) = this()
  /**
    * Gets the appointment.
    */
  /* CompleteClass */
  override var appointment: typingsSlinky.devexpressWeb.ASPxClientAppointment = js.native
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  /* CompleteClass */
  override var cancel: Boolean = js.native
}

