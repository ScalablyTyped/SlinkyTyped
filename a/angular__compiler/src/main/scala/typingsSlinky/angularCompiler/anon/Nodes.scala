package typingsSlinky.angularCompiler.anon

import typingsSlinky.angularCompiler.r3AstMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Nodes extends js.Object {
  /**
    * Parsed nodes of the template.
    */
  var nodes: js.Array[Node] = js.native
}

object Nodes {
  @scala.inline
  def apply(nodes: js.Array[Node]): Nodes = {
    val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Nodes]
  }
  @scala.inline
  implicit class NodesOps[Self <: Nodes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNodes(value: js.Array[Node]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

