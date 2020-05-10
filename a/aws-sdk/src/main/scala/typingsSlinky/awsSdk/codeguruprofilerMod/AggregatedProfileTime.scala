package typingsSlinky.awsSdk.codeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AggregatedProfileTime extends js.Object {
  /**
    * The time period.
    */
  var period: js.UndefOr[AggregationPeriod] = js.native
  /**
    * The start time.
    */
  var start: js.UndefOr[js.Date] = js.native
}

object AggregatedProfileTime {
  @scala.inline
  def apply(): AggregatedProfileTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregatedProfileTime]
  }
  @scala.inline
  implicit class AggregatedProfileTimeOps[Self <: AggregatedProfileTime] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPeriod(value: AggregationPeriod): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("period")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("period")(js.undefined)
        ret
    }
    @scala.inline
    def withStart(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.undefined)
        ret
    }
  }
  
}

