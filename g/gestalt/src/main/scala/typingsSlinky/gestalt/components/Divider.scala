package typingsSlinky.gestalt.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Divider {
  @JSImport("gestalt", "Divider")
  @js.native
  object component extends js.Object
  
  def withProps(p: js.Object): Default[tag.type, typingsSlinky.gestalt.mod.Divider] = new Default[tag.type, typingsSlinky.gestalt.mod.Divider](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Divider.type): Default[tag.type, typingsSlinky.gestalt.mod.Divider] = new Default[tag.type, typingsSlinky.gestalt.mod.Divider](js.Array(this.component, js.Dictionary.empty))()
}

