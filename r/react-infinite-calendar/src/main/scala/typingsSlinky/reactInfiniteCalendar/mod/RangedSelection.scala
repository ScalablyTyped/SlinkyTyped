package typingsSlinky.reactInfiniteCalendar.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangedSelection extends js.Object {
  var end: js.Date
  var eventType: EVENT_TYPE
  var start: js.Date
}

object RangedSelection {
  @scala.inline
  def apply(end: js.Date, eventType: EVENT_TYPE, start: js.Date): RangedSelection = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], eventType = eventType.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangedSelection]
  }
}

