package typingsSlinky.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBeginDate extends js.Object {
  var beginDate: js.Date
  var endDate: js.UndefOr[js.Date] = js.undefined
  var id: String
}

object AnonBeginDate {
  @scala.inline
  def apply(beginDate: js.Date, id: String, endDate: js.Date = null): AnonBeginDate = {
    val __obj = js.Dynamic.literal(beginDate = beginDate.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBeginDate]
  }
}

