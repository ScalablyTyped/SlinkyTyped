package typingsSlinky.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for listing all reasons that bids were filtered from the
  * auction.
  */
@js.native
trait SchemaListFilteredBidsResponse extends js.Object {
  /**
    * List of rows, with counts of filtered bids aggregated by filtering reason
    * (i.e. creative status).
    */
  var creativeStatusRows: js.UndefOr[js.Array[SchemaCreativeStatusRow]] = js.native
  /**
    * A token to retrieve the next page of results. Pass this value in the
    * ListFilteredBidsRequest.pageToken field in the subsequent call to the
    * filteredBids.list method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListFilteredBidsResponse {
  @scala.inline
  def apply(): SchemaListFilteredBidsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListFilteredBidsResponse]
  }
  @scala.inline
  implicit class SchemaListFilteredBidsResponseOps[Self <: SchemaListFilteredBidsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreativeStatusRows(value: js.Array[SchemaCreativeStatusRow]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creativeStatusRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreativeStatusRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creativeStatusRows")(js.undefined)
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

