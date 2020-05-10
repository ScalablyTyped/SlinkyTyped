package typingsSlinky.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteReplicationGroupMessage extends js.Object {
  /**
    * The name of a final node group (shard) snapshot. ElastiCache creates the snapshot from the primary node in the cluster, rather than one of the replicas; this is to ensure that it captures the freshest data. After the final snapshot is taken, the replication group is immediately deleted.
    */
  var FinalSnapshotIdentifier: js.UndefOr[String] = js.native
  /**
    * The identifier for the cluster to be deleted. This parameter is not case sensitive.
    */
  var ReplicationGroupId: String = js.native
  /**
    * If set to true, all of the read replicas are deleted, but the primary node is retained.
    */
  var RetainPrimaryCluster: js.UndefOr[BooleanOptional] = js.native
}

object DeleteReplicationGroupMessage {
  @scala.inline
  def apply(ReplicationGroupId: String): DeleteReplicationGroupMessage = {
    val __obj = js.Dynamic.literal(ReplicationGroupId = ReplicationGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteReplicationGroupMessage]
  }
  @scala.inline
  implicit class DeleteReplicationGroupMessageOps[Self <: DeleteReplicationGroupMessage] (val x: Self) extends AnyVal {
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
    def withFinalSnapshotIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FinalSnapshotIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFinalSnapshotIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FinalSnapshotIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withRetainPrimaryCluster(value: BooleanOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RetainPrimaryCluster")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetainPrimaryCluster: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RetainPrimaryCluster")(js.undefined)
        ret
    }
  }
  
}

