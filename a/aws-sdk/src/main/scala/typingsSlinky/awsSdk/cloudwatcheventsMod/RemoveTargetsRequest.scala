package typingsSlinky.awsSdk.cloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveTargetsRequest extends js.Object {
  /**
    * The name of the event bus associated with the rule.
    */
  var EventBusName: js.UndefOr[typingsSlinky.awsSdk.cloudwatcheventsMod.EventBusName] = js.native
  /**
    * If this is a managed rule, created by an AWS service on your behalf, you must specify Force as True to remove targets. This parameter is ignored for rules that are not managed rules. You can check whether a rule is a managed rule by using DescribeRule or ListRules and checking the ManagedBy field of the response.
    */
  var Force: js.UndefOr[Boolean] = js.native
  /**
    * The IDs of the targets to remove from the rule.
    */
  var Ids: TargetIdList = js.native
  /**
    * The name of the rule.
    */
  var Rule: RuleName = js.native
}

object RemoveTargetsRequest {
  @scala.inline
  def apply(Ids: TargetIdList, Rule: RuleName): RemoveTargetsRequest = {
    val __obj = js.Dynamic.literal(Ids = Ids.asInstanceOf[js.Any], Rule = Rule.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveTargetsRequest]
  }
  @scala.inline
  implicit class RemoveTargetsRequestOps[Self <: RemoveTargetsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIds(value: TargetIdList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRule(value: RuleName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Rule")(value.asInstanceOf[js.Any])
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
    def withForce(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Force")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Force")(js.undefined)
        ret
    }
  }
  
}

