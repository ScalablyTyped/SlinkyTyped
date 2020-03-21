package typingsSlinky.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDate extends js.Object {
  var date: js.Date | js.Array[js.Date]
}

object AnonDate {
  @scala.inline
  def apply(date: js.Date | js.Array[js.Date]): AnonDate = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDate]
  }
}

