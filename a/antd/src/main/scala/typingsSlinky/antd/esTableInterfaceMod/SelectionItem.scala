package typingsSlinky.antd.esTableInterfaceMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionItem extends js.Object {
  var key: String
  var onSelect: js.UndefOr[SelectionItemSelectFn] = js.undefined
  var text: TagMod[Any]
}

object SelectionItem {
  @scala.inline
  def apply(key: String, text: TagMod[Any], onSelect: /* key */ js.Array[String] => Unit = null): SelectionItem = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    __obj.asInstanceOf[SelectionItem]
  }
}

