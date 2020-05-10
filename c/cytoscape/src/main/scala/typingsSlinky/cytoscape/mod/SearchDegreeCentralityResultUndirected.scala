package typingsSlinky.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#eles.degreeCentrality
  */
@js.native
trait SearchDegreeCentralityResultUndirected extends js.Object {
  /** the degree centrality of the root node */
  var degree: Double = js.native
}

object SearchDegreeCentralityResultUndirected {
  @scala.inline
  def apply(degree: Double): SearchDegreeCentralityResultUndirected = {
    val __obj = js.Dynamic.literal(degree = degree.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchDegreeCentralityResultUndirected]
  }
  @scala.inline
  implicit class SearchDegreeCentralityResultUndirectedOps[Self <: SearchDegreeCentralityResultUndirected] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDegree(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("degree")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

