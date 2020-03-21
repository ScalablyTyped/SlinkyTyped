package typingsSlinky.baseui.sideNavigationMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Item extends js.Object {
  var itemId: js.UndefOr[String] = js.undefined
  var subNav: js.UndefOr[js.Array[Item]] = js.undefined
  var title: TagMod[Any]
}

object Item {
  @scala.inline
  def apply(title: TagMod[Any], itemId: String = null, subNav: js.Array[Item] = null): Item = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    if (itemId != null) __obj.updateDynamic("itemId")(itemId.asInstanceOf[js.Any])
    if (subNav != null) __obj.updateDynamic("subNav")(subNav.asInstanceOf[js.Any])
    __obj.asInstanceOf[Item]
  }
}

