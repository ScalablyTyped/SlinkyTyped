package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings that specify parameters affecting how the dashboard (dashboard item) is exported.
  */
@js.native
trait ASPxClientDashboardExportOptions extends js.Object {
  /** @deprecated This AutoFitPageCount property is obsolete now. Use the DashboardPdfExportOptions.AutoFitPageCount property instead. To learn more, see the following KB article: https://www.devexpress.com/Support/Center/Question/Details/T488764 */
  /**
    * Gets or sets the number of horizontal/vertical pages spanning the total width/height of a dashboard (dashboard item).
    */
  var AutoFitPageCount: Double = js.native
  /** @deprecated The CardOptions property is obsolete now. Use properties with the 'Card' prefix exposed by the DashboardPdfExportOptions class. To learn more, see the following KB article: https://www.devexpress.com/Support/Center/Question/Details/T488764 */
  /**
    * Provides access to options for exporting a Card dashboard item.
    */
  var CardOptions: CardExportOptions = js.native
  /** @deprecated The ChartOptions property is obsolete now. Use properties with the 'Chart' prefix exposed by the DashboardPdfExportOptions class. To learn more, see the following KB article: https://www.devexpress.com/Support/Center/Question/Details/T488764 */
  /**
    * Provides access to options for exporting a Chart dashboard item.
    */
  var ChartOptions: ChartExportOptions = js.native
  /** @deprecated The ExcelOptions property is obsolete now. Use properties exposed by the DashboardExcelExportOptions class instead. To learn more, see the following KB article: https://www.devexpress.com/Support/Center/Question/Details/T488764 */
  /**
    * Provides access to options for exporting individual dashboard items in Excel format.
    */
  var ExcelOptions: ExcelFormatOptions = js.native
  /** @deprecated This property is obsolete now. Instead use the ExportFilters/DashboardStatePosition properties exposed by the DashboardPdfExportOptions/DashboardImageExportOptions classes. To learn more, see the following KB article: https://www.devexpress.com/Support/Center/Question/Details/T488764 */
  /**
    * Gets or sets the filter state's location on the exported document.
    */
  var FilterState: String = js.native
  /** @deprecated The GaugeOptions property is obsolete now. Use properties with the 'Gauge' prefix exposed by the DashboardPdfExportOptions class. To learn more, see the following KB article: https://www.devexpress.com/Support/Center/Question/Details/T488764 */
  /**
    * Provides access to options for exporting a Gauge dashboard item.
    */
  var GaugeOptions: GaugeExportOptions = js.native
  /** @deprecated The GridOptions property is obsolete now. Use properties with the 'Grid' prefix exposed by the DashboardPdfExportOptions class. To learn more, see the following KB article: https://www.devexpress.com/Support/Center/Question/Details/T488764 */
  /**
    * Provides access to options for exporting a Grid dashboard item.
    */
  var GridOptions: GridExportOptions = js.native
  /** @deprecated The ImageOptions property is obsolete now. Use properties exposed by the DashboardImageExportOptions class instead. To learn more, see the following KB article: https://www.devexpress.com/Support/Center/Question/Details/T488764 */
  /**
    * Provides access to options for exporting a dashboard or individual items in Image format.
    */
  var ImageOptions: ImageFormatOptions = js.native
  /** @deprecated The MapOptions property is obsolete now. Use properties with the 'Map' prefix exposed by the DashboardPdfExportOptions class. To learn more, see the following KB article: https://www.devexpress.com/Support/Center/Question/Details/T488764 */
  /**
    * Provides access to options for exporting map dashboard items.
    */
  var MapOptions: MapExportOptions = js.native
  /** @deprecated The PageLayout property is obsolete now. Use the DashboardPdfExportOptions.PageLayout property instead. To learn more, see the following KB article: https://www.devexpress.com/Support/Center/Question/Details/T488764 */
  /**
    * Gets or sets the page orientation used to export a dashboard (dashboard item).
    */
  var PageLayout: String = js.native
  /** @deprecated The PaperKind property is obsolete now. Use the DashboardPdfExportOptions.PaperKind property instead. To learn more, see the following KB article: https://www.devexpress.com/Support/Center/Question/Details/T488764 */
  /**
    * Gets or sets the standard paper size.
    */
  var PaperKind: String = js.native
  /** @deprecated The PieOptions property is obsolete now. Use properties with the 'Pie' prefix exposed by the DashboardPdfExportOptions class. To learn more, see the following KB article: https://www.devexpress.com/Support/Center/Question/Details/T488764 */
  /**
    * Provides access to options for exporting a Pie dashboard item.
    */
  var PieOptions: PieExportOptions = js.native
  /** @deprecated The PivotOptions property is obsolete now. Use properties with the 'Pivot' prefix exposed by the DashboardPdfExportOptions class. To learn more, see the following KB article: https://www.devexpress.com/Support/Center/Question/Details/T488764 */
  /**
    * Provides access to options for exporting a Pivot dashboard item.
    */
  var PivotOptions: PivotExportOptions = js.native
  /** @deprecated The RangeFilterOptions property is obsolete now. Use properties with the 'RangeFilter' prefix exposed by the DashboardPdfExportOptions class. To learn more, see the following KB article: https://www.devexpress.com/Support/Center/Question/Details/T488764 */
  /**
    * Provides access to options for exporting a Range Filter dashboard item.
    */
  var RangeFilterOptions: RangeFilterExportOptions = js.native
  /** @deprecated The ScaleFactor property is obsolete now. Use the DashboardPdfExportOptions.ScaleFactor and DashboardImageExportOptions.ScaleFactor properties instead. To learn more, see the following KB article: https://www.devexpress.com/Support/Center/Question/Details/T488764 */
  /**
    * Gets or sets the scale factor (in fractions of 1) by which a dashboard (dashboard item) is scaled.
    */
  var ScaleFactor: Double = js.native
  /** @deprecated The ScaleMode property is obsolete now. Use the DashboardPdfExportOptions.ScaleMode property instead. To learn more, see the following KB article: https://www.devexpress.com/Support/Center/Question/Details/T488764 */
  /**
    * Gets or sets the mode for scaling when exporting a dashboard (dashboard item).
    */
  var ScaleMode: String = js.native
  /** @deprecated The ShowTitle property is obsolete now. Use the DashboardPdfExportOptions.ShowTitle and DashboardImageExportOptions.ShowTitle properties instead. To learn more, see the following KB article: https://www.devexpress.com/Support/Center/Question/Details/T488764 */
  /**
    * Gets or sets whether a dashboard title (or dashboard item's caption) is included as the exported document title.
    */
  var ShowTitle: Boolean = js.native
  /** @deprecated The Title property is obsolete now. Use the DashboardPdfExportOptions.Title and DashboardImageExportOptions.Title properties instead. To learn more, see the following KB article: https://www.devexpress.com/Support/Center/Question/Details/T488764 */
  /**
    * Gets or sets the title of the exported document.
    */
  var Title: String = js.native
  /** @deprecated The TreemapOptions property is obsolete now. Use properties with the 'Treemap' prefix exposed by the DashboardPdfExportOptions class. To learn more, see the following KB article: https://www.devexpress.com/Support/Center/Question/Details/T488764 */
  /**
    * Provides access to options for exporting a Treemap dashboard item.
    */
  var TreemapOptions: TreemapExportOptions = js.native
}

