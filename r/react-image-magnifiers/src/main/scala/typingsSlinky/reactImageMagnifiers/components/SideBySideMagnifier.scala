package typingsSlinky.reactImageMagnifiers.components

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactImageMagnifiers.mod.SideBySideMagnifierProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SideBySideMagnifier {
  
  @JSImport("react-image-magnifiers", "SideBySideMagnifier")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def alwaysInPlace(value: Boolean): this.type = set("alwaysInPlace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def cursorStyle(value: String): this.type = set("cursorStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fillAlignTop(value: Boolean): this.type = set("fillAlignTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fillAvailableSpace(value: Boolean): this.type = set("fillAvailableSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fillGapBottom(value: Double): this.type = set("fillGapBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fillGapLeft(value: Double): this.type = set("fillGapLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fillGapRight(value: Double): this.type = set("fillGapRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fillGapTop(value: Double): this.type = set("fillGapTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def imageAlt(value: String): this.type = set("imageAlt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def inPlaceMinBreakpoint(value: Double): this.type = set("inPlaceMinBreakpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def largeImageSrc(value: String): this.type = set("largeImageSrc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onImageLoad(value: /* ev */ SyntheticEvent[Event, Element] => Unit): this.type = set("onImageLoad", js.Any.fromFunction1(value))
    
    @scala.inline
    def onLargeImageLoad(value: /* ev */ SyntheticEvent[Event, Element] => Unit): this.type = set("onLargeImageLoad", js.Any.fromFunction1(value))
    
    @scala.inline
    def onZoomEnd(value: () => Unit): this.type = set("onZoomEnd", js.Any.fromFunction0(value))
    
    @scala.inline
    def onZoomStart(value: () => Unit): this.type = set("onZoomStart", js.Any.fromFunction0(value))
    
    @scala.inline
    def overlayBackgroundColor(value: String): this.type = set("overlayBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def overlayBoxColor(value: String): this.type = set("overlayBoxColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def overlayBoxImage(value: String): this.type = set("overlayBoxImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def overlayBoxImageSize(value: String): this.type = set("overlayBoxImageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def overlayBoxOpacity(value: Double): this.type = set("overlayBoxOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def overlayOpacity(value: Double): this.type = set("overlayOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def renderOverlay(value: /* state */ Boolean => ReactElement): this.type = set("renderOverlay", js.Any.fromFunction1(value))
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def switchSides(value: Boolean): this.type = set("switchSides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def transitionSpeed(value: Double): this.type = set("transitionSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def transitionSpeedInPlace(value: Double): this.type = set("transitionSpeedInPlace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def zoomContainerBorder(value: String): this.type = set("zoomContainerBorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def zoomContainerBoxShadow(value: String): this.type = set("zoomContainerBoxShadow", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SideBySideMagnifierProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(imageSrc: String): Builder = {
    val __props = js.Dynamic.literal(imageSrc = imageSrc.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[SideBySideMagnifierProps]))
  }
}
