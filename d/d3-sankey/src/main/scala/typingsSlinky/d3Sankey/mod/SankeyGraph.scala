package typingsSlinky.d3Sankey.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SankeyGraph[N /* <: SankeyExtraProperties */, L /* <: SankeyExtraProperties */] extends js.Object {
  /**
    * Array of Sankey diagram links
    */
  var links: js.Array[SankeyLink[N, L]] = js.native
  /**
    * Array of Sankey diagram nodes
    */
  var nodes: js.Array[SankeyNode[N, L]] = js.native
}

object SankeyGraph {
  @scala.inline
  def apply[N, L](links: js.Array[SankeyLink[N, L]], nodes: js.Array[SankeyNode[N, L]]): SankeyGraph[N, L] = {
    val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SankeyGraph[N, L]]
  }
  @scala.inline
  implicit class SankeyGraphOps[Self[n, l] <: SankeyGraph[n, l], N, L] (val x: Self[N, L]) extends AnyVal {
    @scala.inline
    def duplicate: Self[N, L] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[N, L]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[N, L]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[N, L]) with Other]
    @scala.inline
    def withLinks(value: js.Array[SankeyLink[N, L]]): Self[N, L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("links")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodes(value: js.Array[SankeyNode[N, L]]): Self[N, L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

