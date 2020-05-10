package typingsSlinky.ejWebAll.ej.datavisualization.LinearGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
  /** Specifies the animationSpeed
    * @Default {500}
    */
  var animationSpeed: js.UndefOr[Double] = js.native
  /** Specifies the backgroundColor for Linear gauge.
    * @Default {null}
    */
  var backgroundColor: js.UndefOr[String] = js.native
  /** Specifies the borderColor for Linear gauge.
    * @Default {null}
    */
  var borderColor: js.UndefOr[String] = js.native
  /** Fires, on double clicking the gauge.
    */
  var doubleClick: js.UndefOr[js.Function1[/* e */ DoubleClickEventArgs, Unit]] = js.native
  /** Triggers while the bar pointer are being drawn on the gauge.
    */
  var drawBarPointers: js.UndefOr[js.Function1[/* e */ DrawBarPointersEventArgs, Unit]] = js.native
  /** Triggers while the customLabel are being drawn on the gauge.
    */
  var drawCustomLabel: js.UndefOr[js.Function1[/* e */ DrawCustomLabelEventArgs, Unit]] = js.native
  /** Triggers while the Indicator are being drawn on the gauge.
    */
  var drawIndicators: js.UndefOr[js.Function1[/* e */ DrawIndicatorsEventArgs, Unit]] = js.native
  /** Triggers while the label are being drawn on the gauge.
    */
  var drawLabels: js.UndefOr[js.Function1[/* e */ DrawLabelsEventArgs, Unit]] = js.native
  /** Triggers while the marker are being drawn on the gauge.
    */
  var drawMarkerPointers: js.UndefOr[js.Function1[/* e */ DrawMarkerPointersEventArgs, Unit]] = js.native
  /** Triggers while the range are being drawn on the gauge.
    */
  var drawRange: js.UndefOr[js.Function1[/* e */ DrawRangeEventArgs, Unit]] = js.native
  /** Triggers while the ticks are being drawn on the gauge.
    */
  var drawTicks: js.UndefOr[js.Function1[/* e */ DrawTicksEventArgs, Unit]] = js.native
  /** Specifies the animate state
    * @Default {true}
    */
  var enableAnimation: js.UndefOr[Boolean] = js.native
  /** Used to Convert the date object to  string while using the  locale settings
    * @Default {false}
    */
  var enableGroupSeparator: js.UndefOr[Boolean] = js.native
  /** Specifies the animate state for marker pointer
    * @Default {true}
    */
  var enableMarkerPointerAnimation: js.UndefOr[Boolean] = js.native
  /** Responsiveness of the linear gauge is controlled
    * @Default {false}
    */
  var enableResize: js.UndefOr[Boolean] = js.native
  /** This provides options for customizing export settings
    */
  var exportSettings: js.UndefOr[ExportSettings] = js.native
  /** Specify frame of linear gauge
    * @Default {null}
    */
  var frame: js.UndefOr[Frame] = js.native
  /** Specifies the height of Linear gauge.
    * @Default {400}
    */
  var height: js.UndefOr[Double] = js.native
  /** Triggers when the gauge is initialized.
    */
  var init: js.UndefOr[js.Function1[/* e */ InitEventArgs, Unit]] = js.native
  /** Specifies the can resize state.
    * @Default {false}
    */
  var isResponsive: js.UndefOr[Boolean] = js.native
  /** Specifies the labelColor for Linear gauge.
    * @Default {null}
    */
  var labelColor: js.UndefOr[String] = js.native
  /** Triggers while the gauge start to Load.
    */
  var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, Unit]] = js.native
  /** Set the  localization culture  for the Linear gauge
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.native
  /** Specifies the maximum value of Linear gauge.
    * @Default {100}
    */
  var maximum: js.UndefOr[Double] = js.native
  /** Specifies the minimum value of Linear gauge.
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
  /** Specifies the orientation for Linear gauge.
    * @Default {Vertical}
    */
  var orientation: js.UndefOr[String] = js.native
  /** Specify labelPosition value of Linear gauge See
    * @Default {bottom}
    */
  var outerCustomLabelPosition: js.UndefOr[OuterCustomLabelPosition | String] = js.native
  /** Specifies the pointerGradient1 for Linear gauge.
    * @Default {null}
    */
  var pointerGradient1: js.UndefOr[js.Any] = js.native
  /** Specifies the pointerGradient2 for Linear gauge.
    * @Default {null}
    */
  var pointerGradient2: js.UndefOr[js.Any] = js.native
  /** Specifies the read only state.
    * @Default {true}
    */
  var readOnly: js.UndefOr[Boolean] = js.native
  /** Triggers while the rendering of the gauge completed.
    */
  var renderComplete: js.UndefOr[js.Function1[/* e */ RenderCompleteEventArgs, Unit]] = js.native
  /** Fires, on right clicking the gauge.
    */
  var rightClick: js.UndefOr[js.Function1[/* e */ RightClickEventArgs, Unit]] = js.native
  /** Specifies the scales
    * @Default {null}
    */
  var scales: js.UndefOr[js.Array[Scale]] = js.native
  /** Specifies the theme for Linear gauge. See LinearGauge.Themes
    * @Default {flatlight}
    */
  var theme: js.UndefOr[Themes | String] = js.native
  /** Specifies the tick Color for Linear gauge.
    * @Default {null}
    */
  var tickColor: js.UndefOr[String] = js.native
  /** Specify tooltip options of linear gauge
    * @Default {false}
    */
  var tooltip: js.UndefOr[Tooltip] = js.native
  /** Specifies the value of the Gauge.
    * @Default {0}
    */
  var value: js.UndefOr[Double] = js.native
  /** Specifies the width of Linear gauge.
    * @Default {150}
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
    def withBorderColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(js.undefined)
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
    def withDrawBarPointers(value: /* e */ DrawBarPointersEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawBarPointers")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDrawBarPointers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawBarPointers")(js.undefined)
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
    def withDrawMarkerPointers(value: /* e */ DrawMarkerPointersEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawMarkerPointers")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDrawMarkerPointers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawMarkerPointers")(js.undefined)
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
    def withEnableMarkerPointerAnimation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableMarkerPointerAnimation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableMarkerPointerAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableMarkerPointerAnimation")(js.undefined)
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
    def withInit(value: /* e */ InitEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutInit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.undefined)
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
    def withLabelColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelColor")(js.undefined)
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
    def withOrientation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(js.undefined)
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
    def withPointerGradient1(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointerGradient1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointerGradient1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointerGradient1")(js.undefined)
        ret
    }
    @scala.inline
    def withPointerGradient2(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointerGradient2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointerGradient2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointerGradient2")(js.undefined)
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
    def withTheme(value: Themes | String): Self = {
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
    def withTickColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTickColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickColor")(js.undefined)
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

