package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object elasticacheMod {
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`single-az`
    - typingsSlinky.awsSdk.awsSdkStrings.`cross-az`
    - java.lang.String
  */
  type AZMode = typingsSlinky.awsSdk.elasticacheMod._AZMode | java.lang.String
  type AllowedNodeGroupId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SETTING
    - typingsSlinky.awsSdk.awsSdkStrings.ROTATING
    - java.lang.String
  */
  type AuthTokenUpdateStatus = typingsSlinky.awsSdk.elasticacheMod._AuthTokenUpdateStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SET
    - typingsSlinky.awsSdk.awsSdkStrings.ROTATE
    - java.lang.String
  */
  type AuthTokenUpdateStrategyType = typingsSlinky.awsSdk.elasticacheMod._AuthTokenUpdateStrategyType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.enabled__
    - typingsSlinky.awsSdk.awsSdkStrings.disabled__
    - typingsSlinky.awsSdk.awsSdkStrings.enabling__
    - typingsSlinky.awsSdk.awsSdkStrings.disabling_
    - java.lang.String
  */
  type AutomaticFailoverStatus = typingsSlinky.awsSdk.elasticacheMod._AutomaticFailoverStatus | java.lang.String
  type AvailabilityZonesList = js.Array[typingsSlinky.awsSdk.elasticacheMod.String]
  type Boolean = scala.Boolean
  type BooleanOptional = scala.Boolean
  type CacheClusterIdList = js.Array[typingsSlinky.awsSdk.elasticacheMod.String]
  type CacheClusterList = js.Array[typingsSlinky.awsSdk.elasticacheMod.CacheCluster]
  type CacheEngineVersionList = js.Array[typingsSlinky.awsSdk.elasticacheMod.CacheEngineVersion]
  type CacheNodeIdsList = js.Array[typingsSlinky.awsSdk.elasticacheMod.String]
  type CacheNodeList = js.Array[typingsSlinky.awsSdk.elasticacheMod.CacheNode]
  type CacheNodeTypeSpecificParametersList = js.Array[typingsSlinky.awsSdk.elasticacheMod.CacheNodeTypeSpecificParameter]
  type CacheNodeTypeSpecificValueList = js.Array[typingsSlinky.awsSdk.elasticacheMod.CacheNodeTypeSpecificValue]
  type CacheNodeUpdateStatusList = js.Array[typingsSlinky.awsSdk.elasticacheMod.CacheNodeUpdateStatus]
  type CacheParameterGroupList = js.Array[typingsSlinky.awsSdk.elasticacheMod.CacheParameterGroup]
  type CacheSecurityGroupMembershipList = js.Array[typingsSlinky.awsSdk.elasticacheMod.CacheSecurityGroupMembership]
  type CacheSecurityGroupNameList = js.Array[typingsSlinky.awsSdk.elasticacheMod.String]
  type CacheSecurityGroups = js.Array[typingsSlinky.awsSdk.elasticacheMod.CacheSecurityGroup]
  type CacheSubnetGroups = js.Array[typingsSlinky.awsSdk.elasticacheMod.CacheSubnetGroup]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.immediate_
    - typingsSlinky.awsSdk.awsSdkStrings.`requires-reboot`
    - java.lang.String
  */
  type ChangeType = typingsSlinky.awsSdk.elasticacheMod._ChangeType | java.lang.String
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.elasticacheMod.ClientApiVersions
  type ClusterIdList = js.Array[typingsSlinky.awsSdk.elasticacheMod.String]
  type CustomerNodeEndpointList = js.Array[typingsSlinky.awsSdk.elasticacheMod.CustomerNodeEndpoint]
  type Double = scala.Double
  type EC2SecurityGroupList = js.Array[typingsSlinky.awsSdk.elasticacheMod.EC2SecurityGroup]
  type EventList = js.Array[typingsSlinky.awsSdk.elasticacheMod.Event]
  type Integer = scala.Double
  type IntegerOptional = scala.Double
  type KeyList = js.Array[typingsSlinky.awsSdk.elasticacheMod.String]
  type NodeGroupConfigurationList = js.Array[typingsSlinky.awsSdk.elasticacheMod.NodeGroupConfiguration]
  type NodeGroupList = js.Array[typingsSlinky.awsSdk.elasticacheMod.NodeGroup]
  type NodeGroupMemberList = js.Array[typingsSlinky.awsSdk.elasticacheMod.NodeGroupMember]
  type NodeGroupMemberUpdateStatusList = js.Array[typingsSlinky.awsSdk.elasticacheMod.NodeGroupMemberUpdateStatus]
  type NodeGroupUpdateStatusList = js.Array[typingsSlinky.awsSdk.elasticacheMod.NodeGroupUpdateStatus]
  type NodeGroupsToRemoveList = js.Array[typingsSlinky.awsSdk.elasticacheMod.AllowedNodeGroupId]
  type NodeGroupsToRetainList = js.Array[typingsSlinky.awsSdk.elasticacheMod.AllowedNodeGroupId]
  type NodeSnapshotList = js.Array[typingsSlinky.awsSdk.elasticacheMod.NodeSnapshot]
  type NodeTypeList = js.Array[typingsSlinky.awsSdk.elasticacheMod.String]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.system__
    - typingsSlinky.awsSdk.awsSdkStrings.customer_
    - java.lang.String
  */
  type NodeUpdateInitiatedBy = typingsSlinky.awsSdk.elasticacheMod._NodeUpdateInitiatedBy | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`not-applied`
    - typingsSlinky.awsSdk.awsSdkStrings.`waiting-to-start`
    - typingsSlinky.awsSdk.awsSdkStrings.`in-progress`
    - typingsSlinky.awsSdk.awsSdkStrings.stopping__
    - typingsSlinky.awsSdk.awsSdkStrings.stopped__
    - typingsSlinky.awsSdk.awsSdkStrings.complete__
    - java.lang.String
  */
  type NodeUpdateStatus = typingsSlinky.awsSdk.elasticacheMod._NodeUpdateStatus | java.lang.String
  type ParameterNameValueList = js.Array[typingsSlinky.awsSdk.elasticacheMod.ParameterNameValue]
  type ParametersList = js.Array[typingsSlinky.awsSdk.elasticacheMod.Parameter]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.enabled__
    - typingsSlinky.awsSdk.awsSdkStrings.disabled__
    - java.lang.String
  */
  type PendingAutomaticFailoverStatus = typingsSlinky.awsSdk.elasticacheMod._PendingAutomaticFailoverStatus | java.lang.String
  type PreferredAvailabilityZoneList = js.Array[typingsSlinky.awsSdk.elasticacheMod.String]
  type ProcessedUpdateActionList = js.Array[typingsSlinky.awsSdk.elasticacheMod.ProcessedUpdateAction]
  type RecurringChargeList = js.Array[typingsSlinky.awsSdk.elasticacheMod.RecurringCharge]
  type RemoveReplicasList = js.Array[typingsSlinky.awsSdk.elasticacheMod.String]
  type ReplicaConfigurationList = js.Array[typingsSlinky.awsSdk.elasticacheMod.ConfigureShard]
  type ReplicationGroupIdList = js.Array[typingsSlinky.awsSdk.elasticacheMod.String]
  type ReplicationGroupList = js.Array[typingsSlinky.awsSdk.elasticacheMod.ReplicationGroup]
  type ReservedCacheNodeList = js.Array[typingsSlinky.awsSdk.elasticacheMod.ReservedCacheNode]
  type ReservedCacheNodesOfferingList = js.Array[typingsSlinky.awsSdk.elasticacheMod.ReservedCacheNodesOffering]
  type ReshardingConfigurationList = js.Array[typingsSlinky.awsSdk.elasticacheMod.ReshardingConfiguration]
  type SecurityGroupIdsList = js.Array[typingsSlinky.awsSdk.elasticacheMod.String]
  type SecurityGroupMembershipList = js.Array[typingsSlinky.awsSdk.elasticacheMod.SecurityGroupMembership]
  type ServiceUpdateList = js.Array[typingsSlinky.awsSdk.elasticacheMod.ServiceUpdate]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.critical_
    - typingsSlinky.awsSdk.awsSdkStrings.important
    - typingsSlinky.awsSdk.awsSdkStrings.medium__
    - typingsSlinky.awsSdk.awsSdkStrings.low__
    - java.lang.String
  */
  type ServiceUpdateSeverity = typingsSlinky.awsSdk.elasticacheMod._ServiceUpdateSeverity | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.available__
    - typingsSlinky.awsSdk.awsSdkStrings.cancelled__
    - typingsSlinky.awsSdk.awsSdkStrings.expired__
    - java.lang.String
  */
  type ServiceUpdateStatus = typingsSlinky.awsSdk.elasticacheMod._ServiceUpdateStatus | java.lang.String
  type ServiceUpdateStatusList = js.Array[typingsSlinky.awsSdk.elasticacheMod.ServiceUpdateStatus]
  type ServiceUpdateType = typingsSlinky.awsSdk.awsSdkStrings.`security-update` | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.yes_
    - typingsSlinky.awsSdk.awsSdkStrings.no_
    - typingsSlinky.awsSdk.awsSdkStrings.nSlasha
    - java.lang.String
  */
  type SlaMet = typingsSlinky.awsSdk.elasticacheMod._SlaMet | java.lang.String
  type SnapshotArnsList = js.Array[typingsSlinky.awsSdk.elasticacheMod.String]
  type SnapshotList = js.Array[typingsSlinky.awsSdk.elasticacheMod.Snapshot]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`cache-cluster`
    - typingsSlinky.awsSdk.awsSdkStrings.`cache-parameter-group`
    - typingsSlinky.awsSdk.awsSdkStrings.`cache-security-group`
    - typingsSlinky.awsSdk.awsSdkStrings.`cache-subnet-group`
    - typingsSlinky.awsSdk.awsSdkStrings.`replication-group`
    - java.lang.String
  */
  type SourceType = typingsSlinky.awsSdk.elasticacheMod._SourceType | java.lang.String
  type String = java.lang.String
  type SubnetIdentifierList = js.Array[typingsSlinky.awsSdk.elasticacheMod.String]
  type SubnetList = js.Array[typingsSlinky.awsSdk.elasticacheMod.Subnet]
  type TStamp = js.Date
  type TagList = js.Array[typingsSlinky.awsSdk.elasticacheMod.Tag]
  type UnprocessedUpdateActionList = js.Array[typingsSlinky.awsSdk.elasticacheMod.UnprocessedUpdateAction]
  type UpdateActionList = js.Array[typingsSlinky.awsSdk.elasticacheMod.UpdateAction]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`not-applied`
    - typingsSlinky.awsSdk.awsSdkStrings.`waiting-to-start`
    - typingsSlinky.awsSdk.awsSdkStrings.`in-progress`
    - typingsSlinky.awsSdk.awsSdkStrings.stopping__
    - typingsSlinky.awsSdk.awsSdkStrings.stopped__
    - typingsSlinky.awsSdk.awsSdkStrings.complete__
    - java.lang.String
  */
  type UpdateActionStatus = typingsSlinky.awsSdk.elasticacheMod._UpdateActionStatus | java.lang.String
  type UpdateActionStatusList = js.Array[typingsSlinky.awsSdk.elasticacheMod.UpdateActionStatus]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2012-11-15`
    - typingsSlinky.awsSdk.awsSdkStrings.`2014-03-24`
    - typingsSlinky.awsSdk.awsSdkStrings.`2014-07-15`
    - typingsSlinky.awsSdk.awsSdkStrings.`2014-09-30`
    - typingsSlinky.awsSdk.awsSdkStrings.`2015-02-02`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.elasticacheMod._apiVersion | java.lang.String
}
