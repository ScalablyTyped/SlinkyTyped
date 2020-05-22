package typingsSlinky.angularCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Read extends js.Object {
  var read: js.UndefOr[js.Any] = js.undefined
  var static: Boolean
}

object Read {
  @scala.inline
  def apply(static: Boolean, read: js.Any = null): Read = {
    val __obj = js.Dynamic.literal(static = static.asInstanceOf[js.Any])
    if (read != null) __obj.updateDynamic("read")(read.asInstanceOf[js.Any])
    __obj.asInstanceOf[Read]
  }
}

