package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.extent
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.mesh
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.multipoint
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.point
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.polygon
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.polyline
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeatureSetProperties extends StObject {
  
  /**
    * The name of the layer's primary display field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html#displayFieldName)
    */
  var displayFieldName: js.UndefOr[String] = js.native
  
  /**
    * Typically, a layer has a limit on the number of features (i.e., records) returned by the query operation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html#exceededTransferLimit)
    */
  var exceededTransferLimit: js.UndefOr[Boolean] = js.native
  
  /**
    * The array of graphics returned from a task.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html#features)
    */
  var features: js.UndefOr[js.Array[GraphicProperties]] = js.native
  
  /**
    * Information about each field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html#fields)
    */
  var fields: js.UndefOr[js.Array[FieldProperties]] = js.native
  
  /**
    * The geometry type of features in the FeatureSet.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html#geometryType)
    */
  var geometryType: js.UndefOr[point | multipoint | polyline | polygon | extent | mesh] = js.native
  
  /**
    * The [geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#geometry) used to query the features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html#queryGeometry)
    */
  var queryGeometry: js.UndefOr[GeometryProperties] = js.native
  
  /**
    * When a FeatureSet is used as input to Geoprocessor, the spatial reference is set to the map's spatial reference by default.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html#spatialReference)
    */
  var spatialReference: js.UndefOr[SpatialReferenceProperties] = js.native
}
object FeatureSetProperties {
  
  @scala.inline
  def apply(): FeatureSetProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeatureSetProperties]
  }
  
  @scala.inline
  implicit class FeatureSetPropertiesMutableBuilder[Self <: FeatureSetProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayFieldName(value: String): Self = StObject.set(x, "displayFieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayFieldNameUndefined: Self = StObject.set(x, "displayFieldName", js.undefined)
    
    @scala.inline
    def setExceededTransferLimit(value: Boolean): Self = StObject.set(x, "exceededTransferLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExceededTransferLimitUndefined: Self = StObject.set(x, "exceededTransferLimit", js.undefined)
    
    @scala.inline
    def setFeatures(value: js.Array[GraphicProperties]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    
    @scala.inline
    def setFeaturesVarargs(value: GraphicProperties*): Self = StObject.set(x, "features", js.Array(value :_*))
    
    @scala.inline
    def setFields(value: js.Array[FieldProperties]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setFieldsVarargs(value: FieldProperties*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    @scala.inline
    def setGeometryType(value: point | multipoint | polyline | polygon | extent | mesh): Self = StObject.set(x, "geometryType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeometryTypeUndefined: Self = StObject.set(x, "geometryType", js.undefined)
    
    @scala.inline
    def setQueryGeometry(value: GeometryProperties): Self = StObject.set(x, "queryGeometry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryGeometryUndefined: Self = StObject.set(x, "queryGeometry", js.undefined)
    
    @scala.inline
    def setSpatialReference(value: SpatialReferenceProperties): Self = StObject.set(x, "spatialReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpatialReferenceUndefined: Self = StObject.set(x, "spatialReference", js.undefined)
  }
}
