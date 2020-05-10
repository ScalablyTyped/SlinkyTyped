package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HostReservation extends js.Object {
  /**
    * The number of Dedicated Hosts the reservation is associated with.
    */
  var Count: js.UndefOr[Integer] = js.native
  /**
    * The currency in which the upfrontPrice and hourlyPrice amounts are specified. At this time, the only supported currency is USD.
    */
  var CurrencyCode: js.UndefOr[CurrencyCodeValues] = js.native
  /**
    * The length of the reservation's term, specified in seconds. Can be 31536000 (1 year) | 94608000 (3 years).
    */
  var Duration: js.UndefOr[Integer] = js.native
  /**
    * The date and time that the reservation ends.
    */
  var End: js.UndefOr[js.Date] = js.native
  /**
    * The IDs of the Dedicated Hosts associated with the reservation.
    */
  var HostIdSet: js.UndefOr[ResponseHostIdSet] = js.native
  /**
    * The ID of the reservation that specifies the associated Dedicated Hosts.
    */
  var HostReservationId: js.UndefOr[String] = js.native
  /**
    * The hourly price of the reservation.
    */
  var HourlyPrice: js.UndefOr[String] = js.native
  /**
    * The instance family of the Dedicated Host Reservation. The instance family on the Dedicated Host must be the same in order for it to benefit from the reservation.
    */
  var InstanceFamily: js.UndefOr[String] = js.native
  /**
    * The ID of the reservation. This remains the same regardless of which Dedicated Hosts are associated with it.
    */
  var OfferingId: js.UndefOr[String] = js.native
  /**
    * The payment option selected for this reservation.
    */
  var PaymentOption: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.PaymentOption] = js.native
  /**
    * The date and time that the reservation started.
    */
  var Start: js.UndefOr[js.Date] = js.native
  /**
    * The state of the reservation.
    */
  var State: js.UndefOr[ReservationState] = js.native
  /**
    * Any tags assigned to the Dedicated Host Reservation.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The upfront price of the reservation.
    */
  var UpfrontPrice: js.UndefOr[String] = js.native
}

object HostReservation {
  @scala.inline
  def apply(): HostReservation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HostReservation]
  }
  @scala.inline
  implicit class HostReservationOps[Self <: HostReservation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCount(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Count")(js.undefined)
        ret
    }
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
    def withEnd(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("End")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("End")(js.undefined)
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
    def withOfferingId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OfferingId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOfferingId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OfferingId")(js.undefined)
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
    def withStart(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Start")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: ReservationState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
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

