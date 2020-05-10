package typingsSlinky.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyGlobalReplicationGroupMessage extends js.Object {
  /**
    * If true, this parameter causes the modifications in this request and any pending modifications to be applied, asynchronously and as soon as possible, regardless of the PreferredMaintenanceWindow setting for the replication group. If false, changes to the nodes in the replication group are applied on the next maintenance reboot, or the next failure reboot, whichever occurs first. 
    */
  var ApplyImmediately: Boolean = js.native
  /**
    * Determines whether a read replica is automatically promoted to read/write primary if the existing primary encounters a failure. 
    */
  var AutomaticFailoverEnabled: js.UndefOr[BooleanOptional] = js.native
  /**
    * A valid cache node type that you want to scale this Global Datastore to.
    */
  var CacheNodeType: js.UndefOr[String] = js.native
  /**
    * The upgraded version of the cache engine to be run on the clusters in the Global Datastore. 
    */
  var EngineVersion: js.UndefOr[String] = js.native
  /**
    * A description of the Global Datastore
    */
  var GlobalReplicationGroupDescription: js.UndefOr[String] = js.native
  /**
    * The name of the Global Datastore
    */
  var GlobalReplicationGroupId: String = js.native
}

object ModifyGlobalReplicationGroupMessage {
  @scala.inline
  def apply(ApplyImmediately: Boolean, GlobalReplicationGroupId: String): ModifyGlobalReplicationGroupMessage = {
    val __obj = js.Dynamic.literal(ApplyImmediately = ApplyImmediately.asInstanceOf[js.Any], GlobalReplicationGroupId = GlobalReplicationGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyGlobalReplicationGroupMessage]
  }
  @scala.inline
  implicit class ModifyGlobalReplicationGroupMessageOps[Self <: ModifyGlobalReplicationGroupMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplyImmediately(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplyImmediately")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGlobalReplicationGroupId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalReplicationGroupId")(value.asInstanceOf[js.Any])
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
  }
  
}

