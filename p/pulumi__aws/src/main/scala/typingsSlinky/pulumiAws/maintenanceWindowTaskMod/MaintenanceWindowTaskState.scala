package typingsSlinky.pulumiAws.maintenanceWindowTaskMod

import typingsSlinky.pulumiAws.inputMod.ssm.MaintenanceWindowTaskLoggingInfo
import typingsSlinky.pulumiAws.inputMod.ssm.MaintenanceWindowTaskTarget
import typingsSlinky.pulumiAws.inputMod.ssm.MaintenanceWindowTaskTaskInvocationParameters
import typingsSlinky.pulumiAws.inputMod.ssm.MaintenanceWindowTaskTaskParameter
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaintenanceWindowTaskState extends js.Object {
  /**
    * The description of the maintenance window task.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * A structure containing information about an Amazon S3 bucket to write instance-level logs to. Use `taskInvocationParameters` configuration block `runCommandParameters` configuration block `output_s3_*` arguments instead. Conflicts with `taskInvocationParameters`. Documented below.
    *
    * @deprecated use 'task_invocation_parameters' argument instead
    */
  val loggingInfo: js.UndefOr[Input[MaintenanceWindowTaskLoggingInfo]] = js.native
  /**
    * The maximum number of targets this task can be run for in parallel.
    */
  val maxConcurrency: js.UndefOr[Input[String]] = js.native
  /**
    * The maximum number of errors allowed before this task stops being scheduled.
    */
  val maxErrors: js.UndefOr[Input[String]] = js.native
  /**
    * The parameter name.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The priority of the task in the Maintenance Window, the lower the number the higher the priority. Tasks in a Maintenance Window are scheduled in priority order with tasks that have the same priority scheduled in parallel.
    */
  val priority: js.UndefOr[Input[Double]] = js.native
  /**
    * The IAM service role to assume during task execution.
    */
  val serviceRoleArn: js.UndefOr[Input[String]] = js.native
  /**
    * The targets (either instances or window target ids). Instances are specified using Key=InstanceIds,Values=instanceid1,instanceid2. Window target ids are specified using Key=WindowTargetIds,Values=window target id1, window target id2.
    */
  val targets: js.UndefOr[Input[js.Array[Input[MaintenanceWindowTaskTarget]]]] = js.native
  /**
    * The ARN of the task to execute.
    */
  val taskArn: js.UndefOr[Input[String]] = js.native
  /**
    * The parameters for task execution. This argument is conflict with `taskParameters` and `loggingInfo`.
    */
  val taskInvocationParameters: js.UndefOr[Input[MaintenanceWindowTaskTaskInvocationParameters]] = js.native
  /**
    * A structure containing information about parameters required by the particular `taskArn`. Use `parameter` configuration blocks under the `taskInvocationParameters` configuration block instead. Conflicts with `taskInvocationParameters`. Documented below.
    *
    * @deprecated use 'task_invocation_parameters' argument instead
    */
  val taskParameters: js.UndefOr[Input[js.Array[Input[MaintenanceWindowTaskTaskParameter]]]] = js.native
  /**
    * The type of task being registered. The only allowed value is `RUN_COMMAND`.
    */
  val taskType: js.UndefOr[Input[String]] = js.native
  /**
    * The Id of the maintenance window to register the task with.
    */
  val windowId: js.UndefOr[Input[String]] = js.native
}

object MaintenanceWindowTaskState {
  @scala.inline
  def apply(): MaintenanceWindowTaskState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaintenanceWindowTaskState]
  }
  @scala.inline
  implicit class MaintenanceWindowTaskStateOps[Self <: MaintenanceWindowTaskState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withLoggingInfo(value: Input[MaintenanceWindowTaskLoggingInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loggingInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoggingInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loggingInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxConcurrency(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxConcurrency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxConcurrency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxConcurrency")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxErrors(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxErrors")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withPriority(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPriority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceRoleArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceRoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceRoleArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceRoleArn")(js.undefined)
        ret
    }
    @scala.inline
    def withTargets(value: Input[js.Array[Input[MaintenanceWindowTaskTarget]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targets")(js.undefined)
        ret
    }
    @scala.inline
    def withTaskArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaskArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskArn")(js.undefined)
        ret
    }
    @scala.inline
    def withTaskInvocationParameters(value: Input[MaintenanceWindowTaskTaskInvocationParameters]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskInvocationParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaskInvocationParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskInvocationParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withTaskParameters(value: Input[js.Array[Input[MaintenanceWindowTaskTaskParameter]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaskParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withTaskType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaskType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskType")(js.undefined)
        ret
    }
    @scala.inline
    def withWindowId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindowId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowId")(js.undefined)
        ret
    }
  }
  
}

