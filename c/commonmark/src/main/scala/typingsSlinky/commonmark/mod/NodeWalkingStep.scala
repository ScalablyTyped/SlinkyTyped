package typingsSlinky.commonmark.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeWalkingStep extends js.Object {
  /**
    * a boolean, which is true when we enter a Node from a parent or sibling, and false when we reenter it from a child
    */
  var entering: Boolean = js.native
  /**
    * The node belonging to this step
    */
  var node: Node = js.native
}

object NodeWalkingStep {
  @scala.inline
  def apply(entering: Boolean, node: Node): NodeWalkingStep = {
    val __obj = js.Dynamic.literal(entering = entering.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeWalkingStep]
  }
  @scala.inline
  implicit class NodeWalkingStepOps[Self <: NodeWalkingStep] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntering(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNode(value: Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

