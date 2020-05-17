package typingsSlinky.primereact.treeMod

import slinky.core.facade.ReactElement
import typingsSlinky.primereact.anon.NodeOriginalEvent
import typingsSlinky.primereact.anon.Value
import typingsSlinky.primereact.treeNodeMod.TreeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeProps extends js.Object {
  var className: js.UndefOr[String] = js.native
  var contentClassName: js.UndefOr[String] = js.native
  var contentStyle: js.UndefOr[js.Object] = js.native
  var contextMenuSelectionKey: js.UndefOr[js.Any] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var dragdropScope: js.UndefOr[String] = js.native
  var expandedKeys: js.UndefOr[js.Any] = js.native
  var filter: js.UndefOr[Boolean] = js.native
  var filterBy: js.UndefOr[js.Any] = js.native
  var filterMode: js.UndefOr[String] = js.native
  var filterPlaceholder: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var loading: js.UndefOr[Boolean] = js.native
  var loadingIcon: js.UndefOr[String] = js.native
  var metaKeySelection: js.UndefOr[Boolean] = js.native
  var nodeTemplate: js.UndefOr[js.Function1[/* node */ js.Any, ReactElement]] = js.native
  var onCollapse: js.UndefOr[js.Function1[/* e */ NodeOriginalEvent, Unit]] = js.native
  var onContextMenu: js.UndefOr[js.Function1[/* e */ NodeOriginalEvent, Unit]] = js.native
  var onContextMenuSelectionChange: js.UndefOr[js.Function1[/* e */ Value, Unit]] = js.native
  var onDragDrop: js.UndefOr[js.Function1[/* e */ Value, Unit]] = js.native
  var onExpand: js.UndefOr[js.Function1[/* e */ NodeOriginalEvent, Unit]] = js.native
  var onSelect: js.UndefOr[js.Function1[/* e */ NodeOriginalEvent, Unit]] = js.native
  var onSelectionChange: js.UndefOr[js.Function1[/* e */ Value, Unit]] = js.native
  var onToggle: js.UndefOr[js.Function1[/* e */ Value, Unit]] = js.native
  var onUnselect: js.UndefOr[js.Function1[/* e */ NodeOriginalEvent, Unit]] = js.native
  var propagateSelectionDown: js.UndefOr[Boolean] = js.native
  var propagateSelectionUp: js.UndefOr[Boolean] = js.native
  var selectionKeys: js.UndefOr[js.Any] = js.native
  var selectionMode: js.UndefOr[String] = js.native
  var style: js.UndefOr[js.Object] = js.native
  var value: js.UndefOr[js.Array[TreeNode]] = js.native
}

object TreeProps {
  @scala.inline
  def apply(): TreeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeProps]
  }
  @scala.inline
  implicit class TreePropsOps[Self <: TreeProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withContentClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withContentStyle(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withContextMenuSelectionKey(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextMenuSelectionKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContextMenuSelectionKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextMenuSelectionKey")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withDragdropScope(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragdropScope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragdropScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragdropScope")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandedKeys(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandedKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandedKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandedKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterBy(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterBy")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterMode")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterPlaceholder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterPlaceholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterPlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterPlaceholder")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withLoading(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loading")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadingIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadingIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withMetaKeySelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metaKeySelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetaKeySelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metaKeySelection")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeTemplate(value: /* node */ js.Any => ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeTemplate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutNodeTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCollapse(value: /* e */ NodeOriginalEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCollapse")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCollapse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCollapse")(js.undefined)
        ret
    }
    @scala.inline
    def withOnContextMenu(value: /* e */ NodeOriginalEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onContextMenu")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnContextMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onContextMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withOnContextMenuSelectionChange(value: /* e */ Value => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onContextMenuSelectionChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnContextMenuSelectionChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onContextMenuSelectionChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragDrop(value: /* e */ Value => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragDrop")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDragDrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragDrop")(js.undefined)
        ret
    }
    @scala.inline
    def withOnExpand(value: /* e */ NodeOriginalEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExpand")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnExpand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExpand")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelect(value: /* e */ NodeOriginalEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelectionChange(value: /* e */ Value => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectionChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSelectionChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectionChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnToggle(value: /* e */ Value => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onToggle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnToggle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onToggle")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUnselect(value: /* e */ NodeOriginalEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUnselect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnUnselect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUnselect")(js.undefined)
        ret
    }
    @scala.inline
    def withPropagateSelectionDown(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propagateSelectionDown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPropagateSelectionDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propagateSelectionDown")(js.undefined)
        ret
    }
    @scala.inline
    def withPropagateSelectionUp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propagateSelectionUp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPropagateSelectionUp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propagateSelectionUp")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionKeys(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionMode")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: js.Object): Self = {
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
    def withValue(value: js.Array[TreeNode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

