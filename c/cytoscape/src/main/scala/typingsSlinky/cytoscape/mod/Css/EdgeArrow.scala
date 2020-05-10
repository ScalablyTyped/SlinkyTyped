package typingsSlinky.cytoscape.mod.Css

import typingsSlinky.cytoscape.mod.EdgeSingular
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  }
  
}

