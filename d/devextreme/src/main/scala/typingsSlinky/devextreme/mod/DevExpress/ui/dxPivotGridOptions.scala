package typingsSlinky.devextreme.mod.DevExpress.ui

import typingsSlinky.devextreme.anon.AllowFieldDragging
import typingsSlinky.devextreme.anon.ApplyChangesMode
import typingsSlinky.devextreme.anon.Area
import typingsSlinky.devextreme.anon.Cell
import typingsSlinky.devextreme.anon.CollapseAll
import typingsSlinky.devextreme.anon.ColumnFields
import typingsSlinky.devextreme.anon.CustomLoad
import typingsSlinky.devextreme.anon.FileNameFormat
import typingsSlinky.devextreme.anon.FileNameModel
import typingsSlinky.devextreme.anon.IgnoreExcelErrors
import typingsSlinky.devextreme.anon.Mode
import typingsSlinky.devextreme.anon.SearchTimeout
import typingsSlinky.devextreme.anon.Shading
import typingsSlinky.devextreme.anon.`9`
import typingsSlinky.devextreme.devextremeStrings.both
import typingsSlinky.devextreme.devextremeStrings.column
import typingsSlinky.devextreme.devextremeStrings.columns
import typingsSlinky.devextreme.devextremeStrings.none
import typingsSlinky.devextreme.devextremeStrings.row
import typingsSlinky.devextreme.devextremeStrings.rows
import typingsSlinky.devextreme.devextremeStrings.standard
import typingsSlinky.devextreme.devextremeStrings.tree
import typingsSlinky.devextreme.mod.DevExpress.data.PivotGridDataSource
import typingsSlinky.devextreme.mod.DevExpress.data.PivotGridDataSourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxPivotGridOptions extends WidgetOptions[dxPivotGrid] {
  
  /**
    * [descr:dxPivotGrid.Options.allowExpandAll]
    */
  var allowExpandAll: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxPivotGrid.Options.allowFiltering]
    */
  var allowFiltering: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxPivotGrid.Options.allowSorting]
    */
  var allowSorting: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxPivotGrid.Options.allowSortingBySummary]
    */
  var allowSortingBySummary: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxPivotGrid.Options.dataFieldArea]
    */
  var dataFieldArea: js.UndefOr[column | row] = js.native
  
  /**
    * [descr:dxPivotGrid.Options.dataSource]
    */
  var dataSource: js.UndefOr[js.Array[_] | PivotGridDataSource | PivotGridDataSourceOptions] = js.native
  
  /**
    * [descr:dxPivotGrid.Options.export]
    */
  var export: js.UndefOr[IgnoreExcelErrors] = js.native
  
  /**
    * [descr:dxPivotGrid.Options.fieldChooser]
    */
  var fieldChooser: js.UndefOr[ApplyChangesMode] = js.native
  
  /**
    * [descr:dxPivotGrid.Options.fieldPanel]
    */
  var fieldPanel: js.UndefOr[AllowFieldDragging] = js.native
  
  /**
    * [descr:dxPivotGrid.Options.headerFilter]
    */
  var headerFilter: js.UndefOr[SearchTimeout] = js.native
  
  /**
    * [descr:dxPivotGrid.Options.hideEmptySummaryCells]
    */
  var hideEmptySummaryCells: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxPivotGrid.Options.loadPanel]
    */
  var loadPanel: js.UndefOr[Shading] = js.native
  
  /**
    * [descr:dxPivotGrid.Options.onCellClick]
    */
  var onCellClick: js.UndefOr[js.Function1[/* e */ Area, _]] = js.native
  
  /**
    * [descr:dxPivotGrid.Options.onCellPrepared]
    */
  var onCellPrepared: js.UndefOr[js.Function1[/* e */ Cell, _]] = js.native
  
  /**
    * [descr:dxPivotGrid.Options.onContextMenuPreparing]
    */
  var onContextMenuPreparing: js.UndefOr[js.Function1[/* e */ ColumnFields, _]] = js.native
  
  /**
    * [descr:dxPivotGrid.Options.onExported]
    * @deprecated [depNote:dxPivotGrid.Options.onExported]
    */
  var onExported: js.UndefOr[js.Function1[/* e */ `9`, _]] = js.native
  
  /**
    * [descr:dxPivotGrid.Options.onExporting]
    */
  var onExporting: js.UndefOr[js.Function1[/* e */ FileNameModel, _]] = js.native
  
  /**
    * [descr:dxPivotGrid.Options.onFileSaving]
    * @deprecated [depNote:dxPivotGrid.Options.onFileSaving]
    */
  var onFileSaving: js.UndefOr[js.Function1[/* e */ FileNameFormat, _]] = js.native
  
  /**
    * [descr:dxPivotGrid.Options.rowHeaderLayout]
    */
  var rowHeaderLayout: js.UndefOr[standard | tree] = js.native
  
  /**
    * [descr:dxPivotGrid.Options.scrolling]
    */
  var scrolling: js.UndefOr[Mode] = js.native
  
  /**
    * [descr:dxPivotGrid.Options.showBorders]
    */
  var showBorders: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxPivotGrid.Options.showColumnGrandTotals]
    */
  var showColumnGrandTotals: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxPivotGrid.Options.showColumnTotals]
    */
  var showColumnTotals: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxPivotGrid.Options.showRowGrandTotals]
    */
  var showRowGrandTotals: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxPivotGrid.Options.showRowTotals]
    */
  var showRowTotals: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxPivotGrid.Options.showTotalsPrior]
    */
  var showTotalsPrior: js.UndefOr[both | columns | none | rows] = js.native
  
  /**
    * [descr:dxPivotGrid.Options.stateStoring]
    */
  var stateStoring: js.UndefOr[CustomLoad] = js.native
  
  /**
    * [descr:dxPivotGrid.Options.texts]
    */
  var texts: js.UndefOr[CollapseAll] = js.native
  
  /**
    * [descr:dxPivotGrid.Options.wordWrapEnabled]
    */
  var wordWrapEnabled: js.UndefOr[Boolean] = js.native
}
object dxPivotGridOptions {
  
