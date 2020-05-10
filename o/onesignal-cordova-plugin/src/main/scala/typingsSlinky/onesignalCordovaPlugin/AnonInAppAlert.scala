package typingsSlinky.onesignalCordovaPlugin

import typingsSlinky.onesignalCordovaPlugin.onesignalCordovaPluginNumbers.`0`
import typingsSlinky.onesignalCordovaPlugin.onesignalCordovaPluginNumbers.`1`
import typingsSlinky.onesignalCordovaPlugin.onesignalCordovaPluginNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonInAppAlert extends js.Object {
  var InAppAlert: `1` = js.native
  var None: `0` = js.native
  var Notification: `2` = js.native
}

object AnonInAppAlert {
  @scala.inline
  def apply(InAppAlert: `1`, None: `0`, Notification: `2`): AnonInAppAlert = {
    val __obj = js.Dynamic.literal(InAppAlert = InAppAlert.asInstanceOf[js.Any], None = None.asInstanceOf[js.Any], Notification = Notification.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInAppAlert]
  }
  @scala.inline
  implicit class AnonInAppAlertOps[Self <: AnonInAppAlert] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInAppAlert(value: `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InAppAlert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNone(value: `0`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("None")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotification(value: `2`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Notification")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

