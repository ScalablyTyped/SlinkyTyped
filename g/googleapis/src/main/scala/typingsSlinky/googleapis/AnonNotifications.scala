package typingsSlinky.googleapis

import typingsSlinky.googleapis.calendarV3Mod.calendarV3.SchemaCalendarNotification
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonNotifications extends js.Object {
  var notifications: js.UndefOr[js.Array[SchemaCalendarNotification]] = js.native
}

object AnonNotifications {
  @scala.inline
  def apply(): AnonNotifications = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonNotifications]
  }
  @scala.inline
  implicit class AnonNotificationsOps[Self <: AnonNotifications] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNotifications(value: js.Array[SchemaCalendarNotification]): Self = {
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

