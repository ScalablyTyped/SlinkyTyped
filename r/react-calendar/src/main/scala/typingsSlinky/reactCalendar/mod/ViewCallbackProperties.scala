package typingsSlinky.reactCalendar.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewCallbackProperties extends js.Object {
  var activeStartDate: js.Date
  var view: Detail
}

object ViewCallbackProperties {
  @scala.inline
  def apply(activeStartDate: js.Date, view: Detail): ViewCallbackProperties = {
    val __obj = js.Dynamic.literal(activeStartDate = activeStartDate.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewCallbackProperties]
  }
}

