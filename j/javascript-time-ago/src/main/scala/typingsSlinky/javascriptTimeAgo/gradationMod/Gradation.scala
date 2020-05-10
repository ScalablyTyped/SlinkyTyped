package typingsSlinky.javascriptTimeAgo.gradationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Gradation extends js.Object {
  var factor: js.UndefOr[Double] = js.native
  var granularity: js.UndefOr[Double] = js.native
  var threshold: js.UndefOr[Double] = js.native
  var threshold_for_day: js.UndefOr[Double] = js.native
  var threshold_for_hour: js.UndefOr[Double] = js.native
  var threshold_for_minute: js.UndefOr[Double] = js.native
  var threshold_for_month: js.UndefOr[Double] = js.native
  var threshold_for_now: js.UndefOr[Double] = js.native
  var threshold_for_second: js.UndefOr[Double] = js.native
  var threshold_for_week: js.UndefOr[Double] = js.native
  var threshold_for_year: js.UndefOr[Double] = js.native
  var unit: js.UndefOr[Unit] = js.native
}

object Gradation {
  @scala.inline
  def apply(): Gradation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Gradation]
  }
  @scala.inline
  implicit class GradationOps[Self <: Gradation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFactor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("factor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFactor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("factor")(js.undefined)
        ret
    }
    @scala.inline
    def withGranularity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("granularity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGranularity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("granularity")(js.undefined)
        ret
    }
    @scala.inline
    def withThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold")(js.undefined)
        ret
    }
    @scala.inline
    def withThreshold_for_day(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold_for_day")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThreshold_for_day: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold_for_day")(js.undefined)
        ret
    }
    @scala.inline
    def withThreshold_for_hour(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold_for_hour")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThreshold_for_hour: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold_for_hour")(js.undefined)
        ret
    }
    @scala.inline
    def withThreshold_for_minute(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold_for_minute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThreshold_for_minute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold_for_minute")(js.undefined)
        ret
    }
    @scala.inline
    def withThreshold_for_month(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold_for_month")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThreshold_for_month: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold_for_month")(js.undefined)
        ret
    }
    @scala.inline
    def withThreshold_for_now(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold_for_now")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThreshold_for_now: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold_for_now")(js.undefined)
        ret
    }
    @scala.inline
    def withThreshold_for_second(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold_for_second")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThreshold_for_second: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold_for_second")(js.undefined)
        ret
    }
    @scala.inline
    def withThreshold_for_week(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold_for_week")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThreshold_for_week: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold_for_week")(js.undefined)
        ret
    }
    @scala.inline
    def withThreshold_for_year(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold_for_year")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThreshold_for_year: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold_for_year")(js.undefined)
        ret
    }
    @scala.inline
    def withUnit(value: Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unit")(js.undefined)
        ret
    }
  }
  
}

