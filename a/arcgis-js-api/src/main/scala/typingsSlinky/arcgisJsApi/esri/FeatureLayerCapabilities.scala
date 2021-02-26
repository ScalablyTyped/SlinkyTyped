package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeatureLayerCapabilities extends Object {
  
  /**
    * Describes what attachment capabilities are enabled on the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities)
    */
  var attachment: FeatureLayerCapabilitiesAttachment = js.native
  
  /**
    * Describes characteristics of the data in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities)
    */
  var data: FeatureLayerCapabilitiesData = js.native
  
  /**
    * Describes editing capabilities that can be performed on the features in the layer via [applyEdits()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#applyEdits).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities)
    */
  var editing: FeatureLayerCapabilitiesEditing = js.native
  
  /**
    * Describes the metadata contained on features in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities)
    */
  var metadata: FeatureLayerCapabilitiesMetadata = js.native
  
  /**
    * Describes operations that can be performed on features in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities)
    */
  var operations: FeatureLayerCapabilitiesOperations = js.native
  
  /**
    * Describes [query](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html) operations that can be performed on features in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities)
    */
  var query: FeatureLayerCapabilitiesQuery = js.native
  
  /**
    * Indicates if the layer's query operation supports querying features or records related to features in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities)
    */
  var queryRelated: FeatureLayerCapabilitiesQueryRelated = js.native
}
object FeatureLayerCapabilities {
  
  @scala.inline
  def apply(
    attachment: FeatureLayerCapabilitiesAttachment,
    constructor: js.Function,
    data: FeatureLayerCapabilitiesData,
    editing: FeatureLayerCapabilitiesEditing,
    hasOwnProperty: PropertyKey => Boolean,
    metadata: FeatureLayerCapabilitiesMetadata,
    operations: FeatureLayerCapabilitiesOperations,
    propertyIsEnumerable: PropertyKey => Boolean,
    query: FeatureLayerCapabilitiesQuery,
    queryRelated: FeatureLayerCapabilitiesQueryRelated
  ): FeatureLayerCapabilities = {
    val __obj = js.Dynamic.literal(attachment = attachment.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], editing = editing.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), metadata = metadata.asInstanceOf[js.Any], operations = operations.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), query = query.asInstanceOf[js.Any], queryRelated = queryRelated.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureLayerCapabilities]
  }
  
  @scala.inline
  implicit class FeatureLayerCapabilitiesMutableBuilder[Self <: FeatureLayerCapabilities] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachment(value: FeatureLayerCapabilitiesAttachment): Self = StObject.set(x, "attachment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: FeatureLayerCapabilitiesData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditing(value: FeatureLayerCapabilitiesEditing): Self = StObject.set(x, "editing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: FeatureLayerCapabilitiesMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperations(value: FeatureLayerCapabilitiesOperations): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery(value: FeatureLayerCapabilitiesQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryRelated(value: FeatureLayerCapabilitiesQueryRelated): Self = StObject.set(x, "queryRelated", value.asInstanceOf[js.Any])
  }
}
