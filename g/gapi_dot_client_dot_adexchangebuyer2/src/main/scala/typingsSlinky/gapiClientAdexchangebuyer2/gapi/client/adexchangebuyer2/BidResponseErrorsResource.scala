package typingsSlinky.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientAdexchangebuyer2.AnonFilterSetId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BidResponseErrorsResource extends js.Object {
  /**
    * List all errors that occurred in bid responses, with the number of bid
    * responses affected for each reason.
    */
  def list(request: AnonFilterSetId): Request_[ListBidResponseErrorsResponse] = js.native
}

object BidResponseErrorsResource {
  @scala.inline
  def apply(list: AnonFilterSetId => Request_[ListBidResponseErrorsResponse]): BidResponseErrorsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[BidResponseErrorsResource]
  }
  @scala.inline
  implicit class BidResponseErrorsResourceOps[Self <: BidResponseErrorsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withList(value: AnonFilterSetId => Request_[ListBidResponseErrorsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

