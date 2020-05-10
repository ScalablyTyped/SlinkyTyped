package typingsSlinky.ably.mod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatsResourceCount extends js.Object {
  var mean: Double = js.native
  var min: Double = js.native
  var opened: Double = js.native
  var peak: Double = js.native
  var refused: Double = js.native
}

object StatsResourceCount {
  @scala.inline
  def apply(mean: Double, min: Double, opened: Double, peak: Double, refused: Double): StatsResourceCount = {
    val __obj = js.Dynamic.literal(mean = mean.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], opened = opened.asInstanceOf[js.Any], peak = peak.asInstanceOf[js.Any], refused = refused.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatsResourceCount]
  }
  @scala.inline
  implicit class StatsResourceCountOps[Self <: StatsResourceCount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMean(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mean")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpened(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opened")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPeak(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peak")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefused(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refused")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

