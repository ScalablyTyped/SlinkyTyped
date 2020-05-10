package typingsSlinky.ngGrid.ngGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IScope * / any */ @js.native
trait IGridScope extends js.Object {
  var columns: js.Array[_] = js.native
  var configGroups: js.Array[_] = js.native
  var elementsNeedMeasuring: Boolean = js.native
  var enableCellEditOnFocus: Boolean = js.native
  var enableCellSelection: Boolean = js.native
  var enablePaging: Boolean = js.native
  var footer: IFooter = js.native
  var footerRowHeight: Double = js.native
  var forceSyncScrolling: Boolean = js.native
  var gridId: String = js.native
  var headerRow: js.Any = js.native
  var i18n: js.Any = js.native
  var jqueryUITheme: js.Any = js.native
  var multiSelect: Boolean = js.native
  var pagingOptions: IPagingOptions = js.native
  var renderedColumns: js.Array[_] = js.native
  var renderedRows: js.Array[_] = js.native
  var rowHeight: Double = js.native
  var selectedItems: js.Array[_] = js.native
  var selectionProvider: ISelectionProvider = js.native
  var showColumnMenu: Boolean = js.native
  var showFooter: Boolean = js.native
  var showMenu: Boolean = js.native
  var showSelectionCheckbox: Boolean = js.native
  def adjustScrollLeft(scrollLeft: Double): Unit = js.native
  def adjustScrollTop(scrollTop: Double, force: Boolean): Unit = js.native
  def groupBy(col: IColumn): Unit = js.native
  def headerScrollerDim(): js.Any = js.native
  def removeGroup(index: Double): Unit = js.native
  def showGroupPanel(): js.Any = js.native
  def togglePin(col: IColumn): Unit = js.native
  def toggleSelectAll(): Unit = js.native
  def toggleShowMenu(): Unit = js.native
  def topPanelHeight(): Double = js.native
  def totalFilteredItemsLength(): Double = js.native
  def totalRowWidth(): Double = js.native
  def viewportDimHeight(): Double = js.native
}

object IGridScope {
  @scala.inline
  def apply(
    adjustScrollLeft: Double => Unit,
    adjustScrollTop: (Double, Boolean) => Unit,
    columns: js.Array[_],
    configGroups: js.Array[_],
    elementsNeedMeasuring: Boolean,
    enableCellEditOnFocus: Boolean,
    enableCellSelection: Boolean,
    enablePaging: Boolean,
    footer: IFooter,
    footerRowHeight: Double,
    forceSyncScrolling: Boolean,
    gridId: String,
    groupBy: IColumn => Unit,
    headerRow: js.Any,
    headerScrollerDim: () => js.Any,
    i18n: js.Any,
    jqueryUITheme: js.Any,
    multiSelect: Boolean,
    pagingOptions: IPagingOptions,
    removeGroup: Double => Unit,
    renderedColumns: js.Array[_],
    renderedRows: js.Array[_],
    rowHeight: Double,
    selectedItems: js.Array[_],
    selectionProvider: ISelectionProvider,
    showColumnMenu: Boolean,
    showFooter: Boolean,
    showGroupPanel: () => js.Any,
    showMenu: Boolean,
    showSelectionCheckbox: Boolean,
    togglePin: IColumn => Unit,
    toggleSelectAll: () => Unit,
    toggleShowMenu: () => Unit,
    topPanelHeight: () => Double,
    totalFilteredItemsLength: () => Double,
    totalRowWidth: () => Double,
    viewportDimHeight: () => Double
  ): IGridScope = {
    val __obj = js.Dynamic.literal(adjustScrollLeft = js.Any.fromFunction1(adjustScrollLeft), adjustScrollTop = js.Any.fromFunction2(adjustScrollTop), columns = columns.asInstanceOf[js.Any], configGroups = configGroups.asInstanceOf[js.Any], elementsNeedMeasuring = elementsNeedMeasuring.asInstanceOf[js.Any], enableCellEditOnFocus = enableCellEditOnFocus.asInstanceOf[js.Any], enableCellSelection = enableCellSelection.asInstanceOf[js.Any], enablePaging = enablePaging.asInstanceOf[js.Any], footer = footer.asInstanceOf[js.Any], footerRowHeight = footerRowHeight.asInstanceOf[js.Any], forceSyncScrolling = forceSyncScrolling.asInstanceOf[js.Any], gridId = gridId.asInstanceOf[js.Any], groupBy = js.Any.fromFunction1(groupBy), headerRow = headerRow.asInstanceOf[js.Any], headerScrollerDim = js.Any.fromFunction0(headerScrollerDim), i18n = i18n.asInstanceOf[js.Any], jqueryUITheme = jqueryUITheme.asInstanceOf[js.Any], multiSelect = multiSelect.asInstanceOf[js.Any], pagingOptions = pagingOptions.asInstanceOf[js.Any], removeGroup = js.Any.fromFunction1(removeGroup), renderedColumns = renderedColumns.asInstanceOf[js.Any], renderedRows = renderedRows.asInstanceOf[js.Any], rowHeight = rowHeight.asInstanceOf[js.Any], selectedItems = selectedItems.asInstanceOf[js.Any], selectionProvider = selectionProvider.asInstanceOf[js.Any], showColumnMenu = showColumnMenu.asInstanceOf[js.Any], showFooter = showFooter.asInstanceOf[js.Any], showGroupPanel = js.Any.fromFunction0(showGroupPanel), showMenu = showMenu.asInstanceOf[js.Any], showSelectionCheckbox = showSelectionCheckbox.asInstanceOf[js.Any], togglePin = js.Any.fromFunction1(togglePin), toggleSelectAll = js.Any.fromFunction0(toggleSelectAll), toggleShowMenu = js.Any.fromFunction0(toggleShowMenu), topPanelHeight = js.Any.fromFunction0(topPanelHeight), totalFilteredItemsLength = js.Any.fromFunction0(totalFilteredItemsLength), totalRowWidth = js.Any.fromFunction0(totalRowWidth), viewportDimHeight = js.Any.fromFunction0(viewportDimHeight))
    __obj.asInstanceOf[IGridScope]
  }
  @scala.inline
  implicit class IGridScopeOps[Self <: IGridScope] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdjustScrollLeft(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adjustScrollLeft")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAdjustScrollTop(value: (Double, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adjustScrollTop")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withColumns(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfigGroups(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElementsNeedMeasuring(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementsNeedMeasuring")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnableCellEditOnFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCellEditOnFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnableCellSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCellSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnablePaging(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePaging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFooter(value: IFooter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFooterRowHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerRowHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForceSyncScrolling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceSyncScrolling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGridId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupBy(value: IColumn => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupBy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHeaderRow(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderScrollerDim(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerScrollerDim")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withI18n(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("i18n")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJqueryUITheme(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jqueryUITheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMultiSelect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPagingOptions(value: IPagingOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagingOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveGroup(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeGroup")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRenderedColumns(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderedColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderedRows(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderedRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectedItems(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectionProvider(value: ISelectionProvider): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowColumnMenu(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showColumnMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowFooter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFooter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowGroupPanel(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showGroupPanel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withShowMenu(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowSelectionCheckbox(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSelectionCheckbox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTogglePin(value: IColumn => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("togglePin")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withToggleSelectAll(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleSelectAll")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToggleShowMenu(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleShowMenu")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTopPanelHeight(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topPanelHeight")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTotalFilteredItemsLength(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalFilteredItemsLength")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTotalRowWidth(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalRowWidth")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withViewportDimHeight(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewportDimHeight")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

