package typingsSlinky.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoScalingGroup extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the Auto Scaling group.
    */
  var AutoScalingGroupARN: js.UndefOr[ResourceName] = js.native
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: XmlStringMaxLen255 = js.native
  /**
    * One or more Availability Zones for the group.
    */
  var AvailabilityZones: typingsSlinky.awsSdk.autoscalingMod.AvailabilityZones = js.native
  /**
    * The date and time the group was created.
    */
  var CreatedTime: js.Date = js.native
  /**
    * The amount of time, in seconds, after a scaling activity completes before another scaling activity can start.
    */
  var DefaultCooldown: Cooldown = js.native
  /**
    * The desired size of the group.
    */
  var DesiredCapacity: AutoScalingGroupDesiredCapacity = js.native
  /**
    * The metrics enabled for the group.
    */
  var EnabledMetrics: js.UndefOr[typingsSlinky.awsSdk.autoscalingMod.EnabledMetrics] = js.native
  /**
    * The amount of time, in seconds, that Amazon EC2 Auto Scaling waits before checking the health status of an EC2 instance that has come into service.
    */
  var HealthCheckGracePeriod: js.UndefOr[typingsSlinky.awsSdk.autoscalingMod.HealthCheckGracePeriod] = js.native
  /**
    * The service to use for the health checks. The valid values are EC2 and ELB. If you configure an Auto Scaling group to use ELB health checks, it considers the instance unhealthy if it fails either the EC2 status checks or the load balancer health checks.
    */
  var HealthCheckType: XmlStringMaxLen32 = js.native
  /**
    * The EC2 instances associated with the group.
    */
  var Instances: js.UndefOr[typingsSlinky.awsSdk.autoscalingMod.Instances] = js.native
  /**
    * The name of the associated launch configuration.
    */
  var LaunchConfigurationName: js.UndefOr[XmlStringMaxLen255] = js.native
  /**
    * The launch template for the group.
    */
  var LaunchTemplate: js.UndefOr[LaunchTemplateSpecification] = js.native
  /**
    * One or more load balancers associated with the group.
    */
  var LoadBalancerNames: js.UndefOr[typingsSlinky.awsSdk.autoscalingMod.LoadBalancerNames] = js.native
  /**
    * The maximum amount of time, in seconds, that an instance can be in service. Valid Range: Minimum value of 604800.
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
    * The mixed instances policy for the group.
    */
  var MixedInstancesPolicy: js.UndefOr[typingsSlinky.awsSdk.autoscalingMod.MixedInstancesPolicy] = js.native
  /**
    * Indicates whether newly launched instances are protected from termination by Amazon EC2 Auto Scaling when scaling in.
    */
  var NewInstancesProtectedFromScaleIn: js.UndefOr[InstanceProtected] = js.native
  /**
    * The name of the placement group into which to launch your instances, if any.
    */
  var PlacementGroup: js.UndefOr[XmlStringMaxLen255] = js.native
  /**
    * The Amazon Resource Name (ARN) of the service-linked role that the Auto Scaling group uses to call other AWS services on your behalf.
    */
  var ServiceLinkedRoleARN: js.UndefOr[ResourceName] = js.native
  /**
    * The current state of the group when DeleteAutoScalingGroup is in progress.
    */
  var Status: js.UndefOr[XmlStringMaxLen255] = js.native
  /**
    * The suspended processes associated with the group.
    */
  var SuspendedProcesses: js.UndefOr[typingsSlinky.awsSdk.autoscalingMod.SuspendedProcesses] = js.native
  /**
    * The tags for the group.
    */
  var Tags: js.UndefOr[TagDescriptionList] = js.native
  /**
    * The Amazon Resource Names (ARN) of the target groups for your load balancer.
    */
  var TargetGroupARNs: js.UndefOr[typingsSlinky.awsSdk.autoscalingMod.TargetGroupARNs] = js.native
  /**
    * The termination policies for the group.
    */
  var TerminationPolicies: js.UndefOr[typingsSlinky.awsSdk.autoscalingMod.TerminationPolicies] = js.native
  /**
    * One or more subnet IDs, if applicable, separated by commas.
    */
  var VPCZoneIdentifier: js.UndefOr[XmlStringMaxLen2047] = js.native
}

object AutoScalingGroup {
  @scala.inline
  def apply(
    AutoScalingGroupName: XmlStringMaxLen255,
    AvailabilityZones: AvailabilityZones,
    CreatedTime: js.Date,
    DefaultCooldown: Cooldown,
    DesiredCapacity: AutoScalingGroupDesiredCapacity,
    HealthCheckType: XmlStringMaxLen32,
    MaxSize: AutoScalingGroupMaxSize,
    MinSize: AutoScalingGroupMinSize
  ): AutoScalingGroup = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any], AvailabilityZones = AvailabilityZones.asInstanceOf[js.Any], CreatedTime = CreatedTime.asInstanceOf[js.Any], DefaultCooldown = DefaultCooldown.asInstanceOf[js.Any], DesiredCapacity = DesiredCapacity.asInstanceOf[js.Any], HealthCheckType = HealthCheckType.asInstanceOf[js.Any], MaxSize = MaxSize.asInstanceOf[js.Any], MinSize = MinSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoScalingGroup]
  }
  @scala.inline
  implicit class AutoScalingGroupOps[Self <: AutoScalingGroup] (val x: Self) extends AnyVal {
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
    def withAvailabilityZones(value: AvailabilityZones): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailabilityZones")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreatedTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultCooldown(value: Cooldown): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultCooldown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDesiredCapacity(value: AutoScalingGroupDesiredCapacity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DesiredCapacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHealthCheckType(value: XmlStringMaxLen32): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HealthCheckType")(value.asInstanceOf[js.Any])
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
    def withAutoScalingGroupARN(value: ResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoScalingGroupARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoScalingGroupARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoScalingGroupARN")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabledMetrics(value: EnabledMetrics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnabledMetrics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabledMetrics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnabledMetrics")(js.undefined)
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
    def withInstances(value: Instances): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Instances")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstances: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Instances")(js.undefined)
        ret
    }
    @scala.inline
    def withLaunchConfigurationName(value: XmlStringMaxLen255): Self = {
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
    def withStatus(value: XmlStringMaxLen255): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
    @scala.inline
    def withSuspendedProcesses(value: SuspendedProcesses): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SuspendedProcesses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuspendedProcesses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SuspendedProcesses")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: TagDescriptionList): Self = {
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

