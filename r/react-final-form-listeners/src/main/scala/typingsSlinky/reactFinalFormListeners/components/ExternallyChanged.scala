package typingsSlinky.reactFinalFormListeners.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactFinalFormListeners.mod.ExternallyChangedProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ExternallyChanged {
  
  @scala.inline
  def apply(children: Boolean => ReactElement, name: String): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children), name = name.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[ExternallyChangedProps]))
  }
  
  @JSImport("react-final-form-listeners", "ExternallyChanged")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ExternallyChangedProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
