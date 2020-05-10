package typingsSlinky.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAutoScalingGroupType extends js.Object {
  /**
    * The name of the Auto Scaling group. This name must be unique per Region per account.
    */
  var AutoScalingGroupName: XmlStringMaxLen255 = js.native
  /**
    * One or more Availability Zones for the group. This parameter is optional if you specify one or more subnets for VPCZoneIdentifier. Conditional: If your account supports EC2-Classic and VPC, this parameter is required to launch instances into EC2-Classic.
    */
  var AvailabilityZones: js.UndefOr[typingsSlinky.awsSdk.autoscalingMod.AvailabilityZones] = js.native
  /**
    * The amount of time, in seconds, after a scaling activity completes before another scaling activity can start. The default value is 300. For more information, see Scaling Cooldowns in the Amazon EC2 Auto Scaling User Guide.
    */
  var DefaultCooldown: js.UndefOr[Cooldown] = js.native
  /**
    * The number of Amazon EC2 instances that the Auto Scaling group attempts to maintain. This number must be greater than or equal to the minimum size of the group and less than or equal to the maximum size of the group. If you do not specify a desired capacity, the default is the minimum size of the group.
    */
  var DesiredCapacity: js.UndefOr[AutoScalingGroupDesiredCapacity] = js.native
  /**
    * The amount of time, in seconds, that Amazon EC2 Auto Scaling waits before checking the health status of an EC2 instance that has come into service. During this time, any health check failures for the instance are ignored. The default value is 0. For more information, see Health Check Grace Period in the Amazon EC2 Auto Scaling User Guide. Conditional: This parameter is required if you are adding an ELB health check.
    */
  var HealthCheckGracePeriod: js.UndefOr[typingsSlinky.awsSdk.autoscalingMod.HealthCheckGracePeriod] = js.native
  /**
    * The service to use for the health checks. The valid values are EC2 and ELB. The default value is EC2. If you configure an Auto Scaling group to use ELB health checks, it considers the instance unhealthy if it fails either the EC2 status checks or the load balancer health checks. For more information, see Health Checks for Auto Scaling Instances in the Amazon EC2 Auto Scaling User Guide.
    */
  var HealthCheckType: js.UndefOr[XmlStringMaxLen32] = js.native
  /**
    * The ID of the instance used to create a launch configuration for the group. When you specify an ID of an instance, Amazon EC2 Auto Scaling creates a new launch configuration and associates it with the group. This launch configuration derives its attributes from the specified instance, except for the block device mapping. For more information, see Create an Auto Scaling Group Using an EC2 Instance in the Amazon EC2 Auto Scaling User Guide. You must specify one of the following parameters in your request: LaunchConfigurationName, LaunchTemplate, InstanceId, or MixedInstancesPolicy.
    */
  var InstanceId: js.UndefOr[XmlStringMaxLen19] = js.native
  /**
    * The name of the launch configuration. If you do not specify LaunchConfigurationName, you must specify one of the following parameters: InstanceId, LaunchTemplate, or MixedInstancesPolicy.
    */
  var LaunchConfigurationName: js.UndefOr[ResourceName] = js.native
  /**
    * The launch template to use to launch instances. For more information, see LaunchTemplateSpecification in the Amazon EC2 Auto Scaling API Reference. If you do not specify LaunchTemplate, you must specify one of the following parameters: InstanceId, LaunchConfigurationName, or MixedInstancesPolicy.
    */
  var LaunchTemplate: js.UndefOr[LaunchTemplateSpecification] = js.native
  /**
    * One or more lifecycle hooks.
    */
  var LifecycleHookSpecificationList: js.UndefOr[LifecycleHookSpecifications] = js.native
  /**
    * A list of Classic Load Balancers associated with this Auto Scaling group. For Application Load Balancers and Network Load Balancers, specify a list of target groups using the TargetGroupARNs property instead. For more information, see Using a Load Balancer with an Auto Scaling Group in the Amazon EC2 Auto Scaling User Guide.
    */
  var LoadBalancerNames: js.UndefOr[typingsSlinky.awsSdk.autoscalingMod.LoadBalancerNames] = js.native
  /**
    * The maximum amount of time, in seconds, that an instance can be in service. For more information, see Replacing Auto Scaling Instances Based on Maximum Instance Lifetime in the Amazon EC2 Auto Scaling User Guide. Valid Range: Minimum value of 604800.
    */
  var MaxInstanceLifetime: js.UndefOr[typingsSlinky.awsSdk.autoscalingMod.MaxInstanceLifetime] = js.native
  /**
    * The maximum size of the group.
    */
  var MaxSize: AutoScalingGroupMaxSize = js.native
  /**
    * The minimum size of the group.
    */
  var MinSize: AutoScalingGroupMinSize = js.native
  /**
    * An embedded object that specifies a mixed instances policy. The required parameters must be specified. If optional parameters are unspecified, their default values are used. The policy includes parameters that not only define the distribution of On-Demand Instances and Spot Instances, the maximum price to pay for Spot Instances, and how the Auto Scaling group allocates instance types to fulfill On-Demand and Spot capacity, but also the parameters that specify the instance configuration information—the launch template and instance types. For more information, see MixedInstancesPolicy in the Amazon EC2 Auto Scaling API Reference and Auto Scaling Groups with Multiple Instance Types and Purchase Options in the Amazon EC2 Auto Scaling User Guide. You must specify one of the following parameters in your request: LaunchConfigurationName, LaunchTemplate, InstanceId, or MixedInstancesPolicy.
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
    * The Amazon Resource Name (ARN) of the service-linked role that the Auto Scaling group uses to call other AWS services on your behalf. By default, Amazon EC2 Auto Scaling uses a service-linked role named AWSServiceRoleForAutoScaling, which it creates if it does not exist. For more information, see Service-Linked Roles in the Amazon EC2 Auto Scaling User Guide.
    */
  var ServiceLinkedRoleARN: js.UndefOr[ResourceName] = js.native
  /**
    * One or more tags. For more information, see Tagging Auto Scaling Groups and Instances in the Amazon EC2 Auto Scaling User Guide.
    */
  var Tags: js.UndefOr[typingsSlinky.awsSdk.autoscalingMod.Tags] = js.native
  /**
    * The Amazon Resource Names (ARN) of the target groups to associate with the Auto Scaling group. Instances are registered as targets in a target group, and traffic is routed to the target group. For more information, see Using a Load Balancer with an Auto Scaling Group in the Amazon EC2 Auto Scaling User Guide.
    */
  var TargetGroupARNs: js.UndefOr[typingsSlinky.awsSdk.autoscalingMod.TargetGroupARNs] = js.native
  /**
    * One or more termination policies used to select the instance to terminate. These policies are executed in the order that they are listed. For more information, see Controlling Which Instances Auto Scaling Terminates During Scale In in the Amazon EC2 Auto Scaling User Guide.
    */
  var TerminationPolicies: js.UndefOr[typingsSlinky.awsSdk.autoscalingMod.TerminationPolicies] = js.native
  /**
    * A comma-separated list of subnet IDs for your virtual private cloud (VPC). If you specify VPCZoneIdentifier with AvailabilityZones, the subnets that you specify for this parameter must reside in those Availability Zones. Conditional: If your account supports EC2-Classic and VPC, this parameter is required to launch instances into a VPC.
    */
  var VPCZoneIdentifier: js.UndefOr[XmlStringMaxLen2047] = js.native
}

