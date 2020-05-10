package typingsSlinky.mapboxMapboxSdk.directionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectionsResponse extends js.Object {
  /**
    * String indicating the state of the response. This is a separate code than the HTTP status code.
    * On normal valid responses, the value will be Ok.
    */
  var code: String = js.native
  /**
    * Array of Route objects ordered by descending recommendation rank. May contain at most two routes.
    */
  var routes: js.Array[Route] = js.native
  var uuid: String = js.native
  /**
    * Array of Waypoint objects. Each waypoints is an input coordinate snapped to the road and path network.
    * The waypoints appear in the array in the order of the input coordinates.
    */
  var waypoints: js.Array[Waypoint] = js.native
}

object DirectionsResponse {
  @scala.inline
  def apply(code: String, routes: js.Array[Route], uuid: String, waypoints: js.Array[Waypoint]): DirectionsResponse = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any], waypoints = waypoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionsResponse]
  }
  @scala.inline
  implicit class DirectionsResponseOps[Self <: DirectionsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoutes(value: js.Array[Route]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUuid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uuid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWaypoints(value: js.Array[Waypoint]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waypoints")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

