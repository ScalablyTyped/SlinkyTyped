package typingsSlinky.jsGraphAlgorithms.JsGraphs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DepthFirstSearch[T] extends js.Object {
  var edgeTo: js.Any = js.native
  var marked: js.Any = js.native
  var s: js.Any = js.native
  def dfs(G: Graph, v: Double): Unit = js.native
  def hasPathTo(v: Double): Boolean = js.native
  def pathTo(v: Double): js.Array[Double] = js.native
}

object DepthFirstSearch {
  @scala.inline
  def apply[T](
    dfs: (Graph, Double) => Unit,
    edgeTo: js.Any,
    hasPathTo: Double => Boolean,
    marked: js.Any,
    pathTo: Double => js.Array[Double],
    s: js.Any
  ): DepthFirstSearch[T] = {
    val __obj = js.Dynamic.literal(dfs = js.Any.fromFunction2(dfs), edgeTo = edgeTo.asInstanceOf[js.Any], hasPathTo = js.Any.fromFunction1(hasPathTo), marked = marked.asInstanceOf[js.Any], pathTo = js.Any.fromFunction1(pathTo), s = s.asInstanceOf[js.Any])
    __obj.asInstanceOf[DepthFirstSearch[T]]
  }
  @scala.inline
  implicit class DepthFirstSearchOps[Self[t] <: DepthFirstSearch[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withDfs(value: (Graph, Double) => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dfs")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withEdgeTo(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasPathTo(value: Double => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasPathTo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMarked(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPathTo(value: Double => js.Array[Double]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathTo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withS(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

