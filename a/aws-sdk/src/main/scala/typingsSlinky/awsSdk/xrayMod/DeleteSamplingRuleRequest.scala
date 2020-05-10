package typingsSlinky.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteSamplingRuleRequest extends js.Object {
  /**
    * The ARN of the sampling rule. Specify a rule by either name or ARN, but not both.
    */
  var RuleARN: js.UndefOr[String] = js.native
  /**
    * The name of the sampling rule. Specify a rule by either name or ARN, but not both.
    */
  var RuleName: js.UndefOr[String] = js.native
}

object DeleteSamplingRuleRequest {
  @scala.inline
  def apply(): DeleteSamplingRuleRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteSamplingRuleRequest]
  }
  @scala.inline
  implicit class DeleteSamplingRuleRequestOps[Self <: DeleteSamplingRuleRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRuleARN(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RuleARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRuleARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RuleARN")(js.undefined)
        ret
    }
    @scala.inline
    def withRuleName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RuleName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRuleName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RuleName")(js.undefined)
        ret
    }
  }
  
}

