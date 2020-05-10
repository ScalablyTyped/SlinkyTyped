package typingsSlinky.oracleOraclejet.ojdatetimepickerMod.ojInputDate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
@js.native
trait DayFormatterInput extends js.Object {
  var date: Double = js.native
  var fullYear: Double = js.native
  var month: Double = js.native
}

object DayFormatterInput {
  @scala.inline
  def apply(date: Double, fullYear: Double, month: Double): DayFormatterInput = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], fullYear = fullYear.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any])
    __obj.asInstanceOf[DayFormatterInput]
  }
  @scala.inline
  implicit class DayFormatterInputOps[Self <: DayFormatterInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFullYear(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullYear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMonth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("month")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

