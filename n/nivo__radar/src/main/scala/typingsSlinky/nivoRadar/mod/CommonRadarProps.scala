package typingsSlinky.nivoRadar.mod

import slinky.core.TagMod
import typingsSlinky.nivoColors.mod.InheritedColorProp
import typingsSlinky.nivoColors.mod.OrdinalColorsInstruction
import typingsSlinky.nivoCore.mod.Box
import typingsSlinky.nivoCore.mod.CssMixBlendMode
import typingsSlinky.nivoLegends.mod.LegendProps
import typingsSlinky.nivoRadar.nivoRadarStrings.auto
import typingsSlinky.nivoRadar.nivoRadarStrings.circular
import typingsSlinky.nivoRadar.nivoRadarStrings.linear
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommonRadarProps[Datum] extends js.Object {
  var blendMode: js.UndefOr[CssMixBlendMode] = js.native
  var borderColor: js.UndefOr[InheritedColorProp[_]] = js.native
  var borderWidth: js.UndefOr[Double] = js.native
  var colors: js.UndefOr[OrdinalColorsInstruction[_]] = js.native
  var curve: js.UndefOr[String] = js.native
  var data: js.Array[js.Object] = js.native
  var dotBorderColor: js.UndefOr[InheritedColorProp[_]] = js.native
  var dotBorderWidth: js.UndefOr[Double] = js.native
  var dotColor: js.UndefOr[InheritedColorProp[_]] = js.native
  var dotLabel: js.UndefOr[String | CustomDotLabel] = js.native
  var dotLabelFormat: js.UndefOr[String | CustomFormatter] = js.native
  var dotLabelYOffset: js.UndefOr[Double] = js.native
  var dotSize: js.UndefOr[Double] = js.native
  var dotSymbol: js.UndefOr[CustomDotSymbol] = js.native
  var enableDotLabel: js.UndefOr[Boolean] = js.native
  var enableDots: js.UndefOr[Boolean] = js.native
  var fillOpacity: js.UndefOr[Double] = js.native
  var gridLabel: js.UndefOr[GridLabelCustomFunction] = js.native
  var gridLabelOffset: js.UndefOr[Double] = js.native
  var gridLevels: js.UndefOr[Double] = js.native
  var gridShape: js.UndefOr[circular | linear] = js.native
  var indexBy: Double | String | IndexByCustomFunctiono[Datum] = js.native
  var isInteractive: js.UndefOr[Boolean] = js.native
  var keys: js.Array[String | Double] = js.native
  var legends: js.Array[LegendProps] = js.native
  var margin: js.UndefOr[Box] = js.native
  var maxValue: js.UndefOr[auto | Double] = js.native
  var tooltipFormat: js.UndefOr[String | CustomFormatter] = js.native
}

