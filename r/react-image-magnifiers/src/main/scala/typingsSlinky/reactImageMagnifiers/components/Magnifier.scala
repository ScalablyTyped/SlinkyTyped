package typingsSlinky.reactImageMagnifiers.components

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactImageMagnifiers.anon.ClickMoveLimit
import typingsSlinky.reactImageMagnifiers.mod.MagnifierProps
import typingsSlinky.reactImageMagnifiers.mod.MouseActivation
import typingsSlinky.reactImageMagnifiers.mod.TouchActivation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Magnifier {
  
  @JSImport("react-image-magnifiers", "Magnifier")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def cursorStyle(value: String): this.type = set("cursorStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def cursorStyleActive(value: String): this.type = set("cursorStyleActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dragToMove(value: Boolean): this.type = set("dragToMove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def imageAlt(value: String): this.type = set("imageAlt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def interactionSettings(value: ClickMoveLimit): this.type = set("interactionSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def largeImageSrc(value: String): this.type = set("largeImageSrc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def mouseActivation(value: MouseActivation): this.type = set("mouseActivation", value.asInstanceOf[js.Any])
    
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
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def touchActivation(value: TouchActivation): this.type = set("touchActivation", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: MagnifierProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(imageSrc: String): Builder = {
    val __props = js.Dynamic.literal(imageSrc = imageSrc.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[MagnifierProps]))
  }
}
