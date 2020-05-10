package typingsSlinky.awsSdk.iotjobsdataplaneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateJobExecutionResponse extends js.Object {
  /**
    * A JobExecutionState object.
    */
  var executionState: js.UndefOr[JobExecutionState] = js.native
  /**
    * The contents of the Job Documents.
    */
  var jobDocument: js.UndefOr[JobDocument] = js.native
}

object UpdateJobExecutionResponse {
  @scala.inline
  def apply(): UpdateJobExecutionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateJobExecutionResponse]
  }
  @scala.inline
  implicit class UpdateJobExecutionResponseOps[Self <: UpdateJobExecutionResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExecutionState(value: JobExecutionState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecutionState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionState")(js.undefined)
        ret
    }
    @scala.inline
    def withJobDocument(value: JobDocument): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobDocument")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobDocument: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobDocument")(js.undefined)
        ret
    }
  }
  
}

