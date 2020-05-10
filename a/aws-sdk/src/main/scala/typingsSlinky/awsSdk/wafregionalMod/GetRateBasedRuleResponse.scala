package typingsSlinky.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRateBasedRuleResponse extends js.Object {
  /**
    * Information about the RateBasedRule that you specified in the GetRateBasedRule request.
    */
  var Rule: js.UndefOr[RateBasedRule] = js.native
}

object GetRateBasedRuleResponse {
  @scala.inline
  def apply(): GetRateBasedRuleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRateBasedRuleResponse]
  }
  @scala.inline
  implicit class GetRateBasedRuleResponseOps[Self <: GetRateBasedRuleResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRule(value: RateBasedRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Rule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Rule")(js.undefined)
        ret
    }
  }
  
}

