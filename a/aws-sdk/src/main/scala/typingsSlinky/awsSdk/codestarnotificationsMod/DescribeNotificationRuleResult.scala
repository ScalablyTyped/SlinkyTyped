package typingsSlinky.awsSdk.codestarnotificationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeNotificationRuleResult extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the notification rule.
    */
  var Arn: NotificationRuleArn = js.native
  /**
    * The name or email alias of the person who created the notification rule.
    */
  var CreatedBy: js.UndefOr[NotificationRuleCreatedBy] = js.native
  /**
    * The date and time the notification rule was created, in timestamp format.
    */
  var CreatedTimestamp: js.UndefOr[js.Date] = js.native
  /**
    * The level of detail included in the notifications for this resource. BASIC will include only the contents of the event as it would appear in AWS CloudWatch. FULL will include any supplemental information provided by AWS CodeStar Notifications and/or the service for the resource for which the notification is created.
    */
  var DetailType: js.UndefOr[typingsSlinky.awsSdk.codestarnotificationsMod.DetailType] = js.native
  /**
    * A list of the event types associated with the notification rule.
    */
  var EventTypes: js.UndefOr[EventTypeBatch] = js.native
  /**
    * The date and time the notification rule was most recently updated, in timestamp format.
    */
  var LastModifiedTimestamp: js.UndefOr[js.Date] = js.native
  /**
    * The name of the notification rule.
    */
  var Name: js.UndefOr[NotificationRuleName] = js.native
  /**
    * The Amazon Resource Name (ARN) of the resource associated with the notification rule.
    */
  var Resource: js.UndefOr[NotificationRuleResource] = js.native
  /**
    * The status of the notification rule. Valid statuses are on (sending notifications) or off (not sending notifications).
    */
  var Status: js.UndefOr[NotificationRuleStatus] = js.native
  /**
    * The tags associated with the notification rule.
    */
  var Tags: js.UndefOr[typingsSlinky.awsSdk.codestarnotificationsMod.Tags] = js.native
  /**
    * A list of the SNS topics associated with the notification rule.
    */
  var Targets: js.UndefOr[TargetsBatch] = js.native
}

object DescribeNotificationRuleResult {
  @scala.inline
  def apply(Arn: NotificationRuleArn): DescribeNotificationRuleResult = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeNotificationRuleResult]
  }
  @scala.inline
  implicit class DescribeNotificationRuleResultOps[Self <: DescribeNotificationRuleResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: NotificationRuleArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreatedBy(value: NotificationRuleCreatedBy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedBy")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedTimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withDetailType(value: DetailType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DetailType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetailType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DetailType")(js.undefined)
        ret
    }
    @scala.inline
    def withEventTypes(value: EventTypeBatch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withLastModifiedTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModifiedTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModifiedTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModifiedTimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: NotificationRuleName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withResource(value: NotificationRuleResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Resource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Resource")(js.undefined)
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
    @scala.inline
    def withTargets(value: TargetsBatch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Targets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Targets")(js.undefined)
        ret
    }
  }
  
}

