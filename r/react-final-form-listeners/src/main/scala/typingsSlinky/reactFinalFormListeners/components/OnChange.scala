package typingsSlinky.reactFinalFormListeners.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactFinalFormListeners.mod.OnChangeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object OnChange {
  
  @JSImport("react-final-form-listeners", "OnChange")
  @js.native
  object component extends js.Object
  
  def withProps(p: OnChangeProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(children: (js.Any, js.Any) => Unit, name: String): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction2(children), name = name.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[OnChangeProps]))
  }
}
