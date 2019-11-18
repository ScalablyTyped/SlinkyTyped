package typingsSlinky.antd.libTableInterfaceMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnFilterItem extends js.Object {
  var children: js.UndefOr[js.Array[ColumnFilterItem]] = js.undefined
  var text: TagMod[Any]
  var value: String
}

object ColumnFilterItem {
  @scala.inline
  def apply(text: TagMod[Any], value: String, children: js.Array[ColumnFilterItem] = null): ColumnFilterItem = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnFilterItem]
  }
}

