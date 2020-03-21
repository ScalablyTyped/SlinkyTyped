package typingsSlinky.blueprintjsSelect

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<{  children ? :react.react.ReactNode}> */
trait ReadonlychildrenReactNode extends js.Object {
  val children: js.UndefOr[TagMod[Any]] = js.undefined
}

object ReadonlychildrenReactNode {
  @scala.inline
  def apply(children: TagMod[Any] = null): ReadonlychildrenReactNode = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlychildrenReactNode]
  }
}

