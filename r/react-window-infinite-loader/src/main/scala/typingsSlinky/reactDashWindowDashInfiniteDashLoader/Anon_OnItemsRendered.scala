package typingsSlinky.reactDashWindowDashInfiniteDashLoader

import typingsSlinky.react.reactMod.Ref
import typingsSlinky.reactDashWindow.reactDashWindowMod.ListOnItemsRenderedProps
import typingsSlinky.reactDashWindowDashInfiniteDashLoader.reactDashWindowDashInfiniteDashLoaderMod.OnItemsRendered
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OnItemsRendered extends js.Object {
  var onItemsRendered: OnItemsRendered
  var ref: Ref[_]
}

object Anon_OnItemsRendered {
  @scala.inline
  def apply(onItemsRendered: /* props */ ListOnItemsRenderedProps => js.Any, ref: Ref[_] = null): Anon_OnItemsRendered = {
    val __obj = js.Dynamic.literal(onItemsRendered = js.Any.fromFunction1(onItemsRendered))
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_OnItemsRendered]
  }
}

