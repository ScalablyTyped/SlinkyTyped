package typingsSlinky.appleMapkitJs.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single route between a requested start and end point.
  */
@js.native
trait RouteStep extends js.Object {
  /**
    * The step distance in meters.
    */
  var distance: Double = js.native
  /**
    * The written instructions for following the path represented by the step.
    */
  var instructions: String = js.native
  /**
    * An array of coordinate objects representing the path of the route segment.
    */
  var path: js.Array[Coordinate] = js.native
  /**
    * The transport type of the step.
    */
  var transportType: String = js.native
}

object RouteStep {
  @scala.inline
  def apply(distance: Double, instructions: String, path: js.Array[Coordinate], transportType: String): RouteStep = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], instructions = instructions.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], transportType = transportType.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteStep]
  }
  @scala.inline
  implicit class RouteStepOps[Self <: RouteStep] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstructions(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instructions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: js.Array[Coordinate]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransportType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transportType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

