package typingsSlinky.googleVisualization.google.visualization

import typingsSlinky.googleVisualization.googleVisualizationStrings.function
import typingsSlinky.googleVisualization.googleVisualizationStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAggregationTarget(value: String): Self = this.set("aggregationTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAggregationTarget: Self = this.set("aggregationTarget", js.undefined)
    
    @scala.inline
    def setAnimation(value: TransitionAnimation): Self = this.set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    
    @scala.inline
    def setAnnotations(value: ChartAnnotations): Self = this.set("annotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnnotations: Self = this.set("annotations", js.undefined)
    
    @scala.inline
    def setAreaOpacity(value: Double): Self = this.set("areaOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAreaOpacity: Self = this.set("areaOpacity", js.undefined)
    
    @scala.inline
    def setAxisTitlesPosition(value: ChartAxisTitlesPosition): Self = this.set("axisTitlesPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAxisTitlesPosition: Self = this.set("axisTitlesPosition", js.undefined)
    
    @scala.inline
    def setBackgroundColor(value: String | ChartStrokeFill): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setBar(value: GroupWidth): Self = this.set("bar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBar: Self = this.set("bar", js.undefined)
    
    @scala.inline
    def setCandlestick(value: Candlestick): Self = this.set("candlestick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCandlestick: Self = this.set("candlestick", js.undefined)
    
    @scala.inline
    def setChartArea(value: ChartArea): Self = this.set("chartArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChartArea: Self = this.set("chartArea", js.undefined)
    
    @scala.inline
    def setColorsVarargs(value: String*): Self = this.set("colors", js.Array(value :_*))
    
    @scala.inline
    def setColors(value: js.Array[String]): Self = this.set("colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
    
    @scala.inline
    def setCrosshair(value: ChartCrosshair): Self = this.set("crosshair", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrosshair: Self = this.set("crosshair", js.undefined)
    
    @scala.inline
    def setCurveType(value: none | function): Self = this.set("curveType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurveType: Self = this.set("curveType", js.undefined)
    
    @scala.inline
    def setDataOpacity(value: Double): Self = this.set("dataOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataOpacity: Self = this.set("dataOpacity", js.undefined)
    
    @scala.inline
    def setEnableInteractivity(value: Boolean): Self = this.set("enableInteractivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableInteractivity: Self = this.set("enableInteractivity", js.undefined)
    
    @scala.inline
    def setFocusTarget(value: String): Self = this.set("focusTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocusTarget: Self = this.set("focusTarget", js.undefined)
    
    @scala.inline
    def setFontName(value: String): Self = this.set("fontName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontName: Self = this.set("fontName", js.undefined)
    
    @scala.inline
    def setFontSize(value: Double): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    
    @scala.inline
    def setForceIFrame(value: Boolean): Self = this.set("forceIFrame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceIFrame: Self = this.set("forceIFrame", js.undefined)
    
    @scala.inline
    def setHAxis(value: ChartAxis): Self = this.set("hAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHAxis: Self = this.set("hAxis", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setInterpolateNulls(value: Boolean): Self = this.set("interpolateNulls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterpolateNulls: Self = this.set("interpolateNulls", js.undefined)
    
    @scala.inline
    def setIsStacked(value: Boolean): Self = this.set("isStacked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsStacked: Self = this.set("isStacked", js.undefined)
    
    @scala.inline
    def setLegend(value: ChartLegend | none): Self = this.set("legend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLegend: Self = this.set("legend", js.undefined)
    
    @scala.inline
    def setLineDashStyleVarargs(value: Double*): Self = this.set("lineDashStyle", js.Array(value :_*))
    
    @scala.inline
    def setLineDashStyle(value: js.Array[Double]): Self = this.set("lineDashStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineDashStyle: Self = this.set("lineDashStyle", js.undefined)
    
    @scala.inline
    def setLineWidth(value: Double): Self = this.set("lineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineWidth: Self = this.set("lineWidth", js.undefined)
    
    @scala.inline
    def setOrientation(value: ChartOrientation): Self = this.set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    
    @scala.inline
    def setPointShape(value: ChartPointShape): Self = this.set("pointShape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointShape: Self = this.set("pointShape", js.undefined)
    
    @scala.inline
    def setPointSize(value: Double): Self = this.set("pointSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointSize: Self = this.set("pointSize", js.undefined)
    
    @scala.inline
    def setPointsVisible(value: Boolean): Self = this.set("pointsVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointsVisible: Self = this.set("pointsVisible", js.undefined)
    
    @scala.inline
    def setReverseCategories(value: Boolean): Self = this.set("reverseCategories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReverseCategories: Self = this.set("reverseCategories", js.undefined)
    
    @scala.inline
    def setSelectionMode(value: ChartSelectionMode): Self = this.set("selectionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionMode: Self = this.set("selectionMode", js.undefined)
    
    @scala.inline
    def setSeries(value: js.Any): Self = this.set("series", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeries: Self = this.set("series", js.undefined)
    
    @scala.inline
    def setSeriesType(value: String): Self = this.set("seriesType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeriesType: Self = this.set("seriesType", js.undefined)
    
    @scala.inline
    def setTheme(value: String): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTitlePosition(value: String): Self = this.set("titlePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitlePosition: Self = this.set("titlePosition", js.undefined)
    
    @scala.inline
    def setTitleTextStyle(value: ChartTextStyle): Self = this.set("titleTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleTextStyle: Self = this.set("titleTextStyle", js.undefined)
    
    @scala.inline
    def setTooltip(value: ChartTooltip): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    
    @scala.inline
    def setVAxes(value: js.Any): Self = this.set("vAxes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVAxes: Self = this.set("vAxes", js.undefined)
    
    @scala.inline
    def setVAxis(value: ChartAxis): Self = this.set("vAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVAxis: Self = this.set("vAxis", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
