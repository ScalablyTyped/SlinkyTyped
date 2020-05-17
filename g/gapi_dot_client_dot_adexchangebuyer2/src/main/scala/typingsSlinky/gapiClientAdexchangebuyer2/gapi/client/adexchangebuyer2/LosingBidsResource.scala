package typingsSlinky.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientAdexchangebuyer2.anon.FilterSetId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LosingBidsResource extends js.Object {
  /**
    * List all reasons for which bids lost in the auction, with the number of
    * bids that lost for each reason.
    */
  def list(request: FilterSetId): Request[ListLosingBidsResponse] = js.native
}

object LosingBidsResource {
  @scala.inline
  def apply(list: FilterSetId => Request[ListLosingBidsResponse]): LosingBidsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[LosingBidsResource]
  }
  @scala.inline
  implicit class LosingBidsResourceOps[Self <: LosingBidsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withList(value: FilterSetId => Request[ListLosingBidsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

