package typingsSlinky.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteOrderDealsResponse extends js.Object {
  /** List of deals deleted (in the same proposal as passed in the request) */
  var deals: js.UndefOr[js.Array[MarketplaceDeal]] = js.native
  /** The updated revision number for the proposal. */
  var proposalRevisionNumber: js.UndefOr[String] = js.native
}

object DeleteOrderDealsResponse {
  @scala.inline
  def apply(): DeleteOrderDealsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteOrderDealsResponse]
  }
  @scala.inline
  implicit class DeleteOrderDealsResponseOps[Self <: DeleteOrderDealsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeals(value: js.Array[MarketplaceDeal]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deals")(js.undefined)
        ret
    }
    @scala.inline
    def withProposalRevisionNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proposalRevisionNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProposalRevisionNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proposalRevisionNumber")(js.undefined)
        ret
    }
  }
  
}

