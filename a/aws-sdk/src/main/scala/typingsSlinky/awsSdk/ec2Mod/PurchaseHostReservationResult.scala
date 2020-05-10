package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PurchaseHostReservationResult extends js.Object {
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see How to Ensure Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.native
  /**
    * The currency in which the totalUpfrontPrice and totalHourlyPrice amounts are specified. At this time, the only supported currency is USD.
    */
  var CurrencyCode: js.UndefOr[CurrencyCodeValues] = js.native
  /**
    * Describes the details of the purchase.
    */
  var Purchase: js.UndefOr[PurchaseSet] = js.native
  /**
    * The total hourly price of the reservation calculated per hour.
    */
  var TotalHourlyPrice: js.UndefOr[String] = js.native
  /**
    * The total amount charged to your account when you purchase the reservation.
    */
  var TotalUpfrontPrice: js.UndefOr[String] = js.native
}

object PurchaseHostReservationResult {
  @scala.inline
  def apply(): PurchaseHostReservationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PurchaseHostReservationResult]
  }
  @scala.inline
  implicit class PurchaseHostReservationResultOps[Self <: PurchaseHostReservationResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientToken")(js.undefined)
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
    def withPurchase(value: PurchaseSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Purchase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPurchase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Purchase")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalHourlyPrice(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalHourlyPrice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalHourlyPrice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalHourlyPrice")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalUpfrontPrice(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalUpfrontPrice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalUpfrontPrice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalUpfrontPrice")(js.undefined)
        ret
    }
  }
  
}

