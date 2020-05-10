package typingsSlinky.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for listing all details associated with a given filtered
  * bid reason.
  */
@js.native
trait SchemaListCreativeStatusBreakdownByDetailResponse extends js.Object {
  /**
    * The type of detail that the detail IDs represent.
    */
  var detailType: js.UndefOr[String] = js.native
  /**
    * List of rows, with counts of bids with a given creative status aggregated
    * by detail.
    */
  var filteredBidDetailRows: js.UndefOr[js.Array[SchemaFilteredBidDetailRow]] = js.native
  /**
    * A token to retrieve the next page of results. Pass this value in the
    * ListCreativeStatusBreakdownByDetailRequest.pageToken field in the
    * subsequent call to the filteredBids.details.list method to retrieve the
    * next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListCreativeStatusBreakdownByDetailResponse {
  @scala.inline
  def apply(): SchemaListCreativeStatusBreakdownByDetailResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListCreativeStatusBreakdownByDetailResponse]
  }
  @scala.inline
  implicit class SchemaListCreativeStatusBreakdownByDetailResponseOps[Self <: SchemaListCreativeStatusBreakdownByDetailResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDetailType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detailType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetailType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detailType")(js.undefined)
        ret
    }
    @scala.inline
    def withFilteredBidDetailRows(value: js.Array[SchemaFilteredBidDetailRow]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filteredBidDetailRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilteredBidDetailRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filteredBidDetailRows")(js.undefined)
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
  }
  
}

