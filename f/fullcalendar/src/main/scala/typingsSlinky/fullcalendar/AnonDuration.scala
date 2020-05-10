package typingsSlinky.fullcalendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDuration extends js.Object {
  var duration: js.Any = js.native
  var unit: js.Any = js.native
  var unzonedRange: js.Any = js.native
}

object AnonDuration {
  @scala.inline
  def apply(duration: js.Any, unit: js.Any, unzonedRange: js.Any): AnonDuration = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any], unzonedRange = unzonedRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDuration]
  }
  @scala.inline
  implicit class AnonDurationOps[Self <: AnonDuration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDuration(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnit(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnzonedRange(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unzonedRange")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

