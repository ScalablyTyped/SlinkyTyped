package typingsSlinky.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskOverride extends js.Object {
  /**
    * One or more container overrides sent to a task.
    */
  var containerOverrides: js.UndefOr[ContainerOverrides] = js.native
  /**
    * The cpu override for the task.
    */
  var cpu: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) of the task execution role that the Amazon ECS container agent and the Docker daemon can assume.
    */
  var executionRoleArn: js.UndefOr[String] = js.native
  /**
    * The Elastic Inference accelerator override for the task.
    */
  var inferenceAcceleratorOverrides: js.UndefOr[InferenceAcceleratorOverrides] = js.native
  /**
    * The memory override for the task.
    */
  var memory: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) of the IAM role that containers in this task can assume. All containers in this task are granted the permissions that are specified in this role.
    */
  var taskRoleArn: js.UndefOr[String] = js.native
}

object TaskOverride {
  @scala.inline
  def apply(): TaskOverride = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskOverride]
  }
  @scala.inline
  implicit class TaskOverrideOps[Self <: TaskOverride] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainerOverrides(value: ContainerOverrides): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerOverrides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerOverrides: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerOverrides")(js.undefined)
        ret
    }
    @scala.inline
    def withCpu(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCpu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpu")(js.undefined)
        ret
    }
    @scala.inline
    def withExecutionRoleArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionRoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecutionRoleArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionRoleArn")(js.undefined)
        ret
    }
    @scala.inline
    def withInferenceAcceleratorOverrides(value: InferenceAcceleratorOverrides): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inferenceAcceleratorOverrides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInferenceAcceleratorOverrides: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inferenceAcceleratorOverrides")(js.undefined)
        ret
    }
    @scala.inline
    def withMemory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMemory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memory")(js.undefined)
        ret
    }
    @scala.inline
    def withTaskRoleArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskRoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaskRoleArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskRoleArn")(js.undefined)
        ret
    }
  }
  
}

