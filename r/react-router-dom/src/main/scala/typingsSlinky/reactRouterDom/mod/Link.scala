package typingsSlinky.reactRouterDom.mod

import org.scalajs.dom.raw.HTMLAnchorElement
import typingsSlinky.react.mod.PropsWithoutRef
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-router-dom", "Link")
@js.native
object Link extends js.Object {
  def apply[S](
    // TODO: Define this as ...params: Parameters<Link<S>> when only TypeScript >= 3.1 support is needed.
  props: PropsWithoutRef[LinkProps[S]] with RefAttributes[HTMLAnchorElement]
  ): ReturnType[Link[S]] = js.native
}

