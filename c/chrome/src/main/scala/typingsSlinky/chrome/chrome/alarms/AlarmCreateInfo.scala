package typingsSlinky.chrome.chrome.alarms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlarmCreateInfo extends js.Object {
  /** Optional. Length of time in minutes after which the onAlarm event should fire.  */
  var delayInMinutes: js.UndefOr[Double] = js.native
  /** Optional. If set, the onAlarm event should fire every periodInMinutes minutes after the initial event specified by when or delayInMinutes. If not set, the alarm will only fire once.  */
  var periodInMinutes: js.UndefOr[Double] = js.native
  /** Optional. Time at which the alarm should fire, in milliseconds past the epoch (e.g. Date.now() + n).  */
  var when: js.UndefOr[Double] = js.native
}

object AlarmCreateInfo {
  @scala.inline
  def apply(): AlarmCreateInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlarmCreateInfo]
  }
  @scala.inline
  implicit class AlarmCreateInfoOps[Self <: AlarmCreateInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelayInMinutes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayInMinutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelayInMinutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayInMinutes")(js.undefined)
        ret
    }
    @scala.inline
    def withPeriodInMinutes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("periodInMinutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeriodInMinutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("periodInMinutes")(js.undefined)
        ret
    }
    @scala.inline
    def withWhen(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("when")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("when")(js.undefined)
        ret
    }
  }
  
}

