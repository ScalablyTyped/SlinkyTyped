package typingsSlinky.jsGraphAlgorithms.JsGraphs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BreadthFirstSearch extends js.Object {
  var V: js.Any = js.native
  var edgeTo: js.Any = js.native
  var marked: js.Any = js.native
  var s: js.Any = js.native
  def hasPathTo(v: Double): Boolean = js.native
  def pathTo(v: Double): js.Array[Double] = js.native
}

object BreadthFirstSearch {
  @scala.inline
  def apply(
    V: js.Any,
    edgeTo: js.Any,
    hasPathTo: Double => Boolean,
    marked: js.Any,
    pathTo: Double => js.Array[Double],
    s: js.Any
  ): BreadthFirstSearch = {
    val __obj = js.Dynamic.literal(V = V.asInstanceOf[js.Any], edgeTo = edgeTo.asInstanceOf[js.Any], hasPathTo = js.Any.fromFunction1(hasPathTo), marked = marked.asInstanceOf[js.Any], pathTo = js.Any.fromFunction1(pathTo), s = s.asInstanceOf[js.Any])
    __obj.asInstanceOf[BreadthFirstSearch]
  }
  @scala.inline
  implicit class BreadthFirstSearchOps[Self <: BreadthFirstSearch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withV(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("V")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEdgeTo(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasPathTo(value: Double => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasPathTo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMarked(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPathTo(value: Double => js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathTo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withS(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

