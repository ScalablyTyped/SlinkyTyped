package typingsSlinky.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for listing all reasons for which a buyer was not billed
  * for a winning bid.
  */
@js.native
trait SchemaListNonBillableWinningBidsResponse extends js.Object {
  /**
    * A token to retrieve the next page of results. Pass this value in the
    * ListNonBillableWinningBidsRequest.pageToken field in the subsequent call
    * to the nonBillableWinningBids.list method to retrieve the next page of
    * results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * List of rows, with counts of bids not billed aggregated by reason.
    */
  var nonBillableWinningBidStatusRows: js.UndefOr[js.Array[SchemaNonBillableWinningBidStatusRow]] = js.native
}

object SchemaListNonBillableWinningBidsResponse {
  @scala.inline
  def apply(): SchemaListNonBillableWinningBidsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListNonBillableWinningBidsResponse]
  }
  @scala.inline
  implicit class SchemaListNonBillableWinningBidsResponseOps[Self <: SchemaListNonBillableWinningBidsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withNonBillableWinningBidStatusRows(value: js.Array[SchemaNonBillableWinningBidStatusRow]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonBillableWinningBidStatusRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNonBillableWinningBidStatusRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonBillableWinningBidStatusRows")(js.undefined)
        ret
    }
  }
  
}

