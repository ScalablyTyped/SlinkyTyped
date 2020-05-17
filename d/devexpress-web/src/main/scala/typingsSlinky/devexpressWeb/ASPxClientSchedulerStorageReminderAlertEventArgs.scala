package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientSchedulerStorageControl.ReminderAlert event.
  */
@js.native
trait ASPxClientSchedulerStorageReminderAlertEventArgs extends ASPxClientEventArgs {
  /**
    * Returns an array of currently triggered reminders.
    */
  var alertNotifications: js.Array[ASPxClientReminderAlertNotification] = js.native
}

object ASPxClientSchedulerStorageReminderAlertEventArgs {
  @scala.inline
  def apply(alertNotifications: js.Array[ASPxClientReminderAlertNotification]): ASPxClientSchedulerStorageReminderAlertEventArgs = {
    val __obj = js.Dynamic.literal(alertNotifications = alertNotifications.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientSchedulerStorageReminderAlertEventArgs]
  }
  @scala.inline
  implicit class ASPxClientSchedulerStorageReminderAlertEventArgsOps[Self <: ASPxClientSchedulerStorageReminderAlertEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlertNotifications(value: js.Array[ASPxClientReminderAlertNotification]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alertNotifications")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

