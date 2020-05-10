package typingsSlinky.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains properties of a placement.
  */
@js.native
trait SchemaPlacement extends js.Object {
  /**
    * Account ID of this placement. This field can be left blank.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * Whether this placement opts out of ad blocking. When true, ad blocking is
    * disabled for this placement. When false, the campaign and site settings
    * take effect.
    */
  var adBlockingOptOut: js.UndefOr[Boolean] = js.native
  /**
    * Advertiser ID of this placement. This field can be left blank.
    */
  var advertiserId: js.UndefOr[String] = js.native
  /**
    * Dimension value for the ID of the advertiser. This is a read-only,
    * auto-generated field.
    */
  var advertiserIdDimensionValue: js.UndefOr[SchemaDimensionValue] = js.native
  /**
    * Whether this placement is archived.
    */
  var archived: js.UndefOr[Boolean] = js.native
  /**
    * Campaign ID of this placement. This field is a required field on
    * insertion.
    */
  var campaignId: js.UndefOr[String] = js.native
  /**
    * Dimension value for the ID of the campaign. This is a read-only,
    * auto-generated field.
    */
  var campaignIdDimensionValue: js.UndefOr[SchemaDimensionValue] = js.native
  /**
    * Comments for this placement.
    */
  var comment: js.UndefOr[String] = js.native
  /**
    * Placement compatibility. DISPLAY and DISPLAY_INTERSTITIAL refer to
    * rendering on desktop, on mobile devices or in mobile apps for regular or
    * interstitial ads respectively. APP and APP_INTERSTITIAL are no longer
    * allowed for new placement insertions. Instead, use DISPLAY or
    * DISPLAY_INTERSTITIAL. IN_STREAM_VIDEO refers to rendering in in-stream
    * video ads developed with the VAST standard. This field is required on
    * insertion.
    */
  var compatibility: js.UndefOr[String] = js.native
  /**
    * ID of the content category assigned to this placement.
    */
  var contentCategoryId: js.UndefOr[String] = js.native
  /**
    * Information about the creation of this placement. This is a read-only
    * field.
    */
  var createInfo: js.UndefOr[SchemaLastModifiedInfo] = js.native
  /**
    * Directory site ID of this placement. On insert, you must set either this
    * field or the siteId field to specify the site associated with this
    * placement. This is a required field that is read-only after insertion.
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
    * ID of this placement. This is a read-only, auto-generated field.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Dimension value for the ID of this placement. This is a read-only,
    * auto-generated field.
    */
  var idDimensionValue: js.UndefOr[SchemaDimensionValue] = js.native
  /**
    * Key name of this placement. This is a read-only, auto-generated field.
    */
  var keyName: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#placement&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Information about the most recent modification of this placement. This is
    * a read-only field.
    */
  var lastModifiedInfo: js.UndefOr[SchemaLastModifiedInfo] = js.native
  /**
    * Lookback window settings for this placement.
    */
  var lookbackConfiguration: js.UndefOr[SchemaLookbackConfiguration] = js.native
  /**
    * Name of this placement.This is a required field and must be less than 256
    * characters long.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Whether payment was approved for this placement. This is a read-only
    * field relevant only to publisher-paid placements.
    */
  var paymentApproved: js.UndefOr[Boolean] = js.native
  /**
    * Payment source for this placement. This is a required field that is
    * read-only after insertion.
    */
  var paymentSource: js.UndefOr[String] = js.native
  /**
    * ID of this placement&#39;s group, if applicable.
    */
  var placementGroupId: js.UndefOr[String] = js.native
  /**
    * Dimension value for the ID of the placement group. This is a read-only,
    * auto-generated field.
    */
  var placementGroupIdDimensionValue: js.UndefOr[SchemaDimensionValue] = js.native
  /**
    * ID of the placement strategy assigned to this placement.
    */
  var placementStrategyId: js.UndefOr[String] = js.native
  /**
    * Pricing schedule of this placement. This field is required on insertion,
    * specifically subfields startDate, endDate and pricingType.
    */
  var pricingSchedule: js.UndefOr[SchemaPricingSchedule] = js.native
  /**
    * Whether this placement is the primary placement of a roadblock (placement
    * group). You cannot change this field from true to false. Setting this
    * field to true will automatically set the primary field on the original
    * primary placement of the roadblock to false, and it will automatically
    * set the roadblock&#39;s primaryPlacementId field to the ID of this
    * placement.
    */
  var primary: js.UndefOr[Boolean] = js.native
  /**
    * Information about the last publisher update. This is a read-only field.
    */
  var publisherUpdateInfo: js.UndefOr[SchemaLastModifiedInfo] = js.native
  /**
    * Site ID associated with this placement. On insert, you must set either
    * this field or the directorySiteId field to specify the site associated
    * with this placement. This is a required field that is read-only after
    * insertion.
    */
  var siteId: js.UndefOr[String] = js.native
  /**
    * Dimension value for the ID of the site. This is a read-only,
    * auto-generated field.
    */
  var siteIdDimensionValue: js.UndefOr[SchemaDimensionValue] = js.native
  /**
    * Size associated with this placement. When inserting or updating a
    * placement, only the size ID field is used. This field is required on
    * insertion.
    */
  var size: js.UndefOr[SchemaSize] = js.native
  /**
    * Whether creatives assigned to this placement must be SSL-compliant.
    */
  var sslRequired: js.UndefOr[Boolean] = js.native
  /**
    * Third-party placement status.
    */
  var status: js.UndefOr[String] = js.native
  /**
    * Subaccount ID of this placement. This field can be left blank.
    */
  var subaccountId: js.UndefOr[String] = js.native
  /**
    * Tag formats to generate for this placement. This field is required on
    * insertion. Acceptable values are: - &quot;PLACEMENT_TAG_STANDARD&quot; -
    * &quot;PLACEMENT_TAG_IFRAME_JAVASCRIPT&quot; -
    * &quot;PLACEMENT_TAG_IFRAME_ILAYER&quot; -
    * &quot;PLACEMENT_TAG_INTERNAL_REDIRECT&quot; -
    * &quot;PLACEMENT_TAG_JAVASCRIPT&quot; -
    * &quot;PLACEMENT_TAG_INTERSTITIAL_IFRAME_JAVASCRIPT&quot; -
    * &quot;PLACEMENT_TAG_INTERSTITIAL_INTERNAL_REDIRECT&quot; -
    * &quot;PLACEMENT_TAG_INTERSTITIAL_JAVASCRIPT&quot; -
    * &quot;PLACEMENT_TAG_CLICK_COMMANDS&quot; -
    * &quot;PLACEMENT_TAG_INSTREAM_VIDEO_PREFETCH&quot; -
    * &quot;PLACEMENT_TAG_INSTREAM_VIDEO_PREFETCH_VAST_3&quot; -
    * &quot;PLACEMENT_TAG_INSTREAM_VIDEO_PREFETCH_VAST_4&quot; -
    * &quot;PLACEMENT_TAG_TRACKING&quot; -
    * &quot;PLACEMENT_TAG_TRACKING_IFRAME&quot; -
    * &quot;PLACEMENT_TAG_TRACKING_JAVASCRIPT&quot;
    */
  var tagFormats: js.UndefOr[js.Array[String]] = js.native
  /**
    * Tag settings for this placement.
    */
  var tagSetting: js.UndefOr[SchemaTagSetting] = js.native
  /**
    * Whether Verification and ActiveView are disabled for in-stream video
    * creatives for this placement. The same setting videoActiveViewOptOut
    * exists on the site level -- the opt out occurs if either of these
    * settings are true. These settings are distinct from
    * DirectorySites.settings.activeViewOptOut or
    * Sites.siteSettings.activeViewOptOut which only apply to display ads.
    * However, Accounts.activeViewOptOut opts out both video traffic, as well
    * as display ads, from Verification and ActiveView.
    */
  var videoActiveViewOptOut: js.UndefOr[Boolean] = js.native
  /**
    * A collection of settings which affect video creatives served through this
    * placement. Applicable to placements with IN_STREAM_VIDEO compatibility.
    */
  var videoSettings: js.UndefOr[SchemaVideoSettings] = js.native
  /**
    * VPAID adapter setting for this placement. Controls which VPAID format the
    * measurement adapter will use for in-stream video creatives assigned to
    * this placement.  Note: Flash is no longer supported. This field now
    * defaults to HTML5 when the following values are provided: FLASH, BOTH.
    */
  var vpaidAdapterChoice: js.UndefOr[String] = js.native
}

