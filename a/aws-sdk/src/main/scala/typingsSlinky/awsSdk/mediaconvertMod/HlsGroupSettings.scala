package typingsSlinky.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HlsGroupSettings extends js.Object {
  /**
    * Choose one or more ad marker types to decorate your Apple HLS manifest. This setting does not determine whether SCTE-35 markers appear in the outputs themselves.
    */
  var AdMarkers: js.UndefOr[listOfHlsAdMarkers] = js.native
  /**
    * By default, the service creates one top-level .m3u8 HLS manifest for each HLS output group in your job. This default manifest references every output in the output group. To create additional top-level manifests that reference a subset of the outputs in the output group, specify a list of them here.
    */
  var AdditionalManifests: js.UndefOr[listOfHlsAdditionalManifest] = js.native
  /**
    * A partial URI prefix that will be prepended to each output in the media .m3u8 file. Can be used if base manifest is delivered from a different URL than the main .m3u8 file.
    */
  var BaseUrl: js.UndefOr[string] = js.native
  /**
    * Language to be used on Caption outputs
    */
  var CaptionLanguageMappings: js.UndefOr[listOfHlsCaptionLanguageMapping] = js.native
  /**
    * Applies only to 608 Embedded output captions. Insert: Include CLOSED-CAPTIONS lines in the manifest. Specify at least one language in the CC1 Language Code field. One CLOSED-CAPTION line is added for each Language Code you specify. Make sure to specify the languages in the order in which they appear in the original source (if the source is embedded format) or the order of the caption selectors (if the source is other than embedded). Otherwise, languages in the manifest will not match up properly with the output captions. None: Include CLOSED-CAPTIONS=NONE line in the manifest. Omit: Omit any CLOSED-CAPTIONS line from the manifest.
    */
  var CaptionLanguageSetting: js.UndefOr[HlsCaptionLanguageSetting] = js.native
  /**
    * When set to ENABLED, sets #EXT-X-ALLOW-CACHE:no tag, which prevents client from saving media segments for later replay.
    */
  var ClientCache: js.UndefOr[HlsClientCache] = js.native
  /**
    * Specification to use (RFC-6381 or the default RFC-4281) during m3u8 playlist generation.
    */
  var CodecSpecification: js.UndefOr[HlsCodecSpecification] = js.native
  /**
    * Use Destination (Destination) to specify the S3 output location and the output filename base. Destination accepts format identifiers. If you do not specify the base filename in the URI, the service will use the filename of the input file. If your job has multiple inputs, the service uses the filename of the first input file.
    */
  var Destination: js.UndefOr[stringPatternS3] = js.native
  /**
    * Settings associated with the destination. Will vary based on the type of destination
    */
  var DestinationSettings: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.DestinationSettings] = js.native
  /**
    * Indicates whether segments should be placed in subdirectories.
    */
  var DirectoryStructure: js.UndefOr[HlsDirectoryStructure] = js.native
  /**
    * DRM settings.
    */
  var Encryption: js.UndefOr[HlsEncryptionSettings] = js.native
  /**
    * When set to GZIP, compresses HLS playlist.
    */
  var ManifestCompression: js.UndefOr[HlsManifestCompression] = js.native
  /**
    * Indicates whether the output manifest should use floating point values for segment duration.
    */
  var ManifestDurationFormat: js.UndefOr[HlsManifestDurationFormat] = js.native
  /**
    * Keep this setting at the default value of 0, unless you are troubleshooting a problem with how devices play back the end of your video asset. If you know that player devices are hanging on the final segment of your video because the length of your final segment is too short, use this setting to specify a minimum final segment length, in seconds. Choose a value that is greater than or equal to 1 and less than your segment length. When you specify a value for this setting, the encoder will combine any final segment that is shorter than the length that you specify with the previous segment. For example, your segment length is 3 seconds and your final segment is .5 seconds without a minimum final segment length; when you set the minimum final segment length to 1, your final segment is 3.5 seconds.
    */
  var MinFinalSegmentLength: js.UndefOr[doubleMin0Max2147483647] = js.native
  /**
    * When set, Minimum Segment Size is enforced by looking ahead and back within the specified range for a nearby avail and extending the segment size if needed.
    */
  var MinSegmentLength: js.UndefOr[integerMin0Max2147483647] = js.native
  /**
    * Indicates whether the .m3u8 manifest file should be generated for this HLS output group.
    */
  var OutputSelection: js.UndefOr[HlsOutputSelection] = js.native
  /**
    * Includes or excludes EXT-X-PROGRAM-DATE-TIME tag in .m3u8 manifest files. The value is calculated as follows: either the program date and time are initialized using the input timecode source, or the time is initialized using the input timecode source and the date is initialized using the timestamp_offset.
    */
  var ProgramDateTime: js.UndefOr[HlsProgramDateTime] = js.native
  /**
    * Period of insertion of EXT-X-PROGRAM-DATE-TIME entry, in seconds.
    */
  var ProgramDateTimePeriod: js.UndefOr[integerMin0Max3600] = js.native
  /**
    * When set to SINGLE_FILE, emits program as a single media resource (.ts) file, uses #EXT-X-BYTERANGE tags to index segment for playback.
    */
  var SegmentControl: js.UndefOr[HlsSegmentControl] = js.native
  /**
    * Length of MPEG-2 Transport Stream segments to create (in seconds). Note that segments will end on the next keyframe after this number of seconds, so actual segment length may be longer.
    */
  var SegmentLength: js.UndefOr[integerMin1Max2147483647] = js.native
  /**
    * Number of segments to write to a subdirectory before starting a new one. directoryStructure must be SINGLE_DIRECTORY for this setting to have an effect.
    */
  var SegmentsPerSubdirectory: js.UndefOr[integerMin1Max2147483647] = js.native
  /**
    * Include or exclude RESOLUTION attribute for video in EXT-X-STREAM-INF tag of variant manifest.
    */
  var StreamInfResolution: js.UndefOr[HlsStreamInfResolution] = js.native
  /**
    * Indicates ID3 frame that has the timecode.
    */
  var TimedMetadataId3Frame: js.UndefOr[HlsTimedMetadataId3Frame] = js.native
  /**
    * Timed Metadata interval in seconds.
    */
  var TimedMetadataId3Period: js.UndefOr[integerMinNegative2147483648Max2147483647] = js.native
  /**
    * Provides an extra millisecond delta offset to fine tune the timestamps.
    */
  var TimestampDeltaMilliseconds: js.UndefOr[integerMinNegative2147483648Max2147483647] = js.native
}

