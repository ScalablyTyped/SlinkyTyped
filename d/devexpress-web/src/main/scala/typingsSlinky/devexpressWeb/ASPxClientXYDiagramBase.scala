package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the base class for all diagram classes, which have X and Y axes.
  */
@js.native
trait ASPxClientXYDiagramBase extends ASPxClientWebChartElement {
  /**
    * Gets the X-axis.
    */
  var axisX: ASPxClientAxisBase = js.native
  /**
    * Gets the Y-axis.
    */
  var axisY: ASPxClientAxisBase = js.native
}

object ASPxClientXYDiagramBase {
  @scala.inline
  def apply(axisX: ASPxClientAxisBase, axisY: ASPxClientAxisBase, chart: ASPxClientWebChart): ASPxClientXYDiagramBase = {
    val __obj = js.Dynamic.literal(axisX = axisX.asInstanceOf[js.Any], axisY = axisY.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientXYDiagramBase]
  }
  @scala.inline
  implicit class ASPxClientXYDiagramBaseOps[Self <: ASPxClientXYDiagramBase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAxisX(value: ASPxClientAxisBase): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAxisY(value: ASPxClientAxisBase): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisY")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

