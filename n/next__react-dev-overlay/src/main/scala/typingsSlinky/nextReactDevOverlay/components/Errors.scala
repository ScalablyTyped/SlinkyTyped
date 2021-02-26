package typingsSlinky.nextReactDevOverlay.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.nextReactDevOverlay.errorsMod.ErrorsProps
import typingsSlinky.nextReactDevOverlay.errorsMod.SupportedErrorEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Errors {
  
  @scala.inline
  def apply(errors: js.Array[SupportedErrorEvent]): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[ErrorsProps]))
  }
  
  @JSImport("@next/react-dev-overlay/lib/internal/container/Errors", "Errors")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ErrorsProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
