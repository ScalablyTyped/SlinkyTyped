package typingsSlinky.awsSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object autoscalingMod {
  
  type Activities = js.Array[typingsSlinky.awsSdk.autoscalingMod.Activity]
  
  type ActivityIds = js.Array[typingsSlinky.awsSdk.autoscalingMod.XmlString]
  
  type AdjustmentTypes = js.Array[typingsSlinky.awsSdk.autoscalingMod.AdjustmentType]
  
  type Alarms = js.Array[typingsSlinky.awsSdk.autoscalingMod.Alarm]
  
  type AsciiStringMaxLen255 = java.lang.String
  
  type AssociatePublicIpAddress = scala.Boolean
  
  type AutoScalingGroupDesiredCapacity = scala.Double
  
  type AutoScalingGroupMaxSize = scala.Double
  
  type AutoScalingGroupMinSize = scala.Double
  
  type AutoScalingGroupNames = js.Array[typingsSlinky.awsSdk.autoscalingMod.ResourceName]
  
  type AutoScalingGroups = js.Array[typingsSlinky.awsSdk.autoscalingMod.AutoScalingGroup]
  
  type AutoScalingInstances = js.Array[typingsSlinky.awsSdk.autoscalingMod.AutoScalingInstanceDetails]
  
  type AutoScalingNotificationTypes = js.Array[typingsSlinky.awsSdk.autoscalingMod.XmlStringMaxLen255]
  
  type AvailabilityZones = js.Array[typingsSlinky.awsSdk.autoscalingMod.XmlStringMaxLen255]
  
  type BlockDeviceEbsDeleteOnTermination = scala.Boolean
  
  type BlockDeviceEbsEncrypted = scala.Boolean
  
  type BlockDeviceEbsIops = scala.Double
  
  type BlockDeviceEbsVolumeSize = scala.Double
  
  type BlockDeviceEbsVolumeType = java.lang.String
  
  type BlockDeviceMappings = js.Array[typingsSlinky.awsSdk.autoscalingMod.BlockDeviceMapping]
  
  type CapacityRebalanceEnabled = scala.Boolean
  
  type ClassicLinkVPCSecurityGroups = js.Array[typingsSlinky.awsSdk.autoscalingMod.XmlStringMaxLen255]
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.autoscalingMod.ClientApiVersions
  
  type Cooldown = scala.Double
  
  type DisableScaleIn = scala.Boolean
  
  type EbsOptimized = scala.Boolean
  
  type EnabledMetrics = js.Array[typingsSlinky.awsSdk.autoscalingMod.EnabledMetric]
  
  type EstimatedInstanceWarmup = scala.Double
  
  type FailedScheduledUpdateGroupActionRequests = js.Array[typingsSlinky.awsSdk.autoscalingMod.FailedScheduledUpdateGroupActionRequest]
  
  type Filters = js.Array[typingsSlinky.awsSdk.autoscalingMod.Filter]
  
  type ForceDelete = scala.Boolean
  
  type GlobalTimeout = scala.Double
  
  type HealthCheckGracePeriod = scala.Double
  
  type HeartbeatTimeout = scala.Double
  
  type HonorCooldown = scala.Boolean
  
  type InstanceIds = js.Array[typingsSlinky.awsSdk.autoscalingMod.XmlStringMaxLen19]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.disabled__
    - typingsSlinky.awsSdk.awsSdkStrings.enabled__
    - java.lang.String
  */
  type InstanceMetadataEndpointState = typingsSlinky.awsSdk.autoscalingMod._InstanceMetadataEndpointState | java.lang.String
  
  type InstanceMetadataHttpPutResponseHopLimit = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.optional__
    - typingsSlinky.awsSdk.awsSdkStrings.required__
    - java.lang.String
  */
  type InstanceMetadataHttpTokensState = typingsSlinky.awsSdk.autoscalingMod._InstanceMetadataHttpTokensState | java.lang.String
  
  type InstanceProtected = scala.Boolean
  
  type InstanceRefreshIds = js.Array[typingsSlinky.awsSdk.autoscalingMod.XmlStringMaxLen255]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Pending_
    - typingsSlinky.awsSdk.awsSdkStrings.InProgress_
    - typingsSlinky.awsSdk.awsSdkStrings.Successful_
    - typingsSlinky.awsSdk.awsSdkStrings.Failed_
    - typingsSlinky.awsSdk.awsSdkStrings.Cancelling_
    - typingsSlinky.awsSdk.awsSdkStrings.Cancelled_
    - java.lang.String
  */
  type InstanceRefreshStatus = typingsSlinky.awsSdk.autoscalingMod._InstanceRefreshStatus | java.lang.String
  
  type InstanceRefreshes = js.Array[typingsSlinky.awsSdk.autoscalingMod.InstanceRefresh]
  
  type Instances = js.Array[typingsSlinky.awsSdk.autoscalingMod.Instance]
  
  type InstancesToUpdate = scala.Double
  
  type IntPercent = scala.Double
  
  type LaunchConfigurationNames = js.Array[typingsSlinky.awsSdk.autoscalingMod.ResourceName]
  
  type LaunchConfigurations = js.Array[typingsSlinky.awsSdk.autoscalingMod.LaunchConfiguration]
  
  type LaunchTemplateName = java.lang.String
  
  type LifecycleActionResult = java.lang.String
  
  type LifecycleActionToken = java.lang.String
  
  type LifecycleHookNames = js.Array[typingsSlinky.awsSdk.autoscalingMod.AsciiStringMaxLen255]
  
  type LifecycleHookSpecifications = js.Array[typingsSlinky.awsSdk.autoscalingMod.LifecycleHookSpecification]
  
  type LifecycleHooks = js.Array[typingsSlinky.awsSdk.autoscalingMod.LifecycleHook]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Pending_
    - typingsSlinky.awsSdk.awsSdkStrings.PendingColonWait
    - typingsSlinky.awsSdk.awsSdkStrings.PendingColonProceed
    - typingsSlinky.awsSdk.awsSdkStrings.Quarantined
    - typingsSlinky.awsSdk.awsSdkStrings.InService
    - typingsSlinky.awsSdk.awsSdkStrings.Terminating_
    - typingsSlinky.awsSdk.awsSdkStrings.TerminatingColonWait
    - typingsSlinky.awsSdk.awsSdkStrings.TerminatingColonProceed
    - typingsSlinky.awsSdk.awsSdkStrings.Terminated_
    - typingsSlinky.awsSdk.awsSdkStrings.Detaching_
    - typingsSlinky.awsSdk.awsSdkStrings.Detached_
    - typingsSlinky.awsSdk.awsSdkStrings.EnteringStandby
    - typingsSlinky.awsSdk.awsSdkStrings.Standby_
    - java.lang.String
  */
  type LifecycleState = typingsSlinky.awsSdk.autoscalingMod._LifecycleState | java.lang.String
  
  type LifecycleTransition = java.lang.String
  
  type LoadBalancerNames = js.Array[typingsSlinky.awsSdk.autoscalingMod.XmlStringMaxLen255]
  
  type LoadBalancerStates = js.Array[typingsSlinky.awsSdk.autoscalingMod.LoadBalancerState]
  
  type LoadBalancerTargetGroupStates = js.Array[typingsSlinky.awsSdk.autoscalingMod.LoadBalancerTargetGroupState]
  
  type MaxInstanceLifetime = scala.Double
  
  type MaxNumberOfAutoScalingGroups = scala.Double
  
  type MaxNumberOfLaunchConfigurations = scala.Double
  
  type MaxRecords = scala.Double
  
  type MetricCollectionTypes = js.Array[typingsSlinky.awsSdk.autoscalingMod.MetricCollectionType]
  
  type MetricDimensionName = java.lang.String
  
  type MetricDimensionValue = java.lang.String
  
  type MetricDimensions = js.Array[typingsSlinky.awsSdk.autoscalingMod.MetricDimension]
  
  type MetricGranularityTypes = js.Array[typingsSlinky.awsSdk.autoscalingMod.MetricGranularityType]
  
  type MetricName = java.lang.String
  
  type MetricNamespace = java.lang.String
  
  type MetricScale = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Average_
    - typingsSlinky.awsSdk.awsSdkStrings.Minimum_
    - typingsSlinky.awsSdk.awsSdkStrings.Maximum_
    - typingsSlinky.awsSdk.awsSdkStrings.SampleCount
    - typingsSlinky.awsSdk.awsSdkStrings.Sum_
    - java.lang.String
  */
  type MetricStatistic = typingsSlinky.awsSdk.autoscalingMod._MetricStatistic | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ASGAverageCPUUtilization
    - typingsSlinky.awsSdk.awsSdkStrings.ASGAverageNetworkIn
    - typingsSlinky.awsSdk.awsSdkStrings.ASGAverageNetworkOut
    - typingsSlinky.awsSdk.awsSdkStrings.ALBRequestCountPerTarget
    - java.lang.String
  */
  type MetricType = typingsSlinky.awsSdk.autoscalingMod._MetricType | java.lang.String
  
  type MetricUnit = java.lang.String
  
  type Metrics = js.Array[typingsSlinky.awsSdk.autoscalingMod.XmlStringMaxLen255]
  
  type MinAdjustmentMagnitude = scala.Double
  
  type MinAdjustmentStep = scala.Double
  
  type MixedInstanceSpotPrice = java.lang.String
  
  type MonitoringEnabled = scala.Boolean
  
  type NoDevice = scala.Boolean
  
  type NotificationConfigurations = js.Array[typingsSlinky.awsSdk.autoscalingMod.NotificationConfiguration]
  
  type NotificationTargetResourceName = java.lang.String
  
  type NumberOfAutoScalingGroups = scala.Double
  
  type NumberOfLaunchConfigurations = scala.Double
  
  type OnDemandBaseCapacity = scala.Double
  
  type OnDemandPercentageAboveBaseCapacity = scala.Double
  
  type Overrides = js.Array[typingsSlinky.awsSdk.autoscalingMod.LaunchTemplateOverrides]
  
  type PolicyIncrement = scala.Double
  
  type PolicyNames = js.Array[typingsSlinky.awsSdk.autoscalingMod.ResourceName]
  
  type PolicyTypes = js.Array[typingsSlinky.awsSdk.autoscalingMod.XmlStringMaxLen64]
  
  type ProcessNames = js.Array[typingsSlinky.awsSdk.autoscalingMod.XmlStringMaxLen255]
  
  type Processes = js.Array[typingsSlinky.awsSdk.autoscalingMod.ProcessType]
  
  type Progress = scala.Double
  
  type PropagateAtLaunch = scala.Boolean
  
  type ProtectedFromScaleIn = scala.Boolean
  
  type RefreshInstanceWarmup = scala.Double
  
  type RefreshStrategy = typingsSlinky.awsSdk.awsSdkStrings.Rolling | java.lang.String
  
  type ResourceName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PendingSpotBidPlacement
    - typingsSlinky.awsSdk.awsSdkStrings.WaitingForSpotInstanceRequestId
    - typingsSlinky.awsSdk.awsSdkStrings.WaitingForSpotInstanceId
    - typingsSlinky.awsSdk.awsSdkStrings.WaitingForInstanceId
    - typingsSlinky.awsSdk.awsSdkStrings.PreInService
    - typingsSlinky.awsSdk.awsSdkStrings.InProgress_
    - typingsSlinky.awsSdk.awsSdkStrings.WaitingForELBConnectionDraining
    - typingsSlinky.awsSdk.awsSdkStrings.MidLifecycleAction
    - typingsSlinky.awsSdk.awsSdkStrings.WaitingForInstanceWarmup
    - typingsSlinky.awsSdk.awsSdkStrings.Successful_
    - typingsSlinky.awsSdk.awsSdkStrings.Failed_
    - typingsSlinky.awsSdk.awsSdkStrings.Cancelled_
    - java.lang.String
  */
  type ScalingActivityStatusCode = typingsSlinky.awsSdk.autoscalingMod._ScalingActivityStatusCode | java.lang.String
  
  type ScalingPolicies = js.Array[typingsSlinky.awsSdk.autoscalingMod.ScalingPolicy]
  
  type ScalingPolicyEnabled = scala.Boolean
  
  type ScheduledActionNames = js.Array[typingsSlinky.awsSdk.autoscalingMod.ResourceName]
  
  type ScheduledUpdateGroupActionRequests = js.Array[typingsSlinky.awsSdk.autoscalingMod.ScheduledUpdateGroupActionRequest]
  
  type ScheduledUpdateGroupActions = js.Array[typingsSlinky.awsSdk.autoscalingMod.ScheduledUpdateGroupAction]
  
  type SecurityGroups = js.Array[typingsSlinky.awsSdk.autoscalingMod.XmlString]
  
  type ShouldDecrementDesiredCapacity = scala.Boolean
  
  type ShouldRespectGracePeriod = scala.Boolean
  
  type SpotInstancePools = scala.Double
  
  type SpotPrice = java.lang.String
  
  type StepAdjustments = js.Array[typingsSlinky.awsSdk.autoscalingMod.StepAdjustment]
  
  type SuspendedProcesses = js.Array[typingsSlinky.awsSdk.autoscalingMod.SuspendedProcess]
  
  type TagDescriptionList = js.Array[typingsSlinky.awsSdk.autoscalingMod.TagDescription]
  
  type TagKey = java.lang.String
  
  type TagValue = java.lang.String
  
  type Tags = js.Array[typingsSlinky.awsSdk.autoscalingMod.Tag]
  
  type TargetGroupARNs = js.Array[typingsSlinky.awsSdk.autoscalingMod.XmlStringMaxLen511]
  
  type TerminationPolicies = js.Array[typingsSlinky.awsSdk.autoscalingMod.XmlStringMaxLen1600]
  
  type TimestampType = js.Date
  
  type Values = js.Array[typingsSlinky.awsSdk.autoscalingMod.XmlString]
  
  type XmlString = java.lang.String
  
  type XmlStringMaxLen1023 = java.lang.String
  
  type XmlStringMaxLen1600 = java.lang.String
  
  type XmlStringMaxLen19 = java.lang.String
  
  type XmlStringMaxLen2047 = java.lang.String
  
  type XmlStringMaxLen255 = java.lang.String
  
  type XmlStringMaxLen32 = java.lang.String
  
  type XmlStringMaxLen511 = java.lang.String
  
  type XmlStringMaxLen64 = java.lang.String
  
  type XmlStringUserData = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2011-01-01`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.autoscalingMod._apiVersion | java.lang.String
}
