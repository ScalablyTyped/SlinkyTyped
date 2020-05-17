package typingsSlinky.devextreme.anon

import typingsSlinky.devextreme.mod.DevExpress.viz.VizTimeInterval
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Days extends VizTimeInterval {
  var days: js.UndefOr[Double] = js.native
  var hours: js.UndefOr[Double] = js.native
  var milliseconds: js.UndefOr[Double] = js.native
  var minutes: js.UndefOr[Double] = js.native
  var months: js.UndefOr[Double] = js.native
  var quarters: js.UndefOr[Double] = js.native
  var seconds: js.UndefOr[Double] = js.native
  var weeks: js.UndefOr[Double] = js.native
  var years: js.UndefOr[Double] = js.native
}

object Days {
  @scala.inline
  def apply(): Days = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Days]
  }
  @scala.inline
  implicit class DaysOps[Self <: Days] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDays(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("days")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("days")(js.undefined)
        ret
    }
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
    def withMilliseconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("milliseconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMilliseconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("milliseconds")(js.undefined)
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
    def withMonths(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("months")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("months")(js.undefined)
        ret
    }
    @scala.inline
    def withQuarters(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quarters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuarters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quarters")(js.undefined)
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
    def withWeeks(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weeks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeeks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weeks")(js.undefined)
        ret
    }
    @scala.inline
    def withYears(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("years")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYears: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("years")(js.undefined)
        ret
    }
  }
  
}

