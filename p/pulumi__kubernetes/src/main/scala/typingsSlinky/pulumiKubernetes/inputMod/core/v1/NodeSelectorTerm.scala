package typingsSlinky.pulumiKubernetes.inputMod.core.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
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
  var matchExpressions: js.UndefOr[Input[js.Array[Input[NodeSelectorRequirement]]]] = js.native
  /**
    * A list of node selector requirements by node's fields.
    */
  var matchFields: js.UndefOr[Input[js.Array[Input[NodeSelectorRequirement]]]] = js.native
}

object NodeSelectorTerm {
  @scala.inline
  def apply(): NodeSelectorTerm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeSelectorTerm]
  }
  @scala.inline
  implicit class NodeSelectorTermOps[Self <: NodeSelectorTerm] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMatchExpressions(value: Input[js.Array[Input[NodeSelectorRequirement]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchExpressions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchExpressions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchExpressions")(js.undefined)
        ret
    }
    @scala.inline
    def withMatchFields(value: Input[js.Array[Input[NodeSelectorRequirement]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchFields")(js.undefined)
        ret
    }
  }
  
}

