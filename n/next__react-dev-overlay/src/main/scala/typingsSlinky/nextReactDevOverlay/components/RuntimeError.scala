package typingsSlinky.nextReactDevOverlay.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.nextReactDevOverlay.errorsMod.ReadyRuntimeError
import typingsSlinky.nextReactDevOverlay.runtimeErrorMod.RuntimeErrorProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RuntimeError {
  
  @scala.inline
  def apply(error: ReadyRuntimeError): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[RuntimeErrorProps]))
  }
  
  @JSImport("@next/react-dev-overlay/lib/internal/container/RuntimeError", "RuntimeError")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: RuntimeErrorProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
