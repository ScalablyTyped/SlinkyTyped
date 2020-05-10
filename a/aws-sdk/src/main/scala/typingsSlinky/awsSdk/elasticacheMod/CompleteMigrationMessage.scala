package typingsSlinky.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompleteMigrationMessage extends js.Object {
  /**
    * Forces the migration to stop without ensuring that data is in sync. It is recommended to use this option only to abort the migration and not recommended when application wants to continue migration to ElastiCache.
    */
  var Force: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the replication group to which data is being migrated.
    */
  var ReplicationGroupId: String = js.native
}

object CompleteMigrationMessage {
  @scala.inline
  def apply(ReplicationGroupId: String): CompleteMigrationMessage = {
    val __obj = js.Dynamic.literal(ReplicationGroupId = ReplicationGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompleteMigrationMessage]
  }
  @scala.inline
  implicit class CompleteMigrationMessageOps[Self <: CompleteMigrationMessage] (val x: Self) extends AnyVal {
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
    def withForce(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Force")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Force")(js.undefined)
        ret
    }
  }
  
}

