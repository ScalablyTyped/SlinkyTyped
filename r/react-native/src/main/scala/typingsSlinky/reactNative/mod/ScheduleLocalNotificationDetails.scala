package typingsSlinky.reactNative.mod

import typingsSlinky.reactNative.reactNativeStrings.day
import typingsSlinky.reactNative.reactNativeStrings.hour
import typingsSlinky.reactNative.reactNativeStrings.minute
import typingsSlinky.reactNative.reactNativeStrings.month
import typingsSlinky.reactNative.reactNativeStrings.week
import typingsSlinky.reactNative.reactNativeStrings.year
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScheduleLocalNotificationDetails extends js.Object {
  var alertAction: js.UndefOr[String] = js.native
  var alertBody: js.UndefOr[String] = js.native
  var alertTitle: js.UndefOr[String] = js.native
  var applicationIconBadgeNumber: js.UndefOr[Double] = js.native
  var category: js.UndefOr[String] = js.native
  var fireDate: js.UndefOr[Double | String] = js.native
  var isSilent: js.UndefOr[Boolean] = js.native
  var repeatInterval: js.UndefOr[year | month | week | day | hour | minute] = js.native
  var soundName: js.UndefOr[String] = js.native
  var userInfo: js.UndefOr[js.Object] = js.native
}

object ScheduleLocalNotificationDetails {
  @scala.inline
  def apply(): ScheduleLocalNotificationDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduleLocalNotificationDetails]
  }
  @scala.inline
  implicit class ScheduleLocalNotificationDetailsOps[Self <: ScheduleLocalNotificationDetails] (val x: Self) extends AnyVal {
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
    def withoutAlertAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alertAction")(js.undefined)
        ret
    }
    @scala.inline
    def withAlertBody(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alertBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlertBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alertBody")(js.undefined)
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
    def withFireDate(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fireDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFireDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fireDate")(js.undefined)
        ret
    }
    @scala.inline
    def withIsSilent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSilent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsSilent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSilent")(js.undefined)
        ret
    }
    @scala.inline
    def withRepeatInterval(value: year | month | week | day | hour | minute): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repeatInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepeatInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repeatInterval")(js.undefined)
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

