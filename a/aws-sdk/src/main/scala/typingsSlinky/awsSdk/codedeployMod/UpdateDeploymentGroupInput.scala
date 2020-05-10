package typingsSlinky.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDeploymentGroupInput extends js.Object {
  /**
    * Information to add or change about Amazon CloudWatch alarms when the deployment group is updated.
    */
  var alarmConfiguration: js.UndefOr[AlarmConfiguration] = js.native
  /**
    * The application name that corresponds to the deployment group to update.
    */
  var applicationName: ApplicationName = js.native
  /**
    * Information for an automatic rollback configuration that is added or changed when a deployment group is updated.
    */
  var autoRollbackConfiguration: js.UndefOr[AutoRollbackConfiguration] = js.native
  /**
    * The replacement list of Auto Scaling groups to be included in the deployment group, if you want to change them. To keep the Auto Scaling groups, enter their names. To remove Auto Scaling groups, do not enter any Auto Scaling group names.
    */
  var autoScalingGroups: js.UndefOr[AutoScalingGroupNameList] = js.native
  /**
    * Information about blue/green deployment options for a deployment group.
    */
  var blueGreenDeploymentConfiguration: js.UndefOr[BlueGreenDeploymentConfiguration] = js.native
  /**
    * The current name of the deployment group.
    */
  var currentDeploymentGroupName: DeploymentGroupName = js.native
  /**
    * The replacement deployment configuration name to use, if you want to change it.
    */
  var deploymentConfigName: js.UndefOr[DeploymentConfigName] = js.native
  /**
    * Information about the type of deployment, either in-place or blue/green, you want to run and whether to route deployment traffic behind a load balancer.
    */
  var deploymentStyle: js.UndefOr[DeploymentStyle] = js.native
  /**
    * The replacement set of Amazon EC2 tags on which to filter, if you want to change them. To keep the existing tags, enter their names. To remove tags, do not enter any tag names.
    */
  var ec2TagFilters: js.UndefOr[EC2TagFilterList] = js.native
  /**
    * Information about groups of tags applied to on-premises instances. The deployment group includes only EC2 instances identified by all the tag groups.
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
    * The new name of the deployment group, if you want to change it.
    */
  var newDeploymentGroupName: js.UndefOr[DeploymentGroupName] = js.native
  /**
    * The replacement set of on-premises instance tags on which to filter, if you want to change them. To keep the existing tags, enter their names. To remove tags, do not enter any tag names.
    */
  var onPremisesInstanceTagFilters: js.UndefOr[TagFilterList] = js.native
  /**
    * Information about an on-premises instance tag set. The deployment group includes only on-premises instances identified by all the tag groups.
    */
  var onPremisesTagSet: js.UndefOr[OnPremisesTagSet] = js.native
  /**
    * A replacement ARN for the service role, if you want to change it.
    */
  var serviceRoleArn: js.UndefOr[Role] = js.native
  /**
    * Information about triggers to change when the deployment group is updated. For examples, see Modify Triggers in an AWS CodeDeploy Deployment Group in the AWS CodeDeploy User Guide.
    */
  var triggerConfigurations: js.UndefOr[TriggerConfigList] = js.native
}

object UpdateDeploymentGroupInput {
  @scala.inline
  def apply(applicationName: ApplicationName, currentDeploymentGroupName: DeploymentGroupName): UpdateDeploymentGroupInput = {
    val __obj = js.Dynamic.literal(applicationName = applicationName.asInstanceOf[js.Any], currentDeploymentGroupName = currentDeploymentGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDeploymentGroupInput]
  }
  @scala.inline
  implicit class UpdateDeploymentGroupInputOps[Self <: UpdateDeploymentGroupInput] (val x: Self) extends AnyVal {
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
    def withCurrentDeploymentGroupName(value: DeploymentGroupName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentDeploymentGroupName")(value.asInstanceOf[js.Any])
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
    def withNewDeploymentGroupName(value: DeploymentGroupName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newDeploymentGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewDeploymentGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newDeploymentGroupName")(js.undefined)
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

