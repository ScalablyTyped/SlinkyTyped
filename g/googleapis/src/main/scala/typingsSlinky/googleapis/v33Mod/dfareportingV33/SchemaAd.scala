package typingsSlinky.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains properties of a Campaign Manager ad.
  */
@js.native
trait SchemaAd extends js.Object {
  /**
    * Account ID of this ad. This is a read-only field that can be left blank.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * Whether this ad is active. When true, archived must be false.
    */
  var active: js.UndefOr[Boolean] = js.native
  /**
    * Advertiser ID of this ad. This is a required field on insertion.
    */
  var advertiserId: js.UndefOr[String] = js.native
  /**
    * Dimension value for the ID of the advertiser. This is a read-only,
    * auto-generated field.
    */
  var advertiserIdDimensionValue: js.UndefOr[SchemaDimensionValue] = js.native
  /**
    * Whether this ad is archived. When true, active must be false.
    */
  var archived: js.UndefOr[Boolean] = js.native
  /**
    * Audience segment ID that is being targeted for this ad. Applicable when
    * type is AD_SERVING_STANDARD_AD.
    */
  var audienceSegmentId: js.UndefOr[String] = js.native
  /**
    * Campaign ID of this ad. This is a required field on insertion.
    */
  var campaignId: js.UndefOr[String] = js.native
  /**
    * Dimension value for the ID of the campaign. This is a read-only,
    * auto-generated field.
    */
  var campaignIdDimensionValue: js.UndefOr[SchemaDimensionValue] = js.native
  /**
    * Click-through URL for this ad. This is a required field on insertion.
    * Applicable when type is AD_SERVING_CLICK_TRACKER.
    */
  var clickThroughUrl: js.UndefOr[SchemaClickThroughUrl] = js.native
  /**
    * Click-through URL suffix properties for this ad. Applies to the URL in
    * the ad or (if overriding ad properties) the URL in the creative.
    */
  var clickThroughUrlSuffixProperties: js.UndefOr[SchemaClickThroughUrlSuffixProperties] = js.native
  /**
    * Comments for this ad.
    */
  var comments: js.UndefOr[String] = js.native
  /**
    * Compatibility of this ad. Applicable when type is AD_SERVING_DEFAULT_AD.
    * DISPLAY and DISPLAY_INTERSTITIAL refer to either rendering on desktop or
    * on mobile devices or in mobile apps for regular or interstitial ads,
    * respectively. APP and APP_INTERSTITIAL are only used for existing default
    * ads. New mobile placements must be assigned DISPLAY or
    * DISPLAY_INTERSTITIAL and default ads created for those placements will be
    * limited to those compatibility types. IN_STREAM_VIDEO refers to rendering
    * in-stream video ads developed with the VAST standard.
    */
  var compatibility: js.UndefOr[String] = js.native
  /**
    * Information about the creation of this ad. This is a read-only field.
    */
  var createInfo: js.UndefOr[SchemaLastModifiedInfo] = js.native
  /**
    * Creative group assignments for this ad. Applicable when type is
    * AD_SERVING_CLICK_TRACKER. Only one assignment per creative group number
    * is allowed for a maximum of two assignments.
    */
  var creativeGroupAssignments: js.UndefOr[js.Array[SchemaCreativeGroupAssignment]] = js.native
  /**
    * Creative rotation for this ad. Applicable when type is
    * AD_SERVING_DEFAULT_AD, AD_SERVING_STANDARD_AD, or AD_SERVING_TRACKING.
    * When type is AD_SERVING_DEFAULT_AD, this field should have exactly one
    * creativeAssignment.
    */
  var creativeRotation: js.UndefOr[SchemaCreativeRotation] = js.native
  /**
    * Time and day targeting information for this ad. This field must be left
    * blank if the ad is using a targeting template. Applicable when type is
    * AD_SERVING_STANDARD_AD.
    */
  var dayPartTargeting: js.UndefOr[SchemaDayPartTargeting] = js.native
  /**
    * Default click-through event tag properties for this ad.
    */
  var defaultClickThroughEventTagProperties: js.UndefOr[SchemaDefaultClickThroughEventTagProperties] = js.native
  /**
    * Delivery schedule information for this ad. Applicable when type is
    * AD_SERVING_STANDARD_AD or AD_SERVING_TRACKING. This field along with
    * subfields priority and impressionRatio are required on insertion when
    * type is AD_SERVING_STANDARD_AD.
    */
  var deliverySchedule: js.UndefOr[SchemaDeliverySchedule] = js.native
  /**
    * Whether this ad is a dynamic click tracker. Applicable when type is
    * AD_SERVING_CLICK_TRACKER. This is a required field on insert, and is
    * read-only after insert.
    */
  var dynamicClickTracker: js.UndefOr[Boolean] = js.native
  /**
    * Date and time that this ad should stop serving. Must be later than the
    * start time. This is a required field on insertion.
    */
  var endTime: js.UndefOr[String] = js.native
  /**
    * Event tag overrides for this ad.
    */
  var eventTagOverrides: js.UndefOr[js.Array[SchemaEventTagOverride]] = js.native
  /**
    * Geographical targeting information for this ad. This field must be left
    * blank if the ad is using a targeting template. Applicable when type is
    * AD_SERVING_STANDARD_AD.
    */
  var geoTargeting: js.UndefOr[SchemaGeoTargeting] = js.native
  /**
    * ID of this ad. This is a read-only, auto-generated field.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Dimension value for the ID of this ad. This is a read-only,
    * auto-generated field.
    */
  var idDimensionValue: js.UndefOr[SchemaDimensionValue] = js.native
  /**
    * Key-value targeting information for this ad. This field must be left
    * blank if the ad is using a targeting template. Applicable when type is
    * AD_SERVING_STANDARD_AD.
    */
  var keyValueTargetingExpression: js.UndefOr[SchemaKeyValueTargetingExpression] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#ad&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Language targeting information for this ad. This field must be left blank
    * if the ad is using a targeting template. Applicable when type is
    * AD_SERVING_STANDARD_AD.
    */
  var languageTargeting: js.UndefOr[SchemaLanguageTargeting] = js.native
  /**
    * Information about the most recent modification of this ad. This is a
    * read-only field.
    */
  var lastModifiedInfo: js.UndefOr[SchemaLastModifiedInfo] = js.native
  /**
    * Name of this ad. This is a required field and must be less than 256
    * characters long.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Placement assignments for this ad.
    */
  var placementAssignments: js.UndefOr[js.Array[SchemaPlacementAssignment]] = js.native
  /**
    * Remarketing list targeting expression for this ad. This field must be
    * left blank if the ad is using a targeting template. Applicable when type
    * is AD_SERVING_STANDARD_AD.
    */
  var remarketingListExpression: js.UndefOr[SchemaListTargetingExpression] = js.native
  /**
    * Size of this ad. Applicable when type is AD_SERVING_DEFAULT_AD.
    */
  var size: js.UndefOr[SchemaSize] = js.native
  /**
    * Whether this ad is ssl compliant. This is a read-only field that is
    * auto-generated when the ad is inserted or updated.
    */
  var sslCompliant: js.UndefOr[Boolean] = js.native
  /**
    * Whether this ad requires ssl. This is a read-only field that is
    * auto-generated when the ad is inserted or updated.
    */
  var sslRequired: js.UndefOr[Boolean] = js.native
  /**
    * Date and time that this ad should start serving. If creating an ad, this
    * field must be a time in the future. This is a required field on
    * insertion.
    */
  var startTime: js.UndefOr[String] = js.native
  /**
    * Subaccount ID of this ad. This is a read-only field that can be left
    * blank.
    */
  var subaccountId: js.UndefOr[String] = js.native
  /**
    * Targeting template ID, used to apply preconfigured targeting information
    * to this ad. This cannot be set while any of dayPartTargeting,
    * geoTargeting, keyValueTargetingExpression, languageTargeting,
    * remarketingListExpression, or technologyTargeting are set. Applicable
    * when type is AD_SERVING_STANDARD_AD.
    */
  var targetingTemplateId: js.UndefOr[String] = js.native
  /**
    * Technology platform targeting information for this ad. This field must be
    * left blank if the ad is using a targeting template. Applicable when type
    * is AD_SERVING_STANDARD_AD.
    */
  var technologyTargeting: js.UndefOr[SchemaTechnologyTargeting] = js.native
  /**
    * Type of ad. This is a required field on insertion. Note that default ads
    * (AD_SERVING_DEFAULT_AD) cannot be created directly (see Creative
    * resource).
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaAd {
  @scala.inline
  def apply(): SchemaAd = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAd]
  }
  @scala.inline
  implicit class SchemaAdOps[Self <: SchemaAd] (val x: Self) extends AnyVal {
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
    def withActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(js.undefined)
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
    def withAudienceSegmentId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audienceSegmentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudienceSegmentId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audienceSegmentId")(js.undefined)
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
    def withClickThroughUrl(value: SchemaClickThroughUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickThroughUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClickThroughUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickThroughUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withClickThroughUrlSuffixProperties(value: SchemaClickThroughUrlSuffixProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickThroughUrlSuffixProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClickThroughUrlSuffixProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickThroughUrlSuffixProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withComments(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(js.undefined)
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
    def withCreativeGroupAssignments(value: js.Array[SchemaCreativeGroupAssignment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creativeGroupAssignments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreativeGroupAssignments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creativeGroupAssignments")(js.undefined)
        ret
    }
    @scala.inline
    def withCreativeRotation(value: SchemaCreativeRotation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creativeRotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreativeRotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creativeRotation")(js.undefined)
        ret
    }
    @scala.inline
    def withDayPartTargeting(value: SchemaDayPartTargeting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayPartTargeting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDayPartTargeting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayPartTargeting")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultClickThroughEventTagProperties(value: SchemaDefaultClickThroughEventTagProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultClickThroughEventTagProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultClickThroughEventTagProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultClickThroughEventTagProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withDeliverySchedule(value: SchemaDeliverySchedule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deliverySchedule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeliverySchedule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deliverySchedule")(js.undefined)
        ret
    }
    @scala.inline
    def withDynamicClickTracker(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicClickTracker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDynamicClickTracker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicClickTracker")(js.undefined)
        ret
    }
    @scala.inline
    def withEndTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(js.undefined)
        ret
    }
    @scala.inline
    def withEventTagOverrides(value: js.Array[SchemaEventTagOverride]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventTagOverrides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventTagOverrides: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventTagOverrides")(js.undefined)
        ret
    }
    @scala.inline
    def withGeoTargeting(value: SchemaGeoTargeting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geoTargeting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeoTargeting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geoTargeting")(js.undefined)
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
    def withKeyValueTargetingExpression(value: SchemaKeyValueTargetingExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyValueTargetingExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyValueTargetingExpression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyValueTargetingExpression")(js.undefined)
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
    def withLanguageTargeting(value: SchemaLanguageTargeting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languageTargeting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguageTargeting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languageTargeting")(js.undefined)
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
    def withPlacementAssignments(value: js.Array[SchemaPlacementAssignment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placementAssignments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlacementAssignments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placementAssignments")(js.undefined)
        ret
    }
    @scala.inline
    def withRemarketingListExpression(value: SchemaListTargetingExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remarketingListExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemarketingListExpression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remarketingListExpression")(js.undefined)
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
    def withSslCompliant(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sslCompliant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSslCompliant: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sslCompliant")(js.undefined)
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
    def withStartTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(js.undefined)
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
    def withTargetingTemplateId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetingTemplateId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetingTemplateId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetingTemplateId")(js.undefined)
        ret
    }
    @scala.inline
    def withTechnologyTargeting(value: SchemaTechnologyTargeting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("technologyTargeting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTechnologyTargeting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("technologyTargeting")(js.undefined)
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

