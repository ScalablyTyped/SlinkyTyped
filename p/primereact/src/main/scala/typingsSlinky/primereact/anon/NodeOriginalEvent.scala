package typingsSlinky.primereact.anon

import typingsSlinky.primereact.treeNodeMod.TreeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeOriginalEvent extends js.Object {
  var node: TreeNode
  var originalEvent: org.scalajs.dom.raw.Event
}

object NodeOriginalEvent {
  @scala.inline
  def apply(node: TreeNode, originalEvent: org.scalajs.dom.raw.Event): NodeOriginalEvent = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeOriginalEvent]
  }
}