object SchemaPlacement {
  @scala.inline
  def apply(): SchemaPlacement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlacement]
  }
  @scala.inline
  implicit class SchemaPlacementOps[Self <: SchemaPlacement] (val x: Self) extends AnyVal {
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
    def withAdBlockingOptOut(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adBlockingOptOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdBlockingOptOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adBlockingOptOut")(js.undefined)
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
    def withCompatibility(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compatibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompatibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compatibility")(js.undefined)
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
    def withKeyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyName")(js.undefined)
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
    def withLookbackConfiguration(value: SchemaLookbackConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lookbackConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLookbackConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lookbackConfiguration")(js.undefined)
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
    def withPaymentApproved(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paymentApproved")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaymentApproved: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paymentApproved")(js.undefined)
        ret
    }
    @scala.inline
    def withPaymentSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paymentSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaymentSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paymentSource")(js.undefined)
        ret
    }
    @scala.inline
    def withPlacementGroupId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placementGroupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlacementGroupId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placementGroupId")(js.undefined)
        ret
    }
    @scala.inline
    def withPlacementGroupIdDimensionValue(value: SchemaDimensionValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placementGroupIdDimensionValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlacementGroupIdDimensionValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placementGroupIdDimensionValue")(js.undefined)
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
    def withPrimary(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primary")(js.undefined)
        ret
    }
    @scala.inline
    def withPublisherUpdateInfo(value: SchemaLastModifiedInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publisherUpdateInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublisherUpdateInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publisherUpdateInfo")(js.undefined)
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
    def withSize(value: SchemaSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withSslRequired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sslRequired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSslRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sslRequired")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
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
    def withTagFormats(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagFormats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagFormats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagFormats")(js.undefined)
        ret
    }
    @scala.inline
    def withTagSetting(value: SchemaTagSetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagSetting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagSetting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagSetting")(js.undefined)
        ret
    }
    @scala.inline
    def withVideoActiveViewOptOut(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoActiveViewOptOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideoActiveViewOptOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoActiveViewOptOut")(js.undefined)
        ret
    }
    @scala.inline
    def withVideoSettings(value: SchemaVideoSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideoSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withVpaidAdapterChoice(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpaidAdapterChoice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpaidAdapterChoice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpaidAdapterChoice")(js.undefined)
        ret
    }
  }
  
}

