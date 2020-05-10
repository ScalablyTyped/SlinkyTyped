package typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartSpec extends js.Object {
  var altText: js.UndefOr[String] = js.native
  var backgroundColor: js.UndefOr[Color] = js.native
  var basicChart: js.UndefOr[BasicChartSpec] = js.native
  var bubbleChart: js.UndefOr[BubbleChartSpec] = js.native
  var candlestickChart: js.UndefOr[CandlestickChartSpec] = js.native
  var fontName: js.UndefOr[String] = js.native
  var hiddenDimensionStrategy: js.UndefOr[String] = js.native
  var histogramChart: js.UndefOr[HistogramChartSpec] = js.native
  var maximized: js.UndefOr[Boolean] = js.native
  var orgChart: js.UndefOr[OrgChartSpec] = js.native
  var pieChart: js.UndefOr[PieChartSpec] = js.native
  var subtitle: js.UndefOr[String] = js.native
  var subtitleTextFormat: js.UndefOr[TextFormat] = js.native
  var subtitleTextPosition: js.UndefOr[TextPosition] = js.native
  var title: js.UndefOr[String] = js.native
  var titleTextFormat: js.UndefOr[TextFormat] = js.native
  var titleTextPosition: js.UndefOr[TextPosition] = js.native
  var treemapChart: js.UndefOr[TreemapChartSpec] = js.native
  var waterfallChart: js.UndefOr[WaterfallChartSpec] = js.native
}

object ChartSpec {
  @scala.inline
  def apply(): ChartSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartSpec]
  }
  @scala.inline
  implicit class ChartSpecOps[Self <: ChartSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAltText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAltText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altText")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBasicChart(value: BasicChartSpec): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basicChart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBasicChart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basicChart")(js.undefined)
        ret
    }
    @scala.inline
    def withBubbleChart(value: BubbleChartSpec): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bubbleChart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBubbleChart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bubbleChart")(js.undefined)
        ret
    }
    @scala.inline
    def withCandlestickChart(value: CandlestickChartSpec): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("candlestickChart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCandlestickChart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("candlestickChart")(js.undefined)
        ret
    }
    @scala.inline
    def withFontName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontName")(js.undefined)
        ret
    }
    @scala.inline
    def withHiddenDimensionStrategy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiddenDimensionStrategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHiddenDimensionStrategy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiddenDimensionStrategy")(js.undefined)
        ret
    }
    @scala.inline
    def withHistogramChart(value: HistogramChartSpec): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("histogramChart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHistogramChart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("histogramChart")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximized(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximized")(js.undefined)
        ret
    }
    @scala.inline
    def withOrgChart(value: OrgChartSpec): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orgChart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrgChart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orgChart")(js.undefined)
        ret
    }
    @scala.inline
    def withPieChart(value: PieChartSpec): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pieChart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPieChart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pieChart")(js.undefined)
        ret
    }
    @scala.inline
    def withSubtitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubtitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitle")(js.undefined)
        ret
    }
    @scala.inline
    def withSubtitleTextFormat(value: TextFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitleTextFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubtitleTextFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitleTextFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withSubtitleTextPosition(value: TextPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitleTextPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubtitleTextPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitleTextPosition")(js.undefined)
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
    def withTitleTextFormat(value: TextFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleTextFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleTextFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleTextFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleTextPosition(value: TextPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleTextPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleTextPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleTextPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withTreemapChart(value: TreemapChartSpec): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treemapChart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTreemapChart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treemapChart")(js.undefined)
        ret
    }
    @scala.inline
    def withWaterfallChart(value: WaterfallChartSpec): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waterfallChart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaterfallChart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waterfallChart")(js.undefined)
        ret
    }
  }
  
}

