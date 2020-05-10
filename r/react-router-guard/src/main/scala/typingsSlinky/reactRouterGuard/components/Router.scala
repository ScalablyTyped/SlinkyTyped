package typingsSlinky.reactRouterGuard.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.history.mod.History
import typingsSlinky.history.mod.LocationState
import typingsSlinky.reactRouter.mod.RouterProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Router {
  @JSImport("react-router-guard", "Router")
  @js.native
  object component extends js.Object
  
  def withProps(p: RouterProps): Default[tag.type, typingsSlinky.reactRouterGuard.mod.Router] = new Default[tag.type, typingsSlinky.reactRouterGuard.mod.Router](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(history: History[LocationState]): Default[tag.type, typingsSlinky.reactRouterGuard.mod.Router] = {
    val __props = js.Dynamic.literal(history = history.asInstanceOf[js.Any])
    new Default[tag.type, typingsSlinky.reactRouterGuard.mod.Router](js.Array(this.component, __props.asInstanceOf[RouterProps]))
  }
}

