package typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
  /** Specifies animationSpeed of circular gauge
    * @Default {500}
    */
  var animationSpeed: js.UndefOr[Double] = js.native
  /** Specifies the background color of circular gauge.
    * @Default {null}
    */
  var backgroundColor: js.UndefOr[String] = js.native
  /** Specify distanceFromCorner value of circular gauge
    * @Default {center}
    */
  var distanceFromCorner: js.UndefOr[Double] = js.native
  /** Fires, on double clicking the circular gauge.
    */
  var doubleClick: js.UndefOr[js.Function1[/* e */ DoubleClickEventArgs, Unit]] = js.native
  /** Triggers while the custom labels are being drawn on the gauge.
    */
  var drawCustomLabel: js.UndefOr[js.Function1[/* e */ DrawCustomLabelEventArgs, Unit]] = js.native
  /** Triggers while the indicators are being started to drawn on the gauge.
    */
  var drawIndicators: js.UndefOr[js.Function1[/* e */ DrawIndicatorsEventArgs, Unit]] = js.native
  /** Triggers while the labels are being drawn on the gauge.
    */
  var drawLabels: js.UndefOr[js.Function1[/* e */ DrawLabelsEventArgs, Unit]] = js.native
  /** Triggers while the pointer cap is being drawn on the gauge.
    */
  var drawPointerCap: js.UndefOr[js.Function1[/* e */ DrawPointerCapEventArgs, Unit]] = js.native
  /** Triggers while the pointers are being drawn on the gauge.
    */
  var drawPointers: js.UndefOr[js.Function1[/* e */ DrawPointersEventArgs, Unit]] = js.native
  /** Triggers when the ranges begin to be getting drawn on the gauge.
    */
  var drawRange: js.UndefOr[js.Function1[/* e */ DrawRangeEventArgs, Unit]] = js.native
  /** Triggers while the ticks are being drawn on the gauge.
    */
  var drawTicks: js.UndefOr[js.Function1[/* e */ DrawTicksEventArgs, Unit]] = js.native
  /** Specify animate value of circular gauge
    * @Default {true}
    */
  var enableAnimation: js.UndefOr[Boolean] = js.native
  /** Specify to convert the  date object to  string, using locale settings.
    * @Default {false}
    */
  var enableGroupSeparator: js.UndefOr[Boolean] = js.native
  /** Controls whether circular gauge has to be responsive while resizing.
    * @Default {false}
    */
  var enableResize: js.UndefOr[Boolean] = js.native
  /** This provides options for customizing export settings
    */
  var exportSettings: js.UndefOr[ExportSettings] = js.native
  /** Specify the frame of circular gauge
    * @Default {Object}
    */
  var frame: js.UndefOr[Frame] = js.native
  /** Specify gaugePosition value of circular gauge See GaugePosition
    * @Default {center}
    */
  var gaugePosition: js.UndefOr[typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.gaugePosition | String] = js.native
  /** Specifies the height of circular gauge.
    * @Default {360}
    */
  var height: js.UndefOr[Double] = js.native
  /** Specifies the interiorGradient of circular gauge.
    * @Default {null}
    */
  var interiorGradient: js.UndefOr[js.Any] = js.native
  /** Specify isRadialGradient value of circular gauge
    * @Default {false}
    */
  var isRadialGradient: js.UndefOr[Boolean] = js.native
  /** Specify isResponsive value of circular gauge
    * @Default {false}
    */
  var isResponsive: js.UndefOr[Boolean] = js.native
  /** Options to customize the legend.
    */
  var legend: js.UndefOr[Legend] = js.native
  /** Fires on clicking the legend item.
    */
  var legendItemClick: js.UndefOr[js.Function1[/* e */ LegendItemClickEventArgs, Unit]] = js.native
  /** Fires before rendering the legend item. This event is fired for each legend item in CircularGauge. You can use this event to customize legend item shape or add custom text to
    * legend item.
    */
  var legendItemRender: js.UndefOr[js.Function1[/* e */ LegendItemRenderEventArgs, Unit]] = js.native
  /** Triggers while the gauge start to Load.
    */
  var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, Unit]] = js.native
  /** Name of the culture based on which circular gauge should be localized.
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.native
  /** Specifies the maximum value of circular gauge.
    * @Default {100}
    */
  var maximum: js.UndefOr[Double] = js.native
  /** Specifies the minimum value of circular gauge.
    * @Default {0}
    */
  var minimum: js.UndefOr[Double] = js.native
  /** Triggers when the left mouse button is clicked.
    */
  var mouseClick: js.UndefOr[js.Function1[/* e */ MouseClickEventArgs, Unit]] = js.native
  /** Triggers when clicking and dragging the mouse pointer over the gauge pointer.
    */
  var mouseClickMove: js.UndefOr[js.Function1[/* e */ MouseClickMoveEventArgs, Unit]] = js.native
  /** Triggers when the mouse click is released.
    */
  var mouseClickUp: js.UndefOr[js.Function1[/* e */ MouseClickUpEventArgs, Unit]] = js.native
  /** Specify outerCustomLabelPosition value of circular gauge See
    * @Default {bottom}
    */
  var outerCustomLabelPosition: js.UndefOr[OuterCustomLabelPosition | String] = js.native
  /** Specifies the radius of circular gauge.
    * @Default {180}
    */
  var radius: js.UndefOr[Double] = js.native
  /** Fires when mouse moving on ranges.
    */
  var rangeMouseMove: js.UndefOr[js.Function1[/* e */ RangeMouseMoveEventArgs, Unit]] = js.native
  /** Specify range Z-order placement of circular gauge.
    * @Default {Rear}
    */
  var rangeZOrder: js.UndefOr[RangeZOrderPlacement | String] = js.native
  /** Specify readonly value of circular gauge
    * @Default {true}
    */
  var readOnly: js.UndefOr[Boolean] = js.native
  /** Triggers when the rendering of the gauge is completed.
    */
  var renderComplete: js.UndefOr[js.Function1[/* e */ RenderCompleteEventArgs, Unit]] = js.native
  /** Fires, on right clicking the circular gauge.
    */
  var rightClick: js.UndefOr[js.Function1[/* e */ RightClickEventArgs, Unit]] = js.native
  /** Specify the pointers, ticks, labels, indicators, ranges of circular gauge
    * @Default {null}
    */
  var scales: js.UndefOr[js.Array[Scale]] = js.native
  /** Specify the theme of circular gauge.
    * @Default {flatlight}
    */
  var theme: js.UndefOr[String] = js.native
  /** Specify tooltip option of circular gauge
    * @Default {object}
    */
  var tooltip: js.UndefOr[Tooltip] = js.native
  /** Specifies the value of circular gauge.
    * @Default {0}
    */
  var value: js.UndefOr[Double] = js.native
  /** Specifies the width of circular gauge.
    * @Default {360}
    */
  var width: js.UndefOr[Double] = js.native
}

