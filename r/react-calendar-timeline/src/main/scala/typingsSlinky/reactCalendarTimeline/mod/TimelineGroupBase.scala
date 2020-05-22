package typingsSlinky.reactCalendarTimeline.mod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineGroupBase extends js.Object {
  var id: Id
  var rightTitle: js.UndefOr[TagMod[Any]] = js.undefined
  var title: TagMod[Any]
}

object TimelineGroupBase {
  @scala.inline
  def apply(id: Id, rightTitle: TagMod[Any] = null, title: TagMod[Any] = null): TimelineGroupBase = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (rightTitle != null) __obj.updateDynamic("rightTitle")(rightTitle.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineGroupBase]
  }
}

