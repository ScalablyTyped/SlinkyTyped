package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object emrMod {
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.TERMINATE_JOB_FLOW
    - typingsSlinky.awsSdk.awsSdkStrings.TERMINATE_CLUSTER
    - typingsSlinky.awsSdk.awsSdkStrings.CANCEL_AND_WAIT
    - typingsSlinky.awsSdk.awsSdkStrings.CONTINUE
    - java.lang.String
  */
  type ActionOnFailure = typingsSlinky.awsSdk.emrMod._ActionOnFailure | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CHANGE_IN_CAPACITY
    - typingsSlinky.awsSdk.awsSdkStrings.PERCENT_CHANGE_IN_CAPACITY
    - typingsSlinky.awsSdk.awsSdkStrings.EXACT_CAPACITY
    - java.lang.String
  */
  type AdjustmentType = typingsSlinky.awsSdk.emrMod._AdjustmentType | java.lang.String
  type ApplicationList = js.Array[typingsSlinky.awsSdk.emrMod.Application]
  type ArnType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING
    - typingsSlinky.awsSdk.awsSdkStrings.ATTACHING
    - typingsSlinky.awsSdk.awsSdkStrings.ATTACHED
    - typingsSlinky.awsSdk.awsSdkStrings.DETACHING
    - typingsSlinky.awsSdk.awsSdkStrings.DETACHED
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type AutoScalingPolicyState = typingsSlinky.awsSdk.emrMod._AutoScalingPolicyState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.USER_REQUEST
    - typingsSlinky.awsSdk.awsSdkStrings.PROVISION_FAILURE
    - typingsSlinky.awsSdk.awsSdkStrings.CLEANUP_FAILURE
    - java.lang.String
  */
  type AutoScalingPolicyStateChangeReasonCode = typingsSlinky.awsSdk.emrMod._AutoScalingPolicyStateChangeReasonCode | java.lang.String
  type Boolean = scala.Boolean
  type BooleanObject = scala.Boolean
  type BootstrapActionConfigList = js.Array[typingsSlinky.awsSdk.emrMod.BootstrapActionConfig]
  type BootstrapActionDetailList = js.Array[typingsSlinky.awsSdk.emrMod.BootstrapActionDetail]
  type CancelStepsInfoList = js.Array[typingsSlinky.awsSdk.emrMod.CancelStepsInfo]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SUBMITTED
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type CancelStepsRequestStatus = typingsSlinky.awsSdk.emrMod._CancelStepsRequestStatus | java.lang.String
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.emrMod.ClientApiVersions
  type ClusterId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.STARTING
    - typingsSlinky.awsSdk.awsSdkStrings.BOOTSTRAPPING
    - typingsSlinky.awsSdk.awsSdkStrings.RUNNING
    - typingsSlinky.awsSdk.awsSdkStrings.WAITING
    - typingsSlinky.awsSdk.awsSdkStrings.TERMINATING
    - typingsSlinky.awsSdk.awsSdkStrings.TERMINATED
    - typingsSlinky.awsSdk.awsSdkStrings.TERMINATED_WITH_ERRORS
    - java.lang.String
  */
  type ClusterState = typingsSlinky.awsSdk.emrMod._ClusterState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.INTERNAL_ERROR
    - typingsSlinky.awsSdk.awsSdkStrings.VALIDATION_ERROR
    - typingsSlinky.awsSdk.awsSdkStrings.INSTANCE_FAILURE
    - typingsSlinky.awsSdk.awsSdkStrings.INSTANCE_FLEET_TIMEOUT
    - typingsSlinky.awsSdk.awsSdkStrings.BOOTSTRAP_FAILURE
    - typingsSlinky.awsSdk.awsSdkStrings.USER_REQUEST
    - typingsSlinky.awsSdk.awsSdkStrings.STEP_FAILURE
    - typingsSlinky.awsSdk.awsSdkStrings.ALL_STEPS_COMPLETED
    - java.lang.String
  */
  type ClusterStateChangeReasonCode = typingsSlinky.awsSdk.emrMod._ClusterStateChangeReasonCode | java.lang.String
  type ClusterStateList = js.Array[typingsSlinky.awsSdk.emrMod.ClusterState]
  type ClusterSummaryList = js.Array[typingsSlinky.awsSdk.emrMod.ClusterSummary]
  type CommandList = js.Array[typingsSlinky.awsSdk.emrMod.Command]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.GREATER_THAN_OR_EQUAL
    - typingsSlinky.awsSdk.awsSdkStrings.GREATER_THAN
    - typingsSlinky.awsSdk.awsSdkStrings.LESS_THAN
    - typingsSlinky.awsSdk.awsSdkStrings.LESS_THAN_OR_EQUAL
    - java.lang.String
  */
  type ComparisonOperator = typingsSlinky.awsSdk.emrMod._ComparisonOperator | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.InstanceFleetUnits
    - typingsSlinky.awsSdk.awsSdkStrings.Instances
    - typingsSlinky.awsSdk.awsSdkStrings.VCPU
    - java.lang.String
  */
  type ComputeLimitsUnitType = typingsSlinky.awsSdk.emrMod._ComputeLimitsUnitType | java.lang.String
  type ConfigurationList = js.Array[typingsSlinky.awsSdk.emrMod.Configuration]
  type Date = js.Date
  type EC2InstanceIdsList = js.Array[typingsSlinky.awsSdk.emrMod.InstanceId]
  type EC2InstanceIdsToTerminateList = js.Array[typingsSlinky.awsSdk.emrMod.InstanceId]
  type EbsBlockDeviceConfigList = js.Array[typingsSlinky.awsSdk.emrMod.EbsBlockDeviceConfig]
  type EbsBlockDeviceList = js.Array[typingsSlinky.awsSdk.emrMod.EbsBlockDevice]
  type EbsVolumeList = js.Array[typingsSlinky.awsSdk.emrMod.EbsVolume]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.INSTANCE_FLEET
    - typingsSlinky.awsSdk.awsSdkStrings.INSTANCE_GROUP
    - java.lang.String
  */
  type InstanceCollectionType = typingsSlinky.awsSdk.emrMod._InstanceCollectionType | java.lang.String
  type InstanceFleetConfigList = js.Array[typingsSlinky.awsSdk.emrMod.InstanceFleetConfig]
  type InstanceFleetId = java.lang.String
  type InstanceFleetList = js.Array[typingsSlinky.awsSdk.emrMod.InstanceFleet]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PROVISIONING
    - typingsSlinky.awsSdk.awsSdkStrings.BOOTSTRAPPING
    - typingsSlinky.awsSdk.awsSdkStrings.RUNNING
    - typingsSlinky.awsSdk.awsSdkStrings.RESIZING
    - typingsSlinky.awsSdk.awsSdkStrings.SUSPENDED
    - typingsSlinky.awsSdk.awsSdkStrings.TERMINATING
    - typingsSlinky.awsSdk.awsSdkStrings.TERMINATED
    - java.lang.String
  */
  type InstanceFleetState = typingsSlinky.awsSdk.emrMod._InstanceFleetState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.INTERNAL_ERROR
    - typingsSlinky.awsSdk.awsSdkStrings.VALIDATION_ERROR
    - typingsSlinky.awsSdk.awsSdkStrings.INSTANCE_FAILURE
    - typingsSlinky.awsSdk.awsSdkStrings.CLUSTER_TERMINATED
    - java.lang.String
  */
  type InstanceFleetStateChangeReasonCode = typingsSlinky.awsSdk.emrMod._InstanceFleetStateChangeReasonCode | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.MASTER
    - typingsSlinky.awsSdk.awsSdkStrings.CORE
    - typingsSlinky.awsSdk.awsSdkStrings.TASK
    - java.lang.String
  */
  type InstanceFleetType = typingsSlinky.awsSdk.emrMod._InstanceFleetType | java.lang.String
  type InstanceGroupConfigList = js.Array[typingsSlinky.awsSdk.emrMod.InstanceGroupConfig]
  type InstanceGroupDetailList = js.Array[typingsSlinky.awsSdk.emrMod.InstanceGroupDetail]
  type InstanceGroupId = java.lang.String
  type InstanceGroupIdsList = js.Array[typingsSlinky.awsSdk.emrMod.XmlStringMaxLen256]
  type InstanceGroupList = js.Array[typingsSlinky.awsSdk.emrMod.InstanceGroup]
  type InstanceGroupModifyConfigList = js.Array[typingsSlinky.awsSdk.emrMod.InstanceGroupModifyConfig]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PROVISIONING
    - typingsSlinky.awsSdk.awsSdkStrings.BOOTSTRAPPING
    - typingsSlinky.awsSdk.awsSdkStrings.RUNNING
    - typingsSlinky.awsSdk.awsSdkStrings.RECONFIGURING
    - typingsSlinky.awsSdk.awsSdkStrings.RESIZING
    - typingsSlinky.awsSdk.awsSdkStrings.SUSPENDED
    - typingsSlinky.awsSdk.awsSdkStrings.TERMINATING
    - typingsSlinky.awsSdk.awsSdkStrings.TERMINATED
    - typingsSlinky.awsSdk.awsSdkStrings.ARRESTED
    - typingsSlinky.awsSdk.awsSdkStrings.SHUTTING_DOWN
    - typingsSlinky.awsSdk.awsSdkStrings.ENDED
    - java.lang.String
  */
  type InstanceGroupState = typingsSlinky.awsSdk.emrMod._InstanceGroupState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.INTERNAL_ERROR
    - typingsSlinky.awsSdk.awsSdkStrings.VALIDATION_ERROR
    - typingsSlinky.awsSdk.awsSdkStrings.INSTANCE_FAILURE
    - typingsSlinky.awsSdk.awsSdkStrings.CLUSTER_TERMINATED
    - java.lang.String
  */
  type InstanceGroupStateChangeReasonCode = typingsSlinky.awsSdk.emrMod._InstanceGroupStateChangeReasonCode | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.MASTER
    - typingsSlinky.awsSdk.awsSdkStrings.CORE
    - typingsSlinky.awsSdk.awsSdkStrings.TASK
    - java.lang.String
  */
  type InstanceGroupType = typingsSlinky.awsSdk.emrMod._InstanceGroupType | java.lang.String
  type InstanceGroupTypeList = js.Array[typingsSlinky.awsSdk.emrMod.InstanceGroupType]
  type InstanceId = java.lang.String
  type InstanceList = js.Array[typingsSlinky.awsSdk.emrMod.Instance]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.MASTER
    - typingsSlinky.awsSdk.awsSdkStrings.CORE
    - typingsSlinky.awsSdk.awsSdkStrings.TASK
    - java.lang.String
  */
  type InstanceRoleType = typingsSlinky.awsSdk.emrMod._InstanceRoleType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.AWAITING_FULFILLMENT
    - typingsSlinky.awsSdk.awsSdkStrings.PROVISIONING
    - typingsSlinky.awsSdk.awsSdkStrings.BOOTSTRAPPING
    - typingsSlinky.awsSdk.awsSdkStrings.RUNNING
    - typingsSlinky.awsSdk.awsSdkStrings.TERMINATED
    - java.lang.String
  */
  type InstanceState = typingsSlinky.awsSdk.emrMod._InstanceState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.INTERNAL_ERROR
    - typingsSlinky.awsSdk.awsSdkStrings.VALIDATION_ERROR
    - typingsSlinky.awsSdk.awsSdkStrings.INSTANCE_FAILURE
    - typingsSlinky.awsSdk.awsSdkStrings.BOOTSTRAP_FAILURE
    - typingsSlinky.awsSdk.awsSdkStrings.CLUSTER_TERMINATED
    - java.lang.String
  */
  type InstanceStateChangeReasonCode = typingsSlinky.awsSdk.emrMod._InstanceStateChangeReasonCode | java.lang.String
  type InstanceStateList = js.Array[typingsSlinky.awsSdk.emrMod.InstanceState]
  type InstanceType = java.lang.String
  type InstanceTypeConfigList = js.Array[typingsSlinky.awsSdk.emrMod.InstanceTypeConfig]
  type InstanceTypeSpecificationList = js.Array[typingsSlinky.awsSdk.emrMod.InstanceTypeSpecification]
  type Integer = scala.Double
  type JobFlowDetailList = js.Array[typingsSlinky.awsSdk.emrMod.JobFlowDetail]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.STARTING
    - typingsSlinky.awsSdk.awsSdkStrings.BOOTSTRAPPING
    - typingsSlinky.awsSdk.awsSdkStrings.RUNNING
    - typingsSlinky.awsSdk.awsSdkStrings.WAITING
    - typingsSlinky.awsSdk.awsSdkStrings.SHUTTING_DOWN
    - typingsSlinky.awsSdk.awsSdkStrings.TERMINATED
    - typingsSlinky.awsSdk.awsSdkStrings.COMPLETED
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type JobFlowExecutionState = typingsSlinky.awsSdk.emrMod._JobFlowExecutionState | java.lang.String
  type JobFlowExecutionStateList = js.Array[typingsSlinky.awsSdk.emrMod.JobFlowExecutionState]
  type KeyValueList = js.Array[typingsSlinky.awsSdk.emrMod.KeyValue]
  type Long = scala.Double
  type Marker = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ON_DEMAND
    - typingsSlinky.awsSdk.awsSdkStrings.SPOT
    - java.lang.String
  */
  type MarketType = typingsSlinky.awsSdk.emrMod._MarketType | java.lang.String
  type MetricDimensionList = js.Array[typingsSlinky.awsSdk.emrMod.MetricDimension]
  type NewSupportedProductsList = js.Array[typingsSlinky.awsSdk.emrMod.SupportedProductConfig]
  type NonNegativeDouble = scala.Double
  type OnDemandProvisioningAllocationStrategy = typingsSlinky.awsSdk.awsSdkStrings.`lowest-price` | java.lang.String
  type OptionalArnType = java.lang.String
  type Port = scala.Double
  type PortRanges = js.Array[typingsSlinky.awsSdk.emrMod.PortRange]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SECURITY
    - typingsSlinky.awsSdk.awsSdkStrings.NONE
    - java.lang.String
  */
  type RepoUpgradeOnBoot = typingsSlinky.awsSdk.emrMod._RepoUpgradeOnBoot | java.lang.String
  type ResourceId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.TERMINATE_AT_INSTANCE_HOUR
    - typingsSlinky.awsSdk.awsSdkStrings.TERMINATE_AT_TASK_COMPLETION
    - java.lang.String
  */
  type ScaleDownBehavior = typingsSlinky.awsSdk.emrMod._ScaleDownBehavior | java.lang.String
  type ScalingRuleList = js.Array[typingsSlinky.awsSdk.emrMod.ScalingRule]
  type SecurityConfigurationList = js.Array[typingsSlinky.awsSdk.emrMod.SecurityConfigurationSummary]
  type SecurityGroupsList = js.Array[typingsSlinky.awsSdk.emrMod.XmlStringMaxLen256]
  type SpotProvisioningAllocationStrategy = typingsSlinky.awsSdk.awsSdkStrings.`capacity-optimized` | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SWITCH_TO_ON_DEMAND
    - typingsSlinky.awsSdk.awsSdkStrings.TERMINATE_CLUSTER
    - java.lang.String
  */
  type SpotProvisioningTimeoutAction = typingsSlinky.awsSdk.emrMod._SpotProvisioningTimeoutAction | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SAMPLE_COUNT
    - typingsSlinky.awsSdk.awsSdkStrings.AVERAGE
    - typingsSlinky.awsSdk.awsSdkStrings.SUM
    - typingsSlinky.awsSdk.awsSdkStrings.MINIMUM
    - typingsSlinky.awsSdk.awsSdkStrings.MAXIMUM
    - java.lang.String
  */
  type Statistic = typingsSlinky.awsSdk.emrMod._Statistic | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SEND_INTERRUPT
    - typingsSlinky.awsSdk.awsSdkStrings.TERMINATE_PROCESS
    - java.lang.String
  */
  type StepCancellationOption = typingsSlinky.awsSdk.emrMod._StepCancellationOption | java.lang.String
  type StepConfigList = js.Array[typingsSlinky.awsSdk.emrMod.StepConfig]
  type StepDetailList = js.Array[typingsSlinky.awsSdk.emrMod.StepDetail]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING
    - typingsSlinky.awsSdk.awsSdkStrings.RUNNING
    - typingsSlinky.awsSdk.awsSdkStrings.CONTINUE
    - typingsSlinky.awsSdk.awsSdkStrings.COMPLETED
    - typingsSlinky.awsSdk.awsSdkStrings.CANCELLED
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.INTERRUPTED
    - java.lang.String
  */
  type StepExecutionState = typingsSlinky.awsSdk.emrMod._StepExecutionState | java.lang.String
  type StepId = java.lang.String
  type StepIdsList = js.Array[typingsSlinky.awsSdk.emrMod.XmlStringMaxLen256]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING
    - typingsSlinky.awsSdk.awsSdkStrings.CANCEL_PENDING
    - typingsSlinky.awsSdk.awsSdkStrings.RUNNING
    - typingsSlinky.awsSdk.awsSdkStrings.COMPLETED
    - typingsSlinky.awsSdk.awsSdkStrings.CANCELLED
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.INTERRUPTED
    - java.lang.String
  */
  type StepState = typingsSlinky.awsSdk.emrMod._StepState | java.lang.String
  type StepStateChangeReasonCode = typingsSlinky.awsSdk.awsSdkStrings.NONE | java.lang.String
  type StepStateList = js.Array[typingsSlinky.awsSdk.emrMod.StepState]
  type StepSummaryList = js.Array[typingsSlinky.awsSdk.emrMod.StepSummary]
  type String = java.lang.String
  type StringList = js.Array[typingsSlinky.awsSdk.emrMod.String]
  type StringMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.emrMod.String]
  type SupportedProductsList = js.Array[typingsSlinky.awsSdk.emrMod.XmlStringMaxLen256]
  type TagList = js.Array[typingsSlinky.awsSdk.emrMod.Tag]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.NONE
    - typingsSlinky.awsSdk.awsSdkStrings.SECONDS
    - typingsSlinky.awsSdk.awsSdkStrings.MICRO_SECONDS
    - typingsSlinky.awsSdk.awsSdkStrings.MILLI_SECONDS
    - typingsSlinky.awsSdk.awsSdkStrings.BYTES
    - typingsSlinky.awsSdk.awsSdkStrings.KILO_BYTES
    - typingsSlinky.awsSdk.awsSdkStrings.MEGA_BYTES
    - typingsSlinky.awsSdk.awsSdkStrings.GIGA_BYTES
    - typingsSlinky.awsSdk.awsSdkStrings.TERA_BYTES
    - typingsSlinky.awsSdk.awsSdkStrings.BITS
    - typingsSlinky.awsSdk.awsSdkStrings.KILO_BITS
    - typingsSlinky.awsSdk.awsSdkStrings.MEGA_BITS
    - typingsSlinky.awsSdk.awsSdkStrings.GIGA_BITS
    - typingsSlinky.awsSdk.awsSdkStrings.TERA_BITS
    - typingsSlinky.awsSdk.awsSdkStrings.PERCENT
    - typingsSlinky.awsSdk.awsSdkStrings.COUNT
    - typingsSlinky.awsSdk.awsSdkStrings.BYTES_PER_SECOND
    - typingsSlinky.awsSdk.awsSdkStrings.KILO_BYTES_PER_SECOND
    - typingsSlinky.awsSdk.awsSdkStrings.MEGA_BYTES_PER_SECOND
    - typingsSlinky.awsSdk.awsSdkStrings.GIGA_BYTES_PER_SECOND
    - typingsSlinky.awsSdk.awsSdkStrings.TERA_BYTES_PER_SECOND
    - typingsSlinky.awsSdk.awsSdkStrings.BITS_PER_SECOND
    - typingsSlinky.awsSdk.awsSdkStrings.KILO_BITS_PER_SECOND
    - typingsSlinky.awsSdk.awsSdkStrings.MEGA_BITS_PER_SECOND
    - typingsSlinky.awsSdk.awsSdkStrings.GIGA_BITS_PER_SECOND
    - typingsSlinky.awsSdk.awsSdkStrings.TERA_BITS_PER_SECOND
    - typingsSlinky.awsSdk.awsSdkStrings.COUNT_PER_SECOND
    - java.lang.String
  */
  type Unit = typingsSlinky.awsSdk.emrMod._Unit | java.lang.String
  type WholeNumber = scala.Double
  type XmlString = java.lang.String
  type XmlStringList = js.Array[typingsSlinky.awsSdk.emrMod.XmlString]
  type XmlStringMaxLen256 = java.lang.String
  type XmlStringMaxLen256List = js.Array[typingsSlinky.awsSdk.emrMod.XmlStringMaxLen256]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2009-03-31`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.emrMod._apiVersion | java.lang.String
}
