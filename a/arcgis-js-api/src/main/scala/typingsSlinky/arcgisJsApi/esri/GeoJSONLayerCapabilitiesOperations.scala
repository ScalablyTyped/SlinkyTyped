package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeoJSONLayerCapabilitiesOperations extends Object {
  
  /**
    * Indicates if new features can be [added](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#applyEdits) to the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#capabilities)
    */
  var supportsAdd: Boolean = js.native
  
  /**
    * Indicates if values of one or more field values in the layer can be updated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#capabilities)
    */
  var supportsCalculate: Boolean = js.native
  
  /**
    * Indicates if features can be [deleted](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#applyEdits) from the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#capabilities)
    */
  var supportsDelete: Boolean = js.native
  
  /**
    * Indicates if features in the layer can be [edited](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#applyEdits).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#capabilities)
    */
  var supportsEditing: Boolean = js.native
  
  /**
    * Indicates if features in the layer can be [queried](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#queryFeatures).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#capabilities)
    */
  var supportsQuery: Boolean = js.native
  
  /**
    * Indicates if the layer supports [REST API queryAttachments](https://developers.arcgis.com/rest/services-reference/query-attachments-feature-service-layer-.htm) operation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#capabilities)
    */
  var supportsQueryAttachments: Boolean = js.native
  
  /**
    * Indicates if resized attachments are supported in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#capabilities)
    */
  var supportsResizeAttachments: Boolean = js.native
  
  /**
    * Indicates if features in the layer can be [updated](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#applyEdits).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#capabilities)
    */
  var supportsUpdate: Boolean = js.native
  
  /**
    * Indicates if the layer supports a SQL-92 expression or where clause.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#capabilities)
    */
  var supportsValidateSql: Boolean = js.native
}
object GeoJSONLayerCapabilitiesOperations {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    supportsAdd: Boolean,
    supportsCalculate: Boolean,
    supportsDelete: Boolean,
    supportsEditing: Boolean,
    supportsQuery: Boolean,
    supportsQueryAttachments: Boolean,
    supportsResizeAttachments: Boolean,
    supportsUpdate: Boolean,
    supportsValidateSql: Boolean
  ): GeoJSONLayerCapabilitiesOperations = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), supportsAdd = supportsAdd.asInstanceOf[js.Any], supportsCalculate = supportsCalculate.asInstanceOf[js.Any], supportsDelete = supportsDelete.asInstanceOf[js.Any], supportsEditing = supportsEditing.asInstanceOf[js.Any], supportsQuery = supportsQuery.asInstanceOf[js.Any], supportsQueryAttachments = supportsQueryAttachments.asInstanceOf[js.Any], supportsResizeAttachments = supportsResizeAttachments.asInstanceOf[js.Any], supportsUpdate = supportsUpdate.asInstanceOf[js.Any], supportsValidateSql = supportsValidateSql.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoJSONLayerCapabilitiesOperations]
  }
  
  @scala.inline
  implicit class GeoJSONLayerCapabilitiesOperationsOps[Self <: GeoJSONLayerCapabilitiesOperations] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSupportsAdd(value: Boolean): Self = this.set("supportsAdd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsCalculate(value: Boolean): Self = this.set("supportsCalculate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsDelete(value: Boolean): Self = this.set("supportsDelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsEditing(value: Boolean): Self = this.set("supportsEditing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsQuery(value: Boolean): Self = this.set("supportsQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsQueryAttachments(value: Boolean): Self = this.set("supportsQueryAttachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsResizeAttachments(value: Boolean): Self = this.set("supportsResizeAttachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsUpdate(value: Boolean): Self = this.set("supportsUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsValidateSql(value: Boolean): Self = this.set("supportsValidateSql", value.asInstanceOf[js.Any])
  }
}
