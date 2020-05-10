package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeHostReservationOfferingsResult extends js.Object {
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * Information about the offerings.
    */
  var OfferingSet: js.UndefOr[HostOfferingSet] = js.native
}

object DescribeHostReservationOfferingsResult {
  @scala.inline
  def apply(): DescribeHostReservationOfferingsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeHostReservationOfferingsResult]
  }
  @scala.inline
  implicit class DescribeHostReservationOfferingsResultOps[Self <: DescribeHostReservationOfferingsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withOfferingSet(value: HostOfferingSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OfferingSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOfferingSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OfferingSet")(js.undefined)
        ret
    }
  }
  
}

