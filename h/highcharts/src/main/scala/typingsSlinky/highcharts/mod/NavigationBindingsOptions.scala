package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationBindingsOptions extends js.Object {
  /**
    * (Highstock) A line with arrow annotation. Includes `start` and one event
    * in `steps` array.
    */
  var arrowInfinityLine: js.UndefOr[StockToolsBindingsObject] = js.native
  /**
    * (Highstock) A ray with an arrow annotation bindings. Includes `start` and
    * one event in `steps` array.
    */
  var arrowRay: js.UndefOr[StockToolsBindingsObject] = js.native
  /**
    * (Highstock) A segment with an arrow annotation bindings. Includes `start`
    * and one event in `steps` array.
    */
  var arrowSegment: js.UndefOr[StockToolsBindingsObject] = js.native
  /**
    * (Highcharts, Highstock) A circle annotation bindings. Includes `start`
    * and one event in `steps` array.
    */
  var circleAnnotation: js.UndefOr[StockToolsBindingsObject] = js.native
  /**
    * (Highstock) Crooked line (three points) annotation bindings. Includes
    * `start` and two events in `steps` (for second and third points in crooked
    * line) array.
    */
  var crooked3: js.UndefOr[StockToolsBindingsObject] = js.native
  /**
    * (Highstock) Crooked line (five points) annotation bindings. Includes
    * `start` and four events in `steps` (for all consequent points in crooked
    * line) array.
    */
  var crooked5: js.UndefOr[StockToolsBindingsObject] = js.native
  /**
    * (Highstock) Hides/shows two price indicators:
    *
    * - last price in the dataset
    *
    * - last price in the selected range
    */
  var currentPriceIndicator: js.UndefOr[StockToolsBindingsObject] = js.native
  /**
    * (Highstock) Elliott wave (three points) annotation bindings. Includes
    * `start` and two events in `steps` (for second and third points) array.
    */
  var elliott3: js.UndefOr[StockToolsBindingsObject] = js.native
  /**
    * (Highstock) Elliott wave (five points) annotation bindings. Includes
    * `start` and four event in `steps` (for all consequent points in Elliott
    * wave) array.
    */
  var elliott5: js.UndefOr[StockToolsBindingsObject] = js.native
  /**
    * (Highstock) A fibonacci annotation bindings. Includes `start` and two
    * events in `steps` array (updates second point, then height).
    */
  var fibonacci: js.UndefOr[StockToolsBindingsObject] = js.native
  /**
    * (Highstock) A flag series bindings. Includes `start` event. On click,
    * finds the closest point and marks it with a flag with `'circlepin'`
    * shape.
    */
  var flagCirclepin: js.UndefOr[StockToolsBindingsObject] = js.native
  /**
    * (Highstock) A flag series bindings. Includes `start` event. On click,
    * finds the closest point and marks it with a flag with `'diamondpin'`
    * shape.
    */
  var flagDiamondpin: js.UndefOr[StockToolsBindingsObject] = js.native
  /**
    * (Highstock) A flag series bindings. Includes `start` event. On click,
    * finds the closest point and marks it with a flag without pin shape.
    */
  var flagSimplepin: js.UndefOr[StockToolsBindingsObject] = js.native
  /**
    * (Highstock) A flag series bindings. Includes `start` event. On click,
    * finds the closest point and marks it with a flag with `'squarepin'`
    * shape.
    */
  var flagSquarepin: js.UndefOr[StockToolsBindingsObject] = js.native
  /**
    * (Highstock) Displays chart in fullscreen.
    */
  var fullScreen: js.UndefOr[StockToolsBindingsObject] = js.native
  /**
    * (Highstock) A horizontal line annotation. Includes `start` event.
    */
  var horizontalLine: js.UndefOr[StockToolsBindingsObject] = js.native
  /**
    * (Highstock) Indicators bindings. Includes `init` event to show a popup.
    *
    * Note: In order to show base series from the chart in the popup's dropdown
    * each series requires series.id to be defined.
    */
  var indicators: js.UndefOr[StockToolsBindingsObject] = js.native
  /**
    * (Highstock) A line annotation. Includes `start` and one event in `steps`
    * array.
    */
  var infinityLine: js.UndefOr[StockToolsBindingsObject] = js.native
  /**
    * (Highcharts, Highstock) A label annotation bindings. Includes `start`
    * event only.
    */
  var labelAnnotation: js.UndefOr[StockToolsBindingsObject] = js.native
  /**
    * (Highstock) A measure (x-dimension) annotation bindings. Includes `start`
    * and one event in `steps` array.
    */
  var measureX: js.UndefOr[StockToolsBindingsObject] = js.native
  /**
    * (Highstock) A measure (xy-dimension) annotation bindings. Includes
    * `start` and one event in `steps` array.
    */
  var measureXY: js.UndefOr[StockToolsBindingsObject] = js.native
  /**
    * (Highstock) A measure (y-dimension) annotation bindings. Includes `start`
    * and one event in `steps` array.
    */
  var measureY: js.UndefOr[StockToolsBindingsObject] = js.native
  /**
    * (Highstock) A parallel channel (tunnel) annotation bindings. Includes
    * `start` and two events in `steps` array (updates second point, then
    * height).
    */
  var parallelChannel: js.UndefOr[StockToolsBindingsObject] = js.native
  /**
    * (Highstock) An Andrew's pitchfork annotation bindings. Includes `start`
    * and two events in `steps` array (sets second and third control points).
    */
  var pitchfork: js.UndefOr[StockToolsBindingsObject] = js.native
  /**
    * (Highstock) A ray annotation bindings. Includes `start` and one event in
    * `steps` array.
    */
  var ray: js.UndefOr[StockToolsBindingsObject] = js.native
  /**
    * (Highcharts, Highstock) A rectangle annotation bindings. Includes `start`
    * and one event in `steps` array.
    */
  var rectangleAnnotation: js.UndefOr[StockToolsBindingsObject] = js.native
  /**
    * (Highstock) Save a chart in localStorage under `highcharts-chart` key.
    * Stored items:
    *
    * - annotations
    *
    * - indicators (with yAxes)
    *
    * - flags
    */
  var saveChart: js.UndefOr[StockToolsBindingsObject] = js.native
  /**
    * (Highstock) A segment annotation bindings. Includes `start` and one event
    * in `steps` array.
    */
  var segment: js.UndefOr[StockToolsBindingsObject] = js.native
  /**
    * (Highstock) Changes main series to `'candlestick'` type.
    */
  var seriesTypeCandlestick: js.UndefOr[StockToolsBindingsObject] = js.native
  /**
    * (Highstock) Changes main series to `'line'` type.
    */
  var seriesTypeLine: js.UndefOr[StockToolsBindingsObject] = js.native
  /**
    * (Highstock) Changes main series to `'ohlc'` type.
    */
  var seriesTypeOhlc: js.UndefOr[StockToolsBindingsObject] = js.native
  /**
    * (Highstock) Hides/shows all annotations on a chart.
    */
  var toggleAnnotations: js.UndefOr[StockToolsBindingsObject] = js.native
  /**
    * (Highstock) A vertical arrow annotation bindings. Includes `start` event.
    * On click, finds the closest point and marks it with an arrow. Green arrow
    * when pointing from above, red when pointing from below the point.
    */
  var verticalArrow: js.UndefOr[StockToolsBindingsObject] = js.native
  /**
    * (Highstock) A vertical counter annotation bindings. Includes `start`
    * event. On click, finds the closest point and marks it with a numeric
    * annotation - incrementing counter on each add.
    */
  var verticalCounter: js.UndefOr[StockToolsBindingsObject] = js.native
  /**
    * (Highstock) A vertical arrow annotation bindings. Includes `start` event.
    * On click, finds the closest point and marks it with an arrow and a label
    * with value.
    */
  var verticalLabel: js.UndefOr[StockToolsBindingsObject] = js.native
  /**
    * (Highstock) A vertical line annotation. Includes `start` event.
    */
  var verticalLine: js.UndefOr[StockToolsBindingsObject] = js.native
  /**
    * (Highstock) Enables zooming in xAxis on a chart. Includes `start` event
    * which changes chart.zoomType.
    */
  var zoomX: js.UndefOr[StockToolsBindingsObject] = js.native
  /**
    * (Highstock) Enables zooming in xAxis and yAxis on a chart. Includes
    * `start` event which changes chart.zoomType.
    */
  var zoomXY: js.UndefOr[StockToolsBindingsObject] = js.native
  /**
    * (Highstock) Enables zooming in yAxis on a chart. Includes `start` event
    * which changes chart.zoomType.
    */
  var zoomY: js.UndefOr[StockToolsBindingsObject] = js.native
}

