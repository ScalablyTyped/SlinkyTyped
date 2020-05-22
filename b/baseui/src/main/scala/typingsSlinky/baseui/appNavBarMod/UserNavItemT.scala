package typingsSlinky.baseui.appNavBarMod

import slinky.core.ReactComponentClass
import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserNavItemT extends js.Object {
  var active: js.UndefOr[Boolean] = js.undefined
  var icon: js.UndefOr[ReactComponentClass[_]] = js.undefined
  var item: ItemT
  var mapItemToNode: js.UndefOr[typingsSlinky.baseui.appNavBarMod.mapItemToNode] = js.undefined
  var mapItemToString: typingsSlinky.baseui.appNavBarMod.mapItemToString
}

object UserNavItemT {
  @scala.inline
  def apply(
    item: ItemT,
    mapItemToString: /* item */ ItemT => String,
    active: js.UndefOr[Boolean] = js.undefined,
    icon: ReactComponentClass[_] = null,
    mapItemToNode: /* item */ ItemT => TagMod[Any] = null
  ): UserNavItemT = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], mapItemToString = js.Any.fromFunction1(mapItemToString))
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.get.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (mapItemToNode != null) __obj.updateDynamic("mapItemToNode")(js.Any.fromFunction1(mapItemToNode))
    __obj.asInstanceOf[UserNavItemT]
  }
}

