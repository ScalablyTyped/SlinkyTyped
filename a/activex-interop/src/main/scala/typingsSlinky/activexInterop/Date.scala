package typingsSlinky.activexInterop

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Date extends js.Object {
  def getVarDate(): VarDate = js.native
}

object Date {
  @scala.inline
  def apply(getVarDate: () => VarDate): Date = {
    val __obj = js.Dynamic.literal(getVarDate = js.Any.fromFunction0(getVarDate))
    __obj.asInstanceOf[Date]
  }
  @scala.inline
  implicit class DateOps[Self <: Date] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetVarDate(value: () => VarDate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getVarDate")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

