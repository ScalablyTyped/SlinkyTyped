package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`allow-backtrack`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`at-dead-ends-and-intersections`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`at-dead-ends-only`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`complete-no-events`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`decimal-degrees`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`from-facility`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`instructions-only`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`nautical-miles`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`no-backtrack`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`summary-only`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`to-facility`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`true-shape-with-measure`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`true-shape`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.centimeters
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.complete
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.decimeters
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.end
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.feet_
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.inches
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.kilometers_
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.meters_
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.miles_
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.millimeters
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.none
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.points
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.standard
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.start
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.straight
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.yards
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClosestFacilityParameters
  extends Accessor
     with JSONSupport {
  
  /**
    * The list of network attribute names to be accumulated with the analysis, i.e., which attributes should be returned as part of the response.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#accumulateAttributes)
    */
  var accumulateAttributes: js.Array[String] = js.native
  
  /**
    * An array of attribute parameter values that determine which network elements can be used by a vehicle.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#attributeParameterValues)
    */
  var attributeParameterValues: js.Array[ClosestFacilityParametersAttributeParameterValues] = js.native
  
  /**
    * The cutoff value used to determine when to stop traversing.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#defaultCutoff)
    */
  var defaultCutoff: Double = js.native
  
  /**
    * The number of facilities to find.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#defaultTargetFacilityCount)
    */
  var defaultTargetFacilityCount: Double = js.native
  
  /**
    * The language used when generating driving directions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#directionsLanguage)
    */
  var directionsLanguage: String = js.native
  
  /**
    * The length units used when computing driving directions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#directionsLengthUnits)
    */
  var directionsLengthUnits: centimeters | `decimal-degrees` | decimeters | feet_ | inches | kilometers_ | meters_ | miles_ | millimeters | `nautical-miles` | points | yards = js.native
  
  /**
    * Defines the amount of direction information returned.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#directionsOutputType)
    */
  var directionsOutputType: complete | `complete-no-events` | `instructions-only` | standard | `summary-only` = js.native
  
  /**
    * The style to be used when returning directions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#directionsStyleName)
    */
  var directionsStyleName: String = js.native
  
  /**
    * The name of the attribute field that contains the drive time values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#directionsTimeAttribute)
    */
  var directionsTimeAttribute: String = js.native
  
  /**
    * When `true`, restricted network elements should be considered when finding network locations.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#doNotLocateOnRestrictedElements)
    */
  var doNotLocateOnRestrictedElements: Boolean = js.native
  
  /**
    * The set of facilities loaded as network locations during analysis.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#facilities)
    */
  var facilities: DataLayer | FeatureSet = js.native
  
  /**
    * The network attribute name used as the impedance attribute in analysis.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#impedanceAttribute)
    */
  var impedanceAttribute: String = js.native
  
  /**
    * The set of incidents loaded as network locations during analysis.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#incidents)
    */
  var incidents: DataLayer | FeatureSet = js.native
  
  /**
    * The well-known id of the spatial reference or the spatial reference object for the geometries returned with the analysis results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#outSpatialReference)
    */
  var outSpatialReference: SpatialReference | String = js.native
  
  /**
    * The output geometry precision.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#outputGeometryPrecision)
    */
  var outputGeometryPrecision: Double = js.native
  
  /**
    * The units of the output geometry precision.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#outputGeometryPrecisionUnits)
    */
  var outputGeometryPrecisionUnits: centimeters | `decimal-degrees` | decimeters | feet_ | inches | kilometers_ | meters_ | miles_ | millimeters | `nautical-miles` | points | yards = js.native
  
  /**
    * The type of output lines to be generated in the result.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#outputLines)
    */
  var outputLines: none | straight | `true-shape` | `true-shape-with-measure` = js.native
  
  /**
    * The set of point barriers loaded as network locations during analysis.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#pointBarriers)
    */
  var pointBarriers: DataLayer | FeatureSet = js.native
  
  /**
    * The set of polygon barriers loaded as network locations during analysis.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#polygonBarriers)
    */
  var polygonBarriers: DataLayer | FeatureSet = js.native
  
  /**
    * The set of polyline barriers loaded as network locations during analysis.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#polylineBarriers)
    */
  var polylineBarriers: DataLayer | FeatureSet = js.native
  
  /**
    * Specifies how U-Turns should be handled.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#restrictUTurns)
    */
  var restrictUTurns: `allow-backtrack` | `at-dead-ends-only` | `no-backtrack` | `at-dead-ends-and-intersections` = js.native
  
  /**
    * The list of network attribute names to be used as restrictions with the analysis.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#restrictionAttributes)
    */
  var restrictionAttributes: js.Array[String] = js.native
  
  /**
    * Indicates whether the service should generate driving directions for each route.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#returnDirections)
    */
  var returnDirections: Boolean = js.native
  
  /**
    * If `true`, facilities will be returned with the analysis results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#returnFacilities)
    */
  var returnFacilities: Boolean = js.native
  
  /**
    * If `true`, incidents will be returned with the analysis results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#returnIncidents)
    */
  var returnIncidents: Boolean = js.native
  
  /**
    * If `true`, point barriers will be returned in the barriers property of the [ClosestFacilitySolveResult](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilitySolveResult.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#returnPointBarriers)
    */
  var returnPointBarriers: Boolean = js.native
  
  /**
    * If `true`, polygon barriers will be returned in the barriers property of the [ClosestFacilitySolveResult](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilitySolveResult.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#returnPolygonBarriers)
    */
  var returnPolygonBarriers: Boolean = js.native
  
  /**
    * If `true`, polyline barriers will be returned in the barriers property of the [ClosestFacilitySolveResult](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilitySolveResult.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#returnPolylineBarriers)
    */
  var returnPolylineBarriers: Boolean = js.native
  
  /**
    * When `true`, closest facility routes will be generated and returned in the route property of each [ClosestFacilitySolveResult](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilitySolveResult.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#returnRoutes)
    */
  var returnRoutes: Boolean = js.native
  
  /**
    * The arrival or departure date and time.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#timeOfDay)
    */
  var timeOfDay: js.Date = js.native
  
  /**
    * Defines the way the `timeOfDay` value is used.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#timeOfDayUsage)
    */
  var timeOfDayUsage: start | end = js.native
  
  /**
    * Options for traveling to or from the facility.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#travelDirection)
    */
  var travelDirection: `from-facility` | `to-facility` = js.native
  
  /**
    * A travel mode represents a means of transportation, such as driving or walking.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#travelMode)
    */
  var travelMode: String = js.native
  
  /**
    * If `true`, the hierarchy attribute for the network will be used in analysis.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#useHierarchy)
    */
  var useHierarchy: Boolean = js.native
}
