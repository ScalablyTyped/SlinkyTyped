package typingsSlinky.gldatepicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlDatePickerDateRange extends js.Object {
  var from: js.Date
  var repeatYear: js.UndefOr[Boolean] = js.undefined
  var to: js.UndefOr[js.Date] = js.undefined
}

object GlDatePickerDateRange {
  @scala.inline
  def apply(from: js.Date, repeatYear: js.UndefOr[Boolean] = js.undefined, to: js.Date = null): GlDatePickerDateRange = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any])
    if (!js.isUndefined(repeatYear)) __obj.updateDynamic("repeatYear")(repeatYear.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlDatePickerDateRange]
  }
}

