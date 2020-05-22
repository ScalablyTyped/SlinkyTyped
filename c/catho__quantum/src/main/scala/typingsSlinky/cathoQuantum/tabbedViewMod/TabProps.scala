package typingsSlinky.cathoQuantum.tabbedViewMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabProps extends js.Object {
  var badge: js.UndefOr[TagMod[Any]] = js.undefined
  var children: js.Array[TagMod[Any]] | TagMod[Any]
  var icon: js.UndefOr[TagMod[Any]] = js.undefined
  var title: String
}

object TabProps {
  @scala.inline
  def apply(
    title: String,
    badge: TagMod[Any] = null,
    children: js.Array[TagMod[Any]] | TagMod[Any] = null,
    icon: TagMod[Any] = null
  ): TabProps = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    if (badge != null) __obj.updateDynamic("badge")(badge.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabProps]
  }
}

