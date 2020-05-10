package typingsSlinky.handsontable.mod.Handsontable

import typingsSlinky.handsontable.mod.Handsontable.plugins.AutoColumnSize
import typingsSlinky.handsontable.mod.Handsontable.plugins.AutoRowSize
import typingsSlinky.handsontable.mod.Handsontable.plugins.Autofill
import typingsSlinky.handsontable.mod.Handsontable.plugins.Base
import typingsSlinky.handsontable.mod.Handsontable.plugins.BindRowsWithHeaders
import typingsSlinky.handsontable.mod.Handsontable.plugins.CollapsibleColumns
import typingsSlinky.handsontable.mod.Handsontable.plugins.ColumnSorting
import typingsSlinky.handsontable.mod.Handsontable.plugins.ColumnSummary
import typingsSlinky.handsontable.mod.Handsontable.plugins.Comments
import typingsSlinky.handsontable.mod.Handsontable.plugins.ContextMenu
import typingsSlinky.handsontable.mod.Handsontable.plugins.CopyPaste
import typingsSlinky.handsontable.mod.Handsontable.plugins.DragToScroll
import typingsSlinky.handsontable.mod.Handsontable.plugins.DropdownMenu
import typingsSlinky.handsontable.mod.Handsontable.plugins.ExportFile
import typingsSlinky.handsontable.mod.Handsontable.plugins.Filters
import typingsSlinky.handsontable.mod.Handsontable.plugins.Formulas
import typingsSlinky.handsontable.mod.Handsontable.plugins.GanttChart
import typingsSlinky.handsontable.mod.Handsontable.plugins.HeaderTooltips
import typingsSlinky.handsontable.mod.Handsontable.plugins.HiddenColumns
import typingsSlinky.handsontable.mod.Handsontable.plugins.HiddenRows
import typingsSlinky.handsontable.mod.Handsontable.plugins.ManualColumnFreeze
import typingsSlinky.handsontable.mod.Handsontable.plugins.ManualColumnMove
import typingsSlinky.handsontable.mod.Handsontable.plugins.ManualColumnResize
import typingsSlinky.handsontable.mod.Handsontable.plugins.ManualRowMove
import typingsSlinky.handsontable.mod.Handsontable.plugins.ManualRowResize
import typingsSlinky.handsontable.mod.Handsontable.plugins.MergeCells
import typingsSlinky.handsontable.mod.Handsontable.plugins.MultiColumnSorting
import typingsSlinky.handsontable.mod.Handsontable.plugins.MultipleSelectionHandles
import typingsSlinky.handsontable.mod.Handsontable.plugins.NestedHeaders
import typingsSlinky.handsontable.mod.Handsontable.plugins.NestedRows
import typingsSlinky.handsontable.mod.Handsontable.plugins.ObserveChanges
import typingsSlinky.handsontable.mod.Handsontable.plugins.PersistenState
import typingsSlinky.handsontable.mod.Handsontable.plugins.Search
import typingsSlinky.handsontable.mod.Handsontable.plugins.TouchScroll
import typingsSlinky.handsontable.mod.Handsontable.plugins.TrimRows
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Plugin collection, map for getPlugin method
@js.native
trait PluginsCollection extends js.Object {
  var autoColumnSize: AutoColumnSize = js.native
  var autoRowSize: AutoRowSize = js.native
  var autofill: Autofill = js.native
  var basePlugin: Base = js.native
  var bindRowsWithHeaders: BindRowsWithHeaders = js.native
  var collapsibleColumns: CollapsibleColumns = js.native
  var columnSorting: ColumnSorting = js.native
  var columnSummary: ColumnSummary = js.native
  var comments: Comments = js.native
  var contextMenu: ContextMenu = js.native
  var copyPaste: CopyPaste = js.native
  var dragToScroll: DragToScroll = js.native
  var dropdownMenu: DropdownMenu = js.native
  var exportFile: ExportFile = js.native
  var filters: Filters = js.native
  var formulas: Formulas = js.native
  var ganttChart: GanttChart = js.native
  var headerTooltips: HeaderTooltips = js.native
  var hiddenColumns: HiddenColumns = js.native
  var hiddenRows: HiddenRows = js.native
  var manualColumnFreeze: ManualColumnFreeze = js.native
  var manualColumnMove: ManualColumnMove = js.native
  var manualColumnResize: ManualColumnResize = js.native
  var manualRowMove: ManualRowMove = js.native
  var manualRowResize: ManualRowResize = js.native
  var mergeCells: MergeCells = js.native
  var multiColumnSorting: MultiColumnSorting = js.native
  var multipleSelectionHandles: MultipleSelectionHandles = js.native
  var nestedHeaders: NestedHeaders = js.native
  var nestedRows: NestedRows = js.native
  var observeChanges: ObserveChanges = js.native
  var persistentState: PersistenState = js.native
  var search: Search = js.native
  var touchScroll: TouchScroll = js.native
  var trimRows: TrimRows = js.native
}

