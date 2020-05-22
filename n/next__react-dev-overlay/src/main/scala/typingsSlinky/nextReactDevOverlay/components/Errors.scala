package typingsSlinky.nextReactDevOverlay.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.nextReactDevOverlay.errorsMod.ErrorsProps
import typingsSlinky.nextReactDevOverlay.errorsMod.SupportedErrorEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Errors {
  @JSImport("@next/react-dev-overlay/lib/internal/container/Errors", "Errors")
  @js.native
  object component extends js.Object
  
  def withProps(p: ErrorsProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(errors: js.Array[SupportedErrorEvent]): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[ErrorsProps]))
  }
}

