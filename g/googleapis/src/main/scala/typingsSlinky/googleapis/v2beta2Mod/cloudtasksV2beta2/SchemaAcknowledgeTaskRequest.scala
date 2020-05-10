package typingsSlinky.googleapis.v2beta2Mod.cloudtasksV2beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for acknowledging a task using AcknowledgeTask.
  */
@js.native
trait SchemaAcknowledgeTaskRequest extends js.Object {
  /**
    * Required.  The task&#39;s current schedule time, available in the
    * schedule_time returned by LeaseTasks response or RenewLease response.
    * This restriction is to ensure that your worker currently holds the lease.
    */
  var scheduleTime: js.UndefOr[String] = js.native
}

object SchemaAcknowledgeTaskRequest {
  @scala.inline
  def apply(): SchemaAcknowledgeTaskRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAcknowledgeTaskRequest]
  }
  @scala.inline
  implicit class SchemaAcknowledgeTaskRequestOps[Self <: SchemaAcknowledgeTaskRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScheduleTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduleTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScheduleTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduleTime")(js.undefined)
        ret
    }
  }
  
}

