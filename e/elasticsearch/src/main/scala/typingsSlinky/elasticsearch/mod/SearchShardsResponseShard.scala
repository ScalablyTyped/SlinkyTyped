package typingsSlinky.elasticsearch.mod

import typingsSlinky.elasticsearch.AnonId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchShardsResponseShard extends js.Object {
  var allocation_id: AnonId = js.native
  var index: String = js.native
  var node: String = js.native
  var primary: Boolean = js.native
  var relocating_node: js.Any = js.native
  var share: Double = js.native
  var state: String = js.native
}

object SearchShardsResponseShard {
  @scala.inline
  def apply(
    allocation_id: AnonId,
    index: String,
    node: String,
    primary: Boolean,
    relocating_node: js.Any,
    share: Double,
    state: String
  ): SearchShardsResponseShard = {
    val __obj = js.Dynamic.literal(allocation_id = allocation_id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], primary = primary.asInstanceOf[js.Any], relocating_node = relocating_node.asInstanceOf[js.Any], share = share.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchShardsResponseShard]
  }
  @scala.inline
  implicit class SearchShardsResponseShardOps[Self <: SearchShardsResponseShard] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllocation_id(value: AnonId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allocation_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrimary(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelocating_node(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relocating_node")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShare(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("share")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

