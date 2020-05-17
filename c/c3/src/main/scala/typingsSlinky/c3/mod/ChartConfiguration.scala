package typingsSlinky.c3.mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.c3.anon.Arcs
import typingsSlinky.c3.anon.Auto
import typingsSlinky.c3.anon.Brighten
import typingsSlinky.c3.anon.Classname
import typingsSlinky.c3.anon.Colors
import typingsSlinky.c3.anon.Duration
import typingsSlinky.c3.anon.Expand
import typingsSlinky.c3.anon.Height
import typingsSlinky.c3.anon.Interpolation
import typingsSlinky.c3.anon.Label
import typingsSlinky.c3.anon.Pattern
import typingsSlinky.c3.anon.Space
import typingsSlinky.c3.anon.Zerobased
import typingsSlinky.d3Selection.mod.Selection_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartConfiguration extends js.Object {
  var area: js.UndefOr[Zerobased] = js.native
  var axis: js.UndefOr[AxesOptions] = js.native
  var bar: js.UndefOr[Space] = js.native
  /**
    * The CSS selector or the element which the chart will be set to. D3 selection object can be specified. If other chart is set already, it will be replaced with the new one (only one chart
    * can be set in one element).
    * If this option is not specified, the chart will be generated but not be set. Instead, we can access the element by chart.element and set it by ourselves.
    * Note: When chart is not binded, c3 starts observing if chart.element is binded by MutationObserver. In this case, polyfill is required in IE9 and IE10 becuase they do not support
    * MutationObserver. On the other hand, if chart always will be binded, polyfill will not be required because MutationObserver will never be called.
    */
  var bindto: js.UndefOr[String | HTMLElement | (Selection_[_, _, _, _]) | Null] = js.native
  var color: js.UndefOr[Pattern] = js.native
  var data: Data = js.native
  var donut: js.UndefOr[Label] = js.native
  var gauge: js.UndefOr[Arcs] = js.native
  var grid: js.UndefOr[GridOptions] = js.native
  var interaction: js.UndefOr[Brighten] = js.native
  var legend: js.UndefOr[LegendOptions] = js.native
  var line: js.UndefOr[LineOptions] = js.native
  /**
    * Set a callback to execute when the chart is initialized.
    */
  var oninit: js.UndefOr[js.ThisFunction0[/* this */ ChartInternal, Unit]] = js.native
  /**
    * Set a callback to execute when mouse leaves the chart.
    */
  var onmouseout: js.UndefOr[js.ThisFunction0[/* this */ ChartInternal, Unit]] = js.native
  /**
    * Set a callback to execute when mouse enters the chart.
    */
  var onmouseover: js.UndefOr[js.ThisFunction0[/* this */ ChartInternal, Unit]] = js.native
  /**
    * Set a callback which is executed when the chart is rendered. Basically, this callback will be called in each time when the chart is redrawed.
    */
  var onrendered: js.UndefOr[js.ThisFunction0[/* this */ ChartInternal, Unit]] = js.native
  /**
    * Set a callback to execute when user resizes the screen.
    */
  var onresize: js.UndefOr[js.ThisFunction0[/* this */ ChartInternal, Unit]] = js.native
  /**
    * Set a callback to execute when screen resize finished.
    */
  var onresized: js.UndefOr[js.ThisFunction0[/* this */ ChartInternal, Unit]] = js.native
  var padding: js.UndefOr[Padding] = js.native
  var pie: js.UndefOr[Expand] = js.native
  var point: js.UndefOr[PointOptions] = js.native
  /**
    * Show rectangles inside the chart.
    * This option accepts array including object that has axis, start, end and class. The keys start, end and class are optional.
    * axis must be x, y or y2. start and end should be the value where regions start and end. If not specified, the edge values will be used. If timeseries x axis, date string, Date object and
    * unixtime integer can be used. If class is set, the region element will have it as class.
    */
  var regions: js.UndefOr[js.Array[RegionOptions]] = js.native
  var resize: js.UndefOr[Auto] = js.native
  var size: js.UndefOr[Height] = js.native
  var spline: js.UndefOr[Interpolation] = js.native
  var stanford: js.UndefOr[Colors] = js.native
  var subchart: js.UndefOr[SubchartOptions] = js.native
  var svg: js.UndefOr[Classname] = js.native
  var title: js.UndefOr[typingsSlinky.c3.anon.Padding] = js.native
  var tooltip: js.UndefOr[TooltipOptions] = js.native
  var transition: js.UndefOr[Duration] = js.native
  var zoom: js.UndefOr[ZoomOptions] = js.native
}

