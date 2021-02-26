package typingsSlinky.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Snapshot extends StObject {
  
  /**
    * The ARN (Amazon Resource Name) of the snapshot.
    */
  var ARN: js.UndefOr[String] = js.native
  
  /**
    * This parameter is currently disabled.
    */
  var AutoMinorVersionUpgrade: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates the status of automatic failover for the source Redis replication group.
    */
  var AutomaticFailover: js.UndefOr[AutomaticFailoverStatus] = js.native
  
  /**
    * The date and time when the source cluster was created.
    */
  var CacheClusterCreateTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The user-supplied identifier of the source cluster.
    */
  var CacheClusterId: js.UndefOr[String] = js.native
  
  /**
    * The name of the compute and memory capacity node type for the source cluster. The following node types are supported by ElastiCache. Generally speaking, the current generation types provide more memory and computational power at lower cost when compared to their equivalent previous generation counterparts.   General purpose:   Current generation:   M6g node types (available only for Redis engine version 5.0.6 onward and for Memcached engine version 1.5.16 onward).  cache.m6g.large, cache.m6g.xlarge, cache.m6g.2xlarge, cache.m6g.4xlarge, cache.m6g.8xlarge, cache.m6g.12xlarge, cache.m6g.16xlarge   At this time, M6g node types are available in the following regions: us-east-1, us-west-2, us-east-2, eu-central-1, eu-west-1 and ap-northeast-1.   M5 node types: cache.m5.large, cache.m5.xlarge, cache.m5.2xlarge, cache.m5.4xlarge, cache.m5.12xlarge, cache.m5.24xlarge   M4 node types: cache.m4.large, cache.m4.xlarge, cache.m4.2xlarge, cache.m4.4xlarge, cache.m4.10xlarge   T3 node types: cache.t3.micro, cache.t3.small, cache.t3.medium   T2 node types: cache.t2.micro, cache.t2.small, cache.t2.medium    Previous generation: (not recommended)  T1 node types: cache.t1.micro   M1 node types: cache.m1.small, cache.m1.medium, cache.m1.large, cache.m1.xlarge   M3 node types: cache.m3.medium, cache.m3.large, cache.m3.xlarge, cache.m3.2xlarge      Compute optimized:   Previous generation: (not recommended)  C1 node types: cache.c1.xlarge      Memory optimized:   Current generation:   R6g node types (available only for Redis engine version 5.0.6 onward and for Memcached engine version 1.5.16 onward).  cache.r6g.large, cache.r6g.xlarge, cache.r6g.2xlarge, cache.r6g.4xlarge, cache.r6g.8xlarge, cache.r6g.12xlarge, cache.r6g.16xlarge   At this time, R6g node types are available in the following regions: us-east-1, us-west-2, us-east-2, eu-central-1, eu-west-1 and ap-northeast-1.   R5 node types: cache.r5.large, cache.r5.xlarge, cache.r5.2xlarge, cache.r5.4xlarge, cache.r5.12xlarge, cache.r5.24xlarge   R4 node types: cache.r4.large, cache.r4.xlarge, cache.r4.2xlarge, cache.r4.4xlarge, cache.r4.8xlarge, cache.r4.16xlarge    Previous generation: (not recommended)  M2 node types: cache.m2.xlarge, cache.m2.2xlarge, cache.m2.4xlarge   R3 node types: cache.r3.large, cache.r3.xlarge, cache.r3.2xlarge, cache.r3.4xlarge, cache.r3.8xlarge       Additional node type info    All current generation instance types are created in Amazon VPC by default.   Redis append-only files (AOF) are not supported for T1 or T2 instances.   Redis Multi-AZ with automatic failover is not supported on T1 instances.   Redis configuration variables appendonly and appendfsync are not supported on Redis version 2.8.22 and later.  
    */
  var CacheNodeType: js.UndefOr[String] = js.native
  
  /**
    * The cache parameter group that is associated with the source cluster.
    */
  var CacheParameterGroupName: js.UndefOr[String] = js.native
  
  /**
    * The name of the cache subnet group associated with the source cluster.
    */
  var CacheSubnetGroupName: js.UndefOr[String] = js.native
  
  /**
    * The name of the cache engine (memcached or redis) used by the source cluster.
    */
  var Engine: js.UndefOr[String] = js.native
  
  /**
    * The version of the cache engine version that is used by the source cluster.
    */
  var EngineVersion: js.UndefOr[String] = js.native
  
  /**
    * The ID of the KMS key used to encrypt the snapshot.
    */
  var KmsKeyId: js.UndefOr[String] = js.native
  
  /**
    * A list of the cache nodes in the source cluster.
    */
  var NodeSnapshots: js.UndefOr[NodeSnapshotList] = js.native
  
  /**
    * The number of cache nodes in the source cluster. For clusters running Redis, this value must be 1. For clusters running Memcached, this value must be between 1 and 20.
    */
  var NumCacheNodes: js.UndefOr[IntegerOptional] = js.native
  
  /**
    * The number of node groups (shards) in this snapshot. When restoring from a snapshot, the number of node groups (shards) in the snapshot and in the restored replication group must be the same.
    */
  var NumNodeGroups: js.UndefOr[IntegerOptional] = js.native
  
  /**
    * The port number used by each cache nodes in the source cluster.
    */
  var Port: js.UndefOr[IntegerOptional] = js.native
  
  /**
    * The name of the Availability Zone in which the source cluster is located.
    */
  var PreferredAvailabilityZone: js.UndefOr[String] = js.native
  
  /**
    * Specifies the weekly time range during which maintenance on the cluster is performed. It is specified as a range in the format ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). The minimum maintenance window is a 60 minute period. Valid values for ddd are:    sun     mon     tue     wed     thu     fri     sat    Example: sun:23:00-mon:01:30 
    */
  var PreferredMaintenanceWindow: js.UndefOr[String] = js.native
  
  /**
    * The ARN (Amazon Resource Name) of the preferred outpost.
    */
  var PreferredOutpostArn: js.UndefOr[String] = js.native
  
  /**
    * A description of the source replication group.
    */
  var ReplicationGroupDescription: js.UndefOr[String] = js.native
  
  /**
    * The unique identifier of the source replication group.
    */
  var ReplicationGroupId: js.UndefOr[String] = js.native
  
  /**
    * The name of a snapshot. For an automatic snapshot, the name is system-generated. For a manual snapshot, this is the user-provided name.
    */
  var SnapshotName: js.UndefOr[String] = js.native
  
  /**
    * For an automatic snapshot, the number of days for which ElastiCache retains the snapshot before deleting it. For manual snapshots, this field reflects the SnapshotRetentionLimit for the source cluster when the snapshot was created. This field is otherwise ignored: Manual snapshots do not expire, and can only be deleted using the DeleteSnapshot operation.   Important If the value of SnapshotRetentionLimit is set to zero (0), backups are turned off.
    */
  var SnapshotRetentionLimit: js.UndefOr[IntegerOptional] = js.native
  
  /**
    * Indicates whether the snapshot is from an automatic backup (automated) or was created manually (manual).
    */
  var SnapshotSource: js.UndefOr[String] = js.native
  
  /**
    * The status of the snapshot. Valid values: creating | available | restoring | copying | deleting.
    */
  var SnapshotStatus: js.UndefOr[String] = js.native
  
  /**
    * The daily time range during which ElastiCache takes daily snapshots of the source cluster.
    */
  var SnapshotWindow: js.UndefOr[String] = js.native
  
  /**
    * The Amazon Resource Name (ARN) for the topic used by the source cluster for publishing notifications.
    */
  var TopicArn: js.UndefOr[String] = js.native
  
  /**
    * The Amazon Virtual Private Cloud identifier (VPC ID) of the cache subnet group for the source cluster.
    */
  var VpcId: js.UndefOr[String] = js.native
}
object Snapshot {
  
