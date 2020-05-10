package typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet

import typingsSlinky.googleAppsScript.GoogleAppsScript.Charts.ChartHiddenDimensionStrategy
import typingsSlinky.googleAppsScript.GoogleAppsScript.Charts.ChartMergeStrategy
import typingsSlinky.googleAppsScript.GoogleAppsScript.Charts.ChartType
import typingsSlinky.googleAppsScript.GoogleAppsScript.Charts.Position
import typingsSlinky.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Builder for pie charts. For more details, see the Gviz
  * documentation.
  */
@js.native
trait EmbeddedPieChartBuilder extends js.Object {
  def addRange(range: Range): EmbeddedChartBuilder = js.native
  def asAreaChart(): EmbeddedAreaChartBuilder = js.native
  def asBarChart(): EmbeddedBarChartBuilder = js.native
  def asColumnChart(): EmbeddedColumnChartBuilder = js.native
  def asComboChart(): EmbeddedComboChartBuilder = js.native
  def asHistogramChart(): EmbeddedHistogramChartBuilder = js.native
  def asLineChart(): EmbeddedLineChartBuilder = js.native
  def asPieChart(): EmbeddedPieChartBuilder = js.native
  def asScatterChart(): EmbeddedScatterChartBuilder = js.native
  def asTableChart(): EmbeddedTableChartBuilder = js.native
  def build(): EmbeddedChart = js.native
  def clearRanges(): EmbeddedChartBuilder = js.native
  def getChartType(): ChartType = js.native
  def getContainer(): ContainerInfo = js.native
  def getRanges(): js.Array[Range] = js.native
  def removeRange(range: Range): EmbeddedChartBuilder = js.native
  def reverseCategories(): EmbeddedPieChartBuilder = js.native
  def set3D(): EmbeddedPieChartBuilder = js.native
  def setBackgroundColor(cssValue: String): EmbeddedPieChartBuilder = js.native
  def setChartType(`type`: ChartType): EmbeddedChartBuilder = js.native
  def setColors(cssValues: js.Array[String]): EmbeddedPieChartBuilder = js.native
  def setHiddenDimensionStrategy(strategy: ChartHiddenDimensionStrategy): EmbeddedChartBuilder = js.native
  def setLegendPosition(position: Position): EmbeddedPieChartBuilder = js.native
  def setLegendTextStyle(textStyle: typingsSlinky.googleAppsScript.GoogleAppsScript.Charts.TextStyle): EmbeddedPieChartBuilder = js.native
  def setMergeStrategy(mergeStrategy: ChartMergeStrategy): EmbeddedChartBuilder = js.native
  def setNumHeaders(headers: Integer): EmbeddedChartBuilder = js.native
  def setOption(option: String, value: js.Any): EmbeddedChartBuilder = js.native
  def setPosition(anchorRowPos: Integer, anchorColPos: Integer, offsetX: Integer, offsetY: Integer): EmbeddedChartBuilder = js.native
  def setTitle(chartTitle: String): EmbeddedPieChartBuilder = js.native
  def setTitleTextStyle(textStyle: typingsSlinky.googleAppsScript.GoogleAppsScript.Charts.TextStyle): EmbeddedPieChartBuilder = js.native
  def setTransposeRowsAndColumns(transpose: Boolean): EmbeddedChartBuilder = js.native
}

