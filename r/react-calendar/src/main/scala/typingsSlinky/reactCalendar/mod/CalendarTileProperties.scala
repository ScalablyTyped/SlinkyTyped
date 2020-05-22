package typingsSlinky.reactCalendar.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalendarTileProperties extends js.Object {
  var date: js.Date
  var view: Detail
}

object CalendarTileProperties {
  @scala.inline
  def apply(date: js.Date, view: Detail): CalendarTileProperties = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarTileProperties]
  }
}

