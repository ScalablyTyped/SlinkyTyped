package typingsSlinky.reachRouter.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reachRouter.mod.LocationProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Location {
  @JSImport("@reach/router", "Location")
  @js.native
  object component extends js.Object
  
  def withProps(p: LocationProps): Default[tag.type, typingsSlinky.reachRouter.mod.Location] = new Default[tag.type, typingsSlinky.reachRouter.mod.Location](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Location.type): Default[tag.type, typingsSlinky.reachRouter.mod.Location] = new Default[tag.type, typingsSlinky.reachRouter.mod.Location](js.Array(this.component, js.Dictionary.empty))()
}

