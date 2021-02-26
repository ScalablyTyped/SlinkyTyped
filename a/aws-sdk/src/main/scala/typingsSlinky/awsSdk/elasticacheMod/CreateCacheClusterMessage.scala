package typingsSlinky.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateCacheClusterMessage extends StObject {
  
  /**
    * Specifies whether the nodes in this Memcached cluster are created in a single Availability Zone or created across multiple Availability Zones in the cluster's region. This parameter is only supported for Memcached clusters. If the AZMode and PreferredAvailabilityZones are not specified, ElastiCache assumes single-az mode.
    */
  var AZMode: js.UndefOr[typingsSlinky.awsSdk.elasticacheMod.AZMode] = js.native
  
  /**
    *  Reserved parameter. The password used to access a password protected server. Password constraints:   Must be only printable ASCII characters.   Must be at least 16 characters and no more than 128 characters in length.   The only permitted printable special characters are !, &amp;, #, $, ^, &lt;, &gt;, and -. Other printable special characters cannot be used in the AUTH token.   For more information, see AUTH password at http://redis.io/commands/AUTH.
    */
  var AuthToken: js.UndefOr[String] = js.native
  
  /**
    * This parameter is currently disabled.
    */
  var AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional] = js.native
  
  /**
    * The node group (shard) identifier. This parameter is stored as a lowercase string.  Constraints:    A name must contain from 1 to 50 alphanumeric characters or hyphens.   The first character must be a letter.   A name cannot end with a hyphen or contain two consecutive hyphens.  
    */
  var CacheClusterId: String = js.native
  
  /**
    * The compute and memory capacity of the nodes in the node group (shard). The following node types are supported by ElastiCache. Generally speaking, the current generation types provide more memory and computational power at lower cost when compared to their equivalent previous generation counterparts.   General purpose:   Current generation:   M6g node types (available only for Redis engine version 5.0.6 onward and for Memcached engine version 1.5.16 onward).  cache.m6g.large, cache.m6g.xlarge, cache.m6g.2xlarge, cache.m6g.4xlarge, cache.m6g.8xlarge, cache.m6g.12xlarge, cache.m6g.16xlarge   At this time, M6g node types are available in the following regions: us-east-1, us-west-2, us-east-2, eu-central-1, eu-west-1 and ap-northeast-1.   M5 node types: cache.m5.large, cache.m5.xlarge, cache.m5.2xlarge, cache.m5.4xlarge, cache.m5.12xlarge, cache.m5.24xlarge   M4 node types: cache.m4.large, cache.m4.xlarge, cache.m4.2xlarge, cache.m4.4xlarge, cache.m4.10xlarge   T3 node types: cache.t3.micro, cache.t3.small, cache.t3.medium   T2 node types: cache.t2.micro, cache.t2.small, cache.t2.medium    Previous generation: (not recommended)  T1 node types: cache.t1.micro   M1 node types: cache.m1.small, cache.m1.medium, cache.m1.large, cache.m1.xlarge   M3 node types: cache.m3.medium, cache.m3.large, cache.m3.xlarge, cache.m3.2xlarge      Compute optimized:   Previous generation: (not recommended)  C1 node types: cache.c1.xlarge      Memory optimized:   Current generation:   R6g node types (available only for Redis engine version 5.0.6 onward and for Memcached engine version 1.5.16 onward).  cache.r6g.large, cache.r6g.xlarge, cache.r6g.2xlarge, cache.r6g.4xlarge, cache.r6g.8xlarge, cache.r6g.12xlarge, cache.r6g.16xlarge   At this time, R6g node types are available in the following regions: us-east-1, us-west-2, us-east-2, eu-central-1, eu-west-1 and ap-northeast-1.   R5 node types: cache.r5.large, cache.r5.xlarge, cache.r5.2xlarge, cache.r5.4xlarge, cache.r5.12xlarge, cache.r5.24xlarge   R4 node types: cache.r4.large, cache.r4.xlarge, cache.r4.2xlarge, cache.r4.4xlarge, cache.r4.8xlarge, cache.r4.16xlarge    Previous generation: (not recommended)  M2 node types: cache.m2.xlarge, cache.m2.2xlarge, cache.m2.4xlarge   R3 node types: cache.r3.large, cache.r3.xlarge, cache.r3.2xlarge, cache.r3.4xlarge, cache.r3.8xlarge       Additional node type info    All current generation instance types are created in Amazon VPC by default.   Redis append-only files (AOF) are not supported for T1 or T2 instances.   Redis Multi-AZ with automatic failover is not supported on T1 instances.   Redis configuration variables appendonly and appendfsync are not supported on Redis version 2.8.22 and later.  
    */
  var CacheNodeType: js.UndefOr[String] = js.native
  
  /**
    * The name of the parameter group to associate with this cluster. If this argument is omitted, the default parameter group for the specified engine is used. You cannot use any parameter group which has cluster-enabled='yes' when creating a cluster.
    */
  var CacheParameterGroupName: js.UndefOr[String] = js.native
  
  /**
    * A list of security group names to associate with this cluster. Use this parameter only when you are creating a cluster outside of an Amazon Virtual Private Cloud (Amazon VPC).
    */
  var CacheSecurityGroupNames: js.UndefOr[CacheSecurityGroupNameList] = js.native
  
  /**
    * The name of the subnet group to be used for the cluster. Use this parameter only when you are creating a cluster in an Amazon Virtual Private Cloud (Amazon VPC).  If you're going to launch your cluster in an Amazon VPC, you need to create a subnet group before you start creating a cluster. For more information, see Subnets and Subnet Groups. 
    */
  var CacheSubnetGroupName: js.UndefOr[String] = js.native
  
  /**
    * The name of the cache engine to be used for this cluster. Valid values for this parameter are: memcached | redis 
    */
  var Engine: js.UndefOr[String] = js.native
  
  /**
    * The version number of the cache engine to be used for this cluster. To view the supported cache engine versions, use the DescribeCacheEngineVersions operation.  Important: You can upgrade to a newer engine version (see Selecting a Cache Engine and Version), but you cannot downgrade to an earlier engine version. If you want to use an earlier engine version, you must delete the existing cluster or replication group and create it anew with the earlier engine version. 
    */
  var EngineVersion: js.UndefOr[String] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the Amazon Simple Notification Service (SNS) topic to which notifications are sent.  The Amazon SNS topic owner must be the same as the cluster owner. 
    */
  var NotificationTopicArn: js.UndefOr[String] = js.native
  
  /**
    * The initial number of cache nodes that the cluster has. For clusters running Redis, this value must be 1. For clusters running Memcached, this value must be between 1 and 20. If you need more than 20 nodes for your Memcached cluster, please fill out the ElastiCache Limit Increase Request form at http://aws.amazon.com/contact-us/elasticache-node-limit-request/.
    */
  var NumCacheNodes: js.UndefOr[IntegerOptional] = js.native
  
  /**
    * Specifies whether the nodes in the cluster are created in a single outpost or across multiple outposts.
    */
  var OutpostMode: js.UndefOr[typingsSlinky.awsSdk.elasticacheMod.OutpostMode] = js.native
  
  /**
    * The port number on which each of the cache nodes accepts connections.
    */
  var Port: js.UndefOr[IntegerOptional] = js.native
  
  /**
    * The EC2 Availability Zone in which the cluster is created. All nodes belonging to this cluster are placed in the preferred Availability Zone. If you want to create your nodes across multiple Availability Zones, use PreferredAvailabilityZones. Default: System chosen Availability Zone.
    */
  var PreferredAvailabilityZone: js.UndefOr[String] = js.native
  
  /**
    * A list of the Availability Zones in which cache nodes are created. The order of the zones in the list is not important. This option is only supported on Memcached.  If you are creating your cluster in an Amazon VPC (recommended) you can only locate nodes in Availability Zones that are associated with the subnets in the selected subnet group. The number of Availability Zones listed must equal the value of NumCacheNodes.  If you want all the nodes in the same Availability Zone, use PreferredAvailabilityZone instead, or repeat the Availability Zone multiple times in the list. Default: System chosen Availability Zones.
    */
  var PreferredAvailabilityZones: js.UndefOr[PreferredAvailabilityZoneList] = js.native
  
  /**
    * Specifies the weekly time range during which maintenance on the cluster is performed. It is specified as a range in the format ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). The minimum maintenance window is a 60 minute period. Valid values for ddd are: Specifies the weekly time range during which maintenance on the cluster is performed. It is specified as a range in the format ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). The minimum maintenance window is a 60 minute period. Valid values for ddd are:    sun     mon     tue     wed     thu     fri     sat    Example: sun:23:00-mon:01:30 
    */
  var PreferredMaintenanceWindow: js.UndefOr[String] = js.native
  
  /**
    * The outpost ARN in which the cache cluster is created.
    */
  var PreferredOutpostArn: js.UndefOr[String] = js.native
  
  /**
    * The outpost ARNs in which the cache cluster is created.
    */
  var PreferredOutpostArns: js.UndefOr[PreferredOutpostArnList] = js.native
  
  /**
    * The ID of the replication group to which this cluster should belong. If this parameter is specified, the cluster is added to the specified replication group as a read replica; otherwise, the cluster is a standalone primary that is not part of any replication group. If the specified replication group is Multi-AZ enabled and the Availability Zone is not specified, the cluster is created in Availability Zones that provide the best spread of read replicas across Availability Zones.  This parameter is only valid if the Engine parameter is redis. 
    */
  var ReplicationGroupId: js.UndefOr[String] = js.native
  
  /**
    * One or more VPC security groups associated with the cluster. Use this parameter only when you are creating a cluster in an Amazon Virtual Private Cloud (Amazon VPC).
    */
  var SecurityGroupIds: js.UndefOr[SecurityGroupIdsList] = js.native
  
  /**
    * A single-element string list containing an Amazon Resource Name (ARN) that uniquely identifies a Redis RDB snapshot file stored in Amazon S3. The snapshot file is used to populate the node group (shard). The Amazon S3 object name in the ARN cannot contain any commas.  This parameter is only valid if the Engine parameter is redis.  Example of an Amazon S3 ARN: arn:aws:s3:::my_bucket/snapshot1.rdb 
    */
  var SnapshotArns: js.UndefOr[SnapshotArnsList] = js.native
  
  /**
    * The name of a Redis snapshot from which to restore data into the new node group (shard). The snapshot status changes to restoring while the new node group (shard) is being created.  This parameter is only valid if the Engine parameter is redis. 
    */
  var SnapshotName: js.UndefOr[String] = js.native
  
  /**
    * The number of days for which ElastiCache retains automatic snapshots before deleting them. For example, if you set SnapshotRetentionLimit to 5, a snapshot taken today is retained for 5 days before being deleted.  This parameter is only valid if the Engine parameter is redis.  Default: 0 (i.e., automatic backups are disabled for this cache cluster).
    */
  var SnapshotRetentionLimit: js.UndefOr[IntegerOptional] = js.native
  
  /**
    * The daily time range (in UTC) during which ElastiCache begins taking a daily snapshot of your node group (shard). Example: 05:00-09:00  If you do not specify this parameter, ElastiCache automatically chooses an appropriate time range.  This parameter is only valid if the Engine parameter is redis. 
    */
  var SnapshotWindow: js.UndefOr[String] = js.native
  
  /**
    * A list of cost allocation tags to be added to this resource.
    */
  var Tags: js.UndefOr[TagList] = js.native
}
object CreateCacheClusterMessage {
  
