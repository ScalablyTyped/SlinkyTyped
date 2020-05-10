package typingsSlinky.awsSdk.stepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetActivityTaskOutput extends js.Object {
  /**
    * The string that contains the JSON input data for the task.
    */
  var input: js.UndefOr[SensitiveDataJobInput] = js.native
  /**
    * A token that identifies the scheduled task. This token must be copied and included in subsequent calls to SendTaskHeartbeat, SendTaskSuccess or SendTaskFailure in order to report the progress or completion of the task.
    */
  var taskToken: js.UndefOr[TaskToken] = js.native
}

object GetActivityTaskOutput {
  @scala.inline
  def apply(): GetActivityTaskOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetActivityTaskOutput]
  }
  @scala.inline
  implicit class GetActivityTaskOutputOps[Self <: GetActivityTaskOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInput(value: SensitiveDataJobInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(js.undefined)
        ret
    }
    @scala.inline
    def withTaskToken(value: TaskToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaskToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskToken")(js.undefined)
        ret
    }
  }
  
}

