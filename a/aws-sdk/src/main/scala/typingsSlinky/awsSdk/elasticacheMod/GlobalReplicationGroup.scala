package typingsSlinky.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalReplicationGroup extends js.Object {
  /**
    * A flag that enables encryption at rest when set to true. You cannot modify the value of AtRestEncryptionEnabled after the replication group is created. To enable encryption at rest on a replication group you must set AtRestEncryptionEnabled to true when you create the replication group.   Required: Only available when creating a replication group in an Amazon VPC using redis version 3.2.6, 4.x or later.
    */
  var AtRestEncryptionEnabled: js.UndefOr[BooleanOptional] = js.native
  /**
    * A flag that enables using an AuthToken (password) when issuing Redis commands. Default: false 
    */
  var AuthTokenEnabled: js.UndefOr[BooleanOptional] = js.native
  /**
    * The cache node type of the Global Datastore
    */
  var CacheNodeType: js.UndefOr[String] = js.native
  /**
    * A flag that indicates whether the Global Datastore is cluster enabled.
    */
  var ClusterEnabled: js.UndefOr[BooleanOptional] = js.native
  /**
    * The Elasticache engine. For preview, it is Redis only.
    */
  var Engine: js.UndefOr[String] = js.native
  /**
    * The Elasticache Redis engine version. For preview, it is Redis version 5.0.5 only.
    */
  var EngineVersion: js.UndefOr[String] = js.native
  /**
    * Indicates the slot configuration and global identifier for each slice group.
    */
  var GlobalNodeGroups: js.UndefOr[GlobalNodeGroupList] = js.native
  /**
    * The optional description of the Global Datastore
    */
  var GlobalReplicationGroupDescription: js.UndefOr[String] = js.native
  /**
    * The name of the Global Datastore
    */
  var GlobalReplicationGroupId: js.UndefOr[String] = js.native
  /**
    * The replication groups that comprise the Global Datastore.
    */
  var Members: js.UndefOr[GlobalReplicationGroupMemberList] = js.native
  /**
    * The status of the Global Datastore
    */
  var Status: js.UndefOr[String] = js.native
  /**
    * A flag that enables in-transit encryption when set to true. You cannot modify the value of TransitEncryptionEnabled after the cluster is created. To enable in-transit encryption on a cluster you must set TransitEncryptionEnabled to true when you create a cluster. 
    */
  var TransitEncryptionEnabled: js.UndefOr[BooleanOptional] = js.native
}

object GlobalReplicationGroup {
  @scala.inline
  def apply(): GlobalReplicationGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlobalReplicationGroup]
  }
  @scala.inline
  implicit class GlobalReplicationGroupOps[Self <: GlobalReplicationGroup] (val x: Self) extends AnyVal {
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
    def withEngine(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Engine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEngine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Engine")(js.undefined)
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
    def withGlobalNodeGroups(value: GlobalNodeGroupList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalNodeGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobalNodeGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalNodeGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobalReplicationGroupDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalReplicationGroupDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobalReplicationGroupDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalReplicationGroupDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobalReplicationGroupId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalReplicationGroupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobalReplicationGroupId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalReplicationGroupId")(js.undefined)
        ret
    }
    @scala.inline
    def withMembers(value: GlobalReplicationGroupMemberList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Members")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMembers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Members")(js.undefined)
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

