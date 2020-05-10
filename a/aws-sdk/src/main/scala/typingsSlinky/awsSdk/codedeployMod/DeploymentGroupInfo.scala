package typingsSlinky.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentGroupInfo extends js.Object {
  /**
    * A list of alarms associated with the deployment group.
    */
  var alarmConfiguration: js.UndefOr[AlarmConfiguration] = js.native
  /**
    * The application name.
    */
  var applicationName: js.UndefOr[ApplicationName] = js.native
  /**
    * Information about the automatic rollback configuration associated with the deployment group.
    */
  var autoRollbackConfiguration: js.UndefOr[AutoRollbackConfiguration] = js.native
  /**
    * A list of associated Auto Scaling groups.
    */
  var autoScalingGroups: js.UndefOr[AutoScalingGroupList] = js.native
  /**
    * Information about blue/green deployment options for a deployment group.
    */
  var blueGreenDeploymentConfiguration: js.UndefOr[BlueGreenDeploymentConfiguration] = js.native
  /**
    * The destination platform type for the deployment (Lambda, Server, or ECS).
    */
  var computePlatform: js.UndefOr[ComputePlatform] = js.native
  /**
    * The deployment configuration name.
    */
  var deploymentConfigName: js.UndefOr[DeploymentConfigName] = js.native
  /**
    * The deployment group ID.
    */
  var deploymentGroupId: js.UndefOr[DeploymentGroupId] = js.native
  /**
    * The deployment group name.
    */
  var deploymentGroupName: js.UndefOr[DeploymentGroupName] = js.native
  /**
    * Information about the type of deployment, either in-place or blue/green, you want to run and whether to route deployment traffic behind a load balancer.
    */
  var deploymentStyle: js.UndefOr[DeploymentStyle] = js.native
  /**
    * The Amazon EC2 tags on which to filter. The deployment group includes EC2 instances with any of the specified tags.
    */
  var ec2TagFilters: js.UndefOr[EC2TagFilterList] = js.native
  /**
    * Information about groups of tags applied to an EC2 instance. The deployment group includes only EC2 instances identified by all of the tag groups. Cannot be used in the same call as ec2TagFilters.
    */
  var ec2TagSet: js.UndefOr[EC2TagSet] = js.native
  /**
    *  The target Amazon ECS services in the deployment group. This applies only to deployment groups that use the Amazon ECS compute platform. A target Amazon ECS service is specified as an Amazon ECS cluster and service name pair using the format &lt;clustername&gt;:&lt;servicename&gt;. 
    */
  var ecsServices: js.UndefOr[ECSServiceList] = js.native
  /**
    * Information about the most recent attempted deployment to the deployment group.
    */
  var lastAttemptedDeployment: js.UndefOr[LastDeploymentInfo] = js.native
  /**
    * Information about the most recent successful deployment to the deployment group.
    */
  var lastSuccessfulDeployment: js.UndefOr[LastDeploymentInfo] = js.native
  /**
    * Information about the load balancer to use in a deployment.
    */
  var loadBalancerInfo: js.UndefOr[LoadBalancerInfo] = js.native
  /**
    * The on-premises instance tags on which to filter. The deployment group includes on-premises instances with any of the specified tags.
    */
  var onPremisesInstanceTagFilters: js.UndefOr[TagFilterList] = js.native
  /**
    * Information about groups of tags applied to an on-premises instance. The deployment group includes only on-premises instances identified by all the tag groups. Cannot be used in the same call as onPremisesInstanceTagFilters.
    */
  var onPremisesTagSet: js.UndefOr[OnPremisesTagSet] = js.native
  /**
    * A service role Amazon Resource Name (ARN) that grants CodeDeploy permission to make calls to AWS services on your behalf. For more information, see Create a Service Role for AWS CodeDeploy in the AWS CodeDeploy User Guide.
    */
  var serviceRoleArn: js.UndefOr[Role] = js.native
  /**
    * Information about the deployment group's target revision, including type and location.
    */
  var targetRevision: js.UndefOr[RevisionLocation] = js.native
  /**
    * Information about triggers associated with the deployment group.
    */
  var triggerConfigurations: js.UndefOr[TriggerConfigList] = js.native
}

object DeploymentGroupInfo {
  @scala.inline
  def apply(): DeploymentGroupInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentGroupInfo]
  }
  @scala.inline
  implicit class DeploymentGroupInfoOps[Self <: DeploymentGroupInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withApplicationName(value: ApplicationName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationName")(js.undefined)
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
    def withAutoScalingGroups(value: AutoScalingGroupList): Self = {
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
    def withComputePlatform(value: ComputePlatform): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computePlatform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComputePlatform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computePlatform")(js.undefined)
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
    def withDeploymentGroupId(value: DeploymentGroupId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentGroupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeploymentGroupId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentGroupId")(js.undefined)
        ret
    }
    @scala.inline
    def withDeploymentGroupName(value: DeploymentGroupName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeploymentGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentGroupName")(js.undefined)
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
    def withLastAttemptedDeployment(value: LastDeploymentInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastAttemptedDeployment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastAttemptedDeployment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastAttemptedDeployment")(js.undefined)
        ret
    }
    @scala.inline
    def withLastSuccessfulDeployment(value: LastDeploymentInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastSuccessfulDeployment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastSuccessfulDeployment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastSuccessfulDeployment")(js.undefined)
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
    def withServiceRoleArn(value: Role): Self = {
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
    def withTargetRevision(value: RevisionLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetRevision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetRevision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetRevision")(js.undefined)
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

