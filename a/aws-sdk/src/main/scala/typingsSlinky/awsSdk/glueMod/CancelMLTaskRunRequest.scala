package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelMLTaskRunRequest extends js.Object {
  /**
    * A unique identifier for the task run.
    */
  var TaskRunId: HashString = js.native
  /**
    * The unique identifier of the machine learning transform.
    */
  var TransformId: HashString = js.native
}

object CancelMLTaskRunRequest {
  @scala.inline
  def apply(TaskRunId: HashString, TransformId: HashString): CancelMLTaskRunRequest = {
    val __obj = js.Dynamic.literal(TaskRunId = TaskRunId.asInstanceOf[js.Any], TransformId = TransformId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelMLTaskRunRequest]
  }
  @scala.inline
  implicit class CancelMLTaskRunRequestOps[Self <: CancelMLTaskRunRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTaskRunId(value: HashString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TaskRunId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransformId(value: HashString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransformId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

