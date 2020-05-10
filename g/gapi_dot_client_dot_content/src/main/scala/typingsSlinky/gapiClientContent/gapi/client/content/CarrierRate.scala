package typingsSlinky.gapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CarrierRate extends js.Object {
  /** Carrier service, such as "UPS" or "Fedex". The list of supported carriers can be retrieved via the getSupportedCarriers method. Required. */
  var carrierName: js.UndefOr[String] = js.native
  /**
    * Carrier service, such as "ground" or "2 days". The list of supported services for a carrier can be retrieved via the getSupportedCarriers method.
    * Required.
    */
  var carrierService: js.UndefOr[String] = js.native
  /**
    * Additive shipping rate modifier. Can be negative. For example { "value": "1", "currency" : "USD" } adds $1 to the rate, { "value": "-3", "currency" :
    * "USD" } removes $3 from the rate. Optional.
    */
  var flatAdjustment: js.UndefOr[Price] = js.native
  /** Name of the carrier rate. Must be unique per rate group. Required. */
  var name: js.UndefOr[String] = js.native
  /** Shipping origin for this carrier rate. Required. */
  var originPostalCode: js.UndefOr[String] = js.native
  /**
    * Multiplicative shipping rate modifier as a number in decimal notation. Can be negative. For example "5.4" increases the rate by 5.4%, "-3" decreases
    * the rate by 3%. Optional.
    */
  var percentageAdjustment: js.UndefOr[String] = js.native
}

object CarrierRate {
  @scala.inline
  def apply(): CarrierRate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CarrierRate]
  }
  @scala.inline
  implicit class CarrierRateOps[Self <: CarrierRate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCarrierName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("carrierName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCarrierName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("carrierName")(js.undefined)
        ret
    }
    @scala.inline
    def withCarrierService(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("carrierService")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCarrierService: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("carrierService")(js.undefined)
        ret
    }
    @scala.inline
    def withFlatAdjustment(value: Price): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flatAdjustment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlatAdjustment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flatAdjustment")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginPostalCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originPostalCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginPostalCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originPostalCode")(js.undefined)
        ret
    }
    @scala.inline
    def withPercentageAdjustment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percentageAdjustment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPercentageAdjustment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percentageAdjustment")(js.undefined)
        ret
    }
  }
  
}