object ChartConfiguration {
  @scala.inline
  def apply(data: Data): ChartConfiguration = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartConfiguration]
  }
  @scala.inline
  implicit class ChartConfigurationOps[Self <: ChartConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: Data): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArea(value: Zerobased): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("area")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArea: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("area")(js.undefined)
        ret
    }
    @scala.inline
    def withAxis(value: AxesOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axis")(js.undefined)
        ret
    }
    @scala.inline
    def withBar(value: Space): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bar")(js.undefined)
        ret
    }
    @scala.inline
    def withBindtoHTMLElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindto")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBindto(value: String | HTMLElement | (Selection_[_, _, _, _])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindto")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBindto: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindto")(js.undefined)
        ret
    }
    @scala.inline
    def withBindtoNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindto")(null)
        ret
    }
    @scala.inline
    def withColor(value: Pattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withDonut(value: Label): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("donut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDonut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("donut")(js.undefined)
        ret
    }
    @scala.inline
    def withGauge(value: Arcs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gauge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGauge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gauge")(js.undefined)
        ret
    }
    @scala.inline
    def withGrid(value: GridOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid")(js.undefined)
        ret
    }
    @scala.inline
    def withInteraction(value: Brighten): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interaction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInteraction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interaction")(js.undefined)
        ret
    }
    @scala.inline
    def withLegend(value: LegendOptions): Self = {
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
    def withLine(value: LineOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line")(js.undefined)
        ret
    }
    @scala.inline
    def withOninit(value: js.ThisFunction0[/* this */ ChartInternal, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oninit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOninit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oninit")(js.undefined)
        ret
    }
    @scala.inline
    def withOnmouseout(value: js.ThisFunction0[/* this */ ChartInternal, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmouseout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnmouseout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmouseout")(js.undefined)
        ret
    }
    @scala.inline
    def withOnmouseover(value: js.ThisFunction0[/* this */ ChartInternal, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmouseover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnmouseover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmouseover")(js.undefined)
        ret
    }
    @scala.inline
    def withOnrendered(value: js.ThisFunction0[/* this */ ChartInternal, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onrendered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnrendered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onrendered")(js.undefined)
        ret
    }
    @scala.inline
    def withOnresize(value: js.ThisFunction0[/* this */ ChartInternal, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onresize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnresize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onresize")(js.undefined)
        ret
    }
    @scala.inline
    def withOnresized(value: js.ThisFunction0[/* this */ ChartInternal, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onresized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnresized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onresized")(js.undefined)
        ret
    }
    @scala.inline
    def withPadding(value: Padding): Self = {
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
    def withPie(value: Expand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pie")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPie: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pie")(js.undefined)
        ret
    }
    @scala.inline
    def withPoint(value: PointOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("point")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("point")(js.undefined)
        ret
    }
    @scala.inline
    def withRegions(value: js.Array[RegionOptions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regions")(js.undefined)
        ret
    }
    @scala.inline
    def withResize(value: Auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resize")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: Height): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withSpline(value: Interpolation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spline")(js.undefined)
        ret
    }
    @scala.inline
    def withStanford(value: Colors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stanford")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStanford: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stanford")(js.undefined)
        ret
    }
    @scala.inline
    def withSubchart(value: SubchartOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subchart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubchart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subchart")(js.undefined)
        ret
    }
    @scala.inline
    def withSvg(value: Classname): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSvg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svg")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: typingsSlinky.c3.anon.Padding): Self = {
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
    def withTooltip(value: TooltipOptions): Self = {
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
    def withTransition(value: Duration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transition")(js.undefined)
        ret
    }
    @scala.inline
    def withZoom(value: ZoomOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom")(js.undefined)
        ret
    }
  }
  
}

