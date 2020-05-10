package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskRun extends js.Object {
  /**
    * The last point in time that the requested task run was completed.
    */
  var CompletedOn: js.UndefOr[js.Date] = js.native
  /**
    * The list of error strings associated with this task run.
    */
  var ErrorString: js.UndefOr[GenericString] = js.native
  /**
    * The amount of time (in seconds) that the task run consumed resources.
    */
  var ExecutionTime: js.UndefOr[typingsSlinky.awsSdk.glueMod.ExecutionTime] = js.native
  /**
    * The last point in time that the requested task run was updated.
    */
  var LastModifiedOn: js.UndefOr[js.Date] = js.native
  /**
    * The names of the log group for secure logging, associated with this task run.
    */
  var LogGroupName: js.UndefOr[GenericString] = js.native
  /**
    * Specifies configuration properties associated with this task run.
    */
  var Properties: js.UndefOr[TaskRunProperties] = js.native
  /**
    * The date and time that this task run started.
    */
  var StartedOn: js.UndefOr[js.Date] = js.native
  /**
    * The current status of the requested task run.
    */
  var Status: js.UndefOr[TaskStatusType] = js.native
  /**
    * The unique identifier for this task run.
    */
  var TaskRunId: js.UndefOr[HashString] = js.native
  /**
    * The unique identifier for the transform.
    */
  var TransformId: js.UndefOr[HashString] = js.native
}

object TaskRun {
  @scala.inline
  def apply(): TaskRun = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskRun]
  }
  @scala.inline
  implicit class TaskRunOps[Self <: TaskRun] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompletedOn(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CompletedOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompletedOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CompletedOn")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorString(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorString")(js.undefined)
        ret
    }
    @scala.inline
    def withExecutionTime(value: ExecutionTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExecutionTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecutionTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExecutionTime")(js.undefined)
        ret
    }
    @scala.inline
    def withLastModifiedOn(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModifiedOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModifiedOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModifiedOn")(js.undefined)
        ret
    }
    @scala.inline
    def withLogGroupName(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogGroupName")(js.undefined)
        ret
    }
    @scala.inline
    def withProperties(value: TaskRunProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Properties")(js.undefined)
        ret
    }
    @scala.inline
    def withStartedOn(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartedOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartedOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartedOn")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: TaskStatusType): Self = {
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
    def withTaskRunId(value: HashString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TaskRunId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaskRunId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TaskRunId")(js.undefined)
        ret
    }
    @scala.inline
    def withTransformId(value: HashString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransformId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransformId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransformId")(js.undefined)
        ret
    }
  }
  
}

