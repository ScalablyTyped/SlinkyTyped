package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskRunFilterCriteria extends js.Object {
  /**
    * Filter on task runs started after this date.
    */
  var StartedAfter: js.UndefOr[js.Date] = js.native
  /**
    * Filter on task runs started before this date.
    */
  var StartedBefore: js.UndefOr[js.Date] = js.native
  /**
    * The current status of the task run.
    */
  var Status: js.UndefOr[TaskStatusType] = js.native
  /**
    * The type of task run.
    */
  var TaskRunType: js.UndefOr[TaskType] = js.native
}

object TaskRunFilterCriteria {
  @scala.inline
  def apply(): TaskRunFilterCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskRunFilterCriteria]
  }
  @scala.inline
  implicit class TaskRunFilterCriteriaOps[Self <: TaskRunFilterCriteria] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStartedAfter(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartedAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartedAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartedAfter")(js.undefined)
        ret
    }
    @scala.inline
    def withStartedBefore(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartedBefore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartedBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartedBefore")(js.undefined)
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
    def withTaskRunType(value: TaskType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TaskRunType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaskRunType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TaskRunType")(js.undefined)
        ret
    }
  }
  
}

