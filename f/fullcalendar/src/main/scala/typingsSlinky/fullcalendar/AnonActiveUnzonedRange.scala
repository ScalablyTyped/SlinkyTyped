package typingsSlinky.fullcalendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonActiveUnzonedRange extends js.Object {
  var activeUnzonedRange: js.Any = js.native
  var currentRangeUnit: js.Any = js.native
  var currentUnzonedRange: js.Any = js.native
  var date: js.Any = js.native
  var dateIncrement: js.Any = js.native
  var isRangeAllDay: js.Any = js.native
  var isValid: js.Any = js.native
  var maxTime: js.Any = js.native
  var minTime: js.Any = js.native
  var renderUnzonedRange: js.Any = js.native
  var validUnzonedRange: js.Any = js.native
}

object AnonActiveUnzonedRange {
  @scala.inline
  def apply(
    activeUnzonedRange: js.Any,
    currentRangeUnit: js.Any,
    currentUnzonedRange: js.Any,
    date: js.Any,
    dateIncrement: js.Any,
    isRangeAllDay: js.Any,
    isValid: js.Any,
    maxTime: js.Any,
    minTime: js.Any,
    renderUnzonedRange: js.Any,
    validUnzonedRange: js.Any
  ): AnonActiveUnzonedRange = {
    val __obj = js.Dynamic.literal(activeUnzonedRange = activeUnzonedRange.asInstanceOf[js.Any], currentRangeUnit = currentRangeUnit.asInstanceOf[js.Any], currentUnzonedRange = currentUnzonedRange.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], dateIncrement = dateIncrement.asInstanceOf[js.Any], isRangeAllDay = isRangeAllDay.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any], maxTime = maxTime.asInstanceOf[js.Any], minTime = minTime.asInstanceOf[js.Any], renderUnzonedRange = renderUnzonedRange.asInstanceOf[js.Any], validUnzonedRange = validUnzonedRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonActiveUnzonedRange]
  }
  @scala.inline
  implicit class AnonActiveUnzonedRangeOps[Self <: AnonActiveUnzonedRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveUnzonedRange(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeUnzonedRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentRangeUnit(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentRangeUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentUnzonedRange(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentUnzonedRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDate(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDateIncrement(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateIncrement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsRangeAllDay(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRangeAllDay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsValid(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isValid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxTime(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinTime(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderUnzonedRange(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderUnzonedRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidUnzonedRange(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validUnzonedRange")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

