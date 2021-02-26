package typingsSlinky.reactFinalFormListeners.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactFinalFormListeners.mod.OnBlurProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object OnBlur {
  
  @scala.inline
  def apply(children: () => Unit, name: String): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction0(children), name = name.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[OnBlurProps]))
  }
  
  @JSImport("react-final-form-listeners", "OnBlur")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: OnBlurProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
