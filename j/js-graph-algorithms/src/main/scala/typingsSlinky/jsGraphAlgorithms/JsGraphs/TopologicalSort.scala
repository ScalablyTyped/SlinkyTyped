package typingsSlinky.jsGraphAlgorithms.JsGraphs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TopologicalSort extends js.Object {
  var marked: js.Any = js.native
  var postOrder: js.Any = js.native
  def dfs(G: DiGraph, v: Double): Unit = js.native
  def order(): js.Array[Double] = js.native
}

object TopologicalSort {
  @scala.inline
  def apply(dfs: (DiGraph, Double) => Unit, marked: js.Any, order: () => js.Array[Double], postOrder: js.Any): TopologicalSort = {
    val __obj = js.Dynamic.literal(dfs = js.Any.fromFunction2(dfs), marked = marked.asInstanceOf[js.Any], order = js.Any.fromFunction0(order), postOrder = postOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopologicalSort]
  }
  @scala.inline
  implicit class TopologicalSortOps[Self <: TopologicalSort] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDfs(value: (DiGraph, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dfs")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withMarked(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrder(value: () => js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPostOrder(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postOrder")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

