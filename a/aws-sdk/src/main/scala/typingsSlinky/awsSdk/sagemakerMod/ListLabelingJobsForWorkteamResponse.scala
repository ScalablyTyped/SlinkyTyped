package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListLabelingJobsForWorkteamResponse extends js.Object {
  /**
    * An array of LabelingJobSummary objects, each describing a labeling job.
    */
  var LabelingJobSummaryList: LabelingJobForWorkteamSummaryList = js.native
  /**
    * If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of labeling jobs, use it in the subsequent request.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.NextToken] = js.native
}

object ListLabelingJobsForWorkteamResponse {
  @scala.inline
  def apply(LabelingJobSummaryList: LabelingJobForWorkteamSummaryList): ListLabelingJobsForWorkteamResponse = {
    val __obj = js.Dynamic.literal(LabelingJobSummaryList = LabelingJobSummaryList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListLabelingJobsForWorkteamResponse]
  }
  @scala.inline
  implicit class ListLabelingJobsForWorkteamResponseOps[Self <: ListLabelingJobsForWorkteamResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLabelingJobSummaryList(value: LabelingJobForWorkteamSummaryList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LabelingJobSummaryList")(value.asInstanceOf[js.Any])
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

