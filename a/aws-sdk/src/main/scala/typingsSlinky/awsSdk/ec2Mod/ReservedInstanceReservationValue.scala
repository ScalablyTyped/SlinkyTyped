package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReservedInstanceReservationValue extends js.Object {
  /**
    * The total value of the Convertible Reserved Instance that you are exchanging.
    */
  var ReservationValue: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.ReservationValue] = js.native
  /**
    * The ID of the Convertible Reserved Instance that you are exchanging.
    */
  var ReservedInstanceId: js.UndefOr[String] = js.native
}

object ReservedInstanceReservationValue {
  @scala.inline
  def apply(): ReservedInstanceReservationValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservedInstanceReservationValue]
  }
  @scala.inline
  implicit class ReservedInstanceReservationValueOps[Self <: ReservedInstanceReservationValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReservationValue(value: ReservationValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReservationValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReservationValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReservationValue")(js.undefined)
        ret
    }
    @scala.inline
    def withReservedInstanceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReservedInstanceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReservedInstanceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReservedInstanceId")(js.undefined)
        ret
    }
  }
  
}

