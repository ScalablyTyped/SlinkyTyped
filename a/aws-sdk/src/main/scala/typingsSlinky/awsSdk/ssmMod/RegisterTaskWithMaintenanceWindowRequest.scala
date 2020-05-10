package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterTaskWithMaintenanceWindowRequest extends js.Object {
  /**
    * User-provided idempotency token.
    */
  var ClientToken: js.UndefOr[typingsSlinky.awsSdk.ssmMod.ClientToken] = js.native
  /**
    * An optional description for the task.
    */
  var Description: js.UndefOr[MaintenanceWindowDescription] = js.native
  /**
    * A structure containing information about an Amazon S3 bucket to write instance-level logs to.    LoggingInfo has been deprecated. To specify an S3 bucket to contain logs, instead use the OutputS3BucketName and OutputS3KeyPrefix options in the TaskInvocationParameters structure. For information about how Systems Manager handles these options for the supported maintenance window task types, see MaintenanceWindowTaskInvocationParameters. 
    */
  var LoggingInfo: js.UndefOr[typingsSlinky.awsSdk.ssmMod.LoggingInfo] = js.native
  /**
    * The maximum number of targets this task can be run for in parallel.
    */
  var MaxConcurrency: typingsSlinky.awsSdk.ssmMod.MaxConcurrency = js.native
  /**
    * The maximum number of errors allowed before this task stops being scheduled.
    */
  var MaxErrors: typingsSlinky.awsSdk.ssmMod.MaxErrors = js.native
  /**
    * An optional name for the task.
    */
  var Name: js.UndefOr[MaintenanceWindowName] = js.native
  /**
    * The priority of the task in the maintenance window, the lower the number the higher the priority. Tasks in a maintenance window are scheduled in priority order with tasks that have the same priority scheduled in parallel.
    */
  var Priority: js.UndefOr[MaintenanceWindowTaskPriority] = js.native
  /**
    * The ARN of the IAM service role for Systems Manager to assume when running a maintenance window task. If you do not specify a service role ARN, Systems Manager uses your account's service-linked role. If no service-linked role for Systems Manager exists in your account, it is created when you run RegisterTaskWithMaintenanceWindow. For more information, see the following topics in the in the AWS Systems Manager User Guide:    Service-Linked Role Permissions for Systems Manager     Should I Use a Service-Linked Role or a Custom Service Role to Run Maintenance Window Tasks?    
    */
  var ServiceRoleArn: js.UndefOr[ServiceRole] = js.native
  /**
    * The targets (either instances or maintenance window targets). Specify instances using the following format:   Key=InstanceIds,Values=&lt;instance-id-1&gt;,&lt;instance-id-2&gt;  Specify maintenance window targets using the following format:  Key=WindowTargetIds;,Values=&lt;window-target-id-1&gt;,&lt;window-target-id-2&gt; 
    */
  var Targets: typingsSlinky.awsSdk.ssmMod.Targets = js.native
  /**
    * The ARN of the task to run.
    */
  var TaskArn: MaintenanceWindowTaskArn = js.native
  /**
    * The parameters that the task should use during execution. Populate only the fields that match the task type. All other fields should be empty. 
    */
  var TaskInvocationParameters: js.UndefOr[MaintenanceWindowTaskInvocationParameters] = js.native
  /**
    * The parameters that should be passed to the task when it is run.   TaskParameters has been deprecated. To specify parameters to pass to a task when it runs, instead use the Parameters option in the TaskInvocationParameters structure. For information about how Systems Manager handles these options for the supported maintenance window task types, see MaintenanceWindowTaskInvocationParameters. 
    */
  var TaskParameters: js.UndefOr[MaintenanceWindowTaskParameters] = js.native
  /**
    * The type of task being registered.
    */
  var TaskType: MaintenanceWindowTaskType = js.native
  /**
    * The ID of the maintenance window the task should be added to.
    */
  var WindowId: MaintenanceWindowId = js.native
}

object RegisterTaskWithMaintenanceWindowRequest {
  @scala.inline
  def apply(
    MaxConcurrency: MaxConcurrency,
    MaxErrors: MaxErrors,
    Targets: Targets,
    TaskArn: MaintenanceWindowTaskArn,
    TaskType: MaintenanceWindowTaskType,
    WindowId: MaintenanceWindowId
  ): RegisterTaskWithMaintenanceWindowRequest = {
    val __obj = js.Dynamic.literal(MaxConcurrency = MaxConcurrency.asInstanceOf[js.Any], MaxErrors = MaxErrors.asInstanceOf[js.Any], Targets = Targets.asInstanceOf[js.Any], TaskArn = TaskArn.asInstanceOf[js.Any], TaskType = TaskType.asInstanceOf[js.Any], WindowId = WindowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterTaskWithMaintenanceWindowRequest]
  }
  @scala.inline
  implicit class RegisterTaskWithMaintenanceWindowRequestOps[Self <: RegisterTaskWithMaintenanceWindowRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxConcurrency(value: MaxConcurrency): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxConcurrency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxErrors(value: MaxErrors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargets(value: Targets): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Targets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTaskArn(value: MaintenanceWindowTaskArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TaskArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTaskType(value: MaintenanceWindowTaskType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TaskType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWindowId(value: MaintenanceWindowId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WindowId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientToken(value: ClientToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientToken")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: MaintenanceWindowDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withLoggingInfo(value: LoggingInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoggingInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoggingInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoggingInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: MaintenanceWindowName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
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
    def withServiceRoleArn(value: ServiceRole): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceRoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceRoleArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceRoleArn")(js.undefined)
        ret
    }
    @scala.inline
    def withTaskInvocationParameters(value: MaintenanceWindowTaskInvocationParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TaskInvocationParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaskInvocationParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TaskInvocationParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withTaskParameters(value: MaintenanceWindowTaskParameters): Self = {
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
  }
  
}

