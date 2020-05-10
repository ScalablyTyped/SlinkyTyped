package typingsSlinky.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PresentLocalNotificationDetails extends js.Object {
  var alertAction: String = js.native
  var alertBody: String = js.native
  var alertTitle: js.UndefOr[String] = js.native
  var applicationIconBadgeNumber: js.UndefOr[Double] = js.native
  var category: js.UndefOr[String] = js.native
  var soundName: js.UndefOr[String] = js.native
  var userInfo: js.UndefOr[js.Object] = js.native
}

object PresentLocalNotificationDetails {
  @scala.inline
  def apply(alertAction: String, alertBody: String): PresentLocalNotificationDetails = {
    val __obj = js.Dynamic.literal(alertAction = alertAction.asInstanceOf[js.Any], alertBody = alertBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[PresentLocalNotificationDetails]
  }
  @scala.inline
  implicit class PresentLocalNotificationDetailsOps[Self <: PresentLocalNotificationDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlertAction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alertAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlertBody(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alertBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlertTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alertTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlertTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alertTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withApplicationIconBadgeNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationIconBadgeNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationIconBadgeNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationIconBadgeNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withCategory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(js.undefined)
        ret
    }
    @scala.inline
    def withSoundName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("soundName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSoundName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("soundName")(js.undefined)
        ret
    }
    @scala.inline
    def withUserInfo(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userInfo")(js.undefined)
        ret
    }
  }
  
}

