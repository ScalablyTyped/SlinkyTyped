package typingsSlinky.ol.imageStaticMod

import typingsSlinky.ol.extentMod.Extent
import typingsSlinky.ol.olImageMod.ImageWrapper
import typingsSlinky.ol.olImageMod.LoadFunction
import typingsSlinky.ol.pluggableMapMod.FrameState
import typingsSlinky.ol.projMod.ProjectionLike
import typingsSlinky.ol.sizeMod.Size
import typingsSlinky.ol.sourceSourceMod.AttributionLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var attributions: js.UndefOr[AttributionLike] = js.native
  
  var crossOrigin: js.UndefOr[String] = js.native
  
  var imageExtent: js.UndefOr[Extent] = js.native
  
  var imageLoadFunction: js.UndefOr[LoadFunction] = js.native
  
  var imageSize: js.UndefOr[Size] = js.native
  
  var projection: js.UndefOr[ProjectionLike] = js.native
  
  var url: String = js.native
}
object Options {
  
  @scala.inline
  def apply(url: String): Options = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributionsVarargs(value: String*): Self = this.set("attributions", js.Array(value :_*))
    
    @scala.inline
    def setAttributionsFunction1(value: /* p0 */ FrameState => String | js.Array[String]): Self = this.set("attributions", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAttributions(value: AttributionLike): Self = this.set("attributions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributions: Self = this.set("attributions", js.undefined)
    
    @scala.inline
    def setCrossOrigin(value: String): Self = this.set("crossOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrossOrigin: Self = this.set("crossOrigin", js.undefined)
    
    @scala.inline
    def setImageExtent(value: Extent): Self = this.set("imageExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageExtent: Self = this.set("imageExtent", js.undefined)
    
    @scala.inline
    def setImageLoadFunction(value: (/* p0 */ ImageWrapper, /* p1 */ String) => Unit): Self = this.set("imageLoadFunction", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteImageLoadFunction: Self = this.set("imageLoadFunction", js.undefined)
    
    @scala.inline
    def setImageSize(value: Size): Self = this.set("imageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageSize: Self = this.set("imageSize", js.undefined)
    
    @scala.inline
    def setProjection(value: ProjectionLike): Self = this.set("projection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjection: Self = this.set("projection", js.undefined)
  }
}
