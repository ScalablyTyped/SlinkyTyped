package typingsSlinky.handsontable.mod.Handsontable

import org.scalablytyped.runtime.Instantiable6
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLTableCellElement
import org.scalajs.dom.raw.KeyboardEvent
import typingsSlinky.handsontable.handsontableStrings.`non-commercial-and-evaluation`
import typingsSlinky.handsontable.handsontableStrings.all
import typingsSlinky.handsontable.handsontableStrings.area
import typingsSlinky.handsontable.handsontableStrings.auto
import typingsSlinky.handsontable.handsontableStrings.cell
import typingsSlinky.handsontable.handsontableStrings.current
import typingsSlinky.handsontable.handsontableStrings.header
import typingsSlinky.handsontable.handsontableStrings.horizontal
import typingsSlinky.handsontable.handsontableStrings.last
import typingsSlinky.handsontable.handsontableStrings.loose
import typingsSlinky.handsontable.handsontableStrings.multiple
import typingsSlinky.handsontable.handsontableStrings.none
import typingsSlinky.handsontable.handsontableStrings.range
import typingsSlinky.handsontable.handsontableStrings.single
import typingsSlinky.handsontable.handsontableStrings.strict
import typingsSlinky.handsontable.handsontableStrings.vertical
import typingsSlinky.handsontable.mod.Handsontable.Hooks.Events
import typingsSlinky.handsontable.mod.Handsontable._editors.Base
import typingsSlinky.handsontable.mod.Handsontable.autoColumnSize.Settings
import typingsSlinky.handsontable.mod.Handsontable.comments.CommentConfig
import typingsSlinky.handsontable.mod.Handsontable.contextMenu.PredefinedMenuItemKey
import typingsSlinky.handsontable.mod.Handsontable.nestedHeaders.NestedHeader
import typingsSlinky.handsontable.mod.Handsontable.wot.CellCoords
import typingsSlinky.handsontable.mod._Handsontable.Core
import typingsSlinky.pikaday.mod.PikadayOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Base table settings that will cascade to columns and cells.
  */
