package typingsSlinky.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecurringCharge extends js.Object {
  /**
    * The monetary amount of the recurring charge.
    */
  var RecurringChargeAmount: js.UndefOr[Double] = js.native
  /**
    * The frequency of the recurring charge.
    */
  var RecurringChargeFrequency: js.UndefOr[String] = js.native
}

object RecurringCharge {
  @scala.inline
  def apply(): RecurringCharge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecurringCharge]
  }
  @scala.inline
  implicit class RecurringChargeOps[Self <: RecurringCharge] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRecurringChargeAmount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecurringChargeAmount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecurringChargeAmount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecurringChargeAmount")(js.undefined)
        ret
    }
    @scala.inline
    def withRecurringChargeFrequency(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecurringChargeFrequency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecurringChargeFrequency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecurringChargeFrequency")(js.undefined)
        ret
    }
  }
  
}

