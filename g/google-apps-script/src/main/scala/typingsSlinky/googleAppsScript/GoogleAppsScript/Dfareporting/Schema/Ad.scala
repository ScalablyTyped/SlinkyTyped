package typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ad extends js.Object {
  var accountId: js.UndefOr[String] = js.native
  var active: js.UndefOr[Boolean] = js.native
  var advertiserId: js.UndefOr[String] = js.native
  var advertiserIdDimensionValue: js.UndefOr[DimensionValue] = js.native
  var archived: js.UndefOr[Boolean] = js.native
  var audienceSegmentId: js.UndefOr[String] = js.native
  var campaignId: js.UndefOr[String] = js.native
  var campaignIdDimensionValue: js.UndefOr[DimensionValue] = js.native
  var clickThroughUrl: js.UndefOr[ClickThroughUrl] = js.native
  var clickThroughUrlSuffixProperties: js.UndefOr[ClickThroughUrlSuffixProperties] = js.native
  var comments: js.UndefOr[String] = js.native
  var compatibility: js.UndefOr[String] = js.native
  var createInfo: js.UndefOr[LastModifiedInfo] = js.native
  var creativeGroupAssignments: js.UndefOr[js.Array[CreativeGroupAssignment]] = js.native
  var creativeRotation: js.UndefOr[CreativeRotation] = js.native
  var dayPartTargeting: js.UndefOr[DayPartTargeting] = js.native
  var defaultClickThroughEventTagProperties: js.UndefOr[DefaultClickThroughEventTagProperties] = js.native
  var deliverySchedule: js.UndefOr[DeliverySchedule] = js.native
  var dynamicClickTracker: js.UndefOr[Boolean] = js.native
  var endTime: js.UndefOr[String] = js.native
  var eventTagOverrides: js.UndefOr[js.Array[EventTagOverride]] = js.native
  var geoTargeting: js.UndefOr[GeoTargeting] = js.native
  var id: js.UndefOr[String] = js.native
  var idDimensionValue: js.UndefOr[DimensionValue] = js.native
  var keyValueTargetingExpression: js.UndefOr[KeyValueTargetingExpression] = js.native
  var kind: js.UndefOr[String] = js.native
  var languageTargeting: js.UndefOr[LanguageTargeting] = js.native
  var lastModifiedInfo: js.UndefOr[LastModifiedInfo] = js.native
  var name: js.UndefOr[String] = js.native
  var placementAssignments: js.UndefOr[js.Array[PlacementAssignment]] = js.native
  var remarketingListExpression: js.UndefOr[ListTargetingExpression] = js.native
  var size: js.UndefOr[Size] = js.native
  var sslCompliant: js.UndefOr[Boolean] = js.native
  var sslRequired: js.UndefOr[Boolean] = js.native
  var startTime: js.UndefOr[String] = js.native
  var subaccountId: js.UndefOr[String] = js.native
  var targetingTemplateId: js.UndefOr[String] = js.native
  var technologyTargeting: js.UndefOr[TechnologyTargeting] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object Ad {
  @scala.inline
  def apply(): Ad = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ad]
  }
  @scala.inline
  implicit class AdOps[Self <: Ad] (val x: Self) extends AnyVal {
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
    def withAdvertiserIdDimensionValue(value: DimensionValue): Self = {
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
    def withCampaignIdDimensionValue(value: DimensionValue): Self = {
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
    def withClickThroughUrl(value: ClickThroughUrl): Self = {
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
    def withClickThroughUrlSuffixProperties(value: ClickThroughUrlSuffixProperties): Self = {
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
    def withCreateInfo(value: LastModifiedInfo): Self = {
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
    def withCreativeGroupAssignments(value: js.Array[CreativeGroupAssignment]): Self = {
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
    def withCreativeRotation(value: CreativeRotation): Self = {
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
    def withDayPartTargeting(value: DayPartTargeting): Self = {
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
    def withDefaultClickThroughEventTagProperties(value: DefaultClickThroughEventTagProperties): Self = {
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
    def withDeliverySchedule(value: DeliverySchedule): Self = {
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
    def withEventTagOverrides(value: js.Array[EventTagOverride]): Self = {
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
    def withGeoTargeting(value: GeoTargeting): Self = {
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
    def withIdDimensionValue(value: DimensionValue): Self = {
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
    def withKeyValueTargetingExpression(value: KeyValueTargetingExpression): Self = {
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
    def withLanguageTargeting(value: LanguageTargeting): Self = {
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
    def withLastModifiedInfo(value: LastModifiedInfo): Self = {
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
    def withPlacementAssignments(value: js.Array[PlacementAssignment]): Self = {
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
    def withRemarketingListExpression(value: ListTargetingExpression): Self = {
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
    def withSize(value: Size): Self = {
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
    def withTechnologyTargeting(value: TechnologyTargeting): Self = {
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

