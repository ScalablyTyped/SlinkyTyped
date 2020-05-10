package typingsSlinky.googleAppsScript.GoogleAppsScript.Charts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Entry point for creating Charts in scripts.
  *
  * This example creates a basic data table, populates an area chart with the data, and adds it
  * into a web page as an image:
  *
  *     function doGet() {
  *       var data = Charts.newDataTable()
  *           .addColumn(Charts.ColumnType.STRING, "Month")
  *           .addColumn(Charts.ColumnType.NUMBER, "In Store")
  *           .addColumn(Charts.ColumnType.NUMBER, "Online")
  *           .addRow(["January", 10, 1])
  *           .addRow(["February", 12, 1])
  *           .addRow(["March", 20, 2])
  *           .addRow(["April", 25, 3])
  *           .addRow(["May", 30, 4])
  *           .build();
  *
  *       var chart = Charts.newAreaChart()
  *           .setDataTable(data)
  *           .setStacked()
  *           .setRange(0, 40)
  *           .setTitle("Sales per Month")
  *           .build();
  *
  *        var htmlOutput = HtmlService.createHtmlOutput().setTitle('My Chart');
  *        var imageData = Utilities.base64Encode(chart.getAs('image/png').getBytes());
  *        var imageUrl = "data:image/png;base64," + encodeURI(imageData);
  *        htmlOutput.append("Render chart server side: <br/>");
  *        htmlOutput.append("<img border=\"1\" src=\"" + imageUrl + "\">");
  *        return htmlOutput;
  *     }
  */
@js.native
trait Charts extends js.Object {
  var ChartHiddenDimensionStrategy: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChartHiddenDimensionStrategy */ js.Any = js.native
  var ChartMergeStrategy: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChartMergeStrategy */ js.Any = js.native
  var ChartType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChartType */ js.Any = js.native
  var ColumnType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ColumnType */ js.Any = js.native
  var CurveStyle: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CurveStyle */ js.Any = js.native
  var PointStyle: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PointStyle */ js.Any = js.native
  var Position: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Position */ js.Any = js.native
  def newAreaChart(): AreaChartBuilder = js.native
  def newBarChart(): BarChartBuilder = js.native
  def newColumnChart(): ColumnChartBuilder = js.native
  def newDataTable(): DataTableBuilder = js.native
  def newDataViewDefinition(): DataViewDefinitionBuilder = js.native
  def newLineChart(): LineChartBuilder = js.native
  def newPieChart(): PieChartBuilder = js.native
  def newScatterChart(): ScatterChartBuilder = js.native
  def newTableChart(): TableChartBuilder = js.native
  def newTextStyle(): TextStyleBuilder = js.native
}

object Charts {
  @scala.inline
  def apply(
    ChartHiddenDimensionStrategy: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChartHiddenDimensionStrategy */ js.Any,
    ChartMergeStrategy: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChartMergeStrategy */ js.Any,
    ChartType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChartType */ js.Any,
    ColumnType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ColumnType */ js.Any,
    CurveStyle: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CurveStyle */ js.Any,
    PointStyle: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PointStyle */ js.Any,
    Position: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Position */ js.Any,
    newAreaChart: () => AreaChartBuilder,
    newBarChart: () => BarChartBuilder,
    newColumnChart: () => ColumnChartBuilder,
    newDataTable: () => DataTableBuilder,
    newDataViewDefinition: () => DataViewDefinitionBuilder,
    newLineChart: () => LineChartBuilder,
    newPieChart: () => PieChartBuilder,
    newScatterChart: () => ScatterChartBuilder,
    newTableChart: () => TableChartBuilder,
    newTextStyle: () => TextStyleBuilder
  ): Charts = {
    val __obj = js.Dynamic.literal(ChartHiddenDimensionStrategy = ChartHiddenDimensionStrategy.asInstanceOf[js.Any], ChartMergeStrategy = ChartMergeStrategy.asInstanceOf[js.Any], ChartType = ChartType.asInstanceOf[js.Any], ColumnType = ColumnType.asInstanceOf[js.Any], CurveStyle = CurveStyle.asInstanceOf[js.Any], PointStyle = PointStyle.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], newAreaChart = js.Any.fromFunction0(newAreaChart), newBarChart = js.Any.fromFunction0(newBarChart), newColumnChart = js.Any.fromFunction0(newColumnChart), newDataTable = js.Any.fromFunction0(newDataTable), newDataViewDefinition = js.Any.fromFunction0(newDataViewDefinition), newLineChart = js.Any.fromFunction0(newLineChart), newPieChart = js.Any.fromFunction0(newPieChart), newScatterChart = js.Any.fromFunction0(newScatterChart), newTableChart = js.Any.fromFunction0(newTableChart), newTextStyle = js.Any.fromFunction0(newTextStyle))
    __obj.asInstanceOf[Charts]
  }
  @scala.inline
  implicit class ChartsOps[Self <: typingsSlinky.googleAppsScript.GoogleAppsScript.Charts.Charts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChartHiddenDimensionStrategy(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChartHiddenDimensionStrategy */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChartHiddenDimensionStrategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChartMergeStrategy(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChartMergeStrategy */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChartMergeStrategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChartType(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChartType */ js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChartType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumnType(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ColumnType */ js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ColumnType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurveStyle(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CurveStyle */ js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurveStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPointStyle(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PointStyle */ js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PointStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Position */ js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewAreaChart(value: () => AreaChartBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newAreaChart")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewBarChart(value: () => BarChartBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newBarChart")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewColumnChart(value: () => ColumnChartBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newColumnChart")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewDataTable(value: () => DataTableBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newDataTable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewDataViewDefinition(value: () => DataViewDefinitionBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newDataViewDefinition")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewLineChart(value: () => LineChartBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newLineChart")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewPieChart(value: () => PieChartBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newPieChart")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewScatterChart(value: () => ScatterChartBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newScatterChart")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewTableChart(value: () => TableChartBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newTableChart")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewTextStyle(value: () => TextStyleBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newTextStyle")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

