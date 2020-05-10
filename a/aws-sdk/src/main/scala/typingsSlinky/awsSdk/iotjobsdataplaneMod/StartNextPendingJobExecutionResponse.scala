package typingsSlinky.awsSdk.iotjobsdataplaneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartNextPendingJobExecutionResponse extends js.Object {
  /**
    * A JobExecution object.
    */
  var execution: js.UndefOr[JobExecution] = js.native
}

object StartNextPendingJobExecutionResponse {
  @scala.inline
  def apply(): StartNextPendingJobExecutionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartNextPendingJobExecutionResponse]
  }
  @scala.inline
  implicit class StartNextPendingJobExecutionResponseOps[Self <: StartNextPendingJobExecutionResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExecution(value: JobExecution): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execution")(js.undefined)
        ret
    }
  }
  
}

