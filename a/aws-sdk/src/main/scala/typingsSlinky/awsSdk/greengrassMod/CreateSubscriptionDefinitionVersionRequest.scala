package typingsSlinky.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSubscriptionDefinitionVersionRequest extends js.Object {
  /**
    * A client token used to correlate requests and responses.
    */
  var AmznClientToken: js.UndefOr[string] = js.native
  /**
    * The ID of the subscription definition.
    */
  var SubscriptionDefinitionId: string = js.native
  /**
    * A list of subscriptions.
    */
  var Subscriptions: js.UndefOr[listOfSubscription] = js.native
}

object CreateSubscriptionDefinitionVersionRequest {
  @scala.inline
  def apply(SubscriptionDefinitionId: string): CreateSubscriptionDefinitionVersionRequest = {
    val __obj = js.Dynamic.literal(SubscriptionDefinitionId = SubscriptionDefinitionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSubscriptionDefinitionVersionRequest]
  }
  @scala.inline
  implicit class CreateSubscriptionDefinitionVersionRequestOps[Self <: CreateSubscriptionDefinitionVersionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSubscriptionDefinitionId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubscriptionDefinitionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAmznClientToken(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AmznClientToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmznClientToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AmznClientToken")(js.undefined)
        ret
    }
    @scala.inline
    def withSubscriptions(value: listOfSubscription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Subscriptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubscriptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Subscriptions")(js.undefined)
        ret
    }
  }
  
}

