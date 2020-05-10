package typingsSlinky.ngGrid.ngGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IColumn extends js.Object {
  var aggLabelFilter: js.Any = js.native
  var cellClass: String = js.native
  var cellEditableCondition: js.Any = js.native
  var cellFilter: js.Any = js.native
  var cellTemplate: String = js.native
  var colDef: IColumnDef = js.native
  var cursor: String = js.native
  var displayName: String = js.native
  var enableCellEdit: Boolean = js.native
  var field: String = js.native
  var groupIndex: Double = js.native
  var groupable: Boolean = js.native
  var headerCellTemplate: String = js.native
  var headerClass: String = js.native
  var headerRowHeight: Double = js.native
  var index: Double = js.native
  var isAggCol: Boolean = js.native
  var isGroupedBy: Boolean = js.native
  var maxWidth: Double = js.native
  var minWidth: Double = js.native
  var originalIndex: Double = js.native
  var pinnable: Boolean = js.native
  var pinned: Boolean = js.native
  var resizable: Boolean = js.native
  var sortDirection: String = js.native
  var sortPriority: Double = js.native
  var sortable: Boolean = js.native
  var sortingAlgorithm: js.Function = js.native
  var visible: Boolean = js.native
  var width: Double = js.native
  def copy(): IColumn = js.native
  def gripClick(): js.Any = js.native
  def gripOnMouseDown(event: js.Any): js.Any = js.native
  def gripOnMouseUp(event: js.Any): Unit = js.native
  def groupedByClass(): String = js.native
  def noSortVisible(): Boolean = js.native
  def onMouseMove(event: js.Any): Unit = js.native
  def setVars(fromCol: IColumn): Unit = js.native
  def showSortButtonDown(): Boolean = js.native
  def showSortButtonUp(): Boolean = js.native
  def sort(event: js.Any): Boolean = js.native
  def toggleVisible(): Unit = js.native
}

object IColumn {
  @scala.inline
  def apply(
    aggLabelFilter: js.Any,
    cellClass: String,
    cellEditableCondition: js.Any,
    cellFilter: js.Any,
    cellTemplate: String,
    colDef: IColumnDef,
    copy: () => IColumn,
    cursor: String,
    displayName: String,
    enableCellEdit: Boolean,
    field: String,
    gripClick: () => js.Any,
    gripOnMouseDown: js.Any => js.Any,
    gripOnMouseUp: js.Any => Unit,
    groupIndex: Double,
    groupable: Boolean,
    groupedByClass: () => String,
    headerCellTemplate: String,
    headerClass: String,
    headerRowHeight: Double,
    index: Double,
    isAggCol: Boolean,
    isGroupedBy: Boolean,
    maxWidth: Double,
    minWidth: Double,
    noSortVisible: () => Boolean,
    onMouseMove: js.Any => Unit,
    originalIndex: Double,
    pinnable: Boolean,
    pinned: Boolean,
    resizable: Boolean,
    setVars: IColumn => Unit,
    showSortButtonDown: () => Boolean,
    showSortButtonUp: () => Boolean,
    sort: js.Any => Boolean,
    sortDirection: String,
    sortPriority: Double,
    sortable: Boolean,
    sortingAlgorithm: js.Function,
    toggleVisible: () => Unit,
    visible: Boolean,
    width: Double
  ): IColumn = {
    val __obj = js.Dynamic.literal(aggLabelFilter = aggLabelFilter.asInstanceOf[js.Any], cellClass = cellClass.asInstanceOf[js.Any], cellEditableCondition = cellEditableCondition.asInstanceOf[js.Any], cellFilter = cellFilter.asInstanceOf[js.Any], cellTemplate = cellTemplate.asInstanceOf[js.Any], colDef = colDef.asInstanceOf[js.Any], copy = js.Any.fromFunction0(copy), cursor = cursor.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], enableCellEdit = enableCellEdit.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], gripClick = js.Any.fromFunction0(gripClick), gripOnMouseDown = js.Any.fromFunction1(gripOnMouseDown), gripOnMouseUp = js.Any.fromFunction1(gripOnMouseUp), groupIndex = groupIndex.asInstanceOf[js.Any], groupable = groupable.asInstanceOf[js.Any], groupedByClass = js.Any.fromFunction0(groupedByClass), headerCellTemplate = headerCellTemplate.asInstanceOf[js.Any], headerClass = headerClass.asInstanceOf[js.Any], headerRowHeight = headerRowHeight.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], isAggCol = isAggCol.asInstanceOf[js.Any], isGroupedBy = isGroupedBy.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any], minWidth = minWidth.asInstanceOf[js.Any], noSortVisible = js.Any.fromFunction0(noSortVisible), onMouseMove = js.Any.fromFunction1(onMouseMove), originalIndex = originalIndex.asInstanceOf[js.Any], pinnable = pinnable.asInstanceOf[js.Any], pinned = pinned.asInstanceOf[js.Any], resizable = resizable.asInstanceOf[js.Any], setVars = js.Any.fromFunction1(setVars), showSortButtonDown = js.Any.fromFunction0(showSortButtonDown), showSortButtonUp = js.Any.fromFunction0(showSortButtonUp), sort = js.Any.fromFunction1(sort), sortDirection = sortDirection.asInstanceOf[js.Any], sortPriority = sortPriority.asInstanceOf[js.Any], sortable = sortable.asInstanceOf[js.Any], sortingAlgorithm = sortingAlgorithm.asInstanceOf[js.Any], toggleVisible = js.Any.fromFunction0(toggleVisible), visible = visible.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColumn]
  }
  @scala.inline
  implicit class IColumnOps[Self <: IColumn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAggLabelFilter(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggLabelFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCellClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCellEditableCondition(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellEditableCondition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCellFilter(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCellTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColDef(value: IColumnDef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colDef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCopy(value: () => IColumn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCursor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnableCellEdit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCellEdit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGripClick(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gripClick")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGripOnMouseDown(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gripOnMouseDown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGripOnMouseUp(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gripOnMouseUp")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGroupIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupedByClass(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupedByClass")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHeaderCellTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerCellTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderRowHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerRowHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsAggCol(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAggCol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsGroupedBy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isGroupedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoSortVisible(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noSortVisible")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnMouseMove(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseMove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOriginalIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPinnable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinnable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPinned(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinned")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResizable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetVars(value: IColumn => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setVars")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShowSortButtonDown(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSortButtonDown")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withShowSortButtonUp(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSortButtonUp")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSort(value: js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSortDirection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSortPriority(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortPriority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSortable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSortingAlgorithm(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortingAlgorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToggleVisible(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleVisible")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

