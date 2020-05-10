package typingsSlinky.reactSortableTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlatDataItem
  extends TreeNode
     with TreePath {
  var lowerSiblingCounts: js.Array[Double] = js.native
  var parentNode: TreeItem = js.native
}

object FlatDataItem {
  @scala.inline
  def apply(
    lowerSiblingCounts: js.Array[Double],
    node: TreeItem,
    parentNode: TreeItem,
    path: NumberOrStringArray
  ): FlatDataItem = {
    val __obj = js.Dynamic.literal(lowerSiblingCounts = lowerSiblingCounts.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], parentNode = parentNode.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlatDataItem]
  }
  @scala.inline
  implicit class FlatDataItemOps[Self <: FlatDataItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLowerSiblingCounts(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowerSiblingCounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentNode(value: TreeItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentNode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

