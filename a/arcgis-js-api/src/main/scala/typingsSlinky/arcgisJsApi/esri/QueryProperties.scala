package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`envelope-intersects`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`index-intersects`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`nautical-miles`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`us-nautical-miles`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.contains
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.crosses
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.disjoint
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.feet_
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.intersects
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.kilometers_
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.meters_
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.miles_
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.native
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.none
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.overlaps
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.relation
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.standard
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.touches
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.within
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryProperties extends StObject {
  
  /**
    * Indicates if the service should cache the query results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#cacheHint)
    */
  var cacheHint: js.UndefOr[Boolean] = js.native
  
  /**
    * Datum transformation used for projecting geometries in the query results when [outSpatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#outSpatialReference) is different than the layer's spatial reference.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#datumTransformation)
    */
  var datumTransformation: js.UndefOr[Double] = js.native
  
  /**
    * Specifies a search distance from a given [geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#geometry) in a spatial query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#distance)
    */
  var distance: js.UndefOr[Double] = js.native
  
  /**
    * Specifies the geodatabase version to display for feature service queries.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#gdbVersion)
    */
  var gdbVersion: js.UndefOr[String] = js.native
  
  /**
    * The geometry to apply to the spatial filter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#geometry)
    */
  var geometry: js.UndefOr[GeometryProperties] = js.native
  
  /**
    * Specifies the number of decimal places for geometries returned by the query operation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#geometryPrecision)
    */
  var geometryPrecision: js.UndefOr[Double] = js.native
  
  /**
    * Used only in [statistical queries](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#statistic).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#groupByFieldsForStatistics)
    */
  var groupByFieldsForStatistics: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * A condition used with [outStatistics](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#outStatistics) and [groupByFieldsForStatistics](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#groupByFieldsForStatistics) to limit query results to groups that satisfy the aggregation function(s).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#having)
    */
  var having: js.UndefOr[String] = js.native
  
  /**
    * The historic moment to query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#historicMoment)
    */
  var historicMoment: js.UndefOr[DateProperties] = js.native
  
  /**
    * The maximum distance in units of [outSpatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#outSpatialReference) used for generalizing geometries returned by the query operation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#maxAllowableOffset)
    */
  var maxAllowableOffset: js.UndefOr[Double] = js.native
  
  /**
    * When set, the maximum number of features returned by the query will equal the `maxRecordCount` of the service multiplied by this factor.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#maxRecordCountFactor)
    */
  var maxRecordCountFactor: js.UndefOr[Double] = js.native
  
  /**
    * Parameter dictates how the geometry of a multipatch feature will be returned.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#multipatchOption)
    */
  var multipatchOption: js.UndefOr[String] = js.native
  
  /**
    * The number of features to retrieve.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#num)
    */
  var num: js.UndefOr[Double] = js.native
  
  /**
    * A comma delimited list of ObjectIDs for the features in the layer being queried.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#objectIds)
    */
  var objectIds: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * One or more field names used to order the query results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#orderByFields)
    */
  var orderByFields: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Attribute fields to include in the [FeatureSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#outFields)
    */
  var outFields: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The spatial reference for the returned geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#outSpatialReference)
    */
  var outSpatialReference: js.UndefOr[SpatialReferenceProperties] = js.native
  
  /**
    * The definitions for one or more field-based statistics to be calculated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#outStatistics)
    */
  var outStatistics: js.UndefOr[js.Array[StatisticDefinitionProperties]] = js.native
  
  /**
    * Filters features from the layer based on pre-authored parameterized filters.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#parameterValues)
    */
  var parameterValues: js.UndefOr[js.Array[QueryParameterValues]] = js.native
  
  /**
    * Specifies the pixel level to be identified on the X and Y axis.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#pixelSize)
    */
  var pixelSize: js.UndefOr[SymbolProperties] = js.native
  
  /**
    * Used to project the geometry onto a virtual grid, likely representing pixels on the screen.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#quantizationParameters)
    */
  var quantizationParameters: js.UndefOr[QueryQuantizationParameters] = js.native
  
  /**
    * Filters features from the layer that are within the specified range values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#rangeValues)
    */
  var rangeValues: js.UndefOr[js.Array[QueryRangeValues]] = js.native
  
  /**
    * The Dimensionally Extended 9 Intersection Model (DE-9IM) matrix relation (encoded as a string) to query the spatial relationship of the input [geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#geometry) to the layer's features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#relationParameter)
    */
  var relationParameter: js.UndefOr[String] = js.native
  
  /**
    * If `true`, each feature in the returned [FeatureSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html) will be returned with a centroid.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#returnCentroid)
    */
  var returnCentroid: js.UndefOr[Boolean] = js.native
  
  /**
    * If `true` then the query returns distinct values based on the field(s) specified in [outFields](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#outFields).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#returnDistinctValues)
    */
  var returnDistinctValues: js.UndefOr[Boolean] = js.native
  
  /**
    * If `true`, then all features are returned for each tile request, even if they exceed the maximum record limit per query indicated on the service by `maxRecordCount`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#returnExceededLimitFeatures)
    */
  var returnExceededLimitFeatures: js.UndefOr[Boolean] = js.native
  
  /**
    * If `true`, each feature in the returned [FeatureSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html) includes the geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#returnGeometry)
    */
  var returnGeometry: js.UndefOr[Boolean] = js.native
  
  /**
    * If `true`, and [returnGeometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#returnGeometry) is `true`, then m-values are included in the geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#returnM)
    */
  var returnM: js.UndefOr[Boolean] = js.native
  
  /**
    * If `true`, the [query geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html#queryGeometry) will be returned with the query results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#returnQueryGeometry)
    */
  var returnQueryGeometry: js.UndefOr[Boolean] = js.native
  
  /**
    * If `true`, and [returnGeometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#returnGeometry) is `true`, then z-values are included in the geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#returnZ)
    */
  var returnZ: js.UndefOr[Boolean] = js.native
  
  /**
    * For spatial queries, this parameter defines the spatial relationship to query features in the layer or layer view against the input [geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#geometry).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#spatialRelationship)
    */
  var spatialRelationship: js.UndefOr[
    intersects | contains | crosses | disjoint | `envelope-intersects` | `index-intersects` | overlaps | touches | within | relation
  ] = js.native
  
  /**
    * This parameter can be either standard SQL92 `standard` or it can use the native SQL of the underlying datastore `native`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#sqlFormat)
    */
  var sqlFormat: js.UndefOr[none | standard | native] = js.native
  
  /**
    * The zero-based index indicating where to begin retrieving features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#start)
    */
  var start: js.UndefOr[Double] = js.native
  
  /**
    * Shorthand for a where clause using "like".
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#text)
    */
  var text: js.UndefOr[String] = js.native
  
  /**
    * A time extent for a temporal query against [time-aware layers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#timeInfo).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#timeExtent)
    */
  var timeExtent: js.UndefOr[TimeExtentProperties] = js.native
  
  /**
    * The unit for calculating the buffer distance when [distance](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#distance) is specified in spatial queries.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#units)
    */
  var units: js.UndefOr[feet_ | miles_ | `nautical-miles` | `us-nautical-miles` | meters_ | kilometers_] = js.native
  
  /**
    * A where clause for the query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#where)
    */
  var where: js.UndefOr[String] = js.native
}
object QueryProperties {
  
  @scala.inline
  def apply(): QueryProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryProperties]
  }
  
  @scala.inline
  implicit class QueryPropertiesMutableBuilder[Self <: QueryProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCacheHint(value: Boolean): Self = StObject.set(x, "cacheHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheHintUndefined: Self = StObject.set(x, "cacheHint", js.undefined)
    
    @scala.inline
    def setDatumTransformation(value: Double): Self = StObject.set(x, "datumTransformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatumTransformationUndefined: Self = StObject.set(x, "datumTransformation", js.undefined)
    
    @scala.inline
    def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
    
    @scala.inline
    def setGdbVersion(value: String): Self = StObject.set(x, "gdbVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGdbVersionUndefined: Self = StObject.set(x, "gdbVersion", js.undefined)
    
    @scala.inline
    def setGeometry(value: GeometryProperties): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeometryPrecision(value: Double): Self = StObject.set(x, "geometryPrecision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeometryPrecisionUndefined: Self = StObject.set(x, "geometryPrecision", js.undefined)
    
    @scala.inline
    def setGeometryUndefined: Self = StObject.set(x, "geometry", js.undefined)
    
    @scala.inline
    def setGroupByFieldsForStatistics(value: js.Array[String]): Self = StObject.set(x, "groupByFieldsForStatistics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupByFieldsForStatisticsUndefined: Self = StObject.set(x, "groupByFieldsForStatistics", js.undefined)
    
    @scala.inline
    def setGroupByFieldsForStatisticsVarargs(value: String*): Self = StObject.set(x, "groupByFieldsForStatistics", js.Array(value :_*))
    
    @scala.inline
    def setHaving(value: String): Self = StObject.set(x, "having", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHavingUndefined: Self = StObject.set(x, "having", js.undefined)
    
    @scala.inline
    def setHistoricMoment(value: DateProperties): Self = StObject.set(x, "historicMoment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHistoricMomentDate(value: js.Date): Self = StObject.set(x, "historicMoment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHistoricMomentUndefined: Self = StObject.set(x, "historicMoment", js.undefined)
    
    @scala.inline
    def setMaxAllowableOffset(value: Double): Self = StObject.set(x, "maxAllowableOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxAllowableOffsetUndefined: Self = StObject.set(x, "maxAllowableOffset", js.undefined)
    
    @scala.inline
    def setMaxRecordCountFactor(value: Double): Self = StObject.set(x, "maxRecordCountFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRecordCountFactorUndefined: Self = StObject.set(x, "maxRecordCountFactor", js.undefined)
    
    @scala.inline
    def setMultipatchOption(value: String): Self = StObject.set(x, "multipatchOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultipatchOptionUndefined: Self = StObject.set(x, "multipatchOption", js.undefined)
    
    @scala.inline
    def setNum(value: Double): Self = StObject.set(x, "num", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumUndefined: Self = StObject.set(x, "num", js.undefined)
    
    @scala.inline
    def setObjectIds(value: js.Array[Double]): Self = StObject.set(x, "objectIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIdsUndefined: Self = StObject.set(x, "objectIds", js.undefined)
    
    @scala.inline
    def setObjectIdsVarargs(value: Double*): Self = StObject.set(x, "objectIds", js.Array(value :_*))
    
    @scala.inline
    def setOrderByFields(value: js.Array[String]): Self = StObject.set(x, "orderByFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderByFieldsUndefined: Self = StObject.set(x, "orderByFields", js.undefined)
    
    @scala.inline
    def setOrderByFieldsVarargs(value: String*): Self = StObject.set(x, "orderByFields", js.Array(value :_*))
    
    @scala.inline
    def setOutFields(value: js.Array[String]): Self = StObject.set(x, "outFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutFieldsUndefined: Self = StObject.set(x, "outFields", js.undefined)
    
    @scala.inline
    def setOutFieldsVarargs(value: String*): Self = StObject.set(x, "outFields", js.Array(value :_*))
    
    @scala.inline
    def setOutSpatialReference(value: SpatialReferenceProperties): Self = StObject.set(x, "outSpatialReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutSpatialReferenceUndefined: Self = StObject.set(x, "outSpatialReference", js.undefined)
    
    @scala.inline
    def setOutStatistics(value: js.Array[StatisticDefinitionProperties]): Self = StObject.set(x, "outStatistics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutStatisticsUndefined: Self = StObject.set(x, "outStatistics", js.undefined)
    
    @scala.inline
    def setOutStatisticsVarargs(value: StatisticDefinitionProperties*): Self = StObject.set(x, "outStatistics", js.Array(value :_*))
    
    @scala.inline
    def setParameterValues(value: js.Array[QueryParameterValues]): Self = StObject.set(x, "parameterValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterValuesUndefined: Self = StObject.set(x, "parameterValues", js.undefined)
    
    @scala.inline
    def setParameterValuesVarargs(value: QueryParameterValues*): Self = StObject.set(x, "parameterValues", js.Array(value :_*))
    
    @scala.inline
    def setPixelSize(value: SymbolProperties): Self = StObject.set(x, "pixelSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixelSizeUndefined: Self = StObject.set(x, "pixelSize", js.undefined)
    
    @scala.inline
    def setQuantizationParameters(value: QueryQuantizationParameters): Self = StObject.set(x, "quantizationParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuantizationParametersUndefined: Self = StObject.set(x, "quantizationParameters", js.undefined)
    
    @scala.inline
    def setRangeValues(value: js.Array[QueryRangeValues]): Self = StObject.set(x, "rangeValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeValuesUndefined: Self = StObject.set(x, "rangeValues", js.undefined)
    
    @scala.inline
    def setRangeValuesVarargs(value: QueryRangeValues*): Self = StObject.set(x, "rangeValues", js.Array(value :_*))
    
    @scala.inline
    def setRelationParameter(value: String): Self = StObject.set(x, "relationParameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelationParameterUndefined: Self = StObject.set(x, "relationParameter", js.undefined)
    
    @scala.inline
    def setReturnCentroid(value: Boolean): Self = StObject.set(x, "returnCentroid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnCentroidUndefined: Self = StObject.set(x, "returnCentroid", js.undefined)
    
    @scala.inline
    def setReturnDistinctValues(value: Boolean): Self = StObject.set(x, "returnDistinctValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnDistinctValuesUndefined: Self = StObject.set(x, "returnDistinctValues", js.undefined)
    
    @scala.inline
    def setReturnExceededLimitFeatures(value: Boolean): Self = StObject.set(x, "returnExceededLimitFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnExceededLimitFeaturesUndefined: Self = StObject.set(x, "returnExceededLimitFeatures", js.undefined)
    
    @scala.inline
    def setReturnGeometry(value: Boolean): Self = StObject.set(x, "returnGeometry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnGeometryUndefined: Self = StObject.set(x, "returnGeometry", js.undefined)
    
    @scala.inline
    def setReturnM(value: Boolean): Self = StObject.set(x, "returnM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnMUndefined: Self = StObject.set(x, "returnM", js.undefined)
    
    @scala.inline
    def setReturnQueryGeometry(value: Boolean): Self = StObject.set(x, "returnQueryGeometry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnQueryGeometryUndefined: Self = StObject.set(x, "returnQueryGeometry", js.undefined)
    
    @scala.inline
    def setReturnZ(value: Boolean): Self = StObject.set(x, "returnZ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnZUndefined: Self = StObject.set(x, "returnZ", js.undefined)
    
    @scala.inline
    def setSpatialRelationship(
      value: intersects | contains | crosses | disjoint | `envelope-intersects` | `index-intersects` | overlaps | touches | within | relation
    ): Self = StObject.set(x, "spatialRelationship", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpatialRelationshipUndefined: Self = StObject.set(x, "spatialRelationship", js.undefined)
    
    @scala.inline
    def setSqlFormat(value: none | standard | native): Self = StObject.set(x, "sqlFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSqlFormatUndefined: Self = StObject.set(x, "sqlFormat", js.undefined)
    
    @scala.inline
    def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setTimeExtent(value: TimeExtentProperties): Self = StObject.set(x, "timeExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeExtentUndefined: Self = StObject.set(x, "timeExtent", js.undefined)
    
    @scala.inline
    def setUnits(value: feet_ | miles_ | `nautical-miles` | `us-nautical-miles` | meters_ | kilometers_): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitsUndefined: Self = StObject.set(x, "units", js.undefined)
    
    @scala.inline
    def setWhere(value: String): Self = StObject.set(x, "where", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhereUndefined: Self = StObject.set(x, "where", js.undefined)
  }
}
