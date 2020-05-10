package typingsSlinky.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains properties of a package or roadblock.
  */
@js.native
trait SchemaPlacementGroup extends js.Object {
  /**
    * Account ID of this placement group. This is a read-only field that can be
    * left blank.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * Advertiser ID of this placement group. This is a required field on
    * insertion.
    */
  var advertiserId: js.UndefOr[String] = js.native
  /**
    * Dimension value for the ID of the advertiser. This is a read-only,
    * auto-generated field.
    */
  var advertiserIdDimensionValue: js.UndefOr[SchemaDimensionValue] = js.native
  /**
    * Whether this placement group is archived.
    */
  var archived: js.UndefOr[Boolean] = js.native
  /**
    * Campaign ID of this placement group. This field is required on insertion.
    */
  var campaignId: js.UndefOr[String] = js.native
  /**
    * Dimension value for the ID of the campaign. This is a read-only,
    * auto-generated field.
    */
  var campaignIdDimensionValue: js.UndefOr[SchemaDimensionValue] = js.native
  /**
    * IDs of placements which are assigned to this placement group. This is a
    * read-only, auto-generated field.
    */
  var childPlacementIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Comments for this placement group.
    */
  var comment: js.UndefOr[String] = js.native
  /**
    * ID of the content category assigned to this placement group.
    */
  var contentCategoryId: js.UndefOr[String] = js.native
  /**
    * Information about the creation of this placement group. This is a
    * read-only field.
    */
  var createInfo: js.UndefOr[SchemaLastModifiedInfo] = js.native
  /**
    * Directory site ID associated with this placement group. On insert, you
    * must set either this field or the site_id field to specify the site
    * associated with this placement group. This is a required field that is
    * read-only after insertion.
    */
  var directorySiteId: js.UndefOr[String] = js.native
  /**
    * Dimension value for the ID of the directory site. This is a read-only,
    * auto-generated field.
    */
  var directorySiteIdDimensionValue: js.UndefOr[SchemaDimensionValue] = js.native
  /**
    * External ID for this placement.
    */
  var externalId: js.UndefOr[String] = js.native
  /**
    * ID of this placement group. This is a read-only, auto-generated field.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Dimension value for the ID of this placement group. This is a read-only,
    * auto-generated field.
    */
  var idDimensionValue: js.UndefOr[SchemaDimensionValue] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#placementGroup&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Information about the most recent modification of this placement group.
    * This is a read-only field.
    */
  var lastModifiedInfo: js.UndefOr[SchemaLastModifiedInfo] = js.native
  /**
    * Name of this placement group. This is a required field and must be less
    * than 256 characters long.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Type of this placement group. A package is a simple group of placements
    * that acts as a single pricing point for a group of tags. A roadblock is a
    * group of placements that not only acts as a single pricing point, but
    * also assumes that all the tags in it will be served at the same time. A
    * roadblock requires one of its assigned placements to be marked as primary
    * for reporting. This field is required on insertion.
    */
  var placementGroupType: js.UndefOr[String] = js.native
  /**
    * ID of the placement strategy assigned to this placement group.
    */
  var placementStrategyId: js.UndefOr[String] = js.native
  /**
    * Pricing schedule of this placement group. This field is required on
    * insertion.
    */
  var pricingSchedule: js.UndefOr[SchemaPricingSchedule] = js.native
  /**
    * ID of the primary placement, used to calculate the media cost of a
    * roadblock (placement group). Modifying this field will automatically
    * modify the primary field on all affected roadblock child placements.
    */
  var primaryPlacementId: js.UndefOr[String] = js.native
  /**
    * Dimension value for the ID of the primary placement. This is a read-only,
    * auto-generated field.
    */
  var primaryPlacementIdDimensionValue: js.UndefOr[SchemaDimensionValue] = js.native
  /**
    * Site ID associated with this placement group. On insert, you must set
    * either this field or the directorySiteId field to specify the site
    * associated with this placement group. This is a required field that is
    * read-only after insertion.
    */
  var siteId: js.UndefOr[String] = js.native
  /**
    * Dimension value for the ID of the site. This is a read-only,
    * auto-generated field.
    */
  var siteIdDimensionValue: js.UndefOr[SchemaDimensionValue] = js.native
  /**
    * Subaccount ID of this placement group. This is a read-only field that can
    * be left blank.
    */
  var subaccountId: js.UndefOr[String] = js.native
}

object SchemaPlacementGroup {
  @scala.inline
  def apply(): SchemaPlacementGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlacementGroup]
  }
  @scala.inline
  implicit class SchemaPlacementGroupOps[Self <: SchemaPlacementGroup] (val x: Self) extends AnyVal {
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
    def withAdvertiserIdDimensionValue(value: SchemaDimensionValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advertiserIdDimensionValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdvertiserIdDimensionValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advertiserIdDimensionValue")(js.undefined)
        ret
    }
    @scala.inline
    def withArchived(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("archived")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArchived: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("archived")(js.undefined)
        ret
    }
    @scala.inline
    def withCampaignId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("campaignId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCampaignId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("campaignId")(js.undefined)
        ret
    }
    @scala.inline
    def withCampaignIdDimensionValue(value: SchemaDimensionValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("campaignIdDimensionValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCampaignIdDimensionValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("campaignIdDimensionValue")(js.undefined)
        ret
    }
    @scala.inline
    def withChildPlacementIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childPlacementIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildPlacementIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childPlacementIds")(js.undefined)
        ret
    }
    @scala.inline
    def withComment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(js.undefined)
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
    def withCreateInfo(value: SchemaLastModifiedInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withDirectorySiteId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directorySiteId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectorySiteId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directorySiteId")(js.undefined)
        ret
    }
    @scala.inline
    def withDirectorySiteIdDimensionValue(value: SchemaDimensionValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directorySiteIdDimensionValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectorySiteIdDimensionValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directorySiteIdDimensionValue")(js.undefined)
        ret
    }
    @scala.inline
    def withExternalId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternalId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalId")(js.undefined)
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
    def withIdDimensionValue(value: SchemaDimensionValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idDimensionValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdDimensionValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idDimensionValue")(js.undefined)
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
    def withPlacementGroupType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placementGroupType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlacementGroupType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placementGroupType")(js.undefined)
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
    def withPricingSchedule(value: SchemaPricingSchedule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pricingSchedule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPricingSchedule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pricingSchedule")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimaryPlacementId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryPlacementId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimaryPlacementId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryPlacementId")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimaryPlacementIdDimensionValue(value: SchemaDimensionValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryPlacementIdDimensionValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimaryPlacementIdDimensionValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryPlacementIdDimensionValue")(js.undefined)
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
    def withSiteIdDimensionValue(value: SchemaDimensionValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("siteIdDimensionValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSiteIdDimensionValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("siteIdDimensionValue")(js.undefined)
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
  }
  
}

