package typingsSlinky.polymer.mod._Global_.polymer

import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObservedNodeInfo extends js.Object {
  var addedNodes: js.Array[Node] = js.native
  var removedNode: js.Array[Node] = js.native
  var target: Node = js.native
}

object ObservedNodeInfo {
  @scala.inline
  def apply(addedNodes: js.Array[Node], removedNode: js.Array[Node], target: Node): ObservedNodeInfo = {
    val __obj = js.Dynamic.literal(addedNodes = addedNodes.asInstanceOf[js.Any], removedNode = removedNode.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObservedNodeInfo]
  }
  @scala.inline
  implicit class ObservedNodeInfoOps[Self <: ObservedNodeInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddedNodes(value: js.Array[Node]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addedNodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemovedNode(value: js.Array[Node]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removedNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

