package typingsSlinky.reactDndMultiBackend.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactDndMultiBackend.anon.Context
import typingsSlinky.reactDndMultiBackend.mod.Backends
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DndProvider {
  
  @scala.inline
  def apply(options: Backends): Builder = {
    val __props = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[Context]))
  }
  
  @JSImport("react-dnd-multi-backend", "DndProvider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def context(value: js.Any): this.type = set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def debugMode(value: Boolean): this.type = set("debugMode", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Context): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