  @scala.inline
  def apply(): dxPivotGridOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxPivotGridOptions]
  }
  
  @scala.inline
  implicit class dxPivotGridOptionsOps[Self <: dxPivotGridOptions] (val x: Self) extends AnyVal {
    
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
    def setAllowExpandAll(value: Boolean): Self = this.set("allowExpandAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowExpandAll: Self = this.set("allowExpandAll", js.undefined)
    
    @scala.inline
    def setAllowFiltering(value: Boolean): Self = this.set("allowFiltering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowFiltering: Self = this.set("allowFiltering", js.undefined)
    
    @scala.inline
    def setAllowSorting(value: Boolean): Self = this.set("allowSorting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowSorting: Self = this.set("allowSorting", js.undefined)
    
    @scala.inline
    def setAllowSortingBySummary(value: Boolean): Self = this.set("allowSortingBySummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowSortingBySummary: Self = this.set("allowSortingBySummary", js.undefined)
    
    @scala.inline
    def setDataFieldArea(value: column | row): Self = this.set("dataFieldArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataFieldArea: Self = this.set("dataFieldArea", js.undefined)
    
    @scala.inline
    def setDataSourceVarargs(value: js.Any*): Self = this.set("dataSource", js.Array(value :_*))
    
    @scala.inline
    def setDataSource(value: js.Array[_] | PivotGridDataSource | PivotGridDataSourceOptions): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    
    @scala.inline
    def setExport(value: IgnoreExcelErrors): Self = this.set("export", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExport: Self = this.set("export", js.undefined)
    
    @scala.inline
    def setFieldChooser(value: ApplyChangesMode): Self = this.set("fieldChooser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFieldChooser: Self = this.set("fieldChooser", js.undefined)
    
    @scala.inline
    def setFieldPanel(value: AllowFieldDragging): Self = this.set("fieldPanel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFieldPanel: Self = this.set("fieldPanel", js.undefined)
    
    @scala.inline
    def setHeaderFilter(value: SearchTimeout): Self = this.set("headerFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderFilter: Self = this.set("headerFilter", js.undefined)
    
    @scala.inline
    def setHideEmptySummaryCells(value: Boolean): Self = this.set("hideEmptySummaryCells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideEmptySummaryCells: Self = this.set("hideEmptySummaryCells", js.undefined)
    
    @scala.inline
    def setLoadPanel(value: Shading): Self = this.set("loadPanel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadPanel: Self = this.set("loadPanel", js.undefined)
    
    @scala.inline
    def setOnCellClick(value: /* e */ Area => _): Self = this.set("onCellClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnCellClick: Self = this.set("onCellClick", js.undefined)
    
    @scala.inline
    def setOnCellPrepared(value: /* e */ Cell => _): Self = this.set("onCellPrepared", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnCellPrepared: Self = this.set("onCellPrepared", js.undefined)
    
    @scala.inline
    def setOnContextMenuPreparing(value: /* e */ ColumnFields => _): Self = this.set("onContextMenuPreparing", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnContextMenuPreparing: Self = this.set("onContextMenuPreparing", js.undefined)
    
    @scala.inline
    def setOnExported(value: /* e */ `9` => _): Self = this.set("onExported", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnExported: Self = this.set("onExported", js.undefined)
    
    @scala.inline
    def setOnExporting(value: /* e */ FileNameModel => _): Self = this.set("onExporting", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnExporting: Self = this.set("onExporting", js.undefined)
    
    @scala.inline
    def setOnFileSaving(value: /* e */ FileNameFormat => _): Self = this.set("onFileSaving", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnFileSaving: Self = this.set("onFileSaving", js.undefined)
    
    @scala.inline
    def setRowHeaderLayout(value: standard | tree): Self = this.set("rowHeaderLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowHeaderLayout: Self = this.set("rowHeaderLayout", js.undefined)
    
    @scala.inline
    def setScrolling(value: Mode): Self = this.set("scrolling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrolling: Self = this.set("scrolling", js.undefined)
    
    @scala.inline
    def setShowBorders(value: Boolean): Self = this.set("showBorders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowBorders: Self = this.set("showBorders", js.undefined)
    
    @scala.inline
    def setShowColumnGrandTotals(value: Boolean): Self = this.set("showColumnGrandTotals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowColumnGrandTotals: Self = this.set("showColumnGrandTotals", js.undefined)
    
    @scala.inline
    def setShowColumnTotals(value: Boolean): Self = this.set("showColumnTotals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowColumnTotals: Self = this.set("showColumnTotals", js.undefined)
    
    @scala.inline
    def setShowRowGrandTotals(value: Boolean): Self = this.set("showRowGrandTotals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowRowGrandTotals: Self = this.set("showRowGrandTotals", js.undefined)
    
    @scala.inline
    def setShowRowTotals(value: Boolean): Self = this.set("showRowTotals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowRowTotals: Self = this.set("showRowTotals", js.undefined)
    
    @scala.inline
    def setShowTotalsPrior(value: both | columns | none | rows): Self = this.set("showTotalsPrior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowTotalsPrior: Self = this.set("showTotalsPrior", js.undefined)
    
    @scala.inline
    def setStateStoring(value: CustomLoad): Self = this.set("stateStoring", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStateStoring: Self = this.set("stateStoring", js.undefined)
    
    @scala.inline
    def setTexts(value: CollapseAll): Self = this.set("texts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTexts: Self = this.set("texts", js.undefined)
    
    @scala.inline
    def setWordWrapEnabled(value: Boolean): Self = this.set("wordWrapEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWordWrapEnabled: Self = this.set("wordWrapEnabled", js.undefined)
  }
}
