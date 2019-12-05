package typingsSlinky.atAntDashDesignReactDashNative.libPickerCascaderCascaderTypesMod

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
  def apply(label: TagMod[Any], value: CascaderOneValue, children: js.Array[CascaderDataItem] = null): CascaderDataItem = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[CascaderDataItem]
  }
}

