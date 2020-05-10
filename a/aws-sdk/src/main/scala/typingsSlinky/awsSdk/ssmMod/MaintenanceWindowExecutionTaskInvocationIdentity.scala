package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaintenanceWindowExecutionTaskInvocationIdentity extends js.Object {
  /**
    * The time the invocation finished.
    */
  var EndTime: js.UndefOr[js.Date] = js.native
  /**
    * The ID of the action performed in the service that actually handled the task invocation. If the task type is RUN_COMMAND, this value is the command ID.
    */
  var ExecutionId: js.UndefOr[MaintenanceWindowExecutionTaskExecutionId] = js.native
  /**
    * The ID of the task invocation.
    */
  var InvocationId: js.UndefOr[MaintenanceWindowExecutionTaskInvocationId] = js.native
  /**
    * User-provided value that was specified when the target was registered with the maintenance window. This was also included in any CloudWatch events raised during the task invocation.
    */
  var OwnerInformation: js.UndefOr[typingsSlinky.awsSdk.ssmMod.OwnerInformation] = js.native
  /**
    * The parameters that were provided for the invocation when it was run.
    */
  var Parameters: js.UndefOr[MaintenanceWindowExecutionTaskInvocationParameters] = js.native
  /**
    * The time the invocation started.
    */
  var StartTime: js.UndefOr[js.Date] = js.native
  /**
    * The status of the task invocation.
    */
  var Status: js.UndefOr[MaintenanceWindowExecutionStatus] = js.native
  /**
    * The details explaining the status of the task invocation. Only available for certain Status values. 
    */
  var StatusDetails: js.UndefOr[MaintenanceWindowExecutionStatusDetails] = js.native
  /**
    * The ID of the specific task execution in the maintenance window execution.
    */
  var TaskExecutionId: js.UndefOr[MaintenanceWindowExecutionTaskId] = js.native
  /**
    * The task type.
    */
  var TaskType: js.UndefOr[MaintenanceWindowTaskType] = js.native
  /**
    * The ID of the maintenance window execution that ran the task.
    */
  var WindowExecutionId: js.UndefOr[MaintenanceWindowExecutionId] = js.native
  /**
    * The ID of the target definition in this maintenance window the invocation was performed for.
    */
  var WindowTargetId: js.UndefOr[MaintenanceWindowTaskTargetId] = js.native
}

object MaintenanceWindowExecutionTaskInvocationIdentity {
  @scala.inline
  def apply(): MaintenanceWindowExecutionTaskInvocationIdentity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaintenanceWindowExecutionTaskInvocationIdentity]
  }
  @scala.inline
  implicit class MaintenanceWindowExecutionTaskInvocationIdentityOps[Self <: MaintenanceWindowExecutionTaskInvocationIdentity] (val x: Self) extends AnyVal {
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

