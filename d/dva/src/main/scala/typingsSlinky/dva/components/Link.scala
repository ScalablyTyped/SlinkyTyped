package typingsSlinky.dva.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from js.Any because couldn't resolve ClassTree. */
object Link {
  
  def apply[S](p: Parameters[typingsSlinky.reactRouterDom.mod.Link[S]]): Builder[S] = new Builder[S](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("dva/router", "Link")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder[S] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object]
  
  implicit def make[S](companion: Link.type): Builder[S] = new Builder[S](js.Array(this.component, js.Dictionary.empty))()
}
