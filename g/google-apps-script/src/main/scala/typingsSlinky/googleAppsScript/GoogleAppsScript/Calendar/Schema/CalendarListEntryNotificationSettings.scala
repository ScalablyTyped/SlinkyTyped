package typingsSlinky.googleAppsScript.GoogleAppsScript.Calendar.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CalendarListEntryNotificationSettings extends js.Object {
  var notifications: js.UndefOr[js.Array[CalendarNotification]] = js.native
}

object CalendarListEntryNotificationSettings {
  @scala.inline
  def apply(): CalendarListEntryNotificationSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CalendarListEntryNotificationSettings]
  }
  @scala.inline
  implicit class CalendarListEntryNotificationSettingsOps[Self <: CalendarListEntryNotificationSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNotifications(value: js.Array[CalendarNotification]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotifications: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifications")(js.undefined)
        ret
    }
  }
  
}

