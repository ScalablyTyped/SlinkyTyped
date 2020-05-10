package typingsSlinky.reachRouter.mod

import org.scalajs.dom.raw.HTMLAnchorElement
import typingsSlinky.react.mod.PropsWithoutRef
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@reach/router", "Link")
@js.native
object Link extends js.Object {
  def apply[TState](
    // TODO: Define this as ...params: Parameters<Link<TState>> when only TypeScript >= 3.1 support is needed.
  props: PropsWithoutRef[LinkProps[TState]] with RefAttributes[HTMLAnchorElement]
  ): ReturnType[Link[TState]] = js.native
}

