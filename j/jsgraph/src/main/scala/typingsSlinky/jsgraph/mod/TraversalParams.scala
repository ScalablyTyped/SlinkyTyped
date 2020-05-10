package typingsSlinky.jsgraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TraversalParams extends js.Object {
  var digraph: DirectedGraph = js.native
  var options: js.UndefOr[TraversalOptions] = js.native
  var visitor: Visitor = js.native
}

object TraversalParams {
  @scala.inline
  def apply(digraph: DirectedGraph, visitor: Visitor): TraversalParams = {
    val __obj = js.Dynamic.literal(digraph = digraph.asInstanceOf[js.Any], visitor = visitor.asInstanceOf[js.Any])
    __obj.asInstanceOf[TraversalParams]
  }
  @scala.inline
  implicit class TraversalParamsOps[Self <: TraversalParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDigraph(value: DirectedGraph): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("digraph")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisitor(value: Visitor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: TraversalOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
  }
  
}

