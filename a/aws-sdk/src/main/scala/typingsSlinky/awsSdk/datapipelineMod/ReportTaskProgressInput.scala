package typingsSlinky.awsSdk.datapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReportTaskProgressInput extends js.Object {
  /**
    * Key-value pairs that define the properties of the ReportTaskProgressInput object.
    */
  var fields: js.UndefOr[fieldList] = js.native
  /**
    * The ID of the task assigned to the task runner. This value is provided in the response for PollForTask.
    */
  var taskId: typingsSlinky.awsSdk.datapipelineMod.taskId = js.native
}

object ReportTaskProgressInput {
  @scala.inline
  def apply(taskId: taskId): ReportTaskProgressInput = {
    val __obj = js.Dynamic.literal(taskId = taskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportTaskProgressInput]
  }
  @scala.inline
  implicit class ReportTaskProgressInputOps[Self <: ReportTaskProgressInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTaskId(value: taskId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFields(value: fieldList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(js.undefined)
        ret
    }
  }
  
}

