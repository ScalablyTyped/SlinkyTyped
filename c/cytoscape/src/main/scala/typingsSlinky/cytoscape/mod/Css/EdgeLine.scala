package typingsSlinky.cytoscape.mod.Css

import typingsSlinky.cytoscape.cytoscapeStrings.`linear-gradient`
import typingsSlinky.cytoscape.cytoscapeStrings.`radial-gradient`
import typingsSlinky.cytoscape.cytoscapeStrings.`unbundled-bezier`
import typingsSlinky.cytoscape.cytoscapeStrings.bezier
import typingsSlinky.cytoscape.cytoscapeStrings.butt
import typingsSlinky.cytoscape.cytoscapeStrings.haystack
import typingsSlinky.cytoscape.cytoscapeStrings.round
import typingsSlinky.cytoscape.cytoscapeStrings.segments
import typingsSlinky.cytoscape.cytoscapeStrings.solid
import typingsSlinky.cytoscape.cytoscapeStrings.square
import typingsSlinky.cytoscape.cytoscapeStrings.straight
import typingsSlinky.cytoscape.cytoscapeStrings.taxi
import typingsSlinky.cytoscape.mod.EdgeSingular
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * These properties affect the styling of an edge’s line:
  *
  * http://js.cytoscape.org/#style/edge-line
  */
@js.native
trait EdgeLine extends js.Object {
  /**
    * The curving method used to separate two or more edges between two nodes;
    * may be
    *  - haystack (default, very fast, bundled straight edges for which loops and compounds are unsupported),
    *  - bezier(bundled curved edges),
    *  - unbundled - bezier(curved edges for use with manual control points), or
    *  - segments (a series of straight lines).
    * Note that haystack edges work best with ellipse, rectangle, or similar nodes.
    * Smaller node shapes, like triangle, will not be as aesthetically pleasing.
    * Also note that edge arrows are unsupported for haystack edges.
    */
  var `curve-style`: js.UndefOr[
    PropertyValueEdge[haystack | straight | bezier | `unbundled-bezier` | segments | taxi]
  ] = js.native
  /**
    * The cap of the edge's line.
    */
  var `line-cap`: js.UndefOr[PropertyValueEdge[butt | round | square]] = js.native
  /**
    * The colour of the edge’s line.
    */
  var `line-color`: js.UndefOr[PropertyValueEdge[Colour]] = js.native
  /**
    * The dashed line offset.
    */
  var `line-dash-offset`: js.UndefOr[PropertyValueEdge[Double]] = js.native
  /**
    * The dashed line pattern which specifies alternating lengths of lines and gaps.
    */
  var `line-dash-pattern`: js.UndefOr[js.Array[PropertyValueEdge[Double]]] = js.native
  /**
    * The filling style of the edge's line.
    */
  var `line-fill`: js.UndefOr[PropertyValueEdge[solid | `linear-gradient` | `radial-gradient`]] = js.native
  /**
    * The style of the edge’s line.
    */
  var `line-style`: js.UndefOr[PropertyValueEdge[LineStyle]] = js.native
  /**
    * The distance the edge ends from its target.
    */
  var `target-distance-from-node`: js.UndefOr[PropertyValueEdge[Double]] = js.native
  /**
    * The width of an edge’s line.
    */
  var width: js.UndefOr[PropertyValueEdge[Double | String]] = js.native
}

object EdgeLine {
  @scala.inline
  def apply(): EdgeLine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EdgeLine]
  }
  @scala.inline
  implicit class EdgeLineOps[Self <: EdgeLine] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withCurve-styleFunction1`(value: EdgeSingular => haystack | straight | bezier | `unbundled-bezier` | segments | taxi): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("curve-style")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withCurve-style`(value: PropertyValueEdge[haystack | straight | bezier | `unbundled-bezier` | segments | taxi]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("curve-style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutCurve-style`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("curve-style")(js.undefined)
        ret
    }
    @scala.inline
    def `withLine-capFunction1`(value: EdgeSingular => butt | round | square): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-cap")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withLine-cap`(value: PropertyValueEdge[butt | round | square]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-cap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutLine-cap`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-cap")(js.undefined)
        ret
    }
    @scala.inline
    def `withLine-colorFunction1`(value: EdgeSingular => Colour): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-color")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withLine-color`(value: PropertyValueEdge[Colour]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutLine-color`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-color")(js.undefined)
        ret
    }
    @scala.inline
    def `withLine-dash-offsetFunction1`(value: EdgeSingular => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-dash-offset")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withLine-dash-offset`(value: PropertyValueEdge[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-dash-offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutLine-dash-offset`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-dash-offset")(js.undefined)
        ret
    }
    @scala.inline
    def `withLine-dash-pattern`(value: js.Array[PropertyValueEdge[Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-dash-pattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutLine-dash-pattern`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-dash-pattern")(js.undefined)
        ret
    }
    @scala.inline
    def `withLine-fillFunction1`(value: EdgeSingular => solid | `linear-gradient` | `radial-gradient`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-fill")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withLine-fill`(value: PropertyValueEdge[solid | `linear-gradient` | `radial-gradient`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-fill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutLine-fill`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-fill")(js.undefined)
        ret
    }
    @scala.inline
    def `withLine-styleFunction1`(value: EdgeSingular => LineStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-style")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withLine-style`(value: PropertyValueEdge[LineStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutLine-style`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-style")(js.undefined)
        ret
    }
    @scala.inline
    def `withTarget-distance-from-nodeFunction1`(value: EdgeSingular => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target-distance-from-node")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withTarget-distance-from-node`(value: PropertyValueEdge[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target-distance-from-node")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutTarget-distance-from-node`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target-distance-from-node")(js.undefined)
        ret
    }
    @scala.inline
    def withWidthFunction1(value: EdgeSingular => Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWidth(value: PropertyValueEdge[Double | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

