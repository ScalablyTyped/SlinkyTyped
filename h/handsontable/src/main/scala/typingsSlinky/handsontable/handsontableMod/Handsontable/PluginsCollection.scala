package typingsSlinky.handsontable.handsontableMod.Handsontable

import typingsSlinky.handsontable.handsontableMod.Handsontable.plugins.AutoColumnSize
import typingsSlinky.handsontable.handsontableMod.Handsontable.plugins.AutoRowSize
import typingsSlinky.handsontable.handsontableMod.Handsontable.plugins.Autofill
import typingsSlinky.handsontable.handsontableMod.Handsontable.plugins.Base
import typingsSlinky.handsontable.handsontableMod.Handsontable.plugins.BindRowsWithHeaders
import typingsSlinky.handsontable.handsontableMod.Handsontable.plugins.CollapsibleColumns
import typingsSlinky.handsontable.handsontableMod.Handsontable.plugins.ColumnSorting
import typingsSlinky.handsontable.handsontableMod.Handsontable.plugins.ColumnSummary
import typingsSlinky.handsontable.handsontableMod.Handsontable.plugins.Comments
import typingsSlinky.handsontable.handsontableMod.Handsontable.plugins.ContextMenu
import typingsSlinky.handsontable.handsontableMod.Handsontable.plugins.CopyPaste
import typingsSlinky.handsontable.handsontableMod.Handsontable.plugins.DragToScroll
import typingsSlinky.handsontable.handsontableMod.Handsontable.plugins.DropdownMenu
import typingsSlinky.handsontable.handsontableMod.Handsontable.plugins.ExportFile
import typingsSlinky.handsontable.handsontableMod.Handsontable.plugins.Filters
import typingsSlinky.handsontable.handsontableMod.Handsontable.plugins.Formulas
import typingsSlinky.handsontable.handsontableMod.Handsontable.plugins.GanttChart
import typingsSlinky.handsontable.handsontableMod.Handsontable.plugins.HeaderTooltips
import typingsSlinky.handsontable.handsontableMod.Handsontable.plugins.HiddenColumns
import typingsSlinky.handsontable.handsontableMod.Handsontable.plugins.HiddenRows
import typingsSlinky.handsontable.handsontableMod.Handsontable.plugins.ManualColumnFreeze
import typingsSlinky.handsontable.handsontableMod.Handsontable.plugins.ManualColumnMove
import typingsSlinky.handsontable.handsontableMod.Handsontable.plugins.ManualColumnResize
import typingsSlinky.handsontable.handsontableMod.Handsontable.plugins.ManualRowMove
import typingsSlinky.handsontable.handsontableMod.Handsontable.plugins.ManualRowResize
import typingsSlinky.handsontable.handsontableMod.Handsontable.plugins.MergeCells
import typingsSlinky.handsontable.handsontableMod.Handsontable.plugins.MultiColumnSorting
import typingsSlinky.handsontable.handsontableMod.Handsontable.plugins.MultipleSelectionHandles
import typingsSlinky.handsontable.handsontableMod.Handsontable.plugins.NestedHeaders
import typingsSlinky.handsontable.handsontableMod.Handsontable.plugins.NestedRows
import typingsSlinky.handsontable.handsontableMod.Handsontable.plugins.ObserveChanges
import typingsSlinky.handsontable.handsontableMod.Handsontable.plugins.PersistenState
import typingsSlinky.handsontable.handsontableMod.Handsontable.plugins.Search
import typingsSlinky.handsontable.handsontableMod.Handsontable.plugins.TouchScroll
import typingsSlinky.handsontable.handsontableMod.Handsontable.plugins.TrimRows
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Plugin collection, map for getPlugin method
trait PluginsCollection extends js.Object {
  var autoColumnSize: AutoColumnSize
  var autoRowSize: AutoRowSize
  var autofill: Autofill
  var basePlugin: Base
  var bindRowsWithHeaders: BindRowsWithHeaders
  var collapsibleColumns: CollapsibleColumns
  var columnSorting: ColumnSorting
  var columnSummary: ColumnSummary
  var comments: Comments
  var contextMenu: ContextMenu
  var copyPaste: CopyPaste
  var dragToScroll: DragToScroll
  var dropdownMenu: DropdownMenu
  var exportFile: ExportFile
  var filters: Filters
  var formulas: Formulas
  var ganttChart: GanttChart
  var headerTooltips: HeaderTooltips
  var hiddenColumns: HiddenColumns
  var hiddenRows: HiddenRows
  var manualColumnFreeze: ManualColumnFreeze
  var manualColumnMove: ManualColumnMove
  var manualColumnResize: ManualColumnResize
  var manualRowMove: ManualRowMove
  var manualRowResize: ManualRowResize
  var mergeCells: MergeCells
  var multiColumnSorting: MultiColumnSorting
  var multipleSelectionHandles: MultipleSelectionHandles
  var nestedHeaders: NestedHeaders
  var nestedRows: NestedRows
  var observeChanges: ObserveChanges
  var persistentState: PersistenState
  var search: Search
  var touchScroll: TouchScroll
  var trimRows: TrimRows
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
}

