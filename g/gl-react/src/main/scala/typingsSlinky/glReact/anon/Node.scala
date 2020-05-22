package typingsSlinky.glReact.anon

import typingsSlinky.glReact.mod.Bus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node extends js.Object {
  var node: typingsSlinky.glReact.mod.Node | Bus
  var `type`: String
}

object Node {
  @scala.inline
  def apply(node: typingsSlinky.glReact.mod.Node | Bus, `type`: String): Node = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
}