object NavigationBindingsOptions {
  @scala.inline
  def apply(): NavigationBindingsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationBindingsOptions]
  }
  @scala.inline
  implicit class NavigationBindingsOptionsOps[Self <: NavigationBindingsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArrowInfinityLine(value: StockToolsBindingsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowInfinityLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrowInfinityLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowInfinityLine")(js.undefined)
        ret
    }
    @scala.inline
    def withArrowRay(value: StockToolsBindingsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowRay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrowRay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowRay")(js.undefined)
        ret
    }
    @scala.inline
    def withArrowSegment(value: StockToolsBindingsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowSegment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrowSegment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowSegment")(js.undefined)
        ret
    }
    @scala.inline
    def withCircleAnnotation(value: StockToolsBindingsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circleAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCircleAnnotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circleAnnotation")(js.undefined)
        ret
    }
    @scala.inline
    def withCrooked3(value: StockToolsBindingsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crooked3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrooked3: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crooked3")(js.undefined)
        ret
    }
    @scala.inline
    def withCrooked5(value: StockToolsBindingsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crooked5")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrooked5: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crooked5")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentPriceIndicator(value: StockToolsBindingsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentPriceIndicator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentPriceIndicator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentPriceIndicator")(js.undefined)
        ret
    }
    @scala.inline
    def withElliott3(value: StockToolsBindingsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elliott3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElliott3: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elliott3")(js.undefined)
        ret
    }
    @scala.inline
    def withElliott5(value: StockToolsBindingsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elliott5")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElliott5: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elliott5")(js.undefined)
        ret
    }
    @scala.inline
    def withFibonacci(value: StockToolsBindingsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fibonacci")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFibonacci: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fibonacci")(js.undefined)
        ret
    }
    @scala.inline
    def withFlagCirclepin(value: StockToolsBindingsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flagCirclepin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlagCirclepin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flagCirclepin")(js.undefined)
        ret
    }
    @scala.inline
    def withFlagDiamondpin(value: StockToolsBindingsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flagDiamondpin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlagDiamondpin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flagDiamondpin")(js.undefined)
        ret
    }
    @scala.inline
    def withFlagSimplepin(value: StockToolsBindingsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flagSimplepin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlagSimplepin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flagSimplepin")(js.undefined)
        ret
    }
    @scala.inline
    def withFlagSquarepin(value: StockToolsBindingsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flagSquarepin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlagSquarepin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flagSquarepin")(js.undefined)
        ret
    }
    @scala.inline
    def withFullScreen(value: StockToolsBindingsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullScreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullScreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullScreen")(js.undefined)
        ret
    }
    @scala.inline
    def withHorizontalLine(value: StockToolsBindingsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontalLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalLine")(js.undefined)
        ret
    }
    @scala.inline
    def withIndicators(value: StockToolsBindingsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndicators: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicators")(js.undefined)
        ret
    }
    @scala.inline
    def withInfinityLine(value: StockToolsBindingsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infinityLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInfinityLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infinityLine")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelAnnotation(value: StockToolsBindingsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelAnnotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelAnnotation")(js.undefined)
        ret
    }
    @scala.inline
    def withMeasureX(value: StockToolsBindingsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measureX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeasureX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measureX")(js.undefined)
        ret
    }
    @scala.inline
    def withMeasureXY(value: StockToolsBindingsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measureXY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeasureXY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measureXY")(js.undefined)
        ret
    }
    @scala.inline
    def withMeasureY(value: StockToolsBindingsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measureY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeasureY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measureY")(js.undefined)
        ret
    }
    @scala.inline
    def withParallelChannel(value: StockToolsBindingsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parallelChannel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParallelChannel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parallelChannel")(js.undefined)
        ret
    }
    @scala.inline
    def withPitchfork(value: StockToolsBindingsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pitchfork")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPitchfork: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pitchfork")(js.undefined)
        ret
    }
    @scala.inline
    def withRay(value: StockToolsBindingsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ray")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ray")(js.undefined)
        ret
    }
    @scala.inline
    def withRectangleAnnotation(value: StockToolsBindingsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rectangleAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRectangleAnnotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rectangleAnnotation")(js.undefined)
        ret
    }
    @scala.inline
    def withSaveChart(value: StockToolsBindingsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveChart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSaveChart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveChart")(js.undefined)
        ret
    }
    @scala.inline
    def withSegment(value: StockToolsBindingsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSegment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segment")(js.undefined)
        ret
    }
    @scala.inline
    def withSeriesTypeCandlestick(value: StockToolsBindingsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesTypeCandlestick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeriesTypeCandlestick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesTypeCandlestick")(js.undefined)
        ret
    }
    @scala.inline
    def withSeriesTypeLine(value: StockToolsBindingsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesTypeLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeriesTypeLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesTypeLine")(js.undefined)
        ret
    }
    @scala.inline
    def withSeriesTypeOhlc(value: StockToolsBindingsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesTypeOhlc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeriesTypeOhlc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesTypeOhlc")(js.undefined)
        ret
    }
    @scala.inline
    def withToggleAnnotations(value: StockToolsBindingsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleAnnotations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToggleAnnotations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleAnnotations")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalArrow(value: StockToolsBindingsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalArrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalArrow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalArrow")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalCounter(value: StockToolsBindingsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalCounter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalCounter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalCounter")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalLabel(value: StockToolsBindingsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalLine(value: StockToolsBindingsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalLine")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomX(value: StockToolsBindingsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomX")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomXY(value: StockToolsBindingsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomXY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomXY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomXY")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomY(value: StockToolsBindingsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomY")(js.undefined)
        ret
    }
  }
  
}

