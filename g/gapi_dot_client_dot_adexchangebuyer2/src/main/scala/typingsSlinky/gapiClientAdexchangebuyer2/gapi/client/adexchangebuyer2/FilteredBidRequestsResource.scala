package typingsSlinky.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientAdexchangebuyer2.AnonFilterSetId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilteredBidRequestsResource extends js.Object {
  /**
    * List all reasons that caused a bid request not to be sent for an
    * impression, with the number of bid requests not sent for each reason.
    */
  def list(request: AnonFilterSetId): Request_[ListFilteredBidRequestsResponse]
}

object FilteredBidRequestsResource {
  @scala.inline
  def apply(list: AnonFilterSetId => Request_[ListFilteredBidRequestsResponse]): FilteredBidRequestsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[FilteredBidRequestsResource]
  }
}

