package typingsSlinky.reactSortableTree.anon

import typingsSlinky.reactSortableTree.mod.NodeData
import typingsSlinky.reactSortableTree.mod.TreeItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  matches  :std.Array<react-sortable-tree.react-sortable-tree.NodeData>} & react-sortable-tree.react-sortable-tree.FullTree */
@js.native
trait matchesArrayNodeDataFullT extends js.Object {
  var matches: js.Array[NodeData] = js.native
  var treeData: js.Array[TreeItem] = js.native
}

object matchesArrayNodeDataFullT {
  @scala.inline
  def apply(matches: js.Array[NodeData], treeData: js.Array[TreeItem]): matchesArrayNodeDataFullT = {
    val __obj = js.Dynamic.literal(matches = matches.asInstanceOf[js.Any], treeData = treeData.asInstanceOf[js.Any])
    __obj.asInstanceOf[matchesArrayNodeDataFullT]
  }
  @scala.inline
  implicit class matchesArrayNodeDataFullTOps[Self <: matchesArrayNodeDataFullT] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMatches(value: js.Array[NodeData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTreeData(value: js.Array[TreeItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeData")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

