package typingsSlinky.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileTree extends js.Object {
  var rootNode: FileTreeNode = js.native
  var selectedNode: FileTreeNode = js.native
}

object FileTree {
  @scala.inline
  def apply(rootNode: FileTreeNode, selectedNode: FileTreeNode): FileTree = {
    val __obj = js.Dynamic.literal(rootNode = rootNode.asInstanceOf[js.Any], selectedNode = selectedNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileTree]
  }
  @scala.inline
  implicit class FileTreeOps[Self <: FileTree] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRootNode(value: FileTreeNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectedNode(value: FileTreeNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedNode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

