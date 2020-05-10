package typingsSlinky.mapboxMapboxSdk.optimizationMod

import typingsSlinky.mapboxMapboxSdk.mapboxMapboxSdkStrings.unlimited
import typingsSlinky.mapboxMapboxSdk.mapiRequestMod.DirectionsApproach
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptimizationWaypoint extends js.Object {
  /**
    * Used to indicate how requested routes consider from which side of the road to approach the waypoint.
    */
  var approach: js.UndefOr[DirectionsApproach] = js.native
  /**
    * Used to filter the road segment the waypoint will be placed on by direction and dictates the angle of approach.
    * This option should always be used in conjunction with a `radius`. The first value is an angle clockwise from true north between 0 and 360,
    * and the second is the range of degrees the angle can deviate by.
    */
  var bearing: js.UndefOr[js.Array[Double]] = js.native
  var coordinates: Double = js.native
  /**
    * Maximum distance in meters that the coordinate is allowed to move when snapped to a nearby road segment.
    */
  var radius: js.UndefOr[Double | unlimited] = js.native
}

object OptimizationWaypoint {
  @scala.inline
  def apply(coordinates: Double): OptimizationWaypoint = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptimizationWaypoint]
  }
  @scala.inline
  implicit class OptimizationWaypointOps[Self <: OptimizationWaypoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCoordinates(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coordinates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApproach(value: DirectionsApproach): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approach")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApproach: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approach")(js.undefined)
        ret
    }
    @scala.inline
    def withBearing(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bearing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBearing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bearing")(js.undefined)
        ret
    }
    @scala.inline
    def withRadius(value: Double | unlimited): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radius")(js.undefined)
        ret
    }
  }
  
}

