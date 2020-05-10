package typingsSlinky.awsSdk.datapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PollForTaskOutput extends js.Object {
  /**
    * The information needed to complete the task that is being assigned to the task runner. One of the fields returned in this object is taskId, which contains an identifier for the task being assigned. The calling task runner uses taskId in subsequent calls to ReportTaskProgress and SetTaskStatus.
    */
  var taskObject: js.UndefOr[TaskObject] = js.native
}

object PollForTaskOutput {
  @scala.inline
  def apply(): PollForTaskOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PollForTaskOutput]
  }
  @scala.inline
  implicit class PollForTaskOutputOps[Self <: PollForTaskOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTaskObject(value: TaskObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaskObject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskObject")(js.undefined)
        ret
    }
  }
  
}

