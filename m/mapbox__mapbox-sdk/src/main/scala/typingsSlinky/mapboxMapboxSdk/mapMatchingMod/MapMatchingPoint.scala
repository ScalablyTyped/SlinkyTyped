package typingsSlinky.mapboxMapboxSdk.mapMatchingMod

import typingsSlinky.mapboxGl.mod.LngLatLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapMatchingPoint extends Point {
  /**
    * Whether this coordinate is waypoint or not. The first and last coordinates will always be waypoints.
    */
  var isWaypoint: js.UndefOr[Boolean] = js.native
  /**
    * A number in meters indicating the assumed precision of the used tracking device.
    */
  var radius: js.UndefOr[Double] = js.native
  /**
    * Datetime corresponding to the coordinate.
    */
  var timestamp: js.UndefOr[String | Double | js.Date] = js.native
  /**
    * Custom name for the waypoint used for the arrival instruction in banners and voice instructions.
    * Will be ignored unless isWaypoint is true.
    */
  var waypointName: js.UndefOr[Boolean] = js.native
}

object MapMatchingPoint {
  @scala.inline
  def apply(coordinates: LngLatLike): MapMatchingPoint = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapMatchingPoint]
  }
  @scala.inline
  implicit class MapMatchingPointOps[Self <: MapMatchingPoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsWaypoint(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isWaypoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsWaypoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isWaypoint")(js.undefined)
        ret
    }
    @scala.inline
    def withRadius(value: Double): Self = {
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
    @scala.inline
    def withTimestampDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimestamp(value: String | Double | js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withWaypointName(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waypointName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaypointName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waypointName")(js.undefined)
        ret
    }
  }
  
}

