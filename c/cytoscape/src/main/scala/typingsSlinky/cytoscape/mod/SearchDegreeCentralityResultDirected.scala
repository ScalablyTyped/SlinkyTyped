package typingsSlinky.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchDegreeCentralityResultDirected extends js.Object {
  /* the indegree centrality of the root node */
  var indegree: Double = js.native
  /* the outdegree centrality of the root node */
  var outdegree: Double = js.native
}

object SearchDegreeCentralityResultDirected {
  @scala.inline
  def apply(indegree: Double, outdegree: Double): SearchDegreeCentralityResultDirected = {
    val __obj = js.Dynamic.literal(indegree = indegree.asInstanceOf[js.Any], outdegree = outdegree.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchDegreeCentralityResultDirected]
  }
  @scala.inline
  implicit class SearchDegreeCentralityResultDirectedOps[Self <: SearchDegreeCentralityResultDirected] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndegree(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indegree")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutdegree(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outdegree")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

