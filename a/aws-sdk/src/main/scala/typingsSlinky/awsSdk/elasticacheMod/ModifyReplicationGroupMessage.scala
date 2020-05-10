package typingsSlinky.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyReplicationGroupMessage extends js.Object {
  /**
    * If true, this parameter causes the modifications in this request and any pending modifications to be applied, asynchronously and as soon as possible, regardless of the PreferredMaintenanceWindow setting for the replication group. If false, changes to the nodes in the replication group are applied on the next maintenance reboot, or the next failure reboot, whichever occurs first. Valid values: true | false  Default: false 
    */
  var ApplyImmediately: js.UndefOr[Boolean] = js.native
  /**
    * Reserved parameter. The password used to access a password protected server. This parameter must be specified with the auth-token-update-strategy  parameter. Password constraints:   Must be only printable ASCII characters   Must be at least 16 characters and no more than 128 characters in length   Cannot contain any of the following characters: '/', '"', or '@', '%'    For more information, see AUTH password at AUTH.
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
    * Determines whether a read replica is automatically promoted to read/write primary if the existing primary encounters a failure. Valid values: true | false  Amazon ElastiCache for Redis does not support Multi-AZ with automatic failover on:   Redis versions earlier than 2.8.6.   Redis (cluster mode disabled): T1 node types.   Redis (cluster mode enabled): T1 node types.  
    */
  var AutomaticFailoverEnabled: js.UndefOr[BooleanOptional] = js.native
  /**
    * A valid cache node type that you want to scale this replication group to.
    */
  var CacheNodeType: js.UndefOr[String] = js.native
  /**
    * The name of the cache parameter group to apply to all of the clusters in this replication group. This change is asynchronously applied as soon as possible for parameters when the ApplyImmediately parameter is specified as true for this request.
    */
  var CacheParameterGroupName: js.UndefOr[String] = js.native
  /**
    * A list of cache security group names to authorize for the clusters in this replication group. This change is asynchronously applied as soon as possible. This parameter can be used only with replication group containing clusters running outside of an Amazon Virtual Private Cloud (Amazon VPC). Constraints: Must contain no more than 255 alphanumeric characters. Must not be Default.
    */
  var CacheSecurityGroupNames: js.UndefOr[CacheSecurityGroupNameList] = js.native
  /**
    * The upgraded version of the cache engine to be run on the clusters in the replication group.  Important: You can upgrade to a newer engine version (see Selecting a Cache Engine and Version), but you cannot downgrade to an earlier engine version. If you want to use an earlier engine version, you must delete the existing replication group and create it anew with the earlier engine version. 
    */
  var EngineVersion: js.UndefOr[String] = js.native
  /**
    * Deprecated. This parameter is not used.
    */
  var NodeGroupId: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) of the Amazon SNS topic to which notifications are sent.  The Amazon SNS topic owner must be same as the replication group owner.  
    */
  var NotificationTopicArn: js.UndefOr[String] = js.native
  /**
    * The status of the Amazon SNS notification topic for the replication group. Notifications are sent only if the status is active. Valid values: active | inactive 
    */
  var NotificationTopicStatus: js.UndefOr[String] = js.native
  /**
    * Specifies the weekly time range during which maintenance on the cluster is performed. It is specified as a range in the format ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). The minimum maintenance window is a 60 minute period. Valid values for ddd are:    sun     mon     tue     wed     thu     fri     sat    Example: sun:23:00-mon:01:30 
    */
  var PreferredMaintenanceWindow: js.UndefOr[String] = js.native
  /**
    * For replication groups with a single primary, if this parameter is specified, ElastiCache promotes the specified cluster in the specified replication group to the primary role. The nodes of all other clusters in the replication group are read replicas.
    */
  var PrimaryClusterId: js.UndefOr[String] = js.native
  /**
    * A description for the replication group. Maximum length is 255 characters.
    */
  var ReplicationGroupDescription: js.UndefOr[String] = js.native
  /**
    * The identifier of the replication group to modify.
    */
  var ReplicationGroupId: String = js.native
  /**
    * Specifies the VPC Security Groups associated with the clusters in the replication group. This parameter can be used only with replication group containing clusters running in an Amazon Virtual Private Cloud (Amazon VPC).
    */
  var SecurityGroupIds: js.UndefOr[SecurityGroupIdsList] = js.native
  /**
    * The number of days for which ElastiCache retains automatic node group (shard) snapshots before deleting them. For example, if you set SnapshotRetentionLimit to 5, a snapshot that was taken today is retained for 5 days before being deleted.  Important If the value of SnapshotRetentionLimit is set to zero (0), backups are turned off.
    */
  var SnapshotRetentionLimit: js.UndefOr[IntegerOptional] = js.native
  /**
    * The daily time range (in UTC) during which ElastiCache begins taking a daily snapshot of the node group (shard) specified by SnapshottingClusterId. Example: 05:00-09:00  If you do not specify this parameter, ElastiCache automatically chooses an appropriate time range.
    */
  var SnapshotWindow: js.UndefOr[String] = js.native
  /**
    * The cluster ID that is used as the daily snapshot source for the replication group. This parameter cannot be set for Redis (cluster mode enabled) replication groups.
    */
  var SnapshottingClusterId: js.UndefOr[String] = js.native
}

