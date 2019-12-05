package typingsSlinky.atBlueprintjsTable.libEsmTableBodyMod

import org.scalajs.dom.raw.KeyboardEvent
import org.scalajs.dom.raw.MouseEvent
import slinky.core.facade.ReactElement
import typingsSlinky.atBlueprintjsTable.libEsmCommonCellMod.IFocusedCellCoordinates
import typingsSlinky.atBlueprintjsTable.libEsmCommonGridMod.Grid
import typingsSlinky.atBlueprintjsTable.libEsmCommonRectMod.Rect
import typingsSlinky.atBlueprintjsTable.libEsmCommonRenderModeMod.RenderMode.BATCH
import typingsSlinky.atBlueprintjsTable.libEsmCommonRenderModeMod.RenderMode.NONE
import typingsSlinky.atBlueprintjsTable.libEsmInteractionsDraggableMod.ICoordinateData
import typingsSlinky.atBlueprintjsTable.libEsmInteractionsMenusMenuContextMod.IContextMenuRenderer
import typingsSlinky.atBlueprintjsTable.libEsmInteractionsMenusMenuContextMod.IMenuContext
import typingsSlinky.atBlueprintjsTable.libEsmInteractionsSelectableMod.ISelectedRegionTransform
import typingsSlinky.atBlueprintjsTable.libEsmLocatorMod.ILocator
import typingsSlinky.atBlueprintjsTable.libEsmRegionsMod.IRegion
import typingsSlinky.atBlueprintjsTable.libEsmTableBodyCellsMod.ITableBodyCellsProps
import typingsSlinky.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBlueprintjsTable.libEsmInteractionsSelectableMod.ISelectableProps because var conflicts: focusedCell. Inlined enableMultipleSelection, onFocusedCell, onSelection, onSelectionEnd, selectedRegions, selectedRegionTransform */ trait ITableBodyProps extends ITableBodyCellsProps {
  /**
    * An optional callback for displaying a context menu when right-clicking
    * on the table body. The callback is supplied with an `IMenuContext`
    * containing the `IRegion`s of interest.
    */
  var bodyContextMenuRenderer: js.UndefOr[IContextMenuRenderer] = js.undefined
  /**
    * If `false`, only a single region of a single column/row/cell may be
    * selected at one time. Using `ctrl` or `meta` key will have no effect,
    * and a mouse drag will select the current column/row/cell only.
    * @default false
    */
  var enableMultipleSelection: js.UndefOr[Boolean] = js.undefined
  /**
    * Locates the row/column/cell given a mouse event.
    */
  var locator: ILocator
  /**
    * The number of columns to freeze to the left side of the table, counting from the leftmost column.
    */
  var numFrozenColumns: js.UndefOr[Double] = js.undefined
  /**
    * The number of rows to freeze to the top of the table, counting from the topmost row.
    */
  var numFrozenRows: js.UndefOr[Double] = js.undefined
  /**
    * An additional convenience callback invoked when the user releases the
    * mouse from either a click or a drag, indicating that the selection
    * interaction has ended.
    */
  var onSelectionEnd: js.UndefOr[js.Function1[/* regions */ js.Array[IRegion], Unit]] = js.undefined
  /**
    * An optional transform function that will be applied to the located
    * `Region`.
    *
    * This allows you to, for example, convert cell `Region`s into row
    * `Region`s while maintaining the existing multi-select and meta-click
    * functionality.
    */
  var selectedRegionTransform: js.UndefOr[ISelectedRegionTransform] = js.undefined
  /**
    * An array containing the table's selection Regions.
    * @default []
    */
  var selectedRegions: js.UndefOr[js.Array[IRegion]] = js.undefined
  /**
    * When the user focuses something, this callback is called with new
    * focused cell coordinates. This should be considered the new focused cell
    * state for the entire table.
    */
  def onFocusedCell(focusedCell: IFocusedCellCoordinates): Unit
  /**
    * When the user selects something, this callback is called with a new
    * array of `Region`s. This array should be considered the new selection
    * state for the entire table.
    */
  def onSelection(regions: js.Array[IRegion]): Unit
}

object ITableBodyProps {
  @scala.inline
  def apply(
    cellRenderer: (/* rowIndex */ Double, /* columnIndex */ Double) => ReactElement,
    columnIndexEnd: Double,
    columnIndexStart: Double,
    grid: Grid,
    loading: Boolean,
    locator: ILocator,
    onFocusedCell: IFocusedCellCoordinates => Unit,
    onSelection: js.Array[IRegion] => Unit,
    rowIndexEnd: Double,
    rowIndexStart: Double,
    viewportRect: Rect,
    bodyContextMenuRenderer: /* context */ IMenuContext => Element = null,
    className: String = null,
    enableMultipleSelection: js.UndefOr[Boolean] = js.undefined,
    focusedCell: IFocusedCellCoordinates = null,
    numFrozenColumns: Int | Double = null,
    numFrozenRows: Int | Double = null,
    onCompleteRender: () => Unit = null,
    onSelectionEnd: /* regions */ js.Array[IRegion] => Unit = null,
    renderMode: BATCH | NONE = null,
    selectedRegionTransform: (/* region */ IRegion, /* event */ MouseEvent | KeyboardEvent, /* coords */ js.UndefOr[ICoordinateData]) => IRegion = null,
    selectedRegions: js.Array[IRegion] = null
  ): ITableBodyProps = {
    val __obj = js.Dynamic.literal(cellRenderer = js.Any.fromFunction2(cellRenderer), columnIndexEnd = columnIndexEnd.asInstanceOf[js.Any], columnIndexStart = columnIndexStart.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], locator = locator.asInstanceOf[js.Any], onFocusedCell = js.Any.fromFunction1(onFocusedCell), onSelection = js.Any.fromFunction1(onSelection), rowIndexEnd = rowIndexEnd.asInstanceOf[js.Any], rowIndexStart = rowIndexStart.asInstanceOf[js.Any], viewportRect = viewportRect.asInstanceOf[js.Any])
    if (bodyContextMenuRenderer != null) __obj.updateDynamic("bodyContextMenuRenderer")(js.Any.fromFunction1(bodyContextMenuRenderer))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(enableMultipleSelection)) __obj.updateDynamic("enableMultipleSelection")(enableMultipleSelection.asInstanceOf[js.Any])
    if (focusedCell != null) __obj.updateDynamic("focusedCell")(focusedCell.asInstanceOf[js.Any])
    if (numFrozenColumns != null) __obj.updateDynamic("numFrozenColumns")(numFrozenColumns.asInstanceOf[js.Any])
    if (numFrozenRows != null) __obj.updateDynamic("numFrozenRows")(numFrozenRows.asInstanceOf[js.Any])
    if (onCompleteRender != null) __obj.updateDynamic("onCompleteRender")(js.Any.fromFunction0(onCompleteRender))
    if (onSelectionEnd != null) __obj.updateDynamic("onSelectionEnd")(js.Any.fromFunction1(onSelectionEnd))
    if (renderMode != null) __obj.updateDynamic("renderMode")(renderMode.asInstanceOf[js.Any])
    if (selectedRegionTransform != null) __obj.updateDynamic("selectedRegionTransform")(js.Any.fromFunction3(selectedRegionTransform))
    if (selectedRegions != null) __obj.updateDynamic("selectedRegions")(selectedRegions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITableBodyProps]
  }
}

