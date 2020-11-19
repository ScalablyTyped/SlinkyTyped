package typingsSlinky.blueprintjsTable.headerMod

import typingsSlinky.blueprintjsTable.commonCellMod.IFocusedCellCoordinates
import typingsSlinky.blueprintjsTable.commonMod.Grid
import typingsSlinky.blueprintjsTable.esmRegionsMod.IRegion
import typingsSlinky.blueprintjsTable.locatorMod.ILocator
import typingsSlinky.blueprintjsTable.reorderableMod.IReorderableProps
import typingsSlinky.blueprintjsTable.resizeHandleMod.ILockableLayout
import typingsSlinky.blueprintjsTable.selectableMod.ISelectedRegionTransform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.blueprintjsTable.selectableMod.ISelectableProps because var conflicts: selectedRegions. Inlined enableMultipleSelection, focusedCell, onSelectionEnd, selectedRegionTransform */ @js.native
trait IHeaderProps
  extends ILockableLayout
     with IReorderableProps {
  
  /**
    * If `false`, only a single region of a single column/row/cell may be
    * selected at one time. Using `ctrl` or `meta` key will have no effect,
    * and a mouse drag will select the current column/row/cell only.
    * @default false
    */
  var enableMultipleSelection: js.UndefOr[Boolean] = js.native
  
  /**
    * The currently focused cell.
    */
  var focusedCell: js.UndefOr[IFocusedCellCoordinates] = js.native
  
  /**
    * The grid computes sizes of cells, rows, or columns from the
    * configurable `columnWidths` and `rowHeights`.
    */
  var grid: Grid = js.native
  
  /**
    * Enables/disables the resize interaction.
    * @default true
    */
  var isResizable: js.UndefOr[Boolean] = js.native
  
  /**
    * If true, all header cells render their loading state except for those
    * who have their `loading` prop explicitly set to false.
    * @default false;
    */
  var loading: js.UndefOr[Boolean] = js.native
  
  /**
    * Locates the row/column/cell given a mouse event.
    */
  var locator: ILocator = js.native
  
  /**
    * This callback is called while the user is resizing a header cell. The guides
    * array contains pixel offsets for where to display the resize guides in
    * the table body's overlay layer.
    */
  def onResizeGuide(guides: js.Array[Double]): Unit = js.native
  
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
}