object ASPxClientDashboardExportOptions {
  @scala.inline
  def apply(
    AutoFitPageCount: Double,
    CardOptions: CardExportOptions,
    ChartOptions: ChartExportOptions,
    ExcelOptions: ExcelFormatOptions,
    FilterState: String,
    GaugeOptions: GaugeExportOptions,
    GridOptions: GridExportOptions,
    ImageOptions: ImageFormatOptions,
    MapOptions: MapExportOptions,
    PageLayout: String,
    PaperKind: String,
    PieOptions: PieExportOptions,
    PivotOptions: PivotExportOptions,
    RangeFilterOptions: RangeFilterExportOptions,
    ScaleFactor: Double,
    ScaleMode: String,
    ShowTitle: Boolean,
    Title: String,
    TreemapOptions: TreemapExportOptions
  ): ASPxClientDashboardExportOptions = {
    val __obj = js.Dynamic.literal(AutoFitPageCount = AutoFitPageCount.asInstanceOf[js.Any], CardOptions = CardOptions.asInstanceOf[js.Any], ChartOptions = ChartOptions.asInstanceOf[js.Any], ExcelOptions = ExcelOptions.asInstanceOf[js.Any], FilterState = FilterState.asInstanceOf[js.Any], GaugeOptions = GaugeOptions.asInstanceOf[js.Any], GridOptions = GridOptions.asInstanceOf[js.Any], ImageOptions = ImageOptions.asInstanceOf[js.Any], MapOptions = MapOptions.asInstanceOf[js.Any], PageLayout = PageLayout.asInstanceOf[js.Any], PaperKind = PaperKind.asInstanceOf[js.Any], PieOptions = PieOptions.asInstanceOf[js.Any], PivotOptions = PivotOptions.asInstanceOf[js.Any], RangeFilterOptions = RangeFilterOptions.asInstanceOf[js.Any], ScaleFactor = ScaleFactor.asInstanceOf[js.Any], ScaleMode = ScaleMode.asInstanceOf[js.Any], ShowTitle = ShowTitle.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any], TreemapOptions = TreemapOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDashboardExportOptions]
  }
  @scala.inline
  implicit class ASPxClientDashboardExportOptionsOps[Self <: ASPxClientDashboardExportOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoFitPageCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoFitPageCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCardOptions(value: CardExportOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CardOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChartOptions(value: ChartExportOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChartOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExcelOptions(value: ExcelFormatOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExcelOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilterState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FilterState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGaugeOptions(value: GaugeExportOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GaugeOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGridOptions(value: GridExportOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GridOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImageOptions(value: ImageFormatOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImageOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMapOptions(value: MapExportOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MapOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageLayout(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PageLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaperKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PaperKind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPieOptions(value: PieExportOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PieOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPivotOptions(value: PivotExportOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PivotOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRangeFilterOptions(value: RangeFilterExportOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RangeFilterOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScaleFactor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScaleFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScaleMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScaleMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowTitle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShowTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTreemapOptions(value: TreemapExportOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TreemapOptions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

