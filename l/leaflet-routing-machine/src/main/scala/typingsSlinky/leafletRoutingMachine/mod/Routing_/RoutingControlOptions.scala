package typingsSlinky.leafletRoutingMachine.mod.Routing_

import typingsSlinky.leaflet.mod.LatLng_
import typingsSlinky.leafletRoutingMachine.leafletRoutingMachineStrings.connect
import typingsSlinky.leafletRoutingMachine.leafletRoutingMachineStrings.smart
import typingsSlinky.leafletRoutingMachine.leafletRoutingMachineStrings.snap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RoutingControlOptions extends ItineraryOptions {
  
  var addWaypoints: js.UndefOr[Boolean] = js.native
  
  var altLineOptions: js.UndefOr[LineOptions] = js.native
  
  var autoRoute: js.UndefOr[Boolean] = js.native
  
  var defaultErrorHandler: js.UndefOr[js.Function1[/* error */ js.Any, Unit]] = js.native
  
  // IGeocorder is from other library;
  var fitSelectedRoutes: js.UndefOr[smart | Boolean] = js.native
  
  var geocoder: js.UndefOr[js.Any] = js.native
  
  var lineOptions: js.UndefOr[LineOptions] = js.native
  
  var plan: js.UndefOr[Plan_] = js.native
  
  var routeDragInterval: js.UndefOr[Double] = js.native
  
  var routeLine: js.UndefOr[js.Function2[/* route */ IRoute, /* options */ LineOptions, Line_]] = js.native
  
  var routeWhileDragging: js.UndefOr[Boolean] = js.native
  
  var router: js.UndefOr[IRouter] = js.native
  
  var showAlternatives: js.UndefOr[Boolean] = js.native
  
  var useZoomParameter: js.UndefOr[Boolean] = js.native
  
  var waypointMode: js.UndefOr[connect | snap] = js.native
  
  var waypoints: js.UndefOr[js.Array[LatLng_ | Waypoint_]] = js.native
}
object RoutingControlOptions {
  
  @scala.inline
  def apply(): RoutingControlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoutingControlOptions]
  }
  
  @scala.inline
  implicit class RoutingControlOptionsMutableBuilder[Self <: RoutingControlOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddWaypoints(value: Boolean): Self = StObject.set(x, "addWaypoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddWaypointsUndefined: Self = StObject.set(x, "addWaypoints", js.undefined)
    
    @scala.inline
    def setAltLineOptions(value: LineOptions): Self = StObject.set(x, "altLineOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltLineOptionsUndefined: Self = StObject.set(x, "altLineOptions", js.undefined)
    
    @scala.inline
    def setAutoRoute(value: Boolean): Self = StObject.set(x, "autoRoute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoRouteUndefined: Self = StObject.set(x, "autoRoute", js.undefined)
    
    @scala.inline
    def setDefaultErrorHandler(value: /* error */ js.Any => Unit): Self = StObject.set(x, "defaultErrorHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDefaultErrorHandlerUndefined: Self = StObject.set(x, "defaultErrorHandler", js.undefined)
    
    @scala.inline
    def setFitSelectedRoutes(value: smart | Boolean): Self = StObject.set(x, "fitSelectedRoutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFitSelectedRoutesUndefined: Self = StObject.set(x, "fitSelectedRoutes", js.undefined)
    
    @scala.inline
    def setGeocoder(value: js.Any): Self = StObject.set(x, "geocoder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeocoderUndefined: Self = StObject.set(x, "geocoder", js.undefined)
    
    @scala.inline
    def setLineOptions(value: LineOptions): Self = StObject.set(x, "lineOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineOptionsUndefined: Self = StObject.set(x, "lineOptions", js.undefined)
    
    @scala.inline
    def setPlan(value: Plan_): Self = StObject.set(x, "plan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlanUndefined: Self = StObject.set(x, "plan", js.undefined)
    
    @scala.inline
    def setRouteDragInterval(value: Double): Self = StObject.set(x, "routeDragInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouteDragIntervalUndefined: Self = StObject.set(x, "routeDragInterval", js.undefined)
    
    @scala.inline
    def setRouteLine(value: (/* route */ IRoute, /* options */ LineOptions) => Line_): Self = StObject.set(x, "routeLine", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRouteLineUndefined: Self = StObject.set(x, "routeLine", js.undefined)
    
    @scala.inline
    def setRouteWhileDragging(value: Boolean): Self = StObject.set(x, "routeWhileDragging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouteWhileDraggingUndefined: Self = StObject.set(x, "routeWhileDragging", js.undefined)
    
    @scala.inline
    def setRouter(value: IRouter): Self = StObject.set(x, "router", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouterUndefined: Self = StObject.set(x, "router", js.undefined)
    
    @scala.inline
    def setShowAlternatives(value: Boolean): Self = StObject.set(x, "showAlternatives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowAlternativesUndefined: Self = StObject.set(x, "showAlternatives", js.undefined)
    
    @scala.inline
    def setUseZoomParameter(value: Boolean): Self = StObject.set(x, "useZoomParameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseZoomParameterUndefined: Self = StObject.set(x, "useZoomParameter", js.undefined)
    
    @scala.inline
    def setWaypointMode(value: connect | snap): Self = StObject.set(x, "waypointMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaypointModeUndefined: Self = StObject.set(x, "waypointMode", js.undefined)
    
    @scala.inline
    def setWaypoints(value: js.Array[LatLng_ | Waypoint_]): Self = StObject.set(x, "waypoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaypointsUndefined: Self = StObject.set(x, "waypoints", js.undefined)
    
    @scala.inline
    def setWaypointsVarargs(value: (LatLng_ | Waypoint_)*): Self = StObject.set(x, "waypoints", js.Array(value :_*))
  }
}
