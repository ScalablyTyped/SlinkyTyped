package typingsSlinky.reactBeforeunload.anon

import org.scalajs.dom.raw.Event
import slinky.core.TagMod
import typingsSlinky.reactBeforeunload.mod.UseBeforeunloadHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Children extends js.Object {
  var children: js.UndefOr[TagMod[Any]] = js.undefined
  var onBeforeunload: UseBeforeunloadHandler
}

object Children {
  @scala.inline
  def apply(onBeforeunload: /* arg */ Event => js.UndefOr[String | Unit], children: TagMod[Any] = null): Children = {
    val __obj = js.Dynamic.literal(onBeforeunload = js.Any.fromFunction1(onBeforeunload))
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[Children]
  }
}

