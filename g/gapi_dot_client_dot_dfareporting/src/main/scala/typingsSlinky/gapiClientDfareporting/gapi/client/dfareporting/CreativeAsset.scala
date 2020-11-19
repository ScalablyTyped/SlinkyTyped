package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreativeAsset extends js.Object {
  
  /**
    * Whether ActionScript3 is enabled for the flash asset. This is a read-only field. Applicable to the following creative type: FLASH_INPAGE. Applicable to
    * DISPLAY when the primary asset type is not HTML_IMAGE.
    */
  var actionScript3: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the video asset is active. This is a read-only field for VPAID_NON_LINEAR_VIDEO assets. Applicable to the following creative types:
    * INSTREAM_VIDEO and all VPAID.
    */
  var active: js.UndefOr[Boolean] = js.native
  
  /**
    * Possible alignments for an asset. This is a read-only field. Applicable to the following creative types:
    * RICH_MEDIA_DISPLAY_MULTI_FLOATING_INTERSTITIAL.
    */
  var alignment: js.UndefOr[String] = js.native
  
  /** Artwork type of rich media creative. This is a read-only field. Applicable to the following creative types: all RICH_MEDIA. */
  var artworkType: js.UndefOr[String] = js.native
  
  /**
    * Identifier of this asset. This is the same identifier returned during creative asset insert operation. This is a required field. Applicable to all but
    * the following creative types: all REDIRECT and TRACKING_TEXT.
    */
  var assetIdentifier: js.UndefOr[CreativeAssetId] = js.native
  
  /** Exit event configured for the backup image. Applicable to the following creative types: all RICH_MEDIA. */
  var backupImageExit: js.UndefOr[CreativeCustomEvent] = js.native
  
  /** Detected bit-rate for video asset. This is a read-only field. Applicable to the following creative types: INSTREAM_VIDEO and all VPAID. */
  var bitRate: js.UndefOr[Double] = js.native
  
  /** Rich media child asset type. This is a read-only field. Applicable to the following creative types: all VPAID. */
  var childAssetType: js.UndefOr[String] = js.native
  
  /**
    * Size of an asset when collapsed. This is a read-only field. Applicable to the following creative types: all RICH_MEDIA and all VPAID. Additionally,
    * applicable to assets whose displayType is ASSET_DISPLAY_TYPE_EXPANDING or ASSET_DISPLAY_TYPE_PEEL_DOWN.
    */
  var collapsedSize: js.UndefOr[Size] = js.native
  
  /**
    * List of companion creatives assigned to an in-stream video creative asset. Acceptable values include IDs of existing flash and image creatives.
    * Applicable to INSTREAM_VIDEO creative type with dynamicAssetSelection set to true.
    */
  var companionCreativeIds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Custom start time in seconds for making the asset visible. Applicable to the following creative types: all RICH_MEDIA. Value must be greater than or
    * equal to 0.
    */
  var customStartTimeValue: js.UndefOr[Double] = js.native
  
  /**
    * List of feature dependencies for the creative asset that are detected by DCM. Feature dependencies are features that a browser must be able to support
    * in order to render your HTML5 creative correctly. This is a read-only, auto-generated field. Applicable to the following creative types: HTML5_BANNER.
    * Applicable to DISPLAY when the primary asset type is not HTML_IMAGE.
    */
  var detectedFeatures: js.UndefOr[js.Array[String]] = js.native
  
  /** Type of rich media asset. This is a read-only field. Applicable to the following creative types: all RICH_MEDIA. */
  var displayType: js.UndefOr[String] = js.native
  
  /**
    * Duration in seconds for which an asset will be displayed. Applicable to the following creative types: INSTREAM_VIDEO and VPAID_LINEAR_VIDEO. Value must
    * be greater than or equal to 1.
    */
  var duration: js.UndefOr[Double] = js.native
  
  /** Duration type for which an asset will be displayed. Applicable to the following creative types: all RICH_MEDIA. */
  var durationType: js.UndefOr[String] = js.native
  
  /** Detected expanded dimension for video asset. This is a read-only field. Applicable to the following creative types: INSTREAM_VIDEO and all VPAID. */
  var expandedDimension: js.UndefOr[Size] = js.native
  
  /**
    * File size associated with this creative asset. This is a read-only field. Applicable to all but the following creative types: all REDIRECT and
    * TRACKING_TEXT.
    */
  var fileSize: js.UndefOr[String] = js.native
  
  /**
    * Flash version of the asset. This is a read-only field. Applicable to the following creative types: FLASH_INPAGE, all RICH_MEDIA, and all VPAID.
    * Applicable to DISPLAY when the primary asset type is not HTML_IMAGE.
    */
  var flashVersion: js.UndefOr[Double] = js.native
  
  /** Whether to hide Flash objects flag for an asset. Applicable to the following creative types: all RICH_MEDIA. */
  var hideFlashObjects: js.UndefOr[Boolean] = js.native
  
  /** Whether to hide selection boxes flag for an asset. Applicable to the following creative types: all RICH_MEDIA. */
  var hideSelectionBoxes: js.UndefOr[Boolean] = js.native
  
  /** Whether the asset is horizontally locked. This is a read-only field. Applicable to the following creative types: all RICH_MEDIA. */
  var horizontallyLocked: js.UndefOr[Boolean] = js.native
  
  /**
    * Numeric ID of this creative asset. This is a required field and should not be modified. Applicable to all but the following creative types: all
    * REDIRECT and TRACKING_TEXT.
    */
  var id: js.UndefOr[String] = js.native
  
  /** Dimension value for the ID of the asset. This is a read-only, auto-generated field. */
  var idDimensionValue: js.UndefOr[DimensionValue] = js.native
  
  /** Detected MIME type for video asset. This is a read-only field. Applicable to the following creative types: INSTREAM_VIDEO and all VPAID. */
  var mimeType: js.UndefOr[String] = js.native
  
  /**
    * Offset position for an asset in collapsed mode. This is a read-only field. Applicable to the following creative types: all RICH_MEDIA and all VPAID.
    * Additionally, only applicable to assets whose displayType is ASSET_DISPLAY_TYPE_EXPANDING or ASSET_DISPLAY_TYPE_PEEL_DOWN.
    */
  var offset: js.UndefOr[OffsetPosition] = js.native
  
  /** Whether the backup asset is original or changed by the user in DCM. Applicable to the following creative types: all RICH_MEDIA. */
  var originalBackup: js.UndefOr[Boolean] = js.native
  
  /** Offset position for an asset. Applicable to the following creative types: all RICH_MEDIA. */
  var position: js.UndefOr[OffsetPosition] = js.native
  
  /** Offset left unit for an asset. This is a read-only field. Applicable to the following creative types: all RICH_MEDIA. */
  var positionLeftUnit: js.UndefOr[String] = js.native
  
  /**
    * Offset top unit for an asset. This is a read-only field if the asset displayType is ASSET_DISPLAY_TYPE_OVERLAY. Applicable to the following creative
    * types: all RICH_MEDIA.
    */
  var positionTopUnit: js.UndefOr[String] = js.native
  
  /** Progressive URL for video asset. This is a read-only field. Applicable to the following creative types: INSTREAM_VIDEO and all VPAID. */
  var progressiveServingUrl: js.UndefOr[String] = js.native
  
  /**
    * Whether the asset pushes down other content. Applicable to the following creative types: all RICH_MEDIA. Additionally, only applicable when the asset
    * offsets are 0, the collapsedSize.width matches size.width, and the collapsedSize.height is less than size.height.
    */
  var pushdown: js.UndefOr[Boolean] = js.native
  
  /**
    * Pushdown duration in seconds for an asset. Applicable to the following creative types: all RICH_MEDIA.Additionally, only applicable when the asset
    * pushdown field is true, the offsets are 0, the collapsedSize.width matches size.width, and the collapsedSize.height is less than size.height.
    * Acceptable values are 0 to 9.99, inclusive.
    */
  var pushdownDuration: js.UndefOr[Double] = js.native
  
  /**
    * Role of the asset in relation to creative. Applicable to all but the following creative types: all REDIRECT and TRACKING_TEXT. This is a required
    * field.
    * PRIMARY applies to DISPLAY, FLASH_INPAGE, HTML5_BANNER, IMAGE, DISPLAY_IMAGE_GALLERY, all RICH_MEDIA (which may contain multiple primary assets), and
    * all VPAID creatives.
    * BACKUP_IMAGE applies to FLASH_INPAGE, HTML5_BANNER, all RICH_MEDIA, and all VPAID creatives. Applicable to DISPLAY when the primary asset type is not
    * HTML_IMAGE.
    * ADDITIONAL_IMAGE and ADDITIONAL_FLASH apply to FLASH_INPAGE creatives.
    * OTHER refers to assets from sources other than DCM, such as Studio uploaded assets, applicable to all RICH_MEDIA and all VPAID creatives.
    * PARENT_VIDEO refers to videos uploaded by the user in DCM and is applicable to INSTREAM_VIDEO and VPAID_LINEAR_VIDEO creatives.
    * TRANSCODED_VIDEO refers to videos transcoded by DCM from PARENT_VIDEO assets and is applicable to INSTREAM_VIDEO and VPAID_LINEAR_VIDEO creatives.
    * ALTERNATE_VIDEO refers to the DCM representation of child asset videos from Studio, and is applicable to VPAID_LINEAR_VIDEO creatives. These cannot be
    * added or removed within DCM.
    * For VPAID_LINEAR_VIDEO creatives, PARENT_VIDEO, TRANSCODED_VIDEO and ALTERNATE_VIDEO assets that are marked active serve as backup in case the VPAID
    * creative cannot be served. Only PARENT_VIDEO assets can be added or removed for an INSTREAM_VIDEO or VPAID_LINEAR_VIDEO creative.
    */
  var role: js.UndefOr[String] = js.native
  
  /**
    * Size associated with this creative asset. This is a required field when applicable; however for IMAGE and FLASH_INPAGE, creatives if left blank, this
    * field will be automatically set using the actual size of the associated image asset. Applicable to the following creative types: DISPLAY_IMAGE_GALLERY,
    * FLASH_INPAGE, HTML5_BANNER, IMAGE, and all RICH_MEDIA. Applicable to DISPLAY when the primary asset type is not HTML_IMAGE.
    */
  var size: js.UndefOr[Size] = js.native
  
  /** Whether the asset is SSL-compliant. This is a read-only field. Applicable to all but the following creative types: all REDIRECT and TRACKING_TEXT. */
  var sslCompliant: js.UndefOr[Boolean] = js.native
  
  /** Initial wait time type before making the asset visible. Applicable to the following creative types: all RICH_MEDIA. */
  var startTimeType: js.UndefOr[String] = js.native
  
  /** Streaming URL for video asset. This is a read-only field. Applicable to the following creative types: INSTREAM_VIDEO and all VPAID. */
  var streamingServingUrl: js.UndefOr[String] = js.native
  
  /** Whether the asset is transparent. Applicable to the following creative types: all RICH_MEDIA. Additionally, only applicable to HTML5 assets. */
  var transparency: js.UndefOr[Boolean] = js.native
  
  /** Whether the asset is vertically locked. This is a read-only field. Applicable to the following creative types: all RICH_MEDIA. */
  var verticallyLocked: js.UndefOr[Boolean] = js.native
  
  /** Detected video duration for video asset. This is a read-only field. Applicable to the following creative types: INSTREAM_VIDEO and all VPAID. */
  var videoDuration: js.UndefOr[Double] = js.native
  
  /**
    * Window mode options for flash assets. Applicable to the following creative types: FLASH_INPAGE, RICH_MEDIA_DISPLAY_EXPANDING, RICH_MEDIA_IM_EXPAND,
    * RICH_MEDIA_DISPLAY_BANNER, and RICH_MEDIA_INPAGE_FLOATING.
    */
  var windowMode: js.UndefOr[String] = js.native
  
  /**
    * zIndex value of an asset. Applicable to the following creative types: all RICH_MEDIA.Additionally, only applicable to assets whose displayType is NOT
    * one of the following types: ASSET_DISPLAY_TYPE_INPAGE or ASSET_DISPLAY_TYPE_OVERLAY. Acceptable values are -999999999 to 999999999, inclusive.
    */
  var zIndex: js.UndefOr[Double] = js.native
  
  /** File name of zip file. This is a read-only field. Applicable to the following creative types: HTML5_BANNER. */
  var zipFilename: js.UndefOr[String] = js.native
  
  /** Size of zip file. This is a read-only field. Applicable to the following creative types: HTML5_BANNER. */
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActionScript3(value: Boolean): Self = this.set("actionScript3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionScript3: Self = this.set("actionScript3", js.undefined)
    
    @scala.inline
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    
    @scala.inline
    def setAlignment(value: String): Self = this.set("alignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlignment: Self = this.set("alignment", js.undefined)
    
    @scala.inline
    def setArtworkType(value: String): Self = this.set("artworkType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArtworkType: Self = this.set("artworkType", js.undefined)
    
    @scala.inline
    def setAssetIdentifier(value: CreativeAssetId): Self = this.set("assetIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssetIdentifier: Self = this.set("assetIdentifier", js.undefined)
    
    @scala.inline
    def setBackupImageExit(value: CreativeCustomEvent): Self = this.set("backupImageExit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackupImageExit: Self = this.set("backupImageExit", js.undefined)
    
    @scala.inline
    def setBitRate(value: Double): Self = this.set("bitRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBitRate: Self = this.set("bitRate", js.undefined)
    
    @scala.inline
    def setChildAssetType(value: String): Self = this.set("childAssetType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildAssetType: Self = this.set("childAssetType", js.undefined)
    
    @scala.inline
    def setCollapsedSize(value: Size): Self = this.set("collapsedSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollapsedSize: Self = this.set("collapsedSize", js.undefined)
    
    @scala.inline
    def setCompanionCreativeIdsVarargs(value: String*): Self = this.set("companionCreativeIds", js.Array(value :_*))
    
    @scala.inline
    def setCompanionCreativeIds(value: js.Array[String]): Self = this.set("companionCreativeIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompanionCreativeIds: Self = this.set("companionCreativeIds", js.undefined)
    
    @scala.inline
    def setCustomStartTimeValue(value: Double): Self = this.set("customStartTimeValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomStartTimeValue: Self = this.set("customStartTimeValue", js.undefined)
    
    @scala.inline
    def setDetectedFeaturesVarargs(value: String*): Self = this.set("detectedFeatures", js.Array(value :_*))
    
    @scala.inline
    def setDetectedFeatures(value: js.Array[String]): Self = this.set("detectedFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetectedFeatures: Self = this.set("detectedFeatures", js.undefined)
    
    @scala.inline
    def setDisplayType(value: String): Self = this.set("displayType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayType: Self = this.set("displayType", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setDurationType(value: String): Self = this.set("durationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDurationType: Self = this.set("durationType", js.undefined)
    
    @scala.inline
    def setExpandedDimension(value: Size): Self = this.set("expandedDimension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpandedDimension: Self = this.set("expandedDimension", js.undefined)
    
    @scala.inline
    def setFileSize(value: String): Self = this.set("fileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileSize: Self = this.set("fileSize", js.undefined)
    
    @scala.inline
    def setFlashVersion(value: Double): Self = this.set("flashVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlashVersion: Self = this.set("flashVersion", js.undefined)
    
    @scala.inline
    def setHideFlashObjects(value: Boolean): Self = this.set("hideFlashObjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideFlashObjects: Self = this.set("hideFlashObjects", js.undefined)
    
    @scala.inline
    def setHideSelectionBoxes(value: Boolean): Self = this.set("hideSelectionBoxes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideSelectionBoxes: Self = this.set("hideSelectionBoxes", js.undefined)
    
    @scala.inline
    def setHorizontallyLocked(value: Boolean): Self = this.set("horizontallyLocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHorizontallyLocked: Self = this.set("horizontallyLocked", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIdDimensionValue(value: DimensionValue): Self = this.set("idDimensionValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdDimensionValue: Self = this.set("idDimensionValue", js.undefined)
    
    @scala.inline
    def setMimeType(value: String): Self = this.set("mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMimeType: Self = this.set("mimeType", js.undefined)
    
    @scala.inline
    def setOffset(value: OffsetPosition): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setOriginalBackup(value: Boolean): Self = this.set("originalBackup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginalBackup: Self = this.set("originalBackup", js.undefined)
    
    @scala.inline
    def setPosition(value: OffsetPosition): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setPositionLeftUnit(value: String): Self = this.set("positionLeftUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePositionLeftUnit: Self = this.set("positionLeftUnit", js.undefined)
    
    @scala.inline
    def setPositionTopUnit(value: String): Self = this.set("positionTopUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePositionTopUnit: Self = this.set("positionTopUnit", js.undefined)
    
    @scala.inline
    def setProgressiveServingUrl(value: String): Self = this.set("progressiveServingUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgressiveServingUrl: Self = this.set("progressiveServingUrl", js.undefined)
    
    @scala.inline
    def setPushdown(value: Boolean): Self = this.set("pushdown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePushdown: Self = this.set("pushdown", js.undefined)
    
    @scala.inline
    def setPushdownDuration(value: Double): Self = this.set("pushdownDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePushdownDuration: Self = this.set("pushdownDuration", js.undefined)
    
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    
    @scala.inline
    def setSize(value: Size): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setSslCompliant(value: Boolean): Self = this.set("sslCompliant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSslCompliant: Self = this.set("sslCompliant", js.undefined)
    
    @scala.inline
    def setStartTimeType(value: String): Self = this.set("startTimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTimeType: Self = this.set("startTimeType", js.undefined)
    
    @scala.inline
    def setStreamingServingUrl(value: String): Self = this.set("streamingServingUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStreamingServingUrl: Self = this.set("streamingServingUrl", js.undefined)
    
    @scala.inline
    def setTransparency(value: Boolean): Self = this.set("transparency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransparency: Self = this.set("transparency", js.undefined)
    
    @scala.inline
    def setVerticallyLocked(value: Boolean): Self = this.set("verticallyLocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerticallyLocked: Self = this.set("verticallyLocked", js.undefined)
    
    @scala.inline
    def setVideoDuration(value: Double): Self = this.set("videoDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoDuration: Self = this.set("videoDuration", js.undefined)
    
    @scala.inline
    def setWindowMode(value: String): Self = this.set("windowMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWindowMode: Self = this.set("windowMode", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
    
    @scala.inline
    def setZipFilename(value: String): Self = this.set("zipFilename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZipFilename: Self = this.set("zipFilename", js.undefined)
    
    @scala.inline
    def setZipFilesize(value: String): Self = this.set("zipFilesize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZipFilesize: Self = this.set("zipFilesize", js.undefined)
  }
}
