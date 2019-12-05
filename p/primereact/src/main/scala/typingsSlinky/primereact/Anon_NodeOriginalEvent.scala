package typingsSlinky.primereact

import org.scalajs.dom.raw.Event
import typingsSlinky.primereact.componentsTreenodeTreeNodeMod.TreeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NodeOriginalEvent extends js.Object {
  var node: TreeNode
  var originalEvent: Event
}

object Anon_NodeOriginalEvent {
  @scala.inline
  def apply(node: TreeNode, originalEvent: Event): Anon_NodeOriginalEvent = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_NodeOriginalEvent]
  }
}

