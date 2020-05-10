package typingsSlinky.reachRouter.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.history.mod.LocationState
import typingsSlinky.reachRouter.mod.NavigateFn
import typingsSlinky.reachRouter.mod.RedirectProps
import typingsSlinky.reachRouter.mod.RouteComponentProps
import typingsSlinky.reachRouter.mod.WindowLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Redirect {
  @JSImport("@reach/router", "Redirect")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[TState] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reachRouter.mod.Redirect[js.Any]] {
    @scala.inline
    def default(value: Boolean): this.type = set("default", value.asInstanceOf[js.Any])
    @scala.inline
    def from(value: String): this.type = set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def location(value: WindowLocation[LocationState]): this.type = set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def navigate(value: NavigateFn): this.type = set("navigate", value.asInstanceOf[js.Any])
    @scala.inline
    def noThrow(value: Boolean): this.type = set("noThrow", value.asInstanceOf[js.Any])
    @scala.inline
    def path(value: String): this.type = set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def replace(value: Boolean): this.type = set("replace", value.asInstanceOf[js.Any])
    @scala.inline
    def state(value: TState): this.type = set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def uri(value: String): this.type = set("uri", value.asInstanceOf[js.Any])
  }
  
  def withProps[TState](p: RouteComponentProps[RedirectProps[TState]]): Builder[TState] = new Builder[TState](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply[TState](to: String): Builder[TState] = {
    val __props = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    new Builder[TState](js.Array(this.component, __props.asInstanceOf[RouteComponentProps[RedirectProps[TState]]]))
  }
}

