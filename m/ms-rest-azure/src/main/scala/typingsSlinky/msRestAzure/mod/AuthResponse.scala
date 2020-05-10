package typingsSlinky.msRestAzure.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthResponse extends js.Object {
  var credentials: DeviceTokenCredentials | ApplicationTokenCredentials | UserTokenCredentials = js.native
  var subscriptions: js.Array[LinkedSubscription] = js.native
}

object AuthResponse {
  @scala.inline
  def apply(
    credentials: DeviceTokenCredentials | ApplicationTokenCredentials | UserTokenCredentials,
    subscriptions: js.Array[LinkedSubscription]
  ): AuthResponse = {
    val __obj = js.Dynamic.literal(credentials = credentials.asInstanceOf[js.Any], subscriptions = subscriptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthResponse]
  }
  @scala.inline
  implicit class AuthResponseOps[Self <: AuthResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCredentials(value: DeviceTokenCredentials | ApplicationTokenCredentials | UserTokenCredentials): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubscriptions(value: js.Array[LinkedSubscription]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriptions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

