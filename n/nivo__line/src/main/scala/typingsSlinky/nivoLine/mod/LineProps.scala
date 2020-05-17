package typingsSlinky.nivoLine.mod

import slinky.core.ReactComponentClass
import slinky.core.TagMod
import typingsSlinky.nivoAxes.mod.AxisProps
import typingsSlinky.nivoColors.mod.OrdinalColorsInstruction
import typingsSlinky.nivoCore.mod.Box
import typingsSlinky.nivoCore.mod.CartesianMarkerProps
import typingsSlinky.nivoCore.mod.Theme
import typingsSlinky.nivoLegends.mod.LegendProps
import typingsSlinky.nivoLine.nivoLineBooleans.`false`
import typingsSlinky.nivoLine.nivoLineStrings.linear
import typingsSlinky.nivoLine.nivoLineStrings.monotoneX
import typingsSlinky.nivoLine.nivoLineStrings.monotoneY
import typingsSlinky.nivoLine.nivoLineStrings.natural
import typingsSlinky.nivoLine.nivoLineStrings.step
import typingsSlinky.nivoLine.nivoLineStrings.stepAfter
import typingsSlinky.nivoLine.nivoLineStrings.stepBefore
import typingsSlinky.nivoLine.nivoLineStrings.x
import typingsSlinky.nivoLine.nivoLineStrings.y
import typingsSlinky.nivoScales.mod.Scale
import typingsSlinky.nivoTooltip.mod.CrosshairType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineProps extends js.Object {
  var areaBaselineValue: js.UndefOr[LineValue] = js.native
  var areaOpacity: js.UndefOr[Double] = js.native
  var axisBottom: js.UndefOr[AxisProps | Null] = js.native
  var axisLeft: js.UndefOr[AxisProps | Null] = js.native
  var axisRight: js.UndefOr[AxisProps | Null] = js.native
  var axisTop: js.UndefOr[AxisProps | Null] = js.native
  var colors: js.UndefOr[OrdinalColorsInstruction[_]] = js.native
  var crosshairType: js.UndefOr[CrosshairType] = js.native
  var curve: js.UndefOr[linear | monotoneX | monotoneY | natural | stepBefore | step | stepAfter] = js.native
  var data: js.Array[LineSerieData] = js.native
  var debugMesh: js.UndefOr[Boolean] = js.native
  var debugSlices: js.UndefOr[Boolean] = js.native
  var enableArea: js.UndefOr[Boolean] = js.native
  var enableCrosshair: js.UndefOr[Boolean] = js.native
  var enableGridX: js.UndefOr[Boolean] = js.native
  var enableGridY: js.UndefOr[Boolean] = js.native
  var enablePoints: js.UndefOr[Boolean] = js.native
  var enableSlices: js.UndefOr[x | y | `false`] = js.native
  var isInteractive: js.UndefOr[Boolean] = js.native
  var layers: js.UndefOr[js.Array[Layer]] = js.native
  var legends: js.UndefOr[js.Array[LegendProps]] = js.native
  var lineWidth: js.UndefOr[Double] = js.native
  var margin: js.UndefOr[Box] = js.native
  var markers: js.UndefOr[js.Array[CartesianMarkerProps]] = js.native
  var pointBorderColor: js.UndefOr[js.Any] = js.native
  var pointBorderWidth: js.UndefOr[Double] = js.native
  var pointColor: js.UndefOr[js.Any] = js.native
  var pointSize: js.UndefOr[Double] = js.native
  var sliceTooltip: js.UndefOr[js.Function1[/* data */ LineSliceData, TagMod[Any]]] = js.native
  var theme: js.UndefOr[Theme] = js.native
  var tooltip: js.UndefOr[ReactComponentClass[LineTooltipProps]] = js.native
  var tooltipFormat: js.UndefOr[TooltipFormatter | String] = js.native
  var xFormat: js.UndefOr[String | DataFormatter] = js.native
  var xScale: js.UndefOr[Scale] = js.native
  var yFormat: js.UndefOr[String | DataFormatter] = js.native
  var yScale: js.UndefOr[Scale] = js.native
}

