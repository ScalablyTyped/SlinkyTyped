package typingsSlinky.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Note: this resource requires whitelisting for access. Please contact your
  * account manager for access to Marketplace resources.  Represents a proposal
  * in the Marketplace. A proposal is the unit of negotiation between a seller
  * and a buyer and contains deals which are served.  Note: you can not update,
  * create, or otherwise modify Private Auction or Preferred Deals deals
  * through the API.  Fields are updatable unless noted otherwise.
  */
@js.native
trait SchemaProposal extends StObject {
  
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
  implicit class SchemaProposalMutableBuilder[Self <: SchemaProposal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBilledBuyer(value: SchemaBuyer): Self = StObject.set(x, "billedBuyer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBilledBuyerUndefined: Self = StObject.set(x, "billedBuyer", js.undefined)
    
    @scala.inline
    def setBuyer(value: SchemaBuyer): Self = StObject.set(x, "buyer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuyerContacts(value: js.Array[SchemaContactInformation]): Self = StObject.set(x, "buyerContacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuyerContactsUndefined: Self = StObject.set(x, "buyerContacts", js.undefined)
    
    @scala.inline
    def setBuyerContactsVarargs(value: SchemaContactInformation*): Self = StObject.set(x, "buyerContacts", js.Array(value :_*))
    
    @scala.inline
    def setBuyerPrivateData(value: SchemaPrivateData): Self = StObject.set(x, "buyerPrivateData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuyerPrivateDataUndefined: Self = StObject.set(x, "buyerPrivateData", js.undefined)
    
    @scala.inline
    def setBuyerUndefined: Self = StObject.set(x, "buyer", js.undefined)
    
    @scala.inline
    def setDeals(value: js.Array[SchemaDeal]): Self = StObject.set(x, "deals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDealsUndefined: Self = StObject.set(x, "deals", js.undefined)
    
    @scala.inline
    def setDealsVarargs(value: SchemaDeal*): Self = StObject.set(x, "deals", js.Array(value :_*))
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setIsRenegotiating(value: Boolean): Self = StObject.set(x, "isRenegotiating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRenegotiatingUndefined: Self = StObject.set(x, "isRenegotiating", js.undefined)
    
    @scala.inline
    def setIsSetupComplete(value: Boolean): Self = StObject.set(x, "isSetupComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSetupCompleteUndefined: Self = StObject.set(x, "isSetupComplete", js.undefined)
    
    @scala.inline
    def setLastUpdaterOrCommentorRole(value: String): Self = StObject.set(x, "lastUpdaterOrCommentorRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdaterOrCommentorRoleUndefined: Self = StObject.set(x, "lastUpdaterOrCommentorRole", js.undefined)
    
    @scala.inline
    def setNotes(value: js.Array[SchemaNote]): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    @scala.inline
    def setNotesVarargs(value: SchemaNote*): Self = StObject.set(x, "notes", js.Array(value :_*))
    
    @scala.inline
    def setOriginatorRole(value: String): Self = StObject.set(x, "originatorRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginatorRoleUndefined: Self = StObject.set(x, "originatorRole", js.undefined)
    
    @scala.inline
    def setPrivateAuctionId(value: String): Self = StObject.set(x, "privateAuctionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateAuctionIdUndefined: Self = StObject.set(x, "privateAuctionId", js.undefined)
    
    @scala.inline
    def setProposalId(value: String): Self = StObject.set(x, "proposalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProposalIdUndefined: Self = StObject.set(x, "proposalId", js.undefined)
    
    @scala.inline
    def setProposalRevision(value: String): Self = StObject.set(x, "proposalRevision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProposalRevisionUndefined: Self = StObject.set(x, "proposalRevision", js.undefined)
    
    @scala.inline
    def setProposalState(value: String): Self = StObject.set(x, "proposalState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProposalStateUndefined: Self = StObject.set(x, "proposalState", js.undefined)
    
    @scala.inline
    def setSeller(value: SchemaSeller): Self = StObject.set(x, "seller", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSellerContacts(value: js.Array[SchemaContactInformation]): Self = StObject.set(x, "sellerContacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSellerContactsUndefined: Self = StObject.set(x, "sellerContacts", js.undefined)
    
    @scala.inline
    def setSellerContactsVarargs(value: SchemaContactInformation*): Self = StObject.set(x, "sellerContacts", js.Array(value :_*))
    
    @scala.inline
    def setSellerUndefined: Self = StObject.set(x, "seller", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
