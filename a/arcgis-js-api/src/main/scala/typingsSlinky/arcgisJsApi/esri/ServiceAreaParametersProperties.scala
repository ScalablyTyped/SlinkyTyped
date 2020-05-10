package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`allow-backtrack`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`at-dead-ends-and-intersections`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`at-dead-ends-only`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`decimal-degrees`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`from-facility`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`nautical-miles`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`no-backtrack`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`to-facility`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`true-shape-with-measure`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`true-shape`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.centimeters
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.decimeters
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.detailed
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.feet_
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.inches
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.kilometers_
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.meters_
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.miles_
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.millimeters
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.none
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.points
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.simplified
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.straight
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.yards
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceAreaParametersProperties extends js.Object {
  /**
    * The list of network attribute names to be accumulated with the analysis (i.e. which attributes should be returned as part of the response). The default is as defined in the specific routing network layer used in your [RouteTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-RouteTask.html). You can specify any attributes names listed in the Service Directory under `Network Dataset > Network Attributes` as `Usage Type: esriNAUTCost`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#accumulateAttributes)
    */
  var accumulateAttributes: js.UndefOr[js.Array[String]] = js.native
  /**
    * A set of attribute parameter values that can be parameterized to determine which network elements can be used by a vehicle. The parameter holding a vehicle characteristic is compared to a value coming from a descriptor attribute to determine whether or not a network element is traversable. For example, a parameterized restriction attribute can compare the height of your vehicle with a descriptor attribute that holds the clearance under overpasses through tunnels. If the vehicle's height is greater than the clearance, the edge is restricted.  Parameterized cost attributes that reference other cost attributes and scale them, can also be used. This is useful when inclement weather like ice, fog or heavy rain, descends on the study area and hinders normal flow of traffic. By having a parameter already outfitted on a cost attribute, travel-time expectations and traversable network paths can be adjusted with respect to changes in traffic speeds.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#attributeParameterValues)
    */
  var attributeParameterValues: js.UndefOr[js.Array[_]] = js.native
  /**
    * An array of numbers defining the breaks. The default value is defined in the network analysis layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#defaultBreaks)
    */
  var defaultBreaks: js.UndefOr[js.Array[Double]] = js.native
  /**
    * When `true`, restricted network elements should be considered when finding network locations.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#doNotLocateOnRestrictedElements)
    */
  var doNotLocateOnRestrictedElements: js.UndefOr[Boolean] = js.native
  /**
    * An array of network source names to NOT use when generating polygons. This property specifies if certain network sources should be excluded from the service area polygon generation. A service area on a multi-modal network where only one mode is being used to compute the service area would get a more appropriate shape if other modes are excluded from the polygons.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#excludeSourcesFromPolygons)
    */
  var excludeSourcesFromPolygons: js.UndefOr[js.Array[String]] = js.native
  /**
    * The set of facilities loaded as network locations during analysis. At ArcGIS Server 10.1, an optional url property was added. Use this property to specify a REST query request to a Feature, Map or GP Service that returns a JSON feature set. The url property can be specified using `DataFile`. Note that either the features or url property should be specified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#facilities)
    */
  var facilities: js.UndefOr[DataLayerProperties | FeatureSetProperties] = js.native
  /**
    * The network attribute name used as the impedance attribute in analysis. The default is as defined in the routing network layer used in your [RouteTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-RouteTask.html). You can specify any attribute names listed in the Service Directory under `Network Dataset > Network Attributes` as `Usage Type: esriNAUTCost`. You can also specify a value of `none` to indicate that no network attributes should be used for impedance. If you specify an empty string, it will use the default of the service.  For example, set `impedanceAttribute = 'Time'` for quickest route and `impedanceAttribute = 'Length'` for shortest drive, assuming the service has those two esriNAUTCost attributes.  View the [Understanding the network attribute](http://desktop.arcgis.com/en/arcmap/latest/extensions/network-analyst/understanding-network-attributes.htm) ArcGIS desktop help topic for more details.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#impedanceAttribute)
    */
  var impedanceAttribute: js.UndefOr[String] = js.native
  /**
    * If `true`, similar ranges will be merged in the resulting polygons.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#mergeSimilarPolygonRanges)
    *
    * @default false
    */
  var mergeSimilarPolygonRanges: js.UndefOr[Boolean] = js.native
  /**
    * The well-known ID of the spatial reference for the geometries returned with the analysis results. If `outSpatialReference` is not specified, the geometries are returned in the spatial reference of the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#outSpatialReference)
    */
  var outSpatialReference: js.UndefOr[SpatialReferenceProperties] = js.native
  /**
    * The precision of the output geometry after generalization. If `0`, no generalization of output geometry is performed. If present and positive, it represents the `MaximumAllowableOffset` parameter and generalization is performed according to IPolycurve.Generalize.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#outputGeometryPrecision)
    */
  var outputGeometryPrecision: js.UndefOr[Double] = js.native
  /**
    * The units of the output geometry precision.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#outputGeometryPrecisionUnits)
    */
  var outputGeometryPrecisionUnits: js.UndefOr[
    centimeters | `decimal-degrees` | decimeters | feet_ | inches | kilometers_ | meters_ | miles_ | millimeters | `nautical-miles` | points | yards
  ] = js.native
  /**
    * The type of output lines to be generated in the result. The default is defined in the specific routing network layer used in your [ServiceAreaTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-ServiceAreaTask.html).
    *
    * Possible Value | Description
    * ---------------|------------
    * none | No lines are returned
    * straight | Only returns straight lines
    * true-shape | Return the true shape of the lines
    * true-shape-with-measure | Return the true shape of the lines with their measurements
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#outputLines)
    */
  var outputLines: js.UndefOr[none | straight | `true-shape` | `true-shape-with-measure`] = js.native
  /**
    * The type of output polygons to be generated in the result. The default is as defined in the specific routing network layer used in your [ServiceAreaTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-ServiceAreaTask.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#outputPolygons)
    */
  var outputPolygons: js.UndefOr[none | simplified | detailed] = js.native
  /**
    * Indicates if the lines should overlap from multiple facilities. The default is defined by the network analysis layer in your [ServiceAreaTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-ServiceAreaTask.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#overlapLines)
    *
    * @default false
    */
  var overlapLines: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if the polygons should overlap from multiple facilities. The default is defined by the network analysis layer in your [ServiceAreaTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-ServiceAreaTask.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#overlapPolygons)
    *
    * @default false
    */
  var overlapPolygons: js.UndefOr[Boolean] = js.native
  /**
    * The set of point barriers loaded as network locations during analysis. At ArcGIS Server 10.1, an optional url property was added. Use this property to specify a REST query request to a Feature, Map or GP Service that returns a JSON feature set. The url property can be specified using [DataFile](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DataFile.html). Note that either the features or url property should be specified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#pointBarriers)
    */
  var pointBarriers: js.UndefOr[DataLayerProperties | FeatureSetProperties] = js.native
  /**
    * The set of polygon barriers loaded as network locations during analysis. At ArcGIS Server 10.1, an optional url property was added. Use this property to specify a REST query request to a Feature, Map or GP Service that returns a JSON feature set. The url property can be specified using [DataFile](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DataFile.html). Note that either the features or url property should be specified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#polygonBarriers)
    */
  var polygonBarriers: js.UndefOr[DataLayerProperties | FeatureSetProperties] = js.native
  /**
    * The set of polyline barriers loaded as network locations during analysis. At ArcGIS Server 10.1, an optional url property was added. Use this property to specify a REST query request to a Feature, Map or GP Service that returns a JSON feature set. The url property can be specified using [DataFile](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DataFile.html). Note that either the features or url property should be specified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#polylineBarriers)
    */
  var polylineBarriers: js.UndefOr[DataLayerProperties | FeatureSetProperties] = js.native
  /**
    * Specifies how U-turns should be handled. The default is defined in the routing network layer used in your RouteTask.
    *
    * Possible Value | Description
    * ---------------|------------
    * allow-backtrack | Allows U-turns on everywhere
    * at-dead-ends-only | Only allows U-turns at dead ends
    * no-backtrack | Restricts U-turns everywhere
    * at-dead-ends-and-intersections | Only allows U-turns at dead ends and intersections
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#restrictUTurns)
    */
  var restrictUTurns: js.UndefOr[
    `allow-backtrack` | `at-dead-ends-only` | `no-backtrack` | `at-dead-ends-and-intersections`
  ] = js.native
  /**
    * The list of network attribute names to be used as restrictions with the analysis. The default is as defined in the specific routing network layer used in your [RouteTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-RouteTask.html). You can specify any attributes names listed in the Service Directory under `Network Dataset > Network Attributes` as `Usage Type: esriNAUTCost`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#restrictionAttributes)
    */
  var restrictionAttributes: js.UndefOr[js.Array[String]] = js.native
  /**
    * If `true`, facilities will be returned with the analysis results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#returnFacilities)
    *
    * @default false
    */
  var returnFacilities: js.UndefOr[Boolean] = js.native
  /**
    * If `true`, point barriers will be returned in the [pointBarriers](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaSolveResult.html#pointBarriers) property of the analysis results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#returnPointBarriers)
    *
    * @default false
    */
  var returnPointBarriers: js.UndefOr[Boolean] = js.native
  /**
    * If `true`, polygon barriers will be returned in the [polygonBarriers](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaSolveResult.html#polygonBarriers) property of the analysis results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#returnPolygonBarriers)
    *
    * @default false
    */
  var returnPolygonBarriers: js.UndefOr[Boolean] = js.native
  /**
    * If `true`, polyline barriers will be returned in the [polylineBarriers](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaSolveResult.html#polylineBarriers) property of the analysis results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#returnPolylineBarriers)
    *
    * @default false
    */
  var returnPolylineBarriers: js.UndefOr[Boolean] = js.native
  /**
    * If `true`, lines will be split at breaks.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#splitLinesAtBreaks)
    *
    * @default false
    */
  var splitLinesAtBreaks: js.UndefOr[Boolean] = js.native
  /**
    * If `true`, polygons will be split at breaks.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#splitPolygonsAtBreaks)
    *
    * @default false
    */
  var splitPolygonsAtBreaks: js.UndefOr[Boolean] = js.native
  /**
    * Local date and time at the facility. If `travelDirection = "to-facility"`, the `timeOfDay` value specifies arrival time at the facility. if `travelDirection = "from-facility"`, `timeOfDay` specifies departure time from the facility. Requires ArcGIS Server service version 10.1 or greater.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#timeOfDay)
    */
  var timeOfDay: js.UndefOr[DateProperties] = js.native
  /**
    * Options for traveling to or from the facility. Default values are defined by the network layer.
    *
    * Possible Value | Description
    * ---------------|------------
    * from-facility | Sets travel direction from the facility
    * to-facility | Sets travel direction to the facility
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#travelDirection)
    */
  var travelDirection: js.UndefOr[`from-facility` | `to-facility`] = js.native
  /**
    * Travel modes define how a pedestrian, car, truck or other medium of transportation moves through the street network.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#travelMode)
    */
  var travelMode: js.UndefOr[String] = js.native
  /**
    * If `true`, the outermost polygon (at the maximum break value) will be trimmed. The default is defined in the network analysis layer in your [ServiceAreaTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-ServiceAreaTask.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#trimOuterPolygon)
    *
    * @default false
    */
  var trimOuterPolygon: js.UndefOr[Boolean] = js.native
  /**
    * If polygons are being trimmed, provides the distance to trim. The default value is defined in the network analysis layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#trimPolygonDistance)
    */
  var trimPolygonDistance: js.UndefOr[Double] = js.native
  /**
    * If polygons are being trimmed, specifies the units of [trimPolygonDistance](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#trimPolygonDistance). The default is defined in the network analysis layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#trimPolygonDistanceUnits)
    */
  var trimPolygonDistanceUnits: js.UndefOr[
    centimeters | `decimal-degrees` | decimeters | feet_ | inches | kilometers_ | meters_ | miles_ | millimeters | `nautical-miles` | points | yards
  ] = js.native
  /**
    * When `true`, the hierarchy attributes for the network will be used in the analysis. The default value is defined in the network layer. `useHierarchy` cannot be used in conjunction with [outputLines](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#outputLines). Requires an ArcGIS Server service version 10.1 or greater.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#useHierarchy)
    */
  var useHierarchy: js.UndefOr[Boolean] = js.native
}

object ServiceAreaParametersProperties {
  @scala.inline
  def apply(): ServiceAreaParametersProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceAreaParametersProperties]
  }
  @scala.inline
  implicit class ServiceAreaParametersPropertiesOps[Self <: ServiceAreaParametersProperties] (val x: Self) extends AnyVal {
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
    def withAttributeParameterValues(value: js.Array[_]): Self = {
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
    def withDefaultBreaks(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultBreaks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultBreaks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultBreaks")(js.undefined)
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
    def withExcludeSourcesFromPolygons(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeSourcesFromPolygons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludeSourcesFromPolygons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeSourcesFromPolygons")(js.undefined)
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
    def withMergeSimilarPolygonRanges(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeSimilarPolygonRanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMergeSimilarPolygonRanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeSimilarPolygonRanges")(js.undefined)
        ret
    }
    @scala.inline
    def withOutSpatialReference(value: SpatialReferenceProperties): Self = {
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
    def withOutputPolygons(value: none | simplified | detailed): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputPolygons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputPolygons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputPolygons")(js.undefined)
        ret
    }
    @scala.inline
    def withOverlapLines(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlapLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverlapLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlapLines")(js.undefined)
        ret
    }
    @scala.inline
    def withOverlapPolygons(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlapPolygons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverlapPolygons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlapPolygons")(js.undefined)
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
    def withSplitLinesAtBreaks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitLinesAtBreaks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSplitLinesAtBreaks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitLinesAtBreaks")(js.undefined)
        ret
    }
    @scala.inline
    def withSplitPolygonsAtBreaks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitPolygonsAtBreaks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSplitPolygonsAtBreaks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitPolygonsAtBreaks")(js.undefined)
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
    def withTrimOuterPolygon(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trimOuterPolygon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrimOuterPolygon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trimOuterPolygon")(js.undefined)
        ret
    }
    @scala.inline
    def withTrimPolygonDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trimPolygonDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrimPolygonDistance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trimPolygonDistance")(js.undefined)
        ret
    }
    @scala.inline
    def withTrimPolygonDistanceUnits(
      value: centimeters | `decimal-degrees` | decimeters | feet_ | inches | kilometers_ | meters_ | miles_ | millimeters | `nautical-miles` | points | yards
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trimPolygonDistanceUnits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrimPolygonDistanceUnits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trimPolygonDistanceUnits")(js.undefined)
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

