package typingsSlinky.rmcCalendar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirstDate extends js.Object {
  var firstDate: js.Date
  var lastDate: js.Date
}

object FirstDate {
  @scala.inline
  def apply(firstDate: js.Date, lastDate: js.Date): FirstDate = {
    val __obj = js.Dynamic.literal(firstDate = firstDate.asInstanceOf[js.Any], lastDate = lastDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirstDate]
  }
}