object LineProps {
  @scala.inline
  def apply(data: js.Array[LineSerieData]): LineProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineProps]
  }
  @scala.inline
  implicit class LinePropsOps[Self <: LineProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: js.Array[LineSerieData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAreaBaselineValueDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("areaBaselineValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAreaBaselineValue(value: LineValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("areaBaselineValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAreaBaselineValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("areaBaselineValue")(js.undefined)
        ret
    }
    @scala.inline
    def withAreaOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("areaOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAreaOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("areaOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withAxisBottom(value: AxisProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxisBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisBottom")(js.undefined)
        ret
    }
    @scala.inline
    def withAxisBottomNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisBottom")(null)
        ret
    }
    @scala.inline
    def withAxisLeft(value: AxisProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxisLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withAxisLeftNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisLeft")(null)
        ret
    }
    @scala.inline
    def withAxisRight(value: AxisProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxisRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisRight")(js.undefined)
        ret
    }
    @scala.inline
    def withAxisRightNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisRight")(null)
        ret
    }
    @scala.inline
    def withAxisTop(value: AxisProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxisTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisTop")(js.undefined)
        ret
    }
    @scala.inline
    def withAxisTopNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisTop")(null)
        ret
    }
    @scala.inline
    def withColorsFunction1(value: _ => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withColors(value: OrdinalColorsInstruction[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(js.undefined)
        ret
    }
    @scala.inline
    def withCrosshairType(value: CrosshairType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crosshairType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrosshairType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crosshairType")(js.undefined)
        ret
    }
    @scala.inline
    def withCurve(value: linear | monotoneX | monotoneY | natural | stepBefore | step | stepAfter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("curve")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurve: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("curve")(js.undefined)
        ret
    }
    @scala.inline
    def withDebugMesh(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugMesh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebugMesh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugMesh")(js.undefined)
        ret
    }
    @scala.inline
    def withDebugSlices(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugSlices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebugSlices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugSlices")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableArea(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableArea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableArea: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableArea")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableCrosshair(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCrosshair")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableCrosshair: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCrosshair")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableGridX(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableGridX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableGridX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableGridX")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableGridY(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableGridY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableGridY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableGridY")(js.undefined)
        ret
    }
    @scala.inline
    def withEnablePoints(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnablePoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePoints")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableSlices(value: typingsSlinky.nivoLine.nivoLineStrings.x | y | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSlices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableSlices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSlices")(js.undefined)
        ret
    }
    @scala.inline
    def withIsInteractive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInteractive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsInteractive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInteractive")(js.undefined)
        ret
    }
    @scala.inline
    def withLayers(value: js.Array[Layer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layers")(js.undefined)
        ret
    }
    @scala.inline
    def withLegends(value: js.Array[LegendProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legends")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegends: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legends")(js.undefined)
        ret
    }
    @scala.inline
    def withLineWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMargin(value: Box): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkers(value: js.Array[CartesianMarkerProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markers")(js.undefined)
        ret
    }
    @scala.inline
    def withPointBorderColor(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointBorderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointBorderColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointBorderColor")(js.undefined)
        ret
    }
    @scala.inline
    def withPointBorderWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointBorderWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointBorderWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointBorderWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withPointColor(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointColor")(js.undefined)
        ret
    }
    @scala.inline
    def withPointSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointSize")(js.undefined)
        ret
    }
    @scala.inline
    def withSliceTooltip(value: /* data */ LineSliceData => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sliceTooltip")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSliceTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sliceTooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: Theme): Self = {
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
    def withTooltip(value: ReactComponentClass[LineTooltipProps]): Self = {
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
    def withTooltipFormatFunction1(value: /* value */ LineValue => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipFormat")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTooltipFormat(value: TooltipFormatter | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltipFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withXFormatFunction1(value: /* value */ LineValue => String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xFormat")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withXFormat(value: String | DataFormatter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withXScale(value: Scale): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xScale")(js.undefined)
        ret
    }
    @scala.inline
    def withYFormatFunction1(value: /* value */ LineValue => String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yFormat")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withYFormat(value: String | DataFormatter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withYScale(value: Scale): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yScale")(js.undefined)
        ret
    }
  }
  
}

