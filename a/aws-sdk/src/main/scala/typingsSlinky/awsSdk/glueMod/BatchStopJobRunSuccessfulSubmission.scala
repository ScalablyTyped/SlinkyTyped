package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchStopJobRunSuccessfulSubmission extends js.Object {
  /**
    * The name of the job definition used in the job run that was stopped.
    */
  var JobName: js.UndefOr[NameString] = js.native
  /**
    * The JobRunId of the job run that was stopped.
    */
  var JobRunId: js.UndefOr[IdString] = js.native
}

object BatchStopJobRunSuccessfulSubmission {
  @scala.inline
  def apply(): BatchStopJobRunSuccessfulSubmission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchStopJobRunSuccessfulSubmission]
  }
  @scala.inline
  implicit class BatchStopJobRunSuccessfulSubmissionOps[Self <: BatchStopJobRunSuccessfulSubmission] (val x: Self) extends AnyVal {
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
    def withoutJobName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobName")(js.undefined)
        ret
    }
    @scala.inline
    def withJobRunId(value: IdString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobRunId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobRunId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobRunId")(js.undefined)
        ret
    }
  }
  
}

