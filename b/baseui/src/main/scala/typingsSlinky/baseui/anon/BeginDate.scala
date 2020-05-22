package typingsSlinky.baseui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeginDate extends js.Object {
  var beginDate: js.Date
  var endDate: js.UndefOr[js.Date] = js.undefined
  var id: String
}

object BeginDate {
  @scala.inline
  def apply(beginDate: js.Date, id: String, endDate: js.Date = null): BeginDate = {
    val __obj = js.Dynamic.literal(beginDate = beginDate.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeginDate]
  }
}

