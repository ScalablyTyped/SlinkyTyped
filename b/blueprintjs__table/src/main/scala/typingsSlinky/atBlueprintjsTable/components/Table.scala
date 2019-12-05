package typingsSlinky.atBlueprintjsTable.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.KeyboardEvent
import org.scalajs.dom.raw.MouseEvent
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.atBlueprintjsTable.libEsmCommonCellMod.IFocusedCellCoordinates
import typingsSlinky.atBlueprintjsTable.libEsmCommonGridMod.IColumnIndices
import typingsSlinky.atBlueprintjsTable.libEsmCommonGridMod.IRowIndices
import typingsSlinky.atBlueprintjsTable.libEsmCommonRenderModeMod.RenderMode
import typingsSlinky.atBlueprintjsTable.libEsmInteractionsDraggableMod.ICoordinateData
import typingsSlinky.atBlueprintjsTable.libEsmInteractionsMenusMenuContextMod.IMenuContext
import typingsSlinky.atBlueprintjsTable.libEsmRegionsMod.IRegion
import typingsSlinky.atBlueprintjsTable.libEsmRegionsMod.IStyledRegionGroup
import typingsSlinky.atBlueprintjsTable.libEsmRegionsMod.RegionCardinality
import typingsSlinky.atBlueprintjsTable.libEsmRegionsMod.TableLoadingOption
import typingsSlinky.atBlueprintjsTable.libEsmTableMod.ITableProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Table
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.atBlueprintjsTable.libEsmTableMod.Table] {
  @JSImport("@blueprintjs/table/lib/esm/table", "Table")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, onCopy */
  def apply(
    bodyContextMenuRenderer: /* context */ IMenuContext => typingsSlinky.react.reactMod._Global_.JSX.Element = null,
    columnWidths: js.Array[js.UndefOr[Double | Null]] = null,
    defaultColumnWidth: Int | Double = null,
    defaultRowHeight: Int | Double = null,
    enableColumnInteractionBar: js.UndefOr[Boolean] = js.undefined,
    enableColumnReordering: js.UndefOr[Boolean] = js.undefined,
    enableColumnResizing: js.UndefOr[Boolean] = js.undefined,
    enableFocusedCell: js.UndefOr[Boolean] = js.undefined,
    enableGhostCells: js.UndefOr[Boolean] = js.undefined,
    enableMultipleSelection: js.UndefOr[Boolean] = js.undefined,
    enableRowHeader: js.UndefOr[Boolean] = js.undefined,
    enableRowReordering: js.UndefOr[Boolean] = js.undefined,
    enableRowResizing: js.UndefOr[Boolean] = js.undefined,
    focusedCell: IFocusedCellCoordinates = null,
    forceRerenderOnSelectionChange: js.UndefOr[Boolean] = js.undefined,
    getCellClipboardData: (/* row */ Double, /* col */ Double) => _ = null,
    loadingOptions: js.Array[TableLoadingOption] = null,
    maxColumnWidth: Int | Double = null,
    maxRowHeight: Int | Double = null,
    minColumnWidth: Int | Double = null,
    minRowHeight: Int | Double = null,
    numFrozenColumns: Int | Double = null,
    numFrozenRows: Int | Double = null,
    numRows: Int | Double = null,
    onColumnWidthChanged: (/* index */ Double, /* size */ Double) => Unit = null,
    onColumnsReordered: (/* oldIndex */ Double, /* newIndex */ Double, /* length */ Double) => Unit = null,
    onCompleteRender: () => Unit = null,
    onFocusedCell: /* focusedCell */ IFocusedCellCoordinates => Unit = null,
    onRowHeightChanged: (/* index */ Double, /* size */ Double) => Unit = null,
    onRowsReordered: (/* oldIndex */ Double, /* newIndex */ Double, /* length */ Double) => Unit = null,
    onSelection: /* selectedRegions */ js.Array[IRegion] => Unit = null,
    onVisibleCellsChange: (/* rowIndices */ IRowIndices, /* columnIndices */ IColumnIndices) => Unit = null,
    renderMode: RenderMode = null,
    rowHeaderCellRenderer: /* rowIndex */ Double => ReactElement = null,
    rowHeights: js.Array[js.UndefOr[Double | Null]] = null,
    selectedRegionTransform: (/* region */ IRegion, /* event */ MouseEvent | KeyboardEvent, /* coords */ js.UndefOr[ICoordinateData]) => IRegion = null,
    selectedRegions: js.Array[IRegion] = null,
    selectionModes: js.Array[RegionCardinality] = null,
    styledRegionGroups: js.Array[IStyledRegionGroup] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.atBlueprintjsTable.libEsmTableMod.Table] = {
    val __obj = js.Dynamic.literal()
    if (bodyContextMenuRenderer != null) __obj.updateDynamic("bodyContextMenuRenderer")(js.Any.fromFunction1(bodyContextMenuRenderer))
    if (columnWidths != null) __obj.updateDynamic("columnWidths")(columnWidths.asInstanceOf[js.Any])
    if (defaultColumnWidth != null) __obj.updateDynamic("defaultColumnWidth")(defaultColumnWidth.asInstanceOf[js.Any])
    if (defaultRowHeight != null) __obj.updateDynamic("defaultRowHeight")(defaultRowHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(enableColumnInteractionBar)) __obj.updateDynamic("enableColumnInteractionBar")(enableColumnInteractionBar.asInstanceOf[js.Any])
    if (!js.isUndefined(enableColumnReordering)) __obj.updateDynamic("enableColumnReordering")(enableColumnReordering.asInstanceOf[js.Any])
    if (!js.isUndefined(enableColumnResizing)) __obj.updateDynamic("enableColumnResizing")(enableColumnResizing.asInstanceOf[js.Any])
    if (!js.isUndefined(enableFocusedCell)) __obj.updateDynamic("enableFocusedCell")(enableFocusedCell.asInstanceOf[js.Any])
    if (!js.isUndefined(enableGhostCells)) __obj.updateDynamic("enableGhostCells")(enableGhostCells.asInstanceOf[js.Any])
    if (!js.isUndefined(enableMultipleSelection)) __obj.updateDynamic("enableMultipleSelection")(enableMultipleSelection.asInstanceOf[js.Any])
    if (!js.isUndefined(enableRowHeader)) __obj.updateDynamic("enableRowHeader")(enableRowHeader.asInstanceOf[js.Any])
    if (!js.isUndefined(enableRowReordering)) __obj.updateDynamic("enableRowReordering")(enableRowReordering.asInstanceOf[js.Any])
    if (!js.isUndefined(enableRowResizing)) __obj.updateDynamic("enableRowResizing")(enableRowResizing.asInstanceOf[js.Any])
    if (focusedCell != null) __obj.updateDynamic("focusedCell")(focusedCell.asInstanceOf[js.Any])
    if (!js.isUndefined(forceRerenderOnSelectionChange)) __obj.updateDynamic("forceRerenderOnSelectionChange")(forceRerenderOnSelectionChange.asInstanceOf[js.Any])
    if (getCellClipboardData != null) __obj.updateDynamic("getCellClipboardData")(js.Any.fromFunction2(getCellClipboardData))
    if (loadingOptions != null) __obj.updateDynamic("loadingOptions")(loadingOptions.asInstanceOf[js.Any])
    if (maxColumnWidth != null) __obj.updateDynamic("maxColumnWidth")(maxColumnWidth.asInstanceOf[js.Any])
    if (maxRowHeight != null) __obj.updateDynamic("maxRowHeight")(maxRowHeight.asInstanceOf[js.Any])
    if (minColumnWidth != null) __obj.updateDynamic("minColumnWidth")(minColumnWidth.asInstanceOf[js.Any])
    if (minRowHeight != null) __obj.updateDynamic("minRowHeight")(minRowHeight.asInstanceOf[js.Any])
    if (numFrozenColumns != null) __obj.updateDynamic("numFrozenColumns")(numFrozenColumns.asInstanceOf[js.Any])
    if (numFrozenRows != null) __obj.updateDynamic("numFrozenRows")(numFrozenRows.asInstanceOf[js.Any])
    if (numRows != null) __obj.updateDynamic("numRows")(numRows.asInstanceOf[js.Any])
    if (onColumnWidthChanged != null) __obj.updateDynamic("onColumnWidthChanged")(js.Any.fromFunction2(onColumnWidthChanged))
    if (onColumnsReordered != null) __obj.updateDynamic("onColumnsReordered")(js.Any.fromFunction3(onColumnsReordered))
    if (onCompleteRender != null) __obj.updateDynamic("onCompleteRender")(js.Any.fromFunction0(onCompleteRender))
    if (onFocusedCell != null) __obj.updateDynamic("onFocusedCell")(js.Any.fromFunction1(onFocusedCell))
    if (onRowHeightChanged != null) __obj.updateDynamic("onRowHeightChanged")(js.Any.fromFunction2(onRowHeightChanged))
    if (onRowsReordered != null) __obj.updateDynamic("onRowsReordered")(js.Any.fromFunction3(onRowsReordered))
    if (onSelection != null) __obj.updateDynamic("onSelection")(js.Any.fromFunction1(onSelection))
    if (onVisibleCellsChange != null) __obj.updateDynamic("onVisibleCellsChange")(js.Any.fromFunction2(onVisibleCellsChange))
    if (renderMode != null) __obj.updateDynamic("renderMode")(renderMode.asInstanceOf[js.Any])
    if (rowHeaderCellRenderer != null) __obj.updateDynamic("rowHeaderCellRenderer")(js.Any.fromFunction1(rowHeaderCellRenderer))
    if (rowHeights != null) __obj.updateDynamic("rowHeights")(rowHeights.asInstanceOf[js.Any])
    if (selectedRegionTransform != null) __obj.updateDynamic("selectedRegionTransform")(js.Any.fromFunction3(selectedRegionTransform))
    if (selectedRegions != null) __obj.updateDynamic("selectedRegions")(selectedRegions.asInstanceOf[js.Any])
    if (selectionModes != null) __obj.updateDynamic("selectionModes")(selectionModes.asInstanceOf[js.Any])
    if (styledRegionGroups != null) __obj.updateDynamic("styledRegionGroups")(styledRegionGroups.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ITableProps
}

