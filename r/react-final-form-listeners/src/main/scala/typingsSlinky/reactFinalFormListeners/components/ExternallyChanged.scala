package typingsSlinky.reactFinalFormListeners.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactFinalFormListeners.mod.ExternallyChangedProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ExternallyChanged {
  @JSImport("react-final-form-listeners", "ExternallyChanged")
  @js.native
  object component extends js.Object
  
  def withProps(p: ExternallyChangedProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(name: String): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[ExternallyChangedProps]))
  }
}

