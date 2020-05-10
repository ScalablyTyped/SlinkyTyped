package typingsSlinky.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for listing all reasons that bid responses were considered
  * to have no applicable bids.
  */
@js.native
trait SchemaListBidResponsesWithoutBidsResponse extends js.Object {
  /**
    * List of rows, with counts of bid responses without bids aggregated by
    * status.
    */
  var bidResponseWithoutBidsStatusRows: js.UndefOr[js.Array[SchemaBidResponseWithoutBidsStatusRow]] = js.native
  /**
    * A token to retrieve the next page of results. Pass this value in the
    * ListBidResponsesWithoutBidsRequest.pageToken field in the subsequent call
    * to the bidResponsesWithoutBids.list method to retrieve the next page of
    * results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListBidResponsesWithoutBidsResponse {
  @scala.inline
  def apply(): SchemaListBidResponsesWithoutBidsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListBidResponsesWithoutBidsResponse]
  }
  @scala.inline
  implicit class SchemaListBidResponsesWithoutBidsResponseOps[Self <: SchemaListBidResponsesWithoutBidsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBidResponseWithoutBidsStatusRows(value: js.Array[SchemaBidResponseWithoutBidsStatusRow]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bidResponseWithoutBidsStatusRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBidResponseWithoutBidsStatusRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bidResponseWithoutBidsStatusRows")(js.undefined)
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

