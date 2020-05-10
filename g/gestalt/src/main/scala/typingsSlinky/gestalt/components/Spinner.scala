package typingsSlinky.gestalt.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.gestalt.gestaltStrings.md
import typingsSlinky.gestalt.gestaltStrings.sm
import typingsSlinky.gestalt.mod.SpinnerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Spinner {
  @JSImport("gestalt", "Spinner")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.gestalt.mod.Spinner] {
    @scala.inline
    def delay(value: Boolean): this.type = set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def size(value: sm | md): this.type = set("size", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SpinnerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(accessibilityLabel: String, show: Boolean): Builder = {
    val __props = js.Dynamic.literal(accessibilityLabel = accessibilityLabel.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[SpinnerProps]))
  }
}

