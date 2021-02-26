package typingsSlinky.mapboxMapboxSdk.directionsMod

import typingsSlinky.mapboxGl.mod.LngLatLike
import typingsSlinky.mapboxMapboxSdk.mapboxMapboxSdkStrings.unlimited
import typingsSlinky.mapboxMapboxSdk.mapiRequestMod.DirectionsApproach
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectionsRequestWaypoint extends StObject {
  
  /**
    * Used to indicate how requested routes consider from which side of the road to approach a waypoint.
    * Accepts unrestricted (default) or  curb . If set to  unrestricted , the routes can approach waypoints from either side of the road.
    * If set to  curb , the route will be returned so that on arrival, the waypoint will be found on the side that corresponds with the
    * driving_side of the region in which the returned route is located. Note that the  approaches parameter influences how you arrive at a waypoint,
    * while  bearings influences how you start from a waypoint. If provided, the list of approaches must be the same length as the list of waypoints.
    * However, you can skip a coordinate and show its position in the list with the  ; separator.
    */
  var approach: js.UndefOr[DirectionsApproach] = js.native
  
  /**
    * Semicolon-separated list of  {longitude},{latitude} coordinate pairs to visit in order. There can be between 2 and 25 coordinates.
    */
  var coordinates: js.Array[Double] | LngLatLike = js.native
  
  /**
    * Maximum distance in meters that each coordinate is allowed to move when snapped to a nearby road segment.
    * There must be as many radiuses as there are coordinates in the request, each separated by ';'.
    * Values can be any number greater than 0 or the string 'unlimited'.
    * A  NoSegment error is returned if no routable road is found within the radius.
    */
  var radius: js.UndefOr[String | unlimited] = js.native
}
object DirectionsRequestWaypoint {
  
  @scala.inline
  def apply(coordinates: js.Array[Double] | LngLatLike): DirectionsRequestWaypoint = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionsRequestWaypoint]
  }
  
  @scala.inline
  implicit class DirectionsRequestWaypointMutableBuilder[Self <: DirectionsRequestWaypoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApproach(value: DirectionsApproach): Self = StObject.set(x, "approach", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApproachUndefined: Self = StObject.set(x, "approach", js.undefined)
    
    @scala.inline
    def setCoordinates(value: js.Array[Double] | LngLatLike): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoordinatesVarargs(value: Double*): Self = StObject.set(x, "coordinates", js.Array(value :_*))
    
    @scala.inline
    def setRadius(value: String | unlimited): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
  }
}
