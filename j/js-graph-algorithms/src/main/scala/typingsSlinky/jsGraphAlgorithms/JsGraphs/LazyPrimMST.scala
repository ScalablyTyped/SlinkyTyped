package typingsSlinky.jsGraphAlgorithms.JsGraphs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LazyPrimMST extends js.Object {
  var marked: js.Any = js.native
  var mst: js.Array[Edge] = js.native
  var pq: js.Any = js.native
  def visit(G: WeightedGraph, v: Double): Unit = js.native
}

object LazyPrimMST {
  @scala.inline
  def apply(marked: js.Any, mst: js.Array[Edge], pq: js.Any, visit: (WeightedGraph, Double) => Unit): LazyPrimMST = {
    val __obj = js.Dynamic.literal(marked = marked.asInstanceOf[js.Any], mst = mst.asInstanceOf[js.Any], pq = pq.asInstanceOf[js.Any], visit = js.Any.fromFunction2(visit))
    __obj.asInstanceOf[LazyPrimMST]
  }
  @scala.inline
  implicit class LazyPrimMSTOps[Self <: LazyPrimMST] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMarked(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMst(value: js.Array[Edge]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mst")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPq(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pq")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisit(value: (WeightedGraph, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visit")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

