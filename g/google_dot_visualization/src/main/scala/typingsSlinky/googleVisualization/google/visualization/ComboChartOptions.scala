package typingsSlinky.googleVisualization.google.visualization

import typingsSlinky.googleVisualization.googleVisualizationStrings.function
import typingsSlinky.googleVisualization.googleVisualizationStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComboChartOptions extends js.Object {
  var aggregationTarget: js.UndefOr[String] = js.native
  var animation: js.UndefOr[TransitionAnimation] = js.native
  var annotations: js.UndefOr[ChartAnnotations] = js.native
  var areaOpacity: js.UndefOr[Double] = js.native
  var axisTitlesPosition: js.UndefOr[ChartAxisTitlesPosition] = js.native
  var backgroundColor: js.UndefOr[String | ChartStrokeFill] = js.native
  var bar: js.UndefOr[GroupWidth] = js.native
  var candlestick: js.UndefOr[Candlestick] = js.native
  var chartArea: js.UndefOr[ChartArea] = js.native
  var colors: js.UndefOr[js.Array[String]] = js.native
  var crosshair: js.UndefOr[ChartCrosshair] = js.native
  var curveType: js.UndefOr[none | function] = js.native
  var dataOpacity: js.UndefOr[Double] = js.native
  var enableInteractivity: js.UndefOr[Boolean] = js.native
  var focusTarget: js.UndefOr[String] = js.native
  var fontName: js.UndefOr[String] = js.native
  var fontSize: js.UndefOr[Double] = js.native
  var forceIFrame: js.UndefOr[Boolean] = js.native
  var hAxis: js.UndefOr[ChartAxis] = js.native
  var height: js.UndefOr[Double] = js.native
  var interpolateNulls: js.UndefOr[Boolean] = js.native
  var isStacked: js.UndefOr[Boolean] = js.native
  var legend: js.UndefOr[ChartLegend | none] = js.native
  var lineDashStyle: js.UndefOr[js.Array[Double]] = js.native
  var lineWidth: js.UndefOr[Double] = js.native
  var orientation: js.UndefOr[ChartOrientation] = js.native
  var pointShape: js.UndefOr[ChartPointShape] = js.native
  var pointSize: js.UndefOr[Double] = js.native
  var pointsVisible: js.UndefOr[Boolean] = js.native
  var reverseCategories: js.UndefOr[Boolean] = js.native
  var selectionMode: js.UndefOr[ChartSelectionMode] = js.native
  var series: js.UndefOr[js.Any] = js.native
  var seriesType: js.UndefOr[String] = js.native
  var theme: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
  var titlePosition: js.UndefOr[String] = js.native
  var titleTextStyle: js.UndefOr[ChartTextStyle] = js.native
  var tooltip: js.UndefOr[ChartTooltip] = js.native
  var vAxes: js.UndefOr[js.Any] = js.native
  var vAxis: js.UndefOr[ChartAxis] = js.native
  var width: js.UndefOr[Double] = js.native
}

object ComboChartOptions {
  @scala.inline
  def apply(): ComboChartOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComboChartOptions]
  }
  @scala.inline
  implicit class ComboChartOptionsOps[Self <: ComboChartOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAggregationTarget(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregationTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAggregationTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregationTarget")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimation(value: TransitionAnimation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(js.undefined)
        ret
    }
    @scala.inline
    def withAnnotations(value: ChartAnnotations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnnotations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotations")(js.undefined)
        ret
    }
    @scala.inline
    def withAreaOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("areaOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAreaOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("areaOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withAxisTitlesPosition(value: ChartAxisTitlesPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisTitlesPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxisTitlesPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisTitlesPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundColor(value: String | ChartStrokeFill): Self = {
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
    def withBar(value: GroupWidth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bar")(js.undefined)
        ret
    }
    @scala.inline
    def withCandlestick(value: Candlestick): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("candlestick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCandlestick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("candlestick")(js.undefined)
        ret
    }
    @scala.inline
    def withChartArea(value: ChartArea): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chartArea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChartArea: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chartArea")(js.undefined)
        ret
    }
    @scala.inline
    def withColors(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(js.undefined)
        ret
    }
    @scala.inline
    def withCrosshair(value: ChartCrosshair): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crosshair")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrosshair: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crosshair")(js.undefined)
        ret
    }
    @scala.inline
    def withCurveType(value: none | function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("curveType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurveType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("curveType")(js.undefined)
        ret
    }
    @scala.inline
    def withDataOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableInteractivity(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableInteractivity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableInteractivity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableInteractivity")(js.undefined)
        ret
    }
    @scala.inline
    def withFocusTarget(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocusTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusTarget")(js.undefined)
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
    def withFontSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(js.undefined)
        ret
    }
    @scala.inline
    def withForceIFrame(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceIFrame")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceIFrame: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceIFrame")(js.undefined)
        ret
    }
    @scala.inline
    def withHAxis(value: ChartAxis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hAxis")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
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
    def withInterpolateNulls(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interpolateNulls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterpolateNulls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interpolateNulls")(js.undefined)
        ret
    }
    @scala.inline
    def withIsStacked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isStacked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsStacked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isStacked")(js.undefined)
        ret
    }
    @scala.inline
    def withLegend(value: ChartLegend | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legend")(js.undefined)
        ret
    }
    @scala.inline
    def withLineDashStyle(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineDashStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineDashStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineDashStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withLineWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withOrientation(value: ChartOrientation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(js.undefined)
        ret
    }
    @scala.inline
    def withPointShape(value: ChartPointShape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointShape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointShape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointShape")(js.undefined)
        ret
    }
    @scala.inline
    def withPointSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointSize")(js.undefined)
        ret
    }
    @scala.inline
    def withPointsVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointsVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointsVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointsVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withReverseCategories(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverseCategories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReverseCategories: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverseCategories")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionMode(value: ChartSelectionMode): Self = {
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
    def withSeries(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("series")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("series")(js.undefined)
        ret
    }
    @scala.inline
    def withSeriesType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeriesType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesType")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
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
    def withTitlePosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titlePosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitlePosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titlePosition")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleTextStyle(value: ChartTextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleTextStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleTextStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleTextStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltip(value: ChartTooltip): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withVAxes(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vAxes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVAxes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vAxes")(js.undefined)
        ret
    }
    @scala.inline
    def withVAxis(value: ChartAxis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vAxis")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
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
  }
  
}

