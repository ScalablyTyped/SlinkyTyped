package typingsSlinky.dayzed.mod

import typingsSlinky.dayzed.dayzedNumbers.`0`
import typingsSlinky.dayzed.dayzedNumbers.`10`
import typingsSlinky.dayzed.dayzedNumbers.`11`
import typingsSlinky.dayzed.dayzedNumbers.`1`
import typingsSlinky.dayzed.dayzedNumbers.`2`
import typingsSlinky.dayzed.dayzedNumbers.`3`
import typingsSlinky.dayzed.dayzedNumbers.`4`
import typingsSlinky.dayzed.dayzedNumbers.`5`
import typingsSlinky.dayzed.dayzedNumbers.`6`
import typingsSlinky.dayzed.dayzedNumbers.`7`
import typingsSlinky.dayzed.dayzedNumbers.`8`
import typingsSlinky.dayzed.dayzedNumbers.`9`
import typingsSlinky.dayzed.dayzedStrings._empty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Calendar extends js.Object {
  var firstDayOfMonth: js.Date = js.native
  var lastDayOfMonth: js.Date = js.native
  var month: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` = js.native
  var weeks: js.Array[js.Array[DateObj | _empty]] = js.native
  var year: Double = js.native
}

object Calendar {
  @scala.inline
  def apply(
    firstDayOfMonth: js.Date,
    lastDayOfMonth: js.Date,
    month: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11`,
    weeks: js.Array[js.Array[DateObj | _empty]],
    year: Double
  ): Calendar = {
    val __obj = js.Dynamic.literal(firstDayOfMonth = firstDayOfMonth.asInstanceOf[js.Any], lastDayOfMonth = lastDayOfMonth.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], weeks = weeks.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
    __obj.asInstanceOf[Calendar]
  }
  @scala.inline
  implicit class CalendarOps[Self <: Calendar] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFirstDayOfMonth(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstDayOfMonth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastDayOfMonth(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastDayOfMonth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMonth(value: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("month")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWeeks(value: js.Array[js.Array[DateObj | _empty]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weeks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYear(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("year")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

