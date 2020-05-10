package typingsSlinky.d3Sankey.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SankeyLinkMinimal[N /* <: SankeyExtraProperties */, L /* <: SankeyExtraProperties */] extends js.Object {
  /**
    * Link's zero-based index within the array of links calculated by Sankey layout generator.
    */
  var index: js.UndefOr[Double] = js.native
  /**
    * Link's source node. For convenience, when initializing a Sankey layout using the default node id accessor,
    * source may be the zero-based index of the corresponding node in the nodes array
    * returned by the nodes accessor of the Sankey layout generator rather than object references. Alternatively,
    * the Sankey layout can be configured with a custom node ID accessor to resolve the source node of the link upon initialization.
    *
    * Once the Sankey generator is invoked to return the Sankey graph object,
    * the numeric index will be replaced with the corresponding source node object.
    */
  var source: Double | String | (SankeyNode[N, L]) = js.native
  /**
    * Link's target node. For convenience, when initializing a Sankey layout using the default node id accessor,
    * target may be the zero-based index of the corresponding node in the nodes array
    * returned by the nodes accessor of the Sankey layout generator rather than object references. Alternatively,
    * the Sankey layout can be configured with a custom node ID accessor to resolve the target node of the link upon initialization.
    *
    * Once the Sankey generator is invoked to return the Sankey graph object,
    * the numeric index will be replaced with the corresponding target node object.
    */
  var target: Double | String | (SankeyNode[N, L]) = js.native
  /**
    * Link's numeric value
    */
  var value: Double = js.native
  /**
    * Link's width (proportional to its value) calculated by Sankey layout generator.
    */
  var width: js.UndefOr[Double] = js.native
  /**
    * Link's vertical starting position (at source node) calculated by Sankey layout generator.
    */
  var y0: js.UndefOr[Double] = js.native
  /**
    * Link's vertical end position (at target node) calculated by Sankey layout generator.
    */
  var y1: js.UndefOr[Double] = js.native
}

object SankeyLinkMinimal {
  @scala.inline
  def apply[N, L](
    source: Double | String | (SankeyNode[N, L]),
    target: Double | String | (SankeyNode[N, L]),
    value: Double
  ): SankeyLinkMinimal[N, L] = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SankeyLinkMinimal[N, L]]
  }
  @scala.inline
  implicit class SankeyLinkMinimalOps[Self[n, l] <: SankeyLinkMinimal[n, l], N, L] (val x: Self[N, L]) extends AnyVal {
    @scala.inline
    def duplicate: Self[N, L] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[N, L]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[N, L]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[N, L]) with Other]
    @scala.inline
    def withSource(value: Double | String | (SankeyNode[N, L])): Self[N, L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: Double | String | (SankeyNode[N, L])): Self[N, L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Double): Self[N, L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
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
    def withWidth(value: Double): Self[N, L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self[N, L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
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

