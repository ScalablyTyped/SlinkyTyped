package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReservationValue extends js.Object {
  /**
    * The hourly rate of the reservation.
    */
  var HourlyPrice: js.UndefOr[String] = js.native
  /**
    * The balance of the total value (the sum of remainingUpfrontValue + hourlyPrice * number of hours remaining).
    */
  var RemainingTotalValue: js.UndefOr[String] = js.native
  /**
    * The remaining upfront cost of the reservation.
    */
  var RemainingUpfrontValue: js.UndefOr[String] = js.native
}

object ReservationValue {
  @scala.inline
  def apply(): ReservationValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservationValue]
  }
  @scala.inline
  implicit class ReservationValueOps[Self <: ReservationValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHourlyPrice(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HourlyPrice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHourlyPrice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HourlyPrice")(js.undefined)
        ret
    }
    @scala.inline
    def withRemainingTotalValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemainingTotalValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemainingTotalValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemainingTotalValue")(js.undefined)
        ret
    }
    @scala.inline
    def withRemainingUpfrontValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemainingUpfrontValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemainingUpfrontValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemainingUpfrontValue")(js.undefined)
        ret
    }
  }
  
}

