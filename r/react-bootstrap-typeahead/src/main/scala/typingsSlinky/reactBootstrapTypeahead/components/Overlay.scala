package typingsSlinky.reactBootstrapTypeahead.components

import org.scalajs.dom.raw.HTMLElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactBootstrapTypeahead.mod.OverlayProps
import typingsSlinky.reactBootstrapTypeahead.mod.TypeaheadAlign
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Overlay {
  
  @scala.inline
  def apply(container: HTMLElement): Builder = {
    val __props = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[OverlayProps]))
  }
  
  @JSImport("react-bootstrap-typeahead", "Overlay")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactBootstrapTypeahead.mod.Overlay] {
    
    @scala.inline
    def align(value: TypeaheadAlign): this.type = set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dropup(value: Boolean): this.type = set("dropup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def flip(value: Boolean): this.type = set("flip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onMenuHide(value: () => Unit): this.type = set("onMenuHide", js.Any.fromFunction0(value))
    
    @scala.inline
    def onMenuShow(value: () => Unit): this.type = set("onMenuShow", js.Any.fromFunction0(value))
    
    @scala.inline
    def onMenuToggle(value: /* show */ Boolean => Unit): this.type = set("onMenuToggle", js.Any.fromFunction1(value))
    
    @scala.inline
    def referenceElement(value: HTMLElement): this.type = set("referenceElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def show(value: Boolean): this.type = set("show", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: OverlayProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
