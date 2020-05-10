package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAggregateComplianceDetailsByConfigRuleResponse extends js.Object {
  /**
    * Returns an AggregateEvaluationResults object.
    */
  var AggregateEvaluationResults: js.UndefOr[AggregateEvaluationResultList] = js.native
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.NextToken] = js.native
}

object GetAggregateComplianceDetailsByConfigRuleResponse {
  @scala.inline
  def apply(): GetAggregateComplianceDetailsByConfigRuleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAggregateComplianceDetailsByConfigRuleResponse]
  }
  @scala.inline
  implicit class GetAggregateComplianceDetailsByConfigRuleResponseOps[Self <: GetAggregateComplianceDetailsByConfigRuleResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAggregateEvaluationResults(value: AggregateEvaluationResultList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AggregateEvaluationResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAggregateEvaluationResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AggregateEvaluationResults")(js.undefined)
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

