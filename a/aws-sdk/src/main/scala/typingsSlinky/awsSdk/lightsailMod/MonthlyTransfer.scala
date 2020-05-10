package typingsSlinky.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MonthlyTransfer extends js.Object {
  /**
    * The amount allocated per month (in GB).
    */
  var gbPerMonthAllocated: js.UndefOr[integer] = js.native
}

object MonthlyTransfer {
  @scala.inline
  def apply(): MonthlyTransfer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MonthlyTransfer]
  }
  @scala.inline
  implicit class MonthlyTransferOps[Self <: MonthlyTransfer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGbPerMonthAllocated(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gbPerMonthAllocated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGbPerMonthAllocated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gbPerMonthAllocated")(js.undefined)
        ret
    }
  }
  
}

