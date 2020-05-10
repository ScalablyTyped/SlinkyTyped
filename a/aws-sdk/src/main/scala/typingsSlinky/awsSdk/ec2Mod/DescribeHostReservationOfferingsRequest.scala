package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeHostReservationOfferingsRequest extends js.Object {
  /**
    * The filters.    instance-family - The instance family of the offering (for example, m4).    payment-option - The payment option (NoUpfront | PartialUpfront | AllUpfront).  
    */
  var Filter: js.UndefOr[FilterList] = js.native
  /**
    * This is the maximum duration of the reservation to purchase, specified in seconds. Reservations are available in one-year and three-year terms. The number of seconds specified must be the number of seconds in a year (365x24x60x60) times one of the supported durations (1 or 3). For example, specify 94608000 for three years.
    */
  var MaxDuration: js.UndefOr[Integer] = js.native
  /**
    * The maximum number of results to return for the request in a single page. The remaining results can be seen by sending another request with the returned nextToken value. This value can be between 5 and 500. If maxResults is given a larger value than 500, you receive an error.
    */
  var MaxResults: js.UndefOr[DescribeHostReservationsMaxResults] = js.native
  /**
    * This is the minimum duration of the reservation you'd like to purchase, specified in seconds. Reservations are available in one-year and three-year terms. The number of seconds specified must be the number of seconds in a year (365x24x60x60) times one of the supported durations (1 or 3). For example, specify 31536000 for one year.
    */
  var MinDuration: js.UndefOr[Integer] = js.native
  /**
    * The token to use to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * The ID of the reservation offering.
    */
  var OfferingId: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.OfferingId] = js.native
}

object DescribeHostReservationOfferingsRequest {
  @scala.inline
  def apply(): DescribeHostReservationOfferingsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeHostReservationOfferingsRequest]
  }
  @scala.inline
  implicit class DescribeHostReservationOfferingsRequestOps[Self <: DescribeHostReservationOfferingsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilter(value: FilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Filter")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxDuration(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxResults(value: DescribeHostReservationsMaxResults): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxResults")(js.undefined)
        ret
    }
    @scala.inline
    def withMinDuration(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
    @scala.inline
    def withOfferingId(value: OfferingId): Self = {
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
  }
  
}

