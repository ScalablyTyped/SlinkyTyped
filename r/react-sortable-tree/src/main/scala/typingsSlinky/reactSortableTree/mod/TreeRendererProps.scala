package typingsSlinky.reactSortableTree.mod

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactDnd.connectorsMod.ConnectDropTarget
import typingsSlinky.reactDnd.connectorsMod.ConnectableElement
import typingsSlinky.reactSortableTree.reactSortableTreeStrings.ltr
import typingsSlinky.reactSortableTree.reactSortableTreeStrings.rtl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeRendererProps extends js.Object {
  var canDrop: js.UndefOr[Boolean] = js.native
  var children: js.Array[ReactElement] = js.native
  // Drop target
  var connectDropTarget: ConnectDropTarget = js.native
  var draggedNode: js.UndefOr[TreeItem] = js.native
  var isOver: Boolean = js.native
  var listIndex: Double = js.native
  var lowerSiblingCounts: js.Array[Double] = js.native
  var node: TreeItem = js.native
  var path: NumberOrStringArray = js.native
  var rowDirection: js.UndefOr[ltr | rtl] = js.native
  var scaffoldBlockPxWidth: Double = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var swapDepth: js.UndefOr[Double] = js.native
  var swapFrom: js.UndefOr[Double] = js.native
  var swapLength: js.UndefOr[Double] = js.native
  var treeId: String = js.native
  var treeIndex: Double = js.native
  // used in dndManager
  def getPrevRow(): FlatDataItem | Null = js.native
}

object TreeRendererProps {
  @scala.inline
  def apply(
    children: js.Array[ReactElement],
    connectDropTarget: (/* elementOrNode */ ConnectableElement, /* options */ js.UndefOr[js.Any]) => ReactElement | Null,
    getPrevRow: () => FlatDataItem | Null,
    isOver: Boolean,
    listIndex: Double,
    lowerSiblingCounts: js.Array[Double],
    node: TreeItem,
    path: NumberOrStringArray,
    scaffoldBlockPxWidth: Double,
    treeId: String,
    treeIndex: Double
  ): TreeRendererProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], connectDropTarget = js.Any.fromFunction2(connectDropTarget), getPrevRow = js.Any.fromFunction0(getPrevRow), isOver = isOver.asInstanceOf[js.Any], listIndex = listIndex.asInstanceOf[js.Any], lowerSiblingCounts = lowerSiblingCounts.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], scaffoldBlockPxWidth = scaffoldBlockPxWidth.asInstanceOf[js.Any], treeId = treeId.asInstanceOf[js.Any], treeIndex = treeIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeRendererProps]
  }
  @scala.inline
  implicit class TreeRendererPropsOps[Self <: TreeRendererProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildren(value: js.Array[ReactElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnectDropTarget(
      value: (/* elementOrNode */ ConnectableElement, /* options */ js.UndefOr[js.Any]) => ReactElement | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectDropTarget")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetPrevRow(value: () => FlatDataItem | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPrevRow")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsOver(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listIndex")(value.asInstanceOf[js.Any])
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
    def withScaffoldBlockPxWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaffoldBlockPxWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTreeId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTreeIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanDrop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canDrop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanDrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canDrop")(js.undefined)
        ret
    }
    @scala.inline
    def withDraggedNode(value: TreeItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggedNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDraggedNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggedNode")(js.undefined)
        ret
    }
    @scala.inline
    def withRowDirection(value: ltr | rtl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowDirection")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withSwapDepth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swapDepth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwapDepth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swapDepth")(js.undefined)
        ret
    }
    @scala.inline
    def withSwapFrom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swapFrom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwapFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swapFrom")(js.undefined)
        ret
    }
    @scala.inline
    def withSwapLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swapLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwapLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swapLength")(js.undefined)
        ret
    }
  }
  
}

