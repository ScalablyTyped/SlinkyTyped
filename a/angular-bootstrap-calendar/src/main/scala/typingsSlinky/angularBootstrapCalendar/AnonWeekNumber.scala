package typingsSlinky.angularBootstrapCalendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonWeekNumber extends js.Object {
  var weekNumber: String = js.native
}

object AnonWeekNumber {
  @scala.inline
  def apply(weekNumber: String): AnonWeekNumber = {
    val __obj = js.Dynamic.literal(weekNumber = weekNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonWeekNumber]
  }
  @scala.inline
  implicit class AnonWeekNumberOps[Self <: AnonWeekNumber] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWeekNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekNumber")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

