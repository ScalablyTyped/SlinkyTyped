package typingsSlinky.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDeploymentGroupInput extends js.Object {
  /**
    * Information to add about Amazon CloudWatch alarms when the deployment group is created.
    */
  var alarmConfiguration: js.UndefOr[AlarmConfiguration] = js.native
  /**
    * The name of an AWS CodeDeploy application associated with the IAM user or AWS account.
    */
  var applicationName: ApplicationName = js.native
  /**
    * Configuration information for an automatic rollback that is added when a deployment group is created.
    */
  var autoRollbackConfiguration: js.UndefOr[AutoRollbackConfiguration] = js.native
  /**
    * A list of associated Amazon EC2 Auto Scaling groups.
    */
  var autoScalingGroups: js.UndefOr[AutoScalingGroupNameList] = js.native
  /**
    * Information about blue/green deployment options for a deployment group.
    */
  var blueGreenDeploymentConfiguration: js.UndefOr[BlueGreenDeploymentConfiguration] = js.native
  /**
    * If specified, the deployment configuration name can be either one of the predefined configurations provided with AWS CodeDeploy or a custom deployment configuration that you create by calling the create deployment configuration operation. CodeDeployDefault.OneAtATime is the default deployment configuration. It is used if a configuration isn't specified for the deployment or deployment group. For more information about the predefined deployment configurations in AWS CodeDeploy, see Working with Deployment Groups in AWS CodeDeploy in the AWS CodeDeploy User Guide.
    */
  var deploymentConfigName: js.UndefOr[DeploymentConfigName] = js.native
  /**
    * The name of a new deployment group for the specified application.
    */
  var deploymentGroupName: DeploymentGroupName = js.native
  /**
    * Information about the type of deployment, in-place or blue/green, that you want to run and whether to route deployment traffic behind a load balancer.
    */
  var deploymentStyle: js.UndefOr[DeploymentStyle] = js.native
  /**
    * The Amazon EC2 tags on which to filter. The deployment group includes EC2 instances with any of the specified tags. Cannot be used in the same call as ec2TagSet.
    */
  var ec2TagFilters: js.UndefOr[EC2TagFilterList] = js.native
  /**
    * Information about groups of tags applied to EC2 instances. The deployment group includes only EC2 instances identified by all the tag groups. Cannot be used in the same call as ec2TagFilters.
    */
  var ec2TagSet: js.UndefOr[EC2TagSet] = js.native
  /**
    *  The target Amazon ECS services in the deployment group. This applies only to deployment groups that use the Amazon ECS compute platform. A target Amazon ECS service is specified as an Amazon ECS cluster and service name pair using the format &lt;clustername&gt;:&lt;servicename&gt;. 
    */
  var ecsServices: js.UndefOr[ECSServiceList] = js.native
  /**
    * Information about the load balancer used in a deployment.
    */
  var loadBalancerInfo: js.UndefOr[LoadBalancerInfo] = js.native
  /**
    * The on-premises instance tags on which to filter. The deployment group includes on-premises instances with any of the specified tags. Cannot be used in the same call as OnPremisesTagSet.
    */
  var onPremisesInstanceTagFilters: js.UndefOr[TagFilterList] = js.native
  /**
    * Information about groups of tags applied to on-premises instances. The deployment group includes only on-premises instances identified by all of the tag groups. Cannot be used in the same call as onPremisesInstanceTagFilters.
    */
  var onPremisesTagSet: js.UndefOr[OnPremisesTagSet] = js.native
  /**
    * A service role ARN that allows AWS CodeDeploy to act on the user's behalf when interacting with AWS services.
    */
  var serviceRoleArn: Role = js.native
  /**
    *  The metadata that you apply to CodeDeploy deployment groups to help you organize and categorize them. Each tag consists of a key and an optional value, both of which you define. 
    */
  var tags: js.UndefOr[TagList] = js.native
  /**
    * Information about triggers to create when the deployment group is created. For examples, see Create a Trigger for an AWS CodeDeploy Event in the AWS CodeDeploy User Guide.
    */
  var triggerConfigurations: js.UndefOr[TriggerConfigList] = js.native
}

object CreateDeploymentGroupInput {
  @scala.inline
  def apply(applicationName: ApplicationName, deploymentGroupName: DeploymentGroupName, serviceRoleArn: Role): CreateDeploymentGroupInput = {
    val __obj = js.Dynamic.literal(applicationName = applicationName.asInstanceOf[js.Any], deploymentGroupName = deploymentGroupName.asInstanceOf[js.Any], serviceRoleArn = serviceRoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDeploymentGroupInput]
  }
  @scala.inline
  implicit class CreateDeploymentGroupInputOps[Self <: CreateDeploymentGroupInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationName(value: ApplicationName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeploymentGroupName(value: DeploymentGroupName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServiceRoleArn(value: Role): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceRoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlarmConfiguration(value: AlarmConfiguration): Self = {
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
    def withAutoRollbackConfiguration(value: AutoRollbackConfiguration): Self = {
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
    def withAutoScalingGroups(value: AutoScalingGroupNameList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoScalingGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoScalingGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoScalingGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withBlueGreenDeploymentConfiguration(value: BlueGreenDeploymentConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blueGreenDeploymentConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlueGreenDeploymentConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blueGreenDeploymentConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withDeploymentConfigName(value: DeploymentConfigName): Self = {
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
    def withDeploymentStyle(value: DeploymentStyle): Self = {
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
    def withEc2TagFilters(value: EC2TagFilterList): Self = {
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
    def withEc2TagSet(value: EC2TagSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ec2TagSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEc2TagSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ec2TagSet")(js.undefined)
        ret
    }
    @scala.inline
    def withEcsServices(value: ECSServiceList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ecsServices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEcsServices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ecsServices")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadBalancerInfo(value: LoadBalancerInfo): Self = {
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
    def withOnPremisesInstanceTagFilters(value: TagFilterList): Self = {
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
    def withOnPremisesTagSet(value: OnPremisesTagSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPremisesTagSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnPremisesTagSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPremisesTagSet")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: TagList): Self = {
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
    def withTriggerConfigurations(value: TriggerConfigList): Self = {
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

