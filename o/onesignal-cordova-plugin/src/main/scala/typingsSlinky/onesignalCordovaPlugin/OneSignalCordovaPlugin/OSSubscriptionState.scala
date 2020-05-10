package typingsSlinky.onesignalCordovaPlugin.OneSignalCordovaPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OSSubscriptionState extends js.Object {
  var pushToken: String = js.native
  var subscribed: Boolean = js.native
  var userId: String = js.native
  var userSubscriptionSetting: Boolean = js.native
}

object OSSubscriptionState {
  @scala.inline
  def apply(pushToken: String, subscribed: Boolean, userId: String, userSubscriptionSetting: Boolean): OSSubscriptionState = {
    val __obj = js.Dynamic.literal(pushToken = pushToken.asInstanceOf[js.Any], subscribed = subscribed.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any], userSubscriptionSetting = userSubscriptionSetting.asInstanceOf[js.Any])
    __obj.asInstanceOf[OSSubscriptionState]
  }
  @scala.inline
  implicit class OSSubscriptionStateOps[Self <: OSSubscriptionState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPushToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pushToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubscribed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscribed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserSubscriptionSetting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userSubscriptionSetting")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

