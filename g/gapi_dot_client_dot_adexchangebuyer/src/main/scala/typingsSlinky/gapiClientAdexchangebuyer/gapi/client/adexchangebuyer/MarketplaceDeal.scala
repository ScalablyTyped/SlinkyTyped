package typingsSlinky.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MarketplaceDeal extends js.Object {
  /** Buyer private data (hidden from seller). */
  var buyerPrivateData: js.UndefOr[PrivateData] = js.native
  /** The time (ms since epoch) of the deal creation. (readonly) */
  var creationTimeMs: js.UndefOr[String] = js.native
  /** Specifies the creative pre-approval policy (buyer-readonly) */
  var creativePreApprovalPolicy: js.UndefOr[String] = js.native
  /** Specifies whether the creative is safeFrame compatible (buyer-readonly) */
  var creativeSafeFrameCompatibility: js.UndefOr[String] = js.native
  /** A unique deal-id for the deal (readonly). */
  var dealId: js.UndefOr[String] = js.native
  /** Metadata about the serving status of this deal (readonly, writes via custom actions) */
  var dealServingMetadata: js.UndefOr[DealServingMetadata] = js.native
  /**
    * The set of fields around delivery control that are interesting for a buyer to see but are non-negotiable. These are set by the publisher. This message
    * is assigned an id of 100 since some day we would want to model this as a protobuf extension.
    */
  var deliveryControl: js.UndefOr[DeliveryControl] = js.native
  /** The external deal id assigned to this deal once the deal is finalized. This is the deal-id that shows up in serving/reporting etc. (readonly) */
  var externalDealId: js.UndefOr[String] = js.native
  /** Proposed flight end time of the deal (ms since epoch) This will generally be stored in a granularity of a second. (updatable) */
  var flightEndTimeMs: js.UndefOr[String] = js.native
  /** Proposed flight start time of the deal (ms since epoch) This will generally be stored in a granularity of a second. (updatable) */
  var flightStartTimeMs: js.UndefOr[String] = js.native
  /** Description for the deal terms. (buyer-readonly) */
  var inventoryDescription: js.UndefOr[String] = js.native
  /** Indicates whether the current deal is a RFP template. RFP template is created by buyer and not based on seller created products. */
  var isRfpTemplate: js.UndefOr[Boolean] = js.native
  /** True, if the buyside inventory setup is complete for this deal. (readonly, except via OrderSetupCompleted action) */
  var isSetupComplete: js.UndefOr[Boolean] = js.native
  /** Identifies what kind of resource this is. Value: the fixed string "adexchangebuyer#marketplaceDeal". */
  var kind: js.UndefOr[String] = js.native
  /** The time (ms since epoch) when the deal was last updated. (readonly) */
  var lastUpdateTimeMs: js.UndefOr[String] = js.native
  /** The name of the deal. (updatable) */
  var name: js.UndefOr[String] = js.native
  /** The product-id from which this deal was created. (readonly, except on create) */
  var productId: js.UndefOr[String] = js.native
  /** The revision number of the product that the deal was created from (readonly, except on create) */
  var productRevisionNumber: js.UndefOr[String] = js.native
  /**
    * Specifies the creative source for programmatic deals, PUBLISHER means creative is provided by seller and ADVERTISR means creative is provided by buyer.
    * (buyer-readonly)
    */
  var programmaticCreativeSource: js.UndefOr[String] = js.native
  var proposalId: js.UndefOr[String] = js.native
  /** Optional Seller contact information for the deal (buyer-readonly) */
  var sellerContacts: js.UndefOr[js.Array[ContactInformation]] = js.native
  /** The shared targeting visible to buyers and sellers. Each shared targeting entity is AND'd together. (updatable) */
  var sharedTargetings: js.UndefOr[js.Array[SharedTargeting]] = js.native
  /** The syndication product associated with the deal. (readonly, except on create) */
  var syndicationProduct: js.UndefOr[String] = js.native
  /** The negotiable terms of the deal. (updatable) */
  var terms: js.UndefOr[DealTerms] = js.native
  var webPropertyCode: js.UndefOr[String] = js.native
}

object MarketplaceDeal {
  @scala.inline
  def apply(): MarketplaceDeal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarketplaceDeal]
  }
  @scala.inline
  implicit class MarketplaceDealOps[Self <: MarketplaceDeal] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuyerPrivateData(value: PrivateData): Self = {
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
    def withCreationTimeMs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationTimeMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationTimeMs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationTimeMs")(js.undefined)
        ret
    }
    @scala.inline
    def withCreativePreApprovalPolicy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creativePreApprovalPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreativePreApprovalPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creativePreApprovalPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withCreativeSafeFrameCompatibility(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creativeSafeFrameCompatibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreativeSafeFrameCompatibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creativeSafeFrameCompatibility")(js.undefined)
        ret
    }
    @scala.inline
    def withDealId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dealId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDealId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dealId")(js.undefined)
        ret
    }
    @scala.inline
    def withDealServingMetadata(value: DealServingMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dealServingMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDealServingMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dealServingMetadata")(js.undefined)
        ret
    }
    @scala.inline
    def withDeliveryControl(value: DeliveryControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deliveryControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeliveryControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deliveryControl")(js.undefined)
        ret
    }
    @scala.inline
    def withExternalDealId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalDealId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternalDealId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalDealId")(js.undefined)
        ret
    }
    @scala.inline
    def withFlightEndTimeMs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flightEndTimeMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlightEndTimeMs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flightEndTimeMs")(js.undefined)
        ret
    }
    @scala.inline
    def withFlightStartTimeMs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flightStartTimeMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlightStartTimeMs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flightStartTimeMs")(js.undefined)
        ret
    }
    @scala.inline
    def withInventoryDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inventoryDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInventoryDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inventoryDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withIsRfpTemplate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRfpTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsRfpTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRfpTemplate")(js.undefined)
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
    def withLastUpdateTimeMs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdateTimeMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastUpdateTimeMs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdateTimeMs")(js.undefined)
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
    def withProductId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productId")(js.undefined)
        ret
    }
    @scala.inline
    def withProductRevisionNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productRevisionNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductRevisionNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productRevisionNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withProgrammaticCreativeSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("programmaticCreativeSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgrammaticCreativeSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("programmaticCreativeSource")(js.undefined)
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
    def withSellerContacts(value: js.Array[ContactInformation]): Self = {
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
    def withSharedTargetings(value: js.Array[SharedTargeting]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharedTargetings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSharedTargetings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharedTargetings")(js.undefined)
        ret
    }
    @scala.inline
    def withSyndicationProduct(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syndicationProduct")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSyndicationProduct: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syndicationProduct")(js.undefined)
        ret
    }
    @scala.inline
    def withTerms(value: DealTerms): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("terms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTerms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("terms")(js.undefined)
        ret
    }
    @scala.inline
    def withWebPropertyCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webPropertyCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebPropertyCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webPropertyCode")(js.undefined)
        ret
    }
  }
  
}

