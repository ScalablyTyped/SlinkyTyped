package typingsSlinky.dva.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.history.mod.History
import typingsSlinky.history.mod.LocationState
import typingsSlinky.reactRouterRedux.mod.ConnectedRouterProps
import typingsSlinky.redux.mod.AnyAction
import typingsSlinky.redux.mod.Store
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ConnectedRouter {
  
  @scala.inline
  def apply[State](history: History[LocationState]): Builder[State] = {
    val __props = js.Dynamic.literal(history = history.asInstanceOf[js.Any])
    new Builder[State](js.Array(this.component, __props.asInstanceOf[ConnectedRouterProps[State]]))
  }
  
  @JSImport("dva/router", "routerRedux.ConnectedRouter")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder[State] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.dva.routerMod.routerRedux.ConnectedRouter[State]] {
    
    @scala.inline
    def store(value: Store[State, AnyAction]): this.type = set("store", value.asInstanceOf[js.Any])
  }
  
  def withProps[State](p: ConnectedRouterProps[State]): Builder[State] = new Builder[State](js.Array(this.component, p.asInstanceOf[js.Any]))
}
