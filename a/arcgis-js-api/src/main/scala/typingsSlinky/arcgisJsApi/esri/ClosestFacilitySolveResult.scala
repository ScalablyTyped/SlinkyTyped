package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClosestFacilitySolveResult
  extends Accessor
     with JSONSupport {
  
  /**
    * An array of directions. A direction is an instance of [DirectionsFeatureSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DirectionsFeatureSet.html). Route directions are returned if `returnDirections = true` (default is false).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilitySolveResult.html#directions)
    */
  var directions: DirectionsFeatureSet = js.native
  
  /**
    * An array of points representing facilities. Only returned when `ClosestFacilityParameters.returnFacilities = true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilitySolveResult.html#facilities)
    */
  var facilities: js.Array[Point] = js.native
  
  /**
    * An array of points representing incidents. Only returned when `ClosestFacilityParameters.returnIncidents = true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilitySolveResult.html#incidents)
    */
  var incidents: js.Array[Point] = js.native
  
  /**
    * Message received when the solve is complete. If a closest facility cannot be solved, the message returned by the server identifies the incident that could not be solved.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilitySolveResult.html#messages)
    */
  var messages: js.Array[NAMessage] = js.native
  
  /**
    * The point barriers are an array of points. They are returned only if `ClosestFacilityParameters.returnPointBarriers` was set to `true` (which is not the default). If you send in the point barriers as a FeatureSet (instead of using DataLayer), you already have the barriers and might not need to request them back from the server.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilitySolveResult.html#pointBarriers)
    */
  var pointBarriers: js.Array[Point] = js.native
  
  /**
    * The polygon barriers are an array of polygons. They are returned only if `ClosestFacilityParameters.returnPolygonBarriers` was set to `true` (which is not the default). If you send in the polygon barriers as a FeatureSet (instead of using DataLayer), you already have the barriers and might not need to request them back from the server.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilitySolveResult.html#polygonBarriers)
    */
  var polygonBarriers: js.Array[Polygon] = js.native
  
  /**
    * The polyline barriers are an array of polylines. They are returned only if `ClosestFacilityParameters.returnPolylineBarriers` was set to `true` (which is not the default). If you send in the polyline barriers as a FeatureSet (instead of using DataLayer), you already have the barriers and might not need to request them back from the server.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilitySolveResult.html#polylineBarriers)
    */
  var polylineBarriers: js.Array[Polyline] = js.native
  
  /**
    * The array of graphics representing routes.  Route graphics are returned if `returnRoutes` is `true` and `outputLines` does not equal `none`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilitySolveResult.html#routes)
    */
  var routes: js.Array[Graphic] = js.native
}
