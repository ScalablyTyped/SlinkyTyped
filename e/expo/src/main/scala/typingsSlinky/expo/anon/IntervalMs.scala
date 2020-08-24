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
  var time: js.UndefOr[js.Date | Double] = js.native
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIntervalMs(value: Double): Self = this.set("intervalMs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntervalMs: Self = this.set("intervalMs", js.undefined)
    @scala.inline
    def setRepeat(value: minute | hour | day | week | month | year): Self = this.set("repeat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRepeat: Self = this.set("repeat", js.undefined)
    @scala.inline
    def setTimeDate(value: js.Date): Self = this.set("time", value.asInstanceOf[js.Any])
    @scala.inline
    def setTime(value: js.Date | Double): Self = this.set("time", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTime: Self = this.set("time", js.undefined)
  }
  
}

