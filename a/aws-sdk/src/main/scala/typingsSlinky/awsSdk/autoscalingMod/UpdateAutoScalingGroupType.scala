package typingsSlinky.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateAutoScalingGroupType extends js.Object {
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: ResourceName = js.native
  /**
    * One or more Availability Zones for the group.
    */
  var AvailabilityZones: js.UndefOr[typingsSlinky.awsSdk.autoscalingMod.AvailabilityZones] = js.native
  /**
    * The amount of time, in seconds, after a scaling activity completes before another scaling activity can start. The default value is 300. This cooldown period is not used when a scaling-specific cooldown is specified. Cooldown periods are not supported for target tracking scaling policies, step scaling policies, or scheduled scaling. For more information, see Scaling Cooldowns in the Amazon EC2 Auto Scaling User Guide.
    */
  var DefaultCooldown: js.UndefOr[Cooldown] = js.native
  /**
    * The number of EC2 instances that should be running in the Auto Scaling group. This number must be greater than or equal to the minimum size of the group and less than or equal to the maximum size of the group.
    */
  var DesiredCapacity: js.UndefOr[AutoScalingGroupDesiredCapacity] = js.native
  /**
    * The amount of time, in seconds, that Amazon EC2 Auto Scaling waits before checking the health status of an EC2 instance that has come into service. The default value is 0. For more information, see Health Check Grace Period in the Amazon EC2 Auto Scaling User Guide. Conditional: This parameter is required if you are adding an ELB health check.
    */
  var HealthCheckGracePeriod: js.UndefOr[typingsSlinky.awsSdk.autoscalingMod.HealthCheckGracePeriod] = js.native
  /**
    * The service to use for the health checks. The valid values are EC2 and ELB. If you configure an Auto Scaling group to use ELB health checks, it considers the instance unhealthy if it fails either the EC2 status checks or the load balancer health checks.
    */
  var HealthCheckType: js.UndefOr[XmlStringMaxLen32] = js.native
  /**
    * The name of the launch configuration. If you specify LaunchConfigurationName in your update request, you can't specify LaunchTemplate or MixedInstancesPolicy.
    */
  var LaunchConfigurationName: js.UndefOr[ResourceName] = js.native
  /**
    * The launch template and version to use to specify the updates. If you specify LaunchTemplate in your update request, you can't specify LaunchConfigurationName or MixedInstancesPolicy. For more information, see LaunchTemplateSpecification in the Amazon EC2 Auto Scaling API Reference.
    */
  var LaunchTemplate: js.UndefOr[LaunchTemplateSpecification] = js.native
  /**
    * The maximum amount of time, in seconds, that an instance can be in service. For more information, see Replacing Auto Scaling Instances Based on Maximum Instance Lifetime in the Amazon EC2 Auto Scaling User Guide. Valid Range: Minimum value of 604800.
    */
  var MaxInstanceLifetime: js.UndefOr[typingsSlinky.awsSdk.autoscalingMod.MaxInstanceLifetime] = js.native
  /**
    * The maximum size of the Auto Scaling group.
    */
  var MaxSize: js.UndefOr[AutoScalingGroupMaxSize] = js.native
  /**
    * The minimum size of the Auto Scaling group.
    */
  var MinSize: js.UndefOr[AutoScalingGroupMinSize] = js.native
  /**
    * An embedded object that specifies a mixed instances policy. In your call to UpdateAutoScalingGroup, you can make changes to the policy that is specified. All optional parameters are left unchanged if not specified. For more information, see MixedInstancesPolicy in the Amazon EC2 Auto Scaling API Reference and Auto Scaling Groups with Multiple Instance Types and Purchase Options in the Amazon EC2 Auto Scaling User Guide.
    */
  var MixedInstancesPolicy: js.UndefOr[typingsSlinky.awsSdk.autoscalingMod.MixedInstancesPolicy] = js.native
  /**
    * Indicates whether newly launched instances are protected from termination by Amazon EC2 Auto Scaling when scaling in. For more information about preventing instances from terminating on scale in, see Instance Protection in the Amazon EC2 Auto Scaling User Guide.
    */
  var NewInstancesProtectedFromScaleIn: js.UndefOr[InstanceProtected] = js.native
  /**
    * The name of the placement group into which to launch your instances, if any. A placement group is a logical grouping of instances within a single Availability Zone. You cannot specify multiple Availability Zones and a placement group. For more information, see Placement Groups in the Amazon EC2 User Guide for Linux Instances.
    */
  var PlacementGroup: js.UndefOr[XmlStringMaxLen255] = js.native
  /**
    * The Amazon Resource Name (ARN) of the service-linked role that the Auto Scaling group uses to call other AWS services on your behalf. For more information, see Service-Linked Roles in the Amazon EC2 Auto Scaling User Guide.
    */
  var ServiceLinkedRoleARN: js.UndefOr[ResourceName] = js.native
  /**
    * A standalone termination policy or a list of termination policies used to select the instance to terminate. The policies are executed in the order that they are listed. For more information, see Controlling Which Instances Auto Scaling Terminates During Scale In in the Amazon EC2 Auto Scaling User Guide.
    */
  var TerminationPolicies: js.UndefOr[typingsSlinky.awsSdk.autoscalingMod.TerminationPolicies] = js.native
  /**
    * A comma-separated list of subnet IDs for virtual private cloud (VPC). If you specify VPCZoneIdentifier with AvailabilityZones, the subnets that you specify for this parameter must reside in those Availability Zones.
    */
  var VPCZoneIdentifier: js.UndefOr[XmlStringMaxLen2047] = js.native
}

