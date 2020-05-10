package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartConfigRulesEvaluationRequest extends js.Object {
  /**
    * The list of names of AWS Config rules that you want to run evaluations for.
    */
  var ConfigRuleNames: js.UndefOr[ReevaluateConfigRuleNames] = js.native
}

object StartConfigRulesEvaluationRequest {
  @scala.inline
  def apply(): StartConfigRulesEvaluationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartConfigRulesEvaluationRequest]
  }
  @scala.inline
  implicit class StartConfigRulesEvaluationRequestOps[Self <: StartConfigRulesEvaluationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfigRuleNames(value: ReevaluateConfigRuleNames): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigRuleNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigRuleNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigRuleNames")(js.undefined)
        ret
    }
  }
  
}

