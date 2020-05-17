package typingsSlinky.devextreme.mod.DevExpress.ui

import typingsSlinky.devextreme.anon.CellElementColumn
import typingsSlinky.devextreme.anon.ColumnIndexComponent
import typingsSlinky.devextreme.anon.DataDisplayValue
import typingsSlinky.devextreme.anon.EventType
import typingsSlinky.devextreme.anon.Grouping
import typingsSlinky.devextreme.anon.IsHighlighted
import typingsSlinky.devextreme.anon.KeyModel
import typingsSlinky.devextreme.anon.Level
import typingsSlinky.devextreme.anon.ModelRow
import typingsSlinky.devextreme.anon.Node
import typingsSlinky.devextreme.anon.ParentType
import typingsSlinky.devextreme.anon.PrevRowIndex
import typingsSlinky.devextreme.anon.ReadOnly
import typingsSlinky.devextreme.anon.Root
import typingsSlinky.devextreme.anon.RowRowElement
import typingsSlinky.devextreme.anon.Target
import typingsSlinky.devextreme.anon.Values
import typingsSlinky.devextreme.devextremeStrings.auto
import typingsSlinky.devextreme.devextremeStrings.fullBranch
import typingsSlinky.devextreme.devextremeStrings.matchOnly
import typingsSlinky.devextreme.devextremeStrings.plain
import typingsSlinky.devextreme.devextremeStrings.tree
import typingsSlinky.devextreme.devextremeStrings.withAncestors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxTreeListOptions extends GridBaseOptions[dxTreeList] {
  /** Specifies whether all rows are expanded initially. */
  var autoExpandAll: js.UndefOr[Boolean] = js.native
  /** Configures columns. */
  @JSName("columns")
  var columns_dxTreeListOptions: js.UndefOr[js.Array[dxTreeListColumn | String]] = js.native
  /** Customizes columns after they are created. */
  var customizeColumns: js.UndefOr[js.Function1[/* columns */ js.Array[dxTreeListColumn], _]] = js.native
  /** Notifies the widget of the used data structure. */
  var dataStructure: js.UndefOr[plain | tree] = js.native
  /** Configures editing. */
  @JSName("editing")
  var editing_dxTreeListOptions: js.UndefOr[dxTreeListEditing] = js.native
  /** Specifies whether nodes appear expanded or collapsed after filtering is applied. */
  var expandNodesOnFiltering: js.UndefOr[Boolean] = js.native
  /** Specifies keys of the initially expanded rows. */
  var expandedRowKeys: js.UndefOr[js.Array[_]] = js.native
  /** Specifies whether filter and search results should include matching rows only, matching rows with ancestors, or matching rows with ancestors and descendants (full branch). */
  var filterMode: js.UndefOr[fullBranch | withAncestors | matchOnly] = js.native
  /** Specifies which data field defines whether the node has children. */
  var hasItemsExpr: js.UndefOr[String | js.Function] = js.native
  /** Specifies which data field contains nested items. Set this option when your data has a hierarchical structure. */
  var itemsExpr: js.UndefOr[String | js.Function] = js.native
  /** Specifies which data field provides keys for nodes. */
  var keyExpr: js.UndefOr[String | js.Function] = js.native
  /** A function that is executed when a cell is clicked or tapped. Executed before onRowClick. */
  var onCellClick: js.UndefOr[(js.Function1[/* e */ CellElementColumn, _]) | String] = js.native
  /** A function that is executed when a cell is double-clicked or double-tapped. Executed before onRowDblClick. */
  var onCellDblClick: js.UndefOr[js.Function1[/* e */ ColumnIndexComponent, _]] = js.native
  /** A function that is executed after the pointer enters or leaves a cell. */
  var onCellHoverChanged: js.UndefOr[js.Function1[/* e */ EventType, _]] = js.native
  /** A function that is executed after a grid cell is created. */
  var onCellPrepared: js.UndefOr[js.Function1[/* e */ DataDisplayValue, _]] = js.native
  /** A function that is executed before the context menu is rendered. */
  var onContextMenuPreparing: js.UndefOr[js.Function1[/* e */ Target, _]] = js.native
  /** A function that is executed before a cell or row switches to the editing state. */
  var onEditingStart: js.UndefOr[js.Function1[/* e */ KeyModel, _]] = js.native
  /** A function that is executed after an editor is created. Not executed for cells with an editCellTemplate. */
  var onEditorPrepared: js.UndefOr[js.Function1[/* options */ ParentType, _]] = js.native
  /** A function used to customize or replace default editors. Not executed for cells with an editCellTemplate. */
  var onEditorPreparing: js.UndefOr[js.Function1[/* e */ ReadOnly, _]] = js.native
  /** A function that is executed after the focused cell changes. */
  var onFocusedCellChanged: js.UndefOr[js.Function1[/* e */ ModelRow, _]] = js.native
  /** A function that is executed before the focused cell changes. */
  var onFocusedCellChanging: js.UndefOr[js.Function1[/* e */ IsHighlighted, _]] = js.native
  /** A function that executed when the focused row changes. Applies only when focusedRowEnabled is true. */
  var onFocusedRowChanged: js.UndefOr[js.Function1[/* e */ RowRowElement, _]] = js.native
  /** A function that is executed before the focused row changes. Applies only when focusedRowEnabled is true. */
  var onFocusedRowChanging: js.UndefOr[js.Function1[/* e */ PrevRowIndex, _]] = js.native
  /** A function that is executed after the loaded nodes are initialized. */
  var onNodesInitialized: js.UndefOr[js.Function1[/* e */ Root, _]] = js.native
  /** A function that is executed when a grid row is clicked or tapped. */
  var onRowClick: js.UndefOr[(js.Function1[/* e */ Level, _]) | String] = js.native
  /** A function that is executed when a row is double-clicked or double-tapped. Executed after onCellDblClick. */
  var onRowDblClick: js.UndefOr[js.Function1[/* e */ Values, _]] = js.native
  /** A function that is executed after a row is created. */
  var onRowPrepared: js.UndefOr[js.Function1[/* e */ Node, _]] = js.native
  /** Configures paging. */
  @JSName("paging")
  var paging_dxTreeListOptions: js.UndefOr[dxTreeListPaging] = js.native
  /** Specifies which data field provides parent keys. */
  var parentIdExpr: js.UndefOr[String | js.Function] = js.native
  /** Notifies the TreeList of the server's data processing operations. Applies only if data has a plain structure. */
  var remoteOperations: js.UndefOr[Grouping | auto] = js.native
  /** Specifies the root node's identifier. Applies if dataStructure is "plain". */
  var rootValue: js.UndefOr[js.Any] = js.native
  /** Configures scrolling. */
  @JSName("scrolling")
  var scrolling_dxTreeListOptions: js.UndefOr[dxTreeListScrolling] = js.native
  /** Configures runtime selection. */
  @JSName("selection")
  var selection_dxTreeListOptions: js.UndefOr[dxTreeListSelection] = js.native
}

