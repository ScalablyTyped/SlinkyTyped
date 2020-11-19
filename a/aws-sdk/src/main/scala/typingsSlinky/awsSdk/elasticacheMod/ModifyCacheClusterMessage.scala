package typingsSlinky.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyCacheClusterMessage extends js.Object {
  
  /**
    * Specifies whether the new nodes in this Memcached cluster are all created in a single Availability Zone or created across multiple Availability Zones. Valid values: single-az | cross-az. This option is only supported for Memcached clusters.  You cannot specify single-az if the Memcached cluster already has cache nodes in different Availability Zones. If cross-az is specified, existing Memcached nodes remain in their current Availability Zone. Only newly created nodes are located in different Availability Zones.  
    */
  var AZMode: js.UndefOr[typingsSlinky.awsSdk.elasticacheMod.AZMode] = js.native
  
  /**
    * If true, this parameter causes the modifications in this request and any pending modifications to be applied, asynchronously and as soon as possible, regardless of the PreferredMaintenanceWindow setting for the cluster. If false, changes to the cluster are applied on the next maintenance reboot, or the next failure reboot, whichever occurs first.  If you perform a ModifyCacheCluster before a pending modification is applied, the pending modification is replaced by the newer modification.  Valid values: true | false  Default: false 
    */
  var ApplyImmediately: js.UndefOr[Boolean] = js.native
  
  /**
    * Reserved parameter. The password used to access a password protected server. This parameter must be specified with the auth-token-update parameter. Password constraints:   Must be only printable ASCII characters   Must be at least 16 characters and no more than 128 characters in length   Cannot contain any of the following characters: '/', '"', or '@', '%'    For more information, see AUTH password at AUTH.
    */
  var AuthToken: js.UndefOr[String] = js.native
  
  /**
    * Specifies the strategy to use to update the AUTH token. This parameter must be specified with the auth-token parameter. Possible values:   Rotate   Set    For more information, see Authenticating Users with Redis AUTH 
    */
  var AuthTokenUpdateStrategy: js.UndefOr[AuthTokenUpdateStrategyType] = js.native
  
  /**
    * This parameter is currently disabled.
    */
  var AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional] = js.native
  
  /**
    * The cluster identifier. This value is stored as a lowercase string.
    */
  var CacheClusterId: String = js.native
  
  /**
    * A list of cache node IDs to be removed. A node ID is a numeric identifier (0001, 0002, etc.). This parameter is only valid when NumCacheNodes is less than the existing number of cache nodes. The number of cache node IDs supplied in this parameter must match the difference between the existing number of cache nodes in the cluster or pending cache nodes, whichever is greater, and the value of NumCacheNodes in the request. For example: If you have 3 active cache nodes, 7 pending cache nodes, and the number of cache nodes in this ModifyCacheCluster call is 5, you must list 2 (7 - 5) cache node IDs to remove.
    */
  var CacheNodeIdsToRemove: js.UndefOr[CacheNodeIdsList] = js.native
  
  /**
    * A valid cache node type that you want to scale this cluster up to.
    */
  var CacheNodeType: js.UndefOr[String] = js.native
  
  /**
    * The name of the cache parameter group to apply to this cluster. This change is asynchronously applied as soon as possible for parameters when the ApplyImmediately parameter is specified as true for this request.
    */
  var CacheParameterGroupName: js.UndefOr[String] = js.native
  
  /**
    * A list of cache security group names to authorize on this cluster. This change is asynchronously applied as soon as possible. You can use this parameter only with clusters that are created outside of an Amazon Virtual Private Cloud (Amazon VPC). Constraints: Must contain no more than 255 alphanumeric characters. Must not be "Default".
    */
  var CacheSecurityGroupNames: js.UndefOr[CacheSecurityGroupNameList] = js.native
  
  /**
    * The upgraded version of the cache engine to be run on the cache nodes.  Important: You can upgrade to a newer engine version (see Selecting a Cache Engine and Version), but you cannot downgrade to an earlier engine version. If you want to use an earlier engine version, you must delete the existing cluster and create it anew with the earlier engine version. 
    */
  var EngineVersion: js.UndefOr[String] = js.native
  
  /**
    * The list of Availability Zones where the new Memcached cache nodes are created. This parameter is only valid when NumCacheNodes in the request is greater than the sum of the number of active cache nodes and the number of cache nodes pending creation (which may be zero). The number of Availability Zones supplied in this list must match the cache nodes being added in this request. This option is only supported on Memcached clusters. Scenarios:    Scenario 1: You have 3 active nodes and wish to add 2 nodes. Specify NumCacheNodes=5 (3 + 2) and optionally specify two Availability Zones for the two new nodes.    Scenario 2: You have 3 active nodes and 2 nodes pending creation (from the scenario 1 call) and want to add 1 more node. Specify NumCacheNodes=6 ((3 + 2) + 1) and optionally specify an Availability Zone for the new node.    Scenario 3: You want to cancel all pending operations. Specify NumCacheNodes=3 to cancel all pending operations.   The Availability Zone placement of nodes pending creation cannot be modified. If you wish to cancel any nodes pending creation, add 0 nodes by setting NumCacheNodes to the number of current nodes. If cross-az is specified, existing Memcached nodes remain in their current Availability Zone. Only newly created nodes can be located in different Availability Zones. For guidance on how to move existing Memcached nodes to different Availability Zones, see the Availability Zone Considerations section of Cache Node Considerations for Memcached.  Impact of new add/remove requests upon pending requests    Scenario-1   Pending Action: Delete   New Request: Delete   Result: The new delete, pending or immediate, replaces the pending delete.     Scenario-2   Pending Action: Delete   New Request: Create   Result: The new create, pending or immediate, replaces the pending delete.     Scenario-3   Pending Action: Create   New Request: Delete   Result: The new delete, pending or immediate, replaces the pending create.     Scenario-4   Pending Action: Create   New Request: Create   Result: The new create is added to the pending create.   Important: If the new create request is Apply Immediately - Yes, all creates are performed immediately. If the new create request is Apply Immediately - No, all creates are pending.     
    */
  var NewAvailabilityZones: js.UndefOr[PreferredAvailabilityZoneList] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the Amazon SNS topic to which notifications are sent.  The Amazon SNS topic owner must be same as the cluster owner. 
    */
  var NotificationTopicArn: js.UndefOr[String] = js.native
  
  /**
    * The status of the Amazon SNS notification topic. Notifications are sent only if the status is active. Valid values: active | inactive 
    */
  var NotificationTopicStatus: js.UndefOr[String] = js.native
  
  /**
    * The number of cache nodes that the cluster should have. If the value for NumCacheNodes is greater than the sum of the number of current cache nodes and the number of cache nodes pending creation (which may be zero), more nodes are added. If the value is less than the number of existing cache nodes, nodes are removed. If the value is equal to the number of current cache nodes, any pending add or remove requests are canceled. If you are removing cache nodes, you must use the CacheNodeIdsToRemove parameter to provide the IDs of the specific cache nodes to remove. For clusters running Redis, this value must be 1. For clusters running Memcached, this value must be between 1 and 20.  Adding or removing Memcached cache nodes can be applied immediately or as a pending operation (see ApplyImmediately). A pending operation to modify the number of cache nodes in a cluster during its maintenance window, whether by adding or removing nodes in accordance with the scale out architecture, is not queued. The customer's latest request to add or remove nodes to the cluster overrides any previous pending operations to modify the number of cache nodes in the cluster. For example, a request to remove 2 nodes would override a previous pending operation to remove 3 nodes. Similarly, a request to add 2 nodes would override a previous pending operation to remove 3 nodes and vice versa. As Memcached cache nodes may now be provisioned in different Availability Zones with flexible cache node placement, a request to add nodes does not automatically override a previous pending operation to add nodes. The customer can modify the previous pending operation to add more nodes or explicitly cancel the pending request and retry the new request. To cancel pending operations to modify the number of cache nodes in a cluster, use the ModifyCacheCluster request and set NumCacheNodes equal to the number of cache nodes currently in the cluster. 
    */
  var NumCacheNodes: js.UndefOr[IntegerOptional] = js.native
  
  /**
    * Specifies the weekly time range during which maintenance on the cluster is performed. It is specified as a range in the format ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). The minimum maintenance window is a 60 minute period. Valid values for ddd are:    sun     mon     tue     wed     thu     fri     sat    Example: sun:23:00-mon:01:30 
    */
  var PreferredMaintenanceWindow: js.UndefOr[String] = js.native
  
  /**
    * Specifies the VPC Security Groups associated with the cluster. This parameter can be used only with clusters that are created in an Amazon Virtual Private Cloud (Amazon VPC).
    */
  var SecurityGroupIds: js.UndefOr[SecurityGroupIdsList] = js.native
  
  /**
    * The number of days for which ElastiCache retains automatic cluster snapshots before deleting them. For example, if you set SnapshotRetentionLimit to 5, a snapshot that was taken today is retained for 5 days before being deleted.  If the value of SnapshotRetentionLimit is set to zero (0), backups are turned off. 
    */
  var SnapshotRetentionLimit: js.UndefOr[IntegerOptional] = js.native
  
  /**
    * The daily time range (in UTC) during which ElastiCache begins taking a daily snapshot of your cluster. 
    */
  var SnapshotWindow: js.UndefOr[String] = js.native
}
object ModifyCacheClusterMessage {
  
