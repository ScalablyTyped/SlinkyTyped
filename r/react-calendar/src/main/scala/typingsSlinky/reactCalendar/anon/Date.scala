package typingsSlinky.reactCalendar.anon

import typingsSlinky.reactCalendar.mod.Detail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Date extends js.Object {
  var date: js.Date
  var label: String
  var view: Detail
}

object Date {
  @scala.inline
  def apply(date: js.Date, label: String, view: Detail): Date = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[Date]
  }
}

