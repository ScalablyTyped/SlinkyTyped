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

trait Calendar extends js.Object {
  var firstDayOfMonth: js.Date
  var lastDayOfMonth: js.Date
  var month: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11`
  var weeks: js.Array[js.Array[DateObj | _empty]]
  var year: Double
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
}