@js.native
trait GridSettings extends Events {
  var activeHeaderClassName: js.UndefOr[String] = js.native
  var allowEmpty: js.UndefOr[Boolean] = js.native
  var allowHtml: js.UndefOr[Boolean] = js.native
  var allowInsertColumn: js.UndefOr[Boolean] = js.native
  var allowInsertRow: js.UndefOr[Boolean] = js.native
  var allowInvalid: js.UndefOr[Boolean] = js.native
  var allowRemoveColumn: js.UndefOr[Boolean] = js.native
  var allowRemoveRow: js.UndefOr[Boolean] = js.native
  var autoColumnSize: js.UndefOr[Settings | Boolean] = js.native
  var autoRowSize: js.UndefOr[typingsSlinky.handsontable.mod.Handsontable.autoRowSize.Settings | Boolean] = js.native
  var autoWrapCol: js.UndefOr[Boolean] = js.native
  var autoWrapRow: js.UndefOr[Boolean] = js.native
  var bindRowsWithHeaders: js.UndefOr[Boolean | loose | strict] = js.native
  var cell: js.UndefOr[js.Array[CellSettings]] = js.native
  var cells: js.UndefOr[
    js.ThisFunction3[
      /* this */ CellProperties, 
      /* row */ Double, 
      /* col */ Double, 
      /* prop */ String | Double, 
      CellMeta
    ]
  ] = js.native
  var checkedTemplate: js.UndefOr[Boolean | String | Double] = js.native
  var className: js.UndefOr[String | js.Array[String]] = js.native
  var colHeaders: js.UndefOr[Boolean | js.Array[String] | (js.Function1[/* index */ Double, String])] = js.native
  var colWidths: js.UndefOr[
    Double | (js.Array[Double | String]) | String | (js.Function1[/* index */ Double, String | Double])
  ] = js.native
  var collapsibleColumns: js.UndefOr[
    Boolean | js.Array[typingsSlinky.handsontable.mod.Handsontable.collapsibleColumns.Settings]
  ] = js.native
  var columnHeaderHeight: js.UndefOr[Double | js.Array[js.UndefOr[Double]]] = js.native
  var columnSorting: js.UndefOr[Boolean | typingsSlinky.handsontable.mod.Handsontable.columnSorting.Settings] = js.native
  var columnSummary: js.UndefOr[
    js.Array[typingsSlinky.handsontable.mod.Handsontable.columnSummary.Settings] | js.Function0[js.Array[typingsSlinky.handsontable.mod.Handsontable.columnSummary.Settings]]
  ] = js.native
  var columns: js.UndefOr[js.Array[ColumnSettings] | (js.Function1[/* index */ Double, ColumnSettings])] = js.native
  var commentedCellClassName: js.UndefOr[String] = js.native
  var comments: js.UndefOr[
    Boolean | typingsSlinky.handsontable.mod.Handsontable.comments.Settings | js.Array[CommentConfig]
  ] = js.native
  var contextMenu: js.UndefOr[
    Boolean | js.Array[PredefinedMenuItemKey] | typingsSlinky.handsontable.mod.Handsontable.contextMenu.Settings
  ] = js.native
  var copyPaste: js.UndefOr[Boolean | typingsSlinky.handsontable.mod.Handsontable.copyPaste.Settings] = js.native
  var copyable: js.UndefOr[Boolean] = js.native
  var correctFormat: js.UndefOr[Boolean] = js.native
  var currentColClassName: js.UndefOr[String] = js.native
  var currentHeaderClassName: js.UndefOr[String] = js.native
  var currentRowClassName: js.UndefOr[String] = js.native
  var customBorders: js.UndefOr[
    Boolean | js.Array[typingsSlinky.handsontable.mod.Handsontable.customBorders.Settings]
  ] = js.native
  var data: js.UndefOr[js.Array[js.Array[CellValue] | RowObject]] = js.native
  var dataSchema: js.UndefOr[
    RowObject | js.Array[CellValue] | (js.Function1[/* row */ Double, RowObject | js.Array[CellValue]])
  ] = js.native
  var dateFormat: js.UndefOr[String] = js.native
  var datePickerConfig: js.UndefOr[PikadayOptions] = js.native
  var debug: js.UndefOr[Boolean] = js.native
  var defaultDate: js.UndefOr[String] = js.native
  var disableVisualSelection: js.UndefOr[Boolean | current | area | header | (js.Array[current | area | header])] = js.native
  var dragToScroll: js.UndefOr[Boolean] = js.native
  var dropdownMenu: js.UndefOr[
    Boolean | js.Array[PredefinedMenuItemKey] | typingsSlinky.handsontable.mod.Handsontable.contextMenu.Settings
  ] = js.native
  var editor: js.UndefOr[
    EditorType | (Instantiable6[
      /* hotInstance */ Core, 
      /* row */ Double, 
      /* col */ Double, 
      /* prop */ String | Double, 
      /* TD */ HTMLTableCellElement, 
      /* cellProperties */ CellProperties, 
      Base
    ]) | Boolean | String
  ] = js.native
  var enterBeginsEditing: js.UndefOr[Boolean] = js.native
  var enterMoves: js.UndefOr[CellCoords | (js.Function1[/* event */ KeyboardEvent, CellCoords])] = js.native
  var fillHandle: js.UndefOr[
    Boolean | vertical | horizontal | typingsSlinky.handsontable.mod.Handsontable.autoFill.Settings
  ] = js.native
  var filter: js.UndefOr[Boolean] = js.native
  var filteringCaseSensitive: js.UndefOr[Boolean] = js.native
  var filters: js.UndefOr[Boolean] = js.native
  var fixedColumnsLeft: js.UndefOr[Double] = js.native
  var fixedRowsBottom: js.UndefOr[Double] = js.native
  var fixedRowsTop: js.UndefOr[Double] = js.native
  var formulas: js.UndefOr[Boolean | typingsSlinky.handsontable.mod.Handsontable.formulas.Settings] = js.native
  var fragmentSelection: js.UndefOr[Boolean | cell] = js.native
  var ganttChart: js.UndefOr[typingsSlinky.handsontable.mod.Handsontable.ganttChart.Settings] = js.native
  var headerTooltips: js.UndefOr[Boolean | typingsSlinky.handsontable.mod.Handsontable.headerTooltips.Settings] = js.native
  var height: js.UndefOr[Double | String | (js.Function0[Double | String])] = js.native
  var hiddenColumns: js.UndefOr[Boolean | typingsSlinky.handsontable.mod.Handsontable.hiddenColumns.Settings] = js.native
  var hiddenRows: js.UndefOr[Boolean | typingsSlinky.handsontable.mod.Handsontable.hiddenRows.Settings] = js.native
  var invalidCellClassName: js.UndefOr[String] = js.native
  var isEmptyCol: js.UndefOr[js.ThisFunction1[/* this */ Core, /* col */ Double, Boolean]] = js.native
  var isEmptyRow: js.UndefOr[js.ThisFunction1[/* this */ Core, /* row */ Double, Boolean]] = js.native
  var label: js.UndefOr[LabelOptions] = js.native
  var language: js.UndefOr[String] = js.native
  var licenseKey: js.UndefOr[String | `non-commercial-and-evaluation`] = js.native
  var manualColumnFreeze: js.UndefOr[Boolean] = js.native
  var manualColumnMove: js.UndefOr[Boolean | js.Array[Double]] = js.native
  var manualColumnResize: js.UndefOr[Boolean | js.Array[Double]] = js.native
  var manualRowMove: js.UndefOr[Boolean | js.Array[Double]] = js.native
  var manualRowResize: js.UndefOr[Boolean | js.Array[Double]] = js.native
  var maxCols: js.UndefOr[Double] = js.native
  var maxRows: js.UndefOr[Double] = js.native
  var mergeCells: js.UndefOr[
    Boolean | js.Array[typingsSlinky.handsontable.mod.Handsontable.mergeCells.Settings]
  ] = js.native
  var minCols: js.UndefOr[Double] = js.native
  var minRows: js.UndefOr[Double] = js.native
  var minSpareCols: js.UndefOr[Double] = js.native
  var minSpareRows: js.UndefOr[Double] = js.native
  var multiColumnSorting: js.UndefOr[
    Boolean | typingsSlinky.handsontable.mod.Handsontable.multiColumnSorting.Settings
  ] = js.native
  var nestedHeaders: js.UndefOr[js.Array[js.Array[String | NestedHeader]]] = js.native
  var nestedRows: js.UndefOr[Boolean] = js.native
  var noWordWrapClassName: js.UndefOr[String] = js.native
  var numericFormat: js.UndefOr[NumericFormatOptions] = js.native
  var observeChanges: js.UndefOr[Boolean] = js.native
  var observeDOMVisibility: js.UndefOr[Boolean] = js.native
  var outsideClickDeselects: js.UndefOr[Boolean | (js.Function1[/* target */ HTMLElement, Boolean])] = js.native
  var persistentState: js.UndefOr[Boolean] = js.native
  var placeholder: js.UndefOr[String] = js.native
  var placeholderCellClassName: js.UndefOr[String] = js.native
  var preventOverflow: js.UndefOr[Boolean | vertical | horizontal] = js.native
  var preventWheel: js.UndefOr[Boolean] = js.native
  var readOnly: js.UndefOr[Boolean] = js.native
  var readOnlyCellClassName: js.UndefOr[String] = js.native
  var renderAllRows: js.UndefOr[Boolean] = js.native
  var renderer: js.UndefOr[
    RendererType | String | typingsSlinky.handsontable.mod.Handsontable.renderers.Base
  ] = js.native
  var rowHeaderWidth: js.UndefOr[Double | js.Array[Double]] = js.native
  var rowHeaders: js.UndefOr[Boolean | js.Array[String] | (js.Function1[/* index */ Double, String])] = js.native
  var rowHeights: js.UndefOr[
    Double | (js.Array[Double | String]) | String | (js.Function1[/* index */ Double, String | Double])
  ] = js.native
  var search: js.UndefOr[Boolean | typingsSlinky.handsontable.mod.Handsontable.search.Settings] = js.native
  var selectOptions: js.UndefOr[js.Array[String]] = js.native
  var selectionMode: js.UndefOr[single | range | multiple] = js.native
  var skipColumnOnPaste: js.UndefOr[Boolean] = js.native
  var sortByRelevance: js.UndefOr[Boolean] = js.native
  var source: js.UndefOr[
    (js.Array[Double | String]) | (js.ThisFunction2[
      /* this */ CellProperties, 
      /* query */ String, 
      /* callback */ js.Function1[/* items */ js.Array[String], Unit], 
      Unit
    ])
  ] = js.native
  var startCols: js.UndefOr[Double] = js.native
  var startRows: js.UndefOr[Double] = js.native
  var stretchH: js.UndefOr[none | all | last] = js.native
  var strict: js.UndefOr[Boolean] = js.native
  var tabMoves: js.UndefOr[CellCoords | (js.Function1[/* event */ KeyboardEvent, CellCoords])] = js.native
  var tableClassName: js.UndefOr[String | js.Array[String]] = js.native
  var title: js.UndefOr[String] = js.native
  var trimDropdown: js.UndefOr[Boolean] = js.native
  var trimRows: js.UndefOr[Boolean | js.Array[Double]] = js.native
  var trimWhitespace: js.UndefOr[Boolean] = js.native
  var `type`: js.UndefOr[CellType | String] = js.native
  var uncheckedTemplate: js.UndefOr[Boolean | String | Double] = js.native
  var undo: js.UndefOr[Boolean] = js.native
  var validator: js.UndefOr[
    typingsSlinky.handsontable.mod.Handsontable.validators.Base | js.RegExp | ValidatorType | String
  ] = js.native
  var viewportColumnRenderingOffset: js.UndefOr[Double | auto] = js.native
  var viewportRowRenderingOffset: js.UndefOr[Double | auto] = js.native
  var visibleRows: js.UndefOr[Double] = js.native
  var width: js.UndefOr[Double | String | (js.Function0[Double | String])] = js.native
  var wordWrap: js.UndefOr[Boolean] = js.native
}

