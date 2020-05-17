package typingsSlinky.mobileMessagingCordova.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultipleNotifications extends js.Object {
   // a resource name for a status bar icon (without extension), located in '/platforms/android/app/src/main/res/mipmap'
  var multipleNotifications: Boolean = js.native
  var notificationAccentColor: String = js.native
  var notificationIcon: String = js.native
}

object MultipleNotifications {
  @scala.inline
  def apply(multipleNotifications: Boolean, notificationAccentColor: String, notificationIcon: String): MultipleNotifications = {
    val __obj = js.Dynamic.literal(multipleNotifications = multipleNotifications.asInstanceOf[js.Any], notificationAccentColor = notificationAccentColor.asInstanceOf[js.Any], notificationIcon = notificationIcon.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultipleNotifications]
  }
  @scala.inline
  implicit class MultipleNotificationsOps[Self <: MultipleNotifications] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMultipleNotifications(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multipleNotifications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotificationAccentColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationAccentColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotificationIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationIcon")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

