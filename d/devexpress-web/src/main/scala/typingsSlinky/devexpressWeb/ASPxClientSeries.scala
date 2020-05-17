package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the Series class.
  */
@js.native
trait ASPxClientSeries extends ASPxClientWebChartElementNamed {
  /**
    * Gets a value indicating whether a crosshair cursor is enabled.
    */
  var actualCrosshairEnabled: Boolean = js.native
  /**
    * Gets a value indicating whether a crosshair label should be shown for this series.
    */
  var actualCrosshairLabelVisibility: Boolean = js.native
  /**
    * Gets a value that specifies the scale type for the argument data of the series' data points.
    */
  var argumentScaleType: String = js.native
  /**
    * Gets the X-Axis that is used to plot the current series on the XY-diagram.
    */
  var axisX: String = js.native
  /**
    * Gets the Y-Axis that is used to plot the current series on the XY-diagram.
    */
  var axisY: String = js.native
  /**
    * Gets the color of a series.
    */
  var color: String = js.native
  /**
    * Gets a string which represents the pattern specifying the text to be displayed within a crosshair label for the current Series  type.
    */
  var crosshairLabelPattern: String = js.native
  /**
    * Returns a collection of crosshair value items.
    */
  var crosshairValueItems: js.Array[ASPxClientCrosshairValueItem] = js.native
  /** @deprecated This property is now obsolete. Use the indicators property instead. */
  /**
    * Provides access to the collection of Fibonacci Indicators.
    */
  var fibonacciIndicators: js.Array[ASPxClientFibonacciIndicator] = js.native
  /**
    * This property is intended for internal use only.
    */
  var groupedElementsPattern: String = js.native
  /**
    * Gets the series' collection of indicators.
    */
  var indicators: js.Array[ASPxClientIndicator] = js.native
  /**
    * Gets the settings of series labels.
    */
  var label: ASPxClientSeriesLabel = js.native
  /**
    * Gets the pane that is used to plot the current series on the XY-diagram.
    */
  var pane: String = js.native
  /**
    * Gets the series' collection of data points.
    */
  var points: js.Array[ASPxClientSeriesPoint] = js.native
  /** @deprecated This property is now obsolete. Use the indicators property instead. */
  /**
    * Provides access to the collection of regression lines.
    */
  var regressionLines: js.Array[ASPxClientRegressionLine] = js.native
  /**
    * Gets a value that defines a group for stacked series.
    */
  var stackedGroup: String = js.native
  /**
    * Provides access to the collection of series titles.
    */
  var titles: js.Array[ASPxClientSeriesTitle] = js.native
  /**
    * Gets a value that specifies whether or not a tooltip is enabled for a chart.
    */
  var toolTipEnabled: Boolean = js.native
  /**
    * Gets an image to be displayed within series tooltips.
    */
  var toolTipImage: String = js.native
  /**
    * Gets the text to be displayed within series tooltips.
    */
  var toolTipText: String = js.native
  /** @deprecated This property is now obsolete. Use the indicators property instead. */
  /**
    * Provides access to the collection of trendlines.
    */
  var trendLines: js.Array[ASPxClientTrendLine] = js.native
  /**
    * Gets a value that specifies the scale type for the value data of the series' data points.
    */
  var valueScaleType: String = js.native
  /**
    * Gets a value that specifies the view type of the series.
    */
  var viewType: String = js.native
  /**
    * Gets a value indicating whether the series is visible.
    */
  var visible: Boolean = js.native
}

object ASPxClientSeries {
  @scala.inline
  def apply(
    actualCrosshairEnabled: Boolean,
    actualCrosshairLabelVisibility: Boolean,
    argumentScaleType: String,
    axisX: String,
    axisY: String,
    chart: ASPxClientWebChart,
    color: String,
    crosshairLabelPattern: String,
    crosshairValueItems: js.Array[ASPxClientCrosshairValueItem],
    fibonacciIndicators: js.Array[ASPxClientFibonacciIndicator],
    groupedElementsPattern: String,
    indicators: js.Array[ASPxClientIndicator],
    label: ASPxClientSeriesLabel,
    name: String,
    pane: String,
    points: js.Array[ASPxClientSeriesPoint],
    regressionLines: js.Array[ASPxClientRegressionLine],
    stackedGroup: String,
    titles: js.Array[ASPxClientSeriesTitle],
    toolTipEnabled: Boolean,
    toolTipImage: String,
    toolTipText: String,
    trendLines: js.Array[ASPxClientTrendLine],
    valueScaleType: String,
    viewType: String,
    visible: Boolean
  ): ASPxClientSeries = {
    val __obj = js.Dynamic.literal(actualCrosshairEnabled = actualCrosshairEnabled.asInstanceOf[js.Any], actualCrosshairLabelVisibility = actualCrosshairLabelVisibility.asInstanceOf[js.Any], argumentScaleType = argumentScaleType.asInstanceOf[js.Any], axisX = axisX.asInstanceOf[js.Any], axisY = axisY.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], crosshairLabelPattern = crosshairLabelPattern.asInstanceOf[js.Any], crosshairValueItems = crosshairValueItems.asInstanceOf[js.Any], fibonacciIndicators = fibonacciIndicators.asInstanceOf[js.Any], groupedElementsPattern = groupedElementsPattern.asInstanceOf[js.Any], indicators = indicators.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pane = pane.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], regressionLines = regressionLines.asInstanceOf[js.Any], stackedGroup = stackedGroup.asInstanceOf[js.Any], titles = titles.asInstanceOf[js.Any], toolTipEnabled = toolTipEnabled.asInstanceOf[js.Any], toolTipImage = toolTipImage.asInstanceOf[js.Any], toolTipText = toolTipText.asInstanceOf[js.Any], trendLines = trendLines.asInstanceOf[js.Any], valueScaleType = valueScaleType.asInstanceOf[js.Any], viewType = viewType.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientSeries]
  }
  @scala.inline
  implicit class ASPxClientSeriesOps[Self <: ASPxClientSeries] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActualCrosshairEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actualCrosshairEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActualCrosshairLabelVisibility(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actualCrosshairLabelVisibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArgumentScaleType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("argumentScaleType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAxisX(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAxisY(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCrosshairLabelPattern(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crosshairLabelPattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCrosshairValueItems(value: js.Array[ASPxClientCrosshairValueItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crosshairValueItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFibonacciIndicators(value: js.Array[ASPxClientFibonacciIndicator]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fibonacciIndicators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupedElementsPattern(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupedElementsPattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndicators(value: js.Array[ASPxClientIndicator]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: ASPxClientSeriesLabel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPane(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pane")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPoints(value: js.Array[ASPxClientSeriesPoint]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("points")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegressionLines(value: js.Array[ASPxClientRegressionLine]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regressionLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStackedGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackedGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitles(value: js.Array[ASPxClientSeriesTitle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToolTipEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolTipEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToolTipImage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolTipImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToolTipText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolTipText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrendLines(value: js.Array[ASPxClientTrendLine]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trendLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValueScaleType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueScaleType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