  @scala.inline
  def apply(CacheClusterId: String): CreateCacheClusterMessage = {
    val __obj = js.Dynamic.literal(CacheClusterId = CacheClusterId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCacheClusterMessage]
  }
  
  @scala.inline
  implicit class CreateCacheClusterMessageMutableBuilder[Self <: CreateCacheClusterMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAZMode(value: AZMode): Self = StObject.set(x, "AZMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAZModeUndefined: Self = StObject.set(x, "AZMode", js.undefined)
    
    @scala.inline
    def setAuthToken(value: String): Self = StObject.set(x, "AuthToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthTokenUndefined: Self = StObject.set(x, "AuthToken", js.undefined)
    
    @scala.inline
    def setAutoMinorVersionUpgrade(value: BooleanOptional): Self = StObject.set(x, "AutoMinorVersionUpgrade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoMinorVersionUpgradeUndefined: Self = StObject.set(x, "AutoMinorVersionUpgrade", js.undefined)
    
    @scala.inline
    def setCacheClusterId(value: String): Self = StObject.set(x, "CacheClusterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheNodeType(value: String): Self = StObject.set(x, "CacheNodeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheNodeTypeUndefined: Self = StObject.set(x, "CacheNodeType", js.undefined)
    
    @scala.inline
    def setCacheParameterGroupName(value: String): Self = StObject.set(x, "CacheParameterGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheParameterGroupNameUndefined: Self = StObject.set(x, "CacheParameterGroupName", js.undefined)
    
    @scala.inline
    def setCacheSecurityGroupNames(value: CacheSecurityGroupNameList): Self = StObject.set(x, "CacheSecurityGroupNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheSecurityGroupNamesUndefined: Self = StObject.set(x, "CacheSecurityGroupNames", js.undefined)
    
    @scala.inline
    def setCacheSecurityGroupNamesVarargs(value: String*): Self = StObject.set(x, "CacheSecurityGroupNames", js.Array(value :_*))
    
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
    def setNotificationTopicArn(value: String): Self = StObject.set(x, "NotificationTopicArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationTopicArnUndefined: Self = StObject.set(x, "NotificationTopicArn", js.undefined)
    
    @scala.inline
    def setNumCacheNodes(value: IntegerOptional): Self = StObject.set(x, "NumCacheNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumCacheNodesUndefined: Self = StObject.set(x, "NumCacheNodes", js.undefined)
    
    @scala.inline
    def setOutpostMode(value: OutpostMode): Self = StObject.set(x, "OutpostMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutpostModeUndefined: Self = StObject.set(x, "OutpostMode", js.undefined)
    
    @scala.inline
    def setPort(value: IntegerOptional): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "Port", js.undefined)
    
    @scala.inline
    def setPreferredAvailabilityZone(value: String): Self = StObject.set(x, "PreferredAvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferredAvailabilityZoneUndefined: Self = StObject.set(x, "PreferredAvailabilityZone", js.undefined)
    
    @scala.inline
    def setPreferredAvailabilityZones(value: PreferredAvailabilityZoneList): Self = StObject.set(x, "PreferredAvailabilityZones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferredAvailabilityZonesUndefined: Self = StObject.set(x, "PreferredAvailabilityZones", js.undefined)
    
    @scala.inline
    def setPreferredAvailabilityZonesVarargs(value: String*): Self = StObject.set(x, "PreferredAvailabilityZones", js.Array(value :_*))
    
    @scala.inline
    def setPreferredMaintenanceWindow(value: String): Self = StObject.set(x, "PreferredMaintenanceWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferredMaintenanceWindowUndefined: Self = StObject.set(x, "PreferredMaintenanceWindow", js.undefined)
    
    @scala.inline
    def setPreferredOutpostArn(value: String): Self = StObject.set(x, "PreferredOutpostArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferredOutpostArnUndefined: Self = StObject.set(x, "PreferredOutpostArn", js.undefined)
    
    @scala.inline
    def setPreferredOutpostArns(value: PreferredOutpostArnList): Self = StObject.set(x, "PreferredOutpostArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferredOutpostArnsUndefined: Self = StObject.set(x, "PreferredOutpostArns", js.undefined)
    
    @scala.inline
    def setPreferredOutpostArnsVarargs(value: String*): Self = StObject.set(x, "PreferredOutpostArns", js.Array(value :_*))
    
    @scala.inline
    def setReplicationGroupId(value: String): Self = StObject.set(x, "ReplicationGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationGroupIdUndefined: Self = StObject.set(x, "ReplicationGroupId", js.undefined)
    
    @scala.inline
    def setSecurityGroupIds(value: SecurityGroupIdsList): Self = StObject.set(x, "SecurityGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupIdsUndefined: Self = StObject.set(x, "SecurityGroupIds", js.undefined)
    
    @scala.inline
    def setSecurityGroupIdsVarargs(value: String*): Self = StObject.set(x, "SecurityGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setSnapshotArns(value: SnapshotArnsList): Self = StObject.set(x, "SnapshotArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotArnsUndefined: Self = StObject.set(x, "SnapshotArns", js.undefined)
    
    @scala.inline
    def setSnapshotArnsVarargs(value: String*): Self = StObject.set(x, "SnapshotArns", js.Array(value :_*))
    
    @scala.inline
    def setSnapshotName(value: String): Self = StObject.set(x, "SnapshotName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotNameUndefined: Self = StObject.set(x, "SnapshotName", js.undefined)
    
    @scala.inline
    def setSnapshotRetentionLimit(value: IntegerOptional): Self = StObject.set(x, "SnapshotRetentionLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotRetentionLimitUndefined: Self = StObject.set(x, "SnapshotRetentionLimit", js.undefined)
    
    @scala.inline
    def setSnapshotWindow(value: String): Self = StObject.set(x, "SnapshotWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotWindowUndefined: Self = StObject.set(x, "SnapshotWindow", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
