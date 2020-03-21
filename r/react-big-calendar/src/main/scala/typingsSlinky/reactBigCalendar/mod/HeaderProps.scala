package typingsSlinky.reactBigCalendar.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeaderProps extends js.Object {
  var date: js.Date
  var label: String
  var localizer: DateLocalizer
}

object HeaderProps {
  @scala.inline
  def apply(date: js.Date, label: String, localizer: DateLocalizer): HeaderProps = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], localizer = localizer.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HeaderProps]
  }
}

