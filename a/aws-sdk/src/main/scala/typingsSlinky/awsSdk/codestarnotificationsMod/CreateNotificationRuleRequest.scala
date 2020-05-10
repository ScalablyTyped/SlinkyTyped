package typingsSlinky.awsSdk.codestarnotificationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateNotificationRuleRequest extends js.Object {
  /**
    * A unique, client-generated idempotency token that, when provided in a request, ensures the request cannot be repeated with a changed parameter. If a request with the same parameters is received and a token is included, the request returns information about the initial request that used that token.  The AWS SDKs prepopulate client request tokens. If you are using an AWS SDK, an idempotency token is created for you. 
    */
  var ClientRequestToken: js.UndefOr[typingsSlinky.awsSdk.codestarnotificationsMod.ClientRequestToken] = js.native
  /**
    * The level of detail to include in the notifications for this resource. BASIC will include only the contents of the event as it would appear in AWS CloudWatch. FULL will include any supplemental information provided by AWS CodeStar Notifications and/or the service for the resource for which the notification is created.
    */
  var DetailType: typingsSlinky.awsSdk.codestarnotificationsMod.DetailType = js.native
  /**
    * A list of event types associated with this notification rule. For a list of allowed events, see EventTypeSummary.
    */
  var EventTypeIds: typingsSlinky.awsSdk.codestarnotificationsMod.EventTypeIds = js.native
  /**
    * The name for the notification rule. Notifictaion rule names must be unique in your AWS account.
    */
  var Name: NotificationRuleName = js.native
  /**
    * The Amazon Resource Name (ARN) of the resource to associate with the notification rule. Supported resources include pipelines in AWS CodePipeline, repositories in AWS CodeCommit, and build projects in AWS CodeBuild.
    */
  var Resource: NotificationRuleResource = js.native
  /**
    * The status of the notification rule. The default value is ENABLED. If the status is set to DISABLED, notifications aren't sent for the notification rule.
    */
  var Status: js.UndefOr[NotificationRuleStatus] = js.native
  /**
    * A list of tags to apply to this notification rule. Key names cannot start with "aws". 
    */
  var Tags: js.UndefOr[typingsSlinky.awsSdk.codestarnotificationsMod.Tags] = js.native
  /**
    * A list of Amazon Resource Names (ARNs) of SNS topics to associate with the notification rule.
    */
  var Targets: typingsSlinky.awsSdk.codestarnotificationsMod.Targets = js.native
}

object CreateNotificationRuleRequest {
  @scala.inline
  def apply(
    DetailType: DetailType,
    EventTypeIds: EventTypeIds,
    Name: NotificationRuleName,
    Resource: NotificationRuleResource,
    Targets: Targets
  ): CreateNotificationRuleRequest = {
    val __obj = js.Dynamic.literal(DetailType = DetailType.asInstanceOf[js.Any], EventTypeIds = EventTypeIds.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Resource = Resource.asInstanceOf[js.Any], Targets = Targets.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateNotificationRuleRequest]
  }
  @scala.inline
  implicit class CreateNotificationRuleRequestOps[Self <: CreateNotificationRuleRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDetailType(value: DetailType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DetailType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventTypeIds(value: EventTypeIds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventTypeIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: NotificationRuleName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResource(value: NotificationRuleResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Resource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargets(value: Targets): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Targets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientRequestToken(value: ClientRequestToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientRequestToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientRequestToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientRequestToken")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: NotificationRuleStatus): Self = {
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
    def withTags(value: Tags): Self = {
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

