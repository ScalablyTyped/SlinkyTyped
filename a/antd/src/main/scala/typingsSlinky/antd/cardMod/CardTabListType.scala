package typingsSlinky.antd.cardMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardTabListType extends js.Object {
  var disabled: js.UndefOr[Boolean] = js.undefined
  var key: String
  var tab: TagMod[Any]
}

object CardTabListType {
  @scala.inline
  def apply(key: String, disabled: js.UndefOr[Boolean] = js.undefined, tab: TagMod[Any] = null): CardTabListType = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (tab != null) __obj.updateDynamic("tab")(tab.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardTabListType]
  }
}

