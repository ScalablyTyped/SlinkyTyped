package typingsSlinky.chartJs.mod

import org.scalajs.dom.raw.CanvasGradient
import org.scalajs.dom.raw.CanvasPattern
import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import typingsSlinky.chartJs.AnonChart
import typingsSlinky.chartJs.chartJsStrings.after
import typingsSlinky.chartJs.chartJsStrings.before
import typingsSlinky.chartJs.chartJsStrings.bevel
import typingsSlinky.chartJs.chartJsStrings.butt
import typingsSlinky.chartJs.chartJsStrings.default
import typingsSlinky.chartJs.chartJsStrings.flex
import typingsSlinky.chartJs.chartJsStrings.middle
import typingsSlinky.chartJs.chartJsStrings.miter
import typingsSlinky.chartJs.chartJsStrings.monotone
import typingsSlinky.chartJs.chartJsStrings.round
import typingsSlinky.chartJs.chartJsStrings.square
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartDataSets extends js.Object {
  var backgroundColor: js.UndefOr[ChartColor | js.Array[ChartColor] | Scriptable[ChartColor]] = js.native
  var barPercentage: js.UndefOr[Double] = js.native
  var barThickness: js.UndefOr[Double | flex] = js.native
  var borderAlign: js.UndefOr[BorderAlignment | js.Array[BorderAlignment] | Scriptable[BorderAlignment]] = js.native
  var borderCapStyle: js.UndefOr[butt | round | square] = js.native
  var borderColor: js.UndefOr[ChartColor | js.Array[ChartColor] | Scriptable[ChartColor]] = js.native
  var borderDash: js.UndefOr[js.Array[Double]] = js.native
  var borderDashOffset: js.UndefOr[Double] = js.native
  var borderJoinStyle: js.UndefOr[bevel | round | miter] = js.native
  var borderSkipped: js.UndefOr[PositionType | js.Array[PositionType] | Scriptable[PositionType]] = js.native
  var borderWidth: js.UndefOr[BorderWidth | js.Array[BorderWidth] | Scriptable[BorderWidth]] = js.native
  var categoryPercentage: js.UndefOr[Double] = js.native
  var cubicInterpolationMode: js.UndefOr[default | monotone] = js.native
  var data: js.UndefOr[js.Array[js.UndefOr[ChartPoint | Double | Null]]] = js.native
  var fill: js.UndefOr[Boolean | Double | String] = js.native
  var hidden: js.UndefOr[Boolean] = js.native
  var hideInLegendAndTooltip: js.UndefOr[Boolean] = js.native
  var hitRadius: js.UndefOr[Double | js.Array[Double] | Scriptable[Double]] = js.native
  var hoverBackgroundColor: js.UndefOr[ChartColor | js.Array[ChartColor] | Scriptable[ChartColor]] = js.native
  var hoverBorderColor: js.UndefOr[ChartColor | js.Array[ChartColor] | Scriptable[ChartColor]] = js.native
  var hoverBorderWidth: js.UndefOr[Double | js.Array[Double] | Scriptable[Double]] = js.native
  var hoverRadius: js.UndefOr[Double] = js.native
  var label: js.UndefOr[String] = js.native
  var lineTension: js.UndefOr[Double] = js.native
  var maxBarThickness: js.UndefOr[Double] = js.native
  var minBarLength: js.UndefOr[Double] = js.native
  var order: js.UndefOr[Double] = js.native
  var pointBackgroundColor: js.UndefOr[ChartColor | js.Array[ChartColor] | Scriptable[ChartColor]] = js.native
  var pointBorderColor: js.UndefOr[ChartColor | js.Array[ChartColor] | Scriptable[ChartColor]] = js.native
  var pointBorderWidth: js.UndefOr[Double | js.Array[Double] | Scriptable[Double]] = js.native
  var pointHitRadius: js.UndefOr[Double | js.Array[Double] | Scriptable[Double]] = js.native
  var pointHoverBackgroundColor: js.UndefOr[ChartColor | js.Array[ChartColor] | Scriptable[ChartColor]] = js.native
  var pointHoverBorderColor: js.UndefOr[ChartColor | js.Array[ChartColor] | Scriptable[ChartColor]] = js.native
  var pointHoverBorderWidth: js.UndefOr[Double | js.Array[Double] | Scriptable[Double]] = js.native
  var pointHoverRadius: js.UndefOr[Double | js.Array[Double] | Scriptable[Double]] = js.native
  var pointRadius: js.UndefOr[Double | js.Array[Double] | Scriptable[Double]] = js.native
  var pointRotation: js.UndefOr[Double | js.Array[Double] | Scriptable[Double]] = js.native
  var pointStyle: js.UndefOr[
    PointStyle | HTMLImageElement | HTMLCanvasElement | (js.Array[PointStyle | HTMLImageElement | HTMLCanvasElement]) | (Scriptable[PointStyle | HTMLImageElement | HTMLCanvasElement])
  ] = js.native
  var radius: js.UndefOr[Double | js.Array[Double] | Scriptable[Double]] = js.native
  var rotation: js.UndefOr[Double | js.Array[Double] | Scriptable[Double]] = js.native
  var showLine: js.UndefOr[Boolean] = js.native
  var spanGaps: js.UndefOr[Boolean] = js.native
  var stack: js.UndefOr[String] = js.native
  var steppedLine: js.UndefOr[before | after | middle | Boolean] = js.native
  var `type`: js.UndefOr[ChartType | String] = js.native
  var weight: js.UndefOr[Double] = js.native
  var xAxisID: js.UndefOr[String] = js.native
  var yAxisID: js.UndefOr[String] = js.native
}

