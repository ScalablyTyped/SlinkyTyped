package typingsSlinky.antd.esCardMod

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
  def apply(key: String, tab: TagMod[Any], disabled: js.UndefOr[Boolean] = js.undefined): CardTabListType = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], tab = tab.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardTabListType]
  }
}