  @scala.inline
  def apply(CacheClusterId: String): ModifyCacheClusterMessage = {
    val __obj = js.Dynamic.literal(CacheClusterId = CacheClusterId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyCacheClusterMessage]
  }
  
  @scala.inline
  implicit class ModifyCacheClusterMessageOps[Self <: ModifyCacheClusterMessage] (val x: Self) extends AnyVal {
    
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
    def setCacheClusterId(value: String): Self = this.set("CacheClusterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAZMode(value: AZMode): Self = this.set("AZMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAZMode: Self = this.set("AZMode", js.undefined)
    
    @scala.inline
    def setApplyImmediately(value: Boolean): Self = this.set("ApplyImmediately", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplyImmediately: Self = this.set("ApplyImmediately", js.undefined)
    
    @scala.inline
    def setAuthToken(value: String): Self = this.set("AuthToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthToken: Self = this.set("AuthToken", js.undefined)
    
    @scala.inline
    def setAuthTokenUpdateStrategy(value: AuthTokenUpdateStrategyType): Self = this.set("AuthTokenUpdateStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthTokenUpdateStrategy: Self = this.set("AuthTokenUpdateStrategy", js.undefined)
    
    @scala.inline
    def setAutoMinorVersionUpgrade(value: BooleanOptional): Self = this.set("AutoMinorVersionUpgrade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoMinorVersionUpgrade: Self = this.set("AutoMinorVersionUpgrade", js.undefined)
    
    @scala.inline
    def setCacheNodeIdsToRemoveVarargs(value: String*): Self = this.set("CacheNodeIdsToRemove", js.Array(value :_*))
    
    @scala.inline
    def setCacheNodeIdsToRemove(value: CacheNodeIdsList): Self = this.set("CacheNodeIdsToRemove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheNodeIdsToRemove: Self = this.set("CacheNodeIdsToRemove", js.undefined)
    
    @scala.inline
    def setCacheNodeType(value: String): Self = this.set("CacheNodeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheNodeType: Self = this.set("CacheNodeType", js.undefined)
    
    @scala.inline
    def setCacheParameterGroupName(value: String): Self = this.set("CacheParameterGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheParameterGroupName: Self = this.set("CacheParameterGroupName", js.undefined)
    
    @scala.inline
    def setCacheSecurityGroupNamesVarargs(value: String*): Self = this.set("CacheSecurityGroupNames", js.Array(value :_*))
    
    @scala.inline
    def setCacheSecurityGroupNames(value: CacheSecurityGroupNameList): Self = this.set("CacheSecurityGroupNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheSecurityGroupNames: Self = this.set("CacheSecurityGroupNames", js.undefined)
    
    @scala.inline
    def setEngineVersion(value: String): Self = this.set("EngineVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEngineVersion: Self = this.set("EngineVersion", js.undefined)
    
    @scala.inline
    def setNewAvailabilityZonesVarargs(value: String*): Self = this.set("NewAvailabilityZones", js.Array(value :_*))
    
    @scala.inline
    def setNewAvailabilityZones(value: PreferredAvailabilityZoneList): Self = this.set("NewAvailabilityZones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewAvailabilityZones: Self = this.set("NewAvailabilityZones", js.undefined)
    
    @scala.inline
    def setNotificationTopicArn(value: String): Self = this.set("NotificationTopicArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotificationTopicArn: Self = this.set("NotificationTopicArn", js.undefined)
    
    @scala.inline
    def setNotificationTopicStatus(value: String): Self = this.set("NotificationTopicStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotificationTopicStatus: Self = this.set("NotificationTopicStatus", js.undefined)
    
    @scala.inline
    def setNumCacheNodes(value: IntegerOptional): Self = this.set("NumCacheNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumCacheNodes: Self = this.set("NumCacheNodes", js.undefined)
    
    @scala.inline
    def setPreferredMaintenanceWindow(value: String): Self = this.set("PreferredMaintenanceWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreferredMaintenanceWindow: Self = this.set("PreferredMaintenanceWindow", js.undefined)
    
    @scala.inline
    def setSecurityGroupIdsVarargs(value: String*): Self = this.set("SecurityGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setSecurityGroupIds(value: SecurityGroupIdsList): Self = this.set("SecurityGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityGroupIds: Self = this.set("SecurityGroupIds", js.undefined)
    
    @scala.inline
    def setSnapshotRetentionLimit(value: IntegerOptional): Self = this.set("SnapshotRetentionLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapshotRetentionLimit: Self = this.set("SnapshotRetentionLimit", js.undefined)
    
    @scala.inline
    def setSnapshotWindow(value: String): Self = this.set("SnapshotWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapshotWindow: Self = this.set("SnapshotWindow", js.undefined)
  }
}
