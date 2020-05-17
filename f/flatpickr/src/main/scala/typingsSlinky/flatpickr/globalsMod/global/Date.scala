package typingsSlinky.flatpickr.globalsMod.global

import typingsSlinky.flatpickr.optionsMod.DateOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Date extends DateOption {
  def fp_incr(n: Double): Date = js.native
}

object Date {
  @scala.inline
  def apply(fp_incr: Double => Date): Date = {
    val __obj = js.Dynamic.literal(fp_incr = js.Any.fromFunction1(fp_incr))
    __obj.asInstanceOf[Date]
  }
  @scala.inline
  implicit class DateOps[Self <: Date] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFp_incr(value: Double => Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fp_incr")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

