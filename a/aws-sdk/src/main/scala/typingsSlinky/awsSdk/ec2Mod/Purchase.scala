package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Purchase extends js.Object {
  /**
    * The currency in which the UpfrontPrice and HourlyPrice amounts are specified. At this time, the only supported currency is USD.
    */
  var CurrencyCode: js.UndefOr[CurrencyCodeValues] = js.native
  /**
    * The duration of the reservation's term in seconds.
    */
  var Duration: js.UndefOr[Integer] = js.native
  /**
    * The IDs of the Dedicated Hosts associated with the reservation.
    */
  var HostIdSet: js.UndefOr[ResponseHostIdSet] = js.native
  /**
    * The ID of the reservation.
    */
  var HostReservationId: js.UndefOr[String] = js.native
  /**
    * The hourly price of the reservation per hour.
    */
  var HourlyPrice: js.UndefOr[String] = js.native
  /**
    * The instance family on the Dedicated Host that the reservation can be associated with.
    */
  var InstanceFamily: js.UndefOr[String] = js.native
  /**
    * The payment option for the reservation.
    */
  var PaymentOption: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.PaymentOption] = js.native
  /**
    * The upfront price of the reservation.
    */
  var UpfrontPrice: js.UndefOr[String] = js.native
}

object Purchase {
  @scala.inline
  def apply(): Purchase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Purchase]
  }
  @scala.inline
  implicit class PurchaseOps[Self <: Purchase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrencyCode(value: CurrencyCodeValues): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrencyCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrencyCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrencyCode")(js.undefined)
        ret
    }
    @scala.inline
    def withDuration(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Duration")(js.undefined)
        ret
    }
    @scala.inline
    def withHostIdSet(value: ResponseHostIdSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HostIdSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostIdSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HostIdSet")(js.undefined)
        ret
    }
    @scala.inline
    def withHostReservationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HostReservationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostReservationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HostReservationId")(js.undefined)
        ret
    }
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
    def withInstanceFamily(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceFamily: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceFamily")(js.undefined)
        ret
    }
    @scala.inline
    def withPaymentOption(value: PaymentOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PaymentOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaymentOption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PaymentOption")(js.undefined)
        ret
    }
    @scala.inline
    def withUpfrontPrice(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpfrontPrice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpfrontPrice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpfrontPrice")(js.undefined)
        ret
    }
  }
  
}

