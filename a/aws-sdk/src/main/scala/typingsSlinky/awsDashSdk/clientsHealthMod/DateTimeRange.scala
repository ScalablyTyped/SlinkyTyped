package typingsSlinky.awsDashSdk.clientsHealthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateTimeRange extends js.Object {
  /**
    * The starting date and time of a time range.
    */
  var from: js.UndefOr[js.Date] = js.native
  /**
    * The ending date and time of a time range.
    */
  var to: js.UndefOr[js.Date] = js.native
}

object DateTimeRange {
  @scala.inline
  def apply(from: js.Date = null, to: js.Date = null): DateTimeRange = {
    val __obj = js.Dynamic.literal()
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateTimeRange]
  }
}

