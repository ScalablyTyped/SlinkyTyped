package typingsSlinky.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains properties of a Creative.
  */
@js.native
trait SchemaCreative extends js.Object {
  /**
    * Account ID of this creative. This field, if left unset, will be
    * auto-generated for both insert and update operations. Applicable to all
    * creative types.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * Whether the creative is active. Applicable to all creative types.
    */
  var active: js.UndefOr[Boolean] = js.native
  /**
    * Ad parameters user for VPAID creative. This is a read-only field.
    * Applicable to the following creative types: all VPAID.
    */
  var adParameters: js.UndefOr[String] = js.native
  /**
    * Keywords for a Rich Media creative. Keywords let you customize the
    * creative settings of a Rich Media ad running on your site without having
    * to contact the advertiser. You can use keywords to dynamically change the
    * look or functionality of a creative. Applicable to the following creative
    * types: all RICH_MEDIA, and all VPAID.
    */
  var adTagKeys: js.UndefOr[js.Array[String]] = js.native
  /**
    * Additional sizes associated with a responsive creative. When inserting or
    * updating a creative either the size ID field or size width and height
    * fields can be used. Applicable to DISPLAY creatives when the primary
    * asset type is HTML_IMAGE.
    */
  var additionalSizes: js.UndefOr[js.Array[SchemaSize]] = js.native
  /**
    * Advertiser ID of this creative. This is a required field. Applicable to
    * all creative types.
    */
  var advertiserId: js.UndefOr[String] = js.native
  /**
    * Whether script access is allowed for this creative. This is a read-only
    * and deprecated field which will automatically be set to true on update.
    * Applicable to the following creative types: FLASH_INPAGE.
    */
  var allowScriptAccess: js.UndefOr[Boolean] = js.native
  /**
    * Whether the creative is archived. Applicable to all creative types.
    */
  var archived: js.UndefOr[Boolean] = js.native
  /**
    * Type of artwork used for the creative. This is a read-only field.
    * Applicable to the following creative types: all RICH_MEDIA, and all
    * VPAID.
    */
  var artworkType: js.UndefOr[String] = js.native
  /**
    * Source application where creative was authored. Presently, only DBM
    * authored creatives will have this field set. Applicable to all creative
    * types.
    */
  var authoringSource: js.UndefOr[String] = js.native
  /**
    * Authoring tool for HTML5 banner creatives. This is a read-only field.
    * Applicable to the following creative types: HTML5_BANNER.
    */
  var authoringTool: js.UndefOr[String] = js.native
  /**
    * Whether images are automatically advanced for image gallery creatives.
    * Applicable to the following creative types: DISPLAY_IMAGE_GALLERY.
    */
  var autoAdvanceImages: js.UndefOr[Boolean] = js.native
  /**
    * The 6-character HTML color code, beginning with #, for the background of
    * the window area where the Flash file is displayed. Default is white.
    * Applicable to the following creative types: FLASH_INPAGE.
    */
  var backgroundColor: js.UndefOr[String] = js.native
  /**
    * Click-through URL for backup image. Applicable to ENHANCED_BANNER when
    * the primary asset type is not HTML_IMAGE.
    */
  var backupImageClickThroughUrl: js.UndefOr[SchemaCreativeClickThroughUrl] = js.native
  /**
    * List of feature dependencies that will cause a backup image to be served
    * if the browser that serves the ad does not support them. Feature
    * dependencies are features that a browser must be able to support in order
    * to render your HTML5 creative asset correctly. This field is initially
    * auto-generated to contain all features detected by Campaign Manager for
    * all the assets of this creative and can then be modified by the client.
    * To reset this field, copy over all the creativeAssets&#39; detected
    * features. Applicable to the following creative types: HTML5_BANNER.
    * Applicable to DISPLAY when the primary asset type is not HTML_IMAGE.
    */
  var backupImageFeatures: js.UndefOr[js.Array[String]] = js.native
  /**
    * Reporting label used for HTML5 banner backup image. Applicable to the
    * following creative types: DISPLAY when the primary asset type is not
    * HTML_IMAGE.
    */
  var backupImageReportingLabel: js.UndefOr[String] = js.native
  /**
    * Target window for backup image. Applicable to the following creative
    * types: FLASH_INPAGE and HTML5_BANNER. Applicable to DISPLAY when the
    * primary asset type is not HTML_IMAGE.
    */
  var backupImageTargetWindow: js.UndefOr[SchemaTargetWindow] = js.native
  /**
    * Click tags of the creative. For DISPLAY, FLASH_INPAGE, and HTML5_BANNER
    * creatives, this is a subset of detected click tags for the assets
    * associated with this creative. After creating a flash asset, detected
    * click tags will be returned in the creativeAssetMetadata. When inserting
    * the creative, populate the creative clickTags field using the
    * creativeAssetMetadata.clickTags field. For DISPLAY_IMAGE_GALLERY
    * creatives, there should be exactly one entry in this list for each image
    * creative asset. A click tag is matched with a corresponding creative
    * asset by matching the clickTag.name field with the
    * creativeAsset.assetIdentifier.name field. Applicable to the following
    * creative types: DISPLAY_IMAGE_GALLERY, FLASH_INPAGE, HTML5_BANNER.
    * Applicable to DISPLAY when the primary asset type is not HTML_IMAGE.
    */
  var clickTags: js.UndefOr[js.Array[SchemaClickTag]] = js.native
  /**
    * Industry standard ID assigned to creative for reach and frequency.
    * Applicable to INSTREAM_VIDEO_REDIRECT creatives.
    */
  var commercialId: js.UndefOr[String] = js.native
  /**
    * List of companion creatives assigned to an in-Stream video creative.
    * Acceptable values include IDs of existing flash and image creatives.
    * Applicable to the following creative types: all VPAID, all INSTREAM_AUDIO
    * and all INSTREAM_VIDEO with dynamicAssetSelection set to false.
    */
  var companionCreatives: js.UndefOr[js.Array[String]] = js.native
  /**
    * Compatibilities associated with this creative. This is a read-only field.
    * DISPLAY and DISPLAY_INTERSTITIAL refer to rendering either on desktop or
    * on mobile devices or in mobile apps for regular or interstitial ads,
    * respectively. APP and APP_INTERSTITIAL are for rendering in mobile apps.
    * Only pre-existing creatives may have these compatibilities since new
    * creatives will either be assigned DISPLAY or DISPLAY_INTERSTITIAL
    * instead. IN_STREAM_VIDEO refers to rendering in in-stream video ads
    * developed with the VAST standard. IN_STREAM_AUDIO refers to rendering in
    * in-stream audio ads developed with the VAST standard. Applicable to all
    * creative types.  Acceptable values are: - &quot;APP&quot; -
    * &quot;APP_INTERSTITIAL&quot; - &quot;IN_STREAM_VIDEO&quot; -
    * &quot;IN_STREAM_AUDIO&quot; - &quot;DISPLAY&quot; -
    * &quot;DISPLAY_INTERSTITIAL&quot;
    */
  var compatibility: js.UndefOr[js.Array[String]] = js.native
  /**
    * Whether Flash assets associated with the creative need to be
    * automatically converted to HTML5. This flag is enabled by default and
    * users can choose to disable it if they don&#39;t want the system to
    * generate and use HTML5 asset for this creative. Applicable to the
    * following creative type: FLASH_INPAGE. Applicable to DISPLAY when the
    * primary asset type is not HTML_IMAGE.
    */
  var convertFlashToHtml5: js.UndefOr[Boolean] = js.native
  /**
    * List of counter events configured for the creative. For
    * DISPLAY_IMAGE_GALLERY creatives, these are read-only and auto-generated
    * from clickTags. Applicable to the following creative types:
    * DISPLAY_IMAGE_GALLERY, all RICH_MEDIA, and all VPAID.
    */
  var counterCustomEvents: js.UndefOr[js.Array[SchemaCreativeCustomEvent]] = js.native
  /**
    * Required if dynamicAssetSelection is true.
    */
  var creativeAssetSelection: js.UndefOr[SchemaCreativeAssetSelection] = js.native
  /**
    * Assets associated with a creative. Applicable to all but the following
    * creative types: INTERNAL_REDIRECT, INTERSTITIAL_INTERNAL_REDIRECT, and
    * REDIRECT
    */
  var creativeAssets: js.UndefOr[js.Array[SchemaCreativeAsset]] = js.native
  /**
    * Creative field assignments for this creative. Applicable to all creative
    * types.
    */
  var creativeFieldAssignments: js.UndefOr[js.Array[SchemaCreativeFieldAssignment]] = js.native
  /**
    * Custom key-values for a Rich Media creative. Key-values let you customize
    * the creative settings of a Rich Media ad running on your site without
    * having to contact the advertiser. You can use key-values to dynamically
    * change the look or functionality of a creative. Applicable to the
    * following creative types: all RICH_MEDIA, and all VPAID.
    */
  var customKeyValues: js.UndefOr[js.Array[String]] = js.native
  /**
    * Set this to true to enable the use of rules to target individual assets
    * in this creative. When set to true creativeAssetSelection must be set.
    * This also controls asset-level companions. When this is true, companion
    * creatives should be assigned to creative assets. Learn more. Applicable
    * to INSTREAM_VIDEO creatives.
    */
  var dynamicAssetSelection: js.UndefOr[Boolean] = js.native
  /**
    * List of exit events configured for the creative. For DISPLAY and
    * DISPLAY_IMAGE_GALLERY creatives, these are read-only and auto-generated
    * from clickTags, For DISPLAY, an event is also created from the
    * backupImageReportingLabel. Applicable to the following creative types:
    * DISPLAY_IMAGE_GALLERY, all RICH_MEDIA, and all VPAID. Applicable to
    * DISPLAY when the primary asset type is not HTML_IMAGE.
    */
  var exitCustomEvents: js.UndefOr[js.Array[SchemaCreativeCustomEvent]] = js.native
  /**
    * OpenWindow FSCommand of this creative. This lets the SWF file communicate
    * with either Flash Player or the program hosting Flash Player, such as a
    * web browser. This is only triggered if allowScriptAccess field is true.
    * Applicable to the following creative types: FLASH_INPAGE.
    */
  var fsCommand: js.UndefOr[SchemaFsCommand] = js.native
  /**
    * HTML code for the creative. This is a required field when applicable.
    * This field is ignored if htmlCodeLocked is true. Applicable to the
    * following creative types: all CUSTOM, FLASH_INPAGE, and HTML5_BANNER, and
    * all RICH_MEDIA.
    */
  var htmlCode: js.UndefOr[String] = js.native
  /**
    * Whether HTML code is generated by Campaign Manager or manually entered.
    * Set to true to ignore changes to htmlCode. Applicable to the following
    * creative types: FLASH_INPAGE and HTML5_BANNER.
    */
  var htmlCodeLocked: js.UndefOr[Boolean] = js.native
  /**
    * ID of this creative. This is a read-only, auto-generated field.
    * Applicable to all creative types.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Dimension value for the ID of this creative. This is a read-only field.
    * Applicable to all creative types.
    */
  var idDimensionValue: js.UndefOr[SchemaDimensionValue] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#creative&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Creative last modification information. This is a read-only field.
    * Applicable to all creative types.
    */
  var lastModifiedInfo: js.UndefOr[SchemaLastModifiedInfo] = js.native
  /**
    * Latest Studio trafficked creative ID associated with rich media and VPAID
    * creatives. This is a read-only field. Applicable to the following
    * creative types: all RICH_MEDIA, and all VPAID.
    */
  var latestTraffickedCreativeId: js.UndefOr[String] = js.native
  /**
    * Description of the audio or video ad. Applicable to the following
    * creative types: all INSTREAM_VIDEO, INSTREAM_AUDIO, and all VPAID.
    */
  var mediaDescription: js.UndefOr[String] = js.native
  /**
    * Creative audio or video duration in seconds. This is a read-only field.
    * Applicable to the following creative types: INSTREAM_VIDEO,
    * INSTREAM_AUDIO, all RICH_MEDIA, and all VPAID.
    */
  var mediaDuration: js.UndefOr[Double] = js.native
  /**
    * Name of the creative. This is a required field and must be less than 256
    * characters long. Applicable to all creative types.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Override CSS value for rich media creatives. Applicable to the following
    * creative types: all RICH_MEDIA.
    */
  var overrideCss: js.UndefOr[String] = js.native
  /**
    * The asset ID of the polite load image asset. Applicable to the creative
    * type: DISPLAY.
    */
  var politeLoadAssetId: js.UndefOr[String] = js.native
  /**
    * Amount of time to play the video before counting a view. Applicable to
    * the following creative types: all INSTREAM_VIDEO.
    */
  var progressOffset: js.UndefOr[SchemaVideoOffset] = js.native
  /**
    * URL of hosted image or hosted video or another ad tag. For
    * INSTREAM_VIDEO_REDIRECT creatives this is the in-stream video redirect
    * URL. The standard for a VAST (Video Ad Serving Template) ad response
    * allows for a redirect link to another VAST 2.0 or 3.0 call. This is a
    * required field when applicable. Applicable to the following creative
    * types: DISPLAY_REDIRECT, INTERNAL_REDIRECT,
    * INTERSTITIAL_INTERNAL_REDIRECT, and INSTREAM_VIDEO_REDIRECT
    */
  var redirectUrl: js.UndefOr[String] = js.native
  /**
    * ID of current rendering version. This is a read-only field. Applicable to
    * all creative types.
    */
  var renderingId: js.UndefOr[String] = js.native
  /**
    * Dimension value for the rendering ID of this creative. This is a
    * read-only field. Applicable to all creative types.
    */
  var renderingIdDimensionValue: js.UndefOr[SchemaDimensionValue] = js.native
  /**
    * The minimum required Flash plugin version for this creative. For
    * example, 11.2.202.235. This is a read-only field. Applicable to the
    * following creative types: all RICH_MEDIA, and all VPAID.
    */
  var requiredFlashPluginVersion: js.UndefOr[String] = js.native
  /**
    * The internal Flash version for this creative as calculated by Studio.
    * This is a read-only field. Applicable to the following creative types:
    * FLASH_INPAGE all RICH_MEDIA, and all VPAID. Applicable to DISPLAY when
    * the primary asset type is not HTML_IMAGE.
    */
  var requiredFlashVersion: js.UndefOr[Double] = js.native
  /**
    * Size associated with this creative. When inserting or updating a creative
    * either the size ID field or size width and height fields can be used.
    * This is a required field when applicable; however for IMAGE, FLASH_INPAGE
    * creatives, and for DISPLAY creatives with a primary asset of type
    * HTML_IMAGE, if left blank, this field will be automatically set using the
    * actual size of the associated image assets. Applicable to the following
    * creative types: DISPLAY, DISPLAY_IMAGE_GALLERY, FLASH_INPAGE,
    * HTML5_BANNER, IMAGE, and all RICH_MEDIA.
    */
  var size: js.UndefOr[SchemaSize] = js.native
  /**
    * Amount of time to play the video before the skip button appears.
    * Applicable to the following creative types: all INSTREAM_VIDEO.
    */
  var skipOffset: js.UndefOr[SchemaVideoOffset] = js.native
  /**
    * Whether the user can choose to skip the creative. Applicable to the
    * following creative types: all INSTREAM_VIDEO and all VPAID.
    */
  var skippable: js.UndefOr[Boolean] = js.native
  /**
    * Whether the creative is SSL-compliant. This is a read-only field.
    * Applicable to all creative types.
    */
  var sslCompliant: js.UndefOr[Boolean] = js.native
  /**
    * Whether creative should be treated as SSL compliant even if the system
    * scan shows it&#39;s not. Applicable to all creative types.
    */
  var sslOverride: js.UndefOr[Boolean] = js.native
  /**
    * Studio advertiser ID associated with rich media and VPAID creatives. This
    * is a read-only field. Applicable to the following creative types: all
    * RICH_MEDIA, and all VPAID.
    */
  var studioAdvertiserId: js.UndefOr[String] = js.native
  /**
    * Studio creative ID associated with rich media and VPAID creatives. This
    * is a read-only field. Applicable to the following creative types: all
    * RICH_MEDIA, and all VPAID.
    */
  var studioCreativeId: js.UndefOr[String] = js.native
  /**
    * Studio trafficked creative ID associated with rich media and VPAID
    * creatives. This is a read-only field. Applicable to the following
    * creative types: all RICH_MEDIA, and all VPAID.
    */
  var studioTraffickedCreativeId: js.UndefOr[String] = js.native
  /**
    * Subaccount ID of this creative. This field, if left unset, will be
    * auto-generated for both insert and update operations. Applicable to all
    * creative types.
    */
  var subaccountId: js.UndefOr[String] = js.native
  /**
    * Third-party URL used to record backup image impressions. Applicable to
    * the following creative types: all RICH_MEDIA.
    */
  var thirdPartyBackupImageImpressionsUrl: js.UndefOr[String] = js.native
  /**
    * Third-party URL used to record rich media impressions. Applicable to the
    * following creative types: all RICH_MEDIA.
    */
  var thirdPartyRichMediaImpressionsUrl: js.UndefOr[String] = js.native
  /**
    * Third-party URLs for tracking in-stream creative events. Applicable to
    * the following creative types: all INSTREAM_VIDEO, all INSTREAM_AUDIO, and
    * all VPAID.
    */
  var thirdPartyUrls: js.UndefOr[js.Array[SchemaThirdPartyTrackingUrl]] = js.native
  /**
    * List of timer events configured for the creative. For
    * DISPLAY_IMAGE_GALLERY creatives, these are read-only and auto-generated
    * from clickTags. Applicable to the following creative types:
    * DISPLAY_IMAGE_GALLERY, all RICH_MEDIA, and all VPAID. Applicable to
    * DISPLAY when the primary asset is not HTML_IMAGE.
    */
  var timerCustomEvents: js.UndefOr[js.Array[SchemaCreativeCustomEvent]] = js.native
  /**
    * Combined size of all creative assets. This is a read-only field.
    * Applicable to the following creative types: all RICH_MEDIA, and all
    * VPAID.
    */
  var totalFileSize: js.UndefOr[String] = js.native
  /**
    * Type of this creative. This is a required field. Applicable to all
    * creative types.  Note: FLASH_INPAGE, HTML5_BANNER, and IMAGE are only
    * used for existing creatives. New creatives should use DISPLAY as a
    * replacement for these types.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * A Universal Ad ID as per the VAST 4.0 spec. Applicable to the following
    * creative types: INSTREAM_AUDIO and INSTREAM_VIDEO and VPAID.
    */
  var universalAdId: js.UndefOr[SchemaUniversalAdId] = js.native
  /**
    * The version number helps you keep track of multiple versions of your
    * creative in your reports. The version number will always be
    * auto-generated during insert operations to start at 1. For tracking
    * creatives the version cannot be incremented and will always remain at 1.
    * For all other creative types the version can be incremented only by 1
    * during update operations. In addition, the version will be automatically
    * incremented by 1 when undergoing Rich Media creative merging. Applicable
    * to all creative types.
    */
  var version: js.UndefOr[Double] = js.native
}

