package typingsSlinky.onionoo.anon

import typingsSlinky.onionoo.mod.Onionoo.Histogram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Record<'3_days' | '1_week' | '1_month' | '6_months' | '1_year' | '5_years', onionoo.onionoo.Onionoo.Histogram>> */
@js.native
trait PartialRecord3days1week1m extends js.Object {
  var `1_month`: js.UndefOr[Histogram] = js.native
  var `1_week`: js.UndefOr[Histogram] = js.native
  var `1_year`: js.UndefOr[Histogram] = js.native
  var `3_days`: js.UndefOr[Histogram] = js.native
  var `5_years`: js.UndefOr[Histogram] = js.native
  var `6_months`: js.UndefOr[Histogram] = js.native
}

object PartialRecord3days1week1m {
  @scala.inline
  def apply(): PartialRecord3days1week1m = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRecord3days1week1m]
  }
  @scala.inline
  implicit class PartialRecord3days1week1mOps[Self <: PartialRecord3days1week1m] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with1_month(value: Histogram): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("1_month")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without1_month: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("1_month")(js.undefined)
        ret
    }
    @scala.inline
    def with1_week(value: Histogram): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("1_week")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without1_week: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("1_week")(js.undefined)
        ret
    }
    @scala.inline
    def with1_year(value: Histogram): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("1_year")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without1_year: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("1_year")(js.undefined)
        ret
    }
    @scala.inline
    def with3_days(value: Histogram): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("3_days")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without3_days: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("3_days")(js.undefined)
        ret
    }
    @scala.inline
    def with5_years(value: Histogram): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("5_years")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without5_years: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("5_years")(js.undefined)
        ret
    }
    @scala.inline
    def with6_months(value: Histogram): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("6_months")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without6_months: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("6_months")(js.undefined)
        ret
    }
  }
  
}

