package typingsSlinky.awsSdk.codestarnotificationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateNotificationRuleRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the notification rule.
    */
  var Arn: NotificationRuleArn = js.native
  /**
    * The level of detail to include in the notifications for this resource. BASIC will include only the contents of the event as it would appear in AWS CloudWatch. FULL will include any supplemental information provided by AWS CodeStar Notifications and/or the service for the resource for which the notification is created.
    */
  var DetailType: js.UndefOr[typingsSlinky.awsSdk.codestarnotificationsMod.DetailType] = js.native
  /**
    * A list of event types associated with this notification rule.
    */
  var EventTypeIds: js.UndefOr[typingsSlinky.awsSdk.codestarnotificationsMod.EventTypeIds] = js.native
  /**
    * The name of the notification rule.
    */
  var Name: js.UndefOr[NotificationRuleName] = js.native
  /**
    * The status of the notification rule. Valid statuses include enabled (sending notifications) or disabled (not sending notifications).
    */
  var Status: js.UndefOr[NotificationRuleStatus] = js.native
  /**
    * The address and type of the targets to receive notifications from this notification rule.
    */
  var Targets: js.UndefOr[typingsSlinky.awsSdk.codestarnotificationsMod.Targets] = js.native
}

object UpdateNotificationRuleRequest {
  @scala.inline
  def apply(Arn: NotificationRuleArn): UpdateNotificationRuleRequest = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateNotificationRuleRequest]
  }
  @scala.inline
  implicit class UpdateNotificationRuleRequestOps[Self <: UpdateNotificationRuleRequest] (val x: Self) extends AnyVal {
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
    def withEventTypeIds(value: EventTypeIds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventTypeIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventTypeIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventTypeIds")(js.undefined)
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
    def withTargets(value: Targets): Self = {
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

