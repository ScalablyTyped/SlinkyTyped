package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMaintenanceWindowExecutionTaskResult extends js.Object {
  /**
    * The time the task execution completed.
    */
  var EndTime: js.UndefOr[js.Date] = js.native
  /**
    * The defined maximum number of task executions that could be run in parallel.
    */
  var MaxConcurrency: js.UndefOr[typingsSlinky.awsSdk.ssmMod.MaxConcurrency] = js.native
  /**
    * The defined maximum number of task execution errors allowed before scheduling of the task execution would have been stopped.
    */
  var MaxErrors: js.UndefOr[typingsSlinky.awsSdk.ssmMod.MaxErrors] = js.native
  /**
    * The priority of the task.
    */
  var Priority: js.UndefOr[MaintenanceWindowTaskPriority] = js.native
  /**
    * The role that was assumed when running the task.
    */
  var ServiceRole: js.UndefOr[typingsSlinky.awsSdk.ssmMod.ServiceRole] = js.native
  /**
    * The time the task execution started.
    */
  var StartTime: js.UndefOr[js.Date] = js.native
  /**
    * The status of the task.
    */
  var Status: js.UndefOr[MaintenanceWindowExecutionStatus] = js.native
  /**
    * The details explaining the Status. Only available for certain status values.
    */
  var StatusDetails: js.UndefOr[MaintenanceWindowExecutionStatusDetails] = js.native
  /**
    * The ARN of the task that ran.
    */
  var TaskArn: js.UndefOr[MaintenanceWindowTaskArn] = js.native
  /**
    * The ID of the specific task execution in the maintenance window task that was retrieved.
    */
  var TaskExecutionId: js.UndefOr[MaintenanceWindowExecutionTaskId] = js.native
  /**
    * The parameters passed to the task when it was run.   TaskParameters has been deprecated. To specify parameters to pass to a task when it runs, instead use the Parameters option in the TaskInvocationParameters structure. For information about how Systems Manager handles these options for the supported maintenance window task types, see MaintenanceWindowTaskInvocationParameters.  The map has the following format: Key: string, between 1 and 255 characters Value: an array of strings, each string is between 1 and 255 characters
    */
  var TaskParameters: js.UndefOr[MaintenanceWindowTaskParametersList] = js.native
  /**
    * The type of task that was run.
    */
  var Type: js.UndefOr[MaintenanceWindowTaskType] = js.native
  /**
    * The ID of the maintenance window execution that includes the task.
    */
  var WindowExecutionId: js.UndefOr[MaintenanceWindowExecutionId] = js.native
}

object GetMaintenanceWindowExecutionTaskResult {
  @scala.inline
  def apply(): GetMaintenanceWindowExecutionTaskResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMaintenanceWindowExecutionTaskResult]
  }
  @scala.inline
  implicit class GetMaintenanceWindowExecutionTaskResultOps[Self <: GetMaintenanceWindowExecutionTaskResult] (val x: Self) extends AnyVal {
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
    def withMaxConcurrency(value: MaxConcurrency): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxConcurrency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxConcurrency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxConcurrency")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxErrors(value: MaxErrors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxErrors")(js.undefined)
        ret
    }
    @scala.inline
    def withPriority(value: MaintenanceWindowTaskPriority): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPriority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Priority")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceRole(value: ServiceRole): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceRole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceRole")(js.undefined)
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
    def withTaskArn(value: MaintenanceWindowTaskArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TaskArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaskArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TaskArn")(js.undefined)
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
    def withTaskParameters(value: MaintenanceWindowTaskParametersList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TaskParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaskParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TaskParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: MaintenanceWindowTaskType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(js.undefined)
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
  }
  
}