object SchemaCreative {
  @scala.inline
  def apply(): SchemaCreative = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreative]
  }
  @scala.inline
  implicit class SchemaCreativeOps[Self <: SchemaCreative] (val x: Self) extends AnyVal {
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
    def withAdditionalSizes(value: js.Array[SchemaSize]): Self = {
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
    def withBackupImageClickThroughUrl(value: SchemaCreativeClickThroughUrl): Self = {
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
    def withBackupImageTargetWindow(value: SchemaTargetWindow): Self = {
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
    def withClickTags(value: js.Array[SchemaClickTag]): Self = {
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
    def withCounterCustomEvents(value: js.Array[SchemaCreativeCustomEvent]): Self = {
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
    def withCreativeAssetSelection(value: SchemaCreativeAssetSelection): Self = {
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
    def withCreativeAssets(value: js.Array[SchemaCreativeAsset]): Self = {
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
    def withCreativeFieldAssignments(value: js.Array[SchemaCreativeFieldAssignment]): Self = {
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
    def withExitCustomEvents(value: js.Array[SchemaCreativeCustomEvent]): Self = {
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
    def withFsCommand(value: SchemaFsCommand): Self = {
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
    def withPoliteLoadAssetId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("politeLoadAssetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPoliteLoadAssetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("politeLoadAssetId")(js.undefined)
        ret
    }
    @scala.inline
    def withProgressOffset(value: SchemaVideoOffset): Self = {
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
    def withRenderingIdDimensionValue(value: SchemaDimensionValue): Self = {
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
    def withSkipOffset(value: SchemaVideoOffset): Self = {
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
    def withThirdPartyUrls(value: js.Array[SchemaThirdPartyTrackingUrl]): Self = {
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
    def withTimerCustomEvents(value: js.Array[SchemaCreativeCustomEvent]): Self = {
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
    def withUniversalAdId(value: SchemaUniversalAdId): Self = {
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

