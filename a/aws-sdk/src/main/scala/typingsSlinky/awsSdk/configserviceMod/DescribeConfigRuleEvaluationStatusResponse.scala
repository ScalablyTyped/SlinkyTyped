package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeConfigRuleEvaluationStatusResponse extends js.Object {
  /**
    * Status information about your AWS managed Config rules.
    */
  var ConfigRulesEvaluationStatus: js.UndefOr[ConfigRuleEvaluationStatusList] = js.native
  /**
    * The string that you use in a subsequent request to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object DescribeConfigRuleEvaluationStatusResponse {
  @scala.inline
  def apply(): DescribeConfigRuleEvaluationStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeConfigRuleEvaluationStatusResponse]
  }
  @scala.inline
  implicit class DescribeConfigRuleEvaluationStatusResponseOps[Self <: DescribeConfigRuleEvaluationStatusResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfigRulesEvaluationStatus(value: ConfigRuleEvaluationStatusList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigRulesEvaluationStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigRulesEvaluationStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigRulesEvaluationStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: String): Self = {
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

