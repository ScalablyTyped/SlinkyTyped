package typingsSlinky.reactBootstrap.components

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.ReactInstance
import typingsSlinky.reactBootstrap.overlayMod.OverlayProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Overlay {
  
  @JSImport("react-bootstrap", "Overlay")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactBootstrap.mod.Overlay] {
    
    @scala.inline
    def animation(value: js.Any): this.type = set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def container(value: js.Any): this.type = set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def containerPadding(value: Double): this.type = set("containerPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onEnter(value: /* node */ HTMLElement => _): this.type = set("onEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def onEntered(value: /* node */ HTMLElement => _): this.type = set("onEntered", js.Any.fromFunction1(value))
    
    @scala.inline
    def onEntering(value: /* node */ HTMLElement => _): this.type = set("onEntering", js.Any.fromFunction1(value))
    
    @scala.inline
    def onExit(value: /* node */ HTMLElement => _): this.type = set("onExit", js.Any.fromFunction1(value))
    
    @scala.inline
    def onExited(value: /* node */ HTMLElement => _): this.type = set("onExited", js.Any.fromFunction1(value))
    
    @scala.inline
    def onExiting(value: /* node */ HTMLElement => _): this.type = set("onExiting", js.Any.fromFunction1(value))
    
    @scala.inline
    def onHide(value: js.Function): this.type = set("onHide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def placement(value: String): this.type = set("placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rootClose(value: Boolean): this.type = set("rootClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def shouldUpdatePosition(value: Boolean): this.type = set("shouldUpdatePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def show(value: Boolean): this.type = set("show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def targetElement(value: Element): this.type = set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def targetComponent(value: ReactComponentClass[js.Any]): this.type = set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def target(value: js.Function | ReactInstance): this.type = set("target", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: OverlayProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Overlay.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
