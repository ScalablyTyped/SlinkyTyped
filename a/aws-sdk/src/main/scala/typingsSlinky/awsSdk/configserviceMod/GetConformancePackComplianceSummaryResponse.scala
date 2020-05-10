package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetConformancePackComplianceSummaryResponse extends js.Object {
  /**
    * A list of ConformancePackComplianceSummary objects. 
    */
  var ConformancePackComplianceSummaryList: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.ConformancePackComplianceSummaryList] = js.native
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.NextToken] = js.native
}

object GetConformancePackComplianceSummaryResponse {
  @scala.inline
  def apply(): GetConformancePackComplianceSummaryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetConformancePackComplianceSummaryResponse]
  }
  @scala.inline
  implicit class GetConformancePackComplianceSummaryResponseOps[Self <: GetConformancePackComplianceSummaryResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConformancePackComplianceSummaryList(value: ConformancePackComplianceSummaryList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConformancePackComplianceSummaryList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConformancePackComplianceSummaryList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConformancePackComplianceSummaryList")(js.undefined)
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

