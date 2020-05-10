package typingsSlinky.highcharts.highchartsMoreMod.highchartsAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointOptionsObject extends js.Object {
  /**
    * Range series only. The high or maximum value for each data point.
    */
  var high: js.UndefOr[Double] = js.native
  /**
    * Range series only. The low or minimum value for each data point.
    */
  var low: js.UndefOr[Double] = js.native
}

object PointOptionsObject {
  @scala.inline
  def apply(): PointOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PointOptionsObject]
  }
  @scala.inline
  implicit class PointOptionsObjectOps[Self <: PointOptionsObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHigh(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("high")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHigh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("high")(js.undefined)
        ret
    }
    @scala.inline
    def withLow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("low")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("low")(js.undefined)
        ret
    }
  }
  
}

