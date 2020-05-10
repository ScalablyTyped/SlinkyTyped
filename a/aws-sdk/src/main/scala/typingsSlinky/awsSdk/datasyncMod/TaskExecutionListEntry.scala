package typingsSlinky.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskExecutionListEntry extends js.Object {
  /**
    * The status of a task execution.
    */
  var Status: js.UndefOr[TaskExecutionStatus] = js.native
  /**
    * The Amazon Resource Name (ARN) of the task that was executed.
    */
  var TaskExecutionArn: js.UndefOr[typingsSlinky.awsSdk.datasyncMod.TaskExecutionArn] = js.native
}

object TaskExecutionListEntry {
  @scala.inline
  def apply(): TaskExecutionListEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskExecutionListEntry]
  }
  @scala.inline
  implicit class TaskExecutionListEntryOps[Self <: TaskExecutionListEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStatus(value: TaskExecutionStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
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

