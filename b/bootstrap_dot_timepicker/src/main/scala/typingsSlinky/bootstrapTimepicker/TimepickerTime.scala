package typingsSlinky.bootstrapTimepicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimepickerTime extends js.Object {
  var hours: js.UndefOr[Double] = js.native
  var meridian: js.UndefOr[String] = js.native
  var minutes: js.UndefOr[Double] = js.native
  var seconds: js.UndefOr[Double] = js.native
  var value: js.UndefOr[String] = js.native
}

object TimepickerTime {
  @scala.inline
  def apply(): TimepickerTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimepickerTime]
  }
  @scala.inline
  implicit class TimepickerTimeOps[Self <: TimepickerTime] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHours(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hours")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHours: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hours")(js.undefined)
        ret
    }
    @scala.inline
    def withMeridian(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meridian")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeridian: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meridian")(js.undefined)
        ret
    }
    @scala.inline
    def withMinutes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minutes")(js.undefined)
        ret
    }
    @scala.inline
    def withSeconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seconds")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

