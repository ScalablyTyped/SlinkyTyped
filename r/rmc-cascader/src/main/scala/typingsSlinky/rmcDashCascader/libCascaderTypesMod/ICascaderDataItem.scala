package typingsSlinky.rmcDashCascader.libCascaderTypesMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICascaderDataItem extends js.Object {
  var children: js.UndefOr[js.Array[ICascaderDataItem]] = js.undefined
  var label: TagMod[Any]
  var value: CascaderOneValue
}

object ICascaderDataItem {
  @scala.inline
  def apply(label: TagMod[Any], value: CascaderOneValue, children: js.Array[ICascaderDataItem] = null): ICascaderDataItem = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICascaderDataItem]
  }
}

