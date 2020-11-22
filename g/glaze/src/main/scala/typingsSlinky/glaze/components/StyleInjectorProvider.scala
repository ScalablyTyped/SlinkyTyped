package typingsSlinky.glaze.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.glaze.styleInjectorContextMod.StyleInjectorProviderProps
import typingsSlinky.glaze.styleInjectorMod.StyleInjector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StyleInjectorProvider {
  
  @JSImport("glaze", "StyleInjectorProvider")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def injector(value: StyleInjector): this.type = set("injector", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: StyleInjectorProviderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: StyleInjectorProvider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