object CommonRadarProps {
  @scala.inline
  def apply[Datum](
    data: js.Array[js.Object],
    indexBy: Double | String | IndexByCustomFunctiono[Datum],
    keys: js.Array[String | Double],
    legends: js.Array[LegendProps]
  ): CommonRadarProps[Datum] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], indexBy = indexBy.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], legends = legends.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonRadarProps[Datum]]
  }
  @scala.inline
  implicit class CommonRadarPropsOps[Self[datum] <: CommonRadarProps[datum], Datum] (val x: Self[Datum]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Datum] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Datum]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Datum] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Datum] with Other]
    @scala.inline
    def withData(value: js.Array[js.Object]): Self[Datum] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndexByFunction1(value: Datum => String | Double): Self[Datum] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexBy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIndexBy(value: Double | String | IndexByCustomFunctiono[Datum]): Self[Datum] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeys(value: js.Array[String | Double]): Self[Datum] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLegends(value: js.Array[LegendProps]): Self[Datum] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legends")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlendMode(value: CssMixBlendMode): Self[Datum] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blendMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlendMode: Self[Datum] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blendMode")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderColorFunction1(value: _ => String): Self[Datum] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBorderColor(value: InheritedColorProp[_]): Self[Datum] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderColor: Self[Datum] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderWidth(value: Double): Self[Datum] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderWidth: Self[Datum] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withColorsFunction1(value: _ => String): Self[Datum] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withColors(value: OrdinalColorsInstruction[_]): Self[Datum] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColors: Self[Datum] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(js.undefined)
        ret
    }
    @scala.inline
    def withCurve(value: String): Self[Datum] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("curve")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurve: Self[Datum] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("curve")(js.undefined)
        ret
    }
    @scala.inline
    def withDotBorderColorFunction1(value: _ => String): Self[Datum] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotBorderColor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDotBorderColor(value: InheritedColorProp[_]): Self[Datum] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotBorderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDotBorderColor: Self[Datum] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotBorderColor")(js.undefined)
        ret
    }
    @scala.inline
    def withDotBorderWidth(value: Double): Self[Datum] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotBorderWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDotBorderWidth: Self[Datum] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotBorderWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withDotColorFunction1(value: _ => String): Self[Datum] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotColor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDotColor(value: InheritedColorProp[_]): Self[Datum] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDotColor: Self[Datum] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotColor")(js.undefined)
        ret
    }
    @scala.inline
    def withDotLabelFunction1(value: /* repeated */ js.Any => TagMod[Any]): Self[Datum] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotLabel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDotLabel(value: String | CustomDotLabel): Self[Datum] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDotLabel: Self[Datum] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withDotLabelFormatFunction1(value: /* repeated */ js.Any => TagMod[Any]): Self[Datum] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotLabelFormat")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDotLabelFormat(value: String | CustomFormatter): Self[Datum] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotLabelFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDotLabelFormat: Self[Datum] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotLabelFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withDotLabelYOffset(value: Double): Self[Datum] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotLabelYOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDotLabelYOffset: Self[Datum] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotLabelYOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withDotSize(value: Double): Self[Datum] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDotSize: Self[Datum] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotSize")(js.undefined)
        ret
    }
    @scala.inline
    def withDotSymbol(value: /* repeated */ js.Any => TagMod[Any]): Self[Datum] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotSymbol")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDotSymbol: Self[Datum] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotSymbol")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableDotLabel(value: Boolean): Self[Datum] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableDotLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableDotLabel: Self[Datum] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableDotLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableDots(value: Boolean): Self[Datum] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableDots")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableDots: Self[Datum] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableDots")(js.undefined)
        ret
    }
    @scala.inline
    def withFillOpacity(value: Double): Self[Datum] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFillOpacity: Self[Datum] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withGridLabel(value: /* repeated */ js.Any => String): Self[Datum] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridLabel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGridLabel: Self[Datum] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withGridLabelOffset(value: Double): Self[Datum] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridLabelOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridLabelOffset: Self[Datum] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridLabelOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withGridLevels(value: Double): Self[Datum] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridLevels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridLevels: Self[Datum] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridLevels")(js.undefined)
        ret
    }
    @scala.inline
    def withGridShape(value: circular | linear): Self[Datum] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridShape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridShape: Self[Datum] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridShape")(js.undefined)
        ret
    }
    @scala.inline
    def withIsInteractive(value: Boolean): Self[Datum] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInteractive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsInteractive: Self[Datum] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInteractive")(js.undefined)
        ret
    }
    @scala.inline
    def withMargin(value: Box): Self[Datum] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMargin: Self[Datum] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxValue(value: auto | Double): Self[Datum] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxValue: Self[Datum] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxValue")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipFormatFunction1(value: /* repeated */ js.Any => TagMod[Any]): Self[Datum] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipFormat")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTooltipFormat(value: String | CustomFormatter): Self[Datum] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltipFormat: Self[Datum] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipFormat")(js.undefined)
        ret
    }
  }
  
}

