package typingsSlinky.firebaseMessaging.tokenDetailsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscriptionOptions extends js.Object {
  var auth: String = js.native
  var endpoint: String = js.native
  var p256dh: String = js.native
  var swScope: String = js.native
  var vapidKey: String = js.native
}

object SubscriptionOptions {
  @scala.inline
  def apply(auth: String, endpoint: String, p256dh: String, swScope: String, vapidKey: String): SubscriptionOptions = {
    val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any], p256dh = p256dh.asInstanceOf[js.Any], swScope = swScope.asInstanceOf[js.Any], vapidKey = vapidKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionOptions]
  }
  @scala.inline
  implicit class SubscriptionOptionsOps[Self <: SubscriptionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndpoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withP256dh(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("p256dh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSwScope(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swScope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVapidKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vapidKey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

