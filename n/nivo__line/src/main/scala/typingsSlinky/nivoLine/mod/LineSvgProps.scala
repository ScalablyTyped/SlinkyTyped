package typingsSlinky.nivoLine.mod

import slinky.core.ReactComponentClass
import slinky.core.TagMod
import typingsSlinky.nivoAxes.mod.AxisProps
import typingsSlinky.nivoColors.mod.OrdinalColorsInstruction
import typingsSlinky.nivoCore.mod.Box
import typingsSlinky.nivoCore.mod.CartesianMarkerProps
import typingsSlinky.nivoCore.mod.MotionProps
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

trait LineSvgProps
  extends LineProps
     with MotionProps {
  var areaBlendMode: js.UndefOr[String] = js.undefined
  var enablePointLabel: js.UndefOr[Boolean] = js.undefined
  var pointLabel: js.UndefOr[String] = js.undefined
  var pointLabelYOffset: js.UndefOr[Double] = js.undefined
  var useMesh: js.UndefOr[Boolean] = js.undefined
}

object LineSvgProps {
  @scala.inline
  def apply(
    data: js.Array[LineSerieData],
    animate: js.UndefOr[Boolean] = js.undefined,
    areaBaselineValue: LineValue = null,
    areaBlendMode: String = null,
    areaOpacity: js.UndefOr[Double] = js.undefined,
    axisBottom: js.UndefOr[Null | AxisProps] = js.undefined,
    axisLeft: js.UndefOr[Null | AxisProps] = js.undefined,
    axisRight: js.UndefOr[Null | AxisProps] = js.undefined,
    axisTop: js.UndefOr[Null | AxisProps] = js.undefined,
    colors: OrdinalColorsInstruction[_] = null,
    crosshairType: CrosshairType = null,
    curve: linear | monotoneX | monotoneY | natural | stepBefore | step | stepAfter = null,
    debugMesh: js.UndefOr[Boolean] = js.undefined,
    debugSlices: js.UndefOr[Boolean] = js.undefined,
    enableArea: js.UndefOr[Boolean] = js.undefined,
    enableCrosshair: js.UndefOr[Boolean] = js.undefined,
    enableGridX: js.UndefOr[Boolean] = js.undefined,
    enableGridY: js.UndefOr[Boolean] = js.undefined,
    enablePointLabel: js.UndefOr[Boolean] = js.undefined,
    enablePoints: js.UndefOr[Boolean] = js.undefined,
    enableSlices: x | y | `false` = null,
    isInteractive: js.UndefOr[Boolean] = js.undefined,
    layers: js.Array[Layer] = null,
    legends: js.Array[LegendProps] = null,
    lineWidth: js.UndefOr[Double] = js.undefined,
    margin: Box = null,
    markers: js.Array[CartesianMarkerProps] = null,
    motionDamping: js.UndefOr[Double] = js.undefined,
    motionStiffness: js.UndefOr[Double] = js.undefined,
    pointBorderColor: js.Any = null,
    pointBorderWidth: js.UndefOr[Double] = js.undefined,
    pointColor: js.Any = null,
    pointLabel: String = null,
    pointLabelYOffset: js.UndefOr[Double] = js.undefined,
    pointSize: js.UndefOr[Double] = js.undefined,
    sliceTooltip: /* data */ LineSliceData => TagMod[Any] = null,
    theme: Theme = null,
    tooltip: ReactComponentClass[LineTooltipProps] = null,
    tooltipFormat: TooltipFormatter | String = null,
    useMesh: js.UndefOr[Boolean] = js.undefined,
    xFormat: String | DataFormatter = null,
    xScale: Scale = null,
    yFormat: String | DataFormatter = null,
    yScale: Scale = null
  ): LineSvgProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.get.asInstanceOf[js.Any])
    if (areaBaselineValue != null) __obj.updateDynamic("areaBaselineValue")(areaBaselineValue.asInstanceOf[js.Any])
    if (areaBlendMode != null) __obj.updateDynamic("areaBlendMode")(areaBlendMode.asInstanceOf[js.Any])
    if (!js.isUndefined(areaOpacity)) __obj.updateDynamic("areaOpacity")(areaOpacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(axisBottom)) __obj.updateDynamic("axisBottom")(axisBottom.asInstanceOf[js.Any])
    if (!js.isUndefined(axisLeft)) __obj.updateDynamic("axisLeft")(axisLeft.asInstanceOf[js.Any])
    if (!js.isUndefined(axisRight)) __obj.updateDynamic("axisRight")(axisRight.asInstanceOf[js.Any])
    if (!js.isUndefined(axisTop)) __obj.updateDynamic("axisTop")(axisTop.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (crosshairType != null) __obj.updateDynamic("crosshairType")(crosshairType.asInstanceOf[js.Any])
    if (curve != null) __obj.updateDynamic("curve")(curve.asInstanceOf[js.Any])
    if (!js.isUndefined(debugMesh)) __obj.updateDynamic("debugMesh")(debugMesh.get.asInstanceOf[js.Any])
    if (!js.isUndefined(debugSlices)) __obj.updateDynamic("debugSlices")(debugSlices.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableArea)) __obj.updateDynamic("enableArea")(enableArea.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableCrosshair)) __obj.updateDynamic("enableCrosshair")(enableCrosshair.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableGridX)) __obj.updateDynamic("enableGridX")(enableGridX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableGridY)) __obj.updateDynamic("enableGridY")(enableGridY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enablePointLabel)) __obj.updateDynamic("enablePointLabel")(enablePointLabel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enablePoints)) __obj.updateDynamic("enablePoints")(enablePoints.get.asInstanceOf[js.Any])
    if (enableSlices != null) __obj.updateDynamic("enableSlices")(enableSlices.asInstanceOf[js.Any])
    if (!js.isUndefined(isInteractive)) __obj.updateDynamic("isInteractive")(isInteractive.get.asInstanceOf[js.Any])
    if (layers != null) __obj.updateDynamic("layers")(layers.asInstanceOf[js.Any])
    if (legends != null) __obj.updateDynamic("legends")(legends.asInstanceOf[js.Any])
    if (!js.isUndefined(lineWidth)) __obj.updateDynamic("lineWidth")(lineWidth.get.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (markers != null) __obj.updateDynamic("markers")(markers.asInstanceOf[js.Any])
    if (!js.isUndefined(motionDamping)) __obj.updateDynamic("motionDamping")(motionDamping.get.asInstanceOf[js.Any])
    if (!js.isUndefined(motionStiffness)) __obj.updateDynamic("motionStiffness")(motionStiffness.get.asInstanceOf[js.Any])
    if (pointBorderColor != null) __obj.updateDynamic("pointBorderColor")(pointBorderColor.asInstanceOf[js.Any])
    if (!js.isUndefined(pointBorderWidth)) __obj.updateDynamic("pointBorderWidth")(pointBorderWidth.get.asInstanceOf[js.Any])
    if (pointColor != null) __obj.updateDynamic("pointColor")(pointColor.asInstanceOf[js.Any])
    if (pointLabel != null) __obj.updateDynamic("pointLabel")(pointLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(pointLabelYOffset)) __obj.updateDynamic("pointLabelYOffset")(pointLabelYOffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pointSize)) __obj.updateDynamic("pointSize")(pointSize.get.asInstanceOf[js.Any])
    if (sliceTooltip != null) __obj.updateDynamic("sliceTooltip")(js.Any.fromFunction1(sliceTooltip))
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (tooltipFormat != null) __obj.updateDynamic("tooltipFormat")(tooltipFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(useMesh)) __obj.updateDynamic("useMesh")(useMesh.get.asInstanceOf[js.Any])
    if (xFormat != null) __obj.updateDynamic("xFormat")(xFormat.asInstanceOf[js.Any])
    if (xScale != null) __obj.updateDynamic("xScale")(xScale.asInstanceOf[js.Any])
    if (yFormat != null) __obj.updateDynamic("yFormat")(yFormat.asInstanceOf[js.Any])
    if (yScale != null) __obj.updateDynamic("yScale")(yScale.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineSvgProps]
  }
}

