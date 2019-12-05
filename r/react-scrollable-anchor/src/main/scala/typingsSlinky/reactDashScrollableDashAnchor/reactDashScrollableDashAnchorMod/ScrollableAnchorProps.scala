package typingsSlinky.reactDashScrollableDashAnchor.reactDashScrollableDashAnchorMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollableAnchorProps extends js.Object {
  var children: js.UndefOr[TagMod[Any]] = js.undefined
  var id: String
}

object ScrollableAnchorProps {
  @scala.inline
  def apply(id: String, children: TagMod[Any] = null): ScrollableAnchorProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollableAnchorProps]
  }
}

