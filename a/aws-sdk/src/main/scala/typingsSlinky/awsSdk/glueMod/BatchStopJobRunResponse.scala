package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchStopJobRunResponse extends js.Object {
  /**
    * A list of the errors that were encountered in trying to stop JobRuns, including the JobRunId for which each error was encountered and details about the error.
    */
  var Errors: js.UndefOr[BatchStopJobRunErrorList] = js.native
  /**
    * A list of the JobRuns that were successfully submitted for stopping.
    */
  var SuccessfulSubmissions: js.UndefOr[BatchStopJobRunSuccessfulSubmissionList] = js.native
}

object BatchStopJobRunResponse {
  @scala.inline
  def apply(): BatchStopJobRunResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchStopJobRunResponse]
  }
  @scala.inline
  implicit class BatchStopJobRunResponseOps[Self <: BatchStopJobRunResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrors(value: BatchStopJobRunErrorList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Errors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Errors")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccessfulSubmissions(value: BatchStopJobRunSuccessfulSubmissionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SuccessfulSubmissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuccessfulSubmissions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SuccessfulSubmissions")(js.undefined)
        ret
    }
  }
  
}

