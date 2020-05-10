package typingsSlinky.d3Sankey.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SankeyNodeMinimal[N /* <: SankeyExtraProperties */, L /* <: SankeyExtraProperties */] extends js.Object {
  /**
    * Node’s zero-based graph depth, derived from the graph topology calculated by Sankey layout generator.
    */
  var depth: js.UndefOr[Double] = js.native
  /**
    * Node’s zero-based graph height, derived from the graph topology calculated by Sankey layout generator.
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * Node’s zero-based index within the array of nodes calculated by Sankey layout generator.
    */
  var index: js.UndefOr[Double] = js.native
  /**
    * Array of outgoing links which have this node as their source.
    * This property is calculated internally by the Sankey layout generator.
    */
  var sourceLinks: js.UndefOr[js.Array[SankeyLink[N, L]]] = js.native
  /**
    * Array of incoming links which have this node as their target.
    * This property is calculated internally by the Sankey layout generator.
    */
  var targetLinks: js.UndefOr[js.Array[SankeyLink[N, L]]] = js.native
  /**
    * Node's value calculated by Sankey layout Generator;
    * the sum of link.value for the node’s incoming links.
    */
  var value: js.UndefOr[Double] = js.native
  /**
    * Node's minimum horizontal position (derived from the node.depth) calculated by Sankey layout generator.
    */
  var x0: js.UndefOr[Double] = js.native
  /**
    * Node’s maximum horizontal position (node.x0 + sankey.nodeWidth) calculated by Sankey layout generator.
    */
  var x1: js.UndefOr[Double] = js.native
  /**
    * Node's minimum vertical position calculated by Sankey layout generator.
    */
  var y0: js.UndefOr[Double] = js.native
  /**
    * Node's maximum vertical position (node.y1 - node.y0 is proportional to node.value) calculated by Sankey layout generator.
    */
  var y1: js.UndefOr[Double] = js.native
}

object SankeyNodeMinimal {
  @scala.inline
  def apply[N, L](): SankeyNodeMinimal[N, L] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SankeyNodeMinimal[N, L]]
  }
  @scala.inline
  implicit class SankeyNodeMinimalOps[Self[n, l] <: SankeyNodeMinimal[n, l], N, L] (val x: Self[N, L]) extends AnyVal {
    @scala.inline
    def duplicate: Self[N, L] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[N, L]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[N, L]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[N, L]) with Other]
    @scala.inline
    def withDepth(value: Double): Self[N, L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDepth: Self[N, L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depth")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self[N, L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self[N, L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self[N, L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex: Self[N, L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceLinks(value: js.Array[SankeyLink[N, L]]): Self[N, L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceLinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceLinks: Self[N, L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceLinks")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetLinks(value: js.Array[SankeyLink[N, L]]): Self[N, L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetLinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetLinks: Self[N, L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetLinks")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: Double): Self[N, L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self[N, L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
    @scala.inline
    def withX0(value: Double): Self[N, L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x0")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX0: Self[N, L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x0")(js.undefined)
        ret
    }
    @scala.inline
    def withX1(value: Double): Self[N, L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX1: Self[N, L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x1")(js.undefined)
        ret
    }
    @scala.inline
    def withY0(value: Double): Self[N, L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y0")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutY0: Self[N, L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y0")(js.undefined)
        ret
    }
    @scala.inline
    def withY1(value: Double): Self[N, L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutY1: Self[N, L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y1")(js.undefined)
        ret
    }
  }
  
}

