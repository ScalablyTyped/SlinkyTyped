package typingsSlinky.awsSdk.cloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnableRuleRequest extends js.Object {
  /**
    * The event bus associated with the rule. If you omit this, the default event bus is used.
    */
  var EventBusName: js.UndefOr[typingsSlinky.awsSdk.cloudwatcheventsMod.EventBusName] = js.native
  /**
    * The name of the rule.
    */
  var Name: RuleName = js.native
}

object EnableRuleRequest {
  @scala.inline
  def apply(Name: RuleName): EnableRuleRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableRuleRequest]
  }
  @scala.inline
  implicit class EnableRuleRequestOps[Self <: EnableRuleRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: RuleName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
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

