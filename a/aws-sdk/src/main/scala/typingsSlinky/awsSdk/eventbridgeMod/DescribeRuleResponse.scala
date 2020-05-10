package typingsSlinky.awsSdk.eventbridgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeRuleResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the rule.
    */
  var Arn: js.UndefOr[RuleArn] = js.native
  /**
    * The description of the rule.
    */
  var Description: js.UndefOr[RuleDescription] = js.native
  /**
    * The event bus associated with the rule.
    */
  var EventBusName: js.UndefOr[typingsSlinky.awsSdk.eventbridgeMod.EventBusName] = js.native
  /**
    * The event pattern. For more information, see Events and Event Patterns in the Amazon EventBridge User Guide.
    */
  var EventPattern: js.UndefOr[typingsSlinky.awsSdk.eventbridgeMod.EventPattern] = js.native
  /**
    * If this is a managed rule, created by an AWS service on your behalf, this field displays the principal name of the AWS service that created the rule.
    */
  var ManagedBy: js.UndefOr[typingsSlinky.awsSdk.eventbridgeMod.ManagedBy] = js.native
  /**
    * The name of the rule.
    */
  var Name: js.UndefOr[RuleName] = js.native
  /**
    * The Amazon Resource Name (ARN) of the IAM role associated with the rule.
    */
  var RoleArn: js.UndefOr[typingsSlinky.awsSdk.eventbridgeMod.RoleArn] = js.native
  /**
    * The scheduling expression. For example, "cron(0 20 * * ? *)", "rate(5 minutes)".
    */
  var ScheduleExpression: js.UndefOr[typingsSlinky.awsSdk.eventbridgeMod.ScheduleExpression] = js.native
  /**
    * Specifies whether the rule is enabled or disabled.
    */
  var State: js.UndefOr[RuleState] = js.native
}

object DescribeRuleResponse {
  @scala.inline
  def apply(): DescribeRuleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRuleResponse]
  }
  @scala.inline
  implicit class DescribeRuleResponseOps[Self <: DescribeRuleResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: RuleArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: RuleDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withEventBusName(value: EventBusName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventBusName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventBusName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventBusName")(js.undefined)
        ret
    }
    @scala.inline
    def withEventPattern(value: EventPattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventPattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventPattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventPattern")(js.undefined)
        ret
    }
    @scala.inline
    def withManagedBy(value: ManagedBy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ManagedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManagedBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ManagedBy")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: RuleName): Self = {
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
    def withRoleArn(value: RoleArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoleArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleArn")(js.undefined)
        ret
    }
    @scala.inline
    def withScheduleExpression(value: ScheduleExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScheduleExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScheduleExpression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScheduleExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: RuleState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(js.undefined)
        ret
    }
  }
  
}

