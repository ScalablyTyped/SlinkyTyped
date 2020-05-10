package typingsSlinky.canvasjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartDataPoint extends ChartDataCommon {
  /**
    * Sets the exploded value of dataPoint. It is applicable only in case of Pie and Doughnut Charts. This property causes the Pie/Doughnut slice to separate out.
    * Default: true
    * Example: true, false
    */
  var exploded: js.UndefOr[Boolean] = js.native
  /**
    * Sets label value of a dataPoint. The value appears next to the dataPoint on axisX Line. If not provided, it takes x value for label.
    * Default: x value
    * Example: "label1", "label2"..
    */
  var label: js.UndefOr[String] = js.native
  /**
    * Sets the x value. It determines the position of the dataPoint on X Axis. It can be numeric or a dateTime value. Values can be positive or Negative.
    * If no x value is provided, they are automatically set sequentially starting from zero
    * Default: null
    * Example: 10, 20, 30 ..
    * new Date(2011, 08, 01)
    */
  var x: js.UndefOr[Double | js.Date] = js.native
  /**
    * Sets the y value of dataPoint. It determines the position of dataPoint on Y Axis. Values can be positive or Negative
    * Default: null
    * Example: 5, 20, -30 ..
    */
  var y: js.UndefOr[Double | Null] = js.native
  /**
    * Sets the z value of dataPoint. It is only applicable in case of Bubble chart. This value determines the size of the bubble.
    * Default: 1
    * Example: 10, 20, 35..
    */
  var z: js.UndefOr[Double] = js.native
}

object ChartDataPoint {
  @scala.inline
  def apply(): ChartDataPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartDataPoint]
  }
  @scala.inline
  implicit class ChartDataPointOps[Self <: ChartDataPoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExploded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exploded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExploded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exploded")(js.undefined)
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
    def withXDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX(value: Double | js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(js.undefined)
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(js.undefined)
        ret
    }
    @scala.inline
    def withYNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(null)
        ret
    }
    @scala.inline
    def withZ(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("z")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZ: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("z")(js.undefined)
        ret
    }
  }
  
}