object UpdateAutoScalingGroupType {
  @scala.inline
  def apply(AutoScalingGroupName: ResourceName): UpdateAutoScalingGroupType = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAutoScalingGroupType]
  }
  @scala.inline
  implicit class UpdateAutoScalingGroupTypeOps[Self <: UpdateAutoScalingGroupType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoScalingGroupName(value: ResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoScalingGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAvailabilityZones(value: AvailabilityZones): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailabilityZones")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailabilityZones: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailabilityZones")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultCooldown(value: Cooldown): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultCooldown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultCooldown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultCooldown")(js.undefined)
        ret
    }
    @scala.inline
    def withDesiredCapacity(value: AutoScalingGroupDesiredCapacity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DesiredCapacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDesiredCapacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DesiredCapacity")(js.undefined)
        ret
    }
    @scala.inline
    def withHealthCheckGracePeriod(value: HealthCheckGracePeriod): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HealthCheckGracePeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHealthCheckGracePeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HealthCheckGracePeriod")(js.undefined)
        ret
    }
    @scala.inline
    def withHealthCheckType(value: XmlStringMaxLen32): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HealthCheckType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHealthCheckType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HealthCheckType")(js.undefined)
        ret
    }
    @scala.inline
    def withLaunchConfigurationName(value: ResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LaunchConfigurationName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLaunchConfigurationName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LaunchConfigurationName")(js.undefined)
        ret
    }
    @scala.inline
    def withLaunchTemplate(value: LaunchTemplateSpecification): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LaunchTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLaunchTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LaunchTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxInstanceLifetime(value: MaxInstanceLifetime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxInstanceLifetime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxInstanceLifetime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxInstanceLifetime")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxSize(value: AutoScalingGroupMaxSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxSize")(js.undefined)
        ret
    }
    @scala.inline
    def withMinSize(value: AutoScalingGroupMinSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinSize")(js.undefined)
        ret
    }
    @scala.inline
    def withMixedInstancesPolicy(value: MixedInstancesPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MixedInstancesPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMixedInstancesPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MixedInstancesPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withNewInstancesProtectedFromScaleIn(value: InstanceProtected): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NewInstancesProtectedFromScaleIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewInstancesProtectedFromScaleIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NewInstancesProtectedFromScaleIn")(js.undefined)
        ret
    }
    @scala.inline
    def withPlacementGroup(value: XmlStringMaxLen255): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlacementGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlacementGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlacementGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceLinkedRoleARN(value: ResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceLinkedRoleARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceLinkedRoleARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceLinkedRoleARN")(js.undefined)
        ret
    }
    @scala.inline
    def withTerminationPolicies(value: TerminationPolicies): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TerminationPolicies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTerminationPolicies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TerminationPolicies")(js.undefined)
        ret
    }
    @scala.inline
    def withVPCZoneIdentifier(value: XmlStringMaxLen2047): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VPCZoneIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVPCZoneIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VPCZoneIdentifier")(js.undefined)
        ret
    }
  }
  
}

