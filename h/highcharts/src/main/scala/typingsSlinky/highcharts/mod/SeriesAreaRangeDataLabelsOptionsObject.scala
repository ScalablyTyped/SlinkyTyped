package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SeriesAreaRangeDataLabelsOptionsObject extends DataLabelsOptionsObject {
  /**
    * (Highcharts, Highstock) X offset of the higher data labels relative to
    * the point value.
    */
  var xHigh: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock) X offset of the lower data labels relative to the
    * point value.
    */
  var xLow: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock) Y offset of the higher data labels relative to
    * the point value.
    */
  var yHigh: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock) Y offset of the lower data labels relative to the
    * point value.
    */
  var yLow: js.UndefOr[Double] = js.native
}

object SeriesAreaRangeDataLabelsOptionsObject {
  @scala.inline
  def apply(): SeriesAreaRangeDataLabelsOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesAreaRangeDataLabelsOptionsObject]
  }
  @scala.inline
  implicit class SeriesAreaRangeDataLabelsOptionsObjectOps[Self <: SeriesAreaRangeDataLabelsOptionsObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withXHigh(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xHigh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXHigh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xHigh")(js.undefined)
        ret
    }
    @scala.inline
    def withXLow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xLow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXLow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xLow")(js.undefined)
        ret
    }
    @scala.inline
    def withYHigh(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yHigh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYHigh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yHigh")(js.undefined)
        ret
    }
    @scala.inline
    def withYLow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yLow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYLow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yLow")(js.undefined)
        ret
    }
  }
  
}

