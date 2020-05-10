package typingsSlinky.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartTaskExecutionResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the specific task execution that was started.
    */
  var TaskExecutionArn: js.UndefOr[typingsSlinky.awsSdk.datasyncMod.TaskExecutionArn] = js.native
}

object StartTaskExecutionResponse {
  @scala.inline
  def apply(): StartTaskExecutionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartTaskExecutionResponse]
  }
  @scala.inline
  implicit class StartTaskExecutionResponseOps[Self <: StartTaskExecutionResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTaskExecutionArn(value: TaskExecutionArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TaskExecutionArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaskExecutionArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TaskExecutionArn")(js.undefined)
        ret
    }
  }
  
}

