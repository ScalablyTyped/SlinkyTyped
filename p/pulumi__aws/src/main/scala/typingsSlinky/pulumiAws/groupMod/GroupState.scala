package typingsSlinky.pulumiAws.groupMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.inputMod.autoscaling.GroupInitialLifecycleHook
import typingsSlinky.pulumiAws.inputMod.autoscaling.GroupLaunchTemplate
import typingsSlinky.pulumiAws.inputMod.autoscaling.GroupMixedInstancesPolicy
import typingsSlinky.pulumiAws.inputMod.autoscaling.GroupTag
import typingsSlinky.pulumiAws.launchConfigurationMod.LaunchConfiguration
import typingsSlinky.pulumiAws.metricsMod.Metric
import typingsSlinky.pulumiAws.metricsMod.MetricsGranularity
import typingsSlinky.pulumiAws.placementGroupMod.PlacementGroup
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupState extends js.Object {
  /**
    * The ARN for this AutoScaling Group
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * A list of one or more availability zones for the group. This parameter should not be specified when using `vpcZoneIdentifier`.
    */
  val availabilityZones: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The amount of time, in seconds, after a scaling activity completes before another scaling activity can start.
    */
  val defaultCooldown: js.UndefOr[Input[Double]] = js.native
  /**
    * The number of Amazon EC2 instances that
    * should be running in the group. (See also Waiting for
    * Capacity below.)
    */
  val desiredCapacity: js.UndefOr[Input[Double]] = js.native
  /**
    * A list of metrics to collect. The allowed values are `GroupDesiredCapacity`, `GroupInServiceCapacity`, `GroupPendingCapacity`, `GroupMinSize`, `GroupMaxSize`, `GroupInServiceInstances`, `GroupPendingInstances`, `GroupStandbyInstances`, `GroupStandbyCapacity`, `GroupTerminatingCapacity`, `GroupTerminatingInstances`, `GroupTotalCapacity`, `GroupTotalInstances`.
    * * `waitForCapacityTimeout` (Default: "10m") A maximum
    * [duration](https://golang.org/pkg/time/#ParseDuration) that this provider should
    * wait for ASG instances to be healthy before timing out.  (See also Waiting
    * for Capacity below.) Setting this to "0" causes
    * this provider to skip all Capacity Waiting behavior.
    */
  val enabledMetrics: js.UndefOr[Input[js.Array[Input[Metric]]]] = js.native
  /**
    * Allows deleting the autoscaling group without waiting
    * for all instances in the pool to terminate.  You can force an autoscaling group to delete
    * even if it's in the process of scaling a resource. Normally, this provider
    * drains all the instances before deleting the group.  This bypasses that
    * behavior and potentially leaves resources dangling.
    */
  val forceDelete: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Time (in seconds) after instance comes into service before checking health.
    */
  val healthCheckGracePeriod: js.UndefOr[Input[Double]] = js.native
  /**
    * "EC2" or "ELB". Controls how health checking is done.
    */
  val healthCheckType: js.UndefOr[Input[String]] = js.native
  /**
    * One or more
    * [Lifecycle Hooks](http://docs.aws.amazon.com/autoscaling/latest/userguide/lifecycle-hooks.html)
    * to attach to the autoscaling group **before** instances are launched. The
    * syntax is exactly the same as the separate
    * [`aws.autoscaling.LifecycleHook`](https://www.terraform.io/docs/providers/aws/r/autoscaling_lifecycle_hook.html)
    * resource, without the `autoscalingGroupName` attribute. Please note that this will only work when creating
    * a new autoscaling group. For all other use-cases, please use `aws.autoscaling.LifecycleHook` resource.
    */
  val initialLifecycleHooks: js.UndefOr[Input[js.Array[Input[GroupInitialLifecycleHook]]]] = js.native
  /**
    * The name of the launch configuration to use.
    */
  val launchConfiguration: js.UndefOr[Input[String | LaunchConfiguration]] = js.native
  /**
    * Nested argument containing launch template settings along with the overrides to specify multiple instance types and weights. Defined below.
    */
  val launchTemplate: js.UndefOr[Input[GroupLaunchTemplate]] = js.native
  /**
    * A list of elastic load balancer names to add to the autoscaling
    * group names. Only valid for classic load balancers. For ALBs, use `targetGroupArns` instead.
    */
  val loadBalancers: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The maximum amount of time, in seconds, that an instance can be in service, values must be either equal to 0 or between 604800 and 31536000 seconds.
    */
  val maxInstanceLifetime: js.UndefOr[Input[Double]] = js.native
  /**
    * The maximum size of the auto scale group.
    */
  val maxSize: js.UndefOr[Input[Double]] = js.native
  /**
    * The granularity to associate with the metrics to collect. The only valid value is `1Minute`. Default is `1Minute`.
    */
  val metricsGranularity: js.UndefOr[Input[String | MetricsGranularity]] = js.native
  /**
    * Setting this causes this provider to wait for
    * this number of instances from this autoscaling group to show up healthy in the
    * ELB only on creation. Updates will not wait on ELB instance number changes.
    * (See also Waiting for Capacity below.)
    */
  val minElbCapacity: js.UndefOr[Input[Double]] = js.native
  /**
    * The minimum size of the auto scale group.
    * (See also Waiting for Capacity below.)
    */
  val minSize: js.UndefOr[Input[Double]] = js.native
  /**
    * Configuration block containing settings to define launch targets for Auto Scaling groups. Defined below.
    */
  val mixedInstancesPolicy: js.UndefOr[Input[GroupMixedInstancesPolicy]] = js.native
  /**
    * The name of the auto scaling group. By default generated by this provider.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Creates a unique name beginning with the specified
    * prefix. Conflicts with `name`.
    */
  val namePrefix: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the placement group into which you'll launch your instances, if any.
    */
  val placementGroup: js.UndefOr[Input[String | PlacementGroup]] = js.native
  /**
    * Allows setting instance protection. The
    * autoscaling group will not select instances with this setting for terminination
    * during scale in events.
    */
  val protectFromScaleIn: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The ARN of the service-linked role that the ASG will use to call other AWS services
    */
  val serviceLinkedRoleArn: js.UndefOr[Input[String]] = js.native
  /**
    * A list of processes to suspend for the AutoScaling Group. The allowed values are `Launch`, `Terminate`, `HealthCheck`, `ReplaceUnhealthy`, `AZRebalance`, `AlarmNotification`, `ScheduledActions`, `AddToLoadBalancer`.
    * Note that if you suspend either the `Launch` or `Terminate` process types, it can prevent your autoscaling group from functioning properly.
    */
  val suspendedProcesses: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * A list of tag blocks. Tags documented below.
    */
  val tags: js.UndefOr[Input[js.Array[Input[GroupTag]]]] = js.native
  /**
    * A list of tag blocks (maps). Tags documented below.
    */
  val tagsCollection: js.UndefOr[Input[js.Array[Input[StringDictionary[_]]]]] = js.native
  /**
    * A list of `aws.alb.TargetGroup` ARNs, for use with Application or Network Load Balancing.
    */
  val targetGroupArns: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * A list of policies to decide how the instances in the auto scale group should be terminated. The allowed values are `OldestInstance`, `NewestInstance`, `OldestLaunchConfiguration`, `ClosestToNextInstanceHour`, `OldestLaunchTemplate`, `AllocationStrategy`, `Default`.
    */
  val terminationPolicies: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * A list of subnet IDs to launch resources in.
    */
  val vpcZoneIdentifiers: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  val waitForCapacityTimeout: js.UndefOr[Input[String]] = js.native
  /**
    * Setting this will cause this provider to wait
    * for exactly this number of healthy instances from this autoscaling group in
    * all attached load balancers on both create and update operations. (Takes
    * precedence over `minElbCapacity` behavior.)
    * (See also Waiting for Capacity below.)
    */
  val waitForElbCapacity: js.UndefOr[Input[Double]] = js.native
}

