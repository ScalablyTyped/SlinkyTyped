package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object rdsMod {
  type AccountQuotaList = js.Array[typingsSlinky.awsSdk.rdsMod.AccountQuota]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.sync
    - typingsSlinky.awsSdk.awsSdkStrings.async
    - java.lang.String
  */
  type ActivityStreamMode = typingsSlinky.awsSdk.rdsMod._ActivityStreamMode | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.stopped__
    - typingsSlinky.awsSdk.awsSdkStrings.starting__
    - typingsSlinky.awsSdk.awsSdkStrings.started__
    - typingsSlinky.awsSdk.awsSdkStrings.stopping__
    - java.lang.String
  */
  type ActivityStreamStatus = typingsSlinky.awsSdk.rdsMod._ActivityStreamStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.immediate_
    - typingsSlinky.awsSdk.awsSdkStrings.`pending-reboot`
    - java.lang.String
  */
  type ApplyMethod = typingsSlinky.awsSdk.rdsMod._ApplyMethod | java.lang.String
  type AttributeValueList = js.Array[typingsSlinky.awsSdk.rdsMod.String]
  type AuthScheme = typingsSlinky.awsSdk.awsSdkStrings.SECRETS | java.lang.String
  type AvailabilityZoneList = js.Array[typingsSlinky.awsSdk.rdsMod.AvailabilityZone]
  type AvailabilityZones = js.Array[typingsSlinky.awsSdk.rdsMod.String]
  type AvailableProcessorFeatureList = js.Array[typingsSlinky.awsSdk.rdsMod.AvailableProcessorFeature]
  type Boolean = scala.Boolean
  type BooleanOptional = scala.Boolean
  type CertificateList = js.Array[typingsSlinky.awsSdk.rdsMod.Certificate]
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.rdsMod.ClientApiVersions
  type CustomAvailabilityZoneList = js.Array[typingsSlinky.awsSdk.rdsMod.CustomAvailabilityZone]
  type DBClusterBacktrackList = js.Array[typingsSlinky.awsSdk.rdsMod.DBClusterBacktrack]
  type DBClusterEndpointList = js.Array[typingsSlinky.awsSdk.rdsMod.DBClusterEndpoint]
  type DBClusterList = js.Array[typingsSlinky.awsSdk.rdsMod.DBCluster]
  type DBClusterMemberList = js.Array[typingsSlinky.awsSdk.rdsMod.DBClusterMember]
  type DBClusterOptionGroupMemberships = js.Array[typingsSlinky.awsSdk.rdsMod.DBClusterOptionGroupStatus]
  type DBClusterParameterGroupList = js.Array[typingsSlinky.awsSdk.rdsMod.DBClusterParameterGroup]
  type DBClusterRoles = js.Array[typingsSlinky.awsSdk.rdsMod.DBClusterRole]
  type DBClusterSnapshotAttributeList = js.Array[typingsSlinky.awsSdk.rdsMod.DBClusterSnapshotAttribute]
  type DBClusterSnapshotList = js.Array[typingsSlinky.awsSdk.rdsMod.DBClusterSnapshot]
  type DBEngineVersionList = js.Array[typingsSlinky.awsSdk.rdsMod.DBEngineVersion]
  type DBInstanceAutomatedBackupList = js.Array[typingsSlinky.awsSdk.rdsMod.DBInstanceAutomatedBackup]
  type DBInstanceList = js.Array[typingsSlinky.awsSdk.rdsMod.DBInstance]
  type DBInstanceRoles = js.Array[typingsSlinky.awsSdk.rdsMod.DBInstanceRole]
  type DBInstanceStatusInfoList = js.Array[typingsSlinky.awsSdk.rdsMod.DBInstanceStatusInfo]
  type DBParameterGroupList = js.Array[typingsSlinky.awsSdk.rdsMod.DBParameterGroup]
  type DBParameterGroupStatusList = js.Array[typingsSlinky.awsSdk.rdsMod.DBParameterGroupStatus]
  type DBProxyList = js.Array[typingsSlinky.awsSdk.rdsMod.DBProxy]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.available__
    - typingsSlinky.awsSdk.awsSdkStrings.modifying_
    - typingsSlinky.awsSdk.awsSdkStrings.`incompatible-network`
    - typingsSlinky.awsSdk.awsSdkStrings.`insufficient-resource-limits`
    - typingsSlinky.awsSdk.awsSdkStrings.creating__
    - typingsSlinky.awsSdk.awsSdkStrings.deleting__
    - typingsSlinky.awsSdk.awsSdkStrings.suspended__
    - typingsSlinky.awsSdk.awsSdkStrings.suspending
    - typingsSlinky.awsSdk.awsSdkStrings.reactivating
    - java.lang.String
  */
  type DBProxyStatus = typingsSlinky.awsSdk.rdsMod._DBProxyStatus | java.lang.String
  type DBSecurityGroupMembershipList = js.Array[typingsSlinky.awsSdk.rdsMod.DBSecurityGroupMembership]
  type DBSecurityGroupNameList = js.Array[typingsSlinky.awsSdk.rdsMod.String]
  type DBSecurityGroups = js.Array[typingsSlinky.awsSdk.rdsMod.DBSecurityGroup]
  type DBSnapshotAttributeList = js.Array[typingsSlinky.awsSdk.rdsMod.DBSnapshotAttribute]
  type DBSnapshotList = js.Array[typingsSlinky.awsSdk.rdsMod.DBSnapshot]
  type DBSubnetGroups = js.Array[typingsSlinky.awsSdk.rdsMod.DBSubnetGroup]
  type DescribeDBLogFilesList = js.Array[typingsSlinky.awsSdk.rdsMod.DescribeDBLogFilesDetails]
  type DomainMembershipList = js.Array[typingsSlinky.awsSdk.rdsMod.DomainMembership]
  type Double = scala.Double
  type DoubleOptional = scala.Double
  type DoubleRangeList = js.Array[typingsSlinky.awsSdk.rdsMod.DoubleRange]
  type EC2SecurityGroupList = js.Array[typingsSlinky.awsSdk.rdsMod.EC2SecurityGroup]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.MYSQL
    - typingsSlinky.awsSdk.awsSdkStrings.POSTGRESQL
    - java.lang.String
  */
  type EngineFamily = typingsSlinky.awsSdk.rdsMod._EngineFamily | java.lang.String
  type EngineModeList = js.Array[typingsSlinky.awsSdk.rdsMod.String]
  type EventCategoriesList = js.Array[typingsSlinky.awsSdk.rdsMod.String]
  type EventCategoriesMapList = js.Array[typingsSlinky.awsSdk.rdsMod.EventCategoriesMap]
  type EventList = js.Array[typingsSlinky.awsSdk.rdsMod.Event]
  type EventSubscriptionsList = js.Array[typingsSlinky.awsSdk.rdsMod.EventSubscription]
  type ExportTasksList = js.Array[typingsSlinky.awsSdk.rdsMod.ExportTask]
  type FeatureNameList = js.Array[typingsSlinky.awsSdk.rdsMod.String]
  type FilterList = js.Array[typingsSlinky.awsSdk.rdsMod.Filter]
  type FilterValueList = js.Array[typingsSlinky.awsSdk.rdsMod.String]
  type GlobalClusterList = js.Array[typingsSlinky.awsSdk.rdsMod.GlobalCluster]
  type GlobalClusterMemberList = js.Array[typingsSlinky.awsSdk.rdsMod.GlobalClusterMember]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.DISABLED
    - typingsSlinky.awsSdk.awsSdkStrings.REQUIRED
    - java.lang.String
  */
  type IAMAuthMode = typingsSlinky.awsSdk.rdsMod._IAMAuthMode | java.lang.String
  type IPRangeList = js.Array[typingsSlinky.awsSdk.rdsMod.IPRange]
  type InstallationMediaList = js.Array[typingsSlinky.awsSdk.rdsMod.InstallationMedia]
  type Integer = scala.Double
  type IntegerOptional = scala.Double
  type KeyList = js.Array[typingsSlinky.awsSdk.rdsMod.String]
  type LogTypeList = js.Array[typingsSlinky.awsSdk.rdsMod.String]
  type Long = scala.Double
  type LongOptional = scala.Double
  type MaxRecords = scala.Double
  type MinimumEngineVersionPerAllowedValueList = js.Array[typingsSlinky.awsSdk.rdsMod.MinimumEngineVersionPerAllowedValue]
  type OptionConfigurationList = js.Array[typingsSlinky.awsSdk.rdsMod.OptionConfiguration]
  type OptionGroupMembershipList = js.Array[typingsSlinky.awsSdk.rdsMod.OptionGroupMembership]
  type OptionGroupOptionSettingsList = js.Array[typingsSlinky.awsSdk.rdsMod.OptionGroupOptionSetting]
  type OptionGroupOptionVersionsList = js.Array[typingsSlinky.awsSdk.rdsMod.OptionVersion]
  type OptionGroupOptionsList = js.Array[typingsSlinky.awsSdk.rdsMod.OptionGroupOption]
  type OptionGroupsList = js.Array[typingsSlinky.awsSdk.rdsMod.OptionGroup]
  type OptionNamesList = js.Array[typingsSlinky.awsSdk.rdsMod.String]
  type OptionSettingConfigurationList = js.Array[typingsSlinky.awsSdk.rdsMod.OptionSetting]
  type OptionSettingsList = js.Array[typingsSlinky.awsSdk.rdsMod.OptionSetting]
  type OptionsConflictsWith = js.Array[typingsSlinky.awsSdk.rdsMod.String]
  type OptionsDependedOn = js.Array[typingsSlinky.awsSdk.rdsMod.String]
  type OptionsList = js.Array[typingsSlinky.awsSdk.rdsMod.Option]
  type OrderableDBInstanceOptionsList = js.Array[typingsSlinky.awsSdk.rdsMod.OrderableDBInstanceOption]
  type ParametersList = js.Array[typingsSlinky.awsSdk.rdsMod.Parameter]
  type PendingMaintenanceActionDetails = js.Array[typingsSlinky.awsSdk.rdsMod.PendingMaintenanceAction]
  type PendingMaintenanceActions = js.Array[typingsSlinky.awsSdk.rdsMod.ResourcePendingMaintenanceActions]
  type ProcessorFeatureList = js.Array[typingsSlinky.awsSdk.rdsMod.ProcessorFeature]
  type RangeList = js.Array[typingsSlinky.awsSdk.rdsMod.Range]
  type ReadReplicaDBClusterIdentifierList = js.Array[typingsSlinky.awsSdk.rdsMod.String]
  type ReadReplicaDBInstanceIdentifierList = js.Array[typingsSlinky.awsSdk.rdsMod.String]
  type ReadReplicaIdentifierList = js.Array[typingsSlinky.awsSdk.rdsMod.String]
  type ReadersArnList = js.Array[typingsSlinky.awsSdk.rdsMod.String]
  type RecurringChargeList = js.Array[typingsSlinky.awsSdk.rdsMod.RecurringCharge]
  type ReservedDBInstanceList = js.Array[typingsSlinky.awsSdk.rdsMod.ReservedDBInstance]
  type ReservedDBInstancesOfferingList = js.Array[typingsSlinky.awsSdk.rdsMod.ReservedDBInstancesOffering]
  type SourceIdsList = js.Array[typingsSlinky.awsSdk.rdsMod.String]
  type SourceRegionList = js.Array[typingsSlinky.awsSdk.rdsMod.SourceRegion]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`db-instance`
    - typingsSlinky.awsSdk.awsSdkStrings.`db-parameter-group`
    - typingsSlinky.awsSdk.awsSdkStrings.`db-security-group`
    - typingsSlinky.awsSdk.awsSdkStrings.`db-snapshot`
    - typingsSlinky.awsSdk.awsSdkStrings.`db-cluster`
    - typingsSlinky.awsSdk.awsSdkStrings.`db-cluster-snapshot`
    - java.lang.String
  */
  type SourceType = typingsSlinky.awsSdk.rdsMod._SourceType | java.lang.String
  type String = java.lang.String
  type StringList = js.Array[typingsSlinky.awsSdk.rdsMod.String]
  type StringSensitive = java.lang.String
  type SubnetIdentifierList = js.Array[typingsSlinky.awsSdk.rdsMod.String]
  type SubnetList = js.Array[typingsSlinky.awsSdk.rdsMod.Subnet]
  type SupportedCharacterSetsList = js.Array[typingsSlinky.awsSdk.rdsMod.CharacterSet]
  type SupportedTimezonesList = js.Array[typingsSlinky.awsSdk.rdsMod.Timezone]
  type TStamp = js.Date
  type TagList = js.Array[typingsSlinky.awsSdk.rdsMod.Tag]
  type TargetGroupList = js.Array[typingsSlinky.awsSdk.rdsMod.DBProxyTargetGroup]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.UNREACHABLE
    - typingsSlinky.awsSdk.awsSdkStrings.CONNECTION_FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.AUTH_FAILURE
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING_PROXY_CAPACITY
    - java.lang.String
  */
  type TargetHealthReason = typingsSlinky.awsSdk.rdsMod._TargetHealthReason | java.lang.String
  type TargetList = js.Array[typingsSlinky.awsSdk.rdsMod.DBProxyTarget]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.REGISTERING
    - typingsSlinky.awsSdk.awsSdkStrings.AVAILABLE
    - typingsSlinky.awsSdk.awsSdkStrings.UNAVAILABLE
    - java.lang.String
  */
  type TargetState = typingsSlinky.awsSdk.rdsMod._TargetState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.RDS_INSTANCE
    - typingsSlinky.awsSdk.awsSdkStrings.RDS_SERVERLESS_ENDPOINT
    - typingsSlinky.awsSdk.awsSdkStrings.TRACKED_CLUSTER
    - java.lang.String
  */
  type TargetType = typingsSlinky.awsSdk.rdsMod._TargetType | java.lang.String
  type UserAuthConfigInfoList = js.Array[typingsSlinky.awsSdk.rdsMod.UserAuthConfigInfo]
  type UserAuthConfigList = js.Array[typingsSlinky.awsSdk.rdsMod.UserAuthConfig]
  type ValidStorageOptionsList = js.Array[typingsSlinky.awsSdk.rdsMod.ValidStorageOptions]
  type ValidUpgradeTargetList = js.Array[typingsSlinky.awsSdk.rdsMod.UpgradeTarget]
  type VpcSecurityGroupIdList = js.Array[typingsSlinky.awsSdk.rdsMod.String]
  type VpcSecurityGroupMembershipList = js.Array[typingsSlinky.awsSdk.rdsMod.VpcSecurityGroupMembership]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2013-01-10`
    - typingsSlinky.awsSdk.awsSdkStrings.`2013-02-12`
    - typingsSlinky.awsSdk.awsSdkStrings.`2013-09-09`
    - typingsSlinky.awsSdk.awsSdkStrings.`2014-09-01`
    - typingsSlinky.awsSdk.awsSdkStrings.`2014-10-31`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.rdsMod._apiVersion | java.lang.String
}