object dxTreeListOptions {
  @scala.inline
  def apply(): dxTreeListOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxTreeListOptions]
  }
  @scala.inline
  implicit class dxTreeListOptionsOps[Self <: dxTreeListOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoExpandAll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoExpandAll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoExpandAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoExpandAll")(js.undefined)
        ret
    }
    @scala.inline
    def withColumns(value: js.Array[dxTreeListColumn | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomizeColumns(value: /* columns */ js.Array[dxTreeListColumn] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customizeColumns")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCustomizeColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customizeColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withDataStructure(value: plain | tree): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataStructure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataStructure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataStructure")(js.undefined)
        ret
    }
    @scala.inline
    def withEditing(value: dxTreeListEditing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editing")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandNodesOnFiltering(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandNodesOnFiltering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandNodesOnFiltering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandNodesOnFiltering")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandedRowKeys(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandedRowKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandedRowKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandedRowKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterMode(value: fullBranch | withAncestors | matchOnly): Self = {
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
    def withHasItemsExpr(value: String | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasItemsExpr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasItemsExpr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasItemsExpr")(js.undefined)
        ret
    }
    @scala.inline
    def withItemsExpr(value: String | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemsExpr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemsExpr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemsExpr")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyExpr(value: String | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyExpr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyExpr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyExpr")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCellClickFunction1(value: /* e */ CellElementColumn => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCellClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnCellClick(value: (js.Function1[/* e */ CellElementColumn, _]) | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCellClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnCellClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCellClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCellDblClick(value: /* e */ ColumnIndexComponent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCellDblClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCellDblClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCellDblClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCellHoverChanged(value: /* e */ EventType => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCellHoverChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCellHoverChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCellHoverChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCellPrepared(value: /* e */ DataDisplayValue => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCellPrepared")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCellPrepared: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCellPrepared")(js.undefined)
        ret
    }
    @scala.inline
    def withOnContextMenuPreparing(value: /* e */ Target => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onContextMenuPreparing")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnContextMenuPreparing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onContextMenuPreparing")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEditingStart(value: /* e */ KeyModel => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEditingStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnEditingStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEditingStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEditorPrepared(value: /* options */ ParentType => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEditorPrepared")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnEditorPrepared: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEditorPrepared")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEditorPreparing(value: /* e */ ReadOnly => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEditorPreparing")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnEditorPreparing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEditorPreparing")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFocusedCellChanged(value: /* e */ ModelRow => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocusedCellChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnFocusedCellChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocusedCellChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFocusedCellChanging(value: /* e */ IsHighlighted => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocusedCellChanging")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnFocusedCellChanging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocusedCellChanging")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFocusedRowChanged(value: /* e */ RowRowElement => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocusedRowChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnFocusedRowChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocusedRowChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFocusedRowChanging(value: /* e */ PrevRowIndex => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocusedRowChanging")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnFocusedRowChanging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocusedRowChanging")(js.undefined)
        ret
    }
    @scala.inline
    def withOnNodesInitialized(value: /* e */ Root => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNodesInitialized")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnNodesInitialized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNodesInitialized")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRowClickFunction1(value: /* e */ Level => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnRowClick(value: (js.Function1[/* e */ Level, _]) | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnRowClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRowDblClick(value: /* e */ Values => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowDblClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRowDblClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowDblClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRowPrepared(value: /* e */ Node => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowPrepared")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRowPrepared: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowPrepared")(js.undefined)
        ret
    }
    @scala.inline
    def withPaging(value: dxTreeListPaging): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paging")(js.undefined)
        ret
    }
    @scala.inline
    def withParentIdExpr(value: String | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentIdExpr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentIdExpr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentIdExpr")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoteOperations(value: Grouping | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteOperations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoteOperations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteOperations")(js.undefined)
        ret
    }
    @scala.inline
    def withRootValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootValue")(js.undefined)
        ret
    }
    @scala.inline
    def withScrolling(value: dxTreeListScrolling): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrolling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrolling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrolling")(js.undefined)
        ret
    }
    @scala.inline
    def withSelection(value: dxTreeListSelection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection")(js.undefined)
        ret
    }
  }
  
}

