package typingsSlinky.cytoscape.mod.Css

import typingsSlinky.cytoscape.cytoscapeStrings.`node-position`
import typingsSlinky.cytoscape.cytoscapeStrings.intersection
import typingsSlinky.cytoscape.mod.EdgeSingular
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * For automatic, bundled bezier edges (curve - style: bezier):
  *
  * http://js.cytoscape.org/#style/bezier-edges
  */
@js.native
trait BezierEdges extends js.Object {
  /**
    * A single value that overrides "control-point-step-size" with a manual value.
    * Because it overrides the step size, bezier edges with the same value will overlap.
    * Thus, it’s best to use this as a one- off value for particular edges if need be.
    */
  var `control-point-distance`: PropertyValueEdge[Double] = js.native
  /**
    * From the line perpendicular from source to target,
    * this value specifies the distance between successive bezier edges.
    */
  var `control-point-step-size`: PropertyValueEdge[Double] = js.native
  /**
    * A single value that weights control points along the line from source to target.
    * The value usually ranges on [0, 1], with
    * 0 towards the source node and
    * 1 towards the target node —
    * but larger or smaller values can also be used.
    */
  var `control-point-weight`: PropertyValueEdge[Double] = js.native
  /**
    * With value intersection (default),
    * the line from source to target for "control-point-weight" is
    * from the outside of the source node’s shape to the outside of
    * the target node’s shape.With value node- position,
    * the line is from the source position to the target position.
    * The "node-position" option makes calculating edge points easier
    * — but it should be used carefully because you can create invalid
    * points that intersection would have automatically corrected.
    */
  var `edge-distances`: PropertyValueEdge[intersection | `node-position`] = js.native
}

object BezierEdges {
  @scala.inline
  def apply(
    `control-point-distance`: PropertyValueEdge[Double],
    `control-point-step-size`: PropertyValueEdge[Double],
    `control-point-weight`: PropertyValueEdge[Double],
    `edge-distances`: PropertyValueEdge[intersection | `node-position`]
  ): BezierEdges = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("control-point-distance")(`control-point-distance`.asInstanceOf[js.Any])
    __obj.updateDynamic("control-point-step-size")(`control-point-step-size`.asInstanceOf[js.Any])
    __obj.updateDynamic("control-point-weight")(`control-point-weight`.asInstanceOf[js.Any])
    __obj.updateDynamic("edge-distances")(`edge-distances`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BezierEdges]
  }
  @scala.inline
  implicit class BezierEdgesOps[Self <: BezierEdges] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
  }
  
}

