package typingsSlinky.nextReactDevOverlay.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.nextReactDevOverlay.buildErrorMod.BuildErrorProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object BuildError {
  @JSImport("@next/react-dev-overlay/lib/internal/container/BuildError", "BuildError")
  @js.native
  object component extends js.Object
  
  def withProps(p: BuildErrorProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(message: String): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[BuildErrorProps]))
  }
}

