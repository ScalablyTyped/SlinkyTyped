package typingsSlinky.blueprintjsTable.tableBodyMod

import org.scalajs.dom.raw.KeyboardEvent
import org.scalajs.dom.raw.MouseEvent
import slinky.core.facade.ReactElement
import typingsSlinky.blueprintjsTable.commonCellMod.IFocusedCellCoordinates
import typingsSlinky.blueprintjsTable.dragTypesMod.ICoordinateData
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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLocator(value: ILocator): Self = this.set("locator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnFocusedCell(value: IFocusedCellCoordinates => Unit): Self = this.set("onFocusedCell", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSelection(value: js.Array[IRegion] => Unit): Self = this.set("onSelection", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBodyContextMenuRenderer(value: /* context */ IMenuContext => ReactElement): Self = this.set("bodyContextMenuRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBodyContextMenuRenderer: Self = this.set("bodyContextMenuRenderer", js.undefined)
    
    @scala.inline
    def setEnableMultipleSelection(value: Boolean): Self = this.set("enableMultipleSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableMultipleSelection: Self = this.set("enableMultipleSelection", js.undefined)
    
    @scala.inline
    def setNumFrozenColumns(value: Double): Self = this.set("numFrozenColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumFrozenColumns: Self = this.set("numFrozenColumns", js.undefined)
    
    @scala.inline
    def setNumFrozenRows(value: Double): Self = this.set("numFrozenRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumFrozenRows: Self = this.set("numFrozenRows", js.undefined)
    
    @scala.inline
    def setOnSelectionEnd(value: /* regions */ js.Array[IRegion] => Unit): Self = this.set("onSelectionEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSelectionEnd: Self = this.set("onSelectionEnd", js.undefined)
    
    @scala.inline
    def setSelectedRegionTransform(
      value: (/* region */ IRegion, /* event */ MouseEvent | KeyboardEvent, /* coords */ js.UndefOr[ICoordinateData]) => IRegion
    ): Self = this.set("selectedRegionTransform", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteSelectedRegionTransform: Self = this.set("selectedRegionTransform", js.undefined)
    
    @scala.inline
    def setSelectedRegionsVarargs(value: IRegion*): Self = this.set("selectedRegions", js.Array(value :_*))
    
    @scala.inline
    def setSelectedRegions(value: js.Array[IRegion]): Self = this.set("selectedRegions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedRegions: Self = this.set("selectedRegions", js.undefined)
  }
}
