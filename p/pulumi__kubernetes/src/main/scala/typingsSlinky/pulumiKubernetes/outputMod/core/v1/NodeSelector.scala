package typingsSlinky.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A node selector represents the union of the results of one or more label queries over a set
  * of nodes; that is, it represents the OR of the selectors represented by the node selector
  * terms.
  */
@js.native
trait NodeSelector extends js.Object {
  /**
    * Required. A list of node selector terms. The terms are ORed.
    */
  val nodeSelectorTerms: js.Array[NodeSelectorTerm] = js.native
}

object NodeSelector {
  @scala.inline
  def apply(nodeSelectorTerms: js.Array[NodeSelectorTerm]): NodeSelector = {
    val __obj = js.Dynamic.literal(nodeSelectorTerms = nodeSelectorTerms.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeSelector]
  }
  @scala.inline
  implicit class NodeSelectorOps[Self <: NodeSelector] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNodeSelectorTerms(value: js.Array[NodeSelectorTerm]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeSelectorTerms")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

