package typingsSlinky.ol.olXmlMod

import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeStackItem extends js.Object {
  var node: Node
}

object NodeStackItem {
  @scala.inline
  def apply(node: Node): NodeStackItem = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NodeStackItem]
  }
}

