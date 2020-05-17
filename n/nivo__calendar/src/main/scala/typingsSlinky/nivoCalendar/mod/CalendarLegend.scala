package typingsSlinky.nivoCalendar.mod

import slinky.web.SyntheticMouseEvent
import typingsSlinky.nivoLegends.anon.Color
import typingsSlinky.nivoLegends.mod.Box
import typingsSlinky.nivoLegends.mod.LegendAnchor
import typingsSlinky.nivoLegends.mod.LegendDirection
import typingsSlinky.nivoLegends.mod.LegendEffect
import typingsSlinky.nivoLegends.mod.LegendItemDirection
import typingsSlinky.nivoLegends.mod.LegendMouseHandler
import typingsSlinky.nivoLegends.mod.LegendMouseHandlerData
import typingsSlinky.nivoLegends.mod.LegendSymbolShape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @nivo/legends.@nivo/legends.LegendProps & {  itemCount  :number} */
@js.native
trait CalendarLegend extends js.Object {
  var anchor: LegendAnchor = js.native
  var data: js.UndefOr[js.Array[Color]] = js.native
  var direction: LegendDirection = js.native
  var effects: js.UndefOr[js.Array[LegendEffect]] = js.native
  var itemBackground: js.UndefOr[String] = js.native
  var itemCount: Double = js.native
  var itemDirection: js.UndefOr[LegendItemDirection] = js.native
  var itemHeight: Double = js.native
  var itemOpacity: js.UndefOr[Double] = js.native
  var itemTextColor: js.UndefOr[String] = js.native
  var itemWidth: Double = js.native
  var itemsSpacing: js.UndefOr[Double] = js.native
  var justify: js.UndefOr[Boolean] = js.native
  var onClick: js.UndefOr[LegendMouseHandler] = js.native
  var onMouseEnter: js.UndefOr[LegendMouseHandler] = js.native
  var onMouseLeave: js.UndefOr[LegendMouseHandler] = js.native
  var padding: js.UndefOr[Double | Box] = js.native
  var symbolBorderColor: js.UndefOr[String] = js.native
  var symbolShape: js.UndefOr[LegendSymbolShape | js.Any] = js.native
  var symbolSize: js.UndefOr[Double] = js.native
  var symbolSpacing: js.UndefOr[Double] = js.native
  var textColor: js.UndefOr[String] = js.native
  var translateX: js.UndefOr[Double] = js.native
  var translateY: js.UndefOr[Double] = js.native
}

object CalendarLegend {
  @scala.inline
  def apply(
    anchor: LegendAnchor,
    direction: LegendDirection,
    itemCount: Double,
    itemHeight: Double,
    itemWidth: Double
  ): CalendarLegend = {
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], itemCount = itemCount.asInstanceOf[js.Any], itemHeight = itemHeight.asInstanceOf[js.Any], itemWidth = itemWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarLegend]
  }
  @scala.inline
  implicit class CalendarLegendOps[Self <: CalendarLegend] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnchor(value: LegendAnchor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirection(value: LegendDirection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: js.Array[Color]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withEffects(value: js.Array[LegendEffect]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEffects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effects")(js.undefined)
        ret
    }
    @scala.inline
    def withItemBackground(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemBackground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemBackground")(js.undefined)
        ret
    }
    @scala.inline
    def withItemDirection(value: LegendItemDirection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemDirection")(js.undefined)
        ret
    }
    @scala.inline
    def withItemOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withItemTextColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemTextColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemTextColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemTextColor")(js.undefined)
        ret
    }
    @scala.inline
    def withItemsSpacing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemsSpacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemsSpacing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemsSpacing")(js.undefined)
        ret
    }
    @scala.inline
    def withJustify(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("justify")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJustify: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("justify")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClick(value: (/* data */ LegendMouseHandlerData, /* event */ SyntheticMouseEvent[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseEnter(value: (/* data */ LegendMouseHandlerData, /* event */ SyntheticMouseEvent[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseEnter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnMouseEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseLeave(value: (/* data */ LegendMouseHandlerData, /* event */ SyntheticMouseEvent[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseLeave")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnMouseLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withPadding(value: Double | Box): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(js.undefined)
        ret
    }
    @scala.inline
    def withSymbolBorderColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolBorderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSymbolBorderColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolBorderColor")(js.undefined)
        ret
    }
    @scala.inline
    def withSymbolShape(value: LegendSymbolShape | js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolShape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSymbolShape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolShape")(js.undefined)
        ret
    }
    @scala.inline
    def withSymbolSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSymbolSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolSize")(js.undefined)
        ret
    }
    @scala.inline
    def withSymbolSpacing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolSpacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSymbolSpacing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolSpacing")(js.undefined)
        ret
    }
    @scala.inline
    def withTextColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textColor")(js.undefined)
        ret
    }
    @scala.inline
    def withTranslateX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translateX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTranslateX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translateX")(js.undefined)
        ret
    }
    @scala.inline
    def withTranslateY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translateY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTranslateY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translateY")(js.undefined)
        ret
    }
  }
  
}

