package typingsSlinky.nivoWaffle.mod

import org.scalajs.dom.raw.HTMLCanvasElement
import slinky.core.ReactComponentClass
import slinky.web.SyntheticMouseEvent
import typingsSlinky.nivoColors.mod.InheritedColorProp
import typingsSlinky.nivoCore.mod.Box
import typingsSlinky.nivoCore.mod.Colors
import typingsSlinky.nivoCore.mod.GetColor
import typingsSlinky.nivoCore.mod.Theme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @nivo/waffle.@nivo/waffle.WaffleBaseProps & @nivo/waffle.@nivo/waffle.WaffleCommonProps & std.Partial<{  pixelRatio  :number}> */
@js.native
trait WaffleCanvasProps extends js.Object {
  var borderColor: js.UndefOr[InheritedColorProp[WaffleDatum]] = js.native
  var borderWidth: js.UndefOr[Double] = js.native
  var colorBy: js.UndefOr[String | GetColor[WaffleDatum]] = js.native
  var colors: js.UndefOr[Colors] = js.native
  var columns: Double = js.native
  var data: js.Array[js.Object] = js.native
  var emptyColor: js.UndefOr[String] = js.native
  var emptyOpacity: js.UndefOr[Double] = js.native
  var enableLabels: js.UndefOr[Boolean] = js.native
  var fillDirection: js.UndefOr[WaffleFillDirection] = js.native
  var isInteractive: js.UndefOr[Boolean] = js.native
  var margin: js.UndefOr[Box] = js.native
  var onClick: js.UndefOr[
    js.Function2[/* datum */ WaffleDatum, /* event */ SyntheticMouseEvent[HTMLCanvasElement], Unit]
  ] = js.native
  var padding: js.UndefOr[Double] = js.native
  var pixelRatio: js.UndefOr[Double] = js.native
  var rows: Double = js.native
  var theme: js.UndefOr[Theme] = js.native
  var tooltip: js.UndefOr[ReactComponentClass[WaffleTooltipData]] = js.native
  var tooltipFormat: js.UndefOr[String | ValueFormatter] = js.native
  var total: Double = js.native
}

object WaffleCanvasProps {
  @scala.inline
  def apply(columns: Double, data: js.Array[js.Object], rows: Double, total: Double): WaffleCanvasProps = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[WaffleCanvasProps]
  }
  @scala.inline
  implicit class WaffleCanvasPropsOps[Self <: WaffleCanvasProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumns(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: js.Array[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRows(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBorderColorFunction1(value: WaffleDatum => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBorderColor(value: InheritedColorProp[WaffleDatum]): Self = {
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
    def withBorderWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withColorByFunction1(value: WaffleDatum => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorBy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withColorBy(value: String | GetColor[WaffleDatum]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorBy")(js.undefined)
        ret
    }
    @scala.inline
    def withColors(value: Colors): Self = {
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
    def withEmptyColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmptyColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyColor")(js.undefined)
        ret
    }
    @scala.inline
    def withEmptyOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmptyOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableLabels(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableLabels")(js.undefined)
        ret
    }
    @scala.inline
    def withFillDirection(value: WaffleFillDirection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFillDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillDirection")(js.undefined)
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
    def withOnClick(value: (/* datum */ WaffleDatum, /* event */ SyntheticMouseEvent[HTMLCanvasElement]) => Unit): Self = {
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
    def withPadding(value: Double): Self = {
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
    def withPixelRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPixelRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelRatio")(js.undefined)
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
    def withTooltip(value: ReactComponentClass[WaffleTooltipData]): Self = {
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
    def withTooltipFormatFunction1(value: /* value */ Double => String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipFormat")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTooltipFormat(value: String | ValueFormatter): Self = {
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
  }
  
}

