package typingsSlinky.dateFns.anon

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
trait WeekStartsOn extends js.Object {
  var locale: js.UndefOr[typingsSlinky.dateFns.Locale] = js.native
  var weekStartsOn: js.UndefOr[`0` | `1` | `2` | `3` | `4` | `5` | `6`] = js.native
}

object WeekStartsOn {
  @scala.inline
  def apply(): WeekStartsOn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeekStartsOn]
  }
  @scala.inline
  implicit class WeekStartsOnOps[Self <: WeekStartsOn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocale(value: typingsSlinky.dateFns.Locale): Self = {
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

