package typingsSlinky.awsSdk.cloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutTargetsRequest extends js.Object {
  /**
    * The name of the event bus associated with the rule. If you omit this, the default event bus is used.
    */
  var EventBusName: js.UndefOr[typingsSlinky.awsSdk.cloudwatcheventsMod.EventBusName] = js.native
  /**
    * The name of the rule.
    */
  var Rule: RuleName = js.native
  /**
    * The targets to update or add to the rule.
    */
  var Targets: TargetList = js.native
}

object PutTargetsRequest {
  @scala.inline
  def apply(Rule: RuleName, Targets: TargetList): PutTargetsRequest = {
    val __obj = js.Dynamic.literal(Rule = Rule.asInstanceOf[js.Any], Targets = Targets.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutTargetsRequest]
  }
  @scala.inline
  implicit class PutTargetsRequestOps[Self <: PutTargetsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRule(value: RuleName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Rule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargets(value: TargetList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Targets")(value.asInstanceOf[js.Any])
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
  }
  
}

