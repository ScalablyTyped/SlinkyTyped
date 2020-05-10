package typingsSlinky.pulumiAws.topicSubscriptionMod

import typingsSlinky.pulumiAws.topicMod.Topic
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TopicSubscriptionState extends js.Object {
  /**
    * The ARN of the subscription stored as a more user-friendly property
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * Integer indicating number of minutes to wait in retying mode for fetching subscription arn before marking it as failure. Only applicable for http and https protocols (default is 1 minute).
    */
  val confirmationTimeoutInMinutes: js.UndefOr[Input[Double]] = js.native
  /**
    * JSON String with the delivery policy (retries, backoff, etc.) that will be used in the subscription - this only applies to HTTP/S subscriptions. Refer to the [SNS docs](https://docs.aws.amazon.com/sns/latest/dg/DeliveryPolicies.html) for more details.
    */
  val deliveryPolicy: js.UndefOr[Input[String]] = js.native
  /**
    * The endpoint to send data to, the contents will vary with the protocol. (see below for more information)
    */
  val endpoint: js.UndefOr[Input[String]] = js.native
  /**
    * Boolean indicating whether the end point is capable of [auto confirming subscription](http://docs.aws.amazon.com/sns/latest/dg/SendMessageToHttp.html#SendMessageToHttp.prepare) e.g., PagerDuty (default is false)
    */
  val endpointAutoConfirms: js.UndefOr[Input[Boolean]] = js.native
  /**
    * JSON String with the filter policy that will be used in the subscription to filter messages seen by the target resource. Refer to the [SNS docs](https://docs.aws.amazon.com/sns/latest/dg/message-filtering.html) for more details.
    */
  val filterPolicy: js.UndefOr[Input[String]] = js.native
  /**
    * The protocol to use. The possible values for this are: `sqs`, `sms`, `lambda`, `application`. (`http` or `https` are partially supported, see below) (`email` is an option but is unsupported, see below).
    */
  val protocol: js.UndefOr[Input[String]] = js.native
  /**
    * Boolean indicating whether or not to enable raw message delivery (the original message is directly passed, not wrapped in JSON with the original message in the message property) (default is false).
    */
  val rawMessageDelivery: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The ARN of the SNS topic to subscribe to
    */
  val topic: js.UndefOr[Input[String | Topic]] = js.native
}

object TopicSubscriptionState {
  @scala.inline
  def apply(): TopicSubscriptionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TopicSubscriptionState]
  }
  @scala.inline
  implicit class TopicSubscriptionStateOps[Self <: TopicSubscriptionState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(js.undefined)
        ret
    }
    @scala.inline
    def withConfirmationTimeoutInMinutes(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirmationTimeoutInMinutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfirmationTimeoutInMinutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirmationTimeoutInMinutes")(js.undefined)
        ret
    }
    @scala.inline
    def withDeliveryPolicy(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deliveryPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeliveryPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deliveryPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withEndpoint(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withEndpointAutoConfirms(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpointAutoConfirms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpointAutoConfirms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpointAutoConfirms")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterPolicy(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withProtocol(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtocol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(js.undefined)
        ret
    }
    @scala.inline
    def withRawMessageDelivery(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawMessageDelivery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRawMessageDelivery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawMessageDelivery")(js.undefined)
        ret
    }
    @scala.inline
    def withTopic(value: Input[String | Topic]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topic")(js.undefined)
        ret
    }
  }
  
}

