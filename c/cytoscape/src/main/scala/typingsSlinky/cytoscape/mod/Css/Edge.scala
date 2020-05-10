package typingsSlinky.cytoscape.mod.Css

import typingsSlinky.cytoscape.cytoscapeStrings.`linear-gradient`
import typingsSlinky.cytoscape.cytoscapeStrings.`node-position`
import typingsSlinky.cytoscape.cytoscapeStrings.`radial-gradient`
import typingsSlinky.cytoscape.cytoscapeStrings.`unbundled-bezier`
import typingsSlinky.cytoscape.cytoscapeStrings.bezier
import typingsSlinky.cytoscape.cytoscapeStrings.bottom
import typingsSlinky.cytoscape.cytoscapeStrings.butt
import typingsSlinky.cytoscape.cytoscapeStrings.center
import typingsSlinky.cytoscape.cytoscapeStrings.displayed
import typingsSlinky.cytoscape.cytoscapeStrings.ellipsis
import typingsSlinky.cytoscape.cytoscapeStrings.haystack
import typingsSlinky.cytoscape.cytoscapeStrings.intersection
import typingsSlinky.cytoscape.cytoscapeStrings.left
import typingsSlinky.cytoscape.cytoscapeStrings.no
import typingsSlinky.cytoscape.cytoscapeStrings.none
import typingsSlinky.cytoscape.cytoscapeStrings.rectangle
import typingsSlinky.cytoscape.cytoscapeStrings.right
import typingsSlinky.cytoscape.cytoscapeStrings.round
import typingsSlinky.cytoscape.cytoscapeStrings.roundrectangle
import typingsSlinky.cytoscape.cytoscapeStrings.segments
import typingsSlinky.cytoscape.cytoscapeStrings.solid
import typingsSlinky.cytoscape.cytoscapeStrings.square
import typingsSlinky.cytoscape.cytoscapeStrings.straight
import typingsSlinky.cytoscape.cytoscapeStrings.taxi
import typingsSlinky.cytoscape.cytoscapeStrings.top
import typingsSlinky.cytoscape.cytoscapeStrings.visible
import typingsSlinky.cytoscape.cytoscapeStrings.wrap
import typingsSlinky.cytoscape.cytoscapeStrings.yes
import typingsSlinky.cytoscape.mod.EdgeSingular
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent cytoscape.cytoscape.Css.EdgeLine */
/* Inlined parent cytoscape.cytoscape.Css.EdgeArrow */
/* Inlined parent std.Partial<cytoscape.cytoscape.Css.Gradient> */
/* Inlined parent std.Partial<cytoscape.cytoscape.Css.Overlay> */
/* Inlined parent std.Partial<cytoscape.cytoscape.Css.BezierEdges> */
/* Inlined parent std.Partial<cytoscape.cytoscape.Css.UnbundledBezierEdges> */
/* Inlined parent std.Partial<cytoscape.cytoscape.Css.HaystackEdges> */
/* Inlined parent std.Partial<cytoscape.cytoscape.Css.SegmentsEdges> */
/* Inlined parent std.Partial<cytoscape.cytoscape.Css.Visibility<cytoscape.cytoscape.EdgeSingular>> */
/* Inlined parent std.Partial<cytoscape.cytoscape.Css.Labels<cytoscape.cytoscape.EdgeSingular>> */
@js.native
trait Edge extends js.Object {
  /** The size of the arrow. */
  var `arrow-scale`: js.UndefOr[PropertyValueEdge[Double]] = js.native
  var color: js.UndefOr[PropertyValue[EdgeSingular, Colour]] = js.native
  var `control-point-distance`: js.UndefOr[PropertyValueEdge[Double]] = js.native
  var `control-point-distances`: js.UndefOr[PropertyValueEdge[String]] = js.native
  var `control-point-step-size`: js.UndefOr[PropertyValueEdge[Double]] = js.native
  var `control-point-weight`: js.UndefOr[PropertyValueEdge[Double]] = js.native
  var `control-point-weights`: js.UndefOr[PropertyValueEdge[String]] = js.native
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
  var display: js.UndefOr[PropertyValue[EdgeSingular, none | displayed]] = js.native
  var `edge-distances`: js.UndefOr[PropertyValueEdge[intersection | `node-position`]] = js.native
  var `font-family`: js.UndefOr[PropertyValue[EdgeSingular, String]] = js.native
  var `font-size`: js.UndefOr[PropertyValue[EdgeSingular, Double | String]] = js.native
  var `font-style`: js.UndefOr[PropertyValue[EdgeSingular, FontStyle]] = js.native
  var `font-weight`: js.UndefOr[PropertyValue[EdgeSingular, FontWeight]] = js.native
  var `haystack-radius`: js.UndefOr[PropertyValueEdge[Double]] = js.native
  var label: js.UndefOr[PropertyValue[EdgeSingular, String]] = js.native
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
  var `line-gradient-stop-colours`: js.UndefOr[js.Array[PropertyValueEdge[Colour]]] = js.native
  var `line-gradient-stop-positions`: js.UndefOr[js.Array[PropertyValueEdge[Double]]] = js.native
  /**
    * The style of the edge’s line.
    */
  var `line-style`: js.UndefOr[PropertyValueEdge[LineStyle]] = js.native
  /** The colour of the edge’s "mid-source" arrow. */
  var `mid-source-arrow-color`: js.UndefOr[PropertyValueEdge[Colour]] = js.native
  /** The fill state of the edge’s mid-source arrow. */
  var `mid-source-arrow-fill`: js.UndefOr[PropertyValueEdge[ArrowFill]] = js.native
  /** The shape of the edge’s mid-source arrow. */
  var `mid-source-arrow-shape`: js.UndefOr[PropertyValueEdge[ArrowShape]] = js.native
  /** The colour of the edge’s "mid-target" arrow. */
  var `mid-target-arrow-color`: js.UndefOr[PropertyValueEdge[Colour]] = js.native
  /** The fill state of the edge’s mid-target arrow. */
  var `mid-target-arrow-fill`: js.UndefOr[PropertyValueEdge[ArrowFill]] = js.native
  /** The shape of the edge’s mid-target arrow. */
  var `mid-target-arrow-shape`: js.UndefOr[PropertyValueEdge[ArrowShape]] = js.native
  var `min-zoomed-font-size`: js.UndefOr[PropertyValue[EdgeSingular, Double]] = js.native
  var opacity: js.UndefOr[PropertyValue[EdgeSingular, Double]] = js.native
  var `overlay-color`: js.UndefOr[PropertyValueEdge[Colour]] = js.native
  var `overlay-opacity`: js.UndefOr[PropertyValueEdge[Double]] = js.native
  var `overlay-padding`: js.UndefOr[PropertyValueEdge[Double | String]] = js.native
  var `segment-distances`: js.UndefOr[PropertyValueEdge[String]] = js.native
  var `segment-weights`: js.UndefOr[PropertyValueEdge[String]] = js.native
  /** The colour of the edge’s source arrow. */
  var `source-arrow-color`: js.UndefOr[PropertyValueEdge[Colour]] = js.native
  /** The fill state of the edge’s source arrow. */
  var `source-arrow-fill`: js.UndefOr[PropertyValueEdge[ArrowFill]] = js.native
  /** The shape of the edge’s source arrow. */
  var `source-arrow-shape`: js.UndefOr[PropertyValueEdge[ArrowShape]] = js.native
  var `source-label`: js.UndefOr[PropertyValue[EdgeSingular, String]] = js.native
  var `source-text-margin-x`: js.UndefOr[PropertyValue[EdgeSingular, Double]] = js.native
  var `source-text-margin-y`: js.UndefOr[PropertyValue[EdgeSingular, Double]] = js.native
  var `source-text-offset`: js.UndefOr[PropertyValue[EdgeSingular, Double]] = js.native
  var `source-text-rotation`: js.UndefOr[PropertyValue[EdgeSingular, Double]] = js.native
  /** The colour of the edge’s target arrow. */
  var `target-arrow-color`: js.UndefOr[PropertyValueEdge[Colour]] = js.native
  /** The fill state of the edge’s target arrow. */
  var `target-arrow-fill`: js.UndefOr[PropertyValueEdge[ArrowFill]] = js.native
  /** The shape of the edge’s target arrow. */
  var `target-arrow-shape`: js.UndefOr[PropertyValueEdge[ArrowShape]] = js.native
  /**
    * The distance the edge ends from its target.
    */
  var `target-distance-from-node`: js.UndefOr[PropertyValueEdge[Double]] = js.native
  var `target-label`: js.UndefOr[PropertyValue[EdgeSingular, String]] = js.native
  var `target-text-margin-x`: js.UndefOr[PropertyValue[EdgeSingular, Double]] = js.native
  var `target-text-margin-y`: js.UndefOr[PropertyValue[EdgeSingular, Double]] = js.native
  var `target-text-offset`: js.UndefOr[PropertyValue[EdgeSingular, Double]] = js.native
  var `target-text-rotation`: js.UndefOr[PropertyValue[EdgeSingular, Double]] = js.native
  var `text-background-color`: js.UndefOr[PropertyValue[EdgeSingular, Colour]] = js.native
  var `text-background-opacity`: js.UndefOr[PropertyValue[EdgeSingular, Double]] = js.native
  var `text-background-padding`: js.UndefOr[PropertyValue[EdgeSingular, String]] = js.native
  var `text-background-shape`: js.UndefOr[PropertyValue[EdgeSingular, rectangle | roundrectangle]] = js.native
  var `text-border-color`: js.UndefOr[PropertyValue[EdgeSingular, Colour]] = js.native
  var `text-border-opacity`: js.UndefOr[PropertyValue[EdgeSingular, Double]] = js.native
  var `text-border-style`: js.UndefOr[PropertyValue[EdgeSingular, LineStyle]] = js.native
  var `text-border-width`: js.UndefOr[PropertyValue[EdgeSingular, Double]] = js.native
  var `text-events`: js.UndefOr[PropertyValue[EdgeSingular, yes | no]] = js.native
  var `text-halign`: js.UndefOr[PropertyValue[EdgeSingular, left | center | right]] = js.native
  var `text-margin-x`: js.UndefOr[PropertyValue[EdgeSingular, Double]] = js.native
  var `text-margin-y`: js.UndefOr[PropertyValue[EdgeSingular, Double]] = js.native
  var `text-max-width`: js.UndefOr[PropertyValue[EdgeSingular, String]] = js.native
  var `text-opacity`: js.UndefOr[PropertyValue[EdgeSingular, Double]] = js.native
  var `text-outline-color`: js.UndefOr[PropertyValue[EdgeSingular, Colour]] = js.native
  var `text-outline-opacity`: js.UndefOr[PropertyValue[EdgeSingular, Double]] = js.native
  var `text-outline-width`: js.UndefOr[PropertyValue[EdgeSingular, Double | String]] = js.native
  var `text-rotation`: js.UndefOr[PropertyValue[EdgeSingular, Double]] = js.native
  var `text-shadow-blur`: js.UndefOr[PropertyValue[EdgeSingular, Double]] = js.native
  var `text-shadow-color`: js.UndefOr[PropertyValue[EdgeSingular, Colour]] = js.native
  var `text-shadow-offset-x`: js.UndefOr[PropertyValue[EdgeSingular, Double]] = js.native
  var `text-shadow-offset-y`: js.UndefOr[PropertyValue[EdgeSingular, Double]] = js.native
  var `text-shadow-opacity`: js.UndefOr[PropertyValue[EdgeSingular, Double]] = js.native
  var `text-transform`: js.UndefOr[PropertyValue[EdgeSingular, TextTranformation]] = js.native
  var `text-valign`: js.UndefOr[PropertyValue[EdgeSingular, top | center | bottom]] = js.native
  var `text-wrap`: js.UndefOr[PropertyValue[EdgeSingular, none | wrap | ellipsis]] = js.native
  var visibility: js.UndefOr[PropertyValue[EdgeSingular, none | visible]] = js.native
  /**
    * The width of an edge’s line.
    */
  var width: js.UndefOr[PropertyValueEdge[Double | String]] = js.native
  var `z-index`: js.UndefOr[PropertyValue[EdgeSingular, Double]] = js.native
}

