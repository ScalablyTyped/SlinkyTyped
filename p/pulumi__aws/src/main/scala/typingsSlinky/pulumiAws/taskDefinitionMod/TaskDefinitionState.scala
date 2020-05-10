package typingsSlinky.pulumiAws.taskDefinitionMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.inputMod.ecs.TaskDefinitionPlacementConstraint
import typingsSlinky.pulumiAws.inputMod.ecs.TaskDefinitionProxyConfiguration
import typingsSlinky.pulumiAws.inputMod.ecs.TaskDefinitionVolume
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskDefinitionState extends js.Object {
  /**
    * Full ARN of the Task Definition (including both `family` and `revision`).
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * A list of valid [container definitions]
    * (http://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html) provided as a
    * single valid JSON document. Please note that you should only provide values that are part of the container
    * definition document. For a detailed description of what parameters are available, see the [Task Definition Parameters]
    * (https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html) section from the
    * official [Developer Guide](https://docs.aws.amazon.com/AmazonECS/latest/developerguide).
    */
  val containerDefinitions: js.UndefOr[Input[String]] = js.native
  /**
    * The number of cpu units used by the task. If the `requiresCompatibilities` is `FARGATE` this field is required.
    */
  val cpu: js.UndefOr[Input[String]] = js.native
  /**
    * The Amazon Resource Name (ARN) of the task execution role that the Amazon ECS container agent and the Docker daemon can assume.
    */
  val executionRoleArn: js.UndefOr[Input[String]] = js.native
  /**
    * A unique name for your task definition.
    */
  val family: js.UndefOr[Input[String]] = js.native
  /**
    * The IPC resource namespace to be used for the containers in the task The valid values are `host`, `task`, and `none`.
    */
  val ipcMode: js.UndefOr[Input[String]] = js.native
  /**
    * The amount (in MiB) of memory used by the task. If the `requiresCompatibilities` is `FARGATE` this field is required.
    */
  val memory: js.UndefOr[Input[String]] = js.native
  /**
    * The Docker networking mode to use for the containers in the task. The valid values are `none`, `bridge`, `awsvpc`, and `host`.
    */
  val networkMode: js.UndefOr[Input[String]] = js.native
  /**
    * The process namespace to use for the containers in the task. The valid values are `host` and `task`.
    */
  val pidMode: js.UndefOr[Input[String]] = js.native
  /**
    * A set of placement constraints rules that are taken into consideration during task placement. Maximum number of `placementConstraints` is `10`.
    */
  val placementConstraints: js.UndefOr[Input[js.Array[Input[TaskDefinitionPlacementConstraint]]]] = js.native
  /**
    * The proxy configuration details for the App Mesh proxy.
    */
  val proxyConfiguration: js.UndefOr[Input[TaskDefinitionProxyConfiguration]] = js.native
  /**
    * A set of launch types required by the task. The valid values are `EC2` and `FARGATE`.
    */
  val requiresCompatibilities: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The revision of the task in a particular family.
    */
  val revision: js.UndefOr[Input[Double]] = js.native
  /**
    * Key-value mapping of resource tags
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * The ARN of IAM role that allows your Amazon ECS container task to make calls to other AWS services.
    */
  val taskRoleArn: js.UndefOr[Input[String]] = js.native
  /**
    * A set of volume blocks that containers in your task may use.
    */
  val volumes: js.UndefOr[Input[js.Array[Input[TaskDefinitionVolume]]]] = js.native
}

object TaskDefinitionState {
  @scala.inline
  def apply(): TaskDefinitionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskDefinitionState]
  }
  @scala.inline
  implicit class TaskDefinitionStateOps[Self <: TaskDefinitionState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerDefinitions(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerDefinitions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerDefinitions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerDefinitions")(js.undefined)
        ret
    }
    @scala.inline
    def withCpu(value: Input[String]): Self = {
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
    def withExecutionRoleArn(value: Input[String]): Self = {
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
    def withFamily(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("family")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFamily: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("family")(js.undefined)
        ret
    }
    @scala.inline
    def withIpcMode(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipcMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpcMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipcMode")(js.undefined)
        ret
    }
    @scala.inline
    def withMemory(value: Input[String]): Self = {
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
    def withNetworkMode(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkMode")(js.undefined)
        ret
    }
    @scala.inline
    def withPidMode(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pidMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPidMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pidMode")(js.undefined)
        ret
    }
    @scala.inline
    def withPlacementConstraints(value: Input[js.Array[Input[TaskDefinitionPlacementConstraint]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placementConstraints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlacementConstraints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placementConstraints")(js.undefined)
        ret
    }
    @scala.inline
    def withProxyConfiguration(value: Input[TaskDefinitionProxyConfiguration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProxyConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withRequiresCompatibilities(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requiresCompatibilities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequiresCompatibilities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requiresCompatibilities")(js.undefined)
        ret
    }
    @scala.inline
    def withRevision(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRevision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revision")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Input[StringDictionary[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
    @scala.inline
    def withTaskRoleArn(value: Input[String]): Self = {
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
    @scala.inline
    def withVolumes(value: Input[js.Array[Input[TaskDefinitionVolume]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolumes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumes")(js.undefined)
        ret
    }
  }
  
}

