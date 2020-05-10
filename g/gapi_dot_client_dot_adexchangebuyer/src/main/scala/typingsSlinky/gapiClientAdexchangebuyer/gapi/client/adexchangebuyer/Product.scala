package typingsSlinky.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Product extends js.Object {
  /** The billed buyer corresponding to the buyer that created the offer. (readonly, except on create) */
  var billedBuyer: js.UndefOr[Buyer] = js.native
  /** The buyer that created the offer if this is a buyer initiated offer (readonly, except on create) */
  var buyer: js.UndefOr[Buyer] = js.native
  /** Creation time in ms. since epoch (readonly) */
  var creationTimeMs: js.UndefOr[String] = js.native
  /** Optional contact information for the creator of this product. (buyer-readonly) */
  var creatorContacts: js.UndefOr[js.Array[ContactInformation]] = js.native
  /** The role that created the offer. Set to BUYER for buyer initiated offers. */
  var creatorRole: js.UndefOr[String] = js.native
  /**
    * The set of fields around delivery control that are interesting for a buyer to see but are non-negotiable. These are set by the publisher. This message
    * is assigned an id of 100 since some day we would want to model this as a protobuf extension.
    */
  var deliveryControl: js.UndefOr[DeliveryControl] = js.native
  /** The proposed end time for the deal (ms since epoch) (buyer-readonly) */
  var flightEndTimeMs: js.UndefOr[String] = js.native
  /** Inventory availability dates. (times are in ms since epoch) The granularity is generally in the order of seconds. (buyer-readonly) */
  var flightStartTimeMs: js.UndefOr[String] = js.native
  /**
    * If the creator has already signed off on the product, then the buyer can finalize the deal by accepting the product as is. When copying to a proposal,
    * if any of the terms are changed, then auto_finalize is automatically set to false.
    */
  var hasCreatorSignedOff: js.UndefOr[Boolean] = js.native
  /** What exchange will provide this inventory (readonly, except on create). */
  var inventorySource: js.UndefOr[String] = js.native
  /** Identifies what kind of resource this is. Value: the fixed string "adexchangebuyer#product". */
  var kind: js.UndefOr[String] = js.native
  /** Optional List of labels for the product (optional, buyer-readonly). */
  var labels: js.UndefOr[js.Array[MarketplaceLabel]] = js.native
  /** Time of last update in ms. since epoch (readonly) */
  var lastUpdateTimeMs: js.UndefOr[String] = js.native
  /** Optional legacy offer id if this offer is a preferred deal offer. */
  var legacyOfferId: js.UndefOr[String] = js.native
  /**
    * Marketplace publisher profile Id. This Id differs from the regular publisher_profile_id in that 1. This is a new id, the old Id will be deprecated in
    * 2017. 2. This id uniquely identifies a publisher profile by itself.
    */
  var marketplacePublisherProfileId: js.UndefOr[String] = js.native
  /** The name for this product as set by the seller. (buyer-readonly) */
  var name: js.UndefOr[String] = js.native
  /** Optional private auction id if this offer is a private auction offer. */
  var privateAuctionId: js.UndefOr[String] = js.native
  /** The unique id for the product (readonly) */
  var productId: js.UndefOr[String] = js.native
  /**
    * Id of the publisher profile for a given seller. A (seller.account_id, publisher_profile_id) pair uniquely identifies a publisher profile. Buyers can
    * call the PublisherProfiles::List endpoint to get a list of publisher profiles for a given seller.
    */
  var publisherProfileId: js.UndefOr[String] = js.native
  /** Publisher self-provided forecast information. */
  var publisherProvidedForecast: js.UndefOr[PublisherProvidedForecast] = js.native
  /** The revision number of the product. (readonly) */
  var revisionNumber: js.UndefOr[String] = js.native
  /** Information about the seller that created this product (readonly, except on create) */
  var seller: js.UndefOr[Seller] = js.native
  /**
    * Targeting that is shared between the buyer and the seller. Each targeting criteria has a specified key and for each key there is a list of inclusion
    * value or exclusion values. (buyer-readonly)
    */
  var sharedTargetings: js.UndefOr[js.Array[SharedTargeting]] = js.native
  /** The state of the product. (buyer-readonly) */
  var state: js.UndefOr[String] = js.native
  /** The syndication product associated with the deal. (readonly, except on create) */
  var syndicationProduct: js.UndefOr[String] = js.native
  /** The negotiable terms of the deal (buyer-readonly) */
  var terms: js.UndefOr[DealTerms] = js.native
  /** The web property code for the seller. This field is meant to be copied over as is when creating deals. */
  var webPropertyCode: js.UndefOr[String] = js.native
}

object Product {
  @scala.inline
  def apply(): Product = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Product]
  }
  @scala.inline
  implicit class ProductOps[Self <: Product] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBilledBuyer(value: Buyer): Self = {
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
    def withBuyer(value: Buyer): Self = {
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
    def withCreatorContacts(value: js.Array[ContactInformation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creatorContacts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatorContacts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creatorContacts")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatorRole(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creatorRole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatorRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creatorRole")(js.undefined)
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
    def withHasCreatorSignedOff(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasCreatorSignedOff")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasCreatorSignedOff: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasCreatorSignedOff")(js.undefined)
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
    def withLabels(value: js.Array[MarketplaceLabel]): Self = {
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
    def withLegacyOfferId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legacyOfferId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegacyOfferId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legacyOfferId")(js.undefined)
        ret
    }
    @scala.inline
    def withMarketplacePublisherProfileId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marketplacePublisherProfileId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarketplacePublisherProfileId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marketplacePublisherProfileId")(js.undefined)
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
    def withPublisherProfileId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publisherProfileId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublisherProfileId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publisherProfileId")(js.undefined)
        ret
    }
    @scala.inline
    def withPublisherProvidedForecast(value: PublisherProvidedForecast): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publisherProvidedForecast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublisherProvidedForecast: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publisherProvidedForecast")(js.undefined)
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
    def withSeller(value: Seller): Self = {
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
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
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

