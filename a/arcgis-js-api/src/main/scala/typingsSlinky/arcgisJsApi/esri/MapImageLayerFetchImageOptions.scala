package typingsSlinky.arcgisJsApi.esri

import org.scalajs.dom.experimental.AbortSignal
import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapImageLayerFetchImageOptions extends Object {
  
  /**
    * The ratio of the resolution in physical pixels of the image to the resolution it will be displayed at.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html#fetchImage)
    */
  var pixelRatio: js.UndefOr[Double] = js.native
  
  /**
    * The rotation in degrees of the exported image.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html#fetchImage)
    */
  var rotation: js.UndefOr[Double] = js.native
  
  /**
    * An [AbortSignal](https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal) to abort the request.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html#fetchImage)
    */
  var signal: js.UndefOr[AbortSignal] = js.native
  
  /**
    * The time instant or time extent of content to render.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html#fetchImage)
    */
  var timeExtent: js.UndefOr[js.Any] = js.native
}
object MapImageLayerFetchImageOptions {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): MapImageLayerFetchImageOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[MapImageLayerFetchImageOptions]
  }
  
  @scala.inline
  implicit class MapImageLayerFetchImageOptionsMutableBuilder[Self <: MapImageLayerFetchImageOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixelRatioUndefined: Self = StObject.set(x, "pixelRatio", js.undefined)
    
    @scala.inline
    def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    @scala.inline
    def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    
    @scala.inline
    def setTimeExtent(value: js.Any): Self = StObject.set(x, "timeExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeExtentUndefined: Self = StObject.set(x, "timeExtent", js.undefined)
  }
}
