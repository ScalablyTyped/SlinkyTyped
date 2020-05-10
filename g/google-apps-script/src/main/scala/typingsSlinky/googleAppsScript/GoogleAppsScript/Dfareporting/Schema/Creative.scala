package typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Creative extends js.Object {
  var accountId: js.UndefOr[String] = js.native
  var active: js.UndefOr[Boolean] = js.native
  var adParameters: js.UndefOr[String] = js.native
  var adTagKeys: js.UndefOr[js.Array[String]] = js.native
  var additionalSizes: js.UndefOr[js.Array[Size]] = js.native
  var advertiserId: js.UndefOr[String] = js.native
  var allowScriptAccess: js.UndefOr[Boolean] = js.native
  var archived: js.UndefOr[Boolean] = js.native
  var artworkType: js.UndefOr[String] = js.native
  var authoringSource: js.UndefOr[String] = js.native
  var authoringTool: js.UndefOr[String] = js.native
  var autoAdvanceImages: js.UndefOr[Boolean] = js.native
  var backgroundColor: js.UndefOr[String] = js.native
  var backupImageClickThroughUrl: js.UndefOr[CreativeClickThroughUrl] = js.native
  var backupImageFeatures: js.UndefOr[js.Array[String]] = js.native
  var backupImageReportingLabel: js.UndefOr[String] = js.native
  var backupImageTargetWindow: js.UndefOr[TargetWindow] = js.native
  var clickTags: js.UndefOr[js.Array[ClickTag]] = js.native
  var commercialId: js.UndefOr[String] = js.native
  var companionCreatives: js.UndefOr[js.Array[String]] = js.native
  var compatibility: js.UndefOr[js.Array[String]] = js.native
  var convertFlashToHtml5: js.UndefOr[Boolean] = js.native
  var counterCustomEvents: js.UndefOr[js.Array[CreativeCustomEvent]] = js.native
  var creativeAssetSelection: js.UndefOr[CreativeAssetSelection] = js.native
  var creativeAssets: js.UndefOr[js.Array[CreativeAsset]] = js.native
  var creativeFieldAssignments: js.UndefOr[js.Array[CreativeFieldAssignment]] = js.native
  var customKeyValues: js.UndefOr[js.Array[String]] = js.native
  var dynamicAssetSelection: js.UndefOr[Boolean] = js.native
  var exitCustomEvents: js.UndefOr[js.Array[CreativeCustomEvent]] = js.native
  var fsCommand: js.UndefOr[FsCommand] = js.native
  var htmlCode: js.UndefOr[String] = js.native
  var htmlCodeLocked: js.UndefOr[Boolean] = js.native
  var id: js.UndefOr[String] = js.native
  var idDimensionValue: js.UndefOr[DimensionValue] = js.native
  var kind: js.UndefOr[String] = js.native
  var lastModifiedInfo: js.UndefOr[LastModifiedInfo] = js.native
  var latestTraffickedCreativeId: js.UndefOr[String] = js.native
  var mediaDescription: js.UndefOr[String] = js.native
  var mediaDuration: js.UndefOr[Double] = js.native
  var name: js.UndefOr[String] = js.native
  var overrideCss: js.UndefOr[String] = js.native
  var progressOffset: js.UndefOr[VideoOffset] = js.native
  var redirectUrl: js.UndefOr[String] = js.native
  var renderingId: js.UndefOr[String] = js.native
  var renderingIdDimensionValue: js.UndefOr[DimensionValue] = js.native
  var requiredFlashPluginVersion: js.UndefOr[String] = js.native
  var requiredFlashVersion: js.UndefOr[Double] = js.native
  var size: js.UndefOr[Size] = js.native
  var skipOffset: js.UndefOr[VideoOffset] = js.native
  var skippable: js.UndefOr[Boolean] = js.native
  var sslCompliant: js.UndefOr[Boolean] = js.native
  var sslOverride: js.UndefOr[Boolean] = js.native
  var studioAdvertiserId: js.UndefOr[String] = js.native
  var studioCreativeId: js.UndefOr[String] = js.native
  var studioTraffickedCreativeId: js.UndefOr[String] = js.native
  var subaccountId: js.UndefOr[String] = js.native
  var thirdPartyBackupImageImpressionsUrl: js.UndefOr[String] = js.native
  var thirdPartyRichMediaImpressionsUrl: js.UndefOr[String] = js.native
  var thirdPartyUrls: js.UndefOr[js.Array[ThirdPartyTrackingUrl]] = js.native
  var timerCustomEvents: js.UndefOr[js.Array[CreativeCustomEvent]] = js.native
  var totalFileSize: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
  var universalAdId: js.UndefOr[UniversalAdId] = js.native
  var version: js.UndefOr[Double] = js.native
}

