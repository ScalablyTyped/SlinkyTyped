package typingsSlinky.reactRouterGuard.components

import org.scalajs.dom.raw.HTMLAnchorElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.PropsWithoutRef
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.reactRouterDom.mod.LinkProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Support for combinations of intersection and union types not implemented */
object Link {
  
  @JSImport("react-router-guard", "Link")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[S] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object]
  
  def apply[S](p: PropsWithoutRef[LinkProps[S]] with RefAttributes[HTMLAnchorElement]): Builder[S] = new Builder[S](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make[S](companion: Link.type): Builder[S] = new Builder[S](js.Array(this.component, js.Dictionary.empty))()
}
