package typingsSlinky.blueprintjsTable.tableBodyMod

import org.scalajs.dom.raw.KeyboardEvent
import org.scalajs.dom.raw.MouseEvent
import slinky.core.facade.ReactElement
import typingsSlinky.blueprintjsTable.commonCellMod.IFocusedCellCoordinates
import typingsSlinky.blueprintjsTable.draggableMod.ICoordinateData
import typingsSlinky.blueprintjsTable.esmRegionsMod.IRegion
import typingsSlinky.blueprintjsTable.gridMod.Grid
import typingsSlinky.blueprintjsTable.locatorMod.ILocator
import typingsSlinky.blueprintjsTable.menuContextMod.IContextMenuRenderer
import typingsSlinky.blueprintjsTable.menuContextMod.IMenuContext
import typingsSlinky.blueprintjsTable.rectMod.Rect
import typingsSlinky.blueprintjsTable.selectableMod.ISelectedRegionTransform
import typingsSlinky.blueprintjsTable.tableBodyCellsMod.ITableBodyCellsProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.blueprintjsTable.selectableMod.ISelectableProps because var conflicts: focusedCell. Inlined enableMultipleSelection, onFocusedCell, onSelection, onSelectionEnd, selectedRegions, selectedRegionTransform */ @js.native
trait ITableBodyProps extends ITableBodyCellsProps {
  /**
    * An optional callback for displaying a context menu when right-clicking
    * on the table body. The callback is supplied with an `IMenuContext`
    * containing the `IRegion`s of interest.
    */
  var bodyContextMenuRenderer: js.UndefOr[IContextMenuRenderer] = js.native
  /**
    * If `false`, only a single region of a single column/row/cell may be
    * selected at one time. Using `ctrl` or `meta` key will have no effect,
    * and a mouse drag will select the current column/row/cell only.
    * @default false
    */
  var enableMultipleSelection: js.UndefOr[Boolean] = js.native
  /**
    * Locates the row/column/cell given a mouse event.
    */
  var locator: ILocator = js.native
  /**
    * The number of columns to freeze to the left side of the table, counting from the leftmost column.
    */
  var numFrozenColumns: js.UndefOr[Double] = js.native
  /**
    * The number of rows to freeze to the top of the table, counting from the topmost row.
    */
  var numFrozenRows: js.UndefOr[Double] = js.native
  /**
    * An additional convenience callback invoked when the user releases the
    * mouse from either a click or a drag, indicating that the selection
    * interaction has ended.
    */
  var onSelectionEnd: js.UndefOr[js.Function1[/* regions */ js.Array[IRegion], Unit]] = js.native
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
    * An array containing the table's selection Regions.
    * @default []
    */
  var selectedRegions: js.UndefOr[js.Array[IRegion]] = js.native
  /**
    * When the user focuses something, this callback is called with new
    * focused cell coordinates. This should be considered the new focused cell
    * state for the entire table.
    */
  def onFocusedCell(focusedCell: IFocusedCellCoordinates): Unit = js.native
  /**
    * When the user selects something, this callback is called with a new
    * array of `Region`s. This array should be considered the new selection
    * state for the entire table.
    */
  def onSelection(regions: js.Array[IRegion]): Unit = js.native
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
    viewportRect: Rect
  ): ITableBodyProps = {
    val __obj = js.Dynamic.literal(cellRenderer = js.Any.fromFunction2(cellRenderer), columnIndexEnd = columnIndexEnd.asInstanceOf[js.Any], columnIndexStart = columnIndexStart.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], locator = locator.asInstanceOf[js.Any], onFocusedCell = js.Any.fromFunction1(onFocusedCell), onSelection = js.Any.fromFunction1(onSelection), rowIndexEnd = rowIndexEnd.asInstanceOf[js.Any], rowIndexStart = rowIndexStart.asInstanceOf[js.Any], viewportRect = viewportRect.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITableBodyProps]
  }
  @scala.inline
  implicit class ITableBodyPropsOps[Self <: ITableBodyProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocator(value: ILocator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnFocusedCell(value: IFocusedCellCoordinates => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocusedCell")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnSelection(value: js.Array[IRegion] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelection")(js.Any.fromFunction1(value))
        ret
    }
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
    def withOnSelectionEnd(value: /* regions */ js.Array[IRegion] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectionEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSelectionEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectionEnd")(js.undefined)
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
  }
  
}

