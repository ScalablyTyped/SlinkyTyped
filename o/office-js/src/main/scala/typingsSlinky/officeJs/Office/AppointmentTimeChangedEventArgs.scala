package typingsSlinky.officeJs.Office

import typingsSlinky.officeJs.officeJsStrings.olkAppointmentTimeChanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppointmentTimeChangedEventArgs extends js.Object {
  /** 
    * Gets the appointment end date and time. 
    * 
    * [Api set: Mailbox 1.7] 
    */ 
  var end: js.Date = js.native
  /** 
    * Gets the appointment start date and time. 
    * 
    * [Api set: Mailbox 1.7] 
    */ 
  var start: js.Date = js.native
  /** 
    * Gets the type of the event. See `Office.EventType` for details. 
    * 
    * [Api set: Mailbox 1.7] 
    */ 
  var `type`: olkAppointmentTimeChanged = js.native
}

object AppointmentTimeChangedEventArgs {
  @scala.inline
  def apply(end: js.Date, start: js.Date, `type`: olkAppointmentTimeChanged): AppointmentTimeChangedEventArgs = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppointmentTimeChangedEventArgs]
  }
  @scala.inline
  implicit class AppointmentTimeChangedEventArgsOps[Self <: AppointmentTimeChangedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnd(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: olkAppointmentTimeChanged): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

