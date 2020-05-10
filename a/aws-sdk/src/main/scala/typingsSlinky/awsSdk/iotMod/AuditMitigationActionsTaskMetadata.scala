package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuditMitigationActionsTaskMetadata extends js.Object {
  /**
    * The time at which the audit mitigation actions task was started.
    */
  var startTime: js.UndefOr[js.Date] = js.native
  /**
    * The unique identifier for the task.
    */
  var taskId: js.UndefOr[AuditMitigationActionsTaskId] = js.native
  /**
    * The current state of the audit mitigation actions task.
    */
  var taskStatus: js.UndefOr[AuditMitigationActionsTaskStatus] = js.native
}

object AuditMitigationActionsTaskMetadata {
  @scala.inline
  def apply(): AuditMitigationActionsTaskMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuditMitigationActionsTaskMetadata]
  }
  @scala.inline
  implicit class AuditMitigationActionsTaskMetadataOps[Self <: AuditMitigationActionsTaskMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStartTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(js.undefined)
        ret
    }
    @scala.inline
    def withTaskId(value: AuditMitigationActionsTaskId): Self = {
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
    @scala.inline
    def withTaskStatus(value: AuditMitigationActionsTaskStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaskStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskStatus")(js.undefined)
        ret
    }
  }
  
}

