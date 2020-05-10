package typingsSlinky.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteCacheClusterMessage extends js.Object {
  /**
    * The cluster identifier for the cluster to be deleted. This parameter is not case sensitive.
    */
  var CacheClusterId: String = js.native
  /**
    * The user-supplied name of a final cluster snapshot. This is the unique name that identifies the snapshot. ElastiCache creates the snapshot, and then deletes the cluster immediately afterward.
    */
  var FinalSnapshotIdentifier: js.UndefOr[String] = js.native
}

object DeleteCacheClusterMessage {
  @scala.inline
  def apply(CacheClusterId: String): DeleteCacheClusterMessage = {
    val __obj = js.Dynamic.literal(CacheClusterId = CacheClusterId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCacheClusterMessage]
  }
  @scala.inline
  implicit class DeleteCacheClusterMessageOps[Self <: DeleteCacheClusterMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCacheClusterId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CacheClusterId")(value.asInstanceOf[js.Any])
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
  }
  
}

