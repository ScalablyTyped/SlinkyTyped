package typingsSlinky.cytoscape.mod.Css

import typingsSlinky.cytoscape.mod.EdgeSingular
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Edge arrow
  *  * <pos>-arrow-color : The colour of the edge’s source arrow.
  *  * <pos>-arrow-shape : The shape of the edge’s source arrow.
  *  * <pos>-arrow-fill : The fill state of the edge’s source arrow.
  *
  * For each edge arrow property above, replace <pos> with one of
  *  * source : Pointing towards the source node, at the end of the edge.
  *  * mid-source : Pointing towards the source node, at the middle of the edge.
  *  * target : Pointing towards the target node, at the end of the edge.
  *  * mid-target: Pointing towards the target node, at the middle of the edge.
  *
  * Only mid arrows are supported on haystack edges.
  * http://js.cytoscape.org/#style/edge-arrow
  */
@js.native
trait EdgeArrow extends js.Object {
  
  /** The size of the arrow. */
  var `arrow-scale`: js.UndefOr[PropertyValueEdge[Double]] = js.native
  
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
  
  /** The colour of the edge’s source arrow. */
  var `source-arrow-color`: js.UndefOr[PropertyValueEdge[Colour]] = js.native
  
  /** The fill state of the edge’s source arrow. */
  var `source-arrow-fill`: js.UndefOr[PropertyValueEdge[ArrowFill]] = js.native
  
  /** The shape of the edge’s source arrow. */
  var `source-arrow-shape`: js.UndefOr[PropertyValueEdge[ArrowShape]] = js.native
  
  /** The colour of the edge’s target arrow. */
  var `target-arrow-color`: js.UndefOr[PropertyValueEdge[Colour]] = js.native
  
  /** The fill state of the edge’s target arrow. */
  var `target-arrow-fill`: js.UndefOr[PropertyValueEdge[ArrowFill]] = js.native
  
  /** The shape of the edge’s target arrow. */
  var `target-arrow-shape`: js.UndefOr[PropertyValueEdge[ArrowShape]] = js.native
}
object EdgeArrow {
  
  @scala.inline
  def apply(): EdgeArrow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EdgeArrow]
  }
  
  @scala.inline
  implicit class EdgeArrowOps[Self <: EdgeArrow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def `setArrow-scaleFunction1`(value: EdgeSingular => Double): Self = this.set("arrow-scale", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setArrow-scale`(value: PropertyValueEdge[Double]): Self = this.set("arrow-scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteArrow-scale`: Self = this.set("arrow-scale", js.undefined)
    
    @scala.inline
    def `setMid-source-arrow-colorFunction1`(value: EdgeSingular => Colour): Self = this.set("mid-source-arrow-color", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setMid-source-arrow-color`(value: PropertyValueEdge[Colour]): Self = this.set("mid-source-arrow-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMid-source-arrow-color`: Self = this.set("mid-source-arrow-color", js.undefined)
    
    @scala.inline
    def `setMid-source-arrow-fillFunction1`(value: EdgeSingular => ArrowFill): Self = this.set("mid-source-arrow-fill", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setMid-source-arrow-fill`(value: PropertyValueEdge[ArrowFill]): Self = this.set("mid-source-arrow-fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMid-source-arrow-fill`: Self = this.set("mid-source-arrow-fill", js.undefined)
    
    @scala.inline
    def `setMid-source-arrow-shapeFunction1`(value: EdgeSingular => ArrowShape): Self = this.set("mid-source-arrow-shape", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setMid-source-arrow-shape`(value: PropertyValueEdge[ArrowShape]): Self = this.set("mid-source-arrow-shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMid-source-arrow-shape`: Self = this.set("mid-source-arrow-shape", js.undefined)
    
    @scala.inline
    def `setMid-target-arrow-colorFunction1`(value: EdgeSingular => Colour): Self = this.set("mid-target-arrow-color", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setMid-target-arrow-color`(value: PropertyValueEdge[Colour]): Self = this.set("mid-target-arrow-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMid-target-arrow-color`: Self = this.set("mid-target-arrow-color", js.undefined)
    
    @scala.inline
    def `setMid-target-arrow-fillFunction1`(value: EdgeSingular => ArrowFill): Self = this.set("mid-target-arrow-fill", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setMid-target-arrow-fill`(value: PropertyValueEdge[ArrowFill]): Self = this.set("mid-target-arrow-fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMid-target-arrow-fill`: Self = this.set("mid-target-arrow-fill", js.undefined)
    
    @scala.inline
    def `setMid-target-arrow-shapeFunction1`(value: EdgeSingular => ArrowShape): Self = this.set("mid-target-arrow-shape", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setMid-target-arrow-shape`(value: PropertyValueEdge[ArrowShape]): Self = this.set("mid-target-arrow-shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMid-target-arrow-shape`: Self = this.set("mid-target-arrow-shape", js.undefined)
    
    @scala.inline
    def `setSource-arrow-colorFunction1`(value: EdgeSingular => Colour): Self = this.set("source-arrow-color", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setSource-arrow-color`(value: PropertyValueEdge[Colour]): Self = this.set("source-arrow-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteSource-arrow-color`: Self = this.set("source-arrow-color", js.undefined)
    
    @scala.inline
    def `setSource-arrow-fillFunction1`(value: EdgeSingular => ArrowFill): Self = this.set("source-arrow-fill", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setSource-arrow-fill`(value: PropertyValueEdge[ArrowFill]): Self = this.set("source-arrow-fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteSource-arrow-fill`: Self = this.set("source-arrow-fill", js.undefined)
    
    @scala.inline
    def `setSource-arrow-shapeFunction1`(value: EdgeSingular => ArrowShape): Self = this.set("source-arrow-shape", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setSource-arrow-shape`(value: PropertyValueEdge[ArrowShape]): Self = this.set("source-arrow-shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteSource-arrow-shape`: Self = this.set("source-arrow-shape", js.undefined)
    
    @scala.inline
    def `setTarget-arrow-colorFunction1`(value: EdgeSingular => Colour): Self = this.set("target-arrow-color", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setTarget-arrow-color`(value: PropertyValueEdge[Colour]): Self = this.set("target-arrow-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteTarget-arrow-color`: Self = this.set("target-arrow-color", js.undefined)
    
    @scala.inline
    def `setTarget-arrow-fillFunction1`(value: EdgeSingular => ArrowFill): Self = this.set("target-arrow-fill", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setTarget-arrow-fill`(value: PropertyValueEdge[ArrowFill]): Self = this.set("target-arrow-fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteTarget-arrow-fill`: Self = this.set("target-arrow-fill", js.undefined)
    
    @scala.inline
    def `setTarget-arrow-shapeFunction1`(value: EdgeSingular => ArrowShape): Self = this.set("target-arrow-shape", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setTarget-arrow-shape`(value: PropertyValueEdge[ArrowShape]): Self = this.set("target-arrow-shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteTarget-arrow-shape`: Self = this.set("target-arrow-shape", js.undefined)
  }
}
