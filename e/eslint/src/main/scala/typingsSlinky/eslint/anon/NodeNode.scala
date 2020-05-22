package typingsSlinky.eslint.anon

import typingsSlinky.eslint.mod.Rule.ReportDescriptorLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeNode extends ReportDescriptorLocation {
  var node: typingsSlinky.estree.mod.Node
}

object NodeNode {
  @scala.inline
  def apply(node: typingsSlinky.estree.mod.Node): NodeNode = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeNode]
  }
}