object ChartDataSets {
  @scala.inline
  def apply(): ChartDataSets = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartDataSets]
  }
  @scala.inline
  implicit class ChartDataSetsOps[Self <: ChartDataSets] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackgroundColorCanvasPattern(value: CanvasPattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackgroundColorFunction1(value: /* ctx */ AnonChart => ChartColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBackgroundColorCanvasGradient(value: CanvasGradient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackgroundColor(value: ChartColor | js.Array[ChartColor] | Scriptable[ChartColor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBarPercentage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barPercentage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarPercentage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barPercentage")(js.undefined)
        ret
    }
    @scala.inline
    def withBarThickness(value: Double | flex): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barThickness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarThickness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barThickness")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderAlignFunction1(value: /* ctx */ AnonChart => BorderAlignment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderAlign")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBorderAlign(value: BorderAlignment | js.Array[BorderAlignment] | Scriptable[BorderAlignment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderCapStyle(value: butt | round | square): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderCapStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderCapStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderCapStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderColorCanvasPattern(value: CanvasPattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBorderColorFunction1(value: /* ctx */ AnonChart => ChartColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBorderColorCanvasGradient(value: CanvasGradient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBorderColor(value: ChartColor | js.Array[ChartColor] | Scriptable[ChartColor]): Self = {
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
    def withBorderDash(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderDash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderDash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderDash")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderDashOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderDashOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderDashOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderDashOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderJoinStyle(value: bevel | round | miter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderJoinStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderJoinStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderJoinStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderSkippedFunction1(value: /* ctx */ AnonChart => PositionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderSkipped")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBorderSkipped(value: PositionType | js.Array[PositionType] | Scriptable[PositionType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderSkipped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderSkipped: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderSkipped")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderWidthFunction1(value: /* ctx */ AnonChart => BorderWidth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderWidth")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBorderWidth(value: BorderWidth | js.Array[BorderWidth] | Scriptable[BorderWidth]): Self = {
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
    def withCategoryPercentage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categoryPercentage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategoryPercentage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categoryPercentage")(js.undefined)
        ret
    }
    @scala.inline
    def withCubicInterpolationMode(value: default | monotone): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cubicInterpolationMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCubicInterpolationMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cubicInterpolationMode")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: js.Array[js.UndefOr[ChartPoint | Double | Null]]): Self = {
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
    def withFill(value: Boolean | Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(js.undefined)
        ret
    }
    @scala.inline
    def withHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(js.undefined)
        ret
    }
    @scala.inline
    def withHideInLegendAndTooltip(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideInLegendAndTooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideInLegendAndTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideInLegendAndTooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withHitRadiusFunction1(value: /* ctx */ AnonChart => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hitRadius")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHitRadius(value: Double | js.Array[Double] | Scriptable[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hitRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHitRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hitRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withHoverBackgroundColorCanvasPattern(value: CanvasPattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverBackgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHoverBackgroundColorFunction1(value: /* ctx */ AnonChart => ChartColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverBackgroundColor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHoverBackgroundColorCanvasGradient(value: CanvasGradient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverBackgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHoverBackgroundColor(value: ChartColor | js.Array[ChartColor] | Scriptable[ChartColor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverBackgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoverBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverBackgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withHoverBorderColorCanvasPattern(value: CanvasPattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverBorderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHoverBorderColorFunction1(value: /* ctx */ AnonChart => ChartColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverBorderColor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHoverBorderColorCanvasGradient(value: CanvasGradient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverBorderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHoverBorderColor(value: ChartColor | js.Array[ChartColor] | Scriptable[ChartColor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverBorderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoverBorderColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverBorderColor")(js.undefined)
        ret
    }
    @scala.inline
    def withHoverBorderWidthFunction1(value: /* ctx */ AnonChart => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverBorderWidth")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHoverBorderWidth(value: Double | js.Array[Double] | Scriptable[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverBorderWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoverBorderWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverBorderWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withHoverRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoverRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withLineTension(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineTension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineTension: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineTension")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxBarThickness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxBarThickness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxBarThickness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxBarThickness")(js.undefined)
        ret
    }
    @scala.inline
    def withMinBarLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minBarLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinBarLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minBarLength")(js.undefined)
        ret
    }
    @scala.inline
    def withOrder(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(js.undefined)
        ret
    }
    @scala.inline
    def withPointBackgroundColorCanvasPattern(value: CanvasPattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointBackgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPointBackgroundColorFunction1(value: /* ctx */ AnonChart => ChartColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointBackgroundColor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPointBackgroundColorCanvasGradient(value: CanvasGradient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointBackgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPointBackgroundColor(value: ChartColor | js.Array[ChartColor] | Scriptable[ChartColor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointBackgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointBackgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withPointBorderColorCanvasPattern(value: CanvasPattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointBorderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPointBorderColorFunction1(value: /* ctx */ AnonChart => ChartColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointBorderColor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPointBorderColorCanvasGradient(value: CanvasGradient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointBorderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPointBorderColor(value: ChartColor | js.Array[ChartColor] | Scriptable[ChartColor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointBorderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointBorderColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointBorderColor")(js.undefined)
        ret
    }
    @scala.inline
    def withPointBorderWidthFunction1(value: /* ctx */ AnonChart => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointBorderWidth")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPointBorderWidth(value: Double | js.Array[Double] | Scriptable[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointBorderWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointBorderWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointBorderWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withPointHitRadiusFunction1(value: /* ctx */ AnonChart => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointHitRadius")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPointHitRadius(value: Double | js.Array[Double] | Scriptable[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointHitRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointHitRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointHitRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withPointHoverBackgroundColorCanvasPattern(value: CanvasPattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointHoverBackgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPointHoverBackgroundColorFunction1(value: /* ctx */ AnonChart => ChartColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointHoverBackgroundColor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPointHoverBackgroundColorCanvasGradient(value: CanvasGradient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointHoverBackgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPointHoverBackgroundColor(value: ChartColor | js.Array[ChartColor] | Scriptable[ChartColor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointHoverBackgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointHoverBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointHoverBackgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withPointHoverBorderColorCanvasPattern(value: CanvasPattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointHoverBorderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPointHoverBorderColorFunction1(value: /* ctx */ AnonChart => ChartColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointHoverBorderColor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPointHoverBorderColorCanvasGradient(value: CanvasGradient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointHoverBorderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPointHoverBorderColor(value: ChartColor | js.Array[ChartColor] | Scriptable[ChartColor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointHoverBorderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointHoverBorderColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointHoverBorderColor")(js.undefined)
        ret
    }
    @scala.inline
    def withPointHoverBorderWidthFunction1(value: /* ctx */ AnonChart => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointHoverBorderWidth")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPointHoverBorderWidth(value: Double | js.Array[Double] | Scriptable[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointHoverBorderWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointHoverBorderWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointHoverBorderWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withPointHoverRadiusFunction1(value: /* ctx */ AnonChart => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointHoverRadius")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPointHoverRadius(value: Double | js.Array[Double] | Scriptable[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointHoverRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointHoverRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointHoverRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withPointRadiusFunction1(value: /* ctx */ AnonChart => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointRadius")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPointRadius(value: Double | js.Array[Double] | Scriptable[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withPointRotationFunction1(value: /* ctx */ AnonChart => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointRotation")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPointRotation(value: Double | js.Array[Double] | Scriptable[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointRotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointRotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointRotation")(js.undefined)
        ret
    }
    @scala.inline
    def withPointStyleFunction1(value: /* ctx */ AnonChart => PointStyle | HTMLImageElement | HTMLCanvasElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointStyle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPointStyleHTMLImageElement(value: HTMLImageElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPointStyleHTMLCanvasElement(value: HTMLCanvasElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPointStyle(
      value: PointStyle | HTMLImageElement | HTMLCanvasElement | (js.Array[PointStyle | HTMLImageElement | HTMLCanvasElement]) | (Scriptable[PointStyle | HTMLImageElement | HTMLCanvasElement])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withRadiusFunction1(value: /* ctx */ AnonChart => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radius")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRadius(value: Double | js.Array[Double] | Scriptable[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radius")(js.undefined)
        ret
    }
    @scala.inline
    def withRotationFunction1(value: /* ctx */ AnonChart => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotation")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRotation(value: Double | js.Array[Double] | Scriptable[Double]): Self = {
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
    def withShowLine(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLine")(js.undefined)
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
    def withStack(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stack")(js.undefined)
        ret
    }
    @scala.inline
    def withSteppedLine(value: before | after | middle | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("steppedLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSteppedLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("steppedLine")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: ChartType | String): Self = {
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
    @scala.inline
    def withWeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weight")(js.undefined)
        ret
    }
    @scala.inline
    def withXAxisID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXAxisID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisID")(js.undefined)
        ret
    }
    @scala.inline
    def withYAxisID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYAxisID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisID")(js.undefined)
        ret
    }
  }
  
}

