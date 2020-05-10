package typingsSlinky.elasticsearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchShardsResponse extends js.Object {
  var nodes: js.Any = js.native
  var shards: js.Array[js.Array[SearchShardsResponseShard]] = js.native
}

object SearchShardsResponse {
  @scala.inline
  def apply(nodes: js.Any, shards: js.Array[js.Array[SearchShardsResponseShard]]): SearchShardsResponse = {
    val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any], shards = shards.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchShardsResponse]
  }
  @scala.inline
  implicit class SearchShardsResponseOps[Self <: SearchShardsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNodes(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShards(value: js.Array[js.Array[SearchShardsResponseShard]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shards")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

