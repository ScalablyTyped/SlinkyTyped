package typingsSlinky.echarts.echarts.EChartOption

import typingsSlinky.echarts.echarts.EChartOption.BasicComponents.CartesianAxis
import typingsSlinky.echarts.echarts.EChartOption.BasicComponents.CartesianAxis.Type
import typingsSlinky.echarts.echartsStrings.bottom
import typingsSlinky.echarts.echartsStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The x axis in cartesian(rectangular) coordinate.
  * Usually a single grid component can place at most 2 x axis,
  * one on the bottom and another on the top.
  * offset can be used to avoid overlap when you need to put more
  * than two x axis.
  *
  * @see https://echarts.apache.org/en/option.html#xAxis
  */
@js.native
trait XAxis extends CartesianAxis {
  /**
    * The first x axis in grid defaults to be on the bottom of the grid,
    * and the second x axis is on the other side against the first x axis.
    *
    * @default ''
    */
  var position: js.UndefOr[top | bottom] = js.native
  /**
    * Options:
    * + 'value' - Numerical axis, suitable for continuous data.
    * + 'category' Category axis, suitable for discrete category data.
    *   Data should only be set via data for this type.
    * + 'time' Time axis, suitable for continuous time series data.
    *   As compared to value axis, it has a better formatting for time
    *   and a different tick calculation method.
    *   For example, it decides to use month, week, day or hour for tick
    *   based on the range of span.
    * + 'log' Log axis, suitable for log data.
    *
    * @default 'value'
    * @see https://echarts.apache.org/en/option.html#xAxis.type
    */
  var `type`: js.UndefOr[Type] = js.native
}

object XAxis {
  @scala.inline
  def apply(): XAxis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XAxis]
  }
  @scala.inline
  implicit class XAxisOps[Self <: XAxis] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPosition(value: top | bottom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: Type): Self = {
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

