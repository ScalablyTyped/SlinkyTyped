package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the ChartElement class.
  */
@js.native
trait ASPxClientWebChartElement extends js.Object {
  /**
    * Gets the chart that owns the current chart element.
    */
  var chart: ASPxClientWebChart = js.native
}

object ASPxClientWebChartElement {
  @scala.inline
  def apply(chart: ASPxClientWebChart): ASPxClientWebChartElement = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientWebChartElement]
  }
  @scala.inline
  implicit class ASPxClientWebChartElementOps[Self <: ASPxClientWebChartElement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChart(value: ASPxClientWebChart): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chart")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