object Model {
  @scala.inline
  def apply(): Model = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Model]
  }
  @scala.inline
  implicit class ModelOps[Self <: Model] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimationSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationSpeed")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withDistanceFromCorner(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distanceFromCorner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDistanceFromCorner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distanceFromCorner")(js.undefined)
        ret
    }
    @scala.inline
    def withDoubleClick(value: /* e */ DoubleClickEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubleClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDoubleClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubleClick")(js.undefined)
        ret
    }
    @scala.inline
    def withDrawCustomLabel(value: /* e */ DrawCustomLabelEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawCustomLabel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDrawCustomLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawCustomLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withDrawIndicators(value: /* e */ DrawIndicatorsEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawIndicators")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDrawIndicators: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawIndicators")(js.undefined)
        ret
    }
    @scala.inline
    def withDrawLabels(value: /* e */ DrawLabelsEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawLabels")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDrawLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawLabels")(js.undefined)
        ret
    }
    @scala.inline
    def withDrawPointerCap(value: /* e */ DrawPointerCapEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawPointerCap")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDrawPointerCap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawPointerCap")(js.undefined)
        ret
    }
    @scala.inline
    def withDrawPointers(value: /* e */ DrawPointersEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawPointers")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDrawPointers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawPointers")(js.undefined)
        ret
    }
    @scala.inline
    def withDrawRange(value: /* e */ DrawRangeEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawRange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDrawRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawRange")(js.undefined)
        ret
    }
    @scala.inline
    def withDrawTicks(value: /* e */ DrawTicksEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawTicks")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDrawTicks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawTicks")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableAnimation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAnimation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAnimation")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableGroupSeparator(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableGroupSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableGroupSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableGroupSeparator")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableResize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableResize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableResize")(js.undefined)
        ret
    }
    @scala.inline
    def withExportSettings(value: ExportSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExportSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withFrame(value: Frame): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frame")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrame: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frame")(js.undefined)
        ret
    }
    @scala.inline
    def withGaugePosition(value: gaugePosition | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gaugePosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGaugePosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gaugePosition")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withInteriorGradient(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interiorGradient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInteriorGradient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interiorGradient")(js.undefined)
        ret
    }
    @scala.inline
    def withIsRadialGradient(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRadialGradient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsRadialGradient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRadialGradient")(js.undefined)
        ret
    }
    @scala.inline
    def withIsResponsive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isResponsive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsResponsive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isResponsive")(js.undefined)
        ret
    }
    @scala.inline
    def withLegend(value: Legend): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legend")(js.undefined)
        ret
    }
    @scala.inline
    def withLegendItemClick(value: /* e */ LegendItemClickEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendItemClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLegendItemClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendItemClick")(js.undefined)
        ret
    }
    @scala.inline
    def withLegendItemRender(value: /* e */ LegendItemRenderEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendItemRender")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLegendItemRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendItemRender")(js.undefined)
        ret
    }
    @scala.inline
    def withLoad(value: /* e */ LoadEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximum(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximum")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimum(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimum")(js.undefined)
        ret
    }
    @scala.inline
    def withMouseClick(value: /* e */ MouseClickEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMouseClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseClick")(js.undefined)
        ret
    }
    @scala.inline
    def withMouseClickMove(value: /* e */ MouseClickMoveEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseClickMove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMouseClickMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseClickMove")(js.undefined)
        ret
    }
    @scala.inline
    def withMouseClickUp(value: /* e */ MouseClickUpEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseClickUp")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMouseClickUp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseClickUp")(js.undefined)
        ret
    }
    @scala.inline
    def withOuterCustomLabelPosition(value: OuterCustomLabelPosition | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outerCustomLabelPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOuterCustomLabelPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outerCustomLabelPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radius")(js.undefined)
        ret
    }
    @scala.inline
    def withRangeMouseMove(value: /* e */ RangeMouseMoveEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeMouseMove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRangeMouseMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeMouseMove")(js.undefined)
        ret
    }
    @scala.inline
    def withRangeZOrder(value: RangeZOrderPlacement | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeZOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangeZOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeZOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withReadOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderComplete(value: /* e */ RenderCompleteEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderComplete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRenderComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withRightClick(value: /* e */ RightClickEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRightClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightClick")(js.undefined)
        ret
    }
    @scala.inline
    def withScales(value: js.Array[Scale]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scales")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScales: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scales")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltip(value: Tooltip): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

