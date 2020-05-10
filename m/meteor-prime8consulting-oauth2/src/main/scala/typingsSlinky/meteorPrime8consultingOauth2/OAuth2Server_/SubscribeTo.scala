package typingsSlinky.meteorPrime8consultingOauth2.OAuth2Server_

import typingsSlinky.meteor.Meteor.SubscriptionHandle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscribeTo extends js.Object {
  /**
    * Wrapper function to subscribe to the auth code subscription. Returns a standard subscription handle.
    */
  def authCode(): SubscriptionHandle = js.native
}

object SubscribeTo {
  @scala.inline
  def apply(authCode: () => SubscriptionHandle): SubscribeTo = {
    val __obj = js.Dynamic.literal(authCode = js.Any.fromFunction0(authCode))
    __obj.asInstanceOf[SubscribeTo]
  }
  @scala.inline
  implicit class SubscribeToOps[Self <: SubscribeTo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthCode(value: () => SubscriptionHandle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authCode")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

