package typingsSlinky.pulumiAws.deploymentGroupMod

import typingsSlinky.pulumiAws.inputMod.codedeploy.DeploymentGroupAlarmConfiguration
import typingsSlinky.pulumiAws.inputMod.codedeploy.DeploymentGroupAutoRollbackConfiguration
import typingsSlinky.pulumiAws.inputMod.codedeploy.DeploymentGroupBlueGreenDeploymentConfig
import typingsSlinky.pulumiAws.inputMod.codedeploy.DeploymentGroupDeploymentStyle
import typingsSlinky.pulumiAws.inputMod.codedeploy.DeploymentGroupEc2TagFilter
import typingsSlinky.pulumiAws.inputMod.codedeploy.DeploymentGroupEc2TagSet
import typingsSlinky.pulumiAws.inputMod.codedeploy.DeploymentGroupEcsService
import typingsSlinky.pulumiAws.inputMod.codedeploy.DeploymentGroupLoadBalancerInfo
import typingsSlinky.pulumiAws.inputMod.codedeploy.DeploymentGroupOnPremisesInstanceTagFilter
import typingsSlinky.pulumiAws.inputMod.codedeploy.DeploymentGroupTriggerConfiguration
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentGroupArgs extends js.Object {
  /**
    * Configuration block of alarms associated with the deployment group (documented below).
    */
  val alarmConfiguration: js.UndefOr[Input[DeploymentGroupAlarmConfiguration]] = js.native
  /**
    * The name of the application.
    */
  val appName: Input[String] = js.native
  /**
    * Configuration block of the automatic rollback configuration associated with the deployment group (documented below).
    */
  val autoRollbackConfiguration: js.UndefOr[Input[DeploymentGroupAutoRollbackConfiguration]] = js.native
  /**
    * Autoscaling groups associated with the deployment group.
    */
  val autoscalingGroups: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Configuration block of the blue/green deployment options for a deployment group (documented below).
    */
  val blueGreenDeploymentConfig: js.UndefOr[Input[DeploymentGroupBlueGreenDeploymentConfig]] = js.native
  /**
    * The name of the group's deployment config. The default is "CodeDeployDefault.OneAtATime".
    */
  val deploymentConfigName: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the deployment group.
    */
  val deploymentGroupName: Input[String] = js.native
  /**
    * Configuration block of the type of deployment, either in-place or blue/green, you want to run and whether to route deployment traffic behind a load balancer (documented below).
    */
  val deploymentStyle: js.UndefOr[Input[DeploymentGroupDeploymentStyle]] = js.native
  /**
    * Tag filters associated with the deployment group. See the AWS docs for details.
    */
  val ec2TagFilters: js.UndefOr[Input[js.Array[Input[DeploymentGroupEc2TagFilter]]]] = js.native
  /**
    * Configuration block(s) of Tag filters associated with the deployment group, which are also referred to as tag groups (documented below). See the AWS docs for details.
    */
  val ec2TagSets: js.UndefOr[Input[js.Array[Input[DeploymentGroupEc2TagSet]]]] = js.native
  /**
    * Configuration block(s) of the ECS services for a deployment group (documented below).
    */
  val ecsService: js.UndefOr[Input[DeploymentGroupEcsService]] = js.native
  /**
    * Single configuration block of the load balancer to use in a blue/green deployment (documented below).
    */
  val loadBalancerInfo: js.UndefOr[Input[DeploymentGroupLoadBalancerInfo]] = js.native
  /**
    * On premise tag filters associated with the group. See the AWS docs for details.
    */
  val onPremisesInstanceTagFilters: js.UndefOr[Input[js.Array[Input[DeploymentGroupOnPremisesInstanceTagFilter]]]] = js.native
  /**
    * The service role ARN that allows deployments.
    */
  val serviceRoleArn: Input[String] = js.native
  /**
    * Configuration block(s) of the triggers for the deployment group (documented below).
    */
  val triggerConfigurations: js.UndefOr[Input[js.Array[Input[DeploymentGroupTriggerConfiguration]]]] = js.native
}

object DeploymentGroupArgs {
  @scala.inline
  def apply(appName: Input[String], deploymentGroupName: Input[String], serviceRoleArn: Input[String]): DeploymentGroupArgs = {
    val __obj = js.Dynamic.literal(appName = appName.asInstanceOf[js.Any], deploymentGroupName = deploymentGroupName.asInstanceOf[js.Any], serviceRoleArn = serviceRoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentGroupArgs]
  }
  @scala.inline
  implicit class DeploymentGroupArgsOps[Self <: DeploymentGroupArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeploymentGroupName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServiceRoleArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceRoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlarmConfiguration(value: Input[DeploymentGroupAlarmConfiguration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alarmConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlarmConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alarmConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoRollbackConfiguration(value: Input[DeploymentGroupAutoRollbackConfiguration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoRollbackConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoRollbackConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoRollbackConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoscalingGroups(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoscalingGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoscalingGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoscalingGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withBlueGreenDeploymentConfig(value: Input[DeploymentGroupBlueGreenDeploymentConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blueGreenDeploymentConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlueGreenDeploymentConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blueGreenDeploymentConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withDeploymentConfigName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentConfigName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeploymentConfigName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentConfigName")(js.undefined)
        ret
    }
    @scala.inline
    def withDeploymentStyle(value: Input[DeploymentGroupDeploymentStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeploymentStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withEc2TagFilters(value: Input[js.Array[Input[DeploymentGroupEc2TagFilter]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ec2TagFilters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEc2TagFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ec2TagFilters")(js.undefined)
        ret
    }
    @scala.inline
    def withEc2TagSets(value: Input[js.Array[Input[DeploymentGroupEc2TagSet]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ec2TagSets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEc2TagSets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ec2TagSets")(js.undefined)
        ret
    }
    @scala.inline
    def withEcsService(value: Input[DeploymentGroupEcsService]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ecsService")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEcsService: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ecsService")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadBalancerInfo(value: Input[DeploymentGroupLoadBalancerInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadBalancerInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadBalancerInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadBalancerInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPremisesInstanceTagFilters(value: Input[js.Array[Input[DeploymentGroupOnPremisesInstanceTagFilter]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPremisesInstanceTagFilters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnPremisesInstanceTagFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPremisesInstanceTagFilters")(js.undefined)
        ret
    }
    @scala.inline
    def withTriggerConfigurations(value: Input[js.Array[Input[DeploymentGroupTriggerConfiguration]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerConfigurations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTriggerConfigurations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerConfigurations")(js.undefined)
        ret
    }
  }
  
}

