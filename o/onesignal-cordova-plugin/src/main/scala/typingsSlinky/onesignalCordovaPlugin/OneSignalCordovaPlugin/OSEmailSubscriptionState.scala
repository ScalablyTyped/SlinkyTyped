package typingsSlinky.onesignalCordovaPlugin.OneSignalCordovaPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OSEmailSubscriptionState extends js.Object {
  var emailAddress: String = js.native
  var emailUserId: String = js.native
}

object OSEmailSubscriptionState {
  @scala.inline
  def apply(emailAddress: String, emailUserId: String): OSEmailSubscriptionState = {
    val __obj = js.Dynamic.literal(emailAddress = emailAddress.asInstanceOf[js.Any], emailUserId = emailUserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OSEmailSubscriptionState]
  }
  @scala.inline
  implicit class OSEmailSubscriptionStateOps[Self <: OSEmailSubscriptionState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmailAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmailUserId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailUserId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

