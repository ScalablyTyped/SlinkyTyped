package typingsSlinky.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A deal represents a segment of inventory for displaying ads on. A proposal
  * can contain multiple deals. A deal contains the terms and targeting
  * information that is used for serving.
  */
@js.native
trait SchemaDeal extends js.Object {
  /**
    * Proposed flight end time of the deal. This will generally be stored in a
    * granularity of a second. A value is not required for Private Auction
    * deals or Preferred Deals.
    */
  var availableEndTime: js.UndefOr[String] = js.native
  /**
    * Optional proposed flight start time of the deal. This will generally be
    * stored in the granularity of one second since deal serving starts at
    * seconds boundary. Any time specified with more granularity (e.g., in
    * milliseconds) will be truncated towards the start of time in seconds.
    */
  var availableStartTime: js.UndefOr[String] = js.native
  /**
    * Buyer private data (hidden from seller).
    */
  var buyerPrivateData: js.UndefOr[SchemaPrivateData] = js.native
  /**
    * The product ID from which this deal was created.  Note: This field may be
    * set only when creating the resource. Modifying this field while updating
    * the resource will result in an error.
    */
  var createProductId: js.UndefOr[String] = js.native
  /**
    * Optional revision number of the product that the deal was created from.
    * If present on create, and the server `product_revision` has advanced
    * sinced the passed-in `create_product_revision`, an `ABORTED` error will
    * be returned.  Note: This field may be set only when creating the
    * resource. Modifying this field while updating the resource will result in
    * an error.
    */
  var createProductRevision: js.UndefOr[String] = js.native
  /**
    * The time of the deal creation. @OutputOnly
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * Specifies the creative pre-approval policy. @OutputOnly
    */
  var creativePreApprovalPolicy: js.UndefOr[String] = js.native
  /**
    * Restricitions about the creatives associated with the deal (i.e., size)
    * This is available for Programmatic Guaranteed/Preferred Deals in Ad
    * Manager. @OutputOnly
    */
  var creativeRestrictions: js.UndefOr[SchemaCreativeRestrictions] = js.native
  /**
    * Specifies whether the creative is safeFrame compatible. @OutputOnly
    */
  var creativeSafeFrameCompatibility: js.UndefOr[String] = js.native
  /**
    * A unique deal ID for the deal (server-assigned). @OutputOnly
    */
  var dealId: js.UndefOr[String] = js.native
  /**
    * Metadata about the serving status of this deal. @OutputOnly
    */
  var dealServingMetadata: js.UndefOr[SchemaDealServingMetadata] = js.native
  /**
    * The negotiable terms of the deal.
    */
  var dealTerms: js.UndefOr[SchemaDealTerms] = js.native
  /**
    * The set of fields around delivery control that are interesting for a
    * buyer to see but are non-negotiable. These are set by the publisher.
    */
  var deliveryControl: js.UndefOr[SchemaDeliveryControl] = js.native
  /**
    * Description for the deal terms.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The name of the deal.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * The external deal ID assigned to this deal once the deal is finalized.
    * This is the deal ID that shows up in serving/reporting etc. @OutputOnly
    */
  var externalDealId: js.UndefOr[String] = js.native
  /**
    * True, if the buyside inventory setup is complete for this deal.
    * @OutputOnly
    */
  var isSetupComplete: js.UndefOr[Boolean] = js.native
  /**
    * Specifies the creative source for programmatic deals. PUBLISHER means
    * creative is provided by seller and ADVERTISER means creative is provided
    * by buyer. @OutputOnly
    */
  var programmaticCreativeSource: js.UndefOr[String] = js.native
  /**
    * ID of the proposal that this deal is part of. @OutputOnly
    */
  var proposalId: js.UndefOr[String] = js.native
  /**
    * Seller contact information for the deal. @OutputOnly
    */
  var sellerContacts: js.UndefOr[js.Array[SchemaContactInformation]] = js.native
  /**
    * The syndication product associated with the deal.  Note: This field may
    * be set only when creating the resource. Modifying this field while
    * updating the resource will result in an error.
    */
  var syndicationProduct: js.UndefOr[String] = js.native
  /**
    * Specifies the subset of inventory targeted by the deal. @OutputOnly
    */
  var targeting: js.UndefOr[SchemaMarketplaceTargeting] = js.native
  /**
    * The shared targeting visible to buyers and sellers. Each shared targeting
    * entity is AND&#39;d together.
    */
  var targetingCriterion: js.UndefOr[js.Array[SchemaTargetingCriteria]] = js.native
  /**
    * The time when the deal was last updated. @OutputOnly
    */
  var updateTime: js.UndefOr[String] = js.native
  /**
    * The web property code for the seller copied over from the product.
    */
  var webPropertyCode: js.UndefOr[String] = js.native
}

object SchemaDeal {
  @scala.inline
  def apply(): SchemaDeal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeal]
  }
  @scala.inline
  implicit class SchemaDealOps[Self <: SchemaDeal] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvailableEndTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availableEndTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailableEndTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availableEndTime")(js.undefined)
        ret
    }
    @scala.inline
    def withAvailableStartTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availableStartTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailableStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availableStartTime")(js.undefined)
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
    def withCreateProductId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createProductId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateProductId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createProductId")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateProductRevision(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createProductRevision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateProductRevision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createProductRevision")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(js.undefined)
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
    def withCreativeRestrictions(value: SchemaCreativeRestrictions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creativeRestrictions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreativeRestrictions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creativeRestrictions")(js.undefined)
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
    def withDealServingMetadata(value: SchemaDealServingMetadata): Self = {
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
    def withDealTerms(value: SchemaDealTerms): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dealTerms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDealTerms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dealTerms")(js.undefined)
        ret
    }
    @scala.inline
    def withDeliveryControl(value: SchemaDeliveryControl): Self = {
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
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
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
    def withTargeting(value: SchemaMarketplaceTargeting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targeting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargeting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targeting")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetingCriterion(value: js.Array[SchemaTargetingCriteria]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetingCriterion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetingCriterion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetingCriterion")(js.undefined)
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

