package typingsSlinky.angularCompiler.anon

import typingsSlinky.angularCompiler.r3AstMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Nodes extends js.Object {
  /**
    * Parsed nodes of the template.
    */
  var nodes: js.Array[Node]
}

object Nodes {
  @scala.inline
  def apply(nodes: js.Array[Node]): Nodes = {
    val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Nodes]
  }
}

