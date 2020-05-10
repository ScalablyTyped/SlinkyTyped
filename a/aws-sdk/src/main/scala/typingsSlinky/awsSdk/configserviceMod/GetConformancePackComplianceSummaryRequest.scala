package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetConformancePackComplianceSummaryRequest extends js.Object {
  /**
    * Names of conformance packs.
    */
  var ConformancePackNames: ConformancePackNamesToSummarizeList = js.native
  /**
    * The maximum number of conformance packs returned on each page.
    */
  var Limit: js.UndefOr[PageSizeLimit] = js.native
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.NextToken] = js.native
}

object GetConformancePackComplianceSummaryRequest {
  @scala.inline
  def apply(ConformancePackNames: ConformancePackNamesToSummarizeList): GetConformancePackComplianceSummaryRequest = {
    val __obj = js.Dynamic.literal(ConformancePackNames = ConformancePackNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetConformancePackComplianceSummaryRequest]
  }
  @scala.inline
  implicit class GetConformancePackComplianceSummaryRequestOps[Self <: GetConformancePackComplianceSummaryRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConformancePackNames(value: ConformancePackNamesToSummarizeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConformancePackNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLimit(value: PageSizeLimit): Self = {
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