object ModifyReplicationGroupMessage {
  @scala.inline
  def apply(ReplicationGroupId: String): ModifyReplicationGroupMessage = {
    val __obj = js.Dynamic.literal(ReplicationGroupId = ReplicationGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyReplicationGroupMessage]
  }
  @scala.inline
  implicit class ModifyReplicationGroupMessageOps[Self <: ModifyReplicationGroupMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReplicationGroupId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicationGroupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplyImmediately(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplyImmediately")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplyImmediately: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplyImmediately")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuthToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuthToken")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthTokenUpdateStrategy(value: AuthTokenUpdateStrategyType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuthTokenUpdateStrategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthTokenUpdateStrategy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuthTokenUpdateStrategy")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoMinorVersionUpgrade(value: BooleanOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoMinorVersionUpgrade")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoMinorVersionUpgrade: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoMinorVersionUpgrade")(js.undefined)
        ret
    }
    @scala.inline
    def withAutomaticFailoverEnabled(value: BooleanOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutomaticFailoverEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutomaticFailoverEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutomaticFailoverEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withCacheNodeType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CacheNodeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheNodeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CacheNodeType")(js.undefined)
        ret
    }
    @scala.inline
    def withCacheParameterGroupName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CacheParameterGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheParameterGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CacheParameterGroupName")(js.undefined)
        ret
    }
    @scala.inline
    def withCacheSecurityGroupNames(value: CacheSecurityGroupNameList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CacheSecurityGroupNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheSecurityGroupNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CacheSecurityGroupNames")(js.undefined)
        ret
    }
    @scala.inline
    def withEngineVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EngineVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEngineVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EngineVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeGroupId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NodeGroupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeGroupId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NodeGroupId")(js.undefined)
        ret
    }
    @scala.inline
    def withNotificationTopicArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotificationTopicArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotificationTopicArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotificationTopicArn")(js.undefined)
        ret
    }
    @scala.inline
    def withNotificationTopicStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotificationTopicStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotificationTopicStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotificationTopicStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withPreferredMaintenanceWindow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PreferredMaintenanceWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreferredMaintenanceWindow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PreferredMaintenanceWindow")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimaryClusterId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrimaryClusterId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimaryClusterId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrimaryClusterId")(js.undefined)
        ret
    }
    @scala.inline
    def withReplicationGroupDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicationGroupDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicationGroupDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicationGroupDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurityGroupIds(value: SecurityGroupIdsList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecurityGroupIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityGroupIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecurityGroupIds")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapshotRetentionLimit(value: IntegerOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnapshotRetentionLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapshotRetentionLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnapshotRetentionLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapshotWindow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnapshotWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapshotWindow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnapshotWindow")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapshottingClusterId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnapshottingClusterId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapshottingClusterId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnapshottingClusterId")(js.undefined)
        ret
    }
  }
  
}

