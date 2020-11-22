package typingsSlinky.gestalt.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.gestalt.mod.Indexable
import typingsSlinky.gestalt.mod.LayerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Layer {
  
  @JSImport("gestalt", "Layer")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.gestalt.mod.Layer] {
    
    @scala.inline
    def zIndex(value: Indexable): this.type = set("zIndex", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: LayerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Layer.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
