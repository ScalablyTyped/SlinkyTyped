package typingsSlinky.antd.tableInterfaceMod

import slinky.core.TagMod
import typingsSlinky.antd.useSelectionMod.INTERNAL_SELECTION_ITEM
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionItem extends INTERNAL_SELECTION_ITEM {
  var key: String
  var onSelect: js.UndefOr[SelectionItemSelectFn] = js.undefined
  var text: TagMod[Any]
}

object SelectionItem {
  @scala.inline
  def apply(key: String, onSelect: /* currentRowKeys */ js.Array[Key] => Unit = null, text: TagMod[Any] = null): SelectionItem = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectionItem]
  }
}

