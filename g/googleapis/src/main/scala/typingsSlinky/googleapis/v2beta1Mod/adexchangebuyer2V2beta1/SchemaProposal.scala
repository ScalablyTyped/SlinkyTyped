package typingsSlinky.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Note: this resource requires whitelisting for access. Please contact your
  * account manager for access to Marketplace resources.  Represents a proposal
  * in the Marketplace. A proposal is the unit of negotiation between a seller
  * and a buyer and contains deals which are served.  Note: you can not update,
  * create, or otherwise modify Private Auction or Preferred Deals deals
  * through the API.  Fields are updatable unless noted otherwise.
  */
@js.native
trait SchemaProposal extends js.Object {
  /**
    * Reference to the buyer that will get billed for this proposal.
    * @OutputOnly
    */
  var billedBuyer: js.UndefOr[SchemaBuyer] = js.native
  /**
    * Reference to the buyer on the proposal.  Note: This field may be set only
    * when creating the resource. Modifying this field while updating the
    * resource will result in an error.
    */
  var buyer: js.UndefOr[SchemaBuyer] = js.native
  /**
    * Contact information for the buyer.
    */
  var buyerContacts: js.UndefOr[js.Array[SchemaContactInformation]] = js.native
  /**
    * Private data for buyer. (hidden from seller).
    */
  var buyerPrivateData: js.UndefOr[SchemaPrivateData] = js.native
  /**
    * The deals associated with this proposal. For Private Auction proposals
    * (whose deals have NonGuaranteedAuctionTerms), there will only be one
    * deal.
    */
  var deals: js.UndefOr[js.Array[SchemaDeal]] = js.native
  /**
    * The name for the proposal.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * True if the proposal is being renegotiated. @OutputOnly
    */
  var isRenegotiating: js.UndefOr[Boolean] = js.native
  /**
    * True, if the buyside inventory setup is complete for this proposal.
    * @OutputOnly
    */
  var isSetupComplete: js.UndefOr[Boolean] = js.native
  /**
    * The role of the last user that either updated the proposal or left a
    * comment. @OutputOnly
    */
  var lastUpdaterOrCommentorRole: js.UndefOr[String] = js.native
  /**
    * The notes associated with this proposal. @OutputOnly
    */
  var notes: js.UndefOr[js.Array[SchemaNote]] = js.native
  /**
    * Indicates whether the buyer/seller created the proposal. @OutputOnly
    */
  var originatorRole: js.UndefOr[String] = js.native
  /**
    * Private auction ID if this proposal is a private auction proposal.
    * @OutputOnly
    */
  var privateAuctionId: js.UndefOr[String] = js.native
  /**
    * The unique ID of the proposal. @OutputOnly
    */
  var proposalId: js.UndefOr[String] = js.native
  /**
    * The revision number for the proposal. Each update to the proposal or the
    * deal causes the proposal revision number to auto-increment. The buyer
    * keeps track of the last revision number they know of and pass it in when
    * making an update. If the head revision number on the server has since
    * incremented, then an ABORTED error is returned during the update
    * operation to let the buyer know that a subsequent update was made.
    * @OutputOnly
    */
  var proposalRevision: js.UndefOr[String] = js.native
  /**
    * The current state of the proposal. @OutputOnly
    */
  var proposalState: js.UndefOr[String] = js.native
  /**
    * Reference to the seller on the proposal.  Note: This field may be set
    * only when creating the resource. Modifying this field while updating the
    * resource will result in an error.
    */
  var seller: js.UndefOr[SchemaSeller] = js.native
  /**
    * Contact information for the seller. @OutputOnly
    */
  var sellerContacts: js.UndefOr[js.Array[SchemaContactInformation]] = js.native
  /**
    * The time when the proposal was last revised. @OutputOnly
    */
  var updateTime: js.UndefOr[String] = js.native
}

object SchemaProposal {
  @scala.inline
  def apply(): SchemaProposal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProposal]
  }
  @scala.inline
  implicit class SchemaProposalOps[Self <: SchemaProposal] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBilledBuyer(value: SchemaBuyer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billedBuyer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBilledBuyer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billedBuyer")(js.undefined)
        ret
    }
    @scala.inline
    def withBuyer(value: SchemaBuyer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buyer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuyer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buyer")(js.undefined)
        ret
    }
    @scala.inline
    def withBuyerContacts(value: js.Array[SchemaContactInformation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buyerContacts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuyerContacts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buyerContacts")(js.undefined)
        ret
    }
    @scala.inline
    def withBuyerPrivateData(value: SchemaPrivateData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buyerPrivateData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuyerPrivateData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buyerPrivateData")(js.undefined)
        ret
    }
    @scala.inline
    def withDeals(value: js.Array[SchemaDeal]): Self = {
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
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withIsRenegotiating(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRenegotiating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsRenegotiating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRenegotiating")(js.undefined)
        ret
    }
    @scala.inline
    def withIsSetupComplete(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSetupComplete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsSetupComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSetupComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withLastUpdaterOrCommentorRole(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdaterOrCommentorRole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastUpdaterOrCommentorRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdaterOrCommentorRole")(js.undefined)
        ret
    }
    @scala.inline
    def withNotes(value: js.Array[SchemaNote]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notes")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginatorRole(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originatorRole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginatorRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originatorRole")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivateAuctionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateAuctionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivateAuctionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateAuctionId")(js.undefined)
        ret
    }
    @scala.inline
    def withProposalId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proposalId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProposalId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proposalId")(js.undefined)
        ret
    }
    @scala.inline
    def withProposalRevision(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proposalRevision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProposalRevision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proposalRevision")(js.undefined)
        ret
    }
    @scala.inline
    def withProposalState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proposalState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProposalState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proposalState")(js.undefined)
        ret
    }
    @scala.inline
    def withSeller(value: SchemaSeller): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seller")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeller: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seller")(js.undefined)
        ret
    }
    @scala.inline
    def withSellerContacts(value: js.Array[SchemaContactInformation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sellerContacts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSellerContacts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sellerContacts")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTime")(js.undefined)
        ret
    }
  }
  
}

