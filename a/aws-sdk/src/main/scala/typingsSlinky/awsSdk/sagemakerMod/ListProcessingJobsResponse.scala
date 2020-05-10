package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListProcessingJobsResponse extends js.Object {
  /**
    * If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of processing jobs, use it in the subsequent request.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.NextToken] = js.native
  /**
    * An array of ProcessingJobSummary objects, each listing a processing job.
    */
  var ProcessingJobSummaries: typingsSlinky.awsSdk.sagemakerMod.ProcessingJobSummaries = js.native
}

object ListProcessingJobsResponse {
  @scala.inline
  def apply(ProcessingJobSummaries: ProcessingJobSummaries): ListProcessingJobsResponse = {
    val __obj = js.Dynamic.literal(ProcessingJobSummaries = ProcessingJobSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListProcessingJobsResponse]
  }
  @scala.inline
  implicit class ListProcessingJobsResponseOps[Self <: ListProcessingJobsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProcessingJobSummaries(value: ProcessingJobSummaries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProcessingJobSummaries")(value.asInstanceOf[js.Any])
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

