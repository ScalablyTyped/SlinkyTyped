package typingsSlinky.jsGraphAlgorithms.JsGraphs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TopologicalSortShortestPaths extends js.Object {
  var cost: js.Any = js.native
  var edgeTo: js.Any = js.native
  var marked: js.Any = js.native
  var s: js.Any = js.native
  def distanceTo(v: Double): Double = js.native
  def hasPathTo(v: Double): Boolean = js.native
  def pathTo(v: Double): js.Array[Edge] = js.native
  def relax(e: Edge): Unit = js.native
}

object TopologicalSortShortestPaths {
  @scala.inline
  def apply(
    cost: js.Any,
    distanceTo: Double => Double,
    edgeTo: js.Any,
    hasPathTo: Double => Boolean,
    marked: js.Any,
    pathTo: Double => js.Array[Edge],
    relax: Edge => Unit,
    s: js.Any
  ): TopologicalSortShortestPaths = {
    val __obj = js.Dynamic.literal(cost = cost.asInstanceOf[js.Any], distanceTo = js.Any.fromFunction1(distanceTo), edgeTo = edgeTo.asInstanceOf[js.Any], hasPathTo = js.Any.fromFunction1(hasPathTo), marked = marked.asInstanceOf[js.Any], pathTo = js.Any.fromFunction1(pathTo), relax = js.Any.fromFunction1(relax), s = s.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopologicalSortShortestPaths]
  }
  @scala.inline
  implicit class TopologicalSortShortestPathsOps[Self <: TopologicalSortShortestPaths] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCost(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDistanceTo(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distanceTo")(js.Any.fromFunction1(value))
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
    def withPathTo(value: Double => js.Array[Edge]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathTo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRelax(value: Edge => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relax")(js.Any.fromFunction1(value))
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

