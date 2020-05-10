package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetReservationValue extends js.Object {
  /**
    * The total value of the Convertible Reserved Instances that make up the exchange. This is the sum of the list value, remaining upfront price, and additional upfront cost of the exchange.
    */
  var ReservationValue: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.ReservationValue] = js.native
  /**
    * The configuration of the Convertible Reserved Instances that make up the exchange.
    */
  var TargetConfiguration: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.TargetConfiguration] = js.native
}

object TargetReservationValue {
  @scala.inline
  def apply(): TargetReservationValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetReservationValue]
  }
  @scala.inline
  implicit class TargetReservationValueOps[Self <: TargetReservationValue] (val x: Self) extends AnyVal {
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
    def withTargetConfiguration(value: TargetConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetConfiguration")(js.undefined)
        ret
    }
  }
  
}

