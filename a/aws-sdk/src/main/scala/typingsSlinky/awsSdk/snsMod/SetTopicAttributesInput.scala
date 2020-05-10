package typingsSlinky.awsSdk.snsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetTopicAttributesInput extends js.Object {
  /**
    * A map of attributes with their corresponding values. The following lists the names, descriptions, and values of the special request parameters that the SetTopicAttributes action uses:    DeliveryPolicy – The policy that defines how Amazon SNS retries failed deliveries to HTTP/S endpoints.    DisplayName – The display name to use for a topic with SMS subscriptions.    Policy – The policy that defines who can access your topic. By default, only the topic owner can publish or subscribe to the topic.   The following attribute applies only to server-side-encryption:    KmsMasterKeyId - The ID of an AWS-managed customer master key (CMK) for Amazon SNS or a custom CMK. For more information, see Key Terms. For more examples, see KeyId in the AWS Key Management Service API Reference.   
    */
  var AttributeName: attributeName = js.native
  /**
    * The new value for the attribute.
    */
  var AttributeValue: js.UndefOr[attributeValue] = js.native
  /**
    * The ARN of the topic to modify.
    */
  var TopicArn: topicARN = js.native
}

object SetTopicAttributesInput {
  @scala.inline
  def apply(AttributeName: attributeName, TopicArn: topicARN): SetTopicAttributesInput = {
    val __obj = js.Dynamic.literal(AttributeName = AttributeName.asInstanceOf[js.Any], TopicArn = TopicArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetTopicAttributesInput]
  }
  @scala.inline
  implicit class SetTopicAttributesInputOps[Self <: SetTopicAttributesInput] (val x: Self) extends AnyVal {
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
    def withTopicArn(value: topicARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TopicArn")(value.asInstanceOf[js.Any])
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

