package typingsSlinky.reactBigCalendar.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateRange extends js.Object {
  var end: js.Date
  var start: js.Date
}

object DateRange {
  @scala.inline
  def apply(end: js.Date, start: js.Date): DateRange = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DateRange]
  }
}

