package typingsSlinky.awsDashSdk.clientsInspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimestampRange extends js.Object {
  /**
    * The minimum value of the timestamp range.
    */
  var beginDate: js.UndefOr[js.Date] = js.native
  /**
    * The maximum value of the timestamp range.
    */
  var endDate: js.UndefOr[js.Date] = js.native
}

object TimestampRange {
  @scala.inline
  def apply(beginDate: js.Date = null, endDate: js.Date = null): TimestampRange = {
    val __obj = js.Dynamic.literal()
    if (beginDate != null) __obj.updateDynamic("beginDate")(beginDate.asInstanceOf[js.Any])
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimestampRange]
  }
}

