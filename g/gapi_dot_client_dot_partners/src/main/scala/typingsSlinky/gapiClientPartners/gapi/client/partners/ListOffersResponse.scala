package typingsSlinky.gapiClientPartners.gapi.client.partners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListOffersResponse extends js.Object {
  /** Available Offers to be distributed. */
  var availableOffers: js.UndefOr[js.Array[AvailableOffer]] = js.native
  /** Reason why no Offers are available. */
  var noOfferReason: js.UndefOr[String] = js.native
  /** Current response metadata. */
  var responseMetadata: js.UndefOr[ResponseMetadata] = js.native
}

object ListOffersResponse {
  @scala.inline
  def apply(): ListOffersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOffersResponse]
  }
  @scala.inline
  implicit class ListOffersResponseOps[Self <: ListOffersResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvailableOffers(value: js.Array[AvailableOffer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availableOffers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailableOffers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availableOffers")(js.undefined)
        ret
    }
    @scala.inline
    def withNoOfferReason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noOfferReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoOfferReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noOfferReason")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseMetadata(value: ResponseMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseMetadata")(js.undefined)
        ret
    }
  }
  
}

