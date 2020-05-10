package typingsSlinky.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DashIsoGroupSettings extends js.Object {
  /**
    * By default, the service creates one .mpd DASH manifest for each DASH ISO output group in your job. This default manifest references every output in the output group. To create additional DASH manifests that reference a subset of the outputs in the output group, specify a list of them here.
    */
  var AdditionalManifests: js.UndefOr[listOfDashAdditionalManifest] = js.native
  /**
    * A partial URI prefix that will be put in the manifest (.mpd) file at the top level BaseURL element. Can be used if streams are delivered from a different URL than the manifest file.
    */
  var BaseUrl: js.UndefOr[string] = js.native
  /**
    * Use Destination (Destination) to specify the S3 output location and the output filename base. Destination accepts format identifiers. If you do not specify the base filename in the URI, the service will use the filename of the input file. If your job has multiple inputs, the service uses the filename of the first input file.
    */
  var Destination: js.UndefOr[stringPatternS3] = js.native
  /**
    * Settings associated with the destination. Will vary based on the type of destination
    */
  var DestinationSettings: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.DestinationSettings] = js.native
  /**
    * DRM settings.
    */
  var Encryption: js.UndefOr[DashIsoEncryptionSettings] = js.native
  /**
    * Length of fragments to generate (in seconds). Fragment length must be compatible with GOP size and Framerate. Note that fragments will end on the next keyframe after this number of seconds, so actual fragment length may be longer. When Emit Single File is checked, the fragmentation is internal to a single output file and it does not cause the creation of many output files as in other output types.
    */
  var FragmentLength: js.UndefOr[integerMin1Max2147483647] = js.native
  /**
    * Supports HbbTV specification as indicated
    */
  var HbbtvCompliance: js.UndefOr[DashIsoHbbtvCompliance] = js.native
  /**
    * Minimum time of initially buffered media that is needed to ensure smooth playout.
    */
  var MinBufferTime: js.UndefOr[integerMin0Max2147483647] = js.native
  /**
    * Specify whether your DASH profile is on-demand or main. When you choose Main profile (MAIN_PROFILE), the service signals  urn:mpeg:dash:profile:isoff-main:2011 in your .mpd DASH manifest. When you choose On-demand (ON_DEMAND_PROFILE), the service signals urn:mpeg:dash:profile:isoff-on-demand:2011 in your .mpd. When you choose On-demand, you must also set the output group setting Segment control (SegmentControl) to Single file (SINGLE_FILE).
    */
  var MpdProfile: js.UndefOr[DashIsoMpdProfile] = js.native
  /**
    * When set to SINGLE_FILE, a single output file is generated, which is internally segmented using the Fragment Length and Segment Length. When set to SEGMENTED_FILES, separate segment files will be created.
    */
  var SegmentControl: js.UndefOr[DashIsoSegmentControl] = js.native
  /**
    * Length of mpd segments to create (in seconds). Note that segments will end on the next keyframe after this number of seconds, so actual segment length may be longer. When Emit Single File is checked, the segmentation is internal to a single output file and it does not cause the creation of many output files as in other output types.
    */
  var SegmentLength: js.UndefOr[integerMin1Max2147483647] = js.native
  /**
    * If you get an HTTP error in the 400 range when you play back your DASH output, enable this setting and run your transcoding job again. When you enable this setting, the service writes precise segment durations in the DASH manifest. The segment duration information appears inside the SegmentTimeline element, inside SegmentTemplate at the Representation level. When you don't enable this setting, the service writes approximate segment durations in your DASH manifest.
    */
  var WriteSegmentTimelineInRepresentation: js.UndefOr[DashIsoWriteSegmentTimelineInRepresentation] = js.native
}

object DashIsoGroupSettings {
  @scala.inline
  def apply(): DashIsoGroupSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DashIsoGroupSettings]
  }
  @scala.inline
  implicit class DashIsoGroupSettingsOps[Self <: DashIsoGroupSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdditionalManifests(value: listOfDashAdditionalManifest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdditionalManifests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalManifests: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdditionalManifests")(js.undefined)
        ret
    }
    @scala.inline
    def withBaseUrl(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BaseUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BaseUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withDestination(value: stringPatternS3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Destination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Destination")(js.undefined)
        ret
    }
    @scala.inline
    def withDestinationSettings(value: DestinationSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withEncryption(value: DashIsoEncryptionSettings): Self = {
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
    def withFragmentLength(value: integerMin1Max2147483647): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FragmentLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFragmentLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FragmentLength")(js.undefined)
        ret
    }
    @scala.inline
    def withHbbtvCompliance(value: DashIsoHbbtvCompliance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HbbtvCompliance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHbbtvCompliance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HbbtvCompliance")(js.undefined)
        ret
    }
    @scala.inline
    def withMinBufferTime(value: integerMin0Max2147483647): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinBufferTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinBufferTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinBufferTime")(js.undefined)
        ret
    }
    @scala.inline
    def withMpdProfile(value: DashIsoMpdProfile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MpdProfile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMpdProfile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MpdProfile")(js.undefined)
        ret
    }
    @scala.inline
    def withSegmentControl(value: DashIsoSegmentControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SegmentControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSegmentControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SegmentControl")(js.undefined)
        ret
    }
    @scala.inline
    def withSegmentLength(value: integerMin1Max2147483647): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SegmentLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSegmentLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SegmentLength")(js.undefined)
        ret
    }
    @scala.inline
    def withWriteSegmentTimelineInRepresentation(value: DashIsoWriteSegmentTimelineInRepresentation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WriteSegmentTimelineInRepresentation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWriteSegmentTimelineInRepresentation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WriteSegmentTimelineInRepresentation")(js.undefined)
        ret
    }
  }
  
}