object Creative {
  @scala.inline
  def apply(): Creative = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Creative]
  }
  @scala.inline
  implicit class CreativeOps[Self <: Creative] (val x: Self) extends AnyVal {
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
    def withAdParameters(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withAdTagKeys(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adTagKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdTagKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adTagKeys")(js.undefined)
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
    def withAllowScriptAccess(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowScriptAccess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowScriptAccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowScriptAccess")(js.undefined)
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
    def withArtworkType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artworkType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArtworkType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artworkType")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthoringSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authoringSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthoringSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authoringSource")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthoringTool(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authoringTool")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthoringTool: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authoringTool")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoAdvanceImages(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoAdvanceImages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoAdvanceImages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoAdvanceImages")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBackupImageClickThroughUrl(value: CreativeClickThroughUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backupImageClickThroughUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackupImageClickThroughUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backupImageClickThroughUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withBackupImageFeatures(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backupImageFeatures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackupImageFeatures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backupImageFeatures")(js.undefined)
        ret
    }
    @scala.inline
    def withBackupImageReportingLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backupImageReportingLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackupImageReportingLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backupImageReportingLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withBackupImageTargetWindow(value: TargetWindow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backupImageTargetWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackupImageTargetWindow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backupImageTargetWindow")(js.undefined)
        ret
    }
    @scala.inline
    def withClickTags(value: js.Array[ClickTag]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClickTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickTags")(js.undefined)
        ret
    }
    @scala.inline
    def withCommercialId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commercialId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommercialId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commercialId")(js.undefined)
        ret
    }
    @scala.inline
    def withCompanionCreatives(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("companionCreatives")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompanionCreatives: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("companionCreatives")(js.undefined)
        ret
    }
    @scala.inline
    def withCompatibility(value: js.Array[String]): Self = {
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
    def withConvertFlashToHtml5(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convertFlashToHtml5")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConvertFlashToHtml5: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convertFlashToHtml5")(js.undefined)
        ret
    }
    @scala.inline
    def withCounterCustomEvents(value: js.Array[CreativeCustomEvent]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("counterCustomEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCounterCustomEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("counterCustomEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withCreativeAssetSelection(value: CreativeAssetSelection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creativeAssetSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreativeAssetSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creativeAssetSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withCreativeAssets(value: js.Array[CreativeAsset]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creativeAssets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreativeAssets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creativeAssets")(js.undefined)
        ret
    }
    @scala.inline
    def withCreativeFieldAssignments(value: js.Array[CreativeFieldAssignment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creativeFieldAssignments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreativeFieldAssignments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creativeFieldAssignments")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomKeyValues(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customKeyValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomKeyValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customKeyValues")(js.undefined)
        ret
    }
    @scala.inline
    def withDynamicAssetSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicAssetSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDynamicAssetSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicAssetSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withExitCustomEvents(value: js.Array[CreativeCustomEvent]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exitCustomEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExitCustomEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exitCustomEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withFsCommand(value: FsCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fsCommand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFsCommand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fsCommand")(js.undefined)
        ret
    }
    @scala.inline
    def withHtmlCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtmlCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlCode")(js.undefined)
        ret
    }
    @scala.inline
    def withHtmlCodeLocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlCodeLocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtmlCodeLocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlCodeLocked")(js.undefined)
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
    def withLatestTraffickedCreativeId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latestTraffickedCreativeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatestTraffickedCreativeId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latestTraffickedCreativeId")(js.undefined)
        ret
    }
    @scala.inline
    def withMediaDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMediaDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withMediaDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMediaDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaDuration")(js.undefined)
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
    def withOverrideCss(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrideCss")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverrideCss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrideCss")(js.undefined)
        ret
    }
    @scala.inline
    def withProgressOffset(value: VideoOffset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgressOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withRedirectUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedirectUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderingId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderingId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderingId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderingId")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderingIdDimensionValue(value: DimensionValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderingIdDimensionValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderingIdDimensionValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderingIdDimensionValue")(js.undefined)
        ret
    }
    @scala.inline
    def withRequiredFlashPluginVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requiredFlashPluginVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequiredFlashPluginVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requiredFlashPluginVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withRequiredFlashVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requiredFlashVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequiredFlashVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requiredFlashVersion")(js.undefined)
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
    def withSkipOffset(value: VideoOffset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withSkippable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skippable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkippable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skippable")(js.undefined)
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
    def withSslOverride(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sslOverride")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSslOverride: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sslOverride")(js.undefined)
        ret
    }
    @scala.inline
    def withStudioAdvertiserId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("studioAdvertiserId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStudioAdvertiserId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("studioAdvertiserId")(js.undefined)
        ret
    }
    @scala.inline
    def withStudioCreativeId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("studioCreativeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStudioCreativeId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("studioCreativeId")(js.undefined)
        ret
    }
    @scala.inline
    def withStudioTraffickedCreativeId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("studioTraffickedCreativeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStudioTraffickedCreativeId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("studioTraffickedCreativeId")(js.undefined)
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
    def withThirdPartyBackupImageImpressionsUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thirdPartyBackupImageImpressionsUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThirdPartyBackupImageImpressionsUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thirdPartyBackupImageImpressionsUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withThirdPartyRichMediaImpressionsUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thirdPartyRichMediaImpressionsUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThirdPartyRichMediaImpressionsUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thirdPartyRichMediaImpressionsUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withThirdPartyUrls(value: js.Array[ThirdPartyTrackingUrl]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thirdPartyUrls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThirdPartyUrls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thirdPartyUrls")(js.undefined)
        ret
    }
    @scala.inline
    def withTimerCustomEvents(value: js.Array[CreativeCustomEvent]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timerCustomEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimerCustomEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timerCustomEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalFileSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalFileSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalFileSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalFileSize")(js.undefined)
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
    @scala.inline
    def withUniversalAdId(value: UniversalAdId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("universalAdId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUniversalAdId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("universalAdId")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

