package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the AxisLabelItem class.
  */
@js.native
trait ASPxClientAxisLabelItem extends ASPxClientWebChartElement {
  /**
    * Gets the axis to which an axis label item belongs.
    */
  var axis: ASPxClientAxisBase = js.native
  /**
    * Gets the axis value to which an axis label item corresponds.
    */
  var axisValue: js.Any = js.native
  /**
    * Gets the internal representation of the axis value to which an axis label item corresponds.
    */
  var axisValueInternal: Double = js.native
  /**
    * Gets the text of an axis label item.
    */
  var text: String = js.native
}

object ASPxClientAxisLabelItem {
  @scala.inline
  def apply(
    axis: ASPxClientAxisBase,
    axisValue: js.Any,
    axisValueInternal: Double,
    chart: ASPxClientWebChart,
    text: String
  ): ASPxClientAxisLabelItem = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], axisValue = axisValue.asInstanceOf[js.Any], axisValueInternal = axisValueInternal.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientAxisLabelItem]
  }
  @scala.inline
  implicit class ASPxClientAxisLabelItemOps[Self <: ASPxClientAxisLabelItem] (val x: Self) extends AnyVal {
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
    def withAxisValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAxisValueInternal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisValueInternal")(value.asInstanceOf[js.Any])
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