object Edge {
  @scala.inline
  def apply(): Edge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Edge]
  }
  @scala.inline
  implicit class EdgeOps[Self <: Edge] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withArrow-scaleFunction1`(value: EdgeSingular => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrow-scale")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withArrow-scale`(value: PropertyValueEdge[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrow-scale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutArrow-scale`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrow-scale")(js.undefined)
        ret
    }
    @scala.inline
    def withColorFunction1(value: EdgeSingular => Colour): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withColor(value: PropertyValue[EdgeSingular, Colour]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def `withControl-point-distanceFunction1`(value: EdgeSingular => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("control-point-distance")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withControl-point-distance`(value: PropertyValueEdge[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("control-point-distance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutControl-point-distance`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("control-point-distance")(js.undefined)
        ret
    }
    @scala.inline
    def `withControl-point-distancesFunction1`(value: EdgeSingular => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("control-point-distances")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withControl-point-distances`(value: PropertyValueEdge[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("control-point-distances")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutControl-point-distances`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("control-point-distances")(js.undefined)
        ret
    }
    @scala.inline
    def `withControl-point-step-sizeFunction1`(value: EdgeSingular => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("control-point-step-size")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withControl-point-step-size`(value: PropertyValueEdge[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("control-point-step-size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutControl-point-step-size`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("control-point-step-size")(js.undefined)
        ret
    }
    @scala.inline
    def `withControl-point-weightFunction1`(value: EdgeSingular => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("control-point-weight")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withControl-point-weight`(value: PropertyValueEdge[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("control-point-weight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutControl-point-weight`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("control-point-weight")(js.undefined)
        ret
    }
    @scala.inline
    def `withControl-point-weightsFunction1`(value: EdgeSingular => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("control-point-weights")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withControl-point-weights`(value: PropertyValueEdge[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("control-point-weights")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutControl-point-weights`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("control-point-weights")(js.undefined)
        ret
    }
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
    def withDisplayFunction1(value: EdgeSingular => none | displayed): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDisplay(value: PropertyValue[EdgeSingular, none | displayed]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display")(js.undefined)
        ret
    }
    @scala.inline
    def `withEdge-distancesFunction1`(value: EdgeSingular => intersection | `node-position`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edge-distances")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withEdge-distances`(value: PropertyValueEdge[intersection | `node-position`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edge-distances")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutEdge-distances`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edge-distances")(js.undefined)
        ret
    }
    @scala.inline
    def `withFont-familyFunction1`(value: EdgeSingular => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-family")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withFont-family`(value: PropertyValue[EdgeSingular, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-family")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFont-family`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-family")(js.undefined)
        ret
    }
    @scala.inline
    def `withFont-sizeFunction1`(value: EdgeSingular => Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-size")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withFont-size`(value: PropertyValue[EdgeSingular, Double | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFont-size`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-size")(js.undefined)
        ret
    }
    @scala.inline
    def `withFont-styleFunction1`(value: EdgeSingular => FontStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-style")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withFont-style`(value: PropertyValue[EdgeSingular, FontStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFont-style`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-style")(js.undefined)
        ret
    }
    @scala.inline
    def `withFont-weightFunction1`(value: EdgeSingular => FontWeight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-weight")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withFont-weight`(value: PropertyValue[EdgeSingular, FontWeight]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-weight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFont-weight`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-weight")(js.undefined)
        ret
    }
    @scala.inline
    def `withHaystack-radiusFunction1`(value: EdgeSingular => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("haystack-radius")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withHaystack-radius`(value: PropertyValueEdge[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("haystack-radius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutHaystack-radius`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("haystack-radius")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelFunction1(value: EdgeSingular => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLabel(value: PropertyValue[EdgeSingular, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
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
    def `withLine-gradient-stop-colours`(value: js.Array[PropertyValueEdge[Colour]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-gradient-stop-colours")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutLine-gradient-stop-colours`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-gradient-stop-colours")(js.undefined)
        ret
    }
    @scala.inline
    def `withLine-gradient-stop-positions`(value: js.Array[PropertyValueEdge[Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-gradient-stop-positions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutLine-gradient-stop-positions`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-gradient-stop-positions")(js.undefined)
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
    def `withMid-source-arrow-colorFunction1`(value: EdgeSingular => Colour): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mid-source-arrow-color")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withMid-source-arrow-color`(value: PropertyValueEdge[Colour]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mid-source-arrow-color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMid-source-arrow-color`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mid-source-arrow-color")(js.undefined)
        ret
    }
    @scala.inline
    def `withMid-source-arrow-fillFunction1`(value: EdgeSingular => ArrowFill): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mid-source-arrow-fill")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withMid-source-arrow-fill`(value: PropertyValueEdge[ArrowFill]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mid-source-arrow-fill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMid-source-arrow-fill`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mid-source-arrow-fill")(js.undefined)
        ret
    }
    @scala.inline
    def `withMid-source-arrow-shapeFunction1`(value: EdgeSingular => ArrowShape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mid-source-arrow-shape")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withMid-source-arrow-shape`(value: PropertyValueEdge[ArrowShape]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mid-source-arrow-shape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMid-source-arrow-shape`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mid-source-arrow-shape")(js.undefined)
        ret
    }
    @scala.inline
    def `withMid-target-arrow-colorFunction1`(value: EdgeSingular => Colour): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mid-target-arrow-color")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withMid-target-arrow-color`(value: PropertyValueEdge[Colour]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mid-target-arrow-color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMid-target-arrow-color`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mid-target-arrow-color")(js.undefined)
        ret
    }
    @scala.inline
    def `withMid-target-arrow-fillFunction1`(value: EdgeSingular => ArrowFill): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mid-target-arrow-fill")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withMid-target-arrow-fill`(value: PropertyValueEdge[ArrowFill]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mid-target-arrow-fill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMid-target-arrow-fill`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mid-target-arrow-fill")(js.undefined)
        ret
    }
    @scala.inline
    def `withMid-target-arrow-shapeFunction1`(value: EdgeSingular => ArrowShape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mid-target-arrow-shape")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withMid-target-arrow-shape`(value: PropertyValueEdge[ArrowShape]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mid-target-arrow-shape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMid-target-arrow-shape`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mid-target-arrow-shape")(js.undefined)
        ret
    }
    @scala.inline
    def `withMin-zoomed-font-sizeFunction1`(value: EdgeSingular => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min-zoomed-font-size")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withMin-zoomed-font-size`(value: PropertyValue[EdgeSingular, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min-zoomed-font-size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMin-zoomed-font-size`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min-zoomed-font-size")(js.undefined)
        ret
    }
    @scala.inline
    def withOpacityFunction1(value: EdgeSingular => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOpacity(value: PropertyValue[EdgeSingular, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(js.undefined)
        ret
    }
    @scala.inline
    def `withOverlay-colorFunction1`(value: EdgeSingular => Colour): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlay-color")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withOverlay-color`(value: PropertyValueEdge[Colour]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlay-color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutOverlay-color`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlay-color")(js.undefined)
        ret
    }
    @scala.inline
    def `withOverlay-opacityFunction1`(value: EdgeSingular => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlay-opacity")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withOverlay-opacity`(value: PropertyValueEdge[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlay-opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutOverlay-opacity`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlay-opacity")(js.undefined)
        ret
    }
    @scala.inline
    def `withOverlay-paddingFunction1`(value: EdgeSingular => Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlay-padding")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withOverlay-padding`(value: PropertyValueEdge[Double | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlay-padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutOverlay-padding`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlay-padding")(js.undefined)
        ret
    }
    @scala.inline
    def `withSegment-distancesFunction1`(value: EdgeSingular => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segment-distances")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withSegment-distances`(value: PropertyValueEdge[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segment-distances")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutSegment-distances`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segment-distances")(js.undefined)
        ret
    }
    @scala.inline
    def `withSegment-weightsFunction1`(value: EdgeSingular => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segment-weights")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withSegment-weights`(value: PropertyValueEdge[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segment-weights")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutSegment-weights`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segment-weights")(js.undefined)
        ret
    }
    @scala.inline
    def `withSource-arrow-colorFunction1`(value: EdgeSingular => Colour): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source-arrow-color")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withSource-arrow-color`(value: PropertyValueEdge[Colour]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source-arrow-color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutSource-arrow-color`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source-arrow-color")(js.undefined)
        ret
    }
    @scala.inline
    def `withSource-arrow-fillFunction1`(value: EdgeSingular => ArrowFill): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source-arrow-fill")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withSource-arrow-fill`(value: PropertyValueEdge[ArrowFill]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source-arrow-fill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutSource-arrow-fill`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source-arrow-fill")(js.undefined)
        ret
    }
    @scala.inline
    def `withSource-arrow-shapeFunction1`(value: EdgeSingular => ArrowShape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source-arrow-shape")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withSource-arrow-shape`(value: PropertyValueEdge[ArrowShape]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source-arrow-shape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutSource-arrow-shape`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source-arrow-shape")(js.undefined)
        ret
    }
    @scala.inline
    def `withSource-labelFunction1`(value: EdgeSingular => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source-label")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withSource-label`(value: PropertyValue[EdgeSingular, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source-label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutSource-label`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source-label")(js.undefined)
        ret
    }
    @scala.inline
    def `withSource-text-margin-xFunction1`(value: EdgeSingular => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source-text-margin-x")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withSource-text-margin-x`(value: PropertyValue[EdgeSingular, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source-text-margin-x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutSource-text-margin-x`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source-text-margin-x")(js.undefined)
        ret
    }
    @scala.inline
    def `withSource-text-margin-yFunction1`(value: EdgeSingular => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source-text-margin-y")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withSource-text-margin-y`(value: PropertyValue[EdgeSingular, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source-text-margin-y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutSource-text-margin-y`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source-text-margin-y")(js.undefined)
        ret
    }
    @scala.inline
    def `withSource-text-offsetFunction1`(value: EdgeSingular => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source-text-offset")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withSource-text-offset`(value: PropertyValue[EdgeSingular, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source-text-offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutSource-text-offset`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source-text-offset")(js.undefined)
        ret
    }
    @scala.inline
    def `withSource-text-rotationFunction1`(value: EdgeSingular => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source-text-rotation")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withSource-text-rotation`(value: PropertyValue[EdgeSingular, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source-text-rotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutSource-text-rotation`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source-text-rotation")(js.undefined)
        ret
    }
    @scala.inline
    def `withTarget-arrow-colorFunction1`(value: EdgeSingular => Colour): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target-arrow-color")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withTarget-arrow-color`(value: PropertyValueEdge[Colour]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target-arrow-color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutTarget-arrow-color`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target-arrow-color")(js.undefined)
        ret
    }
    @scala.inline
    def `withTarget-arrow-fillFunction1`(value: EdgeSingular => ArrowFill): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target-arrow-fill")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withTarget-arrow-fill`(value: PropertyValueEdge[ArrowFill]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target-arrow-fill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutTarget-arrow-fill`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target-arrow-fill")(js.undefined)
        ret
    }
    @scala.inline
    def `withTarget-arrow-shapeFunction1`(value: EdgeSingular => ArrowShape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target-arrow-shape")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withTarget-arrow-shape`(value: PropertyValueEdge[ArrowShape]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target-arrow-shape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutTarget-arrow-shape`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target-arrow-shape")(js.undefined)
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
    def `withTarget-labelFunction1`(value: EdgeSingular => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target-label")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withTarget-label`(value: PropertyValue[EdgeSingular, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target-label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutTarget-label`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target-label")(js.undefined)
        ret
    }
    @scala.inline
    def `withTarget-text-margin-xFunction1`(value: EdgeSingular => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target-text-margin-x")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withTarget-text-margin-x`(value: PropertyValue[EdgeSingular, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target-text-margin-x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutTarget-text-margin-x`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target-text-margin-x")(js.undefined)
        ret
    }
    @scala.inline
    def `withTarget-text-margin-yFunction1`(value: EdgeSingular => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target-text-margin-y")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withTarget-text-margin-y`(value: PropertyValue[EdgeSingular, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target-text-margin-y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutTarget-text-margin-y`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target-text-margin-y")(js.undefined)
        ret
    }
    @scala.inline
    def `withTarget-text-offsetFunction1`(value: EdgeSingular => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target-text-offset")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withTarget-text-offset`(value: PropertyValue[EdgeSingular, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target-text-offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutTarget-text-offset`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target-text-offset")(js.undefined)
        ret
    }
    @scala.inline
    def `withTarget-text-rotationFunction1`(value: EdgeSingular => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target-text-rotation")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withTarget-text-rotation`(value: PropertyValue[EdgeSingular, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target-text-rotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutTarget-text-rotation`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target-text-rotation")(js.undefined)
        ret
    }
    @scala.inline
    def `withText-background-colorFunction1`(value: EdgeSingular => Colour): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-background-color")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withText-background-color`(value: PropertyValue[EdgeSingular, Colour]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-background-color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutText-background-color`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-background-color")(js.undefined)
        ret
    }
    @scala.inline
    def `withText-background-opacityFunction1`(value: EdgeSingular => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-background-opacity")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withText-background-opacity`(value: PropertyValue[EdgeSingular, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-background-opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutText-background-opacity`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-background-opacity")(js.undefined)
        ret
    }
    @scala.inline
    def `withText-background-paddingFunction1`(value: EdgeSingular => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-background-padding")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withText-background-padding`(value: PropertyValue[EdgeSingular, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-background-padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutText-background-padding`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-background-padding")(js.undefined)
        ret
    }
    @scala.inline
    def `withText-background-shapeFunction1`(value: EdgeSingular => rectangle | roundrectangle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-background-shape")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withText-background-shape`(value: PropertyValue[EdgeSingular, rectangle | roundrectangle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-background-shape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutText-background-shape`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-background-shape")(js.undefined)
        ret
    }
    @scala.inline
    def `withText-border-colorFunction1`(value: EdgeSingular => Colour): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-border-color")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withText-border-color`(value: PropertyValue[EdgeSingular, Colour]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-border-color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutText-border-color`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-border-color")(js.undefined)
        ret
    }
    @scala.inline
    def `withText-border-opacityFunction1`(value: EdgeSingular => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-border-opacity")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withText-border-opacity`(value: PropertyValue[EdgeSingular, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-border-opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutText-border-opacity`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-border-opacity")(js.undefined)
        ret
    }
    @scala.inline
    def `withText-border-styleFunction1`(value: EdgeSingular => LineStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-border-style")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withText-border-style`(value: PropertyValue[EdgeSingular, LineStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-border-style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutText-border-style`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-border-style")(js.undefined)
        ret
    }
    @scala.inline
    def `withText-border-widthFunction1`(value: EdgeSingular => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-border-width")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withText-border-width`(value: PropertyValue[EdgeSingular, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-border-width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutText-border-width`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-border-width")(js.undefined)
        ret
    }
    @scala.inline
    def `withText-eventsFunction1`(value: EdgeSingular => yes | no): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-events")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withText-events`(value: PropertyValue[EdgeSingular, yes | no]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutText-events`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-events")(js.undefined)
        ret
    }
    @scala.inline
    def `withText-halignFunction1`(value: EdgeSingular => left | center | right): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-halign")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withText-halign`(value: PropertyValue[EdgeSingular, left | center | right]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-halign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutText-halign`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-halign")(js.undefined)
        ret
    }
    @scala.inline
    def `withText-margin-xFunction1`(value: EdgeSingular => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-margin-x")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withText-margin-x`(value: PropertyValue[EdgeSingular, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-margin-x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutText-margin-x`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-margin-x")(js.undefined)
        ret
    }
    @scala.inline
    def `withText-margin-yFunction1`(value: EdgeSingular => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-margin-y")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withText-margin-y`(value: PropertyValue[EdgeSingular, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-margin-y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutText-margin-y`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-margin-y")(js.undefined)
        ret
    }
    @scala.inline
    def `withText-max-widthFunction1`(value: EdgeSingular => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-max-width")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withText-max-width`(value: PropertyValue[EdgeSingular, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-max-width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutText-max-width`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-max-width")(js.undefined)
        ret
    }
    @scala.inline
    def `withText-opacityFunction1`(value: EdgeSingular => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-opacity")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withText-opacity`(value: PropertyValue[EdgeSingular, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutText-opacity`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-opacity")(js.undefined)
        ret
    }
    @scala.inline
    def `withText-outline-colorFunction1`(value: EdgeSingular => Colour): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-outline-color")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withText-outline-color`(value: PropertyValue[EdgeSingular, Colour]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-outline-color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutText-outline-color`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-outline-color")(js.undefined)
        ret
    }
    @scala.inline
    def `withText-outline-opacityFunction1`(value: EdgeSingular => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-outline-opacity")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withText-outline-opacity`(value: PropertyValue[EdgeSingular, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-outline-opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutText-outline-opacity`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-outline-opacity")(js.undefined)
        ret
    }
    @scala.inline
    def `withText-outline-widthFunction1`(value: EdgeSingular => Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-outline-width")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withText-outline-width`(value: PropertyValue[EdgeSingular, Double | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-outline-width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutText-outline-width`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-outline-width")(js.undefined)
        ret
    }
    @scala.inline
    def `withText-rotationFunction1`(value: EdgeSingular => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-rotation")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withText-rotation`(value: PropertyValue[EdgeSingular, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-rotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutText-rotation`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-rotation")(js.undefined)
        ret
    }
    @scala.inline
    def `withText-shadow-blurFunction1`(value: EdgeSingular => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-shadow-blur")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withText-shadow-blur`(value: PropertyValue[EdgeSingular, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-shadow-blur")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutText-shadow-blur`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-shadow-blur")(js.undefined)
        ret
    }
    @scala.inline
    def `withText-shadow-colorFunction1`(value: EdgeSingular => Colour): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-shadow-color")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withText-shadow-color`(value: PropertyValue[EdgeSingular, Colour]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-shadow-color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutText-shadow-color`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-shadow-color")(js.undefined)
        ret
    }
    @scala.inline
    def `withText-shadow-offset-xFunction1`(value: EdgeSingular => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-shadow-offset-x")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withText-shadow-offset-x`(value: PropertyValue[EdgeSingular, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-shadow-offset-x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutText-shadow-offset-x`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-shadow-offset-x")(js.undefined)
        ret
    }
    @scala.inline
    def `withText-shadow-offset-yFunction1`(value: EdgeSingular => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-shadow-offset-y")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withText-shadow-offset-y`(value: PropertyValue[EdgeSingular, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-shadow-offset-y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutText-shadow-offset-y`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-shadow-offset-y")(js.undefined)
        ret
    }
    @scala.inline
    def `withText-shadow-opacityFunction1`(value: EdgeSingular => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-shadow-opacity")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withText-shadow-opacity`(value: PropertyValue[EdgeSingular, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-shadow-opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutText-shadow-opacity`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-shadow-opacity")(js.undefined)
        ret
    }
    @scala.inline
    def `withText-transformFunction1`(value: EdgeSingular => TextTranformation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-transform")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withText-transform`(value: PropertyValue[EdgeSingular, TextTranformation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-transform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutText-transform`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-transform")(js.undefined)
        ret
    }
    @scala.inline
    def `withText-valignFunction1`(value: EdgeSingular => top | center | bottom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-valign")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withText-valign`(value: PropertyValue[EdgeSingular, top | center | bottom]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-valign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutText-valign`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-valign")(js.undefined)
        ret
    }
    @scala.inline
    def `withText-wrapFunction1`(value: EdgeSingular => none | wrap | ellipsis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-wrap")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withText-wrap`(value: PropertyValue[EdgeSingular, none | wrap | ellipsis]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-wrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutText-wrap`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-wrap")(js.undefined)
        ret
    }
    @scala.inline
    def withVisibilityFunction1(value: EdgeSingular => none | visible): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibility")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withVisibility(value: PropertyValue[EdgeSingular, none | visible]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibility")(js.undefined)
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
    @scala.inline
    def `withZ-indexFunction1`(value: EdgeSingular => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("z-index")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withZ-index`(value: PropertyValue[EdgeSingular, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("z-index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutZ-index`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("z-index")(js.undefined)
        ret
    }
  }
  
}