  @scala.inline
  def apply(): Snapshot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Snapshot]
  }
  
  @scala.inline
  implicit class SnapshotMutableBuilder[Self <: Snapshot] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setARN(value: String): Self = StObject.set(x, "ARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setARNUndefined: Self = StObject.set(x, "ARN", js.undefined)
    
    @scala.inline
    def setAutoMinorVersionUpgrade(value: Boolean): Self = StObject.set(x, "AutoMinorVersionUpgrade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoMinorVersionUpgradeUndefined: Self = StObject.set(x, "AutoMinorVersionUpgrade", js.undefined)
    
    @scala.inline
    def setAutomaticFailover(value: AutomaticFailoverStatus): Self = StObject.set(x, "AutomaticFailover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutomaticFailoverUndefined: Self = StObject.set(x, "AutomaticFailover", js.undefined)
    
    @scala.inline
    def setCacheClusterCreateTime(value: js.Date): Self = StObject.set(x, "CacheClusterCreateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheClusterCreateTimeUndefined: Self = StObject.set(x, "CacheClusterCreateTime", js.undefined)
    
    @scala.inline
    def setCacheClusterId(value: String): Self = StObject.set(x, "CacheClusterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheClusterIdUndefined: Self = StObject.set(x, "CacheClusterId", js.undefined)
    
    @scala.inline
    def setCacheNodeType(value: String): Self = StObject.set(x, "CacheNodeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheNodeTypeUndefined: Self = StObject.set(x, "CacheNodeType", js.undefined)
    
    @scala.inline
    def setCacheParameterGroupName(value: String): Self = StObject.set(x, "CacheParameterGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheParameterGroupNameUndefined: Self = StObject.set(x, "CacheParameterGroupName", js.undefined)
    
    @scala.inline
    def setCacheSubnetGroupName(value: String): Self = StObject.set(x, "CacheSubnetGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheSubnetGroupNameUndefined: Self = StObject.set(x, "CacheSubnetGroupName", js.undefined)
    
    @scala.inline
    def setEngine(value: String): Self = StObject.set(x, "Engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineUndefined: Self = StObject.set(x, "Engine", js.undefined)
    
    @scala.inline
    def setEngineVersion(value: String): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineVersionUndefined: Self = StObject.set(x, "EngineVersion", js.undefined)
    
    @scala.inline
    def setKmsKeyId(value: String): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    @scala.inline
    def setNodeSnapshots(value: NodeSnapshotList): Self = StObject.set(x, "NodeSnapshots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeSnapshotsUndefined: Self = StObject.set(x, "NodeSnapshots", js.undefined)
    
    @scala.inline
    def setNodeSnapshotsVarargs(value: NodeSnapshot*): Self = StObject.set(x, "NodeSnapshots", js.Array(value :_*))
    
    @scala.inline
    def setNumCacheNodes(value: IntegerOptional): Self = StObject.set(x, "NumCacheNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumCacheNodesUndefined: Self = StObject.set(x, "NumCacheNodes", js.undefined)
    
    @scala.inline
    def setNumNodeGroups(value: IntegerOptional): Self = StObject.set(x, "NumNodeGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumNodeGroupsUndefined: Self = StObject.set(x, "NumNodeGroups", js.undefined)
    
    @scala.inline
    def setPort(value: IntegerOptional): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "Port", js.undefined)
    
    @scala.inline
    def setPreferredAvailabilityZone(value: String): Self = StObject.set(x, "PreferredAvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferredAvailabilityZoneUndefined: Self = StObject.set(x, "PreferredAvailabilityZone", js.undefined)
    
    @scala.inline
    def setPreferredMaintenanceWindow(value: String): Self = StObject.set(x, "PreferredMaintenanceWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferredMaintenanceWindowUndefined: Self = StObject.set(x, "PreferredMaintenanceWindow", js.undefined)
    
    @scala.inline
    def setPreferredOutpostArn(value: String): Self = StObject.set(x, "PreferredOutpostArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferredOutpostArnUndefined: Self = StObject.set(x, "PreferredOutpostArn", js.undefined)
    
    @scala.inline
    def setReplicationGroupDescription(value: String): Self = StObject.set(x, "ReplicationGroupDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationGroupDescriptionUndefined: Self = StObject.set(x, "ReplicationGroupDescription", js.undefined)
    
    @scala.inline
    def setReplicationGroupId(value: String): Self = StObject.set(x, "ReplicationGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationGroupIdUndefined: Self = StObject.set(x, "ReplicationGroupId", js.undefined)
    
    @scala.inline
    def setSnapshotName(value: String): Self = StObject.set(x, "SnapshotName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotNameUndefined: Self = StObject.set(x, "SnapshotName", js.undefined)
    
    @scala.inline
    def setSnapshotRetentionLimit(value: IntegerOptional): Self = StObject.set(x, "SnapshotRetentionLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotRetentionLimitUndefined: Self = StObject.set(x, "SnapshotRetentionLimit", js.undefined)
    
    @scala.inline
    def setSnapshotSource(value: String): Self = StObject.set(x, "SnapshotSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotSourceUndefined: Self = StObject.set(x, "SnapshotSource", js.undefined)
    
    @scala.inline
    def setSnapshotStatus(value: String): Self = StObject.set(x, "SnapshotStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotStatusUndefined: Self = StObject.set(x, "SnapshotStatus", js.undefined)
    
    @scala.inline
    def setSnapshotWindow(value: String): Self = StObject.set(x, "SnapshotWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotWindowUndefined: Self = StObject.set(x, "SnapshotWindow", js.undefined)
    
    @scala.inline
    def setTopicArn(value: String): Self = StObject.set(x, "TopicArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicArnUndefined: Self = StObject.set(x, "TopicArn", js.undefined)
    
    @scala.inline
    def setVpcId(value: String): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
