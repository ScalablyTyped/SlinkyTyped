package typingsSlinky.reactImageMagnifiers.components

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactImageMagnifiers.mod.GlassMagnifierProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GlassMagnifier {
  
  @scala.inline
  def apply(imageSrc: String): Builder = {
    val __props = js.Dynamic.literal(imageSrc = imageSrc.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[GlassMagnifierProps]))
  }
  
  @JSImport("react-image-magnifiers", "GlassMagnifier")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def allowOverflow(value: Boolean): this.type = set("allowOverflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def cursorStyle(value: String): this.type = set("cursorStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def imageAlt(value: String): this.type = set("imageAlt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def largeImageSrc(value: String): this.type = set("largeImageSrc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def magnifierBackgroundColor(value: String): this.type = set("magnifierBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def magnifierBorderColor(value: String): this.type = set("magnifierBorderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def magnifierBorderSize(value: Double): this.type = set("magnifierBorderSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def magnifierOffsetX(value: Double): this.type = set("magnifierOffsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def magnifierOffsetY(value: Double): this.type = set("magnifierOffsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def magnifierSize(value: String | Double): this.type = set("magnifierSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onImageLoad(value: /* ev */ SyntheticEvent[Event, Element] => Unit): this.type = set("onImageLoad", js.Any.fromFunction1(value))
    
    @scala.inline
    def onLargeImageLoad(value: /* ev */ SyntheticEvent[Event, Element] => Unit): this.type = set("onLargeImageLoad", js.Any.fromFunction1(value))
    
    @scala.inline
    def onZoomEnd(value: () => Unit): this.type = set("onZoomEnd", js.Any.fromFunction0(value))
    
    @scala.inline
    def onZoomStart(value: () => Unit): this.type = set("onZoomStart", js.Any.fromFunction0(value))
    
    @scala.inline
    def renderOverlay(value: /* state */ Boolean => ReactElement): this.type = set("renderOverlay", js.Any.fromFunction1(value))
    
    @scala.inline
    def square(value: Boolean): this.type = set("square", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: GlassMagnifierProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
