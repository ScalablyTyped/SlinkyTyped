package typingsSlinky.reactBeforeunload

import slinky.core.TagMod
import typingsSlinky.reactBeforeunload.mod.UseBeforeunloadHandler
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildren extends js.Object {
  var children: js.UndefOr[TagMod[Any]] = js.undefined
  var onBeforeunload: UseBeforeunloadHandler
}

object AnonChildren {
  @scala.inline
  def apply(onBeforeunload: /* arg */ Event_ => js.UndefOr[String | Unit], children: TagMod[Any] = null): AnonChildren = {
    val __obj = js.Dynamic.literal(onBeforeunload = js.Any.fromFunction1(onBeforeunload))
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChildren]
  }
}

