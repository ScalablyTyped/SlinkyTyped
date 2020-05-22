package typingsSlinky.prosemirrorModel.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node extends js.Object {
  var node: org.scalajs.dom.raw.Node
  var offset: Double
}

object Node {
  @scala.inline
  def apply(node: org.scalajs.dom.raw.Node, offset: Double): Node = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
}

