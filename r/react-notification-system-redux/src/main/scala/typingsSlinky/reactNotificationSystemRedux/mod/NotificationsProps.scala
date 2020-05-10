package typingsSlinky.reactNotificationSystemRedux.mod

import typingsSlinky.reactNotificationSystem.mod.Attributes
import typingsSlinky.reactNotificationSystem.mod.Notification
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationsProps extends Attributes {
  var notifications: js.UndefOr[js.Array[Notification]] = js.native
}

object NotificationsProps {
  @scala.inline
  def apply(): NotificationsProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotificationsProps]
  }
  @scala.inline
  implicit class NotificationsPropsOps[Self <: NotificationsProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNotifications(value: js.Array[Notification]): Self = {
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

