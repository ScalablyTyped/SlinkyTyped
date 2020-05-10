package typingsSlinky.awsSdk.iotjobsdataplaneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPendingJobExecutionsResponse extends js.Object {
  /**
    * A list of JobExecutionSummary objects with status IN_PROGRESS.
    */
  var inProgressJobs: js.UndefOr[JobExecutionSummaryList] = js.native
  /**
    * A list of JobExecutionSummary objects with status QUEUED.
    */
  var queuedJobs: js.UndefOr[JobExecutionSummaryList] = js.native
}

object GetPendingJobExecutionsResponse {
  @scala.inline
  def apply(): GetPendingJobExecutionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPendingJobExecutionsResponse]
  }
  @scala.inline
  implicit class GetPendingJobExecutionsResponseOps[Self <: GetPendingJobExecutionsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInProgressJobs(value: JobExecutionSummaryList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inProgressJobs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInProgressJobs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inProgressJobs")(js.undefined)
        ret
    }
    @scala.inline
    def withQueuedJobs(value: JobExecutionSummaryList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queuedJobs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueuedJobs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queuedJobs")(js.undefined)
        ret
    }
  }
  
}

