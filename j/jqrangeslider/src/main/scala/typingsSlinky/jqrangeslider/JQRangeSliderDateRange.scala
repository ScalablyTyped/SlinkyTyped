package typingsSlinky.jqrangeslider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQRangeSliderDateRange extends js.Object {
  var max: js.UndefOr[js.Date] = js.undefined
  var min: js.UndefOr[js.Date] = js.undefined
}

object JQRangeSliderDateRange {
  @scala.inline
  def apply(max: js.Date = null, min: js.Date = null): JQRangeSliderDateRange = {
    val __obj = js.Dynamic.literal()
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQRangeSliderDateRange]
  }
}

