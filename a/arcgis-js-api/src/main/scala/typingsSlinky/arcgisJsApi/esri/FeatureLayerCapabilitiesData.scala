package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeatureLayerCapabilitiesData extends Object {
  
  /**
    * Indicates if the feature service is versioned.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities)
    */
  var isVersioned: Boolean = js.native
  
  /**
    * Indicates if the attachment is enabled on the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities)
    */
  var supportsAttachment: Boolean = js.native
  
  /**
    * Indicates if the features in the layer support m-values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities)
    */
  var supportsM: Boolean = js.native
  
  /**
    * Indicates if the features in the layer support z-values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities)
    */
  var supportsZ: Boolean = js.native
}
object FeatureLayerCapabilitiesData {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    isVersioned: Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    supportsAttachment: Boolean,
    supportsM: Boolean,
    supportsZ: Boolean
  ): FeatureLayerCapabilitiesData = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), isVersioned = isVersioned.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), supportsAttachment = supportsAttachment.asInstanceOf[js.Any], supportsM = supportsM.asInstanceOf[js.Any], supportsZ = supportsZ.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureLayerCapabilitiesData]
  }
  
  @scala.inline
  implicit class FeatureLayerCapabilitiesDataMutableBuilder[Self <: FeatureLayerCapabilitiesData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsVersioned(value: Boolean): Self = StObject.set(x, "isVersioned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsAttachment(value: Boolean): Self = StObject.set(x, "supportsAttachment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsM(value: Boolean): Self = StObject.set(x, "supportsM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsZ(value: Boolean): Self = StObject.set(x, "supportsZ", value.asInstanceOf[js.Any])
  }
}
