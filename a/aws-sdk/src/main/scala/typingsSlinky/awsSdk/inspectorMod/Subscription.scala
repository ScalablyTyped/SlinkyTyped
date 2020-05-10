package typingsSlinky.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Subscription extends js.Object {
  /**
    * The list of existing event subscriptions.
    */
  var eventSubscriptions: EventSubscriptionList = js.native
  /**
    * The ARN of the assessment template that is used during the event for which the SNS notification is sent.
    */
  var resourceArn: Arn = js.native
  /**
    * The ARN of the Amazon Simple Notification Service (SNS) topic to which the SNS notifications are sent.
    */
  var topicArn: Arn = js.native
}

object Subscription {
  @scala.inline
  def apply(eventSubscriptions: EventSubscriptionList, resourceArn: Arn, topicArn: Arn): Subscription = {
    val __obj = js.Dynamic.literal(eventSubscriptions = eventSubscriptions.asInstanceOf[js.Any], resourceArn = resourceArn.asInstanceOf[js.Any], topicArn = topicArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Subscription]
  }
  @scala.inline
  implicit class SubscriptionOps[Self <: Subscription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEventSubscriptions(value: EventSubscriptionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventSubscriptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourceArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTopicArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topicArn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

