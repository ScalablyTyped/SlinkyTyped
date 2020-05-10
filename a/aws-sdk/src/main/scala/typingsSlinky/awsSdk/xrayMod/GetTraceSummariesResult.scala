package typingsSlinky.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTraceSummariesResult extends js.Object {
  /**
    * The start time of this page of results.
    */
  var ApproximateTime: js.UndefOr[js.Date] = js.native
  /**
    * If the requested time frame contained more than one page of results, you can use this token to retrieve the next page. The first page contains the most most recent results, closest to the end of the time frame.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * Trace IDs and annotations for traces that were found in the specified time frame.
    */
  var TraceSummaries: js.UndefOr[TraceSummaryList] = js.native
  /**
    * The total number of traces processed, including traces that did not match the specified filter expression.
    */
  var TracesProcessedCount: js.UndefOr[NullableLong] = js.native
}

object GetTraceSummariesResult {
  @scala.inline
  def apply(): GetTraceSummariesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTraceSummariesResult]
  }
  @scala.inline
  implicit class GetTraceSummariesResultOps[Self <: GetTraceSummariesResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApproximateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApproximateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApproximateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApproximateTime")(js.undefined)
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
    @scala.inline
    def withTraceSummaries(value: TraceSummaryList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TraceSummaries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTraceSummaries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TraceSummaries")(js.undefined)
        ret
    }
    @scala.inline
    def withTracesProcessedCount(value: NullableLong): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TracesProcessedCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTracesProcessedCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TracesProcessedCount")(js.undefined)
        ret
    }
  }
  
}

