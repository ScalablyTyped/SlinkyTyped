package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the WebChartControl control.
  */
@js.native
trait ASPxClientWebChart extends ASPxClientWebChartElement {
  /**
    * Provides access to the chart's collection of annotations.
    */
  var annotations: js.Array[ASPxClientAnnotation] = js.native
  /**
    * Gets the name of the appearance, which is currently used to draw the chart's elements.
    */
  var appearanceName: String = js.native
  /**
    * Gets the client-side Chart Control that owns the current chart.
    */
  var chartControl: ASPxClientWebChartControl = js.native
  /**
    * Gets the settings for a crosshair cursor concerning its position and appearance on a diagram.
    */
  var crosshairOptions: ASPxClientCrosshairOptions = js.native
  /**
    * Gets a css postfix for a chart.
    */
  var cssPostfix: String = js.native
  /**
    * Gets the chart's diagram and provides access to its settings.
    */
  var diagram: ASPxClientWebChartElement = js.native
  /**
    * Gets the chart's legend and provides access to its settings.
    */
  var legend: ASPxClientLegend = js.native
  /**
    * Returns the collection of legends.
    */
  var legends: js.Array[ASPxClientLegend] = js.native
  /**
    * Gets the name of the palette currently used to draw the chart's series.
    */
  var paletteName: String = js.native
  /**
    * Gets or sets a value which specifies how the chart elements are selected.
    */
  var selectionMode: String = js.native
  /**
    * Provides access to the chart's collection of series.
    */
  var series: js.Array[ASPxClientSeries] = js.native
  /**
    * Gets a value indicating whether a crosshair cursor should be shown.
    */
  var showCrosshair: Boolean = js.native
  /**
    * Gets a value indicating whether point tooltips should be shown.
    */
  var showPointToolTip: Boolean = js.native
  /**
    * Gets a value indicating whether series tooltips should be shown.
    */
  var showSeriesToolTip: Boolean = js.native
  /**
    * Provides access to the collection of chart titles.
    */
  var titles: js.Array[ASPxClientChartTitle] = js.native
  /**
    * Returns the tooltip controller that shows tooltips for chart elements.
    */
  var toolTipController: ASPxClientToolTipController = js.native
  /**
    * Gets a value that contains information on how the tooltip position is defined, for example, relative to a mouse pointer or chart element.
    */
  var toolTipPosition: ASPxClientToolTipPosition = js.native
}

object ASPxClientWebChart {
  @scala.inline
  def apply(
    annotations: js.Array[ASPxClientAnnotation],
    appearanceName: String,
    chart: ASPxClientWebChart,
    chartControl: ASPxClientWebChartControl,
    crosshairOptions: ASPxClientCrosshairOptions,
    cssPostfix: String,
    diagram: ASPxClientWebChartElement,
    legend: ASPxClientLegend,
    legends: js.Array[ASPxClientLegend],
    paletteName: String,
    selectionMode: String,
    series: js.Array[ASPxClientSeries],
    showCrosshair: Boolean,
    showPointToolTip: Boolean,
    showSeriesToolTip: Boolean,
    titles: js.Array[ASPxClientChartTitle],
    toolTipController: ASPxClientToolTipController,
    toolTipPosition: ASPxClientToolTipPosition
  ): ASPxClientWebChart = {
    val __obj = js.Dynamic.literal(annotations = annotations.asInstanceOf[js.Any], appearanceName = appearanceName.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], chartControl = chartControl.asInstanceOf[js.Any], crosshairOptions = crosshairOptions.asInstanceOf[js.Any], cssPostfix = cssPostfix.asInstanceOf[js.Any], diagram = diagram.asInstanceOf[js.Any], legend = legend.asInstanceOf[js.Any], legends = legends.asInstanceOf[js.Any], paletteName = paletteName.asInstanceOf[js.Any], selectionMode = selectionMode.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any], showCrosshair = showCrosshair.asInstanceOf[js.Any], showPointToolTip = showPointToolTip.asInstanceOf[js.Any], showSeriesToolTip = showSeriesToolTip.asInstanceOf[js.Any], titles = titles.asInstanceOf[js.Any], toolTipController = toolTipController.asInstanceOf[js.Any], toolTipPosition = toolTipPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientWebChart]
  }
  @scala.inline
  implicit class ASPxClientWebChartOps[Self <: ASPxClientWebChart] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnnotations(value: js.Array[ASPxClientAnnotation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppearanceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appearanceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChartControl(value: ASPxClientWebChartControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chartControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCrosshairOptions(value: ASPxClientCrosshairOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crosshairOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCssPostfix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssPostfix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDiagram(value: ASPxClientWebChartElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diagram")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLegend(value: ASPxClientLegend): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLegends(value: js.Array[ASPxClientLegend]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legends")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaletteName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paletteName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectionMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeries(value: js.Array[ASPxClientSeries]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("series")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowCrosshair(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCrosshair")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowPointToolTip(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPointToolTip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowSeriesToolTip(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSeriesToolTip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitles(value: js.Array[ASPxClientChartTitle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToolTipController(value: ASPxClientToolTipController): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolTipController")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToolTipPosition(value: ASPxClientToolTipPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolTipPosition")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

