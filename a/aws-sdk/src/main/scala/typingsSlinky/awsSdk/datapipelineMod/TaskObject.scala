package typingsSlinky.awsSdk.datapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskObject extends js.Object {
  /**
    * The ID of the pipeline task attempt object. AWS Data Pipeline uses this value to track how many times a task is attempted.
    */
  var attemptId: js.UndefOr[id] = js.native
  /**
    * Connection information for the location where the task runner will publish the output of the task.
    */
  var objects: js.UndefOr[PipelineObjectMap] = js.native
  /**
    * The ID of the pipeline that provided the task.
    */
  var pipelineId: js.UndefOr[id] = js.native
  /**
    * An internal identifier for the task. This ID is passed to the SetTaskStatus and ReportTaskProgress actions.
    */
  var taskId: js.UndefOr[typingsSlinky.awsSdk.datapipelineMod.taskId] = js.native
}

object TaskObject {
  @scala.inline
  def apply(): TaskObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskObject]
  }
  @scala.inline
  implicit class TaskObjectOps[Self <: TaskObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttemptId(value: id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attemptId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttemptId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attemptId")(js.undefined)
        ret
    }
    @scala.inline
    def withObjects(value: PipelineObjectMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objects")(js.undefined)
        ret
    }
    @scala.inline
    def withPipelineId(value: id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pipelineId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPipelineId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pipelineId")(js.undefined)
        ret
    }
    @scala.inline
    def withTaskId(value: taskId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaskId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskId")(js.undefined)
        ret
    }
  }
  
}

