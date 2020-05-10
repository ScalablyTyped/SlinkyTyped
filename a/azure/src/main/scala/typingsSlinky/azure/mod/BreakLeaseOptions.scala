package typingsSlinky.azure.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BreakLeaseOptions extends AccessConditionsOptions {
  var leaseBreakPeriod: js.UndefOr[Double] = js.native
}

object BreakLeaseOptions {
  @scala.inline
  def apply(): BreakLeaseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BreakLeaseOptions]
  }
  @scala.inline
  implicit class BreakLeaseOptionsOps[Self <: BreakLeaseOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLeaseBreakPeriod(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leaseBreakPeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeaseBreakPeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leaseBreakPeriod")(js.undefined)
        ret
    }
  }
  
}

