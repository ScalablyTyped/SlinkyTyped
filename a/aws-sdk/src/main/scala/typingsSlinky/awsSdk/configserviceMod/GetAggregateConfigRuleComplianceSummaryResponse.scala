package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAggregateConfigRuleComplianceSummaryResponse extends js.Object {
  /**
    * Returns a list of AggregateComplianceCounts object.
    */
  var AggregateComplianceCounts: js.UndefOr[AggregateComplianceCountList] = js.native
  /**
    * Groups the result based on ACCOUNT_ID or AWS_REGION.
    */
  var GroupByKey: js.UndefOr[StringWithCharLimit256] = js.native
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.NextToken] = js.native
}

object GetAggregateConfigRuleComplianceSummaryResponse {
  @scala.inline
  def apply(): GetAggregateConfigRuleComplianceSummaryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAggregateConfigRuleComplianceSummaryResponse]
  }
  @scala.inline
  implicit class GetAggregateConfigRuleComplianceSummaryResponseOps[Self <: GetAggregateConfigRuleComplianceSummaryResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAggregateComplianceCounts(value: AggregateComplianceCountList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AggregateComplianceCounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAggregateComplianceCounts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AggregateComplianceCounts")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupByKey(value: StringWithCharLimit256): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupByKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupByKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupByKey")(js.undefined)
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

