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
  * Builder for column charts. For more details, see the Gviz
  * documentation.
  */
@js.native
trait EmbeddedColumnChartBuilder extends js.Object {
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
  def reverseCategories(): EmbeddedColumnChartBuilder = js.native
  def setBackgroundColor(cssValue: String): EmbeddedColumnChartBuilder = js.native
  def setChartType(`type`: ChartType): EmbeddedChartBuilder = js.native
  def setColors(cssValues: js.Array[String]): EmbeddedColumnChartBuilder = js.native
  def setHiddenDimensionStrategy(strategy: ChartHiddenDimensionStrategy): EmbeddedChartBuilder = js.native
  def setLegendPosition(position: Position): EmbeddedColumnChartBuilder = js.native
  def setLegendTextStyle(textStyle: typingsSlinky.googleAppsScript.GoogleAppsScript.Charts.TextStyle): EmbeddedColumnChartBuilder = js.native
  def setMergeStrategy(mergeStrategy: ChartMergeStrategy): EmbeddedChartBuilder = js.native
  def setNumHeaders(headers: Integer): EmbeddedChartBuilder = js.native
  def setOption(option: String, value: js.Any): EmbeddedChartBuilder = js.native
  def setPosition(anchorRowPos: Integer, anchorColPos: Integer, offsetX: Integer, offsetY: Integer): EmbeddedChartBuilder = js.native
  def setRange(start: Double, end: Double): EmbeddedColumnChartBuilder = js.native
  def setStacked(): EmbeddedColumnChartBuilder = js.native
  def setTitle(chartTitle: String): EmbeddedColumnChartBuilder = js.native
  def setTitleTextStyle(textStyle: typingsSlinky.googleAppsScript.GoogleAppsScript.Charts.TextStyle): EmbeddedColumnChartBuilder = js.native
  def setTransposeRowsAndColumns(transpose: Boolean): EmbeddedChartBuilder = js.native
  def setXAxisTextStyle(textStyle: typingsSlinky.googleAppsScript.GoogleAppsScript.Charts.TextStyle): EmbeddedColumnChartBuilder = js.native
  def setXAxisTitle(title: String): EmbeddedColumnChartBuilder = js.native
  def setXAxisTitleTextStyle(textStyle: typingsSlinky.googleAppsScript.GoogleAppsScript.Charts.TextStyle): EmbeddedColumnChartBuilder = js.native
  def setYAxisTextStyle(textStyle: typingsSlinky.googleAppsScript.GoogleAppsScript.Charts.TextStyle): EmbeddedColumnChartBuilder = js.native
  def setYAxisTitle(title: String): EmbeddedColumnChartBuilder = js.native
  def setYAxisTitleTextStyle(textStyle: typingsSlinky.googleAppsScript.GoogleAppsScript.Charts.TextStyle): EmbeddedColumnChartBuilder = js.native
  def useLogScale(): EmbeddedColumnChartBuilder = js.native
}

