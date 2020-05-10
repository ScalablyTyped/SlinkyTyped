package typingsSlinky.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsSnsTopicDetails extends js.Object {
  /**
    * The ID of an AWS-managed customer master key (CMK) for Amazon SNS or a custom CMK.
    */
  var KmsMasterKeyId: js.UndefOr[NonEmptyString] = js.native
  /**
    * The subscription's owner.
    */
  var Owner: js.UndefOr[NonEmptyString] = js.native
  /**
    * Subscription is an embedded property that describes the subscription endpoints of an Amazon SNS topic.
    */
  var Subscription: js.UndefOr[AwsSnsTopicSubscriptionList] = js.native
  /**
    * The name of the topic.
    */
  var TopicName: js.UndefOr[NonEmptyString] = js.native
}

object AwsSnsTopicDetails {
  @scala.inline
  def apply(): AwsSnsTopicDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsSnsTopicDetails]
  }
  @scala.inline
  implicit class AwsSnsTopicDetailsOps[Self <: AwsSnsTopicDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKmsMasterKeyId(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KmsMasterKeyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKmsMasterKeyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KmsMasterKeyId")(js.undefined)
        ret
    }
    @scala.inline
    def withOwner(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Owner")(js.undefined)
        ret
    }
    @scala.inline
    def withSubscription(value: AwsSnsTopicSubscriptionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Subscription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubscription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Subscription")(js.undefined)
        ret
    }
    @scala.inline
    def withTopicName(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TopicName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopicName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TopicName")(js.undefined)
        ret
    }
  }
  
}

