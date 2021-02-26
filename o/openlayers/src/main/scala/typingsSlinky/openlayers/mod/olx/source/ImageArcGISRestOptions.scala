package typingsSlinky.openlayers.mod.olx.source

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.openlayers.mod.Attribution
import typingsSlinky.openlayers.mod.Image
import typingsSlinky.openlayers.mod.ImageLoadFunctionType
import typingsSlinky.openlayers.mod.ProjectionLike
import typingsSlinky.openlayers.mod.olx.LogoOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageArcGISRestOptions extends StObject {
  
  var attributions: js.UndefOr[js.Array[Attribution]] = js.native
  
  var crossOrigin: js.UndefOr[String] = js.native
  
  var hidpi: js.UndefOr[Boolean] = js.native
  
  var imageLoadFunction: js.UndefOr[ImageLoadFunctionType] = js.native
  
  var logo: js.UndefOr[String | LogoOptions] = js.native
  
  var params: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  var projection: ProjectionLike = js.native
  
  var ratio: js.UndefOr[Double] = js.native
  
  var resolutions: js.UndefOr[js.Array[Double]] = js.native
  
  var url: js.UndefOr[String] = js.native
}
object ImageArcGISRestOptions {
  
  @scala.inline
  def apply(): ImageArcGISRestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageArcGISRestOptions]
  }
  
  @scala.inline
  implicit class ImageArcGISRestOptionsMutableBuilder[Self <: ImageArcGISRestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributions(value: js.Array[Attribution]): Self = StObject.set(x, "attributions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributionsUndefined: Self = StObject.set(x, "attributions", js.undefined)
    
    @scala.inline
    def setAttributionsVarargs(value: Attribution*): Self = StObject.set(x, "attributions", js.Array(value :_*))
    
    @scala.inline
    def setCrossOrigin(value: String): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
    
    @scala.inline
    def setHidpi(value: Boolean): Self = StObject.set(x, "hidpi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHidpiUndefined: Self = StObject.set(x, "hidpi", js.undefined)
    
    @scala.inline
    def setImageLoadFunction(value: (/* image */ Image, /* url */ String) => Unit): Self = StObject.set(x, "imageLoadFunction", js.Any.fromFunction2(value))
    
    @scala.inline
    def setImageLoadFunctionUndefined: Self = StObject.set(x, "imageLoadFunction", js.undefined)
    
    @scala.inline
    def setLogo(value: String | LogoOptions): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogoUndefined: Self = StObject.set(x, "logo", js.undefined)
    
    @scala.inline
    def setParams(value: StringDictionary[js.Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    @scala.inline
    def setProjection(value: ProjectionLike): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
    
    @scala.inline
    def setRatio(value: Double): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRatioUndefined: Self = StObject.set(x, "ratio", js.undefined)
    
    @scala.inline
    def setResolutions(value: js.Array[Double]): Self = StObject.set(x, "resolutions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolutionsUndefined: Self = StObject.set(x, "resolutions", js.undefined)
    
    @scala.inline
    def setResolutionsVarargs(value: Double*): Self = StObject.set(x, "resolutions", js.Array(value :_*))
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
