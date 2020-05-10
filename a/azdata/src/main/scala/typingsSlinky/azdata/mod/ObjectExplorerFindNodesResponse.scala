package typingsSlinky.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectExplorerFindNodesResponse extends js.Object {
  var nodes: js.Array[NodeInfo] = js.native
}

object ObjectExplorerFindNodesResponse {
  @scala.inline
  def apply(nodes: js.Array[NodeInfo]): ObjectExplorerFindNodesResponse = {
    val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectExplorerFindNodesResponse]
  }
  @scala.inline
  implicit class ObjectExplorerFindNodesResponseOps[Self <: ObjectExplorerFindNodesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNodes(value: js.Array[NodeInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

