package typingsSlinky.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientAdexchangebuyer2.AnonFilterSetId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BidResponsesWithoutBidsResource extends js.Object {
  /**
    * List all reasons for which bid responses were considered to have no
    * applicable bids, with the number of bid responses affected for each reason.
    */
  def list(request: AnonFilterSetId): Request_[ListBidResponsesWithoutBidsResponse] = js.native
}

object BidResponsesWithoutBidsResource {
  @scala.inline
  def apply(list: AnonFilterSetId => Request_[ListBidResponsesWithoutBidsResponse]): BidResponsesWithoutBidsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[BidResponsesWithoutBidsResource]
  }
  @scala.inline
  implicit class BidResponsesWithoutBidsResourceOps[Self <: BidResponsesWithoutBidsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withList(value: AnonFilterSetId => Request_[ListBidResponsesWithoutBidsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

