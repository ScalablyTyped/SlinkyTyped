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
trait ChartOptionsChartFontOpti extends js.Object {
  var animation: js.UndefOr[ChartAnimationOptions] = js.undefined
  var aspectRatio: js.UndefOr[Double] = js.undefined
  var circumference: js.UndefOr[Double] = js.undefined
  var cutoutPercentage: js.UndefOr[Double] = js.undefined
  var defaultFontColor: js.UndefOr[ChartColor] = js.undefined
  var defaultFontFamily: js.UndefOr[String] = js.undefined
  var defaultFontSize: js.UndefOr[Double] = js.undefined
  var defaultFontStyle: js.UndefOr[String] = js.undefined
  var devicePixelRatio: js.UndefOr[Double] = js.undefined
  var elements: js.UndefOr[ChartElementsOptions] = js.undefined
  var events: js.UndefOr[js.Array[String]] = js.undefined
  var hover: js.UndefOr[ChartHoverOptions] = js.undefined
  var layout: js.UndefOr[ChartLayoutOptions] = js.undefined
  var legend: js.UndefOr[ChartLegendOptions] = js.undefined
  var legendCallback: js.UndefOr[js.Function1[/* chart */ typingsSlinky.chartJs.mod.Chart, String]] = js.undefined
  var maintainAspectRatio: js.UndefOr[Boolean] = js.undefined
  var onClick: js.UndefOr[
    js.Function2[
      /* event */ js.UndefOr[MouseEvent], 
      /* activeElements */ js.UndefOr[js.Array[js.Object]], 
      _
    ]
  ] = js.undefined
  var onHover: js.UndefOr[
    js.ThisFunction2[
      /* this */ typingsSlinky.chartJs.mod.Chart, 
      /* event */ MouseEvent, 
      /* activeElements */ js.Array[js.Object], 
      _
    ]
  ] = js.undefined
  var onResize: js.UndefOr[
    js.ThisFunction1[/* this */ typingsSlinky.chartJs.mod.Chart, /* newSize */ ChartSize, Unit]
  ] = js.undefined
  var plugins: js.UndefOr[ChartPluginsOptions] = js.undefined
  var responsive: js.UndefOr[Boolean] = js.undefined
  var responsiveAnimationDuration: js.UndefOr[Double] = js.undefined
  var rotation: js.UndefOr[Double] = js.undefined
  var scale: js.UndefOr[RadialLinearScale] = js.undefined
  var scales: js.UndefOr[ChartScales | LinearScale | LogarithmicScale | TimeScale] = js.undefined
  var showLines: js.UndefOr[Boolean] = js.undefined
  var spanGaps: js.UndefOr[Boolean] = js.undefined
  var title: js.UndefOr[ChartTitleOptions] = js.undefined
  var tooltips: js.UndefOr[ChartTooltipOptions] = js.undefined
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAnimation(value: ChartAnimationOptions): Self = this.set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    @scala.inline
    def setAspectRatio(value: Double): Self = this.set("aspectRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAspectRatio: Self = this.set("aspectRatio", js.undefined)
    @scala.inline
    def setCircumference(value: Double): Self = this.set("circumference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCircumference: Self = this.set("circumference", js.undefined)
    @scala.inline
    def setCutoutPercentage(value: Double): Self = this.set("cutoutPercentage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCutoutPercentage: Self = this.set("cutoutPercentage", js.undefined)
    @scala.inline
    def setDefaultFontColorCanvasPattern(value: CanvasPattern): Self = this.set("defaultFontColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultFontColorCanvasGradient(value: CanvasGradient): Self = this.set("defaultFontColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultFontColor(value: ChartColor): Self = this.set("defaultFontColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultFontColor: Self = this.set("defaultFontColor", js.undefined)
    @scala.inline
    def setDefaultFontFamily(value: String): Self = this.set("defaultFontFamily", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultFontFamily: Self = this.set("defaultFontFamily", js.undefined)
    @scala.inline
    def setDefaultFontSize(value: Double): Self = this.set("defaultFontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultFontSize: Self = this.set("defaultFontSize", js.undefined)
    @scala.inline
    def setDefaultFontStyle(value: String): Self = this.set("defaultFontStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultFontStyle: Self = this.set("defaultFontStyle", js.undefined)
    @scala.inline
    def setDevicePixelRatio(value: Double): Self = this.set("devicePixelRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDevicePixelRatio: Self = this.set("devicePixelRatio", js.undefined)
    @scala.inline
    def setElements(value: ChartElementsOptions): Self = this.set("elements", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElements: Self = this.set("elements", js.undefined)
    @scala.inline
    def setEvents(value: js.Array[String]): Self = this.set("events", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    @scala.inline
    def setHover(value: ChartHoverOptions): Self = this.set("hover", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHover: Self = this.set("hover", js.undefined)
    @scala.inline
    def setLayout(value: ChartLayoutOptions): Self = this.set("layout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    @scala.inline
    def setLegend(value: ChartLegendOptions): Self = this.set("legend", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLegend: Self = this.set("legend", js.undefined)
    @scala.inline
    def setLegendCallback(value: /* chart */ typingsSlinky.chartJs.mod.Chart => String): Self = this.set("legendCallback", js.Any.fromFunction1(value))
    @scala.inline
    def deleteLegendCallback: Self = this.set("legendCallback", js.undefined)
    @scala.inline
    def setMaintainAspectRatio(value: Boolean): Self = this.set("maintainAspectRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaintainAspectRatio: Self = this.set("maintainAspectRatio", js.undefined)
    @scala.inline
    def setOnClick(
      value: (/* event */ js.UndefOr[MouseEvent], /* activeElements */ js.UndefOr[js.Array[js.Object]]) => _
    ): Self = this.set("onClick", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setOnHover(
      value: js.ThisFunction2[
          /* this */ typingsSlinky.chartJs.mod.Chart, 
          /* event */ MouseEvent, 
          /* activeElements */ js.Array[js.Object], 
          _
        ]
    ): Self = this.set("onHover", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnHover: Self = this.set("onHover", js.undefined)
    @scala.inline
    def setOnResize(value: js.ThisFunction1[/* this */ typingsSlinky.chartJs.mod.Chart, /* newSize */ ChartSize, Unit]): Self = this.set("onResize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnResize: Self = this.set("onResize", js.undefined)
    @scala.inline
    def setPlugins(value: ChartPluginsOptions): Self = this.set("plugins", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
    @scala.inline
    def setResponsive(value: Boolean): Self = this.set("responsive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponsive: Self = this.set("responsive", js.undefined)
    @scala.inline
    def setResponsiveAnimationDuration(value: Double): Self = this.set("responsiveAnimationDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponsiveAnimationDuration: Self = this.set("responsiveAnimationDuration", js.undefined)
    @scala.inline
    def setRotation(value: Double): Self = this.set("rotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotation: Self = this.set("rotation", js.undefined)
    @scala.inline
    def setScale(value: RadialLinearScale): Self = this.set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    @scala.inline
    def setScales(value: ChartScales | LinearScale | LogarithmicScale | TimeScale): Self = this.set("scales", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScales: Self = this.set("scales", js.undefined)
    @scala.inline
    def setShowLines(value: Boolean): Self = this.set("showLines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowLines: Self = this.set("showLines", js.undefined)
    @scala.inline
    def setSpanGaps(value: Boolean): Self = this.set("spanGaps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpanGaps: Self = this.set("spanGaps", js.undefined)
    @scala.inline
    def setTitle(value: ChartTitleOptions): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTooltips(value: ChartTooltipOptions): Self = this.set("tooltips", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltips: Self = this.set("tooltips", js.undefined)
  }
  
}

