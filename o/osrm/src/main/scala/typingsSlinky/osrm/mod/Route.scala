package typingsSlinky.osrm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a route through (potentially multiple) waypoints.
  *
  * https://github.com/Project-OSRM/osrm-backend/blob/master/docs/http.md#route-object
  */
@js.native
trait Route extends js.Object {
  /**
    * The distance traveled by the route, in float meters.
    */
  var distance: Double = js.native
  /**
    * The estimated travel time, in float number of seconds.
    */
  var duration: Double = js.native
  /**
    * The whole geometry of the route value depending on overview parameter, format depending on the geometries parameter. See RouteStep's geometry property for a parameter documentation.
    */
  var geometry: js.UndefOr[js.Any] = js.native
  /**
    * The legs between the given waypoints, an array of RouteLeg objects.
    */
  var legs: js.Array[RouteLeg] = js.native
  /**
    * The calculated weight of the route.
    */
  var weight: Double = js.native
  /**
    * The name of the weight profile used during extraction phase.
    */
  var weight_name: String = js.native
}

object Route {
  @scala.inline
  def apply(distance: Double, duration: Double, legs: js.Array[RouteLeg], weight: Double, weight_name: String): Route = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], legs = legs.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any], weight_name = weight_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Route]
  }
  @scala.inline
  implicit class RouteOps[Self <: Route] (val x: Self) extends AnyVal {
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
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLegs(value: js.Array[RouteLeg]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWeight_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weight_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGeometry(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeometry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometry")(js.undefined)
        ret
    }
  }
  
}

