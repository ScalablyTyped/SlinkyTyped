package typingsSlinky.jsJoda.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToDate extends js.Object {
  def toDate(): js.Date = js.native
  def toEpochMilli(): Double = js.native
}

object ToDate {
  @scala.inline
  def apply(toDate: () => js.Date, toEpochMilli: () => Double): ToDate = {
    val __obj = js.Dynamic.literal(toDate = js.Any.fromFunction0(toDate), toEpochMilli = js.Any.fromFunction0(toEpochMilli))
    __obj.asInstanceOf[ToDate]
  }
  @scala.inline
  implicit class ToDateOps[Self <: ToDate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withToDate(value: () => js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toDate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToEpochMilli(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toEpochMilli")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

