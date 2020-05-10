package typingsSlinky.devextreme.mod.DevExpress.viz

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.SVGElement
import org.scalajs.dom.raw.SVGGElement
import typingsSlinky.devextreme.AnonNameField
import typingsSlinky.devextreme.AnonPoints
import typingsSlinky.devextreme.devextremeStrings.anticlockwise
import typingsSlinky.devextreme.devextremeStrings.clockwise
import typingsSlinky.devextreme.devextremeStrings.donut
import typingsSlinky.devextreme.devextremeStrings.doughnut
import typingsSlinky.devextreme.devextremeStrings.hide
import typingsSlinky.devextreme.devextremeStrings.none
import typingsSlinky.devextreme.devextremeStrings.pie
import typingsSlinky.devextreme.devextremeStrings.shift
import typingsSlinky.devextreme.mod.DevExpress.core.template
import typingsSlinky.devextreme.mod._Global_.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxPieChartOptions extends BaseChartOptions[dxPieChart] {
  /** Specifies adaptive layout options. */
  @JSName("adaptiveLayout")
  var adaptiveLayout_dxPieChartOptions: js.UndefOr[dxPieChartAdaptiveLayout] = js.native
  /** Specifies a custom template for content in the pie's center. */
  var centerTemplate: js.UndefOr[
    template | (js.Function2[/* component */ dxPieChart, /* element */ SVGGElement, String | SVGElement | JQuery])
  ] = js.native
  /** An object defining the configuration options that are common for all series of the PieChart widget. */
  var commonSeriesSettings: js.UndefOr[js.Any] = js.native
  /** Specifies the diameter of the pie. */
  var diameter: js.UndefOr[Double] = js.native
  /** Specifies the fraction of the inner radius relative to the total radius in the series of the 'doughnut' type. The value should be between 0 and 1. */
  var innerRadius: js.UndefOr[Double] = js.native
  /** Specifies PieChart legend options. */
  @JSName("legend")
  var legend_dxPieChartOptions: js.UndefOr[dxPieChartLegend] = js.native
  /** Specifies the minimum diameter of the pie. */
  var minDiameter: js.UndefOr[Double] = js.native
  /** A function that is executed when a legend item is clicked or tapped. */
  var onLegendClick: js.UndefOr[(js.Function1[/* e */ AnonPoints, _]) | String] = js.native
  /** Specifies how a chart must behave when point labels overlap. */
  var resolveLabelOverlapping: js.UndefOr[hide | none | shift] = js.native
  /** Specifies the direction that the pie chart segments will occupy. */
  var segmentsDirection: js.UndefOr[anticlockwise | clockwise] = js.native
  /** Defines options for the series template. */
  var seriesTemplate: js.UndefOr[AnonNameField] = js.native
  /** Specifies options for the series of the PieChart widget. */
  @JSName("series")
  var series_dxPieChartOptions: js.UndefOr[PieChartSeries | js.Array[PieChartSeries]] = js.native
  /** Allows you to display several adjoining pies in the same size. */
  var sizeGroup: js.UndefOr[String] = js.native
  /** Specifies the angle in arc degrees from which the first segment of a pie chart should start. */
  var startAngle: js.UndefOr[Double] = js.native
  /** Specifies the type of the pie chart series. */
  var `type`: js.UndefOr[donut | doughnut | pie] = js.native
}

object dxPieChartOptions {
  @scala.inline
  def apply(): dxPieChartOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxPieChartOptions]
  }
  @scala.inline
  implicit class dxPieChartOptionsOps[Self <: dxPieChartOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdaptiveLayout(value: dxPieChartAdaptiveLayout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adaptiveLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdaptiveLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adaptiveLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withCenterTemplateFunction2(value: (/* component */ dxPieChart, /* element */ SVGGElement) => String | SVGElement | JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerTemplate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCenterTemplateElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCenterTemplate(
      value: template | (js.Function2[/* component */ dxPieChart, /* element */ SVGGElement, String | SVGElement | JQuery])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCenterTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withCommonSeriesSettings(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commonSeriesSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommonSeriesSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commonSeriesSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withDiameter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diameter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiameter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diameter")(js.undefined)
        ret
    }
    @scala.inline
    def withInnerRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInnerRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withLegend(value: dxPieChartLegend): Self = {
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
    def withMinDiameter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDiameter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinDiameter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDiameter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLegendClickFunction1(value: /* e */ AnonPoints => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLegendClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnLegendClick(value: (js.Function1[/* e */ AnonPoints, _]) | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLegendClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnLegendClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLegendClick")(js.undefined)
        ret
    }
    @scala.inline
    def withResolveLabelOverlapping(value: hide | none | shift): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveLabelOverlapping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolveLabelOverlapping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveLabelOverlapping")(js.undefined)
        ret
    }
    @scala.inline
    def withSegmentsDirection(value: anticlockwise | clockwise): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segmentsDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSegmentsDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segmentsDirection")(js.undefined)
        ret
    }
    @scala.inline
    def withSeries(value: PieChartSeries | js.Array[PieChartSeries]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("series")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("series")(js.undefined)
        ret
    }
    @scala.inline
    def withSeriesTemplate(value: AnonNameField): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeriesTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withSizeGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizeGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withStartAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startAngle")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: donut | doughnut | pie): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