object HlsGroupSettings {
  @scala.inline
  def apply(): HlsGroupSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HlsGroupSettings]
  }
  @scala.inline
  implicit class HlsGroupSettingsOps[Self <: HlsGroupSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdMarkers(value: listOfHlsAdMarkers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdMarkers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdMarkers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdMarkers")(js.undefined)
        ret
    }
    @scala.inline
    def withAdditionalManifests(value: listOfHlsAdditionalManifest): Self = {
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
    def withCaptionLanguageMappings(value: listOfHlsCaptionLanguageMapping): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CaptionLanguageMappings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaptionLanguageMappings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CaptionLanguageMappings")(js.undefined)
        ret
    }
    @scala.inline
    def withCaptionLanguageSetting(value: HlsCaptionLanguageSetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CaptionLanguageSetting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaptionLanguageSetting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CaptionLanguageSetting")(js.undefined)
        ret
    }
    @scala.inline
    def withClientCache(value: HlsClientCache): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientCache")(js.undefined)
        ret
    }
    @scala.inline
    def withCodecSpecification(value: HlsCodecSpecification): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CodecSpecification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodecSpecification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CodecSpecification")(js.undefined)
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
    def withDirectoryStructure(value: HlsDirectoryStructure): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DirectoryStructure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectoryStructure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DirectoryStructure")(js.undefined)
        ret
    }
    @scala.inline
    def withEncryption(value: HlsEncryptionSettings): Self = {
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
    def withManifestCompression(value: HlsManifestCompression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ManifestCompression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManifestCompression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ManifestCompression")(js.undefined)
        ret
    }
    @scala.inline
    def withManifestDurationFormat(value: HlsManifestDurationFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ManifestDurationFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManifestDurationFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ManifestDurationFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withMinFinalSegmentLength(value: doubleMin0Max2147483647): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinFinalSegmentLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinFinalSegmentLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinFinalSegmentLength")(js.undefined)
        ret
    }
    @scala.inline
    def withMinSegmentLength(value: integerMin0Max2147483647): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinSegmentLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinSegmentLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinSegmentLength")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputSelection(value: HlsOutputSelection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withProgramDateTime(value: HlsProgramDateTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProgramDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgramDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProgramDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withProgramDateTimePeriod(value: integerMin0Max3600): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProgramDateTimePeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgramDateTimePeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProgramDateTimePeriod")(js.undefined)
        ret
    }
    @scala.inline
    def withSegmentControl(value: HlsSegmentControl): Self = {
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
    def withSegmentsPerSubdirectory(value: integerMin1Max2147483647): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SegmentsPerSubdirectory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSegmentsPerSubdirectory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SegmentsPerSubdirectory")(js.undefined)
        ret
    }
    @scala.inline
    def withStreamInfResolution(value: HlsStreamInfResolution): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreamInfResolution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreamInfResolution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreamInfResolution")(js.undefined)
        ret
    }
    @scala.inline
    def withTimedMetadataId3Frame(value: HlsTimedMetadataId3Frame): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimedMetadataId3Frame")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimedMetadataId3Frame: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimedMetadataId3Frame")(js.undefined)
        ret
    }
    @scala.inline
    def withTimedMetadataId3Period(value: integerMinNegative2147483648Max2147483647): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimedMetadataId3Period")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimedMetadataId3Period: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimedMetadataId3Period")(js.undefined)
        ret
    }
    @scala.inline
    def withTimestampDeltaMilliseconds(value: integerMinNegative2147483648Max2147483647): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimestampDeltaMilliseconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimestampDeltaMilliseconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimestampDeltaMilliseconds")(js.undefined)
        ret
    }
  }
  
}

