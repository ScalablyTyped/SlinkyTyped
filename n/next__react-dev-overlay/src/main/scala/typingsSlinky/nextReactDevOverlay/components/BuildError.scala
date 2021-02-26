package typingsSlinky.nextReactDevOverlay.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.nextReactDevOverlay.buildErrorMod.BuildErrorProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BuildError {
  
  @scala.inline
  def apply(message: String): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[BuildErrorProps]))
  }
  
  @JSImport("@next/react-dev-overlay/lib/internal/container/BuildError", "BuildError")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: BuildErrorProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
