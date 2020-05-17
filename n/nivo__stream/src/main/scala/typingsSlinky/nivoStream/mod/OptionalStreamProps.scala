package typingsSlinky.nivoStream.mod

import slinky.core.TagMod
import typingsSlinky.nivoAxes.mod.AxisProps
import typingsSlinky.nivoColors.mod.InheritedColorProp
import typingsSlinky.nivoColors.mod.OrdinalColorsInstruction
import typingsSlinky.nivoCore.mod.AreaCurve
import typingsSlinky.nivoCore.mod.Box
import typingsSlinky.nivoCore.mod.MotionProps
import typingsSlinky.nivoCore.mod.StackOffset
import typingsSlinky.nivoCore.mod.StackOrder
import typingsSlinky.nivoCore.mod.SvgDefsAndFill
import typingsSlinky.nivoCore.mod.Theme
import typingsSlinky.nivoLegends.mod.LegendProps
import typingsSlinky.nivoScales.mod.Scale
import typingsSlinky.nivoStream.anon.`0`
import typingsSlinky.nivoStream.nivoStreamStrings.center
import typingsSlinky.nivoStream.nivoStreamStrings.end
import typingsSlinky.nivoStream.nivoStreamStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionalStreamProps[T]
  extends SvgDefsAndFill[T]
     with MotionProps {
  var axisBottom: AxisProps | Null = js.native
  var axisLeft: AxisProps | Null = js.native
  var axisRight: AxisProps | Null = js.native
  var axisTop: AxisProps | Null = js.native
  var borderColor: InheritedColorProp[_] = js.native
  var borderWidth: Double = js.native
  var colors: OrdinalColorsInstruction[_] = js.native
  var curve: AreaCurve = js.native
  var dotBorderColor: InheritedColorProp[_] = js.native
  var dotBorderWidth: DatumToNumber | Double = js.native
  var dotColor: InheritedColorProp[_] = js.native
  var dotPosition: start | center | end = js.native
  var dotSize: DatumToNumber | Double = js.native
  var enableDots: Boolean = js.native
  var enableGridX: Boolean = js.native
  var enableGridY: Boolean = js.native
  var enableStackTooltip: Boolean = js.native
  var fillOpacity: Double = js.native
  var isInteractive: Boolean = js.native
  var legends: js.Array[LegendProps] = js.native
  var margin: Box = js.native
  var offsetType: StackOffset = js.native
  var order: StackOrder = js.native
  var renderDot: StreamDotsItem = js.native
  var stack: StackFunc[T] = js.native
  var theme: Theme = js.native
  var tooltipFormat: TooltipFormatter[T] | String = js.native
  var tooltipLabel: TooltipLabel[T] = js.native
  var xScale: Scale = js.native
  var yScale: Scale = js.native
}

object OptionalStreamProps {
  @scala.inline
  def apply[T](
    borderColor: InheritedColorProp[_],
    borderWidth: Double,
    colors: OrdinalColorsInstruction[_],
    curve: AreaCurve,
    dotBorderColor: InheritedColorProp[_],
    dotBorderWidth: DatumToNumber | Double,
    dotColor: InheritedColorProp[_],
    dotPosition: start | center | end,
    dotSize: DatumToNumber | Double,
    enableDots: Boolean,
    enableGridX: Boolean,
    enableGridY: Boolean,
    enableStackTooltip: Boolean,
    fillOpacity: Double,
    isInteractive: Boolean,
    legends: js.Array[LegendProps],
    margin: Box,
    offsetType: StackOffset,
    order: StackOrder,
    renderDot: StreamDotsItem,
    stack: /* data */ js.Array[T] => js.Array[js.Array[`0`[T]]],
    theme: Theme,
    tooltipFormat: TooltipFormatter[T] | String,
    tooltipLabel: T => String,
    xScale: Scale,
    yScale: Scale
  ): OptionalStreamProps[T] = {
    val __obj = js.Dynamic.literal(borderColor = borderColor.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], curve = curve.asInstanceOf[js.Any], dotBorderColor = dotBorderColor.asInstanceOf[js.Any], dotBorderWidth = dotBorderWidth.asInstanceOf[js.Any], dotColor = dotColor.asInstanceOf[js.Any], dotPosition = dotPosition.asInstanceOf[js.Any], dotSize = dotSize.asInstanceOf[js.Any], enableDots = enableDots.asInstanceOf[js.Any], enableGridX = enableGridX.asInstanceOf[js.Any], enableGridY = enableGridY.asInstanceOf[js.Any], enableStackTooltip = enableStackTooltip.asInstanceOf[js.Any], fillOpacity = fillOpacity.asInstanceOf[js.Any], isInteractive = isInteractive.asInstanceOf[js.Any], legends = legends.asInstanceOf[js.Any], margin = margin.asInstanceOf[js.Any], offsetType = offsetType.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], renderDot = renderDot.asInstanceOf[js.Any], stack = js.Any.fromFunction1(stack), theme = theme.asInstanceOf[js.Any], tooltipFormat = tooltipFormat.asInstanceOf[js.Any], tooltipLabel = js.Any.fromFunction1(tooltipLabel), xScale = xScale.asInstanceOf[js.Any], yScale = yScale.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionalStreamProps[T]]
  }
  @scala.inline
  implicit class OptionalStreamPropsOps[Self[t] <: OptionalStreamProps[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withBorderColorFunction1(value: _ => String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBorderColor(value: InheritedColorProp[_]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBorderWidth(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColorsFunction1(value: _ => String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withColors(value: OrdinalColorsInstruction[_]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurve(value: AreaCurve): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("curve")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDotBorderColorFunction1(value: _ => String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotBorderColor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDotBorderColor(value: InheritedColorProp[_]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotBorderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDotBorderWidthFunction1(value: /* datum */ Datum => Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotBorderWidth")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDotBorderWidth(value: DatumToNumber | Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotBorderWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDotColorFunction1(value: _ => String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotColor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDotColor(value: InheritedColorProp[_]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDotPosition(value: start | center | end): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDotSizeFunction1(value: /* datum */ Datum => Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotSize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDotSize(value: DatumToNumber | Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnableDots(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableDots")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnableGridX(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableGridX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnableGridY(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableGridY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnableStackTooltip(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableStackTooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFillOpacity(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsInteractive(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInteractive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLegends(value: js.Array[LegendProps]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legends")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMargin(value: Box): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffsetType(value: StackOffset): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrder(value: StackOrder): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderDot(value: StreamDotsItem): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderDot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStack(value: /* data */ js.Array[T] => js.Array[js.Array[`0`[T]]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stack")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTheme(value: Theme): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTooltipFormatFunction1(value: T => TagMod[Any]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipFormat")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTooltipFormat(value: TooltipFormatter[T] | String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTooltipLabel(value: T => String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipLabel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withXScale(value: Scale): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYScale(value: Scale): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAxisBottom(value: AxisProps): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAxisBottomNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisBottom")(null)
        ret
    }
    @scala.inline
    def withAxisLeft(value: AxisProps): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAxisLeftNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisLeft")(null)
        ret
    }
    @scala.inline
    def withAxisRight(value: AxisProps): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAxisRightNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisRight")(null)
        ret
    }
    @scala.inline
    def withAxisTop(value: AxisProps): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAxisTopNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisTop")(null)
        ret
    }
  }
  
}

