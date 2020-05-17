package typingsSlinky.nivoStream.mod

import slinky.core.TagMod
import typingsSlinky.nivoAxes.mod.AxisProps
import typingsSlinky.nivoColors.mod.InheritedColorProp
import typingsSlinky.nivoColors.mod.OrdinalColorsInstruction
import typingsSlinky.nivoCore.anon.Dictkey
import typingsSlinky.nivoCore.anon.Id
import typingsSlinky.nivoCore.mod.AreaCurve
import typingsSlinky.nivoCore.mod.Box
import typingsSlinky.nivoCore.mod.StackOffset
import typingsSlinky.nivoCore.mod.StackOrder
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

/* Inlined parent std.Partial<@nivo/stream.@nivo/stream.OptionalStreamProps<T>> */
@js.native
trait StreamProps[T] extends js.Object {
  var animate: js.UndefOr[Boolean] = js.native
  var axisBottom: js.UndefOr[AxisProps] = js.native
  var axisLeft: js.UndefOr[AxisProps] = js.native
  var axisRight: js.UndefOr[AxisProps] = js.native
  var axisTop: js.UndefOr[AxisProps] = js.native
  var borderColor: js.UndefOr[InheritedColorProp[_]] = js.native
  var borderWidth: js.UndefOr[Double] = js.native
  var colors: js.UndefOr[OrdinalColorsInstruction[_]] = js.native
  var curve: js.UndefOr[AreaCurve] = js.native
  var data: js.Array[T] = js.native
  var defs: js.UndefOr[js.Array[Dictkey]] = js.native
  var dotBorderColor: js.UndefOr[InheritedColorProp[_]] = js.native
  var dotBorderWidth: js.UndefOr[DatumToNumber | Double] = js.native
  var dotColor: js.UndefOr[InheritedColorProp[_]] = js.native
  var dotPosition: js.UndefOr[start | center | end] = js.native
  var dotSize: js.UndefOr[DatumToNumber | Double] = js.native
  var enableDots: js.UndefOr[Boolean] = js.native
  var enableGridX: js.UndefOr[Boolean] = js.native
  var enableGridY: js.UndefOr[Boolean] = js.native
  var enableStackTooltip: js.UndefOr[Boolean] = js.native
  var fill: js.UndefOr[js.Array[Id[T]]] = js.native
  var fillOpacity: js.UndefOr[Double] = js.native
  var isInteractive: js.UndefOr[Boolean] = js.native
  var keys: js.Array[String] = js.native
  var legends: js.UndefOr[js.Array[LegendProps]] = js.native
  var margin: js.UndefOr[Box] = js.native
  var motionDamping: js.UndefOr[Double] = js.native
  var motionStiffness: js.UndefOr[Double] = js.native
  var offsetType: js.UndefOr[StackOffset] = js.native
  var order: js.UndefOr[StackOrder] = js.native
  var renderDot: js.UndefOr[StreamDotsItem] = js.native
  var stack: js.UndefOr[StackFunc[T]] = js.native
  var theme: js.UndefOr[Theme] = js.native
  var tooltipFormat: js.UndefOr[TooltipFormatter[T] | String] = js.native
  var tooltipLabel: js.UndefOr[TooltipLabel[T]] = js.native
  var xScale: js.UndefOr[Scale] = js.native
  var yScale: js.UndefOr[Scale] = js.native
}

object StreamProps {
  @scala.inline
  def apply[T](data: js.Array[T], keys: js.Array[String]): StreamProps[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamProps[T]]
  }
  @scala.inline
  implicit class StreamPropsOps[Self[t] <: StreamProps[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withData(value: js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeys(value: js.Array[String]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnimate(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimate: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animate")(js.undefined)
        ret
    }
    @scala.inline
    def withAxisBottom(value: AxisProps): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxisBottom: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisBottom")(js.undefined)
        ret
    }
    @scala.inline
    def withAxisLeft(value: AxisProps): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxisLeft: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withAxisRight(value: AxisProps): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxisRight: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisRight")(js.undefined)
        ret
    }
    @scala.inline
    def withAxisTop(value: AxisProps): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxisTop: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisTop")(js.undefined)
        ret
    }
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
    def withoutBorderColor: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderWidth(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderWidth: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderWidth")(js.undefined)
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
    def withoutColors: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(js.undefined)
        ret
    }
    @scala.inline
    def withCurve(value: AreaCurve): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("curve")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurve: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("curve")(js.undefined)
        ret
    }
    @scala.inline
    def withDefs(value: js.Array[Dictkey]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefs: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defs")(js.undefined)
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
    def withoutDotBorderColor: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotBorderColor")(js.undefined)
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
    def withoutDotBorderWidth: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotBorderWidth")(js.undefined)
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
    def withoutDotColor: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotColor")(js.undefined)
        ret
    }
    @scala.inline
    def withDotPosition(value: start | center | end): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDotPosition: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotPosition")(js.undefined)
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
    def withoutDotSize: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotSize")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableDots(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableDots")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableDots: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableDots")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableGridX(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableGridX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableGridX: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableGridX")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableGridY(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableGridY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableGridY: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableGridY")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableStackTooltip(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableStackTooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableStackTooltip: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableStackTooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withFill(value: js.Array[Id[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFill: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(js.undefined)
        ret
    }
    @scala.inline
    def withFillOpacity(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFillOpacity: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withIsInteractive(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInteractive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsInteractive: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInteractive")(js.undefined)
        ret
    }
    @scala.inline
    def withLegends(value: js.Array[LegendProps]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legends")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegends: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legends")(js.undefined)
        ret
    }
    @scala.inline
    def withMargin(value: Box): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMargin: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(js.undefined)
        ret
    }
    @scala.inline
    def withMotionDamping(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("motionDamping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMotionDamping: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("motionDamping")(js.undefined)
        ret
    }
    @scala.inline
    def withMotionStiffness(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("motionStiffness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMotionStiffness: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("motionStiffness")(js.undefined)
        ret
    }
    @scala.inline
    def withOffsetType(value: StackOffset): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffsetType: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetType")(js.undefined)
        ret
    }
    @scala.inline
    def withOrder(value: StackOrder): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrder: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderDot(value: StreamDotsItem): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderDot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderDot: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderDot")(js.undefined)
        ret
    }
    @scala.inline
    def withStack(value: /* data */ js.Array[T] => js.Array[js.Array[`0`[T]]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stack")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutStack: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stack")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: Theme): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
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
    def withoutTooltipFormat: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipLabel(value: T => String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipLabel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTooltipLabel: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withXScale(value: Scale): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXScale: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xScale")(js.undefined)
        ret
    }
    @scala.inline
    def withYScale(value: Scale): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYScale: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yScale")(js.undefined)
        ret
    }
  }
  
}

