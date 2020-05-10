package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`allow-backtrack`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`at-dead-ends-and-intersections`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`at-dead-ends-only`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`complete-no-events`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`decimal-degrees`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`instructions-only`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`nautical-miles`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`no-backtrack`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`summary-only`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`true-shape-with-measure`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`true-shape`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.centimeters
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.complete
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.decimeters
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.feet_
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.inches
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.kilometers_
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.meters_
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.miles_
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.millimeters
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.none
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.points
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.standard
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.straight
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.yards
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteParametersProperties extends js.Object {
  /**
    * The list of network attribute names to be accumulated with the analysis. For example, which attributes should be returned as part of the response. The default is as defined in the specific routing network layer used in your [RouteTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-RouteTask.html). You can specify any attribute names listed in the Service Directory under `Network Dataset -> Network Attributes` as `Usage Type: esriNAUTCost`. See also [Understanding the network attribute](http://resources.arcgis.com/en/help/main/10.2/index.html#//00470000000m000000).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#accumulateAttributes)
    */
  var accumulateAttributes: js.UndefOr[js.Array[String]] = js.native
  /**
    * Each element in the array is an object that describes the parameter values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#attributeParameterValues)
    */
  var attributeParameterValues: js.UndefOr[js.Array[AttributeParamValue]] = js.native
  /**
    * The set of point barriers loaded as network locations during analysis. At ArcGIS Server 10.1 an optional url property was added. Use this property to specify a REST query request to a Feature, Map or GP Service that returns a JSON feature set. The url property can be specified using [DataFile](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DataFile.html). Note that either the features or url property should be specified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#barriers)
    */
  var barriers: js.UndefOr[DataLayerProperties | FeatureSetProperties] = js.native
  /**
    * The language used when computing directions. The default is as defined in the specific routing network layer used in your [RouteTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-RouteTask.html). By default, NAServer gets installed with `en_US` only - it is up to the server administrator to add additional languages.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#directionsLanguage)
    */
  var directionsLanguage: js.UndefOr[String] = js.native
  /**
    * The length units to use when computing directions. The default is as defined in the specific routing network layer used in your [RouteTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-RouteTask.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#directionsLengthUnits)
    */
  var directionsLengthUnits: js.UndefOr[
    centimeters | `decimal-degrees` | decimeters | feet_ | inches | kilometers_ | meters_ | miles_ | millimeters | `nautical-miles` | points | yards
  ] = js.native
  /**
    * Defines the amount of direction information returned.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#directionsOutputType)
    */
  var directionsOutputType: js.UndefOr[
    complete | `complete-no-events` | `instructions-only` | standard | `summary-only`
  ] = js.native
  /**
    * The style to be used when returning directions. The default will be as defined in the network layer. View the REST layer description for your network service to see a list of supported styles.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#directionsStyleName)
    */
  var directionsStyleName: js.UndefOr[String] = js.native
  /**
    * The name of network attribute to use for the drive time when computing directions. The default is as defined in the specific routing network layer used in your [RouteTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-RouteTask.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#directionsTimeAttribute)
    */
  var directionsTimeAttribute: js.UndefOr[String] = js.native
  /**
    * If `true`, avoids network elements restricted by barriers or restrictions specified in [restrictionAttributes](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#restrictionAttributes).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#doNotLocateOnRestrictedElements)
    *
    * @default true
    */
  var doNotLocateOnRestrictedElements: js.UndefOr[Boolean] = js.native
  /**
    * The [RouteTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-RouteTask.html) can help you find the most efficient path for visiting a given list of stops. This is sometimes known as the "traveling salesperson" problem. When the `findBestSequence = true`, the route solver is solving the Traveling Salesperson problem by computing the optimal sequence to visit the stops. As this is a combinatorial problem, we employ heuristics to solve this in a reasonable time. The heuristics do not guarantee the optimal sequence (as there is no good/fast way to prove optimality for large number of stops). It returns a solution that is close to optimal if not the optimal. The heuristic performs favorably when tested with known TSP benchmarks available in the OR research community. For these stops to be visited in the most efficient way, specify the following parameters:
    * ```js
    * routeParams.findBestSequence = true;
    * routeParams.preserveFirstStop = false;
    * routeParams.preserveLastStop = false;
    * routeParams.returnStops = true;
    * ```
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#findBestSequence)
    */
  var findBestSequence: js.UndefOr[Boolean] = js.native
  /**
    * In routes where a stop is not located on a network or a stop could not be reached, the results will differ depending on the value of this property:
    *   * When `false`, the solve operation will fail if at least one of the stops specified cannot be located or reached.
    *   * When `true`, as long as there are at least two valid stops that have been connected by a route, a valid result is returned. If multiple routes are processed in a single request, as long as least one route is built, a valid result is returned.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#ignoreInvalidLocations)
    */
  var ignoreInvalidLocations: js.UndefOr[Boolean] = js.native
  /**
    * The network attribute name to be used as the impedance attribute in the analysis. The default is as defined in the specific routing network layer used in your [RouteTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-RouteTask.html). You can specify any attribute names listed in the Service Directory under `Network Dataset -> Network Attributes` as `Usage Type: esriNAUTCost`. You can also specify a value of `none` to indicate that no network attributes should be used for impedance. If you specify an empty array, it will default to the default of the service.  For example, set `impedanceAttribute = "Time"` for the quickest route and `impedanceAttribute = "Length"` for shortest drive, assuming the service has those two esriNAUTCost attributes.  For more information, see [Understanding the network attribute](http://desktop.arcgis.com/en/arcmap/latest/extensions/network-analyst/understanding-network-attributes.htm).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#impedanceAttribute)
    */
  var impedanceAttribute: js.UndefOr[String] = js.native
  /**
    * The well-known ID of the spatial reference for the geometries returned with the analysis results. If not specified, the geometries are returned in the spatial reference of the map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#outSpatialReference)
    */
  var outSpatialReference: js.UndefOr[SpatialReferenceProperties | String] = js.native
  /**
    * The precision of the output geometry after generalization. If `0`, no generalization of output geometry is performed. If present and positive, it represents the `MaximumAllowableOffset` parameter and generalization is performed according to `IPolycurve.Generalize`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#outputGeometryPrecision)
    */
  var outputGeometryPrecision: js.UndefOr[Double] = js.native
  /**
    * The units of the output geometry precision.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#outputGeometryPrecisionUnits)
    */
  var outputGeometryPrecisionUnits: js.UndefOr[
    centimeters | `decimal-degrees` | decimeters | feet_ | inches | kilometers_ | meters_ | miles_ | millimeters | `nautical-miles` | points | yards
  ] = js.native
  /**
    * The type of output lines to be generated in the result. The default is as defined in the specific routing network layer used in your [RouteTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-RouteTask.html).
    *
    * Possible Value | Description
    * ---------------|------------
    * none | No lines are returned
    * straight | Only returns straight lines
    * true-shape | Return the true shape of the lines
    * true-shape-with-measure | Return the true shape of the lines with their measurements
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#outputLines)
    */
  var outputLines: js.UndefOr[none | straight | `true-shape` | `true-shape-with-measure`] = js.native
  /**
    * The set of point barriers loaded as network locations during analysis. At ArcGIS Server 10.1 an optional url property was added. Use this property to specify a REST query request to a Feature, Map or GP Service that returns a JSON feature set. The url property can be specified using [DataFile](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DataFile.html). Note that either the features or url property should be specified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#pointBarriers)
    */
  var pointBarriers: js.UndefOr[DataLayerProperties | FeatureSetProperties] = js.native
  /**
    * The set of polygon barriers loaded as network locations during analysis. At ArcGIS Server 10.1, an optional `url` property was added. Use this property to specify a REST query request to a Feature, Map or GP Service that returns a JSON feature set. The url property can be specified using [DataFile](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DataFile.html). Note that either the `features` or `url` property should be specified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#polygonBarriers)
    */
  var polygonBarriers: js.UndefOr[DataLayerProperties | FeatureSetProperties] = js.native
  /**
    * The set of polyline barriers loaded as network locations during analysis. At ArcGIS Server 10.1, an optional `url` property was added. Use this property to specify a REST query request to a Feature, Map or GP Service that returns a JSON feature set. The url property can be specified using [DataFile](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DataFile.html). Note that either the `features` or `url` property should be specified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#polylineBarriers)
    */
  var polylineBarriers: js.UndefOr[DataLayerProperties | FeatureSetProperties] = js.native
  /**
    * If `true`, keeps the first stop fixed in the sequence even when `findBestSequence = true`. Only applicable if `findBestSequence = true`. The default is as defined in the specific routing network layer used in your [RouteTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-RouteTask.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#preserveFirstStop)
    */
  var preserveFirstStop: js.UndefOr[Boolean] = js.native
  /**
    * If `true`, keeps the last stop fixed in the sequence even when `findBestSequence = true`. Only applicable if `findBestSequence = true`. The default is as defined in the specific routing network layer used in your [RouteTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-RouteTask.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#preserveLastStop)
    */
  var preserveLastStop: js.UndefOr[Boolean] = js.native
  /**
    * Specifies how U-Turns should be handled. The default is as defined in the specific routing network layer used in your [RouteTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-RouteTask.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#restrictUTurns)
    */
  var restrictUTurns: js.UndefOr[
    `allow-backtrack` | `at-dead-ends-only` | `no-backtrack` | `at-dead-ends-and-intersections`
  ] = js.native
  /**
    * The list of network attribute names to be used as restrictions with the analysis. The default is as defined in the specific routing network layer used in your [RouteTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-RouteTask.html). Possible values are listed in the Service Directory under `Network Dataset -> Network Attributes`. You can also specify a value of `none` to indicate that no network attributes should be used as restrictions. If you specify an empty array, it will default to the default of the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#restrictionAttributes)
    */
  var restrictionAttributes: js.UndefOr[js.Array[String]] = js.native
  /**
    * If `true`, barriers are returned with the [RouteResult](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteResult.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#returnBarriers)
    *
    * @default false
    */
  var returnBarriers: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether the service should generate driving directions for each route.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#returnDirections)
    *
    * @default false
    */
  var returnDirections: js.UndefOr[Boolean] = js.native
  /**
    * If `true`, polygon barriers are returned in the [RouteResult](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteResult.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#returnPolygonBarriers)
    *
    * @default false
    */
  var returnPolygonBarriers: js.UndefOr[Boolean] = js.native
  /**
    * If `true`, polyline barriers are returned in the [RouteResult](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteResult.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#returnPolylineBarriers)
    *
    * @default false
    */
  var returnPolylineBarriers: js.UndefOr[Boolean] = js.native
  /**
    * If `true`, routes are generated and returned in the route property of each [RouteResult](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteResult.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#returnRoutes)
    *
    * @default true
    */
  var returnRoutes: js.UndefOr[Boolean] = js.native
  /**
    * If `true`, stops are returned in the stops property of each [RouteResult](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteResult.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#returnStops)
    *
    * @default false
    */
  var returnStops: js.UndefOr[Boolean] = js.native
  /**
    * If `true`, `z` values are returned in the [RouteResult](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteResult.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#returnZ)
    *
    * @default true
    */
  var returnZ: js.UndefOr[Boolean] = js.native
  /**
    * The time the route begins. If not specified, the default is the time specified in the route service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#startTime)
    */
  var startTime: js.UndefOr[DateProperties] = js.native
  /**
    * If `true`, the start time will be in UTC format.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#startTimeIsUTC)
    *
    * @default true
    */
  var startTimeIsUTC: js.UndefOr[Boolean] = js.native
  /**
    * The set of stops loaded as network locations during analysis. When `stops` takes a FeatureSet, each feature in the FeatureSet must have a defined spatial reference. If the feature contains `x` and `y` attributes, those values are used for the stop, even if the feature includes geometry.  At ArcGIS Server 10.1 an optional `url` property was added. Use this property to specify a REST query request to a Feature, Map or GP Service that returns a JSON feature set. The `url` property can be specified using DataFile Note that either the features or url property should be specified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#stops)
    */
  var stops: js.UndefOr[DataLayerProperties | FeatureSetProperties] = js.native
  /**
    * Travel modes define how a pedestrian, car, truck or other medium of transportation moves through the street network.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#travelMode)
    */
  var travelMode: js.UndefOr[String] = js.native
  /**
    * If `true`, the hierarchy attribute for the network should be used in analysis. The default is as defined in the specific routing network layer used in your [RouteTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-RouteTask.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#useHierarchy)
    *
    * @default false
    */
  var useHierarchy: js.UndefOr[Boolean] = js.native
  /**
    * A useful feature of the [RouteTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-RouteTask.html) is the ability to constrain stop visits to certain times of day, or "time windows". If you were required to deliver orders to four homes and each customer was available during a limited time period during the day, the route task could help you find the most efficient path for making all the deliveries.  Time windows are treated as a "soft" constraint. This means that although the solver attempts to honor time windows, if necessary, it will violate the time windows of some stops in order to reach them. Remember, the stops will be visited in the order they were added unless you set `RouteParameters.findBestSequence = true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#useTimeWindows)
    *
    * @default false
    */
  var useTimeWindows: js.UndefOr[Boolean] = js.native
}

