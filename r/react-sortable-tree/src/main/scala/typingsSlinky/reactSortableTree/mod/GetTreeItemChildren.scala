package typingsSlinky.reactSortableTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTreeItemChildren extends js.Object {
  var lowerSiblingCounts: js.Array[Double] = js.native
  var node: TreeItem = js.native
  var path: NumberOrStringArray = js.native
  var treeIndex: Double = js.native
  def done(children: js.Array[TreeItem]): Unit = js.native
}

object GetTreeItemChildren {
  @scala.inline
  def apply(
    done: js.Array[TreeItem] => Unit,
    lowerSiblingCounts: js.Array[Double],
    node: TreeItem,
    path: NumberOrStringArray,
    treeIndex: Double
  ): GetTreeItemChildren = {
    val __obj = js.Dynamic.literal(done = js.Any.fromFunction1(done), lowerSiblingCounts = lowerSiblingCounts.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], treeIndex = treeIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTreeItemChildren]
  }
  @scala.inline
  implicit class GetTreeItemChildrenOps[Self <: GetTreeItemChildren] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDone(value: js.Array[TreeItem] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("done")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLowerSiblingCounts(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowerSiblingCounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNode(value: TreeItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: NumberOrStringArray): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTreeIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeIndex")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

