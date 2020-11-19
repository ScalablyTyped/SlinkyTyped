package typingsSlinky.reactRouterDom.mod

import org.scalajs.dom.raw.HTMLAnchorElement
import typingsSlinky.react.mod.PropsWithoutRef
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-router-dom", "NavLink")
@js.native
object NavLink extends js.Object {
  
  def apply[S](
    // TODO: Define this as ...params: Parameters<NavLink<S>> when only TypeScript >= 3.1 support is needed.
  props: PropsWithoutRef[NavLinkProps[S]] with RefAttributes[HTMLAnchorElement]
  ): ReturnType[NavLink[S]] = js.native
}
