package typingsSlinky.antDesignReactNative.cascaderTypesMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CascaderDataItem extends js.Object {
  var children: js.UndefOr[js.Array[CascaderDataItem]] = js.undefined
  var label: TagMod[Any]
  var value: CascaderOneValue
}

object CascaderDataItem {
  @scala.inline
  def apply(value: CascaderOneValue, children: js.Array[CascaderDataItem] = null, label: TagMod[Any] = null): CascaderDataItem = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[CascaderDataItem]
  }
}

