package typingsSlinky.reachRouter.components

import org.scalajs.dom.raw.HTMLAnchorElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reachRouter.mod.LinkProps
import typingsSlinky.react.mod.PropsWithoutRef
import typingsSlinky.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Support for combinations of intersection and union types not implemented */
object Link {
  
  def apply[TState](p: PropsWithoutRef[LinkProps[TState]] with RefAttributes[HTMLAnchorElement]): Builder[TState] = new Builder[TState](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("@reach/router", "Link")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder[TState] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object]
  
  implicit def make[TState](companion: Link.type): Builder[TState] = new Builder[TState](js.Array(this.component, js.Dictionary.empty))()
}
