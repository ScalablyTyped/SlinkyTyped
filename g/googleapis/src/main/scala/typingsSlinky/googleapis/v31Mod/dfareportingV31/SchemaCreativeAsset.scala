package typingsSlinky.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creative Asset.
  */
@js.native
trait SchemaCreativeAsset extends js.Object {
  /**
    * Whether ActionScript3 is enabled for the flash asset. This is a read-only
    * field. Applicable to the following creative type: FLASH_INPAGE.
    * Applicable to DISPLAY when the primary asset type is not HTML_IMAGE.
    */
  var actionScript3: js.UndefOr[Boolean] = js.native
  /**
    * Whether the video or audio asset is active. This is a read-only field for
    * VPAID_NON_LINEAR_VIDEO assets. Applicable to the following creative
    * types: INSTREAM_AUDIO, INSTREAM_VIDEO and all VPAID.
    */
  var active: js.UndefOr[Boolean] = js.native
  /**
    * Possible alignments for an asset. This is a read-only field. Applicable
    * to the following creative types:
    * RICH_MEDIA_DISPLAY_MULTI_FLOATING_INTERSTITIAL.
    */
  var alignment: js.UndefOr[String] = js.native
  /**
    * Artwork type of rich media creative. This is a read-only field.
    * Applicable to the following creative types: all RICH_MEDIA.
    */
  var artworkType: js.UndefOr[String] = js.native
  /**
    * Identifier of this asset. This is the same identifier returned during
    * creative asset insert operation. This is a required field. Applicable to
    * all but the following creative types: all REDIRECT and TRACKING_TEXT.
    */
  var assetIdentifier: js.UndefOr[SchemaCreativeAssetId] = js.native
  /**
    * Exit event configured for the backup image. Applicable to the following
    * creative types: all RICH_MEDIA.
    */
  var backupImageExit: js.UndefOr[SchemaCreativeCustomEvent] = js.native
  /**
    * Detected bit-rate for audio or video asset. This is a read-only field.
    * Applicable to the following creative types: INSTREAM_AUDIO,
    * INSTREAM_VIDEO and all VPAID.
    */
  var bitRate: js.UndefOr[Double] = js.native
  /**
    * Rich media child asset type. This is a read-only field. Applicable to the
    * following creative types: all VPAID.
    */
  var childAssetType: js.UndefOr[String] = js.native
  /**
    * Size of an asset when collapsed. This is a read-only field. Applicable to
    * the following creative types: all RICH_MEDIA and all VPAID. Additionally,
    * applicable to assets whose displayType is ASSET_DISPLAY_TYPE_EXPANDING or
    * ASSET_DISPLAY_TYPE_PEEL_DOWN.
    */
  var collapsedSize: js.UndefOr[SchemaSize] = js.native
  /**
    * List of companion creatives assigned to an in-stream video creative
    * asset. Acceptable values include IDs of existing flash and image
    * creatives. Applicable to INSTREAM_VIDEO creative type with
    * dynamicAssetSelection set to true.
    */
  var companionCreativeIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Custom start time in seconds for making the asset visible. Applicable to
    * the following creative types: all RICH_MEDIA. Value must be greater than
    * or equal to 0.
    */
  var customStartTimeValue: js.UndefOr[Double] = js.native
  /**
    * List of feature dependencies for the creative asset that are detected by
    * Campaign Manager. Feature dependencies are features that a browser must
    * be able to support in order to render your HTML5 creative correctly. This
    * is a read-only, auto-generated field. Applicable to the following
    * creative types: HTML5_BANNER. Applicable to DISPLAY when the primary
    * asset type is not HTML_IMAGE.
    */
  var detectedFeatures: js.UndefOr[js.Array[String]] = js.native
  /**
    * Type of rich media asset. This is a read-only field. Applicable to the
    * following creative types: all RICH_MEDIA.
    */
  var displayType: js.UndefOr[String] = js.native
  /**
    * Duration in seconds for which an asset will be displayed. Applicable to
    * the following creative types: INSTREAM_AUDIO, INSTREAM_VIDEO and
    * VPAID_LINEAR_VIDEO. Value must be greater than or equal to 1.
    */
  var duration: js.UndefOr[Double] = js.native
  /**
    * Duration type for which an asset will be displayed. Applicable to the
    * following creative types: all RICH_MEDIA.
    */
  var durationType: js.UndefOr[String] = js.native
  /**
    * Detected expanded dimension for video asset. This is a read-only field.
    * Applicable to the following creative types: INSTREAM_VIDEO and all VPAID.
    */
  var expandedDimension: js.UndefOr[SchemaSize] = js.native
  /**
    * File size associated with this creative asset. This is a read-only field.
    * Applicable to all but the following creative types: all REDIRECT and
    * TRACKING_TEXT.
    */
  var fileSize: js.UndefOr[String] = js.native
  /**
    * Flash version of the asset. This is a read-only field. Applicable to the
    * following creative types: FLASH_INPAGE, all RICH_MEDIA, and all VPAID.
    * Applicable to DISPLAY when the primary asset type is not HTML_IMAGE.
    */
  var flashVersion: js.UndefOr[Double] = js.native
  /**
    * Whether to hide Flash objects flag for an asset. Applicable to the
    * following creative types: all RICH_MEDIA.
    */
  var hideFlashObjects: js.UndefOr[Boolean] = js.native
  /**
    * Whether to hide selection boxes flag for an asset. Applicable to the
    * following creative types: all RICH_MEDIA.
    */
  var hideSelectionBoxes: js.UndefOr[Boolean] = js.native
  /**
    * Whether the asset is horizontally locked. This is a read-only field.
    * Applicable to the following creative types: all RICH_MEDIA.
    */
  var horizontallyLocked: js.UndefOr[Boolean] = js.native
  /**
    * Numeric ID of this creative asset. This is a required field and should
    * not be modified. Applicable to all but the following creative types: all
    * REDIRECT and TRACKING_TEXT.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Dimension value for the ID of the asset. This is a read-only,
    * auto-generated field.
    */
  var idDimensionValue: js.UndefOr[SchemaDimensionValue] = js.native
  /**
    * Detected duration for audio or video asset. This is a read-only field.
    * Applicable to the following creative types: INSTREAM_AUDIO,
    * INSTREAM_VIDEO and all VPAID.
    */
  var mediaDuration: js.UndefOr[Double] = js.native
  /**
    * Detected MIME type for audio or video asset. This is a read-only field.
    * Applicable to the following creative types: INSTREAM_AUDIO,
    * INSTREAM_VIDEO and all VPAID.
    */
  var mimeType: js.UndefOr[String] = js.native
  /**
    * Offset position for an asset in collapsed mode. This is a read-only
    * field. Applicable to the following creative types: all RICH_MEDIA and all
    * VPAID. Additionally, only applicable to assets whose displayType is
    * ASSET_DISPLAY_TYPE_EXPANDING or ASSET_DISPLAY_TYPE_PEEL_DOWN.
    */
  var offset: js.UndefOr[SchemaOffsetPosition] = js.native
  /**
    * Orientation of video asset. This is a read-only, auto-generated field.
    */
  var orientation: js.UndefOr[String] = js.native
  /**
    * Whether the backup asset is original or changed by the user in Campaign
    * Manager. Applicable to the following creative types: all RICH_MEDIA.
    */
  var originalBackup: js.UndefOr[Boolean] = js.native
  /**
    * Offset position for an asset. Applicable to the following creative types:
    * all RICH_MEDIA.
    */
  var position: js.UndefOr[SchemaOffsetPosition] = js.native
  /**
    * Offset left unit for an asset. This is a read-only field. Applicable to
    * the following creative types: all RICH_MEDIA.
    */
  var positionLeftUnit: js.UndefOr[String] = js.native
  /**
    * Offset top unit for an asset. This is a read-only field if the asset
    * displayType is ASSET_DISPLAY_TYPE_OVERLAY. Applicable to the following
    * creative types: all RICH_MEDIA.
    */
  var positionTopUnit: js.UndefOr[String] = js.native
  /**
    * Progressive URL for video asset. This is a read-only field. Applicable to
    * the following creative types: INSTREAM_VIDEO and all VPAID.
    */
  var progressiveServingUrl: js.UndefOr[String] = js.native
  /**
    * Whether the asset pushes down other content. Applicable to the following
    * creative types: all RICH_MEDIA. Additionally, only applicable when the
    * asset offsets are 0, the collapsedSize.width matches size.width, and the
    * collapsedSize.height is less than size.height.
    */
  var pushdown: js.UndefOr[Boolean] = js.native
  /**
    * Pushdown duration in seconds for an asset. Applicable to the following
    * creative types: all RICH_MEDIA.Additionally, only applicable when the
    * asset pushdown field is true, the offsets are 0, the collapsedSize.width
    * matches size.width, and the collapsedSize.height is less than
    * size.height. Acceptable values are 0 to 9.99, inclusive.
    */
  var pushdownDuration: js.UndefOr[Double] = js.native
  /**
    * Role of the asset in relation to creative. Applicable to all but the
    * following creative types: all REDIRECT and TRACKING_TEXT. This is a
    * required field. PRIMARY applies to DISPLAY, FLASH_INPAGE, HTML5_BANNER,
    * IMAGE, DISPLAY_IMAGE_GALLERY, all RICH_MEDIA (which may contain multiple
    * primary assets), and all VPAID creatives. BACKUP_IMAGE applies to
    * FLASH_INPAGE, HTML5_BANNER, all RICH_MEDIA, and all VPAID creatives.
    * Applicable to DISPLAY when the primary asset type is not HTML_IMAGE.
    * ADDITIONAL_IMAGE and ADDITIONAL_FLASH apply to FLASH_INPAGE creatives.
    * OTHER refers to assets from sources other than Campaign Manager, such as
    * Studio uploaded assets, applicable to all RICH_MEDIA and all VPAID
    * creatives. PARENT_VIDEO refers to videos uploaded by the user in Campaign
    * Manager and is applicable to INSTREAM_VIDEO and VPAID_LINEAR_VIDEO
    * creatives. TRANSCODED_VIDEO refers to videos transcoded by Campaign
    * Manager from PARENT_VIDEO assets and is applicable to INSTREAM_VIDEO and
    * VPAID_LINEAR_VIDEO creatives. ALTERNATE_VIDEO refers to the Campaign
    * Manager representation of child asset videos from Studio, and is
    * applicable to VPAID_LINEAR_VIDEO creatives. These cannot be added or
    * removed within Campaign Manager. For VPAID_LINEAR_VIDEO creatives,
    * PARENT_VIDEO, TRANSCODED_VIDEO and ALTERNATE_VIDEO assets that are marked
    * active serve as backup in case the VPAID creative cannot be served. Only
    * PARENT_VIDEO assets can be added or removed for an INSTREAM_VIDEO or
    * VPAID_LINEAR_VIDEO creative. PARENT_AUDIO refers to audios uploaded by
    * the user in Campaign Manager and is applicable to INSTREAM_AUDIO
    * creatives. TRANSCODED_AUDIO refers to audios transcoded by Campaign
    * Manager from PARENT_AUDIO assets and is applicable to INSTREAM_AUDIO
    * creatives.
    */
  var role: js.UndefOr[String] = js.native
  /**
    * Size associated with this creative asset. This is a required field when
    * applicable; however for IMAGE and FLASH_INPAGE, creatives if left blank,
    * this field will be automatically set using the actual size of the
    * associated image asset. Applicable to the following creative types:
    * DISPLAY_IMAGE_GALLERY, FLASH_INPAGE, HTML5_BANNER, IMAGE, and all
    * RICH_MEDIA. Applicable to DISPLAY when the primary asset type is not
    * HTML_IMAGE.
    */
  var size: js.UndefOr[SchemaSize] = js.native
  /**
    * Whether the asset is SSL-compliant. This is a read-only field. Applicable
    * to all but the following creative types: all REDIRECT and TRACKING_TEXT.
    */
  var sslCompliant: js.UndefOr[Boolean] = js.native
  /**
    * Initial wait time type before making the asset visible. Applicable to the
    * following creative types: all RICH_MEDIA.
    */
  var startTimeType: js.UndefOr[String] = js.native
  /**
    * Streaming URL for video asset. This is a read-only field. Applicable to
    * the following creative types: INSTREAM_VIDEO and all VPAID.
    */
  var streamingServingUrl: js.UndefOr[String] = js.native
  /**
    * Whether the asset is transparent. Applicable to the following creative
    * types: all RICH_MEDIA. Additionally, only applicable to HTML5 assets.
    */
  var transparency: js.UndefOr[Boolean] = js.native
  /**
    * Whether the asset is vertically locked. This is a read-only field.
    * Applicable to the following creative types: all RICH_MEDIA.
    */
  var verticallyLocked: js.UndefOr[Boolean] = js.native
  /**
    * Window mode options for flash assets. Applicable to the following
    * creative types: FLASH_INPAGE, RICH_MEDIA_DISPLAY_EXPANDING,
    * RICH_MEDIA_IM_EXPAND, RICH_MEDIA_DISPLAY_BANNER, and
    * RICH_MEDIA_INPAGE_FLOATING.
    */
  var windowMode: js.UndefOr[String] = js.native
  /**
    * zIndex value of an asset. Applicable to the following creative types: all
    * RICH_MEDIA.Additionally, only applicable to assets whose displayType is
    * NOT one of the following types: ASSET_DISPLAY_TYPE_INPAGE or
    * ASSET_DISPLAY_TYPE_OVERLAY. Acceptable values are -999999999 to
    * 999999999, inclusive.
    */
  var zIndex: js.UndefOr[Double] = js.native
  /**
    * File name of zip file. This is a read-only field. Applicable to the
    * following creative types: HTML5_BANNER.
    */
  var zipFilename: js.UndefOr[String] = js.native
  /**
    * Size of zip file. This is a read-only field. Applicable to the following
    * creative types: HTML5_BANNER.
    */
  var zipFilesize: js.UndefOr[String] = js.native
}

object SchemaCreativeAsset {
  @scala.inline
  def apply(): SchemaCreativeAsset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreativeAsset]
  }
  @scala.inline
  implicit class SchemaCreativeAssetOps[Self <: SchemaCreativeAsset] (val x: Self) extends AnyVal {
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
    def withAssetIdentifier(value: SchemaCreativeAssetId): Self = {
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
    def withBackupImageExit(value: SchemaCreativeCustomEvent): Self = {
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
    def withCollapsedSize(value: SchemaSize): Self = {
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
    def withExpandedDimension(value: SchemaSize): Self = {
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
    def withOffset(value: SchemaOffsetPosition): Self = {
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
    def withPosition(value: SchemaOffsetPosition): Self = {
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

