package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchStopJobRunRequest extends js.Object {
  /**
    * The name of the job definition for which to stop job runs.
    */
  var JobName: NameString = js.native
  /**
    * A list of the JobRunIds that should be stopped for that job definition.
    */
  var JobRunIds: BatchStopJobRunJobRunIdList = js.native
}

object BatchStopJobRunRequest {
  @scala.inline
  def apply(JobName: NameString, JobRunIds: BatchStopJobRunJobRunIdList): BatchStopJobRunRequest = {
    val __obj = js.Dynamic.literal(JobName = JobName.asInstanceOf[js.Any], JobRunIds = JobRunIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchStopJobRunRequest]
  }
  @scala.inline
  implicit class BatchStopJobRunRequestOps[Self <: BatchStopJobRunRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJobName(value: NameString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJobRunIds(value: BatchStopJobRunJobRunIdList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobRunIds")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

