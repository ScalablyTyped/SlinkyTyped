package typingsSlinky.mailgunJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Interval extends js.Object {
  var interval: Double = js.native
  var times: Double = js.native
}

object Interval {
  @scala.inline
  def apply(interval: Double, times: Double): Interval = {
    val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any], times = times.asInstanceOf[js.Any])
    __obj.asInstanceOf[Interval]
  }
  @scala.inline
  implicit class IntervalOps[Self <: Interval] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("times")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

