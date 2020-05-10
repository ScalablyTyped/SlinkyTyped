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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClosestFacilityParametersProperties extends js.Object {
  /**
    * The list of network attribute names to be accumulated with the analysis, i.e., which attributes should be returned as part of the response.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#accumulateAttributes)
    */
  var accumulateAttributes: js.UndefOr[js.Array[String]] = js.native
  /**
    * An array of attribute parameter values that determine which network elements can be used by a vehicle. View the object specifications below for properties of the individual objects in this array.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#attributeParameterValues)
    */
  var attributeParameterValues: js.UndefOr[js.Array[ClosestFacilityParametersAttributeParameterValues]] = js.native
  /**
    * The cutoff value used to determine when to stop traversing.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#defaultCutoff)
    */
  var defaultCutoff: js.UndefOr[Double] = js.native
  /**
    * The number of facilities to find.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#defaultTargetFacilityCount)
    */
  var defaultTargetFacilityCount: js.UndefOr[Double] = js.native
  /**
    * The language used when generating driving directions. This parameter applies only when [returnDirections](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#returnDirections) parameter is set to `true`. If an unsupported language code is specified, the service returns the directions using the default language, English.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#directionsLanguage)
    */
  var directionsLanguage: js.UndefOr[String] = js.native
  /**
    * The length units used when computing driving directions. This parameter applies only when [returnDirections](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#returnDirections) parameter is set to `true`. If not specified the task will use the value defined by the routing network layer is used.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#directionsLengthUnits)
    */
  var directionsLengthUnits: js.UndefOr[
    centimeters | `decimal-degrees` | decimeters | feet_ | inches | kilometers_ | meters_ | miles_ | millimeters | `nautical-miles` | points | yards
  ] = js.native
  /**
    * Defines the amount of direction information returned. The default value is standard.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#directionsOutputType)
    */
  var directionsOutputType: js.UndefOr[
    complete | `complete-no-events` | `instructions-only` | standard | `summary-only`
  ] = js.native
  /**
    * The style to be used when returning directions. The default will be as defined in the network layer. View the REST layer description for your network service to see a list of supported styles.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#directionsStyleName)
    */
  var directionsStyleName: js.UndefOr[String] = js.native
  /**
    * The name of the attribute field that contains the drive time values. If not specified, the task will use the attribute field defined by the routing network layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#directionsTimeAttribute)
    */
  var directionsTimeAttribute: js.UndefOr[String] = js.native
  /**
    * When `true`, restricted network elements should be considered when finding network locations.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#doNotLocateOnRestrictedElements)
    *
    * @default true
    */
  var doNotLocateOnRestrictedElements: js.UndefOr[Boolean] = js.native
  /**
    * The set of facilities loaded as network locations during analysis. These can be specified as either a [DataLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DataLayer.html) or a [FeatureSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html).  At ArcGIS Server 10.1 an optional `url` property was added. Use this property to specify a REST query request to a Feature, Map or GP Service that returns a JSON feature set. The url property can be specified using [DataFile](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DataFile.html). Either the features or url  property should be specified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#facilities)
    */
  var facilities: js.UndefOr[DataLayerProperties | FeatureSetProperties] = js.native
  /**
    * The network attribute name used as the impedance attribute in analysis. The default is as defined in the routing network layer used in your [RouteTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-RouteTask.html). You can specify any attribute names listed in the Service Directory under `Network Dataset > Network Attributes` as `Usage Type: esriNAUTCost`. You can also specify a value of `none` to indicate that no network attributes should be used for impedance. If you specify an empty string, it will use the default of the service.  For example, set `impedanceAttribute = 'Time'` for quickest route and `impedanceAttribute = 'Length'` for shortest drive, assuming the service has those two esriNAUTCost attributes.  View the [Understanding the network attribute](http://desktop.arcgis.com/en/arcmap/latest/extensions/network-analyst/understanding-network-attributes.htm) ArcGIS desktop help topic for more details.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#impedanceAttribute)
    */
  var impedanceAttribute: js.UndefOr[String] = js.native
  /**
    * The set of incidents loaded as network locations during analysis. Can be an instance of [DataLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DataLayer.html) or [FeatureSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html). At ArcGIS Server 10.1 an optional `url` property was added. Use this property to specify a REST query request to a Feature, Map or GP Service that returns a JSON feature set. The url property can be specified using [DataFile](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DataFile.html). Either the features or url property should be specified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#incidents)
    */
  var incidents: js.UndefOr[DataLayerProperties | FeatureSetProperties] = js.native
  /**
    * The well-known id of the spatial reference or the spatial reference object for the geometries returned with the analysis results. If `outSpatialReference` is not specified, the geometries are returned in the spatial reference of the map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#outSpatialReference)
    */
  var outSpatialReference: js.UndefOr[SpatialReferenceProperties | String] = js.native
  /**
    * The output geometry precision. When `0`, no generalization of the output geometry is performed. Positive values represent the `MaximumAllowableOffset` parameter used by generalize.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#outputGeometryPrecision)
    */
  var outputGeometryPrecision: js.UndefOr[Double] = js.native
  /**
    * The units of the output geometry precision.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#outputGeometryPrecisionUnits)
    */
  var outputGeometryPrecisionUnits: js.UndefOr[
    centimeters | `decimal-degrees` | decimeters | feet_ | inches | kilometers_ | meters_ | miles_ | millimeters | `nautical-miles` | points | yards
  ] = js.native
  /**
    * The type of output lines to be generated in the result. The default is defined in the specific routing network layer used in your RouteTask.
    *
    * Possible Value | Description
    * ---------------|------------
    * none | No lines are returned
    * straight | Only returns straight lines
    * true-shape | Return the true shape of the lines
    * true-shape-with-measure | Return the true shape of the lines with their measurements
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#outputLines)
    */
  var outputLines: js.UndefOr[none | straight | `true-shape` | `true-shape-with-measure`] = js.native
  /**
    * The set of point barriers loaded as network locations during analysis. Can be an instance of [DataLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DataLayer.html) or [FeatureSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html). At ArcGIS Server 10.1 an optional `url` property was added. Use this property to specify a REST query request to a Feature, Map or GP Service that returns a JSON feature set. The url property can be specified using [DataFile](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DataFile.html). Either the features or url property should be specified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#pointBarriers)
    */
  var pointBarriers: js.UndefOr[DataLayerProperties | FeatureSetProperties] = js.native
  /**
    * The set of polygon barriers loaded as network locations during analysis. Can be an instance of [DataLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DataLayer.html) or [FeatureSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html). At ArcGIS Server 10.1 an optional `url` property was added. Use this property to specify a REST query request to a Feature, Map or GP Service that returns a JSON feature set. The url property can be specified using [DataFile](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DataFile.html). Either the features or url property should be specified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#polygonBarriers)
    */
  var polygonBarriers: js.UndefOr[DataLayerProperties | FeatureSetProperties] = js.native
  /**
    * The set of polyline barriers loaded as network locations during analysis. Can be an instance of [DataLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DataLayer.html) or [FeatureSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html). At ArcGIS Server 10.1 an optional `url` property was added. Use this property to specify a REST query request to a Feature, Map or GP Service that returns a JSON feature set. The url property can be specified using [DataFile](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DataFile.html). Either the features or url property should be specified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#polylineBarriers)
    */
  var polylineBarriers: js.UndefOr[DataLayerProperties | FeatureSetProperties] = js.native
  /**
    * Specifies how U-Turns should be handled. The default is as defined in the specific routing network layer used in your module:"esri/tasks/ClosestFacilityTask".
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#restrictUTurns)
    */
  var restrictUTurns: js.UndefOr[
    `allow-backtrack` | `at-dead-ends-only` | `no-backtrack` | `at-dead-ends-and-intersections`
  ] = js.native
  /**
    * The list of network attribute names to be used as restrictions with the analysis. The default is as defined in the specific routing network layer used in your RouteTask. Possible values are listed in the Service Directory under Network Dataset > Network Attributes. You can also specify a value of none to indicate that no network attributes should be used as restrictions. If you specify an empty array, it will default to the default of the service. Use `["none"]` to override the service defaults and specify that no restrictions should be used.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#restrictionAttributes)
    */
  var restrictionAttributes: js.UndefOr[js.Array[String]] = js.native
  /**
    * Indicates whether the service should generate driving directions for each route.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#returnDirections)
    *
    * @default false
    */
  var returnDirections: js.UndefOr[Boolean] = js.native
  /**
    * If `true`, facilities will be returned with the analysis results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#returnFacilities)
    *
    * @default false
    */
  var returnFacilities: js.UndefOr[Boolean] = js.native
  /**
    * If `true`, incidents will be returned with the analysis results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#returnIncidents)
    *
    * @default false
    */
  var returnIncidents: js.UndefOr[Boolean] = js.native
  /**
    * If `true`, point barriers will be returned in the barriers property of the [ClosestFacilitySolveResult](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilitySolveResult.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#returnPointBarriers)
    *
    * @default false
    */
  var returnPointBarriers: js.UndefOr[Boolean] = js.native
  /**
    * If `true`, polygon barriers will be returned in the barriers property of the [ClosestFacilitySolveResult](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilitySolveResult.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#returnPolygonBarriers)
    *
    * @default false
    */
  var returnPolygonBarriers: js.UndefOr[Boolean] = js.native
  /**
    * If `true`, polyline barriers will be returned in the barriers property of the [ClosestFacilitySolveResult](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilitySolveResult.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#returnPolylineBarriers)
    *
    * @default false
    */
  var returnPolylineBarriers: js.UndefOr[Boolean] = js.native
  /**
    * When `true`, closest facility routes will be generated and returned in the route property of each [ClosestFacilitySolveResult](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilitySolveResult.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#returnRoutes)
    *
    * @default true
    */
  var returnRoutes: js.UndefOr[Boolean] = js.native
  /**
    * The arrival or departure date and time. For example, if the travelDirection is set to `to-facility` and `timeOfDayUsage` is set to `end` and `timeOfDay` is set to 8:00 a.m., the returned route(s) will be setup to arrive at the facility at 8:00 a.m. local time. *Requires ArcGIS Server service version 10.1 or greater.*
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#timeOfDay)
    */
  var timeOfDay: js.UndefOr[DateProperties] = js.native
  /**
    * Defines the way the `timeOfDay` value is used. The default value is defined in the network layer. *Requires ArcGIS Server service version 10.1 or greater.*
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#timeOfDayUsage)
    */
  var timeOfDayUsage: js.UndefOr[start | end] = js.native
  /**
    * Options for traveling to or from the facility. Default values are defined by the network layer.
    *
    * Possible Value | Description
    * ---------------|------------
    * from-facility | Sets travel direction from the facility
    * to-facility | Sets travel direction to the facility
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#travelDirection)
    */
  var travelDirection: js.UndefOr[`from-facility` | `to-facility`] = js.native
  /**
    * Travel modes define how a pedestrian, car, truck or other medium of transportation moves through the street network.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#travelMode)
    */
  var travelMode: js.UndefOr[String] = js.native
  /**
    * If `true`, the hierarchy attribute for the network will be used in analysis. The default is defined in the routing network layer used by the [ClosestFacilityTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-ClosestFacilityTask.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#useHierarchy)
    *
    * @default false
    */
  var useHierarchy: js.UndefOr[Boolean] = js.native
}

