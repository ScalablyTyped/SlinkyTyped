package typingsSlinky.blueprintjsTable.tableMod

import org.scalajs.dom.raw.KeyboardEvent
import org.scalajs.dom.raw.MouseEvent
import slinky.core.facade.ReactElement
import typingsSlinky.blueprintjsCore.propsMod.IProps
import typingsSlinky.blueprintjsTable.columnHeaderMod.IColumnWidths
import typingsSlinky.blueprintjsTable.commonCellMod.IFocusedCellCoordinates
import typingsSlinky.blueprintjsTable.draggableMod.ICoordinateData
import typingsSlinky.blueprintjsTable.esmRegionsMod.IRegion
import typingsSlinky.blueprintjsTable.esmRegionsMod.IStyledRegionGroup
import typingsSlinky.blueprintjsTable.esmRegionsMod.RegionCardinality
import typingsSlinky.blueprintjsTable.esmRegionsMod.TableLoadingOption
import typingsSlinky.blueprintjsTable.gridMod.IColumnIndices
import typingsSlinky.blueprintjsTable.gridMod.IRowIndices
import typingsSlinky.blueprintjsTable.menuContextMod.IContextMenuRenderer
import typingsSlinky.blueprintjsTable.menuContextMod.IMenuContext
import typingsSlinky.blueprintjsTable.renderModeMod.RenderMode
import typingsSlinky.blueprintjsTable.resizableMod.IIndexedResizeCallback
import typingsSlinky.blueprintjsTable.rowHeaderMod.IRowHeaderRenderer
import typingsSlinky.blueprintjsTable.rowHeaderMod.IRowHeights
import typingsSlinky.blueprintjsTable.selectableMod.ISelectedRegionTransform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITableProps
  extends IProps
     with IRowHeights
     with IColumnWidths {
  /**
    * An optional callback for displaying a context menu when right-clicking
    * on the table body. The callback is supplied with an array of
    * `IRegion`s. If the mouse click was on a selection, the array will
    * contain all selected regions. Otherwise it will have one `IRegion` that
    * represents the clicked cell.
    */
  var bodyContextMenuRenderer: js.UndefOr[IContextMenuRenderer] = js.native
  /**
    * The children of a `Table` component, which must be React elements
    * that use `IColumnProps`.
    */
  var children: js.UndefOr[ReactElement | js.Array[ReactElement]] = js.native
  /**
    * A sparse number array with a length equal to the number of columns. Any
    * non-null value will be used to set the width of the column at the same
    * index. Note that if you want to update these values when the user
    * drag-resizes a column, you may define a callback for `onColumnWidthChanged`.
    */
  var columnWidths: js.UndefOr[js.Array[js.UndefOr[Double | Null]]] = js.native
  /**
    * If `true`, adds an interaction bar on top of all column header cells, and
    * moves interaction triggers into it.
    * @default false
    */
  var enableColumnInteractionBar: js.UndefOr[Boolean] = js.native
  /**
    * If `false`, disables reordering of columns.
    * @default false
    */
  var enableColumnReordering: js.UndefOr[Boolean] = js.native
  /**
    * If `false`, disables resizing of columns.
    * @default true
    */
  var enableColumnResizing: js.UndefOr[Boolean] = js.native
  /**
    * If `true`, there will be a single "focused" cell at all times,
    * which can be used to interact with the table as though it is a
    * spreadsheet. When false, no such cell will exist.
    * @default false
    */
  var enableFocusedCell: js.UndefOr[Boolean] = js.native
  /**
    * If `true`, empty space in the table container will be filled with empty
    * cells instead of a blank background.
    * @default false
    */
  var enableGhostCells: js.UndefOr[Boolean] = js.native
  /**
    * If `false`, only a single region of a single column/row/cell may be
    * selected at one time. Using `ctrl` or `meta` key will have no effect,
    * and a mouse drag will select the current column/row/cell only.
    * @default true
    */
  var enableMultipleSelection: js.UndefOr[Boolean] = js.native
  /**
    * If `false`, hides the row headers and settings menu.
    * @default true
    */
  var enableRowHeader: js.UndefOr[Boolean] = js.native
  /**
    * If `false`, disables reordering of rows.
    * @default false
    */
  var enableRowReordering: js.UndefOr[Boolean] = js.native
  /**
    * If `false`, disables resizing of rows.
    * @default true
    */
  var enableRowResizing: js.UndefOr[Boolean] = js.native
  /**
    * If defined, will set the focused cell state. This changes
    * the focused cell to controlled mode, meaning you are in charge of
    * setting the focus in response to events in the `onFocusedCell` callback.
    */
  var focusedCell: js.UndefOr[IFocusedCellCoordinates] = js.native
  /**
    * If `true`, selection state changes will cause the component to re-render.
    * If `false`, selection state is ignored when deciding to re-render.
    * @default false
    */
  var forceRerenderOnSelectionChange: js.UndefOr[Boolean] = js.native
  /**
    * If defined, this callback will be invoked for each cell when the user
    * attempts to copy a selection via `mod+c`. The returned data will be copied
    * to the clipboard and need not match the display value of the `<Cell>`.
    * The data will be invisibly added as `textContent` into the DOM before
    * copying. If not defined, keyboard copying via `mod+c` will be disabled.
    */
  var getCellClipboardData: js.UndefOr[js.Function2[/* row */ Double, /* col */ Double, _]] = js.native
  /**
    * A list of `TableLoadingOption`. Set this prop to specify whether to
    * render the loading state for the column header, row header, and body
    * sections of the table.
    */
  var loadingOptions: js.UndefOr[js.Array[TableLoadingOption]] = js.native
  /**
    * The number of columns to freeze to the left side of the table, counting
    * from the leftmost column.
    * @default 0
    */
  var numFrozenColumns: js.UndefOr[Double] = js.native
  /**
    * The number of rows to freeze to the top of the table, counting from the
    * topmost row.
    * @default 0
    */
  var numFrozenRows: js.UndefOr[Double] = js.native
  /**
    * The number of rows in the table.
    */
  var numRows: js.UndefOr[Double] = js.native
  /**
    * If resizing is enabled, this callback will be invoked when the user
    * finishes drag-resizing a column.
    */
  var onColumnWidthChanged: js.UndefOr[IIndexedResizeCallback] = js.native
  /**
    * If reordering is enabled, this callback will be invoked when the user finishes
    * drag-reordering one or more columns.
    */
  var onColumnsReordered: js.UndefOr[
    js.Function3[/* oldIndex */ Double, /* newIndex */ Double, /* length */ Double, Unit]
  ] = js.native
  /**
    * An optional callback invoked when all cells in view have completely rendered.
    * Will be invoked on initial mount and whenever cells update (e.g., on scroll).
    */
  var onCompleteRender: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * If you want to do something after the copy or if you want to notify the
    * user if a copy fails, you may provide this optional callback.
    *
    * Due to browser limitations, the copy can fail. This usually occurs if
    * the selection is too large, like 20,000+ cells. The copy will also fail
    * if the browser does not support the copy method (see
    * `Clipboard.isCopySupported`).
    */
  var onCopy: js.UndefOr[js.Function1[/* success */ Boolean, Unit]] = js.native
  /**
    * A callback called when the focus is changed in the table.
    */
  var onFocusedCell: js.UndefOr[js.Function1[/* focusedCell */ IFocusedCellCoordinates, Unit]] = js.native
  /**
    * If resizing is enabled, this callback will be invoked when the user
    * finishes drag-resizing a row.
    */
  var onRowHeightChanged: js.UndefOr[IIndexedResizeCallback] = js.native
  /**
    * If reordering is enabled, this callback will be invoked when the user finishes
    * drag-reordering one or more rows.
    */
  var onRowsReordered: js.UndefOr[
    js.Function3[/* oldIndex */ Double, /* newIndex */ Double, /* length */ Double, Unit]
  ] = js.native
  /**
    * A callback called when the selection is changed in the table.
    */
  var onSelection: js.UndefOr[js.Function1[/* selectedRegions */ js.Array[IRegion], Unit]] = js.native
  /**
    * A callback called when the visible cell indices change in the table.
    */
  var onVisibleCellsChange: js.UndefOr[
    js.Function2[/* rowIndices */ IRowIndices, /* columnIndices */ IColumnIndices, Unit]
  ] = js.native
  /**
    * Dictates how cells should be rendered. Supported modes are:
    * - `RenderMode.BATCH`: renders cells in batches to improve performance
    * - `RenderMode.BATCH_ON_UPDATE`: renders cells synchronously on mount and
    *   in batches on update
    * - `RenderMode.NONE`: renders cells synchronously all at once
    * @default RenderMode.BATCH_ON_UPDATE
    */
  var renderMode: js.UndefOr[RenderMode] = js.native
  /**
    * Render each row's header cell.
    */
  var rowHeaderCellRenderer: js.UndefOr[IRowHeaderRenderer] = js.native
  /**
    * A sparse number array with a length equal to the number of rows. Any
    * non-null value will be used to set the height of the row at the same
    * index. Note that if you want to update these values when the user
    * drag-resizes a row, you may define a callback for `onRowHeightChanged`.
    */
  var rowHeights: js.UndefOr[js.Array[js.UndefOr[Double | Null]]] = js.native
  /**
    * An optional transform function that will be applied to the located
    * `Region`.
    *
    * This allows you to, for example, convert cell `Region`s into row
    * `Region`s while maintaining the existing multi-select and meta-click
    * functionality.
    */
  var selectedRegionTransform: js.UndefOr[ISelectedRegionTransform] = js.native
  /**
    * If defined, will set the selected regions in the cells. If defined, this
    * changes table selection to controlled mode, meaning you in charge of
    * setting the selections in response to events in the `onSelection`
    * callback.
    *
    * Note that the `selectionModes` prop controls which types of events are
    * triggered to the `onSelection` callback, but does not restrict what
    * selection you can pass to the `selectedRegions` prop. Therefore you can,
    * for example, convert cell clicks into row selections.
    */
  var selectedRegions: js.UndefOr[js.Array[IRegion]] = js.native
  /**
    * A `SelectionModes` enum value indicating the selection mode. You may
    * equivalently provide an array of `RegionCardinality` enum values for
    * precise configuration.
    *
    * The `SelectionModes` enum values are:
    * - `ALL`
    * - `NONE`
    * - `COLUMNS_AND_CELLS`
    * - `COLUMNS_ONLY`
    * - `ROWS_AND_CELLS`
    * - `ROWS_ONLY`
    *
    * The `RegionCardinality` enum values are:
    * - `FULL_COLUMNS`
    * - `FULL_ROWS`
    * - `FULL_TABLE`
    * - `CELLS`
    *
    * @default SelectionModes.ALL
    */
  var selectionModes: js.UndefOr[js.Array[RegionCardinality]] = js.native
  /**
    * Styled region groups are rendered as overlays above the table and are
    * marked with their own `className` for custom styling.
    */
  var styledRegionGroups: js.UndefOr[js.Array[IStyledRegionGroup]] = js.native
}

