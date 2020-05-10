package typingsSlinky.mapboxMapboxSdk.directionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Waypoint extends js.Object {
  /**
    * Used to filter the road segment the waypoint will be placed on by direction and dictates the angle of approach.
    * This option should always be used in conjunction with the  radiuses parameter. The parameter takes two values per waypoint.
    * The first value is an angle clockwise from true north between 0 and 360, and the second is the range of degrees the angle can deviate by.
    * The recommended value for the range is 45° or 90°, as bearing measurements tend to be inaccurate.
    * This is useful for making sure the new routes of rerouted vehicles continue traveling in their current direction.
    * A request that does this would provide bearing and radius values for the first waypoint and leave the remaining values empty.
    * If provided, the list of bearings must be the same length as the list of waypoints.
    * However, you can skip a coordinate and show its position in the list with the  ; separator.
    */
  var bearing: js.UndefOr[js.Array[Double]] = js.native
  /**
    * Array of [ longitude, latitude ] for the snapped coordinate.
    */
  var location: js.Array[Double] = js.native
  /**
    * String with the name of the way the coordinate snapped to.
    */
  var name: String = js.native
  /**
    * Custom names for waypoints used for the arrival instruction in banners and voice instructions, each separated by  ; .
    * Values can be any string and total number of all characters cannot exceed 500. If provided, the list of waypoint_names must be the same
    * length as the list of waypoints, but you can skip a coordinate and show its position with the  ; separator.
    */
  var waypointName: js.UndefOr[String] = js.native
}

object Waypoint {
  @scala.inline
  def apply(location: js.Array[Double], name: String): Waypoint = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Waypoint]
  }
  @scala.inline
  implicit class WaypointOps[Self <: Waypoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocation(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
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
    def withWaypointName(value: String): Self = {
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

