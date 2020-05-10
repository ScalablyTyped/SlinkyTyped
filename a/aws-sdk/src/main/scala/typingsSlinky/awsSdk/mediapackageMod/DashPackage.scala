package typingsSlinky.awsSdk.mediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DashPackage extends js.Object {
  var AdTriggers: js.UndefOr[typingsSlinky.awsSdk.mediapackageMod.AdTriggers] = js.native
  var AdsOnDeliveryRestrictions: js.UndefOr[typingsSlinky.awsSdk.mediapackageMod.AdsOnDeliveryRestrictions] = js.native
  var Encryption: js.UndefOr[DashEncryption] = js.native
  /**
    * Determines the position of some tags in the Media Presentation Description (MPD).  When set to FULL, elements like SegmentTemplate and ContentProtection are included in each Representation.  When set to COMPACT, duplicate elements are combined and presented at the AdaptationSet level.
    */
  var ManifestLayout: js.UndefOr[typingsSlinky.awsSdk.mediapackageMod.ManifestLayout] = js.native
  /**
    * Time window (in seconds) contained in each manifest.
    */
  var ManifestWindowSeconds: js.UndefOr[integer] = js.native
  /**
    * Minimum duration (in seconds) that a player will buffer media before starting the presentation.
    */
  var MinBufferTimeSeconds: js.UndefOr[integer] = js.native
  /**
    * Minimum duration (in seconds) between potential changes to the Dynamic Adaptive Streaming over HTTP (DASH) Media Presentation Description (MPD).
    */
  var MinUpdatePeriodSeconds: js.UndefOr[integer] = js.native
  /**
    * A list of triggers that controls when the outgoing Dynamic Adaptive Streaming over HTTP (DASH)
  Media Presentation Description (MPD) will be partitioned into multiple periods. If empty, the content will not
  be partitioned into more than one period. If the list contains "ADS", new periods will be created where
  the Channel source contains SCTE-35 ad markers.
    */
  var PeriodTriggers: js.UndefOr[listOfPeriodTriggersElement] = js.native
  /**
    * The Dynamic Adaptive Streaming over HTTP (DASH) profile type.  When set to "HBBTV_1_5", HbbTV 1.5 compliant output is enabled.
    */
  var Profile: js.UndefOr[typingsSlinky.awsSdk.mediapackageMod.Profile] = js.native
  /**
    * Duration (in seconds) of each segment. Actual segments will be
  rounded to the nearest multiple of the source segment duration.
    */
  var SegmentDurationSeconds: js.UndefOr[integer] = js.native
  /**
    * Determines the type of SegmentTemplate included in the Media Presentation Description (MPD).  When set to NUMBER_WITH_TIMELINE, a full timeline is presented in each SegmentTemplate, with $Number$ media URLs.  When set to TIME_WITH_TIMELINE, a full timeline is presented in each SegmentTemplate, with $Time$ media URLs. When set to NUMBER_WITH_DURATION, only a duration is included in each SegmentTemplate, with $Number$ media URLs.
    */
  var SegmentTemplateFormat: js.UndefOr[typingsSlinky.awsSdk.mediapackageMod.SegmentTemplateFormat] = js.native
  var StreamSelection: js.UndefOr[typingsSlinky.awsSdk.mediapackageMod.StreamSelection] = js.native
  /**
    * Duration (in seconds) to delay live content before presentation.
    */
  var SuggestedPresentationDelaySeconds: js.UndefOr[integer] = js.native
}

object DashPackage {
  @scala.inline
  def apply(): DashPackage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DashPackage]
  }
  @scala.inline
  implicit class DashPackageOps[Self <: DashPackage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdTriggers(value: AdTriggers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdTriggers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdTriggers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdTriggers")(js.undefined)
        ret
    }
    @scala.inline
    def withAdsOnDeliveryRestrictions(value: AdsOnDeliveryRestrictions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdsOnDeliveryRestrictions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdsOnDeliveryRestrictions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdsOnDeliveryRestrictions")(js.undefined)
        ret
    }
    @scala.inline
    def withEncryption(value: DashEncryption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Encryption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncryption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Encryption")(js.undefined)
        ret
    }
    @scala.inline
    def withManifestLayout(value: ManifestLayout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ManifestLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManifestLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ManifestLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withManifestWindowSeconds(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ManifestWindowSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManifestWindowSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ManifestWindowSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withMinBufferTimeSeconds(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinBufferTimeSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinBufferTimeSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinBufferTimeSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withMinUpdatePeriodSeconds(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinUpdatePeriodSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinUpdatePeriodSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinUpdatePeriodSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withPeriodTriggers(value: listOfPeriodTriggersElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PeriodTriggers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeriodTriggers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PeriodTriggers")(js.undefined)
        ret
    }
    @scala.inline
    def withProfile(value: Profile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Profile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Profile")(js.undefined)
        ret
    }
    @scala.inline
    def withSegmentDurationSeconds(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SegmentDurationSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSegmentDurationSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SegmentDurationSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withSegmentTemplateFormat(value: SegmentTemplateFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SegmentTemplateFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSegmentTemplateFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SegmentTemplateFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withStreamSelection(value: StreamSelection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreamSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreamSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreamSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withSuggestedPresentationDelaySeconds(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SuggestedPresentationDelaySeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuggestedPresentationDelaySeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SuggestedPresentationDelaySeconds")(js.undefined)
        ret
    }
  }
  
}

