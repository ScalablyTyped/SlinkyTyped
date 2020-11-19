package typingsSlinky.dva.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.history.mod.History
import typingsSlinky.history.mod.LocationState
import typingsSlinky.reactRouter.mod.RouterProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Router {
  
  @JSImport("dva/router", "Router")
  @js.native
  object component extends js.Object
  
  def withProps(p: RouterProps): Default[tag.type, typingsSlinky.dva.routerMod.Router] = new Default[tag.type, typingsSlinky.dva.routerMod.Router](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(history: History[LocationState]): Default[tag.type, typingsSlinky.dva.routerMod.Router] = {
    val __props = js.Dynamic.literal(history = history.asInstanceOf[js.Any])
    new Default[tag.type, typingsSlinky.dva.routerMod.Router](js.Array(this.component, __props.asInstanceOf[RouterProps]))
  }
}
