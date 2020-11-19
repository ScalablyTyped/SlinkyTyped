package typingsSlinky.googleAppsScript.GoogleAppsScript.Charts

import typingsSlinky.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Builder for scatter charts. For more details, see the Google Charts documentation.
  *
  * Here is an example that shows how to build a scatter chart. The data is imported from a Google spreadsheet.
  *
  *     // Get sample data from a spreadsheet.
  *     var dataSourceUrl = 'https://docs.google.com/spreadsheet/tq?range=C1%3AD' +
  *         '&key=0Aq4s9w_HxMs7dHpfX05JdmVSb1FpT21sbXd4NVE3UEE&gid=4&headers=-1';
  *
  *     var chartBuilder = Charts.newScatterChart()
  *         .setTitle('Adjusted GDP & U.S. Population')
  *         .setXAxisTitle('U.S. Population (millions)')
  *         .setYAxisTitle('Adjusted GDP ($ billions)')
  *         .setDimensions(600, 500)
  *         .setLegendPosition(Charts.Position.NONE)
  *         .setDataSourceUrl(dataSourceUrl);
  *
  *     var chart = chartBuilder.build();
  */
@js.native
trait ScatterChartBuilder extends js.Object {
  
  def build(): Chart = js.native
  
  def setBackgroundColor(cssValue: String): ScatterChartBuilder = js.native
  
  def setColors(cssValues: js.Array[String]): ScatterChartBuilder = js.native
  
  def setDataSourceUrl(url: String): ScatterChartBuilder = js.native
  
  def setDataTable(tableBuilder: DataTableBuilder): ScatterChartBuilder = js.native
  def setDataTable(table: DataTableSource): ScatterChartBuilder = js.native
  
  def setDataViewDefinition(dataViewDefinition: DataViewDefinition): ScatterChartBuilder = js.native
  
  def setDimensions(width: Integer, height: Integer): ScatterChartBuilder = js.native
  
  def setLegendPosition(position: Position): ScatterChartBuilder = js.native
  
  def setLegendTextStyle(textStyle: TextStyle): ScatterChartBuilder = js.native
  
  def setOption(option: String, value: js.Any): ScatterChartBuilder = js.native
  
  def setPointStyle(style: PointStyle): ScatterChartBuilder = js.native
  
  def setTitle(chartTitle: String): ScatterChartBuilder = js.native
  
  def setTitleTextStyle(textStyle: TextStyle): ScatterChartBuilder = js.native
  
  def setXAxisLogScale(): ScatterChartBuilder = js.native
  
  def setXAxisRange(start: Double, end: Double): ScatterChartBuilder = js.native
  
  def setXAxisTextStyle(textStyle: TextStyle): ScatterChartBuilder = js.native
  
  def setXAxisTitle(title: String): ScatterChartBuilder = js.native
  
  def setXAxisTitleTextStyle(textStyle: TextStyle): ScatterChartBuilder = js.native
  
  def setYAxisLogScale(): ScatterChartBuilder = js.native
  
  def setYAxisRange(start: Double, end: Double): ScatterChartBuilder = js.native
  
  def setYAxisTextStyle(textStyle: TextStyle): ScatterChartBuilder = js.native
  
  def setYAxisTitle(title: String): ScatterChartBuilder = js.native
  
  def setYAxisTitleTextStyle(textStyle: TextStyle): ScatterChartBuilder = js.native
}
