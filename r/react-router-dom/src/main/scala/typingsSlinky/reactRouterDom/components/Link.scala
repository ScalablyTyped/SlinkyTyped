package typingsSlinky.reactRouterDom.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.std.Parameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from js.Any because couldn't resolve ClassTree. */
object Link {
  
  @JSImport("react-router-dom", "Link")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[S] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object]
  
  def apply[S](p: Parameters[typingsSlinky.reactRouterDom.mod.Link[S]]): Builder[S] = new Builder[S](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make[S](companion: Link.type): Builder[S] = new Builder[S](js.Array(this.component, js.Dictionary.empty))()
}
