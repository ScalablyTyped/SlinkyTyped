package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INxTreeDataOption extends js.Object {
  /**
    * Maximum number of nodes in the tree. If this limit is exceeded, no nodes are returned. All nodes are counted.
    */
  var MaxNbrOfNodes: Double = js.native
  /**
    * Filters out complete dimensions from the fetched tree.
    */
  var TreeLevels: INxPageTreeLevel = js.native
  /**
    * Defines areas of the tree to be fetched. Areas must be defined left to right.
    */
  var TreeNodes: js.Array[INxPageTreeNode] = js.native
}

object INxTreeDataOption {
  @scala.inline
  def apply(MaxNbrOfNodes: Double, TreeLevels: INxPageTreeLevel, TreeNodes: js.Array[INxPageTreeNode]): INxTreeDataOption = {
    val __obj = js.Dynamic.literal(MaxNbrOfNodes = MaxNbrOfNodes.asInstanceOf[js.Any], TreeLevels = TreeLevels.asInstanceOf[js.Any], TreeNodes = TreeNodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxTreeDataOption]
  }
  @scala.inline
  implicit class INxTreeDataOptionOps[Self <: INxTreeDataOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxNbrOfNodes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxNbrOfNodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTreeLevels(value: INxPageTreeLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TreeLevels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTreeNodes(value: js.Array[INxPageTreeNode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TreeNodes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