object PluginsCollection {
  @scala.inline
  def apply(
    autoColumnSize: AutoColumnSize,
    autoRowSize: AutoRowSize,
    autofill: Autofill,
    basePlugin: Base,
    bindRowsWithHeaders: BindRowsWithHeaders,
    collapsibleColumns: CollapsibleColumns,
    columnSorting: ColumnSorting,
    columnSummary: ColumnSummary,
    comments: Comments,
    contextMenu: ContextMenu,
    copyPaste: CopyPaste,
    dragToScroll: DragToScroll,
    dropdownMenu: DropdownMenu,
    exportFile: ExportFile,
    filters: Filters,
    formulas: Formulas,
    ganttChart: GanttChart,
    headerTooltips: HeaderTooltips,
    hiddenColumns: HiddenColumns,
    hiddenRows: HiddenRows,
    manualColumnFreeze: ManualColumnFreeze,
    manualColumnMove: ManualColumnMove,
    manualColumnResize: ManualColumnResize,
    manualRowMove: ManualRowMove,
    manualRowResize: ManualRowResize,
    mergeCells: MergeCells,
    multiColumnSorting: MultiColumnSorting,
    multipleSelectionHandles: MultipleSelectionHandles,
    nestedHeaders: NestedHeaders,
    nestedRows: NestedRows,
    observeChanges: ObserveChanges,
    persistentState: PersistenState,
    search: Search,
    touchScroll: TouchScroll,
    trimRows: TrimRows
  ): PluginsCollection = {
    val __obj = js.Dynamic.literal(autoColumnSize = autoColumnSize.asInstanceOf[js.Any], autoRowSize = autoRowSize.asInstanceOf[js.Any], autofill = autofill.asInstanceOf[js.Any], basePlugin = basePlugin.asInstanceOf[js.Any], bindRowsWithHeaders = bindRowsWithHeaders.asInstanceOf[js.Any], collapsibleColumns = collapsibleColumns.asInstanceOf[js.Any], columnSorting = columnSorting.asInstanceOf[js.Any], columnSummary = columnSummary.asInstanceOf[js.Any], comments = comments.asInstanceOf[js.Any], contextMenu = contextMenu.asInstanceOf[js.Any], copyPaste = copyPaste.asInstanceOf[js.Any], dragToScroll = dragToScroll.asInstanceOf[js.Any], dropdownMenu = dropdownMenu.asInstanceOf[js.Any], exportFile = exportFile.asInstanceOf[js.Any], filters = filters.asInstanceOf[js.Any], formulas = formulas.asInstanceOf[js.Any], ganttChart = ganttChart.asInstanceOf[js.Any], headerTooltips = headerTooltips.asInstanceOf[js.Any], hiddenColumns = hiddenColumns.asInstanceOf[js.Any], hiddenRows = hiddenRows.asInstanceOf[js.Any], manualColumnFreeze = manualColumnFreeze.asInstanceOf[js.Any], manualColumnMove = manualColumnMove.asInstanceOf[js.Any], manualColumnResize = manualColumnResize.asInstanceOf[js.Any], manualRowMove = manualRowMove.asInstanceOf[js.Any], manualRowResize = manualRowResize.asInstanceOf[js.Any], mergeCells = mergeCells.asInstanceOf[js.Any], multiColumnSorting = multiColumnSorting.asInstanceOf[js.Any], multipleSelectionHandles = multipleSelectionHandles.asInstanceOf[js.Any], nestedHeaders = nestedHeaders.asInstanceOf[js.Any], nestedRows = nestedRows.asInstanceOf[js.Any], observeChanges = observeChanges.asInstanceOf[js.Any], persistentState = persistentState.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], touchScroll = touchScroll.asInstanceOf[js.Any], trimRows = trimRows.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginsCollection]
  }
  @scala.inline
  implicit class PluginsCollectionOps[Self <: PluginsCollection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoColumnSize(value: AutoColumnSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoColumnSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoRowSize(value: AutoRowSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoRowSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutofill(value: Autofill): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autofill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBasePlugin(value: Base): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basePlugin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBindRowsWithHeaders(value: BindRowsWithHeaders): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindRowsWithHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCollapsibleColumns(value: CollapsibleColumns): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsibleColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumnSorting(value: ColumnSorting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnSorting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumnSummary(value: ColumnSummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnSummary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComments(value: Comments): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContextMenu(value: ContextMenu): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCopyPaste(value: CopyPaste): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyPaste")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDragToScroll(value: DragToScroll): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragToScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDropdownMenu(value: DropdownMenu): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExportFile(value: ExportFile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilters(value: Filters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormulas(value: Formulas): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formulas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGanttChart(value: GanttChart): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ganttChart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderTooltips(value: HeaderTooltips): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerTooltips")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHiddenColumns(value: HiddenColumns): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiddenColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHiddenRows(value: HiddenRows): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiddenRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withManualColumnFreeze(value: ManualColumnFreeze): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manualColumnFreeze")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withManualColumnMove(value: ManualColumnMove): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manualColumnMove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withManualColumnResize(value: ManualColumnResize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manualColumnResize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withManualRowMove(value: ManualRowMove): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manualRowMove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withManualRowResize(value: ManualRowResize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manualRowResize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMergeCells(value: MergeCells): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeCells")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMultiColumnSorting(value: MultiColumnSorting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiColumnSorting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMultipleSelectionHandles(value: MultipleSelectionHandles): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multipleSelectionHandles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNestedHeaders(value: NestedHeaders): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nestedHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNestedRows(value: NestedRows): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nestedRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObserveChanges(value: ObserveChanges): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observeChanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPersistentState(value: PersistenState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistentState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearch(value: Search): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchScroll(value: TouchScroll): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrimRows(value: TrimRows): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trimRows")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

