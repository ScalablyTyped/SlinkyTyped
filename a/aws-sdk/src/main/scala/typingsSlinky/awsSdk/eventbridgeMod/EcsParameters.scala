package typingsSlinky.awsSdk.eventbridgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EcsParameters extends js.Object {
  /**
    * Specifies an ECS task group for the task. The maximum length is 255 characters.
    */
  var Group: js.UndefOr[String] = js.native
  /**
    * Specifies the launch type on which your task is running. The launch type that you specify here must match one of the launch type (compatibilities) of the target task. The FARGATE value is supported only in the Regions where AWS Fargate with Amazon ECS is supported. For more information, see AWS Fargate on Amazon ECS in the Amazon Elastic Container Service Developer Guide.
    */
  var LaunchType: js.UndefOr[typingsSlinky.awsSdk.eventbridgeMod.LaunchType] = js.native
  /**
    * Use this structure if the ECS task uses the awsvpc network mode. This structure specifies the VPC subnets and security groups associated with the task, and whether a public IP address is to be used. This structure is required if LaunchType is FARGATE because the awsvpc mode is required for Fargate tasks. If you specify NetworkConfiguration when the target ECS task does not use the awsvpc network mode, the task fails.
    */
  var NetworkConfiguration: js.UndefOr[typingsSlinky.awsSdk.eventbridgeMod.NetworkConfiguration] = js.native
  /**
    * Specifies the platform version for the task. Specify only the numeric portion of the platform version, such as 1.1.0. This structure is used only if LaunchType is FARGATE. For more information about valid platform versions, see AWS Fargate Platform Versions in the Amazon Elastic Container Service Developer Guide.
    */
  var PlatformVersion: js.UndefOr[String] = js.native
  /**
    * The number of tasks to create based on TaskDefinition. The default is 1.
    */
  var TaskCount: js.UndefOr[LimitMin1] = js.native
  /**
    * The ARN of the task definition to use if the event target is an Amazon ECS task. 
    */
  var TaskDefinitionArn: Arn = js.native
}

object EcsParameters {
  @scala.inline
  def apply(TaskDefinitionArn: Arn): EcsParameters = {
    val __obj = js.Dynamic.literal(TaskDefinitionArn = TaskDefinitionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[EcsParameters]
  }
  @scala.inline
  implicit class EcsParametersOps[Self <: EcsParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTaskDefinitionArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TaskDefinitionArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Group")(js.undefined)
        ret
    }
    @scala.inline
    def withLaunchType(value: LaunchType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LaunchType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLaunchType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LaunchType")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkConfiguration(value: NetworkConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withPlatformVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlatformVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatformVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlatformVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withTaskCount(value: LimitMin1): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TaskCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaskCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TaskCount")(js.undefined)
        ret
    }
  }
  
}

