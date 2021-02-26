package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.bmp
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.gif
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.jpg
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.png
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapImageProperties extends StObject {
  
  /**
    * The extent of the exported map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MapImage.html#extent)
    */
  var extent: js.UndefOr[ExtentProperties] = js.native
  
  /**
    * The requested image height in pixels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MapImage.html#height)
    */
  var height: js.UndefOr[Double] = js.native
  
  /**
    * URL to the returned image.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MapImage.html#href)
    */
  var href: js.UndefOr[gif | jpg | png | bmp] = js.native
  
  /**
    * The opacity of the image.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MapImage.html#opacity)
    */
  var opacity: js.UndefOr[Double] = js.native
  
  /**
    * Scale of the requested dynamic map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MapImage.html#scale)
    */
  var scale: js.UndefOr[Double] = js.native
  
  /**
    * Indicates if the requested image is visible in the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MapImage.html#visible)
    */
  var visible: js.UndefOr[Boolean] = js.native
  
  /**
    * The requested image width in pixels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MapImage.html#width)
    */
  var width: js.UndefOr[Double] = js.native
}
object MapImageProperties {
  
  @scala.inline
  def apply(): MapImageProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapImageProperties]
  }
  
  @scala.inline
  implicit class MapImagePropertiesMutableBuilder[Self <: MapImageProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtent(value: ExtentProperties): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setHref(value: gif | jpg | png | bmp): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
