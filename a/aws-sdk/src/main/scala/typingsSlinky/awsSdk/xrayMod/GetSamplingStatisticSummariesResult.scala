package typingsSlinky.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSamplingStatisticSummariesResult extends js.Object {
  /**
    * Pagination token.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * Information about the number of requests instrumented for each sampling rule.
    */
  var SamplingStatisticSummaries: js.UndefOr[SamplingStatisticSummaryList] = js.native
}

object GetSamplingStatisticSummariesResult {
  @scala.inline
  def apply(): GetSamplingStatisticSummariesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSamplingStatisticSummariesResult]
  }
  @scala.inline
  implicit class GetSamplingStatisticSummariesResultOps[Self <: GetSamplingStatisticSummariesResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withSamplingStatisticSummaries(value: SamplingStatisticSummaryList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SamplingStatisticSummaries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSamplingStatisticSummaries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SamplingStatisticSummaries")(js.undefined)
        ret
    }
  }
  
}

