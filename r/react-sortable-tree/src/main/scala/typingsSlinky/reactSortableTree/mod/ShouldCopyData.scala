package typingsSlinky.reactSortableTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShouldCopyData extends js.Object {
  var node: TreeNode = js.native
  var prevPath: NumberOrStringArray = js.native
  var prevTreeIndex: Double = js.native
}

object ShouldCopyData {
  @scala.inline
  def apply(node: TreeNode, prevPath: NumberOrStringArray, prevTreeIndex: Double): ShouldCopyData = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], prevPath = prevPath.asInstanceOf[js.Any], prevTreeIndex = prevTreeIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShouldCopyData]
  }
  @scala.inline
  implicit class ShouldCopyDataOps[Self <: ShouldCopyData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNode(value: TreeNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrevPath(value: NumberOrStringArray): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrevTreeIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevTreeIndex")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

