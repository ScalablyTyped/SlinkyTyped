package typingsSlinky.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientAdexchangebuyer2.AnonFilterSetId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilteredBidRequestsResource extends js.Object {
  /**
    * List all reasons that caused a bid request not to be sent for an
    * impression, with the number of bid requests not sent for each reason.
    */
  def list(request: AnonFilterSetId): Request_[ListFilteredBidRequestsResponse] = js.native
}

object FilteredBidRequestsResource {
  @scala.inline
  def apply(list: AnonFilterSetId => Request_[ListFilteredBidRequestsResponse]): FilteredBidRequestsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[FilteredBidRequestsResource]
  }
  @scala.inline
  implicit class FilteredBidRequestsResourceOps[Self <: FilteredBidRequestsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withList(value: AnonFilterSetId => Request_[ListFilteredBidRequestsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

