package typingsSlinky.gestalt.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.gestalt.mod.LayerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Layer {
  @JSImport("gestalt", "Layer")
  @js.native
  object component extends js.Object
  
  def withProps(p: LayerProps): Default[tag.type, typingsSlinky.gestalt.mod.Layer] = new Default[tag.type, typingsSlinky.gestalt.mod.Layer](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Layer.type): Default[tag.type, typingsSlinky.gestalt.mod.Layer] = new Default[tag.type, typingsSlinky.gestalt.mod.Layer](js.Array(this.component, js.Dictionary.empty))()
}

