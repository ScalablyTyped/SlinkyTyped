package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains options related to exporting a dashboard/dashboard item to the PDF format.
  */
@js.native
trait DashboardPdfExportOptions extends js.Object {
  
  /**
    * Gets or sets the number of horizontal/vertical pages spanning the total width/height of a dashboard/dashboard item.
    */
  var AutoFitPageCount: Double = js.native
  
  /**
    * Gets or sets whether cards within the Card dashboard item are arranged automatically on the exported page.
    */
  var CardAutoArrangeContent: Boolean = js.native
  
  /**
    * Gets or sets whether the page orientation used to export the Chart dashboard item is selected automatically.
    */
  var ChartAutomaticPageLayout: Boolean = js.native
  
  /**
    * Gets or sets the export size mode for the Chart dashboard item.
    */
  var ChartSizeMode: String = js.native
  
  /**
    * Gets or sets whether the page orientation used to export a dashboard is selected automatically.
    */
  var DashboardAutomaticPageLayout: Boolean = js.native
  
  /**
    * Gets or sets a position of the dashboard state (such as master filter or current parameter values) in the exported document.
    */
  var DashboardStatePosition: String = js.native
  
  /**
    * Gets or sets the mode for scaling a dashboard/dashboard item in the exported document.
    */
  var DocumentScaleMode: String = js.native
  
  /**
    * Gets or sets whether to add the state of master filter items to the exported document.
    */
  var ExportFilters: Boolean = js.native
  
  /**
    * Gets or sets whether to add current parameter values to the exported document.
    */
  var ExportParameters: Boolean = js.native
  
  var FontInfo: ExportFontInfo = js.native
  
  /**
    * Gets or sets whether gauges within the Gauge dashboard item are arranged automatically on the exported page.
    */
  var GaugeAutoArrangeContent: Boolean = js.native
  
  /**
    * Gets or sets whether the size of the Grid dashboard item is changed according to the width of the exported page.
    */
  var GridFitToPageWidth: Boolean = js.native
  
  /**
    * Gets or sets whether to add column headers of the Grid dashboard item to every page.
    */
  var GridPrintHeadersOnEveryPage: Boolean = js.native
  
  /**
    * Gets or sets whether to add current values of a hidden parameter to the exported document.
    */
  var IncludeHiddenParameters: Boolean = js.native
  
  /**
    * Gets or sets whether the page orientation used to export the Map dashboard item is selected automatically.
    */
  var MapAutomaticPageLayout: Boolean = js.native
  
  /**
    * Gets or sets the export size mode for the Map dashboard item.
    */
  var MapSizeMode: String = js.native
  
  /**
    * Gets or sets the page orientation used to export a dashboard/dashboard item.
    */
  var PageLayout: String = js.native
  
  /**
    * Gets or sets the type of paper for the exported document.
    */
  var PaperKind: String = js.native
  
  /**
    * Gets or sets whether pies within the Pie dashboard item are arranged automatically on the exported page.
    */
  var PieAutoArrangeContent: Boolean = js.native
  
  /**
    * Gets or sets whether to add column headers of the Pivot dashboard item to every page.
    */
  var PivotPrintHeadersOnEveryPage: Boolean = js.native
  
  /**
    * Gets or sets whether the page orientation used to export the Range Filter dashboard item is selected automatically.
    */
  var RangeFilterAutomaticPageLayout: Boolean = js.native
  
  /**
    * Gets or sets the export size mode for the Range Filter dashboard item.
    */
  var RangeFilterSizeMode: String = js.native
  
  /**
    * Gets or sets the scale factor (in fractions of 1), by which a dashboard/dashboard item is scaled in the exported document.
    */
  var ScaleFactor: Double = js.native
  
  /** @deprecated The ScaleMode property is obsolete now. Use the DocumentScaleMode and DashboardAutomaticPageLayout property instead. */
  /**
    * Gets or sets the mode for scaling a dashboard/dashboard item in the exported document.
    */
  var ScaleMode: String = js.native
  
  /**
    * Gets or sets whether a dashboard title (or dashboard item's caption) is included as the exported document title.
    */
  var ShowTitle: Boolean = js.native
  
  /**
    * Gets or sets the title of the exported document.
    */
  var Title: String = js.native
  
  /**
    * Gets or sets whether the page orientation used to export the Treemap dashboard item is selected automatically.
    */
  var TreemapAutomaticPageLayout: Boolean = js.native
  
  /**
    * Gets or sets the export size mode for the Treemap dashboard item.
    */
  var TreemapSizeMode: String = js.native
}
object DashboardPdfExportOptions {
  
