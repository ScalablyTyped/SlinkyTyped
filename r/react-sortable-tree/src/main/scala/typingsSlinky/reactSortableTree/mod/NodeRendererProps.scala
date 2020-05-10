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

@js.native
trait NodeRendererProps extends js.Object {
  var buttons: js.UndefOr[js.Array[ReactElement]] = js.native
  var canDrag: Boolean = js.native
  var canDrop: js.UndefOr[Boolean] = js.native
  var className: js.UndefOr[String] = js.native
  var connectDragPreview: ConnectDragPreview = js.native
  var connectDragSource: ConnectDragSource = js.native
  var didDrop: Boolean = js.native
  var draggedNode: js.UndefOr[TreeItem] = js.native
  var endDrag: js.Any = js.native
  var icons: js.UndefOr[js.Array[ReactElement]] = js.native
  var isDragging: Boolean = js.native
  var isOver: Boolean = js.native
  var isSearchFocus: Boolean = js.native
  var isSearchMatch: Boolean = js.native
  var listIndex: Double = js.native
  var lowerSiblingCounts: js.Array[Double] = js.native
  var node: TreeItem = js.native
  var parentNode: js.UndefOr[TreeItem] = js.native
  var path: NumberOrStringArray = js.native
  var rowDirection: js.UndefOr[ltr | rtl] = js.native
  var scaffoldBlockPxWidth: Double = js.native
  var startDrag: js.Any = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var subtitle: js.UndefOr[js.Function1[/* data */ NodeData, ReactElement]] = js.native
  var swapDepth: js.UndefOr[Double] = js.native
  var swapFrom: js.UndefOr[Double] = js.native
  var swapLength: js.UndefOr[Double] = js.native
  var title: js.UndefOr[js.Function1[/* data */ NodeData, ReactElement]] = js.native
  var toggleChildrenVisibility: js.UndefOr[js.Function1[/* data */ NodeData, Unit]] = js.native
  var treeId: String = js.native
  var treeIndex: Double = js.native
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
    treeIndex: Double
  ): NodeRendererProps = {
    val __obj = js.Dynamic.literal(canDrag = canDrag.asInstanceOf[js.Any], connectDragPreview = js.Any.fromFunction2(connectDragPreview), connectDragSource = js.Any.fromFunction2(connectDragSource), didDrop = didDrop.asInstanceOf[js.Any], endDrag = endDrag.asInstanceOf[js.Any], isDragging = isDragging.asInstanceOf[js.Any], isOver = isOver.asInstanceOf[js.Any], isSearchFocus = isSearchFocus.asInstanceOf[js.Any], isSearchMatch = isSearchMatch.asInstanceOf[js.Any], listIndex = listIndex.asInstanceOf[js.Any], lowerSiblingCounts = lowerSiblingCounts.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], scaffoldBlockPxWidth = scaffoldBlockPxWidth.asInstanceOf[js.Any], startDrag = startDrag.asInstanceOf[js.Any], treeId = treeId.asInstanceOf[js.Any], treeIndex = treeIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeRendererProps]
  }
  @scala.inline
  implicit class NodeRendererPropsOps[Self <: NodeRendererProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanDrag(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canDrag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnectDragPreview(
      value: (/* elementOrNode */ ConnectableElement, /* options */ js.UndefOr[DragPreviewOptions]) => ReactElement | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectDragPreview")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withConnectDragSource(
      value: (/* elementOrNode */ ConnectableElement, /* options */ js.UndefOr[DragSourceOptions]) => ReactElement | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectDragSource")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDidDrop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("didDrop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndDrag(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDrag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsDragging(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDragging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsOver(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsSearchFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSearchFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsSearchMatch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSearchMatch")(value.asInstanceOf[js.Any])
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
    def withStartDrag(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDrag")(value.asInstanceOf[js.Any])
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
    def withButtons(value: js.Array[ReactElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttons")(js.undefined)
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
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
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
    def withIcons(value: js.Array[ReactElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icons")(js.undefined)
        ret
    }
    @scala.inline
    def withParentNode(value: TreeItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentNode")(js.undefined)
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
    def withSubtitle(value: /* data */ NodeData => ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSubtitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitle")(js.undefined)
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
    @scala.inline
    def withTitle(value: /* data */ NodeData => ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withToggleChildrenVisibility(value: /* data */ NodeData => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleChildrenVisibility")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutToggleChildrenVisibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleChildrenVisibility")(js.undefined)
        ret
    }
  }
  
}

