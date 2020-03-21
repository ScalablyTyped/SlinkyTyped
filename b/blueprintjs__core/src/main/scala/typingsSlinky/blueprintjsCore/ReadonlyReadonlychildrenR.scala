package typingsSlinky.blueprintjsCore

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<{}> & std.Readonly<{  children ? :react.react.ReactNode}> */
trait ReadonlyReadonlychildrenR extends js.Object {
  val children: js.UndefOr[TagMod[Any]] = js.undefined
}

object ReadonlyReadonlychildrenR {
  @scala.inline
  def apply(children: TagMod[Any] = null): ReadonlyReadonlychildrenR = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyReadonlychildrenR]
  }
}

