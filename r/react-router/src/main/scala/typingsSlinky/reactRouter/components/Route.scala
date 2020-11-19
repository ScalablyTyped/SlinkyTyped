package typingsSlinky.reactRouter.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactRouter.mod.RouteProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from T because couldn't resolve ClassTree. */
object Route {
  
  @JSImport("react-router", "Route")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[T /* <: RouteProps */] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactRouter.mod.Route[T]]
  
  def apply[T /* <: RouteProps */](p: T): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make[T /* <: RouteProps */](companion: Route.type): Builder[T] = new Builder[T](js.Array(this.component, js.Dictionary.empty))()
}
