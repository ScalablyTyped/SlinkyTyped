package typingsSlinky.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A null or empty node selector term matches no objects. The requirements of them are ANDed.
  * The TopologySelectorTerm type implements a subset of the NodeSelectorTerm.
  */
@js.native
trait NodeSelectorTerm extends js.Object {
  /**
    * A list of node selector requirements by node's labels.
    */
  val matchExpressions: js.Array[NodeSelectorRequirement] = js.native
  /**
    * A list of node selector requirements by node's fields.
    */
  val matchFields: js.Array[NodeSelectorRequirement] = js.native
}

object NodeSelectorTerm {
  @scala.inline
  def apply(
    matchExpressions: js.Array[NodeSelectorRequirement],
    matchFields: js.Array[NodeSelectorRequirement]
  ): NodeSelectorTerm = {
    val __obj = js.Dynamic.literal(matchExpressions = matchExpressions.asInstanceOf[js.Any], matchFields = matchFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeSelectorTerm]
  }
  @scala.inline
  implicit class NodeSelectorTermOps[Self <: NodeSelectorTerm] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMatchExpressions(value: js.Array[NodeSelectorRequirement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchExpressions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatchFields(value: js.Array[NodeSelectorRequirement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchFields")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

