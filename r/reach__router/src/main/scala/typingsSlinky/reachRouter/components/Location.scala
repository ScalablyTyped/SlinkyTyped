package typingsSlinky.reachRouter.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reachRouter.mod.LocationContext
import typingsSlinky.reachRouter.mod.LocationProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Location {
  
  @scala.inline
  def apply(children: /* context */ LocationContext => ReactElement): Default[tag.type, typingsSlinky.reachRouter.mod.Location] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    new Default[tag.type, typingsSlinky.reachRouter.mod.Location](js.Array(this.component, __props.asInstanceOf[LocationProps]))
  }
  
  @JSImport("@reach/router", "Location")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: LocationProps): Default[tag.type, typingsSlinky.reachRouter.mod.Location] = new Default[tag.type, typingsSlinky.reachRouter.mod.Location](js.Array(this.component, p.asInstanceOf[js.Any]))
}
