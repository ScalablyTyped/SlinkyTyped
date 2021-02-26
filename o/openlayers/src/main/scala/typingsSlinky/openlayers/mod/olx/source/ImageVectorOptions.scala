package typingsSlinky.openlayers.mod.olx.source

import typingsSlinky.openlayers.mod.Attribution
import typingsSlinky.openlayers.mod.AttributionLike
import typingsSlinky.openlayers.mod.Feature
import typingsSlinky.openlayers.mod.ProjectionLike
import typingsSlinky.openlayers.mod.StyleFunction
import typingsSlinky.openlayers.mod.olx.LogoOptions
import typingsSlinky.openlayers.mod.source.Vector
import typingsSlinky.openlayers.mod.style.Style
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageVectorOptions extends StObject {
  
  var attributions: js.UndefOr[AttributionLike] = js.native
  
  var logo: js.UndefOr[String | LogoOptions] = js.native
  
  var projection: ProjectionLike = js.native
  
  var ratio: js.UndefOr[Double] = js.native
  
  var renderBuffer: js.UndefOr[Double] = js.native
  
  var resolutions: js.UndefOr[js.Array[Double]] = js.native
  
  var source: Vector = js.native
  
  var style: js.UndefOr[Style | js.Array[Style] | StyleFunction] = js.native
}
object ImageVectorOptions {
  
  @scala.inline
  def apply(source: Vector): ImageVectorOptions = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageVectorOptions]
  }
  
  @scala.inline
  implicit class ImageVectorOptionsMutableBuilder[Self <: ImageVectorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributions(value: AttributionLike): Self = StObject.set(x, "attributions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributionsUndefined: Self = StObject.set(x, "attributions", js.undefined)
    
    @scala.inline
    def setAttributionsVarargs(value: (Attribution | String)*): Self = StObject.set(x, "attributions", js.Array(value :_*))
    
    @scala.inline
    def setLogo(value: String | LogoOptions): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogoUndefined: Self = StObject.set(x, "logo", js.undefined)
    
    @scala.inline
    def setProjection(value: ProjectionLike): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
    
    @scala.inline
    def setRatio(value: Double): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRatioUndefined: Self = StObject.set(x, "ratio", js.undefined)
    
    @scala.inline
    def setRenderBuffer(value: Double): Self = StObject.set(x, "renderBuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderBufferUndefined: Self = StObject.set(x, "renderBuffer", js.undefined)
    
    @scala.inline
    def setResolutions(value: js.Array[Double]): Self = StObject.set(x, "resolutions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolutionsUndefined: Self = StObject.set(x, "resolutions", js.undefined)
    
    @scala.inline
    def setResolutionsVarargs(value: Double*): Self = StObject.set(x, "resolutions", js.Array(value :_*))
    
    @scala.inline
    def setSource(value: Vector): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: Style | js.Array[Style] | StyleFunction): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleFunction2(
      value: (/* feature */ Feature | typingsSlinky.openlayers.mod.render.Feature, /* resolution */ Double) => Style | js.Array[Style] | Null
    ): Self = StObject.set(x, "style", js.Any.fromFunction2(value))
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setStyleVarargs(value: Style*): Self = StObject.set(x, "style", js.Array(value :_*))
  }
}