object RouteParametersProperties {
  @scala.inline
  def apply(): RouteParametersProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteParametersProperties]
  }
  @scala.inline
  implicit class RouteParametersPropertiesOps[Self <: RouteParametersProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccumulateAttributes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accumulateAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccumulateAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accumulateAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withAttributeParameterValues(value: js.Array[AttributeParamValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributeParameterValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributeParameterValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributeParameterValues")(js.undefined)
        ret
    }
    @scala.inline
    def withBarriers(value: DataLayerProperties | FeatureSetProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barriers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarriers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barriers")(js.undefined)
        ret
    }
    @scala.inline
    def withDirectionsLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directionsLanguage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectionsLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directionsLanguage")(js.undefined)
        ret
    }
    @scala.inline
    def withDirectionsLengthUnits(
      value: centimeters | `decimal-degrees` | decimeters | feet_ | inches | kilometers_ | meters_ | miles_ | millimeters | `nautical-miles` | points | yards
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directionsLengthUnits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectionsLengthUnits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directionsLengthUnits")(js.undefined)
        ret
    }
    @scala.inline
    def withDirectionsOutputType(value: complete | `complete-no-events` | `instructions-only` | standard | `summary-only`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directionsOutputType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectionsOutputType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directionsOutputType")(js.undefined)
        ret
    }
    @scala.inline
    def withDirectionsStyleName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directionsStyleName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectionsStyleName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directionsStyleName")(js.undefined)
        ret
    }
    @scala.inline
    def withDirectionsTimeAttribute(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directionsTimeAttribute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectionsTimeAttribute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directionsTimeAttribute")(js.undefined)
        ret
    }
    @scala.inline
    def withDoNotLocateOnRestrictedElements(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doNotLocateOnRestrictedElements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoNotLocateOnRestrictedElements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doNotLocateOnRestrictedElements")(js.undefined)
        ret
    }
    @scala.inline
    def withFindBestSequence(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findBestSequence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFindBestSequence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findBestSequence")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreInvalidLocations(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreInvalidLocations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreInvalidLocations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreInvalidLocations")(js.undefined)
        ret
    }
    @scala.inline
    def withImpedanceAttribute(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("impedanceAttribute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImpedanceAttribute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("impedanceAttribute")(js.undefined)
        ret
    }
    @scala.inline
    def withOutSpatialReference(value: SpatialReferenceProperties | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outSpatialReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutSpatialReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outSpatialReference")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputGeometryPrecision(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputGeometryPrecision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputGeometryPrecision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputGeometryPrecision")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputGeometryPrecisionUnits(
      value: centimeters | `decimal-degrees` | decimeters | feet_ | inches | kilometers_ | meters_ | miles_ | millimeters | `nautical-miles` | points | yards
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputGeometryPrecisionUnits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputGeometryPrecisionUnits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputGeometryPrecisionUnits")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputLines(value: none | straight | `true-shape` | `true-shape-with-measure`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputLines")(js.undefined)
        ret
    }
    @scala.inline
    def withPointBarriers(value: DataLayerProperties | FeatureSetProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointBarriers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointBarriers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointBarriers")(js.undefined)
        ret
    }
    @scala.inline
    def withPolygonBarriers(value: DataLayerProperties | FeatureSetProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polygonBarriers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolygonBarriers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polygonBarriers")(js.undefined)
        ret
    }
    @scala.inline
    def withPolylineBarriers(value: DataLayerProperties | FeatureSetProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polylineBarriers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolylineBarriers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polylineBarriers")(js.undefined)
        ret
    }
    @scala.inline
    def withPreserveFirstStop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveFirstStop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreserveFirstStop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveFirstStop")(js.undefined)
        ret
    }
    @scala.inline
    def withPreserveLastStop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveLastStop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreserveLastStop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveLastStop")(js.undefined)
        ret
    }
    @scala.inline
    def withRestrictUTurns(value: `allow-backtrack` | `at-dead-ends-only` | `no-backtrack` | `at-dead-ends-and-intersections`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictUTurns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestrictUTurns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictUTurns")(js.undefined)
        ret
    }
    @scala.inline
    def withRestrictionAttributes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictionAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestrictionAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictionAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withReturnBarriers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnBarriers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnBarriers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnBarriers")(js.undefined)
        ret
    }
    @scala.inline
    def withReturnDirections(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnDirections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnDirections: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnDirections")(js.undefined)
        ret
    }
    @scala.inline
    def withReturnPolygonBarriers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnPolygonBarriers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnPolygonBarriers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnPolygonBarriers")(js.undefined)
        ret
    }
    @scala.inline
    def withReturnPolylineBarriers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnPolylineBarriers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnPolylineBarriers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnPolylineBarriers")(js.undefined)
        ret
    }
    @scala.inline
    def withReturnRoutes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnRoutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnRoutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnRoutes")(js.undefined)
        ret
    }
    @scala.inline
    def withReturnStops(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnStops")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnStops: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnStops")(js.undefined)
        ret
    }
    @scala.inline
    def withReturnZ(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnZ")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnZ: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnZ")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTimeDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartTime(value: DateProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTimeIsUTC(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTimeIsUTC")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTimeIsUTC: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTimeIsUTC")(js.undefined)
        ret
    }
    @scala.inline
    def withStops(value: DataLayerProperties | FeatureSetProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stops")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStops: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stops")(js.undefined)
        ret
    }
    @scala.inline
    def withTravelMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("travelMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTravelMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("travelMode")(js.undefined)
        ret
    }
    @scala.inline
    def withUseHierarchy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useHierarchy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseHierarchy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useHierarchy")(js.undefined)
        ret
    }
    @scala.inline
    def withUseTimeWindows(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useTimeWindows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseTimeWindows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useTimeWindows")(js.undefined)
        ret
    }
  }
  
}

