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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFirstDayOfMonth(value: js.Date): Self = this.set("firstDayOfMonth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastDayOfMonth(value: js.Date): Self = this.set("lastDayOfMonth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonth(value: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11`): Self = this.set("month", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeeksVarargs(value: (js.Array[DateObj | _empty])*): Self = this.set("weeks", js.Array(value :_*))
    
    @scala.inline
    def setWeeks(value: js.Array[js.Array[DateObj | _empty]]): Self = this.set("weeks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYear(value: Double): Self = this.set("year", value.asInstanceOf[js.Any])
  }
}
