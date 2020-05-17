package typingsSlinky.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DelayInMinutes extends js.Object {
  /** Number of minutes from the current time after which the alarm should first fire. */
  var delayInMinutes: js.UndefOr[Double] = js.native
  /** Number of minutes after which the alarm should recur repeatedly. */
  var periodInMinutes: js.UndefOr[Double] = js.native
  /** Time when the alarm is scheduled to first fire, in milliseconds past the epoch. */
  var when: js.UndefOr[Double] = js.native
}

object DelayInMinutes {
  @scala.inline
  def apply(): DelayInMinutes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DelayInMinutes]
  }
  @scala.inline
  implicit class DelayInMinutesOps[Self <: DelayInMinutes] (val x: Self) extends AnyVal {
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

