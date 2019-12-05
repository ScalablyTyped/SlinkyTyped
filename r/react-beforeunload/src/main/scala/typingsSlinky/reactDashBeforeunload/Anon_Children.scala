package typingsSlinky.reactDashBeforeunload

import org.scalajs.dom.raw.Event
import slinky.core.TagMod
import typingsSlinky.reactDashBeforeunload.reactDashBeforeunloadMod.UseBeforeunloadHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Children extends js.Object {
  var children: js.UndefOr[TagMod[Any]] = js.undefined
  var onBeforeunload: UseBeforeunloadHandler
}

object Anon_Children {
  @scala.inline
  def apply(onBeforeunload: /* arg */ Event => js.UndefOr[String | Unit], children: TagMod[Any] = null): Anon_Children = {
    val __obj = js.Dynamic.literal(onBeforeunload = js.Any.fromFunction1(onBeforeunload))
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Children]
  }
}

