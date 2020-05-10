package typingsSlinky.awsSdk.cloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTargetsByRuleRequest extends js.Object {
  /**
    * The event bus associated with the rule. If you omit this, the default event bus is used.
    */
  var EventBusName: js.UndefOr[typingsSlinky.awsSdk.cloudwatcheventsMod.EventBusName] = js.native
  /**
    * The maximum number of results to return.
    */
  var Limit: js.UndefOr[LimitMax100] = js.native
  /**
    * The token returned by a previous call to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.cloudwatcheventsMod.NextToken] = js.native
  /**
    * The name of the rule.
    */
  var Rule: RuleName = js.native
}

object ListTargetsByRuleRequest {
  @scala.inline
  def apply(Rule: RuleName): ListTargetsByRuleRequest = {
    val __obj = js.Dynamic.literal(Rule = Rule.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTargetsByRuleRequest]
  }
  @scala.inline
  implicit class ListTargetsByRuleRequestOps[Self <: ListTargetsByRuleRequest] (val x: Self) extends AnyVal {
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
    def withLimit(value: LimitMax100): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Limit")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: NextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
  }
  
}

