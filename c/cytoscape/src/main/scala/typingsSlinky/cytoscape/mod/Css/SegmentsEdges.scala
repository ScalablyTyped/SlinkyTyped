package typingsSlinky.cytoscape.mod.Css

import typingsSlinky.cytoscape.cytoscapeStrings.`node-position`
import typingsSlinky.cytoscape.cytoscapeStrings.intersection
import typingsSlinky.cytoscape.mod.EdgeSingular
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Segments edges
  * For edges made of several straight lines (curve - style: segments):
  * http://js.cytoscape.org/#style/segments-edges
  */
@js.native
trait SegmentsEdges extends js.Object {
  /**
    * With value
    *  * "intersection" (default), the line from source to target
    *  * for "segment-weights" is from the outside of the source node’s shape to the outside of the target node’s shape.
    *  * With value "node-position", the line is from the source position to the target position.
    * The "node-position" option makes calculating edge points easier
    * — but it should be used carefully because you can create
    * invalid points that intersection would have automatically corrected.
    */
  var `edge-distances`: PropertyValueEdge[intersection | `node-position`] = js.native
  /**
    * A series of values that specify for each segment point the distance perpendicular to a line formed from source to target, e.g. -20 20 - 20.
    */
  var `segment-distances`: PropertyValueEdge[String] = js.native
  /**
    * A series of values that weights segment points along a line from source to target,
    * e.g. 0.25 0.5 0.75.A value usually ranges on [0, 1],
    * with 0 towards the source node and 1 towards the target node — but larger or smaller values can also be used.
    */
  var `segment-weights`: PropertyValueEdge[String] = js.native
}

object SegmentsEdges {
  @scala.inline
  def apply(
    `edge-distances`: PropertyValueEdge[intersection | `node-position`],
    `segment-distances`: PropertyValueEdge[String],
    `segment-weights`: PropertyValueEdge[String]
  ): SegmentsEdges = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("edge-distances")(`edge-distances`.asInstanceOf[js.Any])
    __obj.updateDynamic("segment-distances")(`segment-distances`.asInstanceOf[js.Any])
    __obj.updateDynamic("segment-weights")(`segment-weights`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SegmentsEdges]
  }
  @scala.inline
  implicit class SegmentsEdgesOps[Self <: SegmentsEdges] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
  }
  
}