object EmbeddedPieChartBuilder {
  @scala.inline
  def apply(
    addRange: Range => EmbeddedChartBuilder,
    asAreaChart: () => EmbeddedAreaChartBuilder,
    asBarChart: () => EmbeddedBarChartBuilder,
    asColumnChart: () => EmbeddedColumnChartBuilder,
    asComboChart: () => EmbeddedComboChartBuilder,
    asHistogramChart: () => EmbeddedHistogramChartBuilder,
    asLineChart: () => EmbeddedLineChartBuilder,
    asPieChart: () => EmbeddedPieChartBuilder,
    asScatterChart: () => EmbeddedScatterChartBuilder,
    asTableChart: () => EmbeddedTableChartBuilder,
    build: () => EmbeddedChart,
    clearRanges: () => EmbeddedChartBuilder,
    getChartType: () => ChartType,
    getContainer: () => ContainerInfo,
    getRanges: () => js.Array[Range],
    removeRange: Range => EmbeddedChartBuilder,
    reverseCategories: () => EmbeddedPieChartBuilder,
    set3D: () => EmbeddedPieChartBuilder,
    setBackgroundColor: String => EmbeddedPieChartBuilder,
    setChartType: ChartType => EmbeddedChartBuilder,
    setColors: js.Array[String] => EmbeddedPieChartBuilder,
    setHiddenDimensionStrategy: ChartHiddenDimensionStrategy => EmbeddedChartBuilder,
    setLegendPosition: Position => EmbeddedPieChartBuilder,
    setLegendTextStyle: typingsSlinky.googleAppsScript.GoogleAppsScript.Charts.TextStyle => EmbeddedPieChartBuilder,
    setMergeStrategy: ChartMergeStrategy => EmbeddedChartBuilder,
    setNumHeaders: Integer => EmbeddedChartBuilder,
    setOption: (String, js.Any) => EmbeddedChartBuilder,
    setPosition: (Integer, Integer, Integer, Integer) => EmbeddedChartBuilder,
    setTitle: String => EmbeddedPieChartBuilder,
    setTitleTextStyle: typingsSlinky.googleAppsScript.GoogleAppsScript.Charts.TextStyle => EmbeddedPieChartBuilder,
    setTransposeRowsAndColumns: Boolean => EmbeddedChartBuilder
  ): EmbeddedPieChartBuilder = {
    val __obj = js.Dynamic.literal(addRange = js.Any.fromFunction1(addRange), asAreaChart = js.Any.fromFunction0(asAreaChart), asBarChart = js.Any.fromFunction0(asBarChart), asColumnChart = js.Any.fromFunction0(asColumnChart), asComboChart = js.Any.fromFunction0(asComboChart), asHistogramChart = js.Any.fromFunction0(asHistogramChart), asLineChart = js.Any.fromFunction0(asLineChart), asPieChart = js.Any.fromFunction0(asPieChart), asScatterChart = js.Any.fromFunction0(asScatterChart), asTableChart = js.Any.fromFunction0(asTableChart), build = js.Any.fromFunction0(build), clearRanges = js.Any.fromFunction0(clearRanges), getChartType = js.Any.fromFunction0(getChartType), getContainer = js.Any.fromFunction0(getContainer), getRanges = js.Any.fromFunction0(getRanges), removeRange = js.Any.fromFunction1(removeRange), reverseCategories = js.Any.fromFunction0(reverseCategories), set3D = js.Any.fromFunction0(set3D), setBackgroundColor = js.Any.fromFunction1(setBackgroundColor), setChartType = js.Any.fromFunction1(setChartType), setColors = js.Any.fromFunction1(setColors), setHiddenDimensionStrategy = js.Any.fromFunction1(setHiddenDimensionStrategy), setLegendPosition = js.Any.fromFunction1(setLegendPosition), setLegendTextStyle = js.Any.fromFunction1(setLegendTextStyle), setMergeStrategy = js.Any.fromFunction1(setMergeStrategy), setNumHeaders = js.Any.fromFunction1(setNumHeaders), setOption = js.Any.fromFunction2(setOption), setPosition = js.Any.fromFunction4(setPosition), setTitle = js.Any.fromFunction1(setTitle), setTitleTextStyle = js.Any.fromFunction1(setTitleTextStyle), setTransposeRowsAndColumns = js.Any.fromFunction1(setTransposeRowsAndColumns))
    __obj.asInstanceOf[EmbeddedPieChartBuilder]
  }
  @scala.inline
  implicit class EmbeddedPieChartBuilderOps[Self <: EmbeddedPieChartBuilder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddRange(value: Range => EmbeddedChartBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addRange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAsAreaChart(value: () => EmbeddedAreaChartBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asAreaChart")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAsBarChart(value: () => EmbeddedBarChartBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asBarChart")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAsColumnChart(value: () => EmbeddedColumnChartBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asColumnChart")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAsComboChart(value: () => EmbeddedComboChartBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asComboChart")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAsHistogramChart(value: () => EmbeddedHistogramChartBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asHistogramChart")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAsLineChart(value: () => EmbeddedLineChartBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asLineChart")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAsPieChart(value: () => EmbeddedPieChartBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asPieChart")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAsScatterChart(value: () => EmbeddedScatterChartBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asScatterChart")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAsTableChart(value: () => EmbeddedTableChartBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asTableChart")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withBuild(value: () => EmbeddedChart): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("build")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withClearRanges(value: () => EmbeddedChartBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearRanges")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetChartType(value: () => ChartType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getChartType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetContainer(value: () => ContainerInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContainer")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetRanges(value: () => js.Array[Range]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRanges")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemoveRange(value: Range => EmbeddedChartBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeRange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReverseCategories(value: () => EmbeddedPieChartBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverseCategories")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSet3D(value: () => EmbeddedPieChartBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set3D")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetBackgroundColor(value: String => EmbeddedPieChartBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBackgroundColor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetChartType(value: ChartType => EmbeddedChartBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setChartType")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetColors(value: js.Array[String] => EmbeddedPieChartBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setColors")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetHiddenDimensionStrategy(value: ChartHiddenDimensionStrategy => EmbeddedChartBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHiddenDimensionStrategy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetLegendPosition(value: Position => EmbeddedPieChartBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLegendPosition")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetLegendTextStyle(value: typingsSlinky.googleAppsScript.GoogleAppsScript.Charts.TextStyle => EmbeddedPieChartBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLegendTextStyle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetMergeStrategy(value: ChartMergeStrategy => EmbeddedChartBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMergeStrategy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetNumHeaders(value: Integer => EmbeddedChartBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setNumHeaders")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetOption(value: (String, js.Any) => EmbeddedChartBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOption")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetPosition(value: (Integer, Integer, Integer, Integer) => EmbeddedChartBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPosition")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withSetTitle(value: String => EmbeddedPieChartBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTitle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetTitleTextStyle(value: typingsSlinky.googleAppsScript.GoogleAppsScript.Charts.TextStyle => EmbeddedPieChartBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTitleTextStyle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetTransposeRowsAndColumns(value: Boolean => EmbeddedChartBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTransposeRowsAndColumns")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

