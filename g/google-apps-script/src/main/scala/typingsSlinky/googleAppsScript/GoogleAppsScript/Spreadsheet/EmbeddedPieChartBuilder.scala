package typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet

import typingsSlinky.googleAppsScript.GoogleAppsScript.Charts.ChartHiddenDimensionStrategy
import typingsSlinky.googleAppsScript.GoogleAppsScript.Charts.ChartMergeStrategy
import typingsSlinky.googleAppsScript.GoogleAppsScript.Charts.ChartType
import typingsSlinky.googleAppsScript.GoogleAppsScript.Charts.Position
import typingsSlinky.googleAppsScript.GoogleAppsScript.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Builder for pie charts. For more details, see the Gviz
  * documentation.
  */
@js.native
trait EmbeddedPieChartBuilder extends StObject {
  
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
  implicit class EmbeddedPieChartBuilderMutableBuilder[Self <: EmbeddedPieChartBuilder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddRange(value: Range => EmbeddedChartBuilder): Self = StObject.set(x, "addRange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAsAreaChart(value: () => EmbeddedAreaChartBuilder): Self = StObject.set(x, "asAreaChart", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAsBarChart(value: () => EmbeddedBarChartBuilder): Self = StObject.set(x, "asBarChart", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAsColumnChart(value: () => EmbeddedColumnChartBuilder): Self = StObject.set(x, "asColumnChart", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAsComboChart(value: () => EmbeddedComboChartBuilder): Self = StObject.set(x, "asComboChart", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAsHistogramChart(value: () => EmbeddedHistogramChartBuilder): Self = StObject.set(x, "asHistogramChart", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAsLineChart(value: () => EmbeddedLineChartBuilder): Self = StObject.set(x, "asLineChart", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAsPieChart(value: () => EmbeddedPieChartBuilder): Self = StObject.set(x, "asPieChart", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAsScatterChart(value: () => EmbeddedScatterChartBuilder): Self = StObject.set(x, "asScatterChart", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAsTableChart(value: () => EmbeddedTableChartBuilder): Self = StObject.set(x, "asTableChart", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBuild(value: () => EmbeddedChart): Self = StObject.set(x, "build", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClearRanges(value: () => EmbeddedChartBuilder): Self = StObject.set(x, "clearRanges", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetChartType(value: () => ChartType): Self = StObject.set(x, "getChartType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetContainer(value: () => ContainerInfo): Self = StObject.set(x, "getContainer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRanges(value: () => js.Array[Range]): Self = StObject.set(x, "getRanges", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveRange(value: Range => EmbeddedChartBuilder): Self = StObject.set(x, "removeRange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReverseCategories(value: () => EmbeddedPieChartBuilder): Self = StObject.set(x, "reverseCategories", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSet3D(value: () => EmbeddedPieChartBuilder): Self = StObject.set(x, "set3D", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetBackgroundColor(value: String => EmbeddedPieChartBuilder): Self = StObject.set(x, "setBackgroundColor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetChartType(value: ChartType => EmbeddedChartBuilder): Self = StObject.set(x, "setChartType", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetColors(value: js.Array[String] => EmbeddedPieChartBuilder): Self = StObject.set(x, "setColors", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetHiddenDimensionStrategy(value: ChartHiddenDimensionStrategy => EmbeddedChartBuilder): Self = StObject.set(x, "setHiddenDimensionStrategy", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetLegendPosition(value: Position => EmbeddedPieChartBuilder): Self = StObject.set(x, "setLegendPosition", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetLegendTextStyle(value: typingsSlinky.googleAppsScript.GoogleAppsScript.Charts.TextStyle => EmbeddedPieChartBuilder): Self = StObject.set(x, "setLegendTextStyle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetMergeStrategy(value: ChartMergeStrategy => EmbeddedChartBuilder): Self = StObject.set(x, "setMergeStrategy", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetNumHeaders(value: Integer => EmbeddedChartBuilder): Self = StObject.set(x, "setNumHeaders", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetOption(value: (String, js.Any) => EmbeddedChartBuilder): Self = StObject.set(x, "setOption", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetPosition(value: (Integer, Integer, Integer, Integer) => EmbeddedChartBuilder): Self = StObject.set(x, "setPosition", js.Any.fromFunction4(value))
    
    @scala.inline
    def setSetTitle(value: String => EmbeddedPieChartBuilder): Self = StObject.set(x, "setTitle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTitleTextStyle(value: typingsSlinky.googleAppsScript.GoogleAppsScript.Charts.TextStyle => EmbeddedPieChartBuilder): Self = StObject.set(x, "setTitleTextStyle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTransposeRowsAndColumns(value: Boolean => EmbeddedChartBuilder): Self = StObject.set(x, "setTransposeRowsAndColumns", js.Any.fromFunction1(value))
  }
}
