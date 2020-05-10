package typingsSlinky.reactSortableTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtendedNodeData
  extends TreeNode
     with TreePath
     with TreeIndex {
  var isSearchFocus: Boolean = js.native
  var isSearchMatch: Boolean = js.native
  var lowerSiblingCounts: js.Array[Double] = js.native
  var parentNode: TreeItem = js.native
}

object ExtendedNodeData {
  @scala.inline
  def apply(
    isSearchFocus: Boolean,
    isSearchMatch: Boolean,
    lowerSiblingCounts: js.Array[Double],
    node: TreeItem,
    parentNode: TreeItem,
    path: NumberOrStringArray,
    treeIndex: Double
  ): ExtendedNodeData = {
    val __obj = js.Dynamic.literal(isSearchFocus = isSearchFocus.asInstanceOf[js.Any], isSearchMatch = isSearchMatch.asInstanceOf[js.Any], lowerSiblingCounts = lowerSiblingCounts.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], parentNode = parentNode.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], treeIndex = treeIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedNodeData]
  }
  @scala.inline
  implicit class ExtendedNodeDataOps[Self <: ExtendedNodeData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsSearchFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSearchFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsSearchMatch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSearchMatch")(value.asInstanceOf[js.Any])
        ret
    }
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

