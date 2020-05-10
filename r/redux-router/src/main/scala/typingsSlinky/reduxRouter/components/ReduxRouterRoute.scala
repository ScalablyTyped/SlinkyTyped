package typingsSlinky.reduxRouter.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactRouter.mod.RouteProps
import typingsSlinky.reduxRouter.mod.ReduxRouter.Route
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from T because couldn't resolve ClassTree. */
object ReduxRouterRoute {
  @JSImport("redux-router", "ReduxRouter.Route")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[T <: RouteProps] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, Route[js.Any]]
  
  def apply[T <: RouteProps](p: T): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make[T <: RouteProps](companion: ReduxRouterRoute.type): Builder[T] = new Builder[T](js.Array(this.component, js.Dictionary.empty))()
}

