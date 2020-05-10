package typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet

import typingsSlinky.googleAppsScript.GoogleAppsScript.Charts.ChartHiddenDimensionStrategy
import typingsSlinky.googleAppsScript.GoogleAppsScript.Charts.ChartMergeStrategy
import typingsSlinky.googleAppsScript.GoogleAppsScript.Charts.ChartType
import typingsSlinky.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Builder used to edit an EmbeddedChart. Changes made to the chart are not saved until
  * Sheet.updateChart(chart) is called on the rebuilt chart.
  *
  *     var sheet = SpreadsheetApp.getActiveSheet();
  *     var range = sheet.getRange("A1:B8");
  *     var chart = sheet.getCharts()[0];
  *     chart = chart.modify()
  *         .addRange(range)
  *         .setOption('title', 'Updated!')
  *         .setOption('animation.duration', 500)
  *         .setPosition(2,2,0,0)
  *         .build();
  *     sheet.updateChart(chart);
  */
@js.native
trait EmbeddedChartBuilder extends js.Object {
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
  def setChartType(`type`: ChartType): EmbeddedChartBuilder = js.native
  def setHiddenDimensionStrategy(strategy: ChartHiddenDimensionStrategy): EmbeddedChartBuilder = js.native
  def setMergeStrategy(mergeStrategy: ChartMergeStrategy): EmbeddedChartBuilder = js.native
  def setNumHeaders(headers: Integer): EmbeddedChartBuilder = js.native
  def setOption(option: String, value: js.Any): EmbeddedChartBuilder = js.native
  def setPosition(anchorRowPos: Integer, anchorColPos: Integer, offsetX: Integer, offsetY: Integer): EmbeddedChartBuilder = js.native
  def setTransposeRowsAndColumns(transpose: Boolean): EmbeddedChartBuilder = js.native
}

object EmbeddedChartBuilder {
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
    setChartType: ChartType => EmbeddedChartBuilder,
    setHiddenDimensionStrategy: ChartHiddenDimensionStrategy => EmbeddedChartBuilder,
    setMergeStrategy: ChartMergeStrategy => EmbeddedChartBuilder,
    setNumHeaders: Integer => EmbeddedChartBuilder,
    setOption: (String, js.Any) => EmbeddedChartBuilder,
    setPosition: (Integer, Integer, Integer, Integer) => EmbeddedChartBuilder,
    setTransposeRowsAndColumns: Boolean => EmbeddedChartBuilder
  ): EmbeddedChartBuilder = {
    val __obj = js.Dynamic.literal(addRange = js.Any.fromFunction1(addRange), asAreaChart = js.Any.fromFunction0(asAreaChart), asBarChart = js.Any.fromFunction0(asBarChart), asColumnChart = js.Any.fromFunction0(asColumnChart), asComboChart = js.Any.fromFunction0(asComboChart), asHistogramChart = js.Any.fromFunction0(asHistogramChart), asLineChart = js.Any.fromFunction0(asLineChart), asPieChart = js.Any.fromFunction0(asPieChart), asScatterChart = js.Any.fromFunction0(asScatterChart), asTableChart = js.Any.fromFunction0(asTableChart), build = js.Any.fromFunction0(build), clearRanges = js.Any.fromFunction0(clearRanges), getChartType = js.Any.fromFunction0(getChartType), getContainer = js.Any.fromFunction0(getContainer), getRanges = js.Any.fromFunction0(getRanges), removeRange = js.Any.fromFunction1(removeRange), setChartType = js.Any.fromFunction1(setChartType), setHiddenDimensionStrategy = js.Any.fromFunction1(setHiddenDimensionStrategy), setMergeStrategy = js.Any.fromFunction1(setMergeStrategy), setNumHeaders = js.Any.fromFunction1(setNumHeaders), setOption = js.Any.fromFunction2(setOption), setPosition = js.Any.fromFunction4(setPosition), setTransposeRowsAndColumns = js.Any.fromFunction1(setTransposeRowsAndColumns))
    __obj.asInstanceOf[EmbeddedChartBuilder]
  }
  @scala.inline
  implicit class EmbeddedChartBuilderOps[Self <: EmbeddedChartBuilder] (val x: Self) extends AnyVal {
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
    def withSetChartType(value: ChartType => EmbeddedChartBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setChartType")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetHiddenDimensionStrategy(value: ChartHiddenDimensionStrategy => EmbeddedChartBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHiddenDimensionStrategy")(js.Any.fromFunction1(value))
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
    def withSetTransposeRowsAndColumns(value: Boolean => EmbeddedChartBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTransposeRowsAndColumns")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

