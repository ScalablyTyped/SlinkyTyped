package typingsSlinky.blueprintjsTable.tableMod

import org.scalablytyped.runtime.StringDictionary
import slinky.core.facade.ReactElement
import typingsSlinky.blueprintjsTable.commonCellMod.IFocusedCellCoordinates
import typingsSlinky.blueprintjsTable.esmRegionsMod.IRegion
import typingsSlinky.blueprintjsTable.rectMod.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITableState extends js.Object {
  var childrenArray: js.Array[ReactElement] = js.native
  var columnIdToIndex: StringDictionary[Double] = js.native
  /**
    * An array of column widths. These are initialized from the column props
    * and updated when the user drags column header resize handles.
    */
  var columnWidths: js.UndefOr[js.Array[Double]] = js.native
  /**
    * The coordinates of the currently focused table cell
    */
  var focusedCell: js.UndefOr[IFocusedCellCoordinates] = js.native
  /**
    * An array of pixel offsets for resize guides, which are drawn over the
    * table body when a row is being resized.
    */
  var horizontalGuides: js.UndefOr[js.Array[Double]] = js.native
  /**
    * If `true`, will disable updates that will cause re-renders of children
    * components. This is used, for example, to disable layout updates while
    * the user is dragging a resize handle.
    */
  var isLayoutLocked: js.UndefOr[Boolean] = js.native
  /**
    * Whether the user is currently dragging to reorder one or more elements.
    * Can be referenced to toggle the reordering-cursor overlay, which
    * displays a `grabbing` CSS cursor wherever the mouse moves in the table
    * for the duration of the dragging interaction.
    */
  var isReordering: js.UndefOr[Boolean] = js.native
  /**
    * The number of frozen columns, clamped to [0, num <Column>s].
    */
  var numFrozenColumnsClamped: js.UndefOr[Double] = js.native
  /**
    * The number of frozen rows, clamped to [0, numRows].
    */
  var numFrozenRowsClamped: js.UndefOr[Double] = js.native
  /**
    * An array of row heights. These are initialized updated when the user
    * drags row header resize handles.
    */
  var rowHeights: js.UndefOr[js.Array[Double]] = js.native
  /**
    * An array of Regions representing the selections of the table.
    */
  var selectedRegions: js.UndefOr[js.Array[IRegion]] = js.native
  /**
    * An array of pixel offsets for resize guides, which are drawn over the
    * table body when a column is being resized.
    */
  var verticalGuides: js.UndefOr[js.Array[Double]] = js.native
  /**
    * The `Rect` bounds of the viewport used to perform virtual viewport
    * performance enhancements.
    */
  var viewportRect: js.UndefOr[Rect] = js.native
}

object ITableState {
  @scala.inline
  def apply(childrenArray: js.Array[ReactElement], columnIdToIndex: StringDictionary[Double]): ITableState = {
    val __obj = js.Dynamic.literal(childrenArray = childrenArray.asInstanceOf[js.Any], columnIdToIndex = columnIdToIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITableState]
  }
  @scala.inline
  implicit class ITableStateOps[Self <: ITableState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildrenArray(value: js.Array[ReactElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childrenArray")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumnIdToIndex(value: StringDictionary[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnIdToIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumnWidths(value: js.Array[Double]): Self = {
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
    def withHorizontalGuides(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalGuides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontalGuides: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalGuides")(js.undefined)
        ret
    }
    @scala.inline
    def withIsLayoutLocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLayoutLocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsLayoutLocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLayoutLocked")(js.undefined)
        ret
    }
    @scala.inline
    def withIsReordering(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isReordering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsReordering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isReordering")(js.undefined)
        ret
    }
    @scala.inline
    def withNumFrozenColumnsClamped(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numFrozenColumnsClamped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumFrozenColumnsClamped: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numFrozenColumnsClamped")(js.undefined)
        ret
    }
    @scala.inline
    def withNumFrozenRowsClamped(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numFrozenRowsClamped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumFrozenRowsClamped: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numFrozenRowsClamped")(js.undefined)
        ret
    }
    @scala.inline
    def withRowHeights(value: js.Array[Double]): Self = {
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
    def withVerticalGuides(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalGuides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalGuides: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalGuides")(js.undefined)
        ret
    }
    @scala.inline
    def withViewportRect(value: Rect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewportRect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewportRect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewportRect")(js.undefined)
        ret
    }
  }
  
}

