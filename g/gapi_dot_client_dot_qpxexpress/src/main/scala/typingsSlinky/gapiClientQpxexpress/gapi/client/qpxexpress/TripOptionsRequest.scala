package typingsSlinky.gapiClientQpxexpress.gapi.client.qpxexpress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TripOptionsRequest extends js.Object {
  /**
    * Do not return solutions that cost more than this price. The alphabetical part of the price is in ISO 4217. The format, in regex, is [A-Z]{3}\d+(\.\d+)?
    * Example: $102.07
    */
  var maxPrice: js.UndefOr[String] = js.native
  /** Counts for each passenger type in the request. */
  var passengers: js.UndefOr[PassengerCounts] = js.native
  /** Return only solutions with refundable fares. */
  var refundable: js.UndefOr[Boolean] = js.native
  /** IATA country code representing the point of sale. This determines the "equivalent amount paid" currency for the ticket. */
  var saleCountry: js.UndefOr[String] = js.native
  /**
    * The slices that make up the itinerary of this trip. A slice represents a traveler's intent, the portion of a low-fare search corresponding to a
    * traveler's request to get between two points. One-way journeys are generally expressed using one slice, round-trips using two. An example of a one
    * slice trip with three segments might be BOS-SYD, SYD-LAX, LAX-BOS if the traveler only stopped in SYD and LAX just long enough to change planes.
    */
  var slice: js.UndefOr[js.Array[SliceInput]] = js.native
  /** The number of solutions to return, maximum 500. */
  var solutions: js.UndefOr[Double] = js.native
  /** IATA country code representing the point of ticketing. */
  var ticketingCountry: js.UndefOr[String] = js.native
}

object TripOptionsRequest {
  @scala.inline
  def apply(): TripOptionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TripOptionsRequest]
  }
  @scala.inline
  implicit class TripOptionsRequestOps[Self <: TripOptionsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxPrice(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxPrice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxPrice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxPrice")(js.undefined)
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
    def withSaleCountry(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saleCountry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSaleCountry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saleCountry")(js.undefined)
        ret
    }
    @scala.inline
    def withSlice(value: js.Array[SliceInput]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slice")(js.undefined)
        ret
    }
    @scala.inline
    def withSolutions(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("solutions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSolutions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("solutions")(js.undefined)
        ret
    }
    @scala.inline
    def withTicketingCountry(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticketingCountry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTicketingCountry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticketingCountry")(js.undefined)
        ret
    }
  }
  
}

