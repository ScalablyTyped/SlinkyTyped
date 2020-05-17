package typingsSlinky.box2d.Box2D.Collision

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Features extends js.Object {
  /**
  		* A value of 1 indicates that the reference edge is on shape2.
  		**/
  var flip: Double = js.native
  /**
  		* The edge most anti-parallel to the reference edge.
  		**/
  var incidentEdge: Double = js.native
  /**
  		* The vertex (0 or 1) on the incident edge that was clipped.
  		**/
  var incidentVertex: Double = js.native
  /**
  		* The edge that defines the outward contact normal.
  		**/
  var referenceEdge: Double = js.native
}

object Features {
  @scala.inline
  def apply(flip: Double, incidentEdge: Double, incidentVertex: Double, referenceEdge: Double): Features = {
    val __obj = js.Dynamic.literal(flip = flip.asInstanceOf[js.Any], incidentEdge = incidentEdge.asInstanceOf[js.Any], incidentVertex = incidentVertex.asInstanceOf[js.Any], referenceEdge = referenceEdge.asInstanceOf[js.Any])
    __obj.asInstanceOf[Features]
  }
  @scala.inline
  implicit class FeaturesOps[Self <: Features] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFlip(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncidentEdge(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incidentEdge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncidentVertex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incidentVertex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReferenceEdge(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceEdge")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

