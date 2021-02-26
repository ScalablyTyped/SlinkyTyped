package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PixelData extends Object {
  
  /**
    * The extent of the `pixelBlock`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html#PixelData)
    */
  var extent: Extent = js.native
  
  /**
    * An object representing the pixels in the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html#PixelData)
    */
  var pixelBlock: PixelBlock = js.native
}
object PixelData {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    extent: Extent,
    hasOwnProperty: PropertyKey => Boolean,
    pixelBlock: PixelBlock,
    propertyIsEnumerable: PropertyKey => Boolean
  ): PixelData = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], extent = extent.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), pixelBlock = pixelBlock.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[PixelData]
  }
  
  @scala.inline
  implicit class PixelDataMutableBuilder[Self <: PixelData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtent(value: Extent): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixelBlock(value: PixelBlock): Self = StObject.set(x, "pixelBlock", value.asInstanceOf[js.Any])
  }
}
