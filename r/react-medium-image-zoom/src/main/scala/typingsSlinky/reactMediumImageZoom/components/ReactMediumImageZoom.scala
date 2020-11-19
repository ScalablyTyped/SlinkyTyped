package typingsSlinky.reactMediumImageZoom.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactMediumImageZoom.mod.ImageZoomDefaultStyles
import typingsSlinky.reactMediumImageZoom.mod.ImageZoomImage
import typingsSlinky.reactMediumImageZoom.mod.ImageZoomProps
import typingsSlinky.reactMediumImageZoom.mod.ImageZoomZoomImage
import typingsSlinky.reactMediumImageZoom.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactMediumImageZoom {
  
  @JSImport("react-medium-image-zoom", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def defaultStyles(value: ImageZoomDefaultStyles): this.type = set("defaultStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isZoomed(value: Boolean): this.type = set("isZoomed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onUnzoom(value: () => js.Object): this.type = set("onUnzoom", js.Any.fromFunction0(value))
    
    @scala.inline
    def onZoom(value: () => js.Object): this.type = set("onZoom", js.Any.fromFunction0(value))
    
    @scala.inline
    def shouldHandleZoom(value: () => Boolean): this.type = set("shouldHandleZoom", js.Any.fromFunction0(value))
    
    @scala.inline
    def shouldReplaceImage(value: Boolean): this.type = set("shouldReplaceImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def shouldRespectMaxDimension(value: Boolean): this.type = set("shouldRespectMaxDimension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def zoomImage(value: ImageZoomZoomImage): this.type = set("zoomImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def zoomMargin(value: Double): this.type = set("zoomMargin", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ImageZoomProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(image: ImageZoomImage): Builder = {
    val __props = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ImageZoomProps]))
  }
}
