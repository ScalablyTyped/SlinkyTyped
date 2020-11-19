package typingsSlinky.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CacheCluster extends js.Object {
  
  /**
    * The ARN (Amazon Resource Name) of the cache cluster.
    */
  var ARN: js.UndefOr[String] = js.native
  
  /**
    * A flag that enables encryption at-rest when set to true. You cannot modify the value of AtRestEncryptionEnabled after the cluster is created. To enable at-rest encryption on a cluster you must set AtRestEncryptionEnabled to true when you create a cluster.  Required: Only available when creating a replication group in an Amazon VPC using redis version 3.2.6, 4.x or later. Default: false 
    */
  var AtRestEncryptionEnabled: js.UndefOr[BooleanOptional] = js.native
  
  /**
    * A flag that enables using an AuthToken (password) when issuing Redis commands. Default: false 
    */
  var AuthTokenEnabled: js.UndefOr[BooleanOptional] = js.native
  
  /**
    * The date the auth token was last modified
    */
  var AuthTokenLastModifiedDate: js.UndefOr[js.Date] = js.native
  
  /**
    * This parameter is currently disabled.
    */
  var AutoMinorVersionUpgrade: js.UndefOr[Boolean] = js.native
  
  /**
    * The date and time when the cluster was created.
    */
  var CacheClusterCreateTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The user-supplied identifier of the cluster. This identifier is a unique key that identifies a cluster.
    */
  var CacheClusterId: js.UndefOr[String] = js.native
  
  /**
    * The current state of this cluster, one of the following values: available, creating, deleted, deleting, incompatible-network, modifying, rebooting cluster nodes, restore-failed, or snapshotting.
    */
  var CacheClusterStatus: js.UndefOr[String] = js.native
  
  /**
    * The name of the compute and memory capacity node type for the cluster. The following node types are supported by ElastiCache. Generally speaking, the current generation types provide more memory and computational power at lower cost when compared to their equivalent previous generation counterparts.   General purpose:   Current generation:   M5 node types: cache.m5.large, cache.m5.xlarge, cache.m5.2xlarge, cache.m5.4xlarge, cache.m5.12xlarge, cache.m5.24xlarge   M4 node types: cache.m4.large, cache.m4.xlarge, cache.m4.2xlarge, cache.m4.4xlarge, cache.m4.10xlarge   T3 node types: cache.t3.micro, cache.t3.small, cache.t3.medium   T2 node types: cache.t2.micro, cache.t2.small, cache.t2.medium    Previous generation: (not recommended)  T1 node types: cache.t1.micro   M1 node types: cache.m1.small, cache.m1.medium, cache.m1.large, cache.m1.xlarge   M3 node types: cache.m3.medium, cache.m3.large, cache.m3.xlarge, cache.m3.2xlarge      Compute optimized:   Previous generation: (not recommended)  C1 node types: cache.c1.xlarge      Memory optimized:   Current generation:   R5 node types: cache.r5.large, cache.r5.xlarge, cache.r5.2xlarge, cache.r5.4xlarge, cache.r5.12xlarge, cache.r5.24xlarge   R4 node types: cache.r4.large, cache.r4.xlarge, cache.r4.2xlarge, cache.r4.4xlarge, cache.r4.8xlarge, cache.r4.16xlarge    Previous generation: (not recommended)  M2 node types: cache.m2.xlarge, cache.m2.2xlarge, cache.m2.4xlarge   R3 node types: cache.r3.large, cache.r3.xlarge, cache.r3.2xlarge, cache.r3.4xlarge, cache.r3.8xlarge       Additional node type info    All current generation instance types are created in Amazon VPC by default.   Redis append-only files (AOF) are not supported for T1 or T2 instances.   Redis Multi-AZ with automatic failover is not supported on T1 instances.   Redis configuration variables appendonly and appendfsync are not supported on Redis version 2.8.22 and later.  
    */
  var CacheNodeType: js.UndefOr[String] = js.native
  
  /**
    * A list of cache nodes that are members of the cluster.
    */
  var CacheNodes: js.UndefOr[CacheNodeList] = js.native
  
  /**
    * Status of the cache parameter group.
    */
  var CacheParameterGroup: js.UndefOr[CacheParameterGroupStatus] = js.native
  
  /**
    * A list of cache security group elements, composed of name and status sub-elements.
    */
  var CacheSecurityGroups: js.UndefOr[CacheSecurityGroupMembershipList] = js.native
  
  /**
    * The name of the cache subnet group associated with the cluster.
    */
  var CacheSubnetGroupName: js.UndefOr[String] = js.native
  
  /**
    * The URL of the web page where you can download the latest ElastiCache client library.
    */
  var ClientDownloadLandingPage: js.UndefOr[String] = js.native
  
  /**
    * Represents a Memcached cluster endpoint which, if Automatic Discovery is enabled on the cluster, can be used by an application to connect to any node in the cluster. The configuration endpoint will always have .cfg in it. Example: mem-3.9dvc4r.cfg.usw2.cache.amazonaws.com:11211 
    */
  var ConfigurationEndpoint: js.UndefOr[Endpoint] = js.native
  
  /**
    * The name of the cache engine (memcached or redis) to be used for this cluster.
    */
  var Engine: js.UndefOr[String] = js.native
  
  /**
    * The version of the cache engine that is used in this cluster.
    */
  var EngineVersion: js.UndefOr[String] = js.native
  
  /**
    * Describes a notification topic and its status. Notification topics are used for publishing ElastiCache events to subscribers using Amazon Simple Notification Service (SNS). 
    */
  var NotificationConfiguration: js.UndefOr[typingsSlinky.awsSdk.elasticacheMod.NotificationConfiguration] = js.native
  
  /**
    * The number of cache nodes in the cluster. For clusters running Redis, this value must be 1. For clusters running Memcached, this value must be between 1 and 20.
    */
  var NumCacheNodes: js.UndefOr[IntegerOptional] = js.native
  
  var PendingModifiedValues: js.UndefOr[typingsSlinky.awsSdk.elasticacheMod.PendingModifiedValues] = js.native
  
  /**
    * The name of the Availability Zone in which the cluster is located or "Multiple" if the cache nodes are located in different Availability Zones.
    */
  var PreferredAvailabilityZone: js.UndefOr[String] = js.native
  
  /**
    * Specifies the weekly time range during which maintenance on the cluster is performed. It is specified as a range in the format ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). The minimum maintenance window is a 60 minute period. Valid values for ddd are:    sun     mon     tue     wed     thu     fri     sat    Example: sun:23:00-mon:01:30 
    */
  var PreferredMaintenanceWindow: js.UndefOr[String] = js.native
  
  /**
    * The replication group to which this cluster belongs. If this field is empty, the cluster is not associated with any replication group.
    */
  var ReplicationGroupId: js.UndefOr[String] = js.native
  
  /**
    * A list of VPC Security Groups associated with the cluster.
    */
  var SecurityGroups: js.UndefOr[SecurityGroupMembershipList] = js.native
  
  /**
    * The number of days for which ElastiCache retains automatic cluster snapshots before deleting them. For example, if you set SnapshotRetentionLimit to 5, a snapshot that was taken today is retained for 5 days before being deleted.   If the value of SnapshotRetentionLimit is set to zero (0), backups are turned off. 
    */
  var SnapshotRetentionLimit: js.UndefOr[IntegerOptional] = js.native
  
  /**
    * The daily time range (in UTC) during which ElastiCache begins taking a daily snapshot of your cluster. Example: 05:00-09:00 
    */
  var SnapshotWindow: js.UndefOr[String] = js.native
  
  /**
    * A flag that enables in-transit encryption when set to true. You cannot modify the value of TransitEncryptionEnabled after the cluster is created. To enable in-transit encryption on a cluster you must set TransitEncryptionEnabled to true when you create a cluster.  Required: Only available when creating a replication group in an Amazon VPC using redis version 3.2.6, 4.x or later. Default: false 
    */
  var TransitEncryptionEnabled: js.UndefOr[BooleanOptional] = js.native
}
object CacheCluster {
  
