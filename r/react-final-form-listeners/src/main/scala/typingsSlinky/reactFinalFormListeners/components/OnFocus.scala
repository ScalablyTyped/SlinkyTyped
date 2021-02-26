package typingsSlinky.reactFinalFormListeners.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactFinalFormListeners.mod.OnFocusProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object OnFocus {
  
  @scala.inline
  def apply(children: () => Unit, name: String): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction0(children), name = name.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[OnFocusProps]))
  }
  
  @JSImport("react-final-form-listeners", "OnFocus")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: OnFocusProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
