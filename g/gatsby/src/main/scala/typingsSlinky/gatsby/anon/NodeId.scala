package typingsSlinky.gatsby.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeId extends js.Object {
  var nodeId: String = js.native
  var nodeType: String = js.native
}

object NodeId {
  @scala.inline
  def apply(nodeId: String, nodeType: String): NodeId = {
    val __obj = js.Dynamic.literal(nodeId = nodeId.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeId]
  }
  @scala.inline
  implicit class NodeIdOps[Self <: NodeId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNodeId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodeType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

