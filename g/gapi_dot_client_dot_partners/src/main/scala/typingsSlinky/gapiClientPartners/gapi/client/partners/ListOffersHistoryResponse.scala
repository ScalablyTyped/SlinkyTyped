package typingsSlinky.gapiClientPartners.gapi.client.partners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListOffersHistoryResponse extends js.Object {
  /** True if the user has the option to show entire company history. */
  var canShowEntireCompany: js.UndefOr[Boolean] = js.native
  /** Supply this token in a ListOffersHistoryRequest to retrieve the next page. */
  var nextPageToken: js.UndefOr[String] = js.native
  /** Historical offers meeting request. */
  var offers: js.UndefOr[js.Array[HistoricalOffer]] = js.native
  /** Current response metadata. */
  var responseMetadata: js.UndefOr[ResponseMetadata] = js.native
  /** True if this response is showing entire company history. */
  var showingEntireCompany: js.UndefOr[Boolean] = js.native
  /** Number of results across all pages. */
  var totalResults: js.UndefOr[Double] = js.native
}

object ListOffersHistoryResponse {
  @scala.inline
  def apply(): ListOffersHistoryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOffersHistoryResponse]
  }
  @scala.inline
  implicit class ListOffersHistoryResponseOps[Self <: ListOffersHistoryResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanShowEntireCompany(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canShowEntireCompany")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanShowEntireCompany: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canShowEntireCompany")(js.undefined)
        ret
    }
    @scala.inline
    def withNextPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(js.undefined)
        ret
    }
    @scala.inline
    def withOffers(value: js.Array[HistoricalOffer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offers")(js.undefined)
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
    @scala.inline
    def withShowingEntireCompany(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showingEntireCompany")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowingEntireCompany: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showingEntireCompany")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalResults(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalResults")(js.undefined)
        ret
    }
  }
  
}

