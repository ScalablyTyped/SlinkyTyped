package typingsSlinky.expo.anon

import typingsSlinky.expo.expoStrings.day
import typingsSlinky.expo.expoStrings.hour
import typingsSlinky.expo.expoStrings.minute
import typingsSlinky.expo.expoStrings.month
import typingsSlinky.expo.expoStrings.week
import typingsSlinky.expo.expoStrings.year
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntervalMs extends js.Object {
  var intervalMs: js.UndefOr[Double] = js.native
  var repeat: js.UndefOr[minute | hour | day | week | month | year] = js.native
  var time: js.UndefOr[Double | js.Date] = js.native
}

object IntervalMs {
  @scala.inline
  def apply(): IntervalMs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IntervalMs]
  }
  @scala.inline
  implicit class IntervalMsOps[Self <: IntervalMs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIntervalMs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intervalMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntervalMs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intervalMs")(js.undefined)
        ret
    }
    @scala.inline
    def withRepeat(value: minute | hour | day | week | month | year): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repeat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepeat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repeat")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTime(value: Double | js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(js.undefined)
        ret
    }
  }
  
}

