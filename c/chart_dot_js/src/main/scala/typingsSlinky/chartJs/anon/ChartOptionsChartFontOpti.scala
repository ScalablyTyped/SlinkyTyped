package typingsSlinky.chartJs.anon

import org.scalajs.dom.raw.CanvasGradient
import org.scalajs.dom.raw.CanvasPattern
import org.scalajs.dom.raw.MouseEvent
import typingsSlinky.chartJs.mod.ChartAnimationOptions
import typingsSlinky.chartJs.mod.ChartColor
import typingsSlinky.chartJs.mod.ChartElementsOptions
import typingsSlinky.chartJs.mod.ChartHoverOptions
import typingsSlinky.chartJs.mod.ChartLayoutOptions
import typingsSlinky.chartJs.mod.ChartLegendOptions
import typingsSlinky.chartJs.mod.ChartPluginsOptions
import typingsSlinky.chartJs.mod.ChartScales
import typingsSlinky.chartJs.mod.ChartSize
import typingsSlinky.chartJs.mod.ChartTitleOptions
import typingsSlinky.chartJs.mod.ChartTooltipOptions
import typingsSlinky.chartJs.mod.LinearScale
import typingsSlinky.chartJs.mod.LogarithmicScale
import typingsSlinky.chartJs.mod.RadialLinearScale
import typingsSlinky.chartJs.mod.TimeScale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined chart.js.chart.js.ChartOptions & chart.js.chart.js.ChartFontOptions & {  tooltips  :chart.js.chart.js.ChartTooltipOptions} */
@js.native
trait ChartOptionsChartFontOpti extends js.Object {
  var animation: js.UndefOr[ChartAnimationOptions] = js.native
  var aspectRatio: js.UndefOr[Double] = js.native
  var circumference: js.UndefOr[Double] = js.native
  var cutoutPercentage: js.UndefOr[Double] = js.native
  var defaultFontColor: js.UndefOr[ChartColor] = js.native
  var defaultFontFamily: js.UndefOr[String] = js.native
  var defaultFontSize: js.UndefOr[Double] = js.native
  var defaultFontStyle: js.UndefOr[String] = js.native
  var devicePixelRatio: js.UndefOr[Double] = js.native
  var elements: js.UndefOr[ChartElementsOptions] = js.native
  var events: js.UndefOr[js.Array[String]] = js.native
  var hover: js.UndefOr[ChartHoverOptions] = js.native
  var layout: js.UndefOr[ChartLayoutOptions] = js.native
  var legend: js.UndefOr[ChartLegendOptions] = js.native
  var legendCallback: js.UndefOr[js.Function1[/* chart */ typingsSlinky.chartJs.mod.Chart, String]] = js.native
  var maintainAspectRatio: js.UndefOr[Boolean] = js.native
  var onClick: js.UndefOr[
    js.Function2[
      /* event */ js.UndefOr[MouseEvent], 
      /* activeElements */ js.UndefOr[js.Array[js.Object]], 
      _
    ]
  ] = js.native
  var onHover: js.UndefOr[
    js.ThisFunction2[
      /* this */ typingsSlinky.chartJs.mod.Chart, 
      /* event */ MouseEvent, 
      /* activeElements */ js.Array[js.Object], 
      _
    ]
  ] = js.native
  var onResize: js.UndefOr[
    js.ThisFunction1[/* this */ typingsSlinky.chartJs.mod.Chart, /* newSize */ ChartSize, Unit]
  ] = js.native
  var plugins: js.UndefOr[ChartPluginsOptions] = js.native
  var responsive: js.UndefOr[Boolean] = js.native
  var responsiveAnimationDuration: js.UndefOr[Double] = js.native
  var rotation: js.UndefOr[Double] = js.native
  var scale: js.UndefOr[RadialLinearScale] = js.native
  var scales: js.UndefOr[ChartScales | LinearScale | LogarithmicScale | TimeScale] = js.native
  var showLines: js.UndefOr[Boolean] = js.native
  var spanGaps: js.UndefOr[Boolean] = js.native
  var title: js.UndefOr[ChartTitleOptions] = js.native
  var tooltips: js.UndefOr[ChartTooltipOptions] = js.native
}

object ChartOptionsChartFontOpti {
  @scala.inline
  def apply(): ChartOptionsChartFontOpti = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartOptionsChartFontOpti]
  }
  @scala.inline
  implicit class ChartOptionsChartFontOptiOps[Self <: ChartOptionsChartFontOpti] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimation(value: ChartAnimationOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(js.undefined)
        ret
    }
    @scala.inline
    def withAspectRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aspectRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAspectRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aspectRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withCircumference(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circumference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCircumference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circumference")(js.undefined)
        ret
    }
    @scala.inline
    def withCutoutPercentage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cutoutPercentage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCutoutPercentage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cutoutPercentage")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultFontColorCanvasPattern(value: CanvasPattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultFontColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultFontColorCanvasGradient(value: CanvasGradient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultFontColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultFontColor(value: ChartColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultFontColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultFontColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultFontColor")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultFontFamily(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultFontFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultFontFamily: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultFontFamily")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultFontSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultFontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultFontSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultFontSize")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultFontStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultFontStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultFontStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultFontStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withDevicePixelRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devicePixelRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDevicePixelRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devicePixelRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withElements(value: ChartElementsOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elements")(js.undefined)
        ret
    }
    @scala.inline
    def withEvents(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(js.undefined)
        ret
    }
    @scala.inline
    def withHover(value: ChartHoverOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hover")(js.undefined)
        ret
    }
    @scala.inline
    def withLayout(value: ChartLayoutOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(js.undefined)
        ret
    }
    @scala.inline
    def withLegend(value: ChartLegendOptions): Self = {
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
    def withLegendCallback(value: /* chart */ typingsSlinky.chartJs.mod.Chart => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendCallback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLegendCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withMaintainAspectRatio(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maintainAspectRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaintainAspectRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maintainAspectRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClick(
      value: (/* event */ js.UndefOr[MouseEvent], /* activeElements */ js.UndefOr[js.Array[js.Object]]) => _
    ): Self = {
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
    def withOnHover(
      value: js.ThisFunction2[
          /* this */ typingsSlinky.chartJs.mod.Chart, 
          /* event */ MouseEvent, 
          /* activeElements */ js.Array[js.Object], 
          _
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnHover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHover")(js.undefined)
        ret
    }
    @scala.inline
    def withOnResize(value: js.ThisFunction1[/* this */ typingsSlinky.chartJs.mod.Chart, /* newSize */ ChartSize, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResize")(js.undefined)
        ret
    }
    @scala.inline
    def withPlugins(value: ChartPluginsOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlugins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(js.undefined)
        ret
    }
    @scala.inline
    def withResponsive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponsive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsive")(js.undefined)
        ret
    }
    @scala.inline
    def withResponsiveAnimationDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsiveAnimationDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponsiveAnimationDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsiveAnimationDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withRotation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotation")(js.undefined)
        ret
    }
    @scala.inline
    def withScale(value: RadialLinearScale): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(js.undefined)
        ret
    }
    @scala.inline
    def withScales(value: ChartScales | LinearScale | LogarithmicScale | TimeScale): Self = {
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
    def withShowLines(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLines")(js.undefined)
        ret
    }
    @scala.inline
    def withSpanGaps(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spanGaps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpanGaps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spanGaps")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: ChartTitleOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltips(value: ChartTooltipOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltips")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltips: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltips")(js.undefined)
        ret
    }
  }
  
}

