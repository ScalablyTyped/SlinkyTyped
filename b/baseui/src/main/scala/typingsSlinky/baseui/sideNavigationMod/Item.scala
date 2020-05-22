package typingsSlinky.baseui.sideNavigationMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Item extends js.Object {
  var disabled: js.UndefOr[Boolean] = js.undefined
  var itemId: js.UndefOr[String] = js.undefined
  var subNav: js.UndefOr[js.Array[Item]] = js.undefined
  var title: TagMod[Any]
}

object Item {
  @scala.inline
  def apply(
    disabled: js.UndefOr[Boolean] = js.undefined,
    itemId: String = null,
    subNav: js.Array[Item] = null,
    title: TagMod[Any] = null
  ): Item = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (itemId != null) __obj.updateDynamic("itemId")(itemId.asInstanceOf[js.Any])
    if (subNav != null) __obj.updateDynamic("subNav")(subNav.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Item]
  }
}

