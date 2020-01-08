package typingsSlinky.awsDashSdk.clientsDatasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelTaskExecutionRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the task execution to cancel.
    */
  var TaskExecutionArn: typingsSlinky.awsDashSdk.clientsDatasyncMod.TaskExecutionArn = js.native
}

object CancelTaskExecutionRequest {
  @scala.inline
  def apply(TaskExecutionArn: TaskExecutionArn): CancelTaskExecutionRequest = {
    val __obj = js.Dynamic.literal(TaskExecutionArn = TaskExecutionArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CancelTaskExecutionRequest]
  }
}

