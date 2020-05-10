package typingsSlinky.awsSdk.servicequotasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QuotaPeriod extends js.Object {
  /**
    * The time unit of a period.
    */
  var PeriodUnit: js.UndefOr[typingsSlinky.awsSdk.servicequotasMod.PeriodUnit] = js.native
  /**
    * The value of a period.
    */
  var PeriodValue: js.UndefOr[typingsSlinky.awsSdk.servicequotasMod.PeriodValue] = js.native
}

object QuotaPeriod {
  @scala.inline
  def apply(): QuotaPeriod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QuotaPeriod]
  }
  @scala.inline
  implicit class QuotaPeriodOps[Self <: QuotaPeriod] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPeriodUnit(value: PeriodUnit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PeriodUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeriodUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PeriodUnit")(js.undefined)
        ret
    }
    @scala.inline
    def withPeriodValue(value: PeriodValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PeriodValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeriodValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PeriodValue")(js.undefined)
        ret
    }
  }
  
}

