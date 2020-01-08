package typingsSlinky.awsDashSdk.clientsShieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSubscriptionStateResponse extends js.Object {
  /**
    * The status of the subscription.
    */
  var SubscriptionState: typingsSlinky.awsDashSdk.clientsShieldMod.SubscriptionState = js.native
}

object GetSubscriptionStateResponse {
  @scala.inline
  def apply(SubscriptionState: SubscriptionState): GetSubscriptionStateResponse = {
    val __obj = js.Dynamic.literal(SubscriptionState = SubscriptionState.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetSubscriptionStateResponse]
  }
}

