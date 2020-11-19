package typingsSlinky.baseui.components

import org.scalajs.dom.raw.HTMLElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.baseui.layerMod.LayerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Layer {
  
  @JSImport("baseui/layer", "Layer")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def host(value: HTMLElement): this.type = set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def index(value: Double): this.type = set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def mountNode(value: HTMLElement): this.type = set("mountNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onMount(value: () => _): this.type = set("onMount", js.Any.fromFunction0(value))
    
    @scala.inline
    def onUnmount(value: () => _): this.type = set("onUnmount", js.Any.fromFunction0(value))
  }
  
  def withProps(p: LayerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Layer.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
