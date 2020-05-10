package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTrainingJobsResponse extends js.Object {
  /**
    * If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of training jobs, use it in the subsequent request.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.NextToken] = js.native
  /**
    * An array of TrainingJobSummary objects, each listing a training job.
    */
  var TrainingJobSummaries: typingsSlinky.awsSdk.sagemakerMod.TrainingJobSummaries = js.native
}

object ListTrainingJobsResponse {
  @scala.inline
  def apply(TrainingJobSummaries: TrainingJobSummaries): ListTrainingJobsResponse = {
    val __obj = js.Dynamic.literal(TrainingJobSummaries = TrainingJobSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTrainingJobsResponse]
  }
  @scala.inline
  implicit class ListTrainingJobsResponseOps[Self <: ListTrainingJobsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTrainingJobSummaries(value: TrainingJobSummaries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrainingJobSummaries")(value.asInstanceOf[js.Any])
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

