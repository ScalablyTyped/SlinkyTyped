package typingsSlinky.arcgisJsApi.esri

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.ImageData
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.clamp
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.mirror
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.repeat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MeshTextureProperties extends StObject {
  
  /**
    * A direct reference to the image or video data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshTexture.html#data)
    */
  var data: js.UndefOr[HTMLImageElement | HTMLCanvasElement | js.Any | ImageData] = js.native
  
  /**
    * Indicates whether the image data should be interpreted as being semi-transparent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshTexture.html#transparent)
    */
  var transparent: js.UndefOr[Boolean] = js.native
  
  /**
    * The url to the image resource.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshTexture.html#url)
    */
  var url: js.UndefOr[String] = js.native
  
  /**
    * Specifies how uv coordinates outside the [0, 1] range are handled.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshTexture.html#wrap)
    */
  var wrap: js.UndefOr[clamp | repeat | mirror | SeparableWrapModes] = js.native
}
object MeshTextureProperties {
  
  @scala.inline
  def apply(): MeshTextureProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeshTextureProperties]
  }
  
  @scala.inline
  implicit class MeshTexturePropertiesMutableBuilder[Self <: MeshTextureProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: HTMLImageElement | HTMLCanvasElement | js.Any | ImageData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataHTMLCanvasElement(value: HTMLCanvasElement): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataHTMLImageElement(value: HTMLImageElement): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataImageData(value: ImageData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setTransparent(value: Boolean): Self = StObject.set(x, "transparent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransparentUndefined: Self = StObject.set(x, "transparent", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    @scala.inline
    def setWrap(value: clamp | repeat | mirror | SeparableWrapModes): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
  }
}
