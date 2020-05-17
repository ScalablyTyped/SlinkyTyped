package typingsSlinky.dateFns.anon

import typingsSlinky.dateFns.dateFnsNumbers.`0`
import typingsSlinky.dateFns.dateFnsNumbers.`1`
import typingsSlinky.dateFns.dateFnsNumbers.`2`
import typingsSlinky.dateFns.dateFnsNumbers.`3`
import typingsSlinky.dateFns.dateFnsNumbers.`4`
import typingsSlinky.dateFns.dateFnsNumbers.`5`
import typingsSlinky.dateFns.dateFnsNumbers.`6`
import typingsSlinky.dateFns.dateFnsNumbers.`7`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirstWeekContainsDateLocaleWeekStartsOn extends js.Object {
  var firstWeekContainsDate: js.UndefOr[`1` | `2` | `3` | `4` | `5` | `6` | `7`] = js.native
  var locale: js.UndefOr[typingsSlinky.dateFns.mod.Locale] = js.native
  var weekStartsOn: js.UndefOr[`0` | `1` | `2` | `3` | `4` | `5` | `6`] = js.native
}

object FirstWeekContainsDateLocaleWeekStartsOn {
  @scala.inline
  def apply(): FirstWeekContainsDateLocaleWeekStartsOn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirstWeekContainsDateLocaleWeekStartsOn]
  }
  @scala.inline
  implicit class FirstWeekContainsDateLocaleWeekStartsOnOps[Self <: FirstWeekContainsDateLocaleWeekStartsOn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFirstWeekContainsDate(value: `1` | `2` | `3` | `4` | `5` | `6` | `7`): Self = {
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
    def withLocale(value: typingsSlinky.dateFns.mod.Locale): Self = {
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

