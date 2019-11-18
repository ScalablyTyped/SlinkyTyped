package typingsSlinky.antd.esTreeDashSelectInterfaceMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeNodeNormal extends js.Object {
  var children: js.UndefOr[js.Array[TreeNodeNormal]] = js.undefined
  var disableCheckbox: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var isLeaf: js.UndefOr[Boolean] = js.undefined
  var key: String
  /**
    * @deprecated Please use `title` instead.
    */
  var label: js.UndefOr[TagMod[Any]] = js.undefined
  var selectable: js.UndefOr[Boolean] = js.undefined
  var title: js.UndefOr[TagMod[Any]] = js.undefined
  var value: TreeNodeValue
}

object TreeNodeNormal {
  @scala.inline
  def apply(
    key: String,
    value: TreeNodeValue,
    children: js.Array[TreeNodeNormal] = null,
    disableCheckbox: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    isLeaf: js.UndefOr[Boolean] = js.undefined,
    label: TagMod[Any] = null,
    selectable: js.UndefOr[Boolean] = js.undefined,
    title: TagMod[Any] = null
  ): TreeNodeNormal = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(disableCheckbox)) __obj.updateDynamic("disableCheckbox")(disableCheckbox.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(isLeaf)) __obj.updateDynamic("isLeaf")(isLeaf.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeNodeNormal]
  }
}