object EmbeddedColumnChartBuilder {
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
    reverseCategories: () => EmbeddedColumnChartBuilder,
    setBackgroundColor: String => EmbeddedColumnChartBuilder,
    setChartType: ChartType => EmbeddedChartBuilder,
    setColors: js.Array[String] => EmbeddedColumnChartBuilder,
    setHiddenDimensionStrategy: ChartHiddenDimensionStrategy => EmbeddedChartBuilder,
    setLegendPosition: Position => EmbeddedColumnChartBuilder,
    setLegendTextStyle: typingsSlinky.googleAppsScript.GoogleAppsScript.Charts.TextStyle => EmbeddedColumnChartBuilder,
    setMergeStrategy: ChartMergeStrategy => EmbeddedChartBuilder,
    setNumHeaders: Integer => EmbeddedChartBuilder,
    setOption: (String, js.Any) => EmbeddedChartBuilder,
    setPosition: (Integer, Integer, Integer, Integer) => EmbeddedChartBuilder,
    setRange: (Double, Double) => EmbeddedColumnChartBuilder,
    setStacked: () => EmbeddedColumnChartBuilder,
    setTitle: String => EmbeddedColumnChartBuilder,
    setTitleTextStyle: typingsSlinky.googleAppsScript.GoogleAppsScript.Charts.TextStyle => EmbeddedColumnChartBuilder,
    setTransposeRowsAndColumns: Boolean => EmbeddedChartBuilder,
    setXAxisTextStyle: typingsSlinky.googleAppsScript.GoogleAppsScript.Charts.TextStyle => EmbeddedColumnChartBuilder,
    setXAxisTitle: String => EmbeddedColumnChartBuilder,
    setXAxisTitleTextStyle: typingsSlinky.googleAppsScript.GoogleAppsScript.Charts.TextStyle => EmbeddedColumnChartBuilder,
    setYAxisTextStyle: typingsSlinky.googleAppsScript.GoogleAppsScript.Charts.TextStyle => EmbeddedColumnChartBuilder,
    setYAxisTitle: String => EmbeddedColumnChartBuilder,
    setYAxisTitleTextStyle: typingsSlinky.googleAppsScript.GoogleAppsScript.Charts.TextStyle => EmbeddedColumnChartBuilder,
    useLogScale: () => EmbeddedColumnChartBuilder
  ): EmbeddedColumnChartBuilder = {
    val __obj = js.Dynamic.literal(addRange = js.Any.fromFunction1(addRange), asAreaChart = js.Any.fromFunction0(asAreaChart), asBarChart = js.Any.fromFunction0(asBarChart), asColumnChart = js.Any.fromFunction0(asColumnChart), asComboChart = js.Any.fromFunction0(asComboChart), asHistogramChart = js.Any.fromFunction0(asHistogramChart), asLineChart = js.Any.fromFunction0(asLineChart), asPieChart = js.Any.fromFunction0(asPieChart), asScatterChart = js.Any.fromFunction0(asScatterChart), asTableChart = js.Any.fromFunction0(asTableChart), build = js.Any.fromFunction0(build), clearRanges = js.Any.fromFunction0(clearRanges), getChartType = js.Any.fromFunction0(getChartType), getContainer = js.Any.fromFunction0(getContainer), getRanges = js.Any.fromFunction0(getRanges), removeRange = js.Any.fromFunction1(removeRange), reverseCategories = js.Any.fromFunction0(reverseCategories), setBackgroundColor = js.Any.fromFunction1(setBackgroundColor), setChartType = js.Any.fromFunction1(setChartType), setColors = js.Any.fromFunction1(setColors), setHiddenDimensionStrategy = js.Any.fromFunction1(setHiddenDimensionStrategy), setLegendPosition = js.Any.fromFunction1(setLegendPosition), setLegendTextStyle = js.Any.fromFunction1(setLegendTextStyle), setMergeStrategy = js.Any.fromFunction1(setMergeStrategy), setNumHeaders = js.Any.fromFunction1(setNumHeaders), setOption = js.Any.fromFunction2(setOption), setPosition = js.Any.fromFunction4(setPosition), setRange = js.Any.fromFunction2(setRange), setStacked = js.Any.fromFunction0(setStacked), setTitle = js.Any.fromFunction1(setTitle), setTitleTextStyle = js.Any.fromFunction1(setTitleTextStyle), setTransposeRowsAndColumns = js.Any.fromFunction1(setTransposeRowsAndColumns), setXAxisTextStyle = js.Any.fromFunction1(setXAxisTextStyle), setXAxisTitle = js.Any.fromFunction1(setXAxisTitle), setXAxisTitleTextStyle = js.Any.fromFunction1(setXAxisTitleTextStyle), setYAxisTextStyle = js.Any.fromFunction1(setYAxisTextStyle), setYAxisTitle = js.Any.fromFunction1(setYAxisTitle), setYAxisTitleTextStyle = js.Any.fromFunction1(setYAxisTitleTextStyle), useLogScale = js.Any.fromFunction0(useLogScale))
    __obj.asInstanceOf[EmbeddedColumnChartBuilder]
  }
  @scala.inline
  implicit class EmbeddedColumnChartBuilderOps[Self <: EmbeddedColumnChartBuilder] (val x: Self) extends AnyVal {
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
    def withReverseCategories(value: () => EmbeddedColumnChartBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverseCategories")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetBackgroundColor(value: String => EmbeddedColumnChartBuilder): Self = {
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
    def withSetColors(value: js.Array[String] => EmbeddedColumnChartBuilder): Self = {
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
    def withSetLegendPosition(value: Position => EmbeddedColumnChartBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLegendPosition")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetLegendTextStyle(
      value: typingsSlinky.googleAppsScript.GoogleAppsScript.Charts.TextStyle => EmbeddedColumnChartBuilder
    ): Self = {
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
    def withSetRange(value: (Double, Double) => EmbeddedColumnChartBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetStacked(value: () => EmbeddedColumnChartBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStacked")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetTitle(value: String => EmbeddedColumnChartBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTitle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetTitleTextStyle(
      value: typingsSlinky.googleAppsScript.GoogleAppsScript.Charts.TextStyle => EmbeddedColumnChartBuilder
    ): Self = {
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
    @scala.inline
    def withSetXAxisTextStyle(
      value: typingsSlinky.googleAppsScript.GoogleAppsScript.Charts.TextStyle => EmbeddedColumnChartBuilder
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setXAxisTextStyle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetXAxisTitle(value: String => EmbeddedColumnChartBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setXAxisTitle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetXAxisTitleTextStyle(
      value: typingsSlinky.googleAppsScript.GoogleAppsScript.Charts.TextStyle => EmbeddedColumnChartBuilder
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setXAxisTitleTextStyle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetYAxisTextStyle(
      value: typingsSlinky.googleAppsScript.GoogleAppsScript.Charts.TextStyle => EmbeddedColumnChartBuilder
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setYAxisTextStyle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetYAxisTitle(value: String => EmbeddedColumnChartBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setYAxisTitle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetYAxisTitleTextStyle(
      value: typingsSlinky.googleAppsScript.GoogleAppsScript.Charts.TextStyle => EmbeddedColumnChartBuilder
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setYAxisTitleTextStyle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUseLogScale(value: () => EmbeddedColumnChartBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useLogScale")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

