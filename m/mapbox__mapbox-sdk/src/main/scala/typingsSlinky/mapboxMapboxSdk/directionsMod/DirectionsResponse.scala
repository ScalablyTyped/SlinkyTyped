package typingsSlinky.mapboxMapboxSdk.directionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectionsResponse extends StObject {
  
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
  implicit class DirectionsResponseMutableBuilder[Self <: DirectionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutes(value: js.Array[Route]): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutesVarargs(value: Route*): Self = StObject.set(x, "routes", js.Array(value :_*))
    
    @scala.inline
    def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaypoints(value: js.Array[Waypoint]): Self = StObject.set(x, "waypoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaypointsVarargs(value: Waypoint*): Self = StObject.set(x, "waypoints", js.Array(value :_*))
  }
}
