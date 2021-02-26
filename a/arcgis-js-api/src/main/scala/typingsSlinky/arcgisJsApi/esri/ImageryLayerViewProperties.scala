package typingsSlinky.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageryLayerViewProperties extends LayerViewProperties {
  
  /**
    * An object that provides the user access to [pixels](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-PixelBlock.html#pixels) and their values in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-ImageryLayerView.html#pixelData)
    */
  var pixelData: js.UndefOr[PixelData] = js.native
}
object ImageryLayerViewProperties {
  
  @scala.inline
  def apply(): ImageryLayerViewProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageryLayerViewProperties]
  }
  
  @scala.inline
  implicit class ImageryLayerViewPropertiesMutableBuilder[Self <: ImageryLayerViewProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPixelData(value: PixelData): Self = StObject.set(x, "pixelData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixelDataUndefined: Self = StObject.set(x, "pixelData", js.undefined)
  }
}
