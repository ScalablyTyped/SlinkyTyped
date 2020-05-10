package typingsSlinky.dateFns

import typingsSlinky.dateFns.dateFnsNumbers.`0`
import typingsSlinky.dateFns.dateFnsNumbers.`1`
import typingsSlinky.dateFns.dateFnsNumbers.`2`
import typingsSlinky.dateFns.dateFnsNumbers.`3`
import typingsSlinky.dateFns.dateFnsNumbers.`4`
import typingsSlinky.dateFns.dateFnsNumbers.`5`
import typingsSlinky.dateFns.dateFnsNumbers.`6`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonUseAdditionalWeekYearTokens extends js.Object {
  var firstWeekContainsDate: js.UndefOr[Double] = js.native
  var locale: js.UndefOr[Locale] = js.native
  var useAdditionalDayOfYearTokens: js.UndefOr[Boolean] = js.native
  var useAdditionalWeekYearTokens: js.UndefOr[Boolean] = js.native
  var weekStartsOn: js.UndefOr[`0` | `1` | `2` | `3` | `4` | `5` | `6`] = js.native
}

object AnonUseAdditionalWeekYearTokens {
  @scala.inline
  def apply(): AnonUseAdditionalWeekYearTokens = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonUseAdditionalWeekYearTokens]
  }
  @scala.inline
  implicit class AnonUseAdditionalWeekYearTokensOps[Self <: AnonUseAdditionalWeekYearTokens] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFirstWeekContainsDate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstWeekContainsDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstWeekContainsDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstWeekContainsDate")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: Locale): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withUseAdditionalDayOfYearTokens(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useAdditionalDayOfYearTokens")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseAdditionalDayOfYearTokens: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useAdditionalDayOfYearTokens")(js.undefined)
        ret
    }
    @scala.inline
    def withUseAdditionalWeekYearTokens(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useAdditionalWeekYearTokens")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseAdditionalWeekYearTokens: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useAdditionalWeekYearTokens")(js.undefined)
        ret
    }
    @scala.inline
    def withWeekStartsOn(value: `0` | `1` | `2` | `3` | `4` | `5` | `6`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekStartsOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeekStartsOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekStartsOn")(js.undefined)
        ret
    }
  }
  
}

