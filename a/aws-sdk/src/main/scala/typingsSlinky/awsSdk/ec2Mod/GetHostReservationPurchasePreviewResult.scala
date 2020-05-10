package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetHostReservationPurchasePreviewResult extends js.Object {
  /**
    * The currency in which the totalUpfrontPrice and totalHourlyPrice amounts are specified. At this time, the only supported currency is USD.
    */
  var CurrencyCode: js.UndefOr[CurrencyCodeValues] = js.native
  /**
    * The purchase information of the Dedicated Host reservation and the Dedicated Hosts associated with it.
    */
  var Purchase: js.UndefOr[PurchaseSet] = js.native
  /**
    * The potential total hourly price of the reservation per hour.
    */
  var TotalHourlyPrice: js.UndefOr[String] = js.native
  /**
    * The potential total upfront price. This is billed immediately.
    */
  var TotalUpfrontPrice: js.UndefOr[String] = js.native
}

object GetHostReservationPurchasePreviewResult {
  @scala.inline
  def apply(): GetHostReservationPurchasePreviewResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetHostReservationPurchasePreviewResult]
  }
  @scala.inline
  implicit class GetHostReservationPurchasePreviewResultOps[Self <: GetHostReservationPurchasePreviewResult] (val x: Self) extends AnyVal {
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