  @scala.inline
  def apply(): CacheCluster = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheCluster]
  }
  
  @scala.inline
  implicit class CacheClusterOps[Self <: CacheCluster] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setARN(value: String): Self = this.set("ARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteARN: Self = this.set("ARN", js.undefined)
    
    @scala.inline
    def setAtRestEncryptionEnabled(value: BooleanOptional): Self = this.set("AtRestEncryptionEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAtRestEncryptionEnabled: Self = this.set("AtRestEncryptionEnabled", js.undefined)
    
    @scala.inline
    def setAuthTokenEnabled(value: BooleanOptional): Self = this.set("AuthTokenEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthTokenEnabled: Self = this.set("AuthTokenEnabled", js.undefined)
    
    @scala.inline
    def setAuthTokenLastModifiedDate(value: js.Date): Self = this.set("AuthTokenLastModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthTokenLastModifiedDate: Self = this.set("AuthTokenLastModifiedDate", js.undefined)
    
    @scala.inline
    def setAutoMinorVersionUpgrade(value: Boolean): Self = this.set("AutoMinorVersionUpgrade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoMinorVersionUpgrade: Self = this.set("AutoMinorVersionUpgrade", js.undefined)
    
    @scala.inline
    def setCacheClusterCreateTime(value: js.Date): Self = this.set("CacheClusterCreateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheClusterCreateTime: Self = this.set("CacheClusterCreateTime", js.undefined)
    
    @scala.inline
    def setCacheClusterId(value: String): Self = this.set("CacheClusterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheClusterId: Self = this.set("CacheClusterId", js.undefined)
    
    @scala.inline
    def setCacheClusterStatus(value: String): Self = this.set("CacheClusterStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheClusterStatus: Self = this.set("CacheClusterStatus", js.undefined)
    
    @scala.inline
    def setCacheNodeType(value: String): Self = this.set("CacheNodeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheNodeType: Self = this.set("CacheNodeType", js.undefined)
    
    @scala.inline
    def setCacheNodesVarargs(value: CacheNode*): Self = this.set("CacheNodes", js.Array(value :_*))
    
    @scala.inline
    def setCacheNodes(value: CacheNodeList): Self = this.set("CacheNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheNodes: Self = this.set("CacheNodes", js.undefined)
    
    @scala.inline
    def setCacheParameterGroup(value: CacheParameterGroupStatus): Self = this.set("CacheParameterGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheParameterGroup: Self = this.set("CacheParameterGroup", js.undefined)
    
    @scala.inline
    def setCacheSecurityGroupsVarargs(value: CacheSecurityGroupMembership*): Self = this.set("CacheSecurityGroups", js.Array(value :_*))
    
    @scala.inline
    def setCacheSecurityGroups(value: CacheSecurityGroupMembershipList): Self = this.set("CacheSecurityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheSecurityGroups: Self = this.set("CacheSecurityGroups", js.undefined)
    
    @scala.inline
    def setCacheSubnetGroupName(value: String): Self = this.set("CacheSubnetGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheSubnetGroupName: Self = this.set("CacheSubnetGroupName", js.undefined)
    
    @scala.inline
    def setClientDownloadLandingPage(value: String): Self = this.set("ClientDownloadLandingPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientDownloadLandingPage: Self = this.set("ClientDownloadLandingPage", js.undefined)
    
    @scala.inline
    def setConfigurationEndpoint(value: Endpoint): Self = this.set("ConfigurationEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigurationEndpoint: Self = this.set("ConfigurationEndpoint", js.undefined)
    
    @scala.inline
    def setEngine(value: String): Self = this.set("Engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEngine: Self = this.set("Engine", js.undefined)
    
    @scala.inline
    def setEngineVersion(value: String): Self = this.set("EngineVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEngineVersion: Self = this.set("EngineVersion", js.undefined)
    
    @scala.inline
    def setNotificationConfiguration(value: NotificationConfiguration): Self = this.set("NotificationConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotificationConfiguration: Self = this.set("NotificationConfiguration", js.undefined)
    
    @scala.inline
    def setNumCacheNodes(value: IntegerOptional): Self = this.set("NumCacheNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumCacheNodes: Self = this.set("NumCacheNodes", js.undefined)
    
    @scala.inline
    def setPendingModifiedValues(value: PendingModifiedValues): Self = this.set("PendingModifiedValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePendingModifiedValues: Self = this.set("PendingModifiedValues", js.undefined)
    
    @scala.inline
    def setPreferredAvailabilityZone(value: String): Self = this.set("PreferredAvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreferredAvailabilityZone: Self = this.set("PreferredAvailabilityZone", js.undefined)
    
    @scala.inline
    def setPreferredMaintenanceWindow(value: String): Self = this.set("PreferredMaintenanceWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreferredMaintenanceWindow: Self = this.set("PreferredMaintenanceWindow", js.undefined)
    
    @scala.inline
    def setReplicationGroupId(value: String): Self = this.set("ReplicationGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicationGroupId: Self = this.set("ReplicationGroupId", js.undefined)
    
    @scala.inline
    def setSecurityGroupsVarargs(value: SecurityGroupMembership*): Self = this.set("SecurityGroups", js.Array(value :_*))
    
    @scala.inline
    def setSecurityGroups(value: SecurityGroupMembershipList): Self = this.set("SecurityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityGroups: Self = this.set("SecurityGroups", js.undefined)
    
    @scala.inline
    def setSnapshotRetentionLimit(value: IntegerOptional): Self = this.set("SnapshotRetentionLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapshotRetentionLimit: Self = this.set("SnapshotRetentionLimit", js.undefined)
    
    @scala.inline
    def setSnapshotWindow(value: String): Self = this.set("SnapshotWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapshotWindow: Self = this.set("SnapshotWindow", js.undefined)
    
    @scala.inline
    def setTransitEncryptionEnabled(value: BooleanOptional): Self = this.set("TransitEncryptionEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitEncryptionEnabled: Self = this.set("TransitEncryptionEnabled", js.undefined)
  }
}
