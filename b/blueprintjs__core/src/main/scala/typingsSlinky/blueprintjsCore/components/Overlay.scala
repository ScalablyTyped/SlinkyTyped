package typingsSlinky.blueprintjsCore.components

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import slinky.core.SyntheticEvent
import slinky.web.html.div.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.blueprintjsCore.overlayMod.IOverlayProps
import typingsSlinky.react.mod.HTMLProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Overlay {
  
  @JSImport("@blueprintjs/core", "Overlay")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.blueprintjsCore.mod.Overlay] {
    
    @scala.inline
    def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def backdropClassName(value: String): this.type = set("backdropClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def backdropProps(value: HTMLProps[HTMLDivElement]): this.type = set("backdropProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def canEscapeKeyClose(value: Boolean): this.type = set("canEscapeKeyClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def canOutsideClickClose(value: Boolean): this.type = set("canOutsideClickClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def enforceFocus(value: Boolean): this.type = set("enforceFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hasBackdrop(value: Boolean): this.type = set("hasBackdrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `lazy`(value: Boolean): this.type = set("lazy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onClose(value: /* event */ js.UndefOr[SyntheticEvent[Event, HTMLElement]] => Unit): this.type = set("onClose", js.Any.fromFunction1(value))
    
    @scala.inline
    def onClosed(value: /* node */ HTMLElement => Unit): this.type = set("onClosed", js.Any.fromFunction1(value))
    
    @scala.inline
    def onClosing(value: /* node */ HTMLElement => Unit): this.type = set("onClosing", js.Any.fromFunction1(value))
    
    @scala.inline
    def onOpened(value: /* node */ HTMLElement => Unit): this.type = set("onOpened", js.Any.fromFunction1(value))
    
    @scala.inline
    def onOpening(value: /* node */ HTMLElement => Unit): this.type = set("onOpening", js.Any.fromFunction1(value))
    
    @scala.inline
    def portalClassName(value: String): this.type = set("portalClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def portalContainer(value: HTMLElement): this.type = set("portalContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def transitionDuration(value: Double): this.type = set("transitionDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def transitionName(value: String): this.type = set("transitionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def usePortal(value: Boolean): this.type = set("usePortal", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IOverlayProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(isOpen: Boolean): Builder = {
    val __props = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IOverlayProps]))
  }
}
