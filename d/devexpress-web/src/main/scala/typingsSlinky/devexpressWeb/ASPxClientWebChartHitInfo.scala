package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains information about a specific test point within a chart control, on the client side.
  */
@js.native
trait ASPxClientWebChartHitInfo extends js.Object {
  /**
    * Gets the client-side annotation instance from under the test point.
    */
  var annotation: ASPxClientAnnotation = js.native
  /**
    * Gets the client-side axis instance from under the test point.
    */
  var axis: ASPxClientAxisBase = js.native
  /**
    * Gets the client-side axis label item instance from under the test point.
    */
  var axisLabelItem: ASPxClientAxisLabelItem = js.native
  /**
    * Gets the client-side axis title instance from under the test point.
    */
  var axisTitle: ASPxClientAxisTitle = js.native
  /**
    * Gets the client-side chart instance from under the test point.
    */
  var chart: ASPxClientWebChart = js.native
  /**
    * Gets the client-side chart title instance from under the test point.
    */
  var chartTitle: ASPxClientChartTitle = js.native
  /**
    * Gets the client-side constant line instance from under the test point.
    */
  var constantLine: ASPxClientConstantLine = js.native
  /**
    * Gets a custom legend item which is located under the test point.
    */
  var customLegendItem: ASPxClientCustomLegendItem = js.native
  /**
    * Gets the client-side diagram instance from under the test point.
    */
  var diagram: ASPxClientXYDiagramBase = js.native
  /** @deprecated This property is now obsolete. Use the indicator property instead. */
  /**
    * Gets the client-side Fibonacci indicator instance from under the test point.
    */
  var fibonacciIndicator: ASPxClientFibonacciIndicator = js.native
  /**
    * Returns a hyperlink which is located under the test point.
    */
  var hyperlink: String = js.native
  /**
    * Gets a value indicating whether the test point is within an annotation.
    */
  var inAnnotation: Boolean = js.native
  /**
    * Gets a value indicating whether the test point is within the axis.
    */
  var inAxis: Boolean = js.native
  /**
    * Gets a value indicating whether the test point is within the axis label item.
    */
  var inAxisLabelItem: Boolean = js.native
  /**
    * Gets a value indicating whether the test point is within the axis title.
    */
  var inAxisTitle: Boolean = js.native
  /**
    * Gets a value indicating whether the test point is within the chart.
    */
  var inChart: Boolean = js.native
  /**
    * Gets a value indicating whether the test point is within the chart title.
    */
  var inChartTitle: Boolean = js.native
  /**
    * Gets a value indicating whether the test point is within the constant line.
    */
  var inConstantLine: Boolean = js.native
  /**
    * Gets the value indicating whether or not the test point is within a custom legend item.
    */
  var inCustomLegendItem: Boolean = js.native
  /**
    * Gets a value indicating whether the test point is within the diagram.
    */
  var inDiagram: Boolean = js.native
  /** @deprecated This property is now obsolete. Use the inIndicator property instead. */
  /**
    * Gets a value indicating whether the test point is within the Fibonacci Indicator.
    */
  var inFibonacciIndicator: Boolean = js.native
  /**
    * Gets a value indicating whether the test point is within a hyperlink.
    */
  var inHyperlink: Boolean = js.native
  /**
    * Gets a value specifying whether the test point is within an indicator.
    */
  var inIndicator: Boolean = js.native
  /**
    * Gets a value indicating whether the test point is within the legend.
    */
  var inLegend: Boolean = js.native
  /**
    * Gets a value indicating whether the test point is within the non-default pane.
    */
  var inNonDefaultPane: Boolean = js.native
  /**
    * Returns the value that indicates whether the test point is within the pane title.
    */
  var inPaneTitle: Boolean = js.native
  /** @deprecated This property is now obsolete. Use the inIndicator property instead. */
  /**
    * Gets a value indicating whether the test point is within the regression line.
    */
  var inRegressionLine: Boolean = js.native
  /**
    * Gets a value indicating whether the test point is within the series.
    */
  var inSeries: Boolean = js.native
  /**
    * Gets a value indicating whether the test point is within the series label.
    */
  var inSeriesLabel: Boolean = js.native
  /**
    * Gets a value indicating whether the test point is within the series point.
    */
  var inSeriesPoint: Boolean = js.native
  /**
    * Gets a value indicating whether the test point is within the series title.
    */
  var inSeriesTitle: Boolean = js.native
  /** @deprecated This property is now obsolete. Use the inIndicator property instead. */
  /**
    * Gets a value indicating whether the test point is within the trendline.
    */
  var inTrendLine: Boolean = js.native
  /**
    * Gets the client-side indicator instance from under the test point.
    */
  var indicator: ASPxClientIndicator = js.native
  /**
    * Gets the client-side legend instance from under the test point.
    */
  var legend: ASPxClientLegend = js.native
  /**
    * Gets the client-side non-default pane instance from under the test point.
    */
  var nonDefaultPane: ASPxClientXYDiagramPane = js.native
  /**
    * Gets the client-side pane title instance from under the test point.
    */
  var paneTitle: ASPxClientPaneTitle = js.native
  /** @deprecated This property is now obsolete. Use the indicator property instead. */
  /**
    * Gets the client-side regression line instance from under the test point.
    */
  var regressionLine: ASPxClientRegressionLine = js.native
  /**
    * Gets the client-side series instance from under the test point.
    */
  var series: ASPxClientSeries = js.native
  /**
    * Gets the client-side series label instance from under the test point.
    */
  var seriesLabel: ASPxClientSeriesLabel = js.native
  /**
    * Gets the client-side series point instance from under the test point.
    */
  var seriesPoint: ASPxClientSeriesPoint = js.native
  /**
    * Gets the client-side series title instance from under the test point.
    */
  var seriesTitle: ASPxClientSeriesTitle = js.native
  /** @deprecated This property is now obsolete. Use the indicator property instead. */
  /**
    * Gets the client-side trendline instance from under the test point.
    */
  var trendLine: ASPxClientTrendLine = js.native
}

