package typingsSlinky.primereact.anon

import typingsSlinky.primereact.treeNodeMod.TreeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeOriginalEvent extends js.Object {
  var node: TreeNode = js.native
  var originalEvent: org.scalajs.dom.raw.Event = js.native
}

object NodeOriginalEvent {
  @scala.inline
  def apply(node: TreeNode, originalEvent: org.scalajs.dom.raw.Event): NodeOriginalEvent = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeOriginalEvent]
  }
  @scala.inline
  implicit class NodeOriginalEventOps[Self <: NodeOriginalEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNode(value: TreeNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginalEvent(value: org.scalajs.dom.raw.Event): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalEvent")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

