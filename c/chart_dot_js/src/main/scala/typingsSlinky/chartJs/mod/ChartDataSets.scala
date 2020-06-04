package typingsSlinky.chartJs.mod

import org.scalajs.dom.raw.CanvasGradient
import org.scalajs.dom.raw.CanvasPattern
import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
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

trait ChartDataSets extends js.Object {
  var backgroundColor: js.UndefOr[ChartColor | js.Array[ChartColor] | Scriptable[ChartColor]] = js.undefined
  var barPercentage: js.UndefOr[Double] = js.undefined
  var barThickness: js.UndefOr[Double | flex] = js.undefined
  var borderAlign: js.UndefOr[BorderAlignment | js.Array[BorderAlignment] | Scriptable[BorderAlignment]] = js.undefined
  var borderCapStyle: js.UndefOr[butt | round | square] = js.undefined
  var borderColor: js.UndefOr[ChartColor | js.Array[ChartColor] | Scriptable[ChartColor]] = js.undefined
  var borderDash: js.UndefOr[js.Array[Double]] = js.undefined
  var borderDashOffset: js.UndefOr[Double] = js.undefined
  var borderJoinStyle: js.UndefOr[bevel | round | miter] = js.undefined
  var borderSkipped: js.UndefOr[PositionType | js.Array[PositionType] | Scriptable[PositionType]] = js.undefined
  var borderWidth: js.UndefOr[BorderWidth | js.Array[BorderWidth] | Scriptable[BorderWidth]] = js.undefined
  var categoryPercentage: js.UndefOr[Double] = js.undefined
  var cubicInterpolationMode: js.UndefOr[default | monotone] = js.undefined
  var data: js.UndefOr[js.Array[js.UndefOr[js.Array[Double] | ChartPoint | Double | Null]]] = js.undefined
  var fill: js.UndefOr[Boolean | Double | String] = js.undefined
  var hidden: js.UndefOr[Boolean] = js.undefined
  var hideInLegendAndTooltip: js.UndefOr[Boolean] = js.undefined
  var hitRadius: js.UndefOr[Double | js.Array[Double] | Scriptable[Double]] = js.undefined
  var hoverBackgroundColor: js.UndefOr[ChartColor | js.Array[ChartColor] | Scriptable[ChartColor]] = js.undefined
  var hoverBorderColor: js.UndefOr[ChartColor | js.Array[ChartColor] | Scriptable[ChartColor]] = js.undefined
  var hoverBorderWidth: js.UndefOr[Double | js.Array[Double] | Scriptable[Double]] = js.undefined
  var hoverRadius: js.UndefOr[Double] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var lineTension: js.UndefOr[Double] = js.undefined
  var maxBarThickness: js.UndefOr[Double] = js.undefined
  var minBarLength: js.UndefOr[Double] = js.undefined
  var order: js.UndefOr[Double] = js.undefined
  var pointBackgroundColor: js.UndefOr[ChartColor | js.Array[ChartColor] | Scriptable[ChartColor]] = js.undefined
  var pointBorderColor: js.UndefOr[ChartColor | js.Array[ChartColor] | Scriptable[ChartColor]] = js.undefined
  var pointBorderWidth: js.UndefOr[Double | js.Array[Double] | Scriptable[Double]] = js.undefined
  var pointHitRadius: js.UndefOr[Double | js.Array[Double] | Scriptable[Double]] = js.undefined
  var pointHoverBackgroundColor: js.UndefOr[ChartColor | js.Array[ChartColor] | Scriptable[ChartColor]] = js.undefined
  var pointHoverBorderColor: js.UndefOr[ChartColor | js.Array[ChartColor] | Scriptable[ChartColor]] = js.undefined
  var pointHoverBorderWidth: js.UndefOr[Double | js.Array[Double] | Scriptable[Double]] = js.undefined
  var pointHoverRadius: js.UndefOr[Double | js.Array[Double] | Scriptable[Double]] = js.undefined
  var pointRadius: js.UndefOr[Double | js.Array[Double] | Scriptable[Double]] = js.undefined
  var pointRotation: js.UndefOr[Double | js.Array[Double] | Scriptable[Double]] = js.undefined
  var pointStyle: js.UndefOr[
    PointStyle | HTMLImageElement | HTMLCanvasElement | (js.Array[PointStyle | HTMLImageElement | HTMLCanvasElement]) | (Scriptable[PointStyle | HTMLImageElement | HTMLCanvasElement])
  ] = js.undefined
  var radius: js.UndefOr[Double | js.Array[Double] | Scriptable[Double]] = js.undefined
  var rotation: js.UndefOr[Double | js.Array[Double] | Scriptable[Double]] = js.undefined
  var showLine: js.UndefOr[Boolean] = js.undefined
  var spanGaps: js.UndefOr[Boolean] = js.undefined
  var stack: js.UndefOr[String] = js.undefined
  var steppedLine: js.UndefOr[before | after | middle | Boolean] = js.undefined
  var `type`: js.UndefOr[ChartType | String] = js.undefined
  var weight: js.UndefOr[Double] = js.undefined
  var xAxisID: js.UndefOr[String] = js.undefined
  var yAxisID: js.UndefOr[String] = js.undefined
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBackgroundColorCanvasPattern(value: CanvasPattern): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setBackgroundColorFunction1(value: /* ctx */ typingsSlinky.chartJs.anon.Chart => ChartColor): Self = this.set("backgroundColor", js.Any.fromFunction1(value))
    @scala.inline
    def setBackgroundColorCanvasGradient(value: CanvasGradient): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setBackgroundColor(value: ChartColor | js.Array[ChartColor] | Scriptable[ChartColor]): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setBarPercentage(value: Double): Self = this.set("barPercentage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBarPercentage: Self = this.set("barPercentage", js.undefined)
    @scala.inline
    def setBarThickness(value: Double | flex): Self = this.set("barThickness", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBarThickness: Self = this.set("barThickness", js.undefined)
    @scala.inline
    def setBorderAlignFunction1(value: /* ctx */ typingsSlinky.chartJs.anon.Chart => BorderAlignment): Self = this.set("borderAlign", js.Any.fromFunction1(value))
    @scala.inline
    def setBorderAlign(value: BorderAlignment | js.Array[BorderAlignment] | Scriptable[BorderAlignment]): Self = this.set("borderAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderAlign: Self = this.set("borderAlign", js.undefined)
    @scala.inline
    def setBorderCapStyle(value: butt | round | square): Self = this.set("borderCapStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderCapStyle: Self = this.set("borderCapStyle", js.undefined)
    @scala.inline
    def setBorderColorCanvasPattern(value: CanvasPattern): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setBorderColorFunction1(value: /* ctx */ typingsSlinky.chartJs.anon.Chart => ChartColor): Self = this.set("borderColor", js.Any.fromFunction1(value))
    @scala.inline
    def setBorderColorCanvasGradient(value: CanvasGradient): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setBorderColor(value: ChartColor | js.Array[ChartColor] | Scriptable[ChartColor]): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderColor: Self = this.set("borderColor", js.undefined)
    @scala.inline
    def setBorderDash(value: js.Array[Double]): Self = this.set("borderDash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderDash: Self = this.set("borderDash", js.undefined)
    @scala.inline
    def setBorderDashOffset(value: Double): Self = this.set("borderDashOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderDashOffset: Self = this.set("borderDashOffset", js.undefined)
    @scala.inline
    def setBorderJoinStyle(value: bevel | round | miter): Self = this.set("borderJoinStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderJoinStyle: Self = this.set("borderJoinStyle", js.undefined)
    @scala.inline
    def setBorderSkippedFunction1(value: /* ctx */ typingsSlinky.chartJs.anon.Chart => PositionType): Self = this.set("borderSkipped", js.Any.fromFunction1(value))
    @scala.inline
    def setBorderSkipped(value: PositionType | js.Array[PositionType] | Scriptable[PositionType]): Self = this.set("borderSkipped", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderSkipped: Self = this.set("borderSkipped", js.undefined)
    @scala.inline
    def setBorderWidthFunction1(value: /* ctx */ typingsSlinky.chartJs.anon.Chart => BorderWidth): Self = this.set("borderWidth", js.Any.fromFunction1(value))
    @scala.inline
    def setBorderWidth(value: BorderWidth | js.Array[BorderWidth] | Scriptable[BorderWidth]): Self = this.set("borderWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderWidth: Self = this.set("borderWidth", js.undefined)
    @scala.inline
    def setCategoryPercentage(value: Double): Self = this.set("categoryPercentage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategoryPercentage: Self = this.set("categoryPercentage", js.undefined)
    @scala.inline
    def setCubicInterpolationMode(value: default | monotone): Self = this.set("cubicInterpolationMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCubicInterpolationMode: Self = this.set("cubicInterpolationMode", js.undefined)
    @scala.inline
    def setData(value: js.Array[js.UndefOr[js.Array[Double] | ChartPoint | Double | Null]]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setFill(value: Boolean | Double | String): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    @scala.inline
    def setHideInLegendAndTooltip(value: Boolean): Self = this.set("hideInLegendAndTooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideInLegendAndTooltip: Self = this.set("hideInLegendAndTooltip", js.undefined)
    @scala.inline
    def setHitRadiusFunction1(value: /* ctx */ typingsSlinky.chartJs.anon.Chart => Double): Self = this.set("hitRadius", js.Any.fromFunction1(value))
    @scala.inline
    def setHitRadius(value: Double | js.Array[Double] | Scriptable[Double]): Self = this.set("hitRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHitRadius: Self = this.set("hitRadius", js.undefined)
    @scala.inline
    def setHoverBackgroundColorCanvasPattern(value: CanvasPattern): Self = this.set("hoverBackgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setHoverBackgroundColorFunction1(value: /* ctx */ typingsSlinky.chartJs.anon.Chart => ChartColor): Self = this.set("hoverBackgroundColor", js.Any.fromFunction1(value))
    @scala.inline
    def setHoverBackgroundColorCanvasGradient(value: CanvasGradient): Self = this.set("hoverBackgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setHoverBackgroundColor(value: ChartColor | js.Array[ChartColor] | Scriptable[ChartColor]): Self = this.set("hoverBackgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHoverBackgroundColor: Self = this.set("hoverBackgroundColor", js.undefined)
    @scala.inline
    def setHoverBorderColorCanvasPattern(value: CanvasPattern): Self = this.set("hoverBorderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setHoverBorderColorFunction1(value: /* ctx */ typingsSlinky.chartJs.anon.Chart => ChartColor): Self = this.set("hoverBorderColor", js.Any.fromFunction1(value))
    @scala.inline
    def setHoverBorderColorCanvasGradient(value: CanvasGradient): Self = this.set("hoverBorderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setHoverBorderColor(value: ChartColor | js.Array[ChartColor] | Scriptable[ChartColor]): Self = this.set("hoverBorderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHoverBorderColor: Self = this.set("hoverBorderColor", js.undefined)
    @scala.inline
    def setHoverBorderWidthFunction1(value: /* ctx */ typingsSlinky.chartJs.anon.Chart => Double): Self = this.set("hoverBorderWidth", js.Any.fromFunction1(value))
    @scala.inline
    def setHoverBorderWidth(value: Double | js.Array[Double] | Scriptable[Double]): Self = this.set("hoverBorderWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHoverBorderWidth: Self = this.set("hoverBorderWidth", js.undefined)
    @scala.inline
    def setHoverRadius(value: Double): Self = this.set("hoverRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHoverRadius: Self = this.set("hoverRadius", js.undefined)
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setLineTension(value: Double): Self = this.set("lineTension", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineTension: Self = this.set("lineTension", js.undefined)
    @scala.inline
    def setMaxBarThickness(value: Double): Self = this.set("maxBarThickness", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxBarThickness: Self = this.set("maxBarThickness", js.undefined)
    @scala.inline
    def setMinBarLength(value: Double): Self = this.set("minBarLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinBarLength: Self = this.set("minBarLength", js.undefined)
    @scala.inline
    def setOrder(value: Double): Self = this.set("order", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
    @scala.inline
    def setPointBackgroundColorCanvasPattern(value: CanvasPattern): Self = this.set("pointBackgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setPointBackgroundColorFunction1(value: /* ctx */ typingsSlinky.chartJs.anon.Chart => ChartColor): Self = this.set("pointBackgroundColor", js.Any.fromFunction1(value))
    @scala.inline
    def setPointBackgroundColorCanvasGradient(value: CanvasGradient): Self = this.set("pointBackgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setPointBackgroundColor(value: ChartColor | js.Array[ChartColor] | Scriptable[ChartColor]): Self = this.set("pointBackgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePointBackgroundColor: Self = this.set("pointBackgroundColor", js.undefined)
    @scala.inline
    def setPointBorderColorCanvasPattern(value: CanvasPattern): Self = this.set("pointBorderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setPointBorderColorFunction1(value: /* ctx */ typingsSlinky.chartJs.anon.Chart => ChartColor): Self = this.set("pointBorderColor", js.Any.fromFunction1(value))
    @scala.inline
    def setPointBorderColorCanvasGradient(value: CanvasGradient): Self = this.set("pointBorderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setPointBorderColor(value: ChartColor | js.Array[ChartColor] | Scriptable[ChartColor]): Self = this.set("pointBorderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePointBorderColor: Self = this.set("pointBorderColor", js.undefined)
    @scala.inline
    def setPointBorderWidthFunction1(value: /* ctx */ typingsSlinky.chartJs.anon.Chart => Double): Self = this.set("pointBorderWidth", js.Any.fromFunction1(value))
    @scala.inline
    def setPointBorderWidth(value: Double | js.Array[Double] | Scriptable[Double]): Self = this.set("pointBorderWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePointBorderWidth: Self = this.set("pointBorderWidth", js.undefined)
    @scala.inline
    def setPointHitRadiusFunction1(value: /* ctx */ typingsSlinky.chartJs.anon.Chart => Double): Self = this.set("pointHitRadius", js.Any.fromFunction1(value))
    @scala.inline
    def setPointHitRadius(value: Double | js.Array[Double] | Scriptable[Double]): Self = this.set("pointHitRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePointHitRadius: Self = this.set("pointHitRadius", js.undefined)
    @scala.inline
    def setPointHoverBackgroundColorCanvasPattern(value: CanvasPattern): Self = this.set("pointHoverBackgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setPointHoverBackgroundColorFunction1(value: /* ctx */ typingsSlinky.chartJs.anon.Chart => ChartColor): Self = this.set("pointHoverBackgroundColor", js.Any.fromFunction1(value))
    @scala.inline
    def setPointHoverBackgroundColorCanvasGradient(value: CanvasGradient): Self = this.set("pointHoverBackgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setPointHoverBackgroundColor(value: ChartColor | js.Array[ChartColor] | Scriptable[ChartColor]): Self = this.set("pointHoverBackgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePointHoverBackgroundColor: Self = this.set("pointHoverBackgroundColor", js.undefined)
    @scala.inline
    def setPointHoverBorderColorCanvasPattern(value: CanvasPattern): Self = this.set("pointHoverBorderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setPointHoverBorderColorFunction1(value: /* ctx */ typingsSlinky.chartJs.anon.Chart => ChartColor): Self = this.set("pointHoverBorderColor", js.Any.fromFunction1(value))
    @scala.inline
    def setPointHoverBorderColorCanvasGradient(value: CanvasGradient): Self = this.set("pointHoverBorderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setPointHoverBorderColor(value: ChartColor | js.Array[ChartColor] | Scriptable[ChartColor]): Self = this.set("pointHoverBorderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePointHoverBorderColor: Self = this.set("pointHoverBorderColor", js.undefined)
    @scala.inline
    def setPointHoverBorderWidthFunction1(value: /* ctx */ typingsSlinky.chartJs.anon.Chart => Double): Self = this.set("pointHoverBorderWidth", js.Any.fromFunction1(value))
    @scala.inline
    def setPointHoverBorderWidth(value: Double | js.Array[Double] | Scriptable[Double]): Self = this.set("pointHoverBorderWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePointHoverBorderWidth: Self = this.set("pointHoverBorderWidth", js.undefined)
    @scala.inline
    def setPointHoverRadiusFunction1(value: /* ctx */ typingsSlinky.chartJs.anon.Chart => Double): Self = this.set("pointHoverRadius", js.Any.fromFunction1(value))
    @scala.inline
    def setPointHoverRadius(value: Double | js.Array[Double] | Scriptable[Double]): Self = this.set("pointHoverRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePointHoverRadius: Self = this.set("pointHoverRadius", js.undefined)
    @scala.inline
    def setPointRadiusFunction1(value: /* ctx */ typingsSlinky.chartJs.anon.Chart => Double): Self = this.set("pointRadius", js.Any.fromFunction1(value))
    @scala.inline
    def setPointRadius(value: Double | js.Array[Double] | Scriptable[Double]): Self = this.set("pointRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePointRadius: Self = this.set("pointRadius", js.undefined)
    @scala.inline
    def setPointRotationFunction1(value: /* ctx */ typingsSlinky.chartJs.anon.Chart => Double): Self = this.set("pointRotation", js.Any.fromFunction1(value))
    @scala.inline
    def setPointRotation(value: Double | js.Array[Double] | Scriptable[Double]): Self = this.set("pointRotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePointRotation: Self = this.set("pointRotation", js.undefined)
    @scala.inline
    def setPointStyleFunction1(
      value: /* ctx */ typingsSlinky.chartJs.anon.Chart => PointStyle | HTMLImageElement | HTMLCanvasElement
    ): Self = this.set("pointStyle", js.Any.fromFunction1(value))
    @scala.inline
    def setPointStyleHTMLImageElement(value: HTMLImageElement): Self = this.set("pointStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setPointStyleHTMLCanvasElement(value: HTMLCanvasElement): Self = this.set("pointStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setPointStyle(
      value: PointStyle | HTMLImageElement | HTMLCanvasElement | (js.Array[PointStyle | HTMLImageElement | HTMLCanvasElement]) | (Scriptable[PointStyle | HTMLImageElement | HTMLCanvasElement])
    ): Self = this.set("pointStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePointStyle: Self = this.set("pointStyle", js.undefined)
    @scala.inline
    def setRadiusFunction1(value: /* ctx */ typingsSlinky.chartJs.anon.Chart => Double): Self = this.set("radius", js.Any.fromFunction1(value))
    @scala.inline
    def setRadius(value: Double | js.Array[Double] | Scriptable[Double]): Self = this.set("radius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRadius: Self = this.set("radius", js.undefined)
    @scala.inline
    def setRotationFunction1(value: /* ctx */ typingsSlinky.chartJs.anon.Chart => Double): Self = this.set("rotation", js.Any.fromFunction1(value))
    @scala.inline
    def setRotation(value: Double | js.Array[Double] | Scriptable[Double]): Self = this.set("rotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotation: Self = this.set("rotation", js.undefined)
    @scala.inline
    def setShowLine(value: Boolean): Self = this.set("showLine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowLine: Self = this.set("showLine", js.undefined)
    @scala.inline
    def setSpanGaps(value: Boolean): Self = this.set("spanGaps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpanGaps: Self = this.set("spanGaps", js.undefined)
    @scala.inline
    def setStack(value: String): Self = this.set("stack", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStack: Self = this.set("stack", js.undefined)
    @scala.inline
    def setSteppedLine(value: before | after | middle | Boolean): Self = this.set("steppedLine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSteppedLine: Self = this.set("steppedLine", js.undefined)
    @scala.inline
    def setType(value: ChartType | String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setWeight(value: Double): Self = this.set("weight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeight: Self = this.set("weight", js.undefined)
    @scala.inline
    def setXAxisID(value: String): Self = this.set("xAxisID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXAxisID: Self = this.set("xAxisID", js.undefined)
    @scala.inline
    def setYAxisID(value: String): Self = this.set("yAxisID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYAxisID: Self = this.set("yAxisID", js.undefined)
  }
  
}