object CreateAutoScalingGroupType {
  @scala.inline
  def apply(
    AutoScalingGroupName: XmlStringMaxLen255,
    MaxSize: AutoScalingGroupMaxSize,
    MinSize: AutoScalingGroupMinSize
  ): CreateAutoScalingGroupType = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any], MaxSize = MaxSize.asInstanceOf[js.Any], MinSize = MinSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAutoScalingGroupType]
  }
  @scala.inline
  implicit class CreateAutoScalingGroupTypeOps[Self <: CreateAutoScalingGroupType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoScalingGroupName(value: XmlStringMaxLen255): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoScalingGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxSize(value: AutoScalingGroupMaxSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinSize(value: AutoScalingGroupMinSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinSize")(value.asInstanceOf[js.Any])
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
    def withInstanceId(value: XmlStringMaxLen19): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceId")(js.undefined)
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
    def withLifecycleHookSpecificationList(value: LifecycleHookSpecifications): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LifecycleHookSpecificationList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLifecycleHookSpecificationList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LifecycleHookSpecificationList")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadBalancerNames(value: LoadBalancerNames): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoadBalancerNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadBalancerNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoadBalancerNames")(js.undefined)
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
    def withTags(value: Tags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetGroupARNs(value: TargetGroupARNs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetGroupARNs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetGroupARNs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetGroupARNs")(js.undefined)
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

