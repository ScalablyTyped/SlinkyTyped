package typingsSlinky.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSnapshotMessage extends js.Object {
  /**
    * The identifier of an existing cluster. The snapshot is created from this cluster.
    */
  var CacheClusterId: js.UndefOr[String] = js.native
  /**
    * The ID of the KMS key used to encrypt the snapshot.
    */
  var KmsKeyId: js.UndefOr[String] = js.native
  /**
    * The identifier of an existing replication group. The snapshot is created from this replication group.
    */
  var ReplicationGroupId: js.UndefOr[String] = js.native
  /**
    * A name for the snapshot being created.
    */
  var SnapshotName: String = js.native
}

object CreateSnapshotMessage {
  @scala.inline
  def apply(SnapshotName: String): CreateSnapshotMessage = {
    val __obj = js.Dynamic.literal(SnapshotName = SnapshotName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSnapshotMessage]
  }
  @scala.inline
  implicit class CreateSnapshotMessageOps[Self <: CreateSnapshotMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSnapshotName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnapshotName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCacheClusterId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CacheClusterId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheClusterId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CacheClusterId")(js.undefined)
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
  }
  
}

