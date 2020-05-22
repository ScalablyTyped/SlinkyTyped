package typingsSlinky.officeJsPreview.Office

import typingsSlinky.officeJsPreview.officeJsPreviewStrings.olkAppointmentTimeChanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppointmentTimeChangedEventArgs extends js.Object {
  /**
    * Gets the appointment end date and time.
    *
    * [Api set: Mailbox 1.7]
    */
  var end: js.Date
  /**
    * Gets the appointment start date and time.
    *
    * [Api set: Mailbox 1.7]
    */
  var start: js.Date
  /**
    * Gets the type of the event. See `Office.EventType` for details.
    *
    * [Api set: Mailbox 1.7]
    */
  var `type`: olkAppointmentTimeChanged
}

object AppointmentTimeChangedEventArgs {
  @scala.inline
  def apply(end: js.Date, start: js.Date, `type`: olkAppointmentTimeChanged): AppointmentTimeChangedEventArgs = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppointmentTimeChangedEventArgs]
  }
}

