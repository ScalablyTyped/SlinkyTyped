package typingsSlinky.jsGraphAlgorithms.JsGraphs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FordFulkerson extends js.Object {
  var edgeTo: js.Any = js.native
  var marked: js.Any = js.native
  var s: js.Any = js.native
  var t: js.Any = js.native
  var value: Double = js.native
  def hasAugmentedPath(G: FlowNetwork): Boolean = js.native
  def minCut(G: FlowNetwork): js.Array[FlowEdge] = js.native
}

object FordFulkerson {
  @scala.inline
  def apply(
    edgeTo: js.Any,
    hasAugmentedPath: FlowNetwork => Boolean,
    marked: js.Any,
    minCut: FlowNetwork => js.Array[FlowEdge],
    s: js.Any,
    t: js.Any,
    value: Double
  ): FordFulkerson = {
    val __obj = js.Dynamic.literal(edgeTo = edgeTo.asInstanceOf[js.Any], hasAugmentedPath = js.Any.fromFunction1(hasAugmentedPath), marked = marked.asInstanceOf[js.Any], minCut = js.Any.fromFunction1(minCut), s = s.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FordFulkerson]
  }
  @scala.inline
  implicit class FordFulkersonOps[Self <: FordFulkerson] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEdgeTo(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasAugmentedPath(value: FlowNetwork => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasAugmentedPath")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMarked(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinCut(value: FlowNetwork => js.Array[FlowEdge]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minCut")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withS(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withT(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("t")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

