package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetJobsRequest extends js.Object {
  /**
    * A list of job names, which might be the names returned from the ListJobs operation.
    */
  var JobNames: JobNameList = js.native
}

object BatchGetJobsRequest {
  @scala.inline
  def apply(JobNames: JobNameList): BatchGetJobsRequest = {
    val __obj = js.Dynamic.literal(JobNames = JobNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetJobsRequest]
  }
  @scala.inline
  implicit class BatchGetJobsRequestOps[Self <: BatchGetJobsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJobNames(value: JobNameList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobNames")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

