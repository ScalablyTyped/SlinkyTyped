package typingsSlinky.betterQueue.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueueStats extends js.Object {
  var average: Double = js.native
  var peak: Double = js.native
  var successRate: Double = js.native
  var total: Double = js.native
}

object QueueStats {
  @scala.inline
  def apply(average: Double, peak: Double, successRate: Double, total: Double): QueueStats = {
    val __obj = js.Dynamic.literal(average = average.asInstanceOf[js.Any], peak = peak.asInstanceOf[js.Any], successRate = successRate.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueueStats]
  }
  @scala.inline
  implicit class QueueStatsOps[Self <: QueueStats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAverage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("average")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPeak(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peak")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuccessRate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

