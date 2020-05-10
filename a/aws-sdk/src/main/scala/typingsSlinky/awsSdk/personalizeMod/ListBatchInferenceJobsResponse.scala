package typingsSlinky.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListBatchInferenceJobsResponse extends js.Object {
  /**
    * A list containing information on each job that is returned.
    */
  var batchInferenceJobs: js.UndefOr[BatchInferenceJobs] = js.native
  /**
    * The token to use to retreive the next page of results. The value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListBatchInferenceJobsResponse {
  @scala.inline
  def apply(): ListBatchInferenceJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBatchInferenceJobsResponse]
  }
  @scala.inline
  implicit class ListBatchInferenceJobsResponseOps[Self <: ListBatchInferenceJobsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBatchInferenceJobs(value: BatchInferenceJobs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchInferenceJobs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBatchInferenceJobs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchInferenceJobs")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: NextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(js.undefined)
        ret
    }
  }
  
}

