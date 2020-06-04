package typingsSlinky.reachRouter.components

import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reachRouter.mod.LocationContext
import typingsSlinky.reachRouter.mod.LocationProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Location {
  @JSImport("@reach/router", "Location")
  @js.native
  object component extends js.Object
  
  def withProps(p: LocationProps): Default[tag.type, typingsSlinky.reachRouter.mod.Location] = new Default[tag.type, typingsSlinky.reachRouter.mod.Location](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(children: /* context */ LocationContext => TagMod[Any]): Default[tag.type, typingsSlinky.reachRouter.mod.Location] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    new Default[tag.type, typingsSlinky.reachRouter.mod.Location](js.Array(this.component, __props.asInstanceOf[LocationProps]))
  }
}

