package typingsSlinky.botvs.botvsMod._Global_.botvs

import typingsSlinky.highcharts.highchartsMod.AccessibilityOptions
import typingsSlinky.highcharts.highchartsMod.AnnotationsOptions
import typingsSlinky.highcharts.highchartsMod.BoostOptions
import typingsSlinky.highcharts.highchartsMod.CaptionOptions
import typingsSlinky.highcharts.highchartsMod.ColorAxisOptions
import typingsSlinky.highcharts.highchartsMod.ColorString
import typingsSlinky.highcharts.highchartsMod.ConnectorsOptions
import typingsSlinky.highcharts.highchartsMod.CreditsOptions
import typingsSlinky.highcharts.highchartsMod.DataOptions
import typingsSlinky.highcharts.highchartsMod.DrilldownOptions
import typingsSlinky.highcharts.highchartsMod.ExportingOptions
import typingsSlinky.highcharts.highchartsMod.GlobalOptions
import typingsSlinky.highcharts.highchartsMod.LangOptions
import typingsSlinky.highcharts.highchartsMod.LegendOptions
import typingsSlinky.highcharts.highchartsMod.LoadingOptions
import typingsSlinky.highcharts.highchartsMod.MapNavigationOptions
import typingsSlinky.highcharts.highchartsMod.NavigationOptions
import typingsSlinky.highcharts.highchartsMod.NavigatorOptions
import typingsSlinky.highcharts.highchartsMod.NoDataOptions
import typingsSlinky.highcharts.highchartsMod.Options
import typingsSlinky.highcharts.highchartsMod.PaneOptions
import typingsSlinky.highcharts.highchartsMod.PlotOptions
import typingsSlinky.highcharts.highchartsMod.RangeSelectorOptions
import typingsSlinky.highcharts.highchartsMod.ResponsiveOptions
import typingsSlinky.highcharts.highchartsMod.ScrollbarOptions
import typingsSlinky.highcharts.highchartsMod.SeriesOptionsType
import typingsSlinky.highcharts.highchartsMod.StockToolsOptions
import typingsSlinky.highcharts.highchartsMod.SubtitleOptions
import typingsSlinky.highcharts.highchartsMod.TimeOptions
import typingsSlinky.highcharts.highchartsMod.TitleOptions
import typingsSlinky.highcharts.highchartsMod.TooltipOptions
import typingsSlinky.highcharts.highchartsMod.XAxisOptions
import typingsSlinky.highcharts.highchartsMod.YAxisOptions
import typingsSlinky.highcharts.highchartsMod.ZAxisOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartOptions extends Options {
  var __isStock: js.UndefOr[Boolean] = js.undefined
}

object ChartOptions {
  @scala.inline
  def apply(
    __isStock: js.UndefOr[Boolean] = js.undefined,
    accessibility: AccessibilityOptions = null,
    annotations: js.Array[AnnotationsOptions] = null,
    boost: BoostOptions = null,
    caption: CaptionOptions = null,
    chart: typingsSlinky.highcharts.highchartsMod.ChartOptions = null,
    colorAxis: ColorAxisOptions | js.Array[ColorAxisOptions] = null,
    colors: js.Array[ColorString] = null,
    connectors: ConnectorsOptions = null,
    credits: CreditsOptions = null,
    data: DataOptions = null,
    defs: js.Any = null,
    drilldown: DrilldownOptions = null,
    exporting: ExportingOptions = null,
    global: GlobalOptions = null,
    lang: LangOptions = null,
    legend: LegendOptions = null,
    loading: LoadingOptions = null,
    mapNavigation: MapNavigationOptions = null,
    navigation: NavigationOptions = null,
    navigator: NavigatorOptions = null,
    noData: NoDataOptions = null,
    pane: PaneOptions = null,
    plotOptions: PlotOptions = null,
    rangeSelector: RangeSelectorOptions = null,
    responsive: ResponsiveOptions = null,
    scrollbar: ScrollbarOptions = null,
    series: js.Array[SeriesOptionsType] = null,
    stockTools: js.Object | StockToolsOptions = null,
    subtitle: SubtitleOptions = null,
    time: TimeOptions = null,
    title: TitleOptions = null,
    tooltip: TooltipOptions = null,
    xAxis: XAxisOptions | js.Array[XAxisOptions] = null,
    yAxis: YAxisOptions | js.Array[YAxisOptions] = null,
    zAxis: ZAxisOptions | js.Array[ZAxisOptions] = null
  ): ChartOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(__isStock)) __obj.updateDynamic("__isStock")(__isStock.asInstanceOf[js.Any])
    if (accessibility != null) __obj.updateDynamic("accessibility")(accessibility.asInstanceOf[js.Any])
    if (annotations != null) __obj.updateDynamic("annotations")(annotations.asInstanceOf[js.Any])
    if (boost != null) __obj.updateDynamic("boost")(boost.asInstanceOf[js.Any])
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (chart != null) __obj.updateDynamic("chart")(chart.asInstanceOf[js.Any])
    if (colorAxis != null) __obj.updateDynamic("colorAxis")(colorAxis.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (connectors != null) __obj.updateDynamic("connectors")(connectors.asInstanceOf[js.Any])
    if (credits != null) __obj.updateDynamic("credits")(credits.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (defs != null) __obj.updateDynamic("defs")(defs.asInstanceOf[js.Any])
    if (drilldown != null) __obj.updateDynamic("drilldown")(drilldown.asInstanceOf[js.Any])
    if (exporting != null) __obj.updateDynamic("exporting")(exporting.asInstanceOf[js.Any])
    if (global != null) __obj.updateDynamic("global")(global.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (legend != null) __obj.updateDynamic("legend")(legend.asInstanceOf[js.Any])
    if (loading != null) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (mapNavigation != null) __obj.updateDynamic("mapNavigation")(mapNavigation.asInstanceOf[js.Any])
    if (navigation != null) __obj.updateDynamic("navigation")(navigation.asInstanceOf[js.Any])
    if (navigator != null) __obj.updateDynamic("navigator")(navigator.asInstanceOf[js.Any])
    if (noData != null) __obj.updateDynamic("noData")(noData.asInstanceOf[js.Any])
    if (pane != null) __obj.updateDynamic("pane")(pane.asInstanceOf[js.Any])
    if (plotOptions != null) __obj.updateDynamic("plotOptions")(plotOptions.asInstanceOf[js.Any])
    if (rangeSelector != null) __obj.updateDynamic("rangeSelector")(rangeSelector.asInstanceOf[js.Any])
    if (responsive != null) __obj.updateDynamic("responsive")(responsive.asInstanceOf[js.Any])
    if (scrollbar != null) __obj.updateDynamic("scrollbar")(scrollbar.asInstanceOf[js.Any])
    if (series != null) __obj.updateDynamic("series")(series.asInstanceOf[js.Any])
    if (stockTools != null) __obj.updateDynamic("stockTools")(stockTools.asInstanceOf[js.Any])
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (xAxis != null) __obj.updateDynamic("xAxis")(xAxis.asInstanceOf[js.Any])
    if (yAxis != null) __obj.updateDynamic("yAxis")(yAxis.asInstanceOf[js.Any])
    if (zAxis != null) __obj.updateDynamic("zAxis")(zAxis.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartOptions]
  }
}