object GroupState {
  @scala.inline
  def apply(): GroupState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupState]
  }
  @scala.inline
  implicit class GroupStateOps[Self <: GroupState] (val x: Self) extends AnyVal {
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
    def withAvailabilityZones(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availabilityZones")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailabilityZones: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availabilityZones")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultCooldown(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultCooldown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultCooldown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultCooldown")(js.undefined)
        ret
    }
    @scala.inline
    def withDesiredCapacity(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desiredCapacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDesiredCapacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desiredCapacity")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabledMetrics(value: Input[js.Array[Input[Metric]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabledMetrics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabledMetrics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabledMetrics")(js.undefined)
        ret
    }
    @scala.inline
    def withForceDelete(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceDelete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceDelete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceDelete")(js.undefined)
        ret
    }
    @scala.inline
    def withHealthCheckGracePeriod(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("healthCheckGracePeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHealthCheckGracePeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("healthCheckGracePeriod")(js.undefined)
        ret
    }
    @scala.inline
    def withHealthCheckType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("healthCheckType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHealthCheckType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("healthCheckType")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialLifecycleHooks(value: Input[js.Array[Input[GroupInitialLifecycleHook]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialLifecycleHooks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialLifecycleHooks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialLifecycleHooks")(js.undefined)
        ret
    }
    @scala.inline
    def withLaunchConfiguration(value: Input[String | LaunchConfiguration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launchConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLaunchConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launchConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withLaunchTemplate(value: Input[GroupLaunchTemplate]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launchTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLaunchTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launchTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadBalancers(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadBalancers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadBalancers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadBalancers")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxInstanceLifetime(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxInstanceLifetime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxInstanceLifetime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxInstanceLifetime")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxSize(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSize")(js.undefined)
        ret
    }
    @scala.inline
    def withMetricsGranularity(value: Input[String | MetricsGranularity]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricsGranularity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetricsGranularity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricsGranularity")(js.undefined)
        ret
    }
    @scala.inline
    def withMinElbCapacity(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minElbCapacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinElbCapacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minElbCapacity")(js.undefined)
        ret
    }
    @scala.inline
    def withMinSize(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSize")(js.undefined)
        ret
    }
    @scala.inline
    def withMixedInstancesPolicy(value: Input[GroupMixedInstancesPolicy]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mixedInstancesPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMixedInstancesPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mixedInstancesPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNamePrefix(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namePrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamePrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namePrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withPlacementGroup(value: Input[String | PlacementGroup]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placementGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlacementGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placementGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withProtectFromScaleIn(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protectFromScaleIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtectFromScaleIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protectFromScaleIn")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceLinkedRoleArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceLinkedRoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceLinkedRoleArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceLinkedRoleArn")(js.undefined)
        ret
    }
    @scala.inline
    def withSuspendedProcesses(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suspendedProcesses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuspendedProcesses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suspendedProcesses")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Input[js.Array[Input[GroupTag]]]): Self = {
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
    def withTagsCollection(value: Input[js.Array[Input[StringDictionary[_]]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagsCollection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagsCollection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagsCollection")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetGroupArns(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetGroupArns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetGroupArns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetGroupArns")(js.undefined)
        ret
    }
    @scala.inline
    def withTerminationPolicies(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("terminationPolicies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTerminationPolicies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("terminationPolicies")(js.undefined)
        ret
    }
    @scala.inline
    def withVpcZoneIdentifiers(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpcZoneIdentifiers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcZoneIdentifiers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpcZoneIdentifiers")(js.undefined)
        ret
    }
    @scala.inline
    def withWaitForCapacityTimeout(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForCapacityTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaitForCapacityTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForCapacityTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withWaitForElbCapacity(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForElbCapacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaitForElbCapacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForElbCapacity")(js.undefined)
        ret
    }
  }
  
}

