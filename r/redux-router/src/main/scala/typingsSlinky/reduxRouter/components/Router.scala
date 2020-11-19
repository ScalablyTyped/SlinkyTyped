package typingsSlinky.reduxRouter.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.history.mod.History
import typingsSlinky.history.mod.LocationState
import typingsSlinky.reactRouter.mod.RouterProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Router {
  
  @JSImport("redux-router", "ReduxRouter.Router")
  @js.native
  object component extends js.Object
  
  def withProps(p: RouterProps): Default[tag.type, typingsSlinky.reduxRouter.mod.ReduxRouter.Router] = new Default[tag.type, typingsSlinky.reduxRouter.mod.ReduxRouter.Router](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(history: History[LocationState]): Default[tag.type, typingsSlinky.reduxRouter.mod.ReduxRouter.Router] = {
    val __props = js.Dynamic.literal(history = history.asInstanceOf[js.Any])
    new Default[tag.type, typingsSlinky.reduxRouter.mod.ReduxRouter.Router](js.Array(this.component, __props.asInstanceOf[RouterProps]))
  }
}
