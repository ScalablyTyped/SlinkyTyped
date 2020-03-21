package typingsSlinky.reactWindowInfiniteLoader

import typingsSlinky.react.mod.Ref
import typingsSlinky.reactWindow.mod.ListOnItemsRenderedProps
import typingsSlinky.reactWindowInfiniteLoader.mod.OnItemsRendered
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnItemsRendered extends js.Object {
  var onItemsRendered: OnItemsRendered
  var ref: Ref[_]
}

object AnonOnItemsRendered {
  @scala.inline
  def apply(onItemsRendered: /* props */ ListOnItemsRenderedProps => js.Any, ref: Ref[_] = null): AnonOnItemsRendered = {
    val __obj = js.Dynamic.literal(onItemsRendered = js.Any.fromFunction1(onItemsRendered))
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOnItemsRendered]
  }
}

