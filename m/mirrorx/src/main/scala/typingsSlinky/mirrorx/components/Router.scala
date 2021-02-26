package typingsSlinky.mirrorx.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.history.mod.History
import typingsSlinky.history.mod.LocationState
import typingsSlinky.mirrorx.mod.ConnectedRouterProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Router {
  
  @scala.inline
  def apply[State](): Builder[State] = {
    val __props = js.Dynamic.literal()
    new Builder[State](js.Array(this.component, __props.asInstanceOf[ConnectedRouterProps[State]]))
  }
  
  @JSImport("mirrorx", "Router")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder[State] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.mirrorx.mod.Router[State]] {
    
    @scala.inline
    def history(value: History[LocationState]): this.type = set("history", value.asInstanceOf[js.Any])
    
    @scala.inline
    def store(value: js.Any): this.type = set("store", value.asInstanceOf[js.Any])
  }
  
  implicit def make[State](companion: Router.type): Builder[State] = new Builder[State](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps[State](p: ConnectedRouterProps[State]): Builder[State] = new Builder[State](js.Array(this.component, p.asInstanceOf[js.Any]))
}
