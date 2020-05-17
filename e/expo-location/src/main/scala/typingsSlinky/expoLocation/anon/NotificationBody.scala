package typingsSlinky.expoLocation.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationBody extends js.Object {
  var notificationBody: String = js.native
  var notificationColor: js.UndefOr[String] = js.native
  var notificationTitle: String = js.native
}

object NotificationBody {
  @scala.inline
  def apply(notificationBody: String, notificationTitle: String): NotificationBody = {
    val __obj = js.Dynamic.literal(notificationBody = notificationBody.asInstanceOf[js.Any], notificationTitle = notificationTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationBody]
  }
  @scala.inline
  implicit class NotificationBodyOps[Self <: NotificationBody] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNotificationBody(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotificationTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotificationColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotificationColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationColor")(js.undefined)
        ret
    }
  }
  
}

