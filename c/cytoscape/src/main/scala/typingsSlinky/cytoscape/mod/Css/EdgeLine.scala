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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * These properties affect the styling of an edge’s line:
  *
  * http://js.cytoscape.org/#style/edge-line
  */
@js.native
trait EdgeLine extends StObject {
  
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
    * The distance the edge ends from its source.
    */
  var `source-distance-from-node`: js.UndefOr[PropertyValueEdge[Double]] = js.native
  
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
  implicit class EdgeLineMutableBuilder[Self <: EdgeLine] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setCurve-style`(value: PropertyValueEdge[haystack | straight | bezier | `unbundled-bezier` | segments | taxi]): Self = StObject.set(x, "curve-style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setCurve-styleFunction1`(value: EdgeSingular => haystack | straight | bezier | `unbundled-bezier` | segments | taxi): Self = StObject.set(x, "curve-style", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setCurve-styleUndefined`: Self = StObject.set(x, "curve-style", js.undefined)
    
    @scala.inline
    def `setLine-cap`(value: PropertyValueEdge[butt | round | square]): Self = StObject.set(x, "line-cap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setLine-capFunction1`(value: EdgeSingular => butt | round | square): Self = StObject.set(x, "line-cap", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setLine-capUndefined`: Self = StObject.set(x, "line-cap", js.undefined)
    
    @scala.inline
    def `setLine-color`(value: PropertyValueEdge[Colour]): Self = StObject.set(x, "line-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setLine-colorFunction1`(value: EdgeSingular => Colour): Self = StObject.set(x, "line-color", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setLine-colorUndefined`: Self = StObject.set(x, "line-color", js.undefined)
    
    @scala.inline
    def `setLine-dash-offset`(value: PropertyValueEdge[Double]): Self = StObject.set(x, "line-dash-offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setLine-dash-offsetFunction1`(value: EdgeSingular => Double): Self = StObject.set(x, "line-dash-offset", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setLine-dash-offsetUndefined`: Self = StObject.set(x, "line-dash-offset", js.undefined)
    
    @scala.inline
    def `setLine-dash-pattern`(value: js.Array[PropertyValueEdge[Double]]): Self = StObject.set(x, "line-dash-pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setLine-dash-patternUndefined`: Self = StObject.set(x, "line-dash-pattern", js.undefined)
    
    @scala.inline
    def `setLine-dash-patternVarargs`(value: PropertyValueEdge[Double]*): Self = StObject.set(x, "line-dash-pattern", js.Array(value :_*))
    
    @scala.inline
    def `setLine-fill`(value: PropertyValueEdge[solid | `linear-gradient` | `radial-gradient`]): Self = StObject.set(x, "line-fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setLine-fillFunction1`(value: EdgeSingular => solid | `linear-gradient` | `radial-gradient`): Self = StObject.set(x, "line-fill", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setLine-fillUndefined`: Self = StObject.set(x, "line-fill", js.undefined)
    
    @scala.inline
    def `setLine-style`(value: PropertyValueEdge[LineStyle]): Self = StObject.set(x, "line-style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setLine-styleFunction1`(value: EdgeSingular => LineStyle): Self = StObject.set(x, "line-style", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setLine-styleUndefined`: Self = StObject.set(x, "line-style", js.undefined)
    
    @scala.inline
    def `setSource-distance-from-node`(value: PropertyValueEdge[Double]): Self = StObject.set(x, "source-distance-from-node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setSource-distance-from-nodeFunction1`(value: EdgeSingular => Double): Self = StObject.set(x, "source-distance-from-node", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setSource-distance-from-nodeUndefined`: Self = StObject.set(x, "source-distance-from-node", js.undefined)
    
    @scala.inline
    def `setTarget-distance-from-node`(value: PropertyValueEdge[Double]): Self = StObject.set(x, "target-distance-from-node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setTarget-distance-from-nodeFunction1`(value: EdgeSingular => Double): Self = StObject.set(x, "target-distance-from-node", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setTarget-distance-from-nodeUndefined`: Self = StObject.set(x, "target-distance-from-node", js.undefined)
    
    @scala.inline
    def setWidth(value: PropertyValueEdge[Double | String]): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthFunction1(value: EdgeSingular => Double | String): Self = StObject.set(x, "width", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