object ASPxClientWebChartHitInfo {
  @scala.inline
  def apply(
    annotation: ASPxClientAnnotation,
    axis: ASPxClientAxisBase,
    axisLabelItem: ASPxClientAxisLabelItem,
    axisTitle: ASPxClientAxisTitle,
    chart: ASPxClientWebChart,
    chartTitle: ASPxClientChartTitle,
    constantLine: ASPxClientConstantLine,
    customLegendItem: ASPxClientCustomLegendItem,
    diagram: ASPxClientXYDiagramBase,
    fibonacciIndicator: ASPxClientFibonacciIndicator,
    hyperlink: String,
    inAnnotation: Boolean,
    inAxis: Boolean,
    inAxisLabelItem: Boolean,
    inAxisTitle: Boolean,
    inChart: Boolean,
    inChartTitle: Boolean,
    inConstantLine: Boolean,
    inCustomLegendItem: Boolean,
    inDiagram: Boolean,
    inFibonacciIndicator: Boolean,
    inHyperlink: Boolean,
    inIndicator: Boolean,
    inLegend: Boolean,
    inNonDefaultPane: Boolean,
    inPaneTitle: Boolean,
    inRegressionLine: Boolean,
    inSeries: Boolean,
    inSeriesLabel: Boolean,
    inSeriesPoint: Boolean,
    inSeriesTitle: Boolean,
    inTrendLine: Boolean,
    indicator: ASPxClientIndicator,
    legend: ASPxClientLegend,
    nonDefaultPane: ASPxClientXYDiagramPane,
    paneTitle: ASPxClientPaneTitle,
    regressionLine: ASPxClientRegressionLine,
    series: ASPxClientSeries,
    seriesLabel: ASPxClientSeriesLabel,
    seriesPoint: ASPxClientSeriesPoint,
    seriesTitle: ASPxClientSeriesTitle,
    trendLine: ASPxClientTrendLine
  ): ASPxClientWebChartHitInfo = {
    val __obj = js.Dynamic.literal(annotation = annotation.asInstanceOf[js.Any], axis = axis.asInstanceOf[js.Any], axisLabelItem = axisLabelItem.asInstanceOf[js.Any], axisTitle = axisTitle.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], chartTitle = chartTitle.asInstanceOf[js.Any], constantLine = constantLine.asInstanceOf[js.Any], customLegendItem = customLegendItem.asInstanceOf[js.Any], diagram = diagram.asInstanceOf[js.Any], fibonacciIndicator = fibonacciIndicator.asInstanceOf[js.Any], hyperlink = hyperlink.asInstanceOf[js.Any], inAnnotation = inAnnotation.asInstanceOf[js.Any], inAxis = inAxis.asInstanceOf[js.Any], inAxisLabelItem = inAxisLabelItem.asInstanceOf[js.Any], inAxisTitle = inAxisTitle.asInstanceOf[js.Any], inChart = inChart.asInstanceOf[js.Any], inChartTitle = inChartTitle.asInstanceOf[js.Any], inConstantLine = inConstantLine.asInstanceOf[js.Any], inCustomLegendItem = inCustomLegendItem.asInstanceOf[js.Any], inDiagram = inDiagram.asInstanceOf[js.Any], inFibonacciIndicator = inFibonacciIndicator.asInstanceOf[js.Any], inHyperlink = inHyperlink.asInstanceOf[js.Any], inIndicator = inIndicator.asInstanceOf[js.Any], inLegend = inLegend.asInstanceOf[js.Any], inNonDefaultPane = inNonDefaultPane.asInstanceOf[js.Any], inPaneTitle = inPaneTitle.asInstanceOf[js.Any], inRegressionLine = inRegressionLine.asInstanceOf[js.Any], inSeries = inSeries.asInstanceOf[js.Any], inSeriesLabel = inSeriesLabel.asInstanceOf[js.Any], inSeriesPoint = inSeriesPoint.asInstanceOf[js.Any], inSeriesTitle = inSeriesTitle.asInstanceOf[js.Any], inTrendLine = inTrendLine.asInstanceOf[js.Any], indicator = indicator.asInstanceOf[js.Any], legend = legend.asInstanceOf[js.Any], nonDefaultPane = nonDefaultPane.asInstanceOf[js.Any], paneTitle = paneTitle.asInstanceOf[js.Any], regressionLine = regressionLine.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any], seriesLabel = seriesLabel.asInstanceOf[js.Any], seriesPoint = seriesPoint.asInstanceOf[js.Any], seriesTitle = seriesTitle.asInstanceOf[js.Any], trendLine = trendLine.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientWebChartHitInfo]
  }
  @scala.inline
  implicit class ASPxClientWebChartHitInfoOps[Self <: ASPxClientWebChartHitInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnnotation(value: ASPxClientAnnotation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAxis(value: ASPxClientAxisBase): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAxisLabelItem(value: ASPxClientAxisLabelItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisLabelItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAxisTitle(value: ASPxClientAxisTitle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChart(value: ASPxClientWebChart): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChartTitle(value: ASPxClientChartTitle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chartTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConstantLine(value: ASPxClientConstantLine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constantLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomLegendItem(value: ASPxClientCustomLegendItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customLegendItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDiagram(value: ASPxClientXYDiagramBase): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diagram")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFibonacciIndicator(value: ASPxClientFibonacciIndicator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fibonacciIndicator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHyperlink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hyperlink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInAnnotation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInAxis(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInAxisLabelItem(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inAxisLabelItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInAxisTitle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inAxisTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInChart(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inChart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInChartTitle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inChartTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInConstantLine(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inConstantLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInCustomLegendItem(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inCustomLegendItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInDiagram(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inDiagram")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInFibonacciIndicator(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inFibonacciIndicator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInHyperlink(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inHyperlink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInIndicator(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inIndicator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInLegend(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inLegend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInNonDefaultPane(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inNonDefaultPane")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInPaneTitle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inPaneTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInRegressionLine(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inRegressionLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInSeries(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inSeries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInSeriesLabel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inSeriesLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInSeriesPoint(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inSeriesPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInSeriesTitle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inSeriesTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInTrendLine(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inTrendLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndicator(value: ASPxClientIndicator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLegend(value: ASPxClientLegend): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNonDefaultPane(value: ASPxClientXYDiagramPane): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonDefaultPane")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaneTitle(value: ASPxClientPaneTitle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paneTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegressionLine(value: ASPxClientRegressionLine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regressionLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeries(value: ASPxClientSeries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("series")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeriesLabel(value: ASPxClientSeriesLabel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeriesPoint(value: ASPxClientSeriesPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeriesTitle(value: ASPxClientSeriesTitle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrendLine(value: ASPxClientTrendLine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trendLine")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

