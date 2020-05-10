package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuditMitigationActionExecutionMetadata extends js.Object {
  /**
    * The unique identifier for the mitigation action being applied by the task.
    */
  var actionId: js.UndefOr[MitigationActionId] = js.native
  /**
    * The friendly name of the mitigation action being applied by the task.
    */
  var actionName: js.UndefOr[MitigationActionName] = js.native
  /**
    * The date and time when the task was completed or canceled. Blank if the task is still running.
    */
  var endTime: js.UndefOr[js.Date] = js.native
  /**
    * If an error occurred, the code that indicates which type of error occurred.
    */
  var errorCode: js.UndefOr[ErrorCode] = js.native
  /**
    * The unique identifier for the findings to which the task and associated mitigation action are applied.
    */
  var findingId: js.UndefOr[FindingId] = js.native
  /**
    * If an error occurred, a message that describes the error.
    */
  var message: js.UndefOr[ErrorMessage] = js.native
  /**
    * The date and time when the task was started.
    */
  var startTime: js.UndefOr[js.Date] = js.native
  /**
    * The current status of the task being executed.
    */
  var status: js.UndefOr[AuditMitigationActionsExecutionStatus] = js.native
  /**
    * The unique identifier for the task that applies the mitigation action.
    */
  var taskId: js.UndefOr[AuditMitigationActionsTaskId] = js.native
}

object AuditMitigationActionExecutionMetadata {
  @scala.inline
  def apply(): AuditMitigationActionExecutionMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuditMitigationActionExecutionMetadata]
  }
  @scala.inline
  implicit class AuditMitigationActionExecutionMetadataOps[Self <: AuditMitigationActionExecutionMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionId(value: MitigationActionId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionId")(js.undefined)
        ret
    }
    @scala.inline
    def withActionName(value: MitigationActionName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionName")(js.undefined)
        ret
    }
    @scala.inline
    def withEndTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorCode(value: ErrorCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorCode")(js.undefined)
        ret
    }
    @scala.inline
    def withFindingId(value: FindingId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findingId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFindingId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findingId")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: ErrorMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
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
    def withStatus(value: AuditMitigationActionsExecutionStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
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
  }
  
}

