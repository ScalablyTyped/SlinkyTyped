package typingsSlinky.mirrorx.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.history.mod.History
import typingsSlinky.history.mod.LocationState
import typingsSlinky.mirrorx.mod.ConnectedRouterProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Router {
  @JSImport("mirrorx", "Router")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[State] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.mirrorx.mod.Router[State]] {
    @scala.inline
    def history(value: History[LocationState]): this.type = set("history", value.asInstanceOf[js.Any])
    @scala.inline
    def store(value: js.Any): this.type = set("store", value.asInstanceOf[js.Any])
  }
  
  def withProps[State](p: ConnectedRouterProps[State]): Builder[State] = new Builder[State](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply[State](): Builder[State] = {
    val __props = js.Dynamic.literal()
    new Builder[State](js.Array(this.component, __props.asInstanceOf[ConnectedRouterProps[State]]))
  }
  implicit def make[State](companion: Router.type): Builder[State] = new Builder[State](js.Array(this.component, js.Dictionary.empty))()
}

