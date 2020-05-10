package typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Placement extends js.Object {
  var accountId: js.UndefOr[String] = js.native
  var adBlockingOptOut: js.UndefOr[Boolean] = js.native
  var additionalSizes: js.UndefOr[js.Array[Size]] = js.native
  var advertiserId: js.UndefOr[String] = js.native
  var advertiserIdDimensionValue: js.UndefOr[DimensionValue] = js.native
  var archived: js.UndefOr[Boolean] = js.native
  var campaignId: js.UndefOr[String] = js.native
  var campaignIdDimensionValue: js.UndefOr[DimensionValue] = js.native
  var comment: js.UndefOr[String] = js.native
  var compatibility: js.UndefOr[String] = js.native
  var contentCategoryId: js.UndefOr[String] = js.native
  var createInfo: js.UndefOr[LastModifiedInfo] = js.native
  var directorySiteId: js.UndefOr[String] = js.native
  var directorySiteIdDimensionValue: js.UndefOr[DimensionValue] = js.native
  var externalId: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var idDimensionValue: js.UndefOr[DimensionValue] = js.native
  var keyName: js.UndefOr[String] = js.native
  var kind: js.UndefOr[String] = js.native
  var lastModifiedInfo: js.UndefOr[LastModifiedInfo] = js.native
  var lookbackConfiguration: js.UndefOr[LookbackConfiguration] = js.native
  var name: js.UndefOr[String] = js.native
  var paymentApproved: js.UndefOr[Boolean] = js.native
  var paymentSource: js.UndefOr[String] = js.native
  var placementGroupId: js.UndefOr[String] = js.native
  var placementGroupIdDimensionValue: js.UndefOr[DimensionValue] = js.native
  var placementStrategyId: js.UndefOr[String] = js.native
  var pricingSchedule: js.UndefOr[PricingSchedule] = js.native
  var primary: js.UndefOr[Boolean] = js.native
  var publisherUpdateInfo: js.UndefOr[LastModifiedInfo] = js.native
  var siteId: js.UndefOr[String] = js.native
  var siteIdDimensionValue: js.UndefOr[DimensionValue] = js.native
  var size: js.UndefOr[Size] = js.native
  var sslRequired: js.UndefOr[Boolean] = js.native
  var status: js.UndefOr[String] = js.native
  var subaccountId: js.UndefOr[String] = js.native
  var tagFormats: js.UndefOr[js.Array[String]] = js.native
  var tagSetting: js.UndefOr[TagSetting] = js.native
  var videoActiveViewOptOut: js.UndefOr[Boolean] = js.native
  var videoSettings: js.UndefOr[VideoSettings] = js.native
  var vpaidAdapterChoice: js.UndefOr[String] = js.native
}

object Placement {
  @scala.inline
  def apply(): Placement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Placement]
  }
  @scala.inline
  implicit class PlacementOps[Self <: Placement] (val x: Self) extends AnyVal {
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
    def withAdditionalSizes(value: js.Array[Size]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalSizes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalSizes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalSizes")(js.undefined)
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
    def withDirectorySiteIdDimensionValue(value: DimensionValue): Self = {
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
    def withLookbackConfiguration(value: LookbackConfiguration): Self = {
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
    def withPlacementGroupIdDimensionValue(value: DimensionValue): Self = {
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
    def withPricingSchedule(value: PricingSchedule): Self = {
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
    def withPublisherUpdateInfo(value: LastModifiedInfo): Self = {
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
    def withSiteIdDimensionValue(value: DimensionValue): Self = {
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
    def withTagSetting(value: TagSetting): Self = {
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
    def withVideoSettings(value: VideoSettings): Self = {
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