object GridSettings {
  @scala.inline
  def apply(): GridSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridSettings]
  }
  @scala.inline
  implicit class GridSettingsOps[Self <: GridSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveHeaderClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeHeaderClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveHeaderClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeHeaderClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowEmpty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowEmpty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowEmpty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowEmpty")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowHtml(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowHtml")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowHtml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowHtml")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowInsertColumn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowInsertColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowInsertColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowInsertColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowInsertRow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowInsertRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowInsertRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowInsertRow")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowInvalid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowInvalid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowInvalid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowInvalid")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowRemoveColumn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowRemoveColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowRemoveColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowRemoveColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowRemoveRow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowRemoveRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowRemoveRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowRemoveRow")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoColumnSize(value: Settings | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoColumnSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoColumnSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoColumnSize")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoRowSize(value: typingsSlinky.handsontable.mod.Handsontable.autoRowSize.Settings | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoRowSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoRowSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoRowSize")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoWrapCol(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoWrapCol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoWrapCol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoWrapCol")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoWrapRow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoWrapRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoWrapRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoWrapRow")(js.undefined)
        ret
    }
    @scala.inline
    def withBindRowsWithHeaders(value: Boolean | loose | strict): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindRowsWithHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBindRowsWithHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindRowsWithHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withCell(value: js.Array[CellSettings]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCell: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cell")(js.undefined)
        ret
    }
    @scala.inline
    def withCells(
      value: js.ThisFunction3[
          /* this */ CellProperties, 
          /* row */ Double, 
          /* col */ Double, 
          /* prop */ String | Double, 
          CellMeta
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cells")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCells: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cells")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckedTemplate(value: Boolean | String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkedTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckedTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkedTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withColHeadersFunction1(value: /* index */ Double => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colHeaders")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withColHeaders(value: Boolean | js.Array[String] | (js.Function1[/* index */ Double, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withColWidthsFunction1(value: /* index */ Double => String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colWidths")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withColWidths(
      value: Double | (js.Array[Double | String]) | String | (js.Function1[/* index */ Double, String | Double])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colWidths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColWidths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colWidths")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapsibleColumns(value: Boolean | js.Array[typingsSlinky.handsontable.mod.Handsontable.collapsibleColumns.Settings]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsibleColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapsibleColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsibleColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnHeaderHeight(value: Double | js.Array[js.UndefOr[Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnHeaderHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnHeaderHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnHeaderHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnSorting(value: Boolean | typingsSlinky.handsontable.mod.Handsontable.columnSorting.Settings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnSorting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnSorting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnSorting")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnSummaryFunction0(value: () => js.Array[typingsSlinky.handsontable.mod.Handsontable.columnSummary.Settings]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnSummary")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withColumnSummary(
      value: js.Array[typingsSlinky.handsontable.mod.Handsontable.columnSummary.Settings] | js.Function0[js.Array[typingsSlinky.handsontable.mod.Handsontable.columnSummary.Settings]]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnSummary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnSummary")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnsFunction1(value: /* index */ Double => ColumnSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withColumns(value: js.Array[ColumnSettings] | (js.Function1[/* index */ Double, ColumnSettings])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(js.undefined)
        ret
    }
    @scala.inline
    def withCommentedCellClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commentedCellClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommentedCellClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commentedCellClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withComments(
      value: Boolean | typingsSlinky.handsontable.mod.Handsontable.comments.Settings | js.Array[CommentConfig]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(js.undefined)
        ret
    }
    @scala.inline
    def withContextMenu(
      value: Boolean | js.Array[PredefinedMenuItemKey] | typingsSlinky.handsontable.mod.Handsontable.contextMenu.Settings
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContextMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withCopyPaste(value: Boolean | typingsSlinky.handsontable.mod.Handsontable.copyPaste.Settings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyPaste")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCopyPaste: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyPaste")(js.undefined)
        ret
    }
    @scala.inline
    def withCopyable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCopyable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyable")(js.undefined)
        ret
    }
    @scala.inline
    def withCorrectFormat(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("correctFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCorrectFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("correctFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentColClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentColClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentColClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentColClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentHeaderClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentHeaderClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentHeaderClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentHeaderClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentRowClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentRowClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentRowClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentRowClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomBorders(value: Boolean | js.Array[typingsSlinky.handsontable.mod.Handsontable.customBorders.Settings]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customBorders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomBorders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customBorders")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: js.Array[js.Array[CellValue] | RowObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSchemaFunction1(value: /* row */ Double => RowObject | js.Array[CellValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSchema")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDataSchema(
      value: RowObject | js.Array[CellValue] | (js.Function1[/* row */ Double, RowObject | js.Array[CellValue]])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSchema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSchema: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSchema")(js.undefined)
        ret
    }
    @scala.inline
    def withDateFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withDatePickerConfig(value: PikadayOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datePickerConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatePickerConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datePickerConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultDate")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableVisualSelection(value: Boolean | current | area | header | (js.Array[current | area | header])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableVisualSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableVisualSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableVisualSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withDragToScroll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragToScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragToScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragToScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withDropdownMenu(
      value: Boolean | js.Array[PredefinedMenuItemKey] | typingsSlinky.handsontable.mod.Handsontable.contextMenu.Settings
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropdownMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withEditor(
      value: EditorType | (Instantiable6[
          /* hotInstance */ Core, 
          /* row */ Double, 
          /* col */ Double, 
          /* prop */ String | Double, 
          /* TD */ HTMLTableCellElement, 
          /* cellProperties */ CellProperties, 
          Base
        ]) | Boolean | String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editor")(js.undefined)
        ret
    }
    @scala.inline
    def withEnterBeginsEditing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterBeginsEditing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnterBeginsEditing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterBeginsEditing")(js.undefined)
        ret
    }
    @scala.inline
    def withEnterMovesFunction1(value: /* event */ KeyboardEvent => CellCoords): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterMoves")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEnterMoves(value: CellCoords | (js.Function1[/* event */ KeyboardEvent, CellCoords])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterMoves")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnterMoves: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterMoves")(js.undefined)
        ret
    }
    @scala.inline
    def withFillHandle(
      value: Boolean | vertical | horizontal | typingsSlinky.handsontable.mod.Handsontable.autoFill.Settings
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillHandle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFillHandle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillHandle")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withFilteringCaseSensitive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filteringCaseSensitive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilteringCaseSensitive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filteringCaseSensitive")(js.undefined)
        ret
    }
    @scala.inline
    def withFilters(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(js.undefined)
        ret
    }
    @scala.inline
    def withFixedColumnsLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedColumnsLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixedColumnsLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedColumnsLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withFixedRowsBottom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedRowsBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixedRowsBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedRowsBottom")(js.undefined)
        ret
    }
    @scala.inline
    def withFixedRowsTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedRowsTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixedRowsTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedRowsTop")(js.undefined)
        ret
    }
    @scala.inline
    def withFormulas(value: Boolean | typingsSlinky.handsontable.mod.Handsontable.formulas.Settings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formulas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormulas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formulas")(js.undefined)
        ret
    }
    @scala.inline
    def withFragmentSelection(value: Boolean | cell): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fragmentSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFragmentSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fragmentSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withGanttChart(value: typingsSlinky.handsontable.mod.Handsontable.ganttChart.Settings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ganttChart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGanttChart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ganttChart")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderTooltips(value: Boolean | typingsSlinky.handsontable.mod.Handsontable.headerTooltips.Settings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerTooltips")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderTooltips: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerTooltips")(js.undefined)
        ret
    }
    @scala.inline
    def withHeightFunction0(value: () => Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHeight(value: Double | String | (js.Function0[Double | String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withHiddenColumns(value: Boolean | typingsSlinky.handsontable.mod.Handsontable.hiddenColumns.Settings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiddenColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHiddenColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiddenColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withHiddenRows(value: Boolean | typingsSlinky.handsontable.mod.Handsontable.hiddenRows.Settings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiddenRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHiddenRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiddenRows")(js.undefined)
        ret
    }
    @scala.inline
    def withInvalidCellClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidCellClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvalidCellClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidCellClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withIsEmptyCol(value: js.ThisFunction1[/* this */ Core, /* col */ Double, Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEmptyCol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsEmptyCol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEmptyCol")(js.undefined)
        ret
    }
    @scala.inline
    def withIsEmptyRow(value: js.ThisFunction1[/* this */ Core, /* row */ Double, Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEmptyRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsEmptyRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEmptyRow")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: LabelOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
        ret
    }
    @scala.inline
    def withLicenseKey(value: String | `non-commercial-and-evaluation`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("licenseKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLicenseKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("licenseKey")(js.undefined)
        ret
    }
    @scala.inline
    def withManualColumnFreeze(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manualColumnFreeze")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManualColumnFreeze: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manualColumnFreeze")(js.undefined)
        ret
    }
    @scala.inline
    def withManualColumnMove(value: Boolean | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manualColumnMove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManualColumnMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manualColumnMove")(js.undefined)
        ret
    }
    @scala.inline
    def withManualColumnResize(value: Boolean | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manualColumnResize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManualColumnResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manualColumnResize")(js.undefined)
        ret
    }
    @scala.inline
    def withManualRowMove(value: Boolean | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manualRowMove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManualRowMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manualRowMove")(js.undefined)
        ret
    }
    @scala.inline
    def withManualRowResize(value: Boolean | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manualRowResize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManualRowResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manualRowResize")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxCols(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxCols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxCols: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxCols")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxRows(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRows")(js.undefined)
        ret
    }
    @scala.inline
    def withMergeCells(value: Boolean | js.Array[typingsSlinky.handsontable.mod.Handsontable.mergeCells.Settings]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeCells")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMergeCells: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeCells")(js.undefined)
        ret
    }
    @scala.inline
    def withMinCols(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minCols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinCols: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minCols")(js.undefined)
        ret
    }
    @scala.inline
    def withMinRows(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minRows")(js.undefined)
        ret
    }
    @scala.inline
    def withMinSpareCols(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSpareCols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinSpareCols: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSpareCols")(js.undefined)
        ret
    }
    @scala.inline
    def withMinSpareRows(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSpareRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinSpareRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSpareRows")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiColumnSorting(value: Boolean | typingsSlinky.handsontable.mod.Handsontable.multiColumnSorting.Settings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiColumnSorting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiColumnSorting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiColumnSorting")(js.undefined)
        ret
    }
    @scala.inline
    def withNestedHeaders(value: js.Array[js.Array[String | NestedHeader]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nestedHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNestedHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nestedHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withNestedRows(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nestedRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNestedRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nestedRows")(js.undefined)
        ret
    }
    @scala.inline
    def withNoWordWrapClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noWordWrapClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoWordWrapClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noWordWrapClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withNumericFormat(value: NumericFormatOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numericFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumericFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numericFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withObserveChanges(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observeChanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObserveChanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observeChanges")(js.undefined)
        ret
    }
    @scala.inline
    def withObserveDOMVisibility(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observeDOMVisibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObserveDOMVisibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observeDOMVisibility")(js.undefined)
        ret
    }
    @scala.inline
    def withOutsideClickDeselectsFunction1(value: /* target */ HTMLElement => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outsideClickDeselects")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOutsideClickDeselects(value: Boolean | (js.Function1[/* target */ HTMLElement, Boolean])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outsideClickDeselects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutsideClickDeselects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outsideClickDeselects")(js.undefined)
        ret
    }
    @scala.inline
    def withPersistentState(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistentState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersistentState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistentState")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholderCellClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholderCellClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholderCellClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholderCellClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withPreventOverflow(value: Boolean | vertical | horizontal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventOverflow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreventOverflow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventOverflow")(js.undefined)
        ret
    }
    @scala.inline
    def withPreventWheel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventWheel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreventWheel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventWheel")(js.undefined)
        ret
    }
    @scala.inline
    def withReadOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withReadOnlyCellClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnlyCellClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadOnlyCellClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnlyCellClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderAllRows(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderAllRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderAllRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderAllRows")(js.undefined)
        ret
    }
    @scala.inline
    def withRendererFunction7(
      value: (/* instance */ Core, /* TD */ HTMLTableCellElement, /* row */ Double, /* col */ Double, /* prop */ String | Double, /* value */ CellValue, /* cellProperties */ CellProperties) => HTMLTableCellElement | Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderer")(js.Any.fromFunction7(value))
        ret
    }
    @scala.inline
    def withRenderer(value: RendererType | String | typingsSlinky.handsontable.mod.Handsontable.renderers.Base): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderer")(js.undefined)
        ret
    }
    @scala.inline
    def withRowHeaderWidth(value: Double | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHeaderWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowHeaderWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHeaderWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withRowHeadersFunction1(value: /* index */ Double => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHeaders")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRowHeaders(value: Boolean | js.Array[String] | (js.Function1[/* index */ Double, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withRowHeightsFunction1(value: /* index */ Double => String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHeights")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRowHeights(
      value: Double | (js.Array[Double | String]) | String | (js.Function1[/* index */ Double, String | Double])
    ): Self = {
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
    def withSearch(value: Boolean | typingsSlinky.handsontable.mod.Handsontable.search.Settings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectOptions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionMode(value: single | range | multiple): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionMode")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipColumnOnPaste(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipColumnOnPaste")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipColumnOnPaste: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipColumnOnPaste")(js.undefined)
        ret
    }
    @scala.inline
    def withSortByRelevance(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortByRelevance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortByRelevance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortByRelevance")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(
      value: (js.Array[Double | String]) | (js.ThisFunction2[
          /* this */ CellProperties, 
          /* query */ String, 
          /* callback */ js.Function1[/* items */ js.Array[String], Unit], 
          Unit
        ])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
    @scala.inline
    def withStartCols(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startCols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartCols: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startCols")(js.undefined)
        ret
    }
    @scala.inline
    def withStartRows(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startRows")(js.undefined)
        ret
    }
    @scala.inline
    def withStretchH(value: none | all | last): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stretchH")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStretchH: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stretchH")(js.undefined)
        ret
    }
    @scala.inline
    def withStrict(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrict: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strict")(js.undefined)
        ret
    }
    @scala.inline
    def withTabMovesFunction1(value: /* event */ KeyboardEvent => CellCoords): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabMoves")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTabMoves(value: CellCoords | (js.Function1[/* event */ KeyboardEvent, CellCoords])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabMoves")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabMoves: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabMoves")(js.undefined)
        ret
    }
    @scala.inline
    def withTableClassName(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withTrimDropdown(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trimDropdown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrimDropdown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trimDropdown")(js.undefined)
        ret
    }
    @scala.inline
    def withTrimRows(value: Boolean | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trimRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrimRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trimRows")(js.undefined)
        ret
    }
    @scala.inline
    def withTrimWhitespace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trimWhitespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrimWhitespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trimWhitespace")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: CellType | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withUncheckedTemplate(value: Boolean | String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uncheckedTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUncheckedTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uncheckedTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withUndo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUndo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undo")(js.undefined)
        ret
    }
    @scala.inline
    def withValidatorRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidator(
      value: typingsSlinky.handsontable.mod.Handsontable.validators.Base | js.RegExp | ValidatorType | String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validator")(js.undefined)
        ret
    }
    @scala.inline
    def withViewportColumnRenderingOffset(value: Double | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewportColumnRenderingOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewportColumnRenderingOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewportColumnRenderingOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withViewportRowRenderingOffset(value: Double | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewportRowRenderingOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewportRowRenderingOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewportRowRenderingOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withVisibleRows(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibleRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleRows")(js.undefined)
        ret
    }
    @scala.inline
    def withWidthFunction0(value: () => Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withWidth(value: Double | String | (js.Function0[Double | String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
    @scala.inline
    def withWordWrap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wordWrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWordWrap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wordWrap")(js.undefined)
        ret
    }
  }
  
}

