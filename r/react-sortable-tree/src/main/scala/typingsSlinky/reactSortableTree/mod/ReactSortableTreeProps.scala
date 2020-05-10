package typingsSlinky.reactSortableTree.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.reactSortableTree.reactSortableTreeStrings.ltr
import typingsSlinky.reactSortableTree.reactSortableTreeStrings.rtl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactSortableTreeProps extends ThemeTreeProps {
  var canDrag: js.UndefOr[(js.Function1[/* data */ ExtendedNodeData, Boolean]) | Boolean] = js.native
  var canDrop: js.UndefOr[js.Function1[/* data */ OnDragPreviousAndNextLocation with NodeData, Boolean]] = js.native
  var canNodeHaveChildren: js.UndefOr[js.Function1[/* node */ TreeItem, Boolean]] = js.native
  var className: js.UndefOr[String] = js.native
  var dndType: js.UndefOr[String] = js.native
  var generateNodeProps: js.UndefOr[js.Function1[/* data */ ExtendedNodeData, StringDictionary[_]]] = js.native
  var getNodeKey: js.UndefOr[js.Function1[/* data */ TreeNode with TreeIndex, String | Double]] = js.native
  var isVirtualized: js.UndefOr[Boolean] = js.native
  var maxDepth: js.UndefOr[Double] = js.native
  var onDragStateChanged: js.UndefOr[js.Function1[/* data */ OnDragStateChangedData, Unit]] = js.native
  var onMoveNode: js.UndefOr[
    js.Function1[/* data */ NodeData with FullTree with OnMovePreviousAndNextLocation, Unit]
  ] = js.native
  var onVisibilityToggle: js.UndefOr[js.Function1[/* data */ OnVisibilityToggleData, Unit]] = js.native
  var onlyExpandSearchedNodes: js.UndefOr[Boolean] = js.native
  var rowDirection: js.UndefOr[ltr | rtl] = js.native
  var searchFinishCallback: js.UndefOr[js.Function1[/* matches */ js.Array[NodeData], Unit]] = js.native
  var searchFocusOffset: js.UndefOr[Double] = js.native
  var searchMethod: js.UndefOr[js.Function1[/* data */ SearchData, Boolean]] = js.native
  var searchQuery: js.UndefOr[String | js.Any] = js.native
  var shouldCopyOnOutsideDrop: js.UndefOr[Boolean | (js.Function1[/* data */ ShouldCopyData, Boolean])] = js.native
  var theme: js.UndefOr[ThemeProps] = js.native
  var treeData: js.Array[TreeItem] = js.native
  def onChange(treeData: js.Array[TreeItem]): Unit = js.native
}

object ReactSortableTreeProps {
  @scala.inline
  def apply(onChange: js.Array[TreeItem] => Unit, treeData: js.Array[TreeItem]): ReactSortableTreeProps = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange), treeData = treeData.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactSortableTreeProps]
  }
  @scala.inline
  implicit class ReactSortableTreePropsOps[Self <: ReactSortableTreeProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnChange(value: js.Array[TreeItem] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTreeData(value: js.Array[TreeItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanDragFunction1(value: /* data */ ExtendedNodeData => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canDrag")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCanDrag(value: (js.Function1[/* data */ ExtendedNodeData, Boolean]) | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canDrag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanDrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canDrag")(js.undefined)
        ret
    }
    @scala.inline
    def withCanDrop(value: /* data */ OnDragPreviousAndNextLocation with NodeData => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canDrop")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCanDrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canDrop")(js.undefined)
        ret
    }
    @scala.inline
    def withCanNodeHaveChildren(value: /* node */ TreeItem => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canNodeHaveChildren")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCanNodeHaveChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canNodeHaveChildren")(js.undefined)
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
    def withDndType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dndType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDndType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dndType")(js.undefined)
        ret
    }
    @scala.inline
    def withGenerateNodeProps(value: /* data */ ExtendedNodeData => StringDictionary[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateNodeProps")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGenerateNodeProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateNodeProps")(js.undefined)
        ret
    }
    @scala.inline
    def withGetNodeKey(value: /* data */ TreeNode with TreeIndex => String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNodeKey")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetNodeKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNodeKey")(js.undefined)
        ret
    }
    @scala.inline
    def withIsVirtualized(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVirtualized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsVirtualized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVirtualized")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxDepth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDepth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxDepth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDepth")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragStateChanged(value: /* data */ OnDragStateChangedData => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragStateChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDragStateChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragStateChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMoveNode(value: /* data */ NodeData with FullTree with OnMovePreviousAndNextLocation => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMoveNode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMoveNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMoveNode")(js.undefined)
        ret
    }
    @scala.inline
    def withOnVisibilityToggle(value: /* data */ OnVisibilityToggleData => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onVisibilityToggle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnVisibilityToggle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onVisibilityToggle")(js.undefined)
        ret
    }
    @scala.inline
    def withOnlyExpandSearchedNodes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyExpandSearchedNodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnlyExpandSearchedNodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyExpandSearchedNodes")(js.undefined)
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
    def withSearchFinishCallback(value: /* matches */ js.Array[NodeData] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchFinishCallback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSearchFinishCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchFinishCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchFocusOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchFocusOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchFocusOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchFocusOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchMethod(value: /* data */ SearchData => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchMethod")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSearchMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchQuery(value: String | js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchQuery")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldCopyOnOutsideDropFunction1(value: /* data */ ShouldCopyData => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldCopyOnOutsideDrop")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShouldCopyOnOutsideDrop(value: Boolean | (js.Function1[/* data */ ShouldCopyData, Boolean])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldCopyOnOutsideDrop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShouldCopyOnOutsideDrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldCopyOnOutsideDrop")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: ThemeProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
  }
  
}