object ITableProps {
  @scala.inline
  def apply(): ITableProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITableProps]
  }
  @scala.inline
  implicit class ITablePropsOps[Self <: ITableProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBodyContextMenuRenderer(value: /* context */ IMenuContext => ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyContextMenuRenderer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBodyContextMenuRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyContextMenuRenderer")(js.undefined)
        ret
    }
    @scala.inline
    def withChildrenReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: ReactElement | js.Array[ReactElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnWidths(value: js.Array[js.UndefOr[Double | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnWidths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnWidths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnWidths")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableColumnInteractionBar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableColumnInteractionBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableColumnInteractionBar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableColumnInteractionBar")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableColumnReordering(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableColumnReordering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableColumnReordering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableColumnReordering")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableColumnResizing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableColumnResizing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableColumnResizing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableColumnResizing")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableFocusedCell(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableFocusedCell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableFocusedCell: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableFocusedCell")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableGhostCells(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableGhostCells")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableGhostCells: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableGhostCells")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableMultipleSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableMultipleSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableMultipleSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableMultipleSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableRowHeader(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRowHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableRowHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRowHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableRowReordering(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRowReordering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableRowReordering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRowReordering")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableRowResizing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRowResizing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableRowResizing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRowResizing")(js.undefined)
        ret
    }
    @scala.inline
    def withFocusedCell(value: IFocusedCellCoordinates): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusedCell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocusedCell: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusedCell")(js.undefined)
        ret
    }
    @scala.inline
    def withForceRerenderOnSelectionChange(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceRerenderOnSelectionChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceRerenderOnSelectionChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceRerenderOnSelectionChange")(js.undefined)
        ret
    }
    @scala.inline
    def withGetCellClipboardData(value: (/* row */ Double, /* col */ Double) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCellClipboardData")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGetCellClipboardData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCellClipboardData")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadingOptions(value: js.Array[TableLoadingOption]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadingOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withNumFrozenColumns(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numFrozenColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumFrozenColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numFrozenColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withNumFrozenRows(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numFrozenRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumFrozenRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numFrozenRows")(js.undefined)
        ret
    }
    @scala.inline
    def withNumRows(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numRows")(js.undefined)
        ret
    }
    @scala.inline
    def withOnColumnWidthChanged(value: (/* index */ Double, /* size */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onColumnWidthChanged")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnColumnWidthChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onColumnWidthChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withOnColumnsReordered(value: (/* oldIndex */ Double, /* newIndex */ Double, /* length */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onColumnsReordered")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnColumnsReordered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onColumnsReordered")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCompleteRender(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCompleteRender")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnCompleteRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCompleteRender")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCopy(value: /* success */ Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCopy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCopy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCopy")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFocusedCell(value: /* focusedCell */ IFocusedCellCoordinates => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocusedCell")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnFocusedCell: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocusedCell")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRowHeightChanged(value: (/* index */ Double, /* size */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowHeightChanged")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRowHeightChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowHeightChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRowsReordered(value: (/* oldIndex */ Double, /* newIndex */ Double, /* length */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowsReordered")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnRowsReordered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowsReordered")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelection(value: /* selectedRegions */ js.Array[IRegion] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelection")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withOnVisibleCellsChange(value: (/* rowIndices */ IRowIndices, /* columnIndices */ IColumnIndices) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onVisibleCellsChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnVisibleCellsChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onVisibleCellsChange")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderMode(value: RenderMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderMode")(js.undefined)
        ret
    }
    @scala.inline
    def withRowHeaderCellRenderer(value: /* rowIndex */ Double => ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHeaderCellRenderer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRowHeaderCellRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHeaderCellRenderer")(js.undefined)
        ret
    }
    @scala.inline
    def withRowHeights(value: js.Array[js.UndefOr[Double | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHeights")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowHeights: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHeights")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedRegionTransform(
      value: (/* region */ IRegion, /* event */ MouseEvent | KeyboardEvent, /* coords */ js.UndefOr[ICoordinateData]) => IRegion
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedRegionTransform")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutSelectedRegionTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedRegionTransform")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedRegions(value: js.Array[IRegion]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedRegions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedRegions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedRegions")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionModes(value: js.Array[RegionCardinality]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionModes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionModes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionModes")(js.undefined)
        ret
    }
    @scala.inline
    def withStyledRegionGroups(value: js.Array[IStyledRegionGroup]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styledRegionGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyledRegionGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styledRegionGroups")(js.undefined)
        ret
    }
  }
  
}

