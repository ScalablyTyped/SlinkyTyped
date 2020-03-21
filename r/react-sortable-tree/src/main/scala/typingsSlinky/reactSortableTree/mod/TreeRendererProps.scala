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

trait TreeRendererProps extends js.Object {
  var canDrop: js.UndefOr[Boolean] = js.undefined
  var children: js.Array[ReactElement]
  // Drop target
  var connectDropTarget: ConnectDropTarget
  var draggedNode: js.UndefOr[TreeItem] = js.undefined
  var isOver: Boolean
  var listIndex: Double
  var lowerSiblingCounts: js.Array[Double]
  var node: TreeItem
  var path: NumberOrStringArray
  var rowDirection: js.UndefOr[ltr | rtl] = js.undefined
  var scaffoldBlockPxWidth: Double
  var style: js.UndefOr[CSSProperties] = js.undefined
  var swapDepth: js.UndefOr[Double] = js.undefined
  var swapFrom: js.UndefOr[Double] = js.undefined
  var swapLength: js.UndefOr[Double] = js.undefined
  var treeId: String
  var treeIndex: Double
  // used in dndManager
  def getPrevRow(): FlatDataItem | Null
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
    treeIndex: Double,
    canDrop: js.UndefOr[Boolean] = js.undefined,
    draggedNode: TreeItem = null,
    rowDirection: ltr | rtl = null,
    style: CSSProperties = null,
    swapDepth: Int | Double = null,
    swapFrom: Int | Double = null,
    swapLength: Int | Double = null
  ): TreeRendererProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], connectDropTarget = js.Any.fromFunction2(connectDropTarget), getPrevRow = js.Any.fromFunction0(getPrevRow), isOver = isOver.asInstanceOf[js.Any], listIndex = listIndex.asInstanceOf[js.Any], lowerSiblingCounts = lowerSiblingCounts.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], scaffoldBlockPxWidth = scaffoldBlockPxWidth.asInstanceOf[js.Any], treeId = treeId.asInstanceOf[js.Any], treeIndex = treeIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(canDrop)) __obj.updateDynamic("canDrop")(canDrop.asInstanceOf[js.Any])
    if (draggedNode != null) __obj.updateDynamic("draggedNode")(draggedNode.asInstanceOf[js.Any])
    if (rowDirection != null) __obj.updateDynamic("rowDirection")(rowDirection.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (swapDepth != null) __obj.updateDynamic("swapDepth")(swapDepth.asInstanceOf[js.Any])
    if (swapFrom != null) __obj.updateDynamic("swapFrom")(swapFrom.asInstanceOf[js.Any])
    if (swapLength != null) __obj.updateDynamic("swapLength")(swapLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeRendererProps]
  }
}

