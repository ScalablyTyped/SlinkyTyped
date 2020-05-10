package typingsSlinky.awsSdk.snsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetSubscriptionAttributesInput extends js.Object {
  /**
    * A map of attributes with their corresponding values. The following lists the names, descriptions, and values of the special request parameters that the SetTopicAttributes action uses:    DeliveryPolicy – The policy that defines how Amazon SNS retries failed deliveries to HTTP/S endpoints.    FilterPolicy – The simple JSON object that lets your subscriber receive only a subset of messages, rather than receiving every message published to the topic.    RawMessageDelivery – When set to true, enables raw message delivery to Amazon SQS or HTTP/S endpoints. This eliminates the need for the endpoints to process JSON formatting, which is otherwise created for Amazon SNS metadata.    RedrivePolicy – When specified, sends undeliverable messages to the specified Amazon SQS dead-letter queue. Messages that can't be delivered due to client errors (for example, when the subscribed endpoint is unreachable) or server errors (for example, when the service that powers the subscribed endpoint becomes unavailable) are held in the dead-letter queue for further analysis or reprocessing.  
    */
  var AttributeName: attributeName = js.native
  /**
    * The new value for the attribute in JSON format.
    */
  var AttributeValue: js.UndefOr[attributeValue] = js.native
  /**
    * The ARN of the subscription to modify.
    */
  var SubscriptionArn: subscriptionARN = js.native
}

object SetSubscriptionAttributesInput {
  @scala.inline
  def apply(AttributeName: attributeName, SubscriptionArn: subscriptionARN): SetSubscriptionAttributesInput = {
    val __obj = js.Dynamic.literal(AttributeName = AttributeName.asInstanceOf[js.Any], SubscriptionArn = SubscriptionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetSubscriptionAttributesInput]
  }
  @scala.inline
  implicit class SetSubscriptionAttributesInputOps[Self <: SetSubscriptionAttributesInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributeName(value: attributeName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubscriptionArn(value: subscriptionARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubscriptionArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttributeValue(value: attributeValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributeValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeValue")(js.undefined)
        ret
    }
  }
  
}

