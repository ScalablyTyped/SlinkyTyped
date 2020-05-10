package typingsSlinky.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplicationGroup extends js.Object {
  /**
    * A flag that enables encryption at-rest when set to true. You cannot modify the value of AtRestEncryptionEnabled after the cluster is created. To enable encryption at-rest on a cluster you must set AtRestEncryptionEnabled to true when you create a cluster.  Required: Only available when creating a replication group in an Amazon VPC using redis version 3.2.6, 4.x or later. Default: false 
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
    * Indicates the status of Multi-AZ with automatic failover for this Redis replication group. Amazon ElastiCache for Redis does not support Multi-AZ with automatic failover on:   Redis versions earlier than 2.8.6.   Redis (cluster mode disabled): T1 node types.   Redis (cluster mode enabled): T1 node types.  
    */
  var AutomaticFailover: js.UndefOr[AutomaticFailoverStatus] = js.native
  /**
    * The name of the compute and memory capacity node type for each node in the replication group.
    */
  var CacheNodeType: js.UndefOr[String] = js.native
  /**
    * A flag indicating whether or not this replication group is cluster enabled; i.e., whether its data can be partitioned across multiple shards (API/CLI: node groups). Valid values: true | false 
    */
  var ClusterEnabled: js.UndefOr[BooleanOptional] = js.native
  /**
    * The configuration endpoint for this replication group. Use the configuration endpoint to connect to this replication group.
    */
  var ConfigurationEndpoint: js.UndefOr[Endpoint] = js.native
  /**
    * The user supplied description of the replication group.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The name of the Global Datastore and role of this replication group in the Global Datastore.
    */
  var GlobalReplicationGroupInfo: js.UndefOr[typingsSlinky.awsSdk.elasticacheMod.GlobalReplicationGroupInfo] = js.native
  /**
    * The ID of the KMS key used to encrypt the disk in the cluster.
    */
  var KmsKeyId: js.UndefOr[String] = js.native
  /**
    * The names of all the cache clusters that are part of this replication group.
    */
  var MemberClusters: js.UndefOr[ClusterIdList] = js.native
  /**
    * A list of node groups in this replication group. For Redis (cluster mode disabled) replication groups, this is a single-element list. For Redis (cluster mode enabled) replication groups, the list contains an entry for each node group (shard).
    */
  var NodeGroups: js.UndefOr[NodeGroupList] = js.native
  /**
    * A group of settings to be applied to the replication group, either immediately or during the next maintenance window.
    */
  var PendingModifiedValues: js.UndefOr[ReplicationGroupPendingModifiedValues] = js.native
  /**
    * The identifier for the replication group.
    */
  var ReplicationGroupId: js.UndefOr[String] = js.native
  /**
    * The number of days for which ElastiCache retains automatic cluster snapshots before deleting them. For example, if you set SnapshotRetentionLimit to 5, a snapshot that was taken today is retained for 5 days before being deleted.   If the value of SnapshotRetentionLimit is set to zero (0), backups are turned off. 
    */
  var SnapshotRetentionLimit: js.UndefOr[IntegerOptional] = js.native
  /**
    * The daily time range (in UTC) during which ElastiCache begins taking a daily snapshot of your node group (shard). Example: 05:00-09:00  If you do not specify this parameter, ElastiCache automatically chooses an appropriate time range.  This parameter is only valid if the Engine parameter is redis. 
    */
  var SnapshotWindow: js.UndefOr[String] = js.native
  /**
    * The cluster ID that is used as the daily snapshot source for the replication group.
    */
  var SnapshottingClusterId: js.UndefOr[String] = js.native
  /**
    * The current state of this replication group - creating, available, modifying, deleting, create-failed, snapshotting.
    */
  var Status: js.UndefOr[String] = js.native
  /**
    * A flag that enables in-transit encryption when set to true. You cannot modify the value of TransitEncryptionEnabled after the cluster is created. To enable in-transit encryption on a cluster you must set TransitEncryptionEnabled to true when you create a cluster.  Required: Only available when creating a replication group in an Amazon VPC using redis version 3.2.6, 4.x or later. Default: false 
    */
  var TransitEncryptionEnabled: js.UndefOr[BooleanOptional] = js.native
}

object ReplicationGroup {
  @scala.inline
  def apply(): ReplicationGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicationGroup]
  }
  @scala.inline
  implicit class ReplicationGroupOps[Self <: ReplicationGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAtRestEncryptionEnabled(value: BooleanOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AtRestEncryptionEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAtRestEncryptionEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AtRestEncryptionEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthTokenEnabled(value: BooleanOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuthTokenEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthTokenEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuthTokenEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthTokenLastModifiedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuthTokenLastModifiedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthTokenLastModifiedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuthTokenLastModifiedDate")(js.undefined)
        ret
    }
    @scala.inline
    def withAutomaticFailover(value: AutomaticFailoverStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutomaticFailover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutomaticFailover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutomaticFailover")(js.undefined)
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
    def withClusterEnabled(value: BooleanOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withConfigurationEndpoint(value: Endpoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigurationEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigurationEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigurationEndpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobalReplicationGroupInfo(value: GlobalReplicationGroupInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalReplicationGroupInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobalReplicationGroupInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalReplicationGroupInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withKmsKeyId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KmsKeyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKmsKeyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KmsKeyId")(js.undefined)
        ret
    }
    @scala.inline
    def withMemberClusters(value: ClusterIdList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MemberClusters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMemberClusters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MemberClusters")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeGroups(value: NodeGroupList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NodeGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NodeGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withPendingModifiedValues(value: ReplicationGroupPendingModifiedValues): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PendingModifiedValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPendingModifiedValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PendingModifiedValues")(js.undefined)
        ret
    }
    @scala.inline
    def withReplicationGroupId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicationGroupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicationGroupId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicationGroupId")(js.undefined)
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
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitEncryptionEnabled(value: BooleanOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransitEncryptionEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitEncryptionEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransitEncryptionEnabled")(js.undefined)
        ret
    }
  }
  
}

