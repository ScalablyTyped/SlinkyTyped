package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelMLTaskRunResponse extends js.Object {
  /**
    * The status for this run.
    */
  var Status: js.UndefOr[TaskStatusType] = js.native
  /**
    * The unique identifier for the task run.
    */
  var TaskRunId: js.UndefOr[HashString] = js.native
  /**
    * The unique identifier of the machine learning transform.
    */
  var TransformId: js.UndefOr[HashString] = js.native
}

object CancelMLTaskRunResponse {
  @scala.inline
  def apply(): CancelMLTaskRunResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelMLTaskRunResponse]
  }
  @scala.inline
  implicit class CancelMLTaskRunResponseOps[Self <: CancelMLTaskRunResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