  @scala.inline
  def apply(
    AutoFitPageCount: Double,
    CardAutoArrangeContent: Boolean,
    ChartAutomaticPageLayout: Boolean,
    ChartSizeMode: String,
    DashboardAutomaticPageLayout: Boolean,
    DashboardStatePosition: String,
    DocumentScaleMode: String,
    ExportFilters: Boolean,
    ExportParameters: Boolean,
    FontInfo: ExportFontInfo,
    GaugeAutoArrangeContent: Boolean,
    GridFitToPageWidth: Boolean,
    GridPrintHeadersOnEveryPage: Boolean,
    IncludeHiddenParameters: Boolean,
    MapAutomaticPageLayout: Boolean,
    MapSizeMode: String,
    PageLayout: String,
    PaperKind: String,
    PieAutoArrangeContent: Boolean,
    PivotPrintHeadersOnEveryPage: Boolean,
    RangeFilterAutomaticPageLayout: Boolean,
    RangeFilterSizeMode: String,
    ScaleFactor: Double,
    ScaleMode: String,
    ShowTitle: Boolean,
    Title: String,
    TreemapAutomaticPageLayout: Boolean,
    TreemapSizeMode: String
  ): DashboardPdfExportOptions = {
    val __obj = js.Dynamic.literal(AutoFitPageCount = AutoFitPageCount.asInstanceOf[js.Any], CardAutoArrangeContent = CardAutoArrangeContent.asInstanceOf[js.Any], ChartAutomaticPageLayout = ChartAutomaticPageLayout.asInstanceOf[js.Any], ChartSizeMode = ChartSizeMode.asInstanceOf[js.Any], DashboardAutomaticPageLayout = DashboardAutomaticPageLayout.asInstanceOf[js.Any], DashboardStatePosition = DashboardStatePosition.asInstanceOf[js.Any], DocumentScaleMode = DocumentScaleMode.asInstanceOf[js.Any], ExportFilters = ExportFilters.asInstanceOf[js.Any], ExportParameters = ExportParameters.asInstanceOf[js.Any], FontInfo = FontInfo.asInstanceOf[js.Any], GaugeAutoArrangeContent = GaugeAutoArrangeContent.asInstanceOf[js.Any], GridFitToPageWidth = GridFitToPageWidth.asInstanceOf[js.Any], GridPrintHeadersOnEveryPage = GridPrintHeadersOnEveryPage.asInstanceOf[js.Any], IncludeHiddenParameters = IncludeHiddenParameters.asInstanceOf[js.Any], MapAutomaticPageLayout = MapAutomaticPageLayout.asInstanceOf[js.Any], MapSizeMode = MapSizeMode.asInstanceOf[js.Any], PageLayout = PageLayout.asInstanceOf[js.Any], PaperKind = PaperKind.asInstanceOf[js.Any], PieAutoArrangeContent = PieAutoArrangeContent.asInstanceOf[js.Any], PivotPrintHeadersOnEveryPage = PivotPrintHeadersOnEveryPage.asInstanceOf[js.Any], RangeFilterAutomaticPageLayout = RangeFilterAutomaticPageLayout.asInstanceOf[js.Any], RangeFilterSizeMode = RangeFilterSizeMode.asInstanceOf[js.Any], ScaleFactor = ScaleFactor.asInstanceOf[js.Any], ScaleMode = ScaleMode.asInstanceOf[js.Any], ShowTitle = ShowTitle.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any], TreemapAutomaticPageLayout = TreemapAutomaticPageLayout.asInstanceOf[js.Any], TreemapSizeMode = TreemapSizeMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[DashboardPdfExportOptions]
  }
  
  @scala.inline
  implicit class DashboardPdfExportOptionsOps[Self <: DashboardPdfExportOptions] (val x: Self) extends AnyVal {
    
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
    def setAutoFitPageCount(value: Double): Self = this.set("AutoFitPageCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCardAutoArrangeContent(value: Boolean): Self = this.set("CardAutoArrangeContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChartAutomaticPageLayout(value: Boolean): Self = this.set("ChartAutomaticPageLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChartSizeMode(value: String): Self = this.set("ChartSizeMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashboardAutomaticPageLayout(value: Boolean): Self = this.set("DashboardAutomaticPageLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashboardStatePosition(value: String): Self = this.set("DashboardStatePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentScaleMode(value: String): Self = this.set("DocumentScaleMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportFilters(value: Boolean): Self = this.set("ExportFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportParameters(value: Boolean): Self = this.set("ExportParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontInfo(value: ExportFontInfo): Self = this.set("FontInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGaugeAutoArrangeContent(value: Boolean): Self = this.set("GaugeAutoArrangeContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridFitToPageWidth(value: Boolean): Self = this.set("GridFitToPageWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridPrintHeadersOnEveryPage(value: Boolean): Self = this.set("GridPrintHeadersOnEveryPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeHiddenParameters(value: Boolean): Self = this.set("IncludeHiddenParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapAutomaticPageLayout(value: Boolean): Self = this.set("MapAutomaticPageLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapSizeMode(value: String): Self = this.set("MapSizeMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageLayout(value: String): Self = this.set("PageLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaperKind(value: String): Self = this.set("PaperKind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPieAutoArrangeContent(value: Boolean): Self = this.set("PieAutoArrangeContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPivotPrintHeadersOnEveryPage(value: Boolean): Self = this.set("PivotPrintHeadersOnEveryPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeFilterAutomaticPageLayout(value: Boolean): Self = this.set("RangeFilterAutomaticPageLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeFilterSizeMode(value: String): Self = this.set("RangeFilterSizeMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleFactor(value: Double): Self = this.set("ScaleFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleMode(value: String): Self = this.set("ScaleMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowTitle(value: Boolean): Self = this.set("ShowTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("Title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTreemapAutomaticPageLayout(value: Boolean): Self = this.set("TreemapAutomaticPageLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTreemapSizeMode(value: String): Self = this.set("TreemapSizeMode", value.asInstanceOf[js.Any])
  }
}
