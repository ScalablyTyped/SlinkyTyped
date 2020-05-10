package typingsSlinky.gapiClientQpxexpress.gapi.client.qpxexpress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PricingInfo extends js.Object {
  /**
    * The total fare in the base fare currency (the currency of the country of origin). This element is only present when the sales currency and the currency
    * of the country of commencement are different.
    */
  var baseFareTotal: js.UndefOr[String] = js.native
  /** The fare used to price one or more segments. */
  var fare: js.UndefOr[js.Array[FareInfo]] = js.native
  /** The horizontal fare calculation. This is a field on a ticket that displays all of the relevant items that go into the calculation of the fare. */
  var fareCalculation: js.UndefOr[String] = js.native
  /** Identifies this as a pricing object, representing the price of one or more travel segments. Value: the fixed string qpxexpress#pricingInfo. */
  var kind: js.UndefOr[String] = js.native
  /**
    * The latest ticketing time for this pricing assuming the reservation occurs at ticketing time and there is no change in fares/rules. The time is local
    * to the point of sale (POS).
    */
  var latestTicketingTime: js.UndefOr[String] = js.native
  /** The number of passengers to which this price applies. */
  var passengers: js.UndefOr[PassengerCounts] = js.native
  /**
    * The passenger type code for this pricing. An alphanumeric code used by a carrier to restrict fares to certain categories of passenger. For instance, a
    * fare might be valid only for senior citizens.
    */
  var ptc: js.UndefOr[String] = js.native
  /** Whether the fares on this pricing are refundable. */
  var refundable: js.UndefOr[Boolean] = js.native
  /** The total fare in the sale or equivalent currency. */
  var saleFareTotal: js.UndefOr[String] = js.native
  /** The taxes in the sale or equivalent currency. */
  var saleTaxTotal: js.UndefOr[String] = js.native
  /** Total per-passenger price (fare and tax) in the sale or equivalent currency. */
  var saleTotal: js.UndefOr[String] = js.native
  /** The per-segment price and baggage information. */
  var segmentPricing: js.UndefOr[js.Array[SegmentPricing]] = js.native
  /** The taxes used to calculate the tax total per ticket. */
  var tax: js.UndefOr[js.Array[TaxInfo]] = js.native
}

object PricingInfo {
  @scala.inline
  def apply(): PricingInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PricingInfo]
  }
  @scala.inline
  implicit class PricingInfoOps[Self <: PricingInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseFareTotal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseFareTotal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseFareTotal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseFareTotal")(js.undefined)
        ret
    }
    @scala.inline
    def withFare(value: js.Array[FareInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fare")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFare: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fare")(js.undefined)
        ret
    }
    @scala.inline
    def withFareCalculation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fareCalculation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFareCalculation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fareCalculation")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withLatestTicketingTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latestTicketingTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatestTicketingTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latestTicketingTime")(js.undefined)
        ret
    }
    @scala.inline
    def withPassengers(value: PassengerCounts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passengers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassengers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passengers")(js.undefined)
        ret
    }
    @scala.inline
    def withPtc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ptc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPtc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ptc")(js.undefined)
        ret
    }
    @scala.inline
    def withRefundable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refundable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefundable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refundable")(js.undefined)
        ret
    }
    @scala.inline
    def withSaleFareTotal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saleFareTotal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSaleFareTotal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saleFareTotal")(js.undefined)
        ret
    }
    @scala.inline
    def withSaleTaxTotal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saleTaxTotal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSaleTaxTotal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saleTaxTotal")(js.undefined)
        ret
    }
    @scala.inline
    def withSaleTotal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saleTotal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSaleTotal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saleTotal")(js.undefined)
        ret
    }
    @scala.inline
    def withSegmentPricing(value: js.Array[SegmentPricing]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segmentPricing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSegmentPricing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segmentPricing")(js.undefined)
        ret
    }
    @scala.inline
    def withTax(value: js.Array[TaxInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tax")(js.undefined)
        ret
    }
  }
  
}

