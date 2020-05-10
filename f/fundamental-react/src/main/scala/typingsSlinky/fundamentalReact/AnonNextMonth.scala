package typingsSlinky.fundamentalReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonNextMonth extends js.Object {
  var nextMonth: js.UndefOr[String] = js.native
  var previousMonth: js.UndefOr[String] = js.native
  var show12NextYears: js.UndefOr[String] = js.native
  var show12PreviousYears: js.UndefOr[String] = js.native
}

object AnonNextMonth {
  @scala.inline
  def apply(): AnonNextMonth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonNextMonth]
  }
  @scala.inline
  implicit class AnonNextMonthOps[Self <: AnonNextMonth] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextMonth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextMonth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextMonth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextMonth")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviousMonth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousMonth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviousMonth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousMonth")(js.undefined)
        ret
    }
    @scala.inline
    def withShow12NextYears(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show12NextYears")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShow12NextYears: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show12NextYears")(js.undefined)
        ret
    }
    @scala.inline
    def withShow12PreviousYears(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show12PreviousYears")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShow12PreviousYears: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show12PreviousYears")(js.undefined)
        ret
    }
  }
  
}

