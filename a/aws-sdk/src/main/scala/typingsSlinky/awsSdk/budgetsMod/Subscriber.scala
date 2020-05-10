package typingsSlinky.awsSdk.budgetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Subscriber extends js.Object {
  /**
    * The address that AWS sends budget notifications to, either an SNS topic or an email. When you create a subscriber, the value of Address can't contain line breaks.
    */
  var Address: SubscriberAddress = js.native
  /**
    * The type of notification that AWS sends to a subscriber.
    */
  var SubscriptionType: typingsSlinky.awsSdk.budgetsMod.SubscriptionType = js.native
}

object Subscriber {
  @scala.inline
  def apply(Address: SubscriberAddress, SubscriptionType: SubscriptionType): Subscriber = {
    val __obj = js.Dynamic.literal(Address = Address.asInstanceOf[js.Any], SubscriptionType = SubscriptionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Subscriber]
  }
  @scala.inline
  implicit class SubscriberOps[Self <: Subscriber] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddress(value: SubscriberAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubscriptionType(value: SubscriptionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubscriptionType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

