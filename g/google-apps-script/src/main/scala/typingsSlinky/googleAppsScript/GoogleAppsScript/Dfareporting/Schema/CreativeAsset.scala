package typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreativeAsset extends js.Object {
  var actionScript3: js.UndefOr[Boolean] = js.native
  var active: js.UndefOr[Boolean] = js.native
  var additionalSizes: js.UndefOr[js.Array[Size]] = js.native
  var alignment: js.UndefOr[String] = js.native
  var artworkType: js.UndefOr[String] = js.native
  var assetIdentifier: js.UndefOr[CreativeAssetId] = js.native
  var audioBitRate: js.UndefOr[Double] = js.native
  var audioSampleRate: js.UndefOr[Double] = js.native
  var backupImageExit: js.UndefOr[CreativeCustomEvent] = js.native
  var bitRate: js.UndefOr[Double] = js.native
  var childAssetType: js.UndefOr[String] = js.native
  var collapsedSize: js.UndefOr[Size] = js.native
  var companionCreativeIds: js.UndefOr[js.Array[String]] = js.native
  var customStartTimeValue: js.UndefOr[Double] = js.native
  var detectedFeatures: js.UndefOr[js.Array[String]] = js.native
  var displayType: js.UndefOr[String] = js.native
  var duration: js.UndefOr[Double] = js.native
  var durationType: js.UndefOr[String] = js.native
  var expandedDimension: js.UndefOr[Size] = js.native
  var fileSize: js.UndefOr[String] = js.native
  var flashVersion: js.UndefOr[Double] = js.native
  var frameRate: js.UndefOr[Double] = js.native
  var hideFlashObjects: js.UndefOr[Boolean] = js.native
  var hideSelectionBoxes: js.UndefOr[Boolean] = js.native
  var horizontallyLocked: js.UndefOr[Boolean] = js.native
  var id: js.UndefOr[String] = js.native
  var idDimensionValue: js.UndefOr[DimensionValue] = js.native
  var mediaDuration: js.UndefOr[Double] = js.native
  var mimeType: js.UndefOr[String] = js.native
  var offset: js.UndefOr[OffsetPosition] = js.native
  var orientation: js.UndefOr[String] = js.native
  var originalBackup: js.UndefOr[Boolean] = js.native
  var politeLoad: js.UndefOr[Boolean] = js.native
  var position: js.UndefOr[OffsetPosition] = js.native
  var positionLeftUnit: js.UndefOr[String] = js.native
  var positionTopUnit: js.UndefOr[String] = js.native
  var progressiveServingUrl: js.UndefOr[String] = js.native
  var pushdown: js.UndefOr[Boolean] = js.native
  var pushdownDuration: js.UndefOr[Double] = js.native
  var role: js.UndefOr[String] = js.native
  var size: js.UndefOr[Size] = js.native
  var sslCompliant: js.UndefOr[Boolean] = js.native
  var startTimeType: js.UndefOr[String] = js.native
  var streamingServingUrl: js.UndefOr[String] = js.native
  var transparency: js.UndefOr[Boolean] = js.native
  var verticallyLocked: js.UndefOr[Boolean] = js.native
  var windowMode: js.UndefOr[String] = js.native
  var zIndex: js.UndefOr[Double] = js.native
  var zipFilename: js.UndefOr[String] = js.native
  var zipFilesize: js.UndefOr[String] = js.native
}

object CreativeAsset {
  @scala.inline
  def apply(): CreativeAsset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreativeAsset]
  }
  @scala.inline
  implicit class CreativeAssetOps[Self <: CreativeAsset] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionScript3(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionScript3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionScript3: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionScript3")(js.undefined)
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
    def withAlignment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignment")(js.undefined)
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
    def withAssetIdentifier(value: CreativeAssetId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assetIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssetIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assetIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withAudioBitRate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioBitRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudioBitRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioBitRate")(js.undefined)
        ret
    }
    @scala.inline
    def withAudioSampleRate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioSampleRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudioSampleRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioSampleRate")(js.undefined)
        ret
    }
    @scala.inline
    def withBackupImageExit(value: CreativeCustomEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backupImageExit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackupImageExit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backupImageExit")(js.undefined)
        ret
    }
    @scala.inline
    def withBitRate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBitRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitRate")(js.undefined)
        ret
    }
    @scala.inline
    def withChildAssetType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childAssetType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildAssetType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childAssetType")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapsedSize(value: Size): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsedSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapsedSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsedSize")(js.undefined)
        ret
    }
    @scala.inline
    def withCompanionCreativeIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("companionCreativeIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompanionCreativeIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("companionCreativeIds")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomStartTimeValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customStartTimeValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomStartTimeValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customStartTimeValue")(js.undefined)
        ret
    }
    @scala.inline
    def withDetectedFeatures(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectedFeatures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetectedFeatures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectedFeatures")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayType")(js.undefined)
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
    @scala.inline
    def withDurationType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDurationType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationType")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandedDimension(value: Size): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandedDimension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandedDimension: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandedDimension")(js.undefined)
        ret
    }
    @scala.inline
    def withFileSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileSize")(js.undefined)
        ret
    }
    @scala.inline
    def withFlashVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flashVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlashVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flashVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withFrameRate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrameRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameRate")(js.undefined)
        ret
    }
    @scala.inline
    def withHideFlashObjects(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideFlashObjects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideFlashObjects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideFlashObjects")(js.undefined)
        ret
    }
    @scala.inline
    def withHideSelectionBoxes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideSelectionBoxes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideSelectionBoxes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideSelectionBoxes")(js.undefined)
        ret
    }
    @scala.inline
    def withHorizontallyLocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontallyLocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontallyLocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontallyLocked")(js.undefined)
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
    def withMimeType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mimeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMimeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mimeType")(js.undefined)
        ret
    }
    @scala.inline
    def withOffset(value: OffsetPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
    @scala.inline
    def withOrientation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginalBackup(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalBackup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginalBackup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalBackup")(js.undefined)
        ret
    }
    @scala.inline
    def withPoliteLoad(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("politeLoad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPoliteLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("politeLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: OffsetPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withPositionLeftUnit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionLeftUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPositionLeftUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionLeftUnit")(js.undefined)
        ret
    }
    @scala.inline
    def withPositionTopUnit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionTopUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPositionTopUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionTopUnit")(js.undefined)
        ret
    }
    @scala.inline
    def withProgressiveServingUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressiveServingUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgressiveServingUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressiveServingUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withPushdown(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pushdown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPushdown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pushdown")(js.undefined)
        ret
    }
    @scala.inline
    def withPushdownDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pushdownDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPushdownDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pushdownDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withRole(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(js.undefined)
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
    def withStartTimeType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTimeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTimeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTimeType")(js.undefined)
        ret
    }
    @scala.inline
    def withStreamingServingUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streamingServingUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreamingServingUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streamingServingUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withTransparency(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transparency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransparency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transparency")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticallyLocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticallyLocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticallyLocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticallyLocked")(js.undefined)
        ret
    }
    @scala.inline
    def withWindowMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindowMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowMode")(js.undefined)
        ret
    }
    @scala.inline
    def withZIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withZipFilename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zipFilename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZipFilename: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zipFilename")(js.undefined)
        ret
    }
    @scala.inline
    def withZipFilesize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zipFilesize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZipFilesize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zipFilesize")(js.undefined)
        ret
    }
  }
  
}

