package typingsSlinky.reactSortableTree

import typingsSlinky.reactSortableTree.mod.TreeItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-sortable-tree.react-sortable-tree.FullTree & {  expanded ? :boolean} */
@js.native
trait FullTreeexpandedboolean extends js.Object {
  var expanded: js.UndefOr[Boolean] = js.native
  var treeData: js.Array[TreeItem] = js.native
}

object FullTreeexpandedboolean {
  @scala.inline
  def apply(treeData: js.Array[TreeItem]): FullTreeexpandedboolean = {
    val __obj = js.Dynamic.literal(treeData = treeData.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullTreeexpandedboolean]
  }
  @scala.inline
  implicit class FullTreeexpandedbooleanOps[Self <: FullTreeexpandedboolean] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTreeData(value: js.Array[TreeItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpanded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expanded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpanded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expanded")(js.undefined)
        ret
    }
  }
  
}

