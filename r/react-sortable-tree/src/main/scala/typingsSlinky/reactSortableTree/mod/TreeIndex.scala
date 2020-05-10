package typingsSlinky.reactSortableTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeIndex extends js.Object {
  var treeIndex: Double = js.native
}

object TreeIndex {
  @scala.inline
  def apply(treeIndex: Double): TreeIndex = {
    val __obj = js.Dynamic.literal(treeIndex = treeIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeIndex]
  }
  @scala.inline
  implicit class TreeIndexOps[Self <: TreeIndex] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTreeIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeIndex")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

