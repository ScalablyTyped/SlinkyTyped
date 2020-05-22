package typingsSlinky.antd.anon

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemIcon extends js.Object {
  var clearIcon: TagMod[Any]
  var itemIcon: js.Object | Null
  var removeIcon: js.Object | Null
  var suffixIcon: js.Object | Null
}

object ItemIcon {
  @scala.inline
  def apply(
    clearIcon: TagMod[Any] = null,
    itemIcon: js.Object = null,
    removeIcon: js.Object = null,
    suffixIcon: js.Object = null
  ): ItemIcon = {
    val __obj = js.Dynamic.literal(itemIcon = itemIcon.asInstanceOf[js.Any], removeIcon = removeIcon.asInstanceOf[js.Any], suffixIcon = suffixIcon.asInstanceOf[js.Any])
    if (clearIcon != null) __obj.updateDynamic("clearIcon")(clearIcon.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemIcon]
  }
}