object ClosestFacilityParametersProperties {
  @scala.inline
  def apply(): ClosestFacilityParametersProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClosestFacilityParametersProperties]
  }
  @scala.inline
  implicit class ClosestFacilityParametersPropertiesOps[Self <: ClosestFacilityParametersProperties] (val x: Self) extends AnyVal {
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
    def withAttributeParameterValues(value: js.Array[ClosestFacilityParametersAttributeParameterValues]): Self = {
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
    def withDefaultCutoff(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultCutoff")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultCutoff: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultCutoff")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultTargetFacilityCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultTargetFacilityCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultTargetFacilityCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultTargetFacilityCount")(js.undefined)
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
    def withFacilities(value: DataLayerProperties | FeatureSetProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("facilities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFacilities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("facilities")(js.undefined)
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
    def withIncidents(value: DataLayerProperties | FeatureSetProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incidents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncidents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incidents")(js.undefined)
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
    def withReturnFacilities(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnFacilities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnFacilities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnFacilities")(js.undefined)
        ret
    }
    @scala.inline
    def withReturnIncidents(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnIncidents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnIncidents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnIncidents")(js.undefined)
        ret
    }
    @scala.inline
    def withReturnPointBarriers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnPointBarriers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnPointBarriers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnPointBarriers")(js.undefined)
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
    def withTimeOfDayDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeOfDay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeOfDay(value: DateProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeOfDay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeOfDay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeOfDay")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeOfDayUsage(value: start | end): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeOfDayUsage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeOfDayUsage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeOfDayUsage")(js.undefined)
        ret
    }
    @scala.inline
    def withTravelDirection(value: `from-facility` | `to-facility`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("travelDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTravelDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("travelDirection")(js.undefined)
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
  }
  
}

