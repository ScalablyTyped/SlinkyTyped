package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object redshiftMod {
  type AccountsWithRestoreAccessList = js.Array[typingsSlinky.awsSdk.redshiftMod.AccountWithRestoreAccess]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`restore-cluster`
    - typingsSlinky.awsSdk.awsSdkStrings.`recommend-node-config`
    - typingsSlinky.awsSdk.awsSdkStrings.`resize-cluster`
    - java.lang.String
  */
  type ActionType = typingsSlinky.awsSdk.redshiftMod._ActionType | java.lang.String
  type AssociatedClusterList = js.Array[typingsSlinky.awsSdk.redshiftMod.ClusterAssociatedToSchedule]
  type AttributeList = js.Array[typingsSlinky.awsSdk.redshiftMod.AccountAttribute]
  type AttributeNameList = js.Array[typingsSlinky.awsSdk.redshiftMod.String]
  type AttributeValueList = js.Array[typingsSlinky.awsSdk.redshiftMod.AttributeValueTarget]
  type AvailabilityZoneList = js.Array[typingsSlinky.awsSdk.redshiftMod.AvailabilityZone]
  type BatchSnapshotOperationErrorList = js.Array[typingsSlinky.awsSdk.redshiftMod.SnapshotErrorMessage]
  type BatchSnapshotOperationErrors = js.Array[typingsSlinky.awsSdk.redshiftMod.SnapshotErrorMessage]
  type Boolean = scala.Boolean
  type BooleanOptional = scala.Boolean
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.redshiftMod.ClientApiVersions
  type ClusterDbRevisionsList = js.Array[typingsSlinky.awsSdk.redshiftMod.ClusterDbRevision]
  type ClusterIamRoleList = js.Array[typingsSlinky.awsSdk.redshiftMod.ClusterIamRole]
  type ClusterList = js.Array[typingsSlinky.awsSdk.redshiftMod.Cluster]
  type ClusterNodesList = js.Array[typingsSlinky.awsSdk.redshiftMod.ClusterNode]
  type ClusterParameterGroupStatusList = js.Array[typingsSlinky.awsSdk.redshiftMod.ClusterParameterGroupStatus]
  type ClusterParameterStatusList = js.Array[typingsSlinky.awsSdk.redshiftMod.ClusterParameterStatus]
  type ClusterSecurityGroupMembershipList = js.Array[typingsSlinky.awsSdk.redshiftMod.ClusterSecurityGroupMembership]
  type ClusterSecurityGroupNameList = js.Array[typingsSlinky.awsSdk.redshiftMod.String]
  type ClusterSecurityGroups = js.Array[typingsSlinky.awsSdk.redshiftMod.ClusterSecurityGroup]
  type ClusterSubnetGroups = js.Array[typingsSlinky.awsSdk.redshiftMod.ClusterSubnetGroup]
  type ClusterVersionList = js.Array[typingsSlinky.awsSdk.redshiftMod.ClusterVersion]
  type DbGroupList = js.Array[typingsSlinky.awsSdk.redshiftMod.String]
  type DeferredMaintenanceWindowsList = js.Array[typingsSlinky.awsSdk.redshiftMod.DeferredMaintenanceWindow]
  type DeleteClusterSnapshotMessageList = js.Array[typingsSlinky.awsSdk.redshiftMod.DeleteClusterSnapshotMessage]
  type Double = scala.Double
  type DoubleOptional = scala.Double
  type EC2SecurityGroupList = js.Array[typingsSlinky.awsSdk.redshiftMod.EC2SecurityGroup]
  type EligibleTracksToUpdateList = js.Array[typingsSlinky.awsSdk.redshiftMod.UpdateTarget]
  type EventCategoriesList = js.Array[typingsSlinky.awsSdk.redshiftMod.String]
  type EventCategoriesMapList = js.Array[typingsSlinky.awsSdk.redshiftMod.EventCategoriesMap]
  type EventInfoMapList = js.Array[typingsSlinky.awsSdk.redshiftMod.EventInfoMap]
  type EventList = js.Array[typingsSlinky.awsSdk.redshiftMod.Event]
  type EventSubscriptionsList = js.Array[typingsSlinky.awsSdk.redshiftMod.EventSubscription]
  type HsmClientCertificateList = js.Array[typingsSlinky.awsSdk.redshiftMod.HsmClientCertificate]
  type HsmConfigurationList = js.Array[typingsSlinky.awsSdk.redshiftMod.HsmConfiguration]
  type IPRangeList = js.Array[typingsSlinky.awsSdk.redshiftMod.IPRange]
  type IamRoleArnList = js.Array[typingsSlinky.awsSdk.redshiftMod.String]
  type ImportTablesCompleted = js.Array[typingsSlinky.awsSdk.redshiftMod.String]
  type ImportTablesInProgress = js.Array[typingsSlinky.awsSdk.redshiftMod.String]
  type ImportTablesNotStarted = js.Array[typingsSlinky.awsSdk.redshiftMod.String]
  type Integer = scala.Double
  type IntegerOptional = scala.Double
  type Long = scala.Double
  type LongOptional = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.standard__
    - typingsSlinky.awsSdk.awsSdkStrings.`high-performance`
    - java.lang.String
  */
  type Mode = typingsSlinky.awsSdk.redshiftMod._Mode | java.lang.String
  type NodeConfigurationOptionList = js.Array[typingsSlinky.awsSdk.redshiftMod.NodeConfigurationOption]
  type NodeConfigurationOptionsFilterList = js.Array[typingsSlinky.awsSdk.redshiftMod.NodeConfigurationOptionsFilter]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.NodeType
    - typingsSlinky.awsSdk.awsSdkStrings.NumberOfNodes
    - typingsSlinky.awsSdk.awsSdkStrings.EstimatedDiskUtilizationPercent
    - typingsSlinky.awsSdk.awsSdkStrings.Mode
    - java.lang.String
  */
  type NodeConfigurationOptionsFilterName = typingsSlinky.awsSdk.redshiftMod._NodeConfigurationOptionsFilterName | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.eq_
    - typingsSlinky.awsSdk.awsSdkStrings.lt_
    - typingsSlinky.awsSdk.awsSdkStrings.gt_
    - typingsSlinky.awsSdk.awsSdkStrings.le_
    - typingsSlinky.awsSdk.awsSdkStrings.ge_
    - typingsSlinky.awsSdk.awsSdkStrings.in__
    - typingsSlinky.awsSdk.awsSdkStrings.between_
    - java.lang.String
  */
  type OperatorType = typingsSlinky.awsSdk.redshiftMod._OperatorType | java.lang.String
  type OrderableClusterOptionsList = js.Array[typingsSlinky.awsSdk.redshiftMod.OrderableClusterOption]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.static__
    - typingsSlinky.awsSdk.awsSdkStrings.dynamic__
    - java.lang.String
  */
  type ParameterApplyType = typingsSlinky.awsSdk.redshiftMod._ParameterApplyType | java.lang.String
  type ParameterGroupList = js.Array[typingsSlinky.awsSdk.redshiftMod.ClusterParameterGroup]
  type ParametersList = js.Array[typingsSlinky.awsSdk.redshiftMod.Parameter]
  type PendingActionsList = js.Array[typingsSlinky.awsSdk.redshiftMod.String]
  type RecurringChargeList = js.Array[typingsSlinky.awsSdk.redshiftMod.RecurringCharge]
  type ReservedNodeList = js.Array[typingsSlinky.awsSdk.redshiftMod.ReservedNode]
  type ReservedNodeOfferingList = js.Array[typingsSlinky.awsSdk.redshiftMod.ReservedNodeOffering]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Regular_
    - typingsSlinky.awsSdk.awsSdkStrings.Upgradable
    - java.lang.String
  */
  type ReservedNodeOfferingType = typingsSlinky.awsSdk.redshiftMod._ReservedNodeOfferingType | java.lang.String
  type RestorableNodeTypeList = js.Array[typingsSlinky.awsSdk.redshiftMod.String]
  type RevisionTargetsList = js.Array[typingsSlinky.awsSdk.redshiftMod.RevisionTarget]
  type ScheduleDefinitionList = js.Array[typingsSlinky.awsSdk.redshiftMod.String]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.MODIFYING
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type ScheduleState = typingsSlinky.awsSdk.redshiftMod._ScheduleState | java.lang.String
  type ScheduledActionFilterList = js.Array[typingsSlinky.awsSdk.redshiftMod.ScheduledActionFilter]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`cluster-identifier`
    - typingsSlinky.awsSdk.awsSdkStrings.`iam-role`
    - java.lang.String
  */
  type ScheduledActionFilterName = typingsSlinky.awsSdk.redshiftMod._ScheduledActionFilterName | java.lang.String
  type ScheduledActionList = js.Array[typingsSlinky.awsSdk.redshiftMod.ScheduledAction]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type ScheduledActionState = typingsSlinky.awsSdk.redshiftMod._ScheduledActionState | java.lang.String
  type ScheduledActionTimeList = js.Array[js.Date]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ResizeCluster
    - typingsSlinky.awsSdk.awsSdkStrings.PauseCluster
    - typingsSlinky.awsSdk.awsSdkStrings.ResumeCluster
    - java.lang.String
  */
  type ScheduledActionTypeValues = typingsSlinky.awsSdk.redshiftMod._ScheduledActionTypeValues | java.lang.String
  type ScheduledSnapshotTimeList = js.Array[js.Date]
  type SensitiveString = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SOURCE_TYPE
    - typingsSlinky.awsSdk.awsSdkStrings.TOTAL_SIZE
    - typingsSlinky.awsSdk.awsSdkStrings.CREATE_TIME
    - java.lang.String
  */
  type SnapshotAttributeToSortBy = typingsSlinky.awsSdk.redshiftMod._SnapshotAttributeToSortBy | java.lang.String
  type SnapshotCopyGrantList = js.Array[typingsSlinky.awsSdk.redshiftMod.SnapshotCopyGrant]
  type SnapshotIdentifierList = js.Array[typingsSlinky.awsSdk.redshiftMod.String]
  type SnapshotList = js.Array[typingsSlinky.awsSdk.redshiftMod.Snapshot]
  type SnapshotScheduleList = js.Array[typingsSlinky.awsSdk.redshiftMod.SnapshotSchedule]
  type SnapshotSortingEntityList = js.Array[typingsSlinky.awsSdk.redshiftMod.SnapshotSortingEntity]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ASC
    - typingsSlinky.awsSdk.awsSdkStrings.DESC
    - java.lang.String
  */
  type SortByOrder = typingsSlinky.awsSdk.redshiftMod._SortByOrder | java.lang.String
  type SourceIdsList = js.Array[typingsSlinky.awsSdk.redshiftMod.String]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.cluster_
    - typingsSlinky.awsSdk.awsSdkStrings.`cluster-parameter-group`
    - typingsSlinky.awsSdk.awsSdkStrings.`cluster-security-group`
    - typingsSlinky.awsSdk.awsSdkStrings.`cluster-snapshot`
    - typingsSlinky.awsSdk.awsSdkStrings.`scheduled-action`
    - java.lang.String
  */
  type SourceType = typingsSlinky.awsSdk.redshiftMod._SourceType | java.lang.String
  type String = java.lang.String
  type SubnetIdentifierList = js.Array[typingsSlinky.awsSdk.redshiftMod.String]
  type SubnetList = js.Array[typingsSlinky.awsSdk.redshiftMod.Subnet]
  type SupportedOperationList = js.Array[typingsSlinky.awsSdk.redshiftMod.SupportedOperation]
  type SupportedPlatformsList = js.Array[typingsSlinky.awsSdk.redshiftMod.SupportedPlatform]
  type TStamp = js.Date
  type TableRestoreStatusList = js.Array[typingsSlinky.awsSdk.redshiftMod.TableRestoreStatus]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING
    - typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.SUCCEEDED
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.CANCELED
    - java.lang.String
  */
  type TableRestoreStatusType = typingsSlinky.awsSdk.redshiftMod._TableRestoreStatusType | java.lang.String
  type TagKeyList = js.Array[typingsSlinky.awsSdk.redshiftMod.String]
  type TagList = js.Array[typingsSlinky.awsSdk.redshiftMod.Tag]
  type TagValueList = js.Array[typingsSlinky.awsSdk.redshiftMod.String]
  type TaggedResourceList = js.Array[typingsSlinky.awsSdk.redshiftMod.TaggedResource]
  type TrackList = js.Array[typingsSlinky.awsSdk.redshiftMod.MaintenanceTrack]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.log_
    - typingsSlinky.awsSdk.awsSdkStrings.`emit-metric`
    - typingsSlinky.awsSdk.awsSdkStrings.disable_
    - java.lang.String
  */
  type UsageLimitBreachAction = typingsSlinky.awsSdk.redshiftMod._UsageLimitBreachAction | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.spectrum
    - typingsSlinky.awsSdk.awsSdkStrings.`concurrency-scaling`
    - java.lang.String
  */
  type UsageLimitFeatureType = typingsSlinky.awsSdk.redshiftMod._UsageLimitFeatureType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.time_
    - typingsSlinky.awsSdk.awsSdkStrings.`data-scanned`
    - java.lang.String
  */
  type UsageLimitLimitType = typingsSlinky.awsSdk.redshiftMod._UsageLimitLimitType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.daily__
    - typingsSlinky.awsSdk.awsSdkStrings.weekly__
    - typingsSlinky.awsSdk.awsSdkStrings.monthly_
    - java.lang.String
  */
  type UsageLimitPeriod = typingsSlinky.awsSdk.redshiftMod._UsageLimitPeriod | java.lang.String
  type UsageLimits = js.Array[typingsSlinky.awsSdk.redshiftMod.UsageLimit]
  type ValueStringList = js.Array[typingsSlinky.awsSdk.redshiftMod.String]
  type VpcSecurityGroupIdList = js.Array[typingsSlinky.awsSdk.redshiftMod.String]
  type VpcSecurityGroupMembershipList = js.Array[typingsSlinky.awsSdk.redshiftMod.VpcSecurityGroupMembership]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2012-12-01`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.redshiftMod._apiVersion | java.lang.String
}
