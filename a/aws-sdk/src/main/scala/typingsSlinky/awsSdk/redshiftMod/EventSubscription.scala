package typingsSlinky.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventSubscription extends js.Object {
  /**
    * The name of the Amazon Redshift event notification subscription.
    */
  var CustSubscriptionId: js.UndefOr[String] = js.native
  /**
    * The AWS customer account associated with the Amazon Redshift event notification subscription.
    */
  var CustomerAwsId: js.UndefOr[String] = js.native
  /**
    * A boolean value indicating whether the subscription is enabled; true indicates that the subscription is enabled.
    */
  var Enabled: js.UndefOr[Boolean] = js.native
  /**
    * The list of Amazon Redshift event categories specified in the event notification subscription. Values: Configuration, Management, Monitoring, Security
    */
  var EventCategoriesList: js.UndefOr[typingsSlinky.awsSdk.redshiftMod.EventCategoriesList] = js.native
  /**
    * The event severity specified in the Amazon Redshift event notification subscription. Values: ERROR, INFO
    */
  var Severity: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) of the Amazon SNS topic used by the event notification subscription.
    */
  var SnsTopicArn: js.UndefOr[String] = js.native
  /**
    * A list of the sources that publish events to the Amazon Redshift event notification subscription.
    */
  var SourceIdsList: js.UndefOr[typingsSlinky.awsSdk.redshiftMod.SourceIdsList] = js.native
  /**
    * The source type of the events returned by the Amazon Redshift event notification, such as cluster, cluster-snapshot, cluster-parameter-group, cluster-security-group, or scheduled-action. 
    */
  var SourceType: js.UndefOr[String] = js.native
  /**
    * The status of the Amazon Redshift event notification subscription. Constraints:   Can be one of the following: active | no-permission | topic-not-exist   The status "no-permission" indicates that Amazon Redshift no longer has permission to post to the Amazon SNS topic. The status "topic-not-exist" indicates that the topic was deleted after the subscription was created.  
    */
  var Status: js.UndefOr[String] = js.native
  /**
    * The date and time the Amazon Redshift event notification subscription was created.
    */
  var SubscriptionCreationTime: js.UndefOr[js.Date] = js.native
  /**
    * The list of tags for the event subscription.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object EventSubscription {
  @scala.inline
  def apply(): EventSubscription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventSubscription]
  }
  @scala.inline
  implicit class EventSubscriptionOps[Self <: EventSubscription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustSubscriptionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustSubscriptionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustSubscriptionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustSubscriptionId")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomerAwsId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomerAwsId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomerAwsId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomerAwsId")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withEventCategoriesList(value: EventCategoriesList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventCategoriesList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventCategoriesList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventCategoriesList")(js.undefined)
        ret
    }
    @scala.inline
    def withSeverity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Severity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeverity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Severity")(js.undefined)
        ret
    }
    @scala.inline
    def withSnsTopicArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnsTopicArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnsTopicArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnsTopicArn")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceIdsList(value: SourceIdsList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceIdsList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceIdsList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceIdsList")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceType")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
    @scala.inline
    def withSubscriptionCreationTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubscriptionCreationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubscriptionCreationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubscriptionCreationTime")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
  }
  
}

