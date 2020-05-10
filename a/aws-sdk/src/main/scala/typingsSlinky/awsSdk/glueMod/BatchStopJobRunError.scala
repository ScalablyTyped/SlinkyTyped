package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchStopJobRunError extends js.Object {
  /**
    * Specifies details about the error that was encountered.
    */
  var ErrorDetail: js.UndefOr[typingsSlinky.awsSdk.glueMod.ErrorDetail] = js.native
  /**
    * The name of the job definition that is used in the job run in question.
    */
  var JobName: js.UndefOr[NameString] = js.native
  /**
    * The JobRunId of the job run in question.
    */
  var JobRunId: js.UndefOr[IdString] = js.native
}

object BatchStopJobRunError {
  @scala.inline
  def apply(): BatchStopJobRunError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchStopJobRunError]
  }
  @scala.inline
  implicit class BatchStopJobRunErrorOps[Self <: BatchStopJobRunError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorDetail(value: ErrorDetail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorDetail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorDetail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorDetail")(js.undefined)
        ret
    }
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

