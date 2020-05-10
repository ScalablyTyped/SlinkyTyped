package typingsSlinky.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a buy from the Planning inventory store.
  */
@js.native
trait SchemaInventoryItem extends js.Object {
  /**
    * Account ID of this inventory item.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * Ad slots of this inventory item. If this inventory item represents a
    * standalone placement, there will be exactly one ad slot. If this
    * inventory item represents a placement group, there will be more than one
    * ad slot, each representing one child placement in that placement group.
    */
  var adSlots: js.UndefOr[js.Array[SchemaAdSlot]] = js.native
  /**
    * Advertiser ID of this inventory item.
    */
  var advertiserId: js.UndefOr[String] = js.native
  /**
    * Content category ID of this inventory item.
    */
  var contentCategoryId: js.UndefOr[String] = js.native
  /**
    * Estimated click-through rate of this inventory item.
    */
  var estimatedClickThroughRate: js.UndefOr[String] = js.native
  /**
    * Estimated conversion rate of this inventory item.
    */
  var estimatedConversionRate: js.UndefOr[String] = js.native
  /**
    * ID of this inventory item.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Whether this inventory item is in plan.
    */
  var inPlan: js.UndefOr[Boolean] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#inventoryItem&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Information about the most recent modification of this inventory item.
    */
  var lastModifiedInfo: js.UndefOr[SchemaLastModifiedInfo] = js.native
  /**
    * Name of this inventory item. For standalone inventory items, this is the
    * same name as that of its only ad slot. For group inventory items, this
    * can differ from the name of any of its ad slots.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Negotiation channel ID of this inventory item.
    */
  var negotiationChannelId: js.UndefOr[String] = js.native
  /**
    * Order ID of this inventory item.
    */
  var orderId: js.UndefOr[String] = js.native
  /**
    * Placement strategy ID of this inventory item.
    */
  var placementStrategyId: js.UndefOr[String] = js.native
  /**
    * Pricing of this inventory item.
    */
  var pricing: js.UndefOr[SchemaPricing] = js.native
  /**
    * Project ID of this inventory item.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * RFP ID of this inventory item.
    */
  var rfpId: js.UndefOr[String] = js.native
  /**
    * ID of the site this inventory item is associated with.
    */
  var siteId: js.UndefOr[String] = js.native
  /**
    * Subaccount ID of this inventory item.
    */
  var subaccountId: js.UndefOr[String] = js.native
  /**
    * Type of inventory item.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaInventoryItem {
  @scala.inline
  def apply(): SchemaInventoryItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInventoryItem]
  }
  @scala.inline
  implicit class SchemaInventoryItemOps[Self <: SchemaInventoryItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(js.undefined)
        ret
    }
    @scala.inline
    def withAdSlots(value: js.Array[SchemaAdSlot]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adSlots")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdSlots: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adSlots")(js.undefined)
        ret
    }
    @scala.inline
    def withAdvertiserId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advertiserId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdvertiserId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advertiserId")(js.undefined)
        ret
    }
    @scala.inline
    def withContentCategoryId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentCategoryId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentCategoryId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentCategoryId")(js.undefined)
        ret
    }
    @scala.inline
    def withEstimatedClickThroughRate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("estimatedClickThroughRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEstimatedClickThroughRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("estimatedClickThroughRate")(js.undefined)
        ret
    }
    @scala.inline
    def withEstimatedConversionRate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("estimatedConversionRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEstimatedConversionRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("estimatedConversionRate")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withInPlan(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inPlan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInPlan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inPlan")(js.undefined)
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
    def withLastModifiedInfo(value: SchemaLastModifiedInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifiedInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModifiedInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifiedInfo")(js.undefined)
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
    def withNegotiationChannelId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negotiationChannelId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNegotiationChannelId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negotiationChannelId")(js.undefined)
        ret
    }
    @scala.inline
    def withOrderId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrderId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderId")(js.undefined)
        ret
    }
    @scala.inline
    def withPlacementStrategyId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placementStrategyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlacementStrategyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placementStrategyId")(js.undefined)
        ret
    }
    @scala.inline
    def withPricing(value: SchemaPricing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pricing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPricing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pricing")(js.undefined)
        ret
    }
    @scala.inline
    def withProjectId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjectId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectId")(js.undefined)
        ret
    }
    @scala.inline
    def withRfpId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rfpId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRfpId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rfpId")(js.undefined)
        ret
    }
    @scala.inline
    def withSiteId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("siteId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSiteId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("siteId")(js.undefined)
        ret
    }
    @scala.inline
    def withSubaccountId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subaccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubaccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subaccountId")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

