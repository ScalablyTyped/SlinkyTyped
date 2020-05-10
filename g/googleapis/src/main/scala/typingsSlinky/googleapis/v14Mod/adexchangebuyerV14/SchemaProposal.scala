package typingsSlinky.googleapis.v14Mod.adexchangebuyerV14

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a proposal in the marketplace. A proposal is the unit of
  * negotiation between a seller and a buyer and contains deals which are
  * served. Each field in a proposal can have one of the following setting:
  * (readonly) - It is an error to try and set this field. (buyer-readonly) -
  * Only the seller can set this field. (seller-readonly) - Only the buyer can
  * set this field. (updatable) - The field is updatable at all times by either
  * buyer or the seller.
  */
@js.native
trait SchemaProposal extends js.Object {
  /**
    * Reference to the buyer that will get billed for this proposal. (readonly)
    */
  var billedBuyer: js.UndefOr[SchemaBuyer] = js.native
  /**
    * Reference to the buyer on the proposal. (readonly, except on create)
    */
  var buyer: js.UndefOr[SchemaBuyer] = js.native
  /**
    * Optional contact information of the buyer. (seller-readonly)
    */
  var buyerContacts: js.UndefOr[js.Array[SchemaContactInformation]] = js.native
  /**
    * Private data for buyer. (hidden from seller).
    */
  var buyerPrivateData: js.UndefOr[SchemaPrivateData] = js.native
  /**
    * IDs of DBM advertisers permission to this proposal.
    */
  var dbmAdvertiserIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * When an proposal is in an accepted state, indicates whether the buyer has
    * signed off. Once both sides have signed off on a deal, the proposal can
    * be finalized by the seller. (seller-readonly)
    */
  var hasBuyerSignedOff: js.UndefOr[Boolean] = js.native
  /**
    * When an proposal is in an accepted state, indicates whether the buyer has
    * signed off Once both sides have signed off on a deal, the proposal can be
    * finalized by the seller. (buyer-readonly)
    */
  var hasSellerSignedOff: js.UndefOr[Boolean] = js.native
  /**
    * What exchange will provide this inventory (readonly, except on create).
    */
  var inventorySource: js.UndefOr[String] = js.native
  /**
    * True if the proposal is being renegotiated (readonly).
    */
  var isRenegotiating: js.UndefOr[Boolean] = js.native
  /**
    * True, if the buyside inventory setup is complete for this proposal.
    * (readonly, except via OrderSetupCompleted action) Deprecated in favor of
    * deal level setup complete flag.
    */
  var isSetupComplete: js.UndefOr[Boolean] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;adexchangebuyer#proposal&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * List of labels associated with the proposal. (readonly)
    */
  var labels: js.UndefOr[js.Array[SchemaMarketplaceLabel]] = js.native
  /**
    * The role of the last user that either updated the proposal or left a
    * comment. (readonly)
    */
  var lastUpdaterOrCommentorRole: js.UndefOr[String] = js.native
  /**
    * The name for the proposal (updatable)
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Optional negotiation id if this proposal is a preferred deal proposal.
    */
  var negotiationId: js.UndefOr[String] = js.native
  /**
    * Indicates whether the buyer/seller created the proposal.(readonly)
    */
  var originatorRole: js.UndefOr[String] = js.native
  /**
    * Optional private auction id if this proposal is a private auction
    * proposal.
    */
  var privateAuctionId: js.UndefOr[String] = js.native
  /**
    * The unique id of the proposal. (readonly).
    */
  var proposalId: js.UndefOr[String] = js.native
  /**
    * The current state of the proposal. (readonly)
    */
  var proposalState: js.UndefOr[String] = js.native
  /**
    * The revision number for the proposal (readonly).
    */
  var revisionNumber: js.UndefOr[String] = js.native
  /**
    * The time (ms since epoch) when the proposal was last revised (readonly).
    */
  var revisionTimeMs: js.UndefOr[String] = js.native
  /**
    * Reference to the seller on the proposal. (readonly, except on create)
    */
  var seller: js.UndefOr[SchemaSeller] = js.native
  /**
    * Optional contact information of the seller (buyer-readonly).
    */
  var sellerContacts: js.UndefOr[js.Array[SchemaContactInformation]] = js.native
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
    def withDbmAdvertiserIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dbmAdvertiserIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDbmAdvertiserIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dbmAdvertiserIds")(js.undefined)
        ret
    }
    @scala.inline
    def withHasBuyerSignedOff(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasBuyerSignedOff")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasBuyerSignedOff: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasBuyerSignedOff")(js.undefined)
        ret
    }
    @scala.inline
    def withHasSellerSignedOff(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasSellerSignedOff")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasSellerSignedOff: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasSellerSignedOff")(js.undefined)
        ret
    }
    @scala.inline
    def withInventorySource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inventorySource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInventorySource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inventorySource")(js.undefined)
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
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withLabels(value: js.Array[SchemaMarketplaceLabel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(js.undefined)
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
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNegotiationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negotiationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNegotiationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negotiationId")(js.undefined)
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
    def withRevisionNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revisionNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRevisionNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revisionNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withRevisionTimeMs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revisionTimeMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRevisionTimeMs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revisionTimeMs")(js.undefined)
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
  }
  
}

