package typingsSlinky.reactSortableTree.mod

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactDnd.connectorsMod.ConnectDragPreview
import typingsSlinky.reactDnd.connectorsMod.ConnectDragSource
import typingsSlinky.reactDnd.connectorsMod.ConnectableElement
import typingsSlinky.reactDnd.optionsMod.DragPreviewOptions
import typingsSlinky.reactDnd.optionsMod.DragSourceOptions
import typingsSlinky.reactSortableTree.reactSortableTreeStrings.ltr
import typingsSlinky.reactSortableTree.reactSortableTreeStrings.rtl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeRendererProps extends js.Object {
  var buttons: js.UndefOr[js.Array[ReactElement]] = js.undefined
  var canDrag: Boolean
  var canDrop: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var connectDragPreview: ConnectDragPreview
  var connectDragSource: ConnectDragSource
  var didDrop: Boolean
  var draggedNode: js.UndefOr[TreeItem] = js.undefined
  var endDrag: js.Any
  var icons: js.UndefOr[js.Array[ReactElement]] = js.undefined
  var isDragging: Boolean
  var isOver: Boolean
  var isSearchFocus: Boolean
  var isSearchMatch: Boolean
  var listIndex: Double
  var lowerSiblingCounts: js.Array[Double]
  var node: TreeItem
  var parentNode: js.UndefOr[TreeItem] = js.undefined
  var path: NumberOrStringArray
  var rowDirection: js.UndefOr[ltr | rtl] = js.undefined
  var scaffoldBlockPxWidth: Double
  var startDrag: js.Any
  var style: js.UndefOr[CSSProperties] = js.undefined
  var subtitle: js.UndefOr[js.Function1[/* data */ NodeData, ReactElement]] = js.undefined
  var swapDepth: js.UndefOr[Double] = js.undefined
  var swapFrom: js.UndefOr[Double] = js.undefined
  var swapLength: js.UndefOr[Double] = js.undefined
  var title: js.UndefOr[js.Function1[/* data */ NodeData, ReactElement]] = js.undefined
  var toggleChildrenVisibility: js.UndefOr[js.Function1[/* data */ NodeData, Unit]] = js.undefined
  var treeId: String
  var treeIndex: Double
}

object NodeRendererProps {
  @scala.inline
  def apply(
    canDrag: Boolean,
    connectDragPreview: (/* elementOrNode */ ConnectableElement, /* options */ js.UndefOr[DragPreviewOptions]) => ReactElement | Null,
    connectDragSource: (/* elementOrNode */ ConnectableElement, /* options */ js.UndefOr[DragSourceOptions]) => ReactElement | Null,
    didDrop: Boolean,
    endDrag: js.Any,
    isDragging: Boolean,
    isOver: Boolean,
    isSearchFocus: Boolean,
    isSearchMatch: Boolean,
    listIndex: Double,
    lowerSiblingCounts: js.Array[Double],
    node: TreeItem,
    path: NumberOrStringArray,
    scaffoldBlockPxWidth: Double,
    startDrag: js.Any,
    treeId: String,
    treeIndex: Double,
    buttons: js.Array[ReactElement] = null,
    canDrop: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    draggedNode: TreeItem = null,
    icons: js.Array[ReactElement] = null,
    parentNode: TreeItem = null,
    rowDirection: ltr | rtl = null,
    style: CSSProperties = null,
    subtitle: /* data */ NodeData => ReactElement = null,
    swapDepth: js.UndefOr[Double] = js.undefined,
    swapFrom: js.UndefOr[Double] = js.undefined,
    swapLength: js.UndefOr[Double] = js.undefined,
    title: /* data */ NodeData => ReactElement = null,
    toggleChildrenVisibility: /* data */ NodeData => Unit = null
  ): NodeRendererProps = {
    val __obj = js.Dynamic.literal(canDrag = canDrag.asInstanceOf[js.Any], connectDragPreview = js.Any.fromFunction2(connectDragPreview), connectDragSource = js.Any.fromFunction2(connectDragSource), didDrop = didDrop.asInstanceOf[js.Any], endDrag = endDrag.asInstanceOf[js.Any], isDragging = isDragging.asInstanceOf[js.Any], isOver = isOver.asInstanceOf[js.Any], isSearchFocus = isSearchFocus.asInstanceOf[js.Any], isSearchMatch = isSearchMatch.asInstanceOf[js.Any], listIndex = listIndex.asInstanceOf[js.Any], lowerSiblingCounts = lowerSiblingCounts.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], scaffoldBlockPxWidth = scaffoldBlockPxWidth.asInstanceOf[js.Any], startDrag = startDrag.asInstanceOf[js.Any], treeId = treeId.asInstanceOf[js.Any], treeIndex = treeIndex.asInstanceOf[js.Any])
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (!js.isUndefined(canDrop)) __obj.updateDynamic("canDrop")(canDrop.get.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (draggedNode != null) __obj.updateDynamic("draggedNode")(draggedNode.asInstanceOf[js.Any])
    if (icons != null) __obj.updateDynamic("icons")(icons.asInstanceOf[js.Any])
    if (parentNode != null) __obj.updateDynamic("parentNode")(parentNode.asInstanceOf[js.Any])
    if (rowDirection != null) __obj.updateDynamic("rowDirection")(rowDirection.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (subtitle != null) __obj.updateDynamic("subtitle")(js.Any.fromFunction1(subtitle))
    if (!js.isUndefined(swapDepth)) __obj.updateDynamic("swapDepth")(swapDepth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(swapFrom)) __obj.updateDynamic("swapFrom")(swapFrom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(swapLength)) __obj.updateDynamic("swapLength")(swapLength.get.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(js.Any.fromFunction1(title))
    if (toggleChildrenVisibility != null) __obj.updateDynamic("toggleChildrenVisibility")(js.Any.fromFunction1(toggleChildrenVisibility))
    __obj.asInstanceOf[NodeRendererProps]
  }
}

