package typingsSlinky.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientAdexchangebuyer2.anon.FilterSetId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BidMetricsResource extends js.Object {
  /** Lists all metrics that are measured in terms of number of bids. */
  def list(request: FilterSetId): Request[ListBidMetricsResponse] = js.native
}

object BidMetricsResource {
  @scala.inline
  def apply(list: FilterSetId => Request[ListBidMetricsResponse]): BidMetricsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[BidMetricsResource]
  }
  @scala.inline
  implicit class BidMetricsResourceOps[Self <: BidMetricsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withList(value: FilterSetId => Request[ListBidMetricsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

