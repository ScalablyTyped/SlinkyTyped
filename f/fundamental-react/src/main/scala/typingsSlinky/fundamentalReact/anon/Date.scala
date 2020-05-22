package typingsSlinky.fundamentalReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Date extends js.Object {
  var date: js.Date
  var formattedDate: String
}

object Date {
  @scala.inline
  def apply(date: js.Date, formattedDate: String): Date = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], formattedDate = formattedDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Date]
  }
}

