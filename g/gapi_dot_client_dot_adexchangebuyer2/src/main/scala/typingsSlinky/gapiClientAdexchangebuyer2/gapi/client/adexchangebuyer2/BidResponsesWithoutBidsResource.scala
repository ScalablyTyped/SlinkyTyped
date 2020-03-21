package typingsSlinky.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientAdexchangebuyer2.AnonFilterSetId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BidResponsesWithoutBidsResource extends js.Object {
  /**
    * List all reasons for which bid responses were considered to have no
    * applicable bids, with the number of bid responses affected for each reason.
    */
  def list(request: AnonFilterSetId): Request_[ListBidResponsesWithoutBidsResponse]
}

object BidResponsesWithoutBidsResource {
  @scala.inline
  def apply(list: AnonFilterSetId => Request_[ListBidResponsesWithoutBidsResponse]): BidResponsesWithoutBidsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[BidResponsesWithoutBidsResource]
  }
}

