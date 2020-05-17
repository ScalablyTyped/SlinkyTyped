package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the AxisTitle class.
  */
@js.native
trait ASPxClientAxisTitle extends ASPxClientWebChartElement {
  /**
    * Gets the axis to which the axis title belongs.
    */
  var axis: ASPxClientAxisBase = js.native
  /**
    * Gets the text of the axis title.
    */
  var text: String = js.native
}

object ASPxClientAxisTitle {
  @scala.inline
  def apply(axis: ASPxClientAxisBase, chart: ASPxClientWebChart, text: String): ASPxClientAxisTitle = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientAxisTitle]
  }
  @scala.inline
  implicit class ASPxClientAxisTitleOps[Self <: ASPxClientAxisTitle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAxis(value: ASPxClientAxisBase): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

