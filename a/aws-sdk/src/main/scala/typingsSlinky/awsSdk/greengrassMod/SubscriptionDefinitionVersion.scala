package typingsSlinky.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscriptionDefinitionVersion extends js.Object {
  /**
    * A list of subscriptions.
    */
  var Subscriptions: js.UndefOr[listOfSubscription] = js.native
}

object SubscriptionDefinitionVersion {
  @scala.inline
  def apply(): SubscriptionDefinitionVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubscriptionDefinitionVersion]
  }
  @scala.inline
  implicit class SubscriptionDefinitionVersionOps[Self <: SubscriptionDefinitionVersion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

