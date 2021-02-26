package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CSVLayerCapabilitiesQuery extends Object {
  
  /**
    * Indicates if the geometry centroid associated with each polygon feature can be returned.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#capabilities)
    */
  var supportsCentroid: Boolean = js.native
  
  /**
    * Indicates if the query operation supports `disjoint` [spatial relationship](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#spatialRelationship).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#capabilities)
    */
  var supportsDisjointSpatialRelationship: Boolean = js.native
  
  /**
    * Indicates if the layer's query operation supports a buffer distance for input geometries.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#capabilities)
    */
  var supportsDistance: Boolean = js.native
  
  /**
    * Indicates if the layer supports queries for distinct values based on fields specified in the [outFields](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#outFields).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#capabilities)
    */
  var supportsDistinct: Boolean = js.native
  
  /**
    * Indicates if the layer's query response includes the extent of features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#capabilities)
    */
  var supportsExtent: Boolean = js.native
  
  /**
    * Indicates if the layer's query response contains geometry attributes, including shape area and length attributes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#capabilities)
    */
  var supportsGeometryProperties: Boolean = js.native
  
  /**
    * Indicates if the layer supports the [having](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#having) clause on the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#capabilities)
    */
  var supportsHavingClause: Boolean = js.native
  
  /**
    * Indicates if the layer supports historic moment query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#capabilities)
    */
  var supportsHistoricMoment: Boolean = js.native
  
  /**
    * Indicates if features returned in the query response can be ordered by one or more fields.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#capabilities)
    */
  var supportsOrderBy: Boolean = js.native
  
  /**
    * Indicates if the query response supports pagination.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#capabilities)
    */
  var supportsPagination: Boolean = js.native
  
  /**
    * Indicates if the layer supports [percentile statisticType](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-StatisticDefinition.html#statisticType).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#capabilities)
    */
  var supportsPercentileStatistics: Boolean = js.native
  
  /**
    * Indicates if the query operation supports the projection of geometries onto a virtual grid.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#capabilities)
    */
  var supportsQuantization: Boolean = js.native
  
  /**
    * Indicates if the query operation supports quantization designed to be used in edit mode (highest resolution at the given spatial reference).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#capabilities)
    */
  var supportsQuantizationEditMode: Boolean = js.native
  
  /**
    * Indicates if the query response includes the [query geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html#queryGeometry).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#capabilities)
    */
  var supportsQueryGeometry: Boolean = js.native
  
  /**
    * Indicates if the number of features returned by the query operation can be controlled.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#capabilities)
    */
  var supportsResultType: Boolean = js.native
  
  /**
    * Indicates if the query operation supports SQL expressions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#capabilities)
    */
  var supportsSqlExpression: Boolean = js.native
  
  /**
    * Indicates if the query operation supports using standardized queries.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#capabilities)
    */
  var supportsStandardizedQueriesOnly: Boolean = js.native
  
  /**
    * Indicates if the layer supports field-based statistical functions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#capabilities)
    */
  var supportsStatistics: Boolean = js.native
}
object CSVLayerCapabilitiesQuery {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    supportsCentroid: Boolean,
    supportsDisjointSpatialRelationship: Boolean,
    supportsDistance: Boolean,
    supportsDistinct: Boolean,
    supportsExtent: Boolean,
    supportsGeometryProperties: Boolean,
    supportsHavingClause: Boolean,
    supportsHistoricMoment: Boolean,
    supportsOrderBy: Boolean,
    supportsPagination: Boolean,
    supportsPercentileStatistics: Boolean,
    supportsQuantization: Boolean,
    supportsQuantizationEditMode: Boolean,
    supportsQueryGeometry: Boolean,
    supportsResultType: Boolean,
    supportsSqlExpression: Boolean,
    supportsStandardizedQueriesOnly: Boolean,
    supportsStatistics: Boolean
  ): CSVLayerCapabilitiesQuery = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), supportsCentroid = supportsCentroid.asInstanceOf[js.Any], supportsDisjointSpatialRelationship = supportsDisjointSpatialRelationship.asInstanceOf[js.Any], supportsDistance = supportsDistance.asInstanceOf[js.Any], supportsDistinct = supportsDistinct.asInstanceOf[js.Any], supportsExtent = supportsExtent.asInstanceOf[js.Any], supportsGeometryProperties = supportsGeometryProperties.asInstanceOf[js.Any], supportsHavingClause = supportsHavingClause.asInstanceOf[js.Any], supportsHistoricMoment = supportsHistoricMoment.asInstanceOf[js.Any], supportsOrderBy = supportsOrderBy.asInstanceOf[js.Any], supportsPagination = supportsPagination.asInstanceOf[js.Any], supportsPercentileStatistics = supportsPercentileStatistics.asInstanceOf[js.Any], supportsQuantization = supportsQuantization.asInstanceOf[js.Any], supportsQuantizationEditMode = supportsQuantizationEditMode.asInstanceOf[js.Any], supportsQueryGeometry = supportsQueryGeometry.asInstanceOf[js.Any], supportsResultType = supportsResultType.asInstanceOf[js.Any], supportsSqlExpression = supportsSqlExpression.asInstanceOf[js.Any], supportsStandardizedQueriesOnly = supportsStandardizedQueriesOnly.asInstanceOf[js.Any], supportsStatistics = supportsStatistics.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSVLayerCapabilitiesQuery]
  }
  
  @scala.inline
  implicit class CSVLayerCapabilitiesQueryMutableBuilder[Self <: CSVLayerCapabilitiesQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSupportsCentroid(value: Boolean): Self = StObject.set(x, "supportsCentroid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsDisjointSpatialRelationship(value: Boolean): Self = StObject.set(x, "supportsDisjointSpatialRelationship", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsDistance(value: Boolean): Self = StObject.set(x, "supportsDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsDistinct(value: Boolean): Self = StObject.set(x, "supportsDistinct", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsExtent(value: Boolean): Self = StObject.set(x, "supportsExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsGeometryProperties(value: Boolean): Self = StObject.set(x, "supportsGeometryProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsHavingClause(value: Boolean): Self = StObject.set(x, "supportsHavingClause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsHistoricMoment(value: Boolean): Self = StObject.set(x, "supportsHistoricMoment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsOrderBy(value: Boolean): Self = StObject.set(x, "supportsOrderBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsPagination(value: Boolean): Self = StObject.set(x, "supportsPagination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsPercentileStatistics(value: Boolean): Self = StObject.set(x, "supportsPercentileStatistics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsQuantization(value: Boolean): Self = StObject.set(x, "supportsQuantization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsQuantizationEditMode(value: Boolean): Self = StObject.set(x, "supportsQuantizationEditMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsQueryGeometry(value: Boolean): Self = StObject.set(x, "supportsQueryGeometry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsResultType(value: Boolean): Self = StObject.set(x, "supportsResultType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsSqlExpression(value: Boolean): Self = StObject.set(x, "supportsSqlExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsStandardizedQueriesOnly(value: Boolean): Self = StObject.set(x, "supportsStandardizedQueriesOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsStatistics(value: Boolean): Self = StObject.set(x, "supportsStatistics", value.asInstanceOf[js.Any])
  }
}
