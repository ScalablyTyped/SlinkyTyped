package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeConformancePackComplianceResponse extends js.Object {
  /**
    * Name of the conformance pack.
    */
  var ConformancePackName: typingsSlinky.awsSdk.configserviceMod.ConformancePackName = js.native
  /**
    * Returns a list of ConformancePackRuleCompliance objects.
    */
  var ConformancePackRuleComplianceList: typingsSlinky.awsSdk.configserviceMod.ConformancePackRuleComplianceList = js.native
  /**
    * The nextToken string returned in a previous request that you use to request the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.NextToken] = js.native
}

object DescribeConformancePackComplianceResponse {
  @scala.inline
  def apply(
    ConformancePackName: ConformancePackName,
    ConformancePackRuleComplianceList: ConformancePackRuleComplianceList
  ): DescribeConformancePackComplianceResponse = {
    val __obj = js.Dynamic.literal(ConformancePackName = ConformancePackName.asInstanceOf[js.Any], ConformancePackRuleComplianceList = ConformancePackRuleComplianceList.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeConformancePackComplianceResponse]
  }
  @scala.inline
  implicit class DescribeConformancePackComplianceResponseOps[Self <: DescribeConformancePackComplianceResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConformancePackName(value: ConformancePackName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConformancePackName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConformancePackRuleComplianceList(value: ConformancePackRuleComplianceList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConformancePackRuleComplianceList")(value.asInstanceOf[js.Any])
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

