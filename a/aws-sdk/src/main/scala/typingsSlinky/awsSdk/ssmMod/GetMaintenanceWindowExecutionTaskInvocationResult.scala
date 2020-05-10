package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMaintenanceWindowExecutionTaskInvocationResult extends js.Object {
  /**
    * The time that the task finished running on the target.
    */
  var EndTime: js.UndefOr[js.Date] = js.native
  /**
    * The execution ID.
    */
  var ExecutionId: js.UndefOr[MaintenanceWindowExecutionTaskExecutionId] = js.native
  /**
    * The invocation ID.
    */
  var InvocationId: js.UndefOr[MaintenanceWindowExecutionTaskInvocationId] = js.native
  /**
    * User-provided value to be included in any CloudWatch events raised while running tasks for these targets in this maintenance window. 
    */
  var OwnerInformation: js.UndefOr[typingsSlinky.awsSdk.ssmMod.OwnerInformation] = js.native
  /**
    * The parameters used at the time that the task ran.
    */
  var Parameters: js.UndefOr[MaintenanceWindowExecutionTaskInvocationParameters] = js.native
  /**
    * The time that the task started running on the target.
    */
  var StartTime: js.UndefOr[js.Date] = js.native
  /**
    * The task status for an invocation.
    */
  var Status: js.UndefOr[MaintenanceWindowExecutionStatus] = js.native
  /**
    * The details explaining the status. Details are only available for certain status values.
    */
  var StatusDetails: js.UndefOr[MaintenanceWindowExecutionStatusDetails] = js.native
  /**
    * The task execution ID.
    */
  var TaskExecutionId: js.UndefOr[MaintenanceWindowExecutionTaskId] = js.native
  /**
    * Retrieves the task type for a maintenance window. Task types include the following: LAMBDA, STEP_FUNCTIONS, AUTOMATION, RUN_COMMAND.
    */
  var TaskType: js.UndefOr[MaintenanceWindowTaskType] = js.native
  /**
    * The maintenance window execution ID.
    */
  var WindowExecutionId: js.UndefOr[MaintenanceWindowExecutionId] = js.native
  /**
    * The maintenance window target ID.
    */
  var WindowTargetId: js.UndefOr[MaintenanceWindowTaskTargetId] = js.native
}

object GetMaintenanceWindowExecutionTaskInvocationResult {
  @scala.inline
  def apply(): GetMaintenanceWindowExecutionTaskInvocationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMaintenanceWindowExecutionTaskInvocationResult]
  }
  @scala.inline
  implicit class GetMaintenanceWindowExecutionTaskInvocationResultOps[Self <: GetMaintenanceWindowExecutionTaskInvocationResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndTime")(js.undefined)
        ret
    }
    @scala.inline
    def withExecutionId(value: MaintenanceWindowExecutionTaskExecutionId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExecutionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecutionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExecutionId")(js.undefined)
        ret
    }
    @scala.inline
    def withInvocationId(value: MaintenanceWindowExecutionTaskInvocationId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InvocationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvocationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InvocationId")(js.undefined)
        ret
    }
    @scala.inline
    def withOwnerInformation(value: OwnerInformation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnerInformation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwnerInformation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnerInformation")(js.undefined)
        ret
    }
    @scala.inline
    def withParameters(value: MaintenanceWindowExecutionTaskInvocationParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parameters")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartTime")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: MaintenanceWindowExecutionStatus): Self = {
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
    def withStatusDetails(value: MaintenanceWindowExecutionStatusDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withTaskExecutionId(value: MaintenanceWindowExecutionTaskId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TaskExecutionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaskExecutionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TaskExecutionId")(js.undefined)
        ret
    }
    @scala.inline
    def withTaskType(value: MaintenanceWindowTaskType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TaskType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaskType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TaskType")(js.undefined)
        ret
    }
    @scala.inline
    def withWindowExecutionId(value: MaintenanceWindowExecutionId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WindowExecutionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindowExecutionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WindowExecutionId")(js.undefined)
        ret
    }
    @scala.inline
    def withWindowTargetId(value: MaintenanceWindowTaskTargetId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WindowTargetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindowTargetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WindowTargetId")(js.undefined)
        ret
    }
  }
  
}

