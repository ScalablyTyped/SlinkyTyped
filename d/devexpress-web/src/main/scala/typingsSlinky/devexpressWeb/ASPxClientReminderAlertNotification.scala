package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains information related to the reminder alert.
  */
@js.native
trait ASPxClientReminderAlertNotification extends js.Object {
  /**
    * Gets the appointment associated with the triggered reminder.
    */
  var appointment: ASPxClientAppointment = js.native
  /**
    * Gets or sets whether the reminder is handled and therefore no default processing is required.
    */
  var handled: Boolean = js.native
  /**
    * Gets or sets whether an alert is invoked for a particular reminder.
    */
  var ignore: Boolean = js.native
  /**
    * Returns the triggered reminder.
    */
  var reminder: ASPxClientReminder = js.native
  /**
    * Gets the appointment associated with the reminder.
    */
  def GetAppointment(): ASPxClientAppointment = js.native
  /**
    * Gets the triggered reminder.
    */
  def GetReminder(): ASPxClientReminder = js.native
  /**
    * Gets the triggered reminder's ID.
    */
  def GetReminderId(): String = js.native
}

object ASPxClientReminderAlertNotification {
  @scala.inline
  def apply(
    GetAppointment: () => ASPxClientAppointment,
    GetReminder: () => ASPxClientReminder,
    GetReminderId: () => String,
    appointment: ASPxClientAppointment,
    handled: Boolean,
    ignore: Boolean,
    reminder: ASPxClientReminder
  ): ASPxClientReminderAlertNotification = {
    val __obj = js.Dynamic.literal(GetAppointment = js.Any.fromFunction0(GetAppointment), GetReminder = js.Any.fromFunction0(GetReminder), GetReminderId = js.Any.fromFunction0(GetReminderId), appointment = appointment.asInstanceOf[js.Any], handled = handled.asInstanceOf[js.Any], ignore = ignore.asInstanceOf[js.Any], reminder = reminder.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientReminderAlertNotification]
  }
  @scala.inline
  implicit class ASPxClientReminderAlertNotificationOps[Self <: ASPxClientReminderAlertNotification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetAppointment(value: () => ASPxClientAppointment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetAppointment")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetReminder(value: () => ASPxClientReminder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetReminder")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetReminderId(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetReminderId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAppointment(value: ASPxClientAppointment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHandled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIgnore(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReminder(value: ASPxClientReminder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reminder")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

