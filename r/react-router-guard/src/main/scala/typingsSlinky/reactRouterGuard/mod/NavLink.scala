package typingsSlinky.reactRouterGuard.mod

import org.scalajs.dom.raw.HTMLAnchorElement
import typingsSlinky.react.mod.PropsWithoutRef
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.reactRouterDom.mod.NavLinkProps
import typingsSlinky.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-router-guard", "NavLink")
@js.native
object NavLink extends js.Object {
  
  def apply[S](
    // TODO: Define this as ...params: Parameters<NavLink<S>> when only TypeScript >= 3.1 support is needed.
  props: PropsWithoutRef[NavLinkProps[S]] with RefAttributes[HTMLAnchorElement]
  ): ReturnType[typingsSlinky.reactRouterDom.mod.NavLink[S]] = js.native
}
