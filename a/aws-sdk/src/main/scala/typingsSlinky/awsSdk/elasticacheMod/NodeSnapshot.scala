package typingsSlinky.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeSnapshot extends js.Object {
  /**
    * A unique identifier for the source cluster.
    */
  var CacheClusterId: js.UndefOr[String] = js.native
  /**
    * The date and time when the cache node was created in the source cluster.
    */
  var CacheNodeCreateTime: js.UndefOr[js.Date] = js.native
  /**
    * The cache node identifier for the node in the source cluster.
    */
  var CacheNodeId: js.UndefOr[String] = js.native
  /**
    * The size of the cache on the source cache node.
    */
  var CacheSize: js.UndefOr[String] = js.native
  /**
    * The configuration for the source node group (shard).
    */
  var NodeGroupConfiguration: js.UndefOr[typingsSlinky.awsSdk.elasticacheMod.NodeGroupConfiguration] = js.native
  /**
    * A unique identifier for the source node group (shard).
    */
  var NodeGroupId: js.UndefOr[String] = js.native
  /**
    * The date and time when the source node's metadata and cache data set was obtained for the snapshot.
    */
  var SnapshotCreateTime: js.UndefOr[js.Date] = js.native
}

object NodeSnapshot {
  @scala.inline
  def apply(): NodeSnapshot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeSnapshot]
  }
  @scala.inline
  implicit class NodeSnapshotOps[Self <: NodeSnapshot] (val x: Self) extends AnyVal {
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
    def withoutCacheClusterId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CacheClusterId")(js.undefined)
        ret
    }
    @scala.inline
    def withCacheNodeCreateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CacheNodeCreateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheNodeCreateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CacheNodeCreateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withCacheNodeId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CacheNodeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheNodeId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CacheNodeId")(js.undefined)
        ret
    }
    @scala.inline
    def withCacheSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CacheSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CacheSize")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeGroupConfiguration(value: NodeGroupConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NodeGroupConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeGroupConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NodeGroupConfiguration")(js.undefined)
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
    def withSnapshotCreateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnapshotCreateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapshotCreateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnapshotCreateTime")(js.undefined)
        ret
    }
  }
  
}

