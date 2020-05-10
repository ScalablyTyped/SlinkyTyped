package typingsSlinky.reactNativeFirebase.mod.RNFirebase.notifications

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.reactNativeFirebase.AnonAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationsStatics extends js.Object {
  var Android: AnonAction = js.native
  var Notification: Instantiable0[typingsSlinky.reactNativeFirebase.mod.RNFirebase.notifications.Notification] = js.native
}

object NotificationsStatics {
  @scala.inline
  def apply(Android: AnonAction, Notification: Instantiable0[Notification]): NotificationsStatics = {
    val __obj = js.Dynamic.literal(Android = Android.asInstanceOf[js.Any], Notification = Notification.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationsStatics]
  }
  @scala.inline
  implicit class NotificationsStaticsOps[Self <: NotificationsStatics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAndroid(value: AnonAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Android")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotification(value: Instantiable0[Notification]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Notification")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

