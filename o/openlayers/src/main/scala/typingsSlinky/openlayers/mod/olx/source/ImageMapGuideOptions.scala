package typingsSlinky.openlayers.mod.olx.source

import typingsSlinky.openlayers.mod.GlobalObject
import typingsSlinky.openlayers.mod.Image
import typingsSlinky.openlayers.mod.ImageLoadFunctionType
import typingsSlinky.openlayers.mod.ProjectionLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageMapGuideOptions extends StObject {
  
  var displayDpi: js.UndefOr[Double] = js.native
  
  var hidpi: js.UndefOr[Boolean] = js.native
  
  var imageLoadFunction: js.UndefOr[ImageLoadFunctionType] = js.native
  
  var metersPerUnit: js.UndefOr[Double] = js.native
  
  var params: js.UndefOr[GlobalObject] = js.native
  
  var projection: ProjectionLike = js.native
  
  var ratio: js.UndefOr[Double] = js.native
  
  var resolutions: js.UndefOr[js.Array[Double]] = js.native
  
  var url: js.UndefOr[String] = js.native
  
  var useOverlay: js.UndefOr[Boolean] = js.native
}
object ImageMapGuideOptions {
  
  @scala.inline
  def apply(): ImageMapGuideOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageMapGuideOptions]
  }
  
  @scala.inline
  implicit class ImageMapGuideOptionsMutableBuilder[Self <: ImageMapGuideOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayDpi(value: Double): Self = StObject.set(x, "displayDpi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayDpiUndefined: Self = StObject.set(x, "displayDpi", js.undefined)
    
    @scala.inline
    def setHidpi(value: Boolean): Self = StObject.set(x, "hidpi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHidpiUndefined: Self = StObject.set(x, "hidpi", js.undefined)
    
    @scala.inline
    def setImageLoadFunction(value: (/* image */ Image, /* url */ String) => Unit): Self = StObject.set(x, "imageLoadFunction", js.Any.fromFunction2(value))
    
    @scala.inline
    def setImageLoadFunctionUndefined: Self = StObject.set(x, "imageLoadFunction", js.undefined)
    
    @scala.inline
    def setMetersPerUnit(value: Double): Self = StObject.set(x, "metersPerUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetersPerUnitUndefined: Self = StObject.set(x, "metersPerUnit", js.undefined)
    
    @scala.inline
    def setParams(value: GlobalObject): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
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
    
    @scala.inline
    def setUseOverlay(value: Boolean): Self = StObject.set(x, "useOverlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseOverlayUndefined: Self = StObject.set(x, "useOverlay", js.undefined)
  }
}
