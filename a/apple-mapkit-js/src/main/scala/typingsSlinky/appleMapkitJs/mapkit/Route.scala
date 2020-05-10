package typingsSlinky.appleMapkitJs.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about a route, including step-by-step instructions, distance,
  * and estimated travel time.
  */
@js.native
trait Route extends js.Object {
  /**
    * The route distance in meters.
    */
  var distance: Double = js.native
  /**
    * The expected travel time in seconds.
    */
  var expectedTravelTime: Double = js.native
  /**
    * The name assigned to the route.
    */
  var name: String = js.native
  /**
    * An array of coordinate objects representing the path of the route.
    * @deprecated
    */
  var path: js.Array[Coordinate] = js.native
  /**
    * An instance of a polyline overlay that represents the path of a route.
    */
  var polyline: PolylineOverlay = js.native
  /**
    * An array of steps that comprise the overall route.
    */
  var steps: js.Array[RouteStep] = js.native
  /**
    * The overall route transport type.
    */
  var transportType: String = js.native
}

object Route {
  @scala.inline
  def apply(
    distance: Double,
    expectedTravelTime: Double,
    name: String,
    path: js.Array[Coordinate],
    polyline: PolylineOverlay,
    steps: js.Array[RouteStep],
    transportType: String
  ): Route = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], expectedTravelTime = expectedTravelTime.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], polyline = polyline.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any], transportType = transportType.asInstanceOf[js.Any])
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
    def withExpectedTravelTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expectedTravelTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: js.Array[Coordinate]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPolyline(value: PolylineOverlay): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polyline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSteps(value: js.Array[RouteStep]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("steps")(value.asInstanceOf[js.Any])
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

