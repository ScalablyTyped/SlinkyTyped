package typingsSlinky.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditAllOrderDealsRequest extends js.Object {
  /**
    * List of deals to edit. Service may perform 3 different operations based on comparison of deals in this list vs deals already persisted in database: 1.
    * Add new deal to proposal If a deal in this list does not exist in the proposal, the service will create a new deal and add it to the proposal.
    * Validation will follow AddOrderDealsRequest. 2. Update existing deal in the proposal If a deal in this list already exist in the proposal, the service
    * will update that existing deal to this new deal in the request. Validation will follow UpdateOrderDealsRequest. 3. Delete deals from the proposal (just
    * need the id) If a existing deal in the proposal is not present in this list, the service will delete that deal from the proposal. Validation will
    * follow DeleteOrderDealsRequest.
    */
  var deals: js.UndefOr[js.Array[MarketplaceDeal]] = js.native
  /** If specified, also updates the proposal in the batch transaction. This is useful when the proposal and the deals need to be updated in one transaction. */
  var proposal: js.UndefOr[Proposal] = js.native
  /** The last known revision number for the proposal. */
  var proposalRevisionNumber: js.UndefOr[String] = js.native
  /** Indicates an optional action to take on the proposal */
  var updateAction: js.UndefOr[String] = js.native
}

object EditAllOrderDealsRequest {
  @scala.inline
  def apply(): EditAllOrderDealsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditAllOrderDealsRequest]
  }
  @scala.inline
  implicit class EditAllOrderDealsRequestOps[Self <: EditAllOrderDealsRequest] (val x: Self) extends AnyVal {
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
    def withProposal(value: Proposal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proposal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProposal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proposal")(js.undefined)
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
    @scala.inline
    def withUpdateAction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateAction")(js.undefined)
        ret
    }
  }
  
}

