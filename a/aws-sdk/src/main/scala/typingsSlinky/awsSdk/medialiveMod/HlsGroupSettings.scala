package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HlsGroupSettings extends js.Object {
  /**
    * Choose one or more ad marker types to pass SCTE35 signals through to this group of Apple HLS outputs.
    */
  var AdMarkers: js.UndefOr[listOfHlsAdMarkers] = js.native
  /**
    * A partial URI prefix that will be prepended to each output in the media .m3u8 file. Can be used if base manifest is delivered from a different URL than the main .m3u8 file.
    */
  var BaseUrlContent: js.UndefOr[string] = js.native
  /**
    * Optional. One value per output group.
  This field is required only if you are completing Base URL content A, and the downstream system has notified you that the media files for pipeline 1 of all outputs are in a location different from the media files for pipeline 0.
    */
  var BaseUrlContent1: js.UndefOr[string] = js.native
  /**
    * A partial URI prefix that will be prepended to each output in the media .m3u8 file. Can be used if base manifest is delivered from a different URL than the main .m3u8 file.
    */
  var BaseUrlManifest: js.UndefOr[string] = js.native
  /**
    * Optional. One value per output group.
  Complete this field only if you are completing Base URL manifest A, and the downstream system has notified you that the child manifest files for pipeline 1 of all outputs are in a location different from the child manifest files for pipeline 0.
    */
  var BaseUrlManifest1: js.UndefOr[string] = js.native
  /**
    * Mapping of up to 4 caption channels to caption languages.  Is only meaningful if captionLanguageSetting is set to "insert".
    */
  var CaptionLanguageMappings: js.UndefOr[listOfCaptionLanguageMapping] = js.native
  /**
    * Applies only to 608 Embedded output captions.
  insert: Include CLOSED-CAPTIONS lines in the manifest. Specify at least one language in the CC1 Language Code field. One CLOSED-CAPTION line is added for each Language Code you specify. Make sure to specify the languages in the order in which they appear in the original source (if the source is embedded format) or the order of the caption selectors (if the source is other than embedded). Otherwise, languages in the manifest will not match up properly with the output captions.
  none: Include CLOSED-CAPTIONS=NONE line in the manifest.
  omit: Omit any CLOSED-CAPTIONS line from the manifest.
    */
  var CaptionLanguageSetting: js.UndefOr[HlsCaptionLanguageSetting] = js.native
  /**
    * When set to "disabled", sets the #EXT-X-ALLOW-CACHE:no tag in the manifest, which prevents clients from saving media segments for later replay.
    */
  var ClientCache: js.UndefOr[HlsClientCache] = js.native
  /**
    * Specification to use (RFC-6381 or the default RFC-4281) during m3u8 playlist generation.
    */
  var CodecSpecification: js.UndefOr[HlsCodecSpecification] = js.native
  /**
    * For use with encryptionType. This is a 128-bit, 16-byte hex value represented by a 32-character text string. If ivSource is set to "explicit" then this parameter is required and is used as the IV for encryption.
    */
  var ConstantIv: js.UndefOr[stringMin32Max32] = js.native
  /**
    * A directory or HTTP destination for the HLS segments, manifest files, and encryption keys (if enabled).
    */
  var Destination: OutputLocationRef = js.native
  /**
    * Place segments in subdirectories.
    */
  var DirectoryStructure: js.UndefOr[HlsDirectoryStructure] = js.native
  /**
    * Encrypts the segments with the given encryption scheme.  Exclude this parameter if no encryption is desired.
    */
  var EncryptionType: js.UndefOr[HlsEncryptionType] = js.native
  /**
    * Parameters that control interactions with the CDN.
    */
  var HlsCdnSettings: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.HlsCdnSettings] = js.native
  /**
    * State of HLS ID3 Segment Tagging
    */
  var HlsId3SegmentTagging: js.UndefOr[HlsId3SegmentTaggingState] = js.native
  /**
    * DISABLED: Do not create an I-frame-only manifest, but do create the master and media manifests (according to the Output Selection field).
  STANDARD: Create an I-frame-only manifest for each output that contains video, as well as the other manifests (according to the Output Selection field). The I-frame manifest contains a #EXT-X-I-FRAMES-ONLY tag to indicate it is I-frame only, and one or more #EXT-X-BYTERANGE entries identifying the I-frame position. For example, #EXT-X-BYTERANGE:160364@1461888"
    */
  var IFrameOnlyPlaylists: js.UndefOr[IFrameOnlyPlaylistType] = js.native
  /**
    * Applies only if Mode field is LIVE. Specifies the maximum number of segments in the media manifest file. After this maximum, older segments are removed from the media manifest. This number must be less than or equal to the Keep Segments field.
    */
  var IndexNSegments: js.UndefOr[integerMin3] = js.native
  /**
    * Parameter that control output group behavior on input loss.
    */
  var InputLossAction: js.UndefOr[InputLossActionForHlsOut] = js.native
  /**
    * For use with encryptionType. The IV (Initialization Vector) is a 128-bit number used in conjunction with the key for encrypting blocks. If set to "include", IV is listed in the manifest, otherwise the IV is not in the manifest.
    */
  var IvInManifest: js.UndefOr[HlsIvInManifest] = js.native
  /**
    * For use with encryptionType. The IV (Initialization Vector) is a 128-bit number used in conjunction with the key for encrypting blocks. If this setting is "followsSegmentNumber", it will cause the IV to change every segment (to match the segment number). If this is set to "explicit", you must enter a constantIv value.
    */
  var IvSource: js.UndefOr[HlsIvSource] = js.native
  /**
    * Applies only if Mode field is LIVE. Specifies the number of media segments (.ts files) to retain in the destination directory.
    */
  var KeepSegments: js.UndefOr[integerMin1] = js.native
  /**
    * The value specifies how the key is represented in the resource identified by the URI.  If parameter is absent, an implicit value of "identity" is used.  A reverse DNS string can also be given.
    */
  var KeyFormat: js.UndefOr[string] = js.native
  /**
    * Either a single positive integer version value or a slash delimited list of version values (1/2/3).
    */
  var KeyFormatVersions: js.UndefOr[string] = js.native
  /**
    * The key provider settings.
    */
  var KeyProviderSettings: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.KeyProviderSettings] = js.native
  /**
    * When set to gzip, compresses HLS playlist.
    */
  var ManifestCompression: js.UndefOr[HlsManifestCompression] = js.native
  /**
    * Indicates whether the output manifest should use floating point or integer values for segment duration.
    */
  var ManifestDurationFormat: js.UndefOr[HlsManifestDurationFormat] = js.native
  /**
    * When set, minimumSegmentLength is enforced by looking ahead and back within the specified range for a nearby avail and extending the segment size if needed.
    */
  var MinSegmentLength: js.UndefOr[integerMin0] = js.native
  /**
    * If "vod", all segments are indexed and kept permanently in the destination and manifest. If "live", only the number segments specified in keepSegments and indexNSegments are kept; newer segments replace older segments, which may prevent players from rewinding all the way to the beginning of the event.
  VOD mode uses HLS EXT-X-PLAYLIST-TYPE of EVENT while the channel is running, converting it to a "VOD" type manifest on completion of the stream.
    */
  var Mode: js.UndefOr[HlsMode] = js.native
  /**
    * MANIFESTSANDSEGMENTS: Generates manifests (master manifest, if applicable, and media manifests) for this output group.
  SEGMENTSONLY: Does not generate any manifests for this output group.
    */
  var OutputSelection: js.UndefOr[HlsOutputSelection] = js.native
  /**
    * Includes or excludes EXT-X-PROGRAM-DATE-TIME tag in .m3u8 manifest files. The value is calculated as follows: either the program date and time are initialized using the input timecode source, or the time is initialized using the input timecode source and the date is initialized using the timestampOffset.
    */
  var ProgramDateTime: js.UndefOr[HlsProgramDateTime] = js.native
  /**
    * Period of insertion of EXT-X-PROGRAM-DATE-TIME entry, in seconds.
    */
  var ProgramDateTimePeriod: js.UndefOr[integerMin0Max3600] = js.native
  /**
    * ENABLED: The master manifest (.m3u8 file) for each pipeline includes information about both pipelines: first its own media files, then the media files of the other pipeline. This feature allows playout device that support stale manifest detection to switch from one manifest to the other, when the current manifest seems to be stale. There are still two destinations and two master manifests, but both master manifests reference the media files from both pipelines.
  DISABLED: The master manifest (.m3u8 file) for each pipeline includes information about its own pipeline only.
  For an HLS output group with MediaPackage as the destination, the DISABLED behavior is always followed. MediaPackage regenerates the manifests it serves to players so a redundant manifest from MediaLive is irrelevant.
    */
  var RedundantManifest: js.UndefOr[HlsRedundantManifest] = js.native
  /**
    * Length of MPEG-2 Transport Stream segments to create (in seconds). Note that segments will end on the next keyframe after this number of seconds, so actual segment length may be longer.
    */
  var SegmentLength: js.UndefOr[integerMin1] = js.native
  /**
    * useInputSegmentation has been deprecated. The configured segment size is always used.
    */
  var SegmentationMode: js.UndefOr[HlsSegmentationMode] = js.native
  /**
    * Number of segments to write to a subdirectory before starting a new one. directoryStructure must be subdirectoryPerStream for this setting to have an effect.
    */
  var SegmentsPerSubdirectory: js.UndefOr[integerMin1] = js.native
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
  var TimedMetadataId3Period: js.UndefOr[integerMin0] = js.native
  /**
    * Provides an extra millisecond delta offset to fine tune the timestamps.
    */
  var TimestampDeltaMilliseconds: js.UndefOr[integerMin0] = js.native
  /**
    * SEGMENTEDFILES: Emit the program as segments - multiple .ts media files.
  SINGLEFILE: Applies only if Mode field is VOD. Emit the program as a single .ts media file. The media manifest includes #EXT-X-BYTERANGE tags to index segments for playback. A typical use for this value is when sending the output to AWS Elemental MediaConvert, which can accept only a single media file. Playback while the channel is running is not guaranteed due to HTTP server caching.
    */
  var TsFileMode: js.UndefOr[HlsTsFileMode] = js.native
}

object HlsGroupSettings {
  @scala.inline
  def apply(Destination: OutputLocationRef): HlsGroupSettings = {
    val __obj = js.Dynamic.literal(Destination = Destination.asInstanceOf[js.Any])
    __obj.asInstanceOf[HlsGroupSettings]
  }
  @scala.inline
  implicit class HlsGroupSettingsOps[Self <: HlsGroupSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestination(value: OutputLocationRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Destination")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withBaseUrlContent(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BaseUrlContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseUrlContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BaseUrlContent")(js.undefined)
        ret
    }
    @scala.inline
    def withBaseUrlContent1(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BaseUrlContent1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseUrlContent1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BaseUrlContent1")(js.undefined)
        ret
    }
    @scala.inline
    def withBaseUrlManifest(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BaseUrlManifest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseUrlManifest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BaseUrlManifest")(js.undefined)
        ret
    }
    @scala.inline
    def withBaseUrlManifest1(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BaseUrlManifest1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseUrlManifest1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BaseUrlManifest1")(js.undefined)
        ret
    }
    @scala.inline
    def withCaptionLanguageMappings(value: listOfCaptionLanguageMapping): Self = {
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
    def withConstantIv(value: stringMin32Max32): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConstantIv")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConstantIv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConstantIv")(js.undefined)
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
    def withEncryptionType(value: HlsEncryptionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EncryptionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncryptionType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EncryptionType")(js.undefined)
        ret
    }
    @scala.inline
    def withHlsCdnSettings(value: HlsCdnSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HlsCdnSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHlsCdnSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HlsCdnSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withHlsId3SegmentTagging(value: HlsId3SegmentTaggingState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HlsId3SegmentTagging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHlsId3SegmentTagging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HlsId3SegmentTagging")(js.undefined)
        ret
    }
    @scala.inline
    def withIFrameOnlyPlaylists(value: IFrameOnlyPlaylistType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IFrameOnlyPlaylists")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIFrameOnlyPlaylists: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IFrameOnlyPlaylists")(js.undefined)
        ret
    }
    @scala.inline
    def withIndexNSegments(value: integerMin3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IndexNSegments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndexNSegments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IndexNSegments")(js.undefined)
        ret
    }
    @scala.inline
    def withInputLossAction(value: InputLossActionForHlsOut): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputLossAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputLossAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputLossAction")(js.undefined)
        ret
    }
    @scala.inline
    def withIvInManifest(value: HlsIvInManifest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IvInManifest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIvInManifest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IvInManifest")(js.undefined)
        ret
    }
    @scala.inline
    def withIvSource(value: HlsIvSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IvSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIvSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IvSource")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepSegments(value: integerMin1): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeepSegments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepSegments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeepSegments")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyFormat(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyFormatVersions(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyFormatVersions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyFormatVersions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyFormatVersions")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyProviderSettings(value: KeyProviderSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyProviderSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyProviderSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyProviderSettings")(js.undefined)
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
    def withMinSegmentLength(value: integerMin0): Self = {
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
    def withMode(value: HlsMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Mode")(js.undefined)
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
    def withRedundantManifest(value: HlsRedundantManifest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RedundantManifest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedundantManifest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RedundantManifest")(js.undefined)
        ret
    }
    @scala.inline
    def withSegmentLength(value: integerMin1): Self = {
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
    def withSegmentationMode(value: HlsSegmentationMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SegmentationMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSegmentationMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SegmentationMode")(js.undefined)
        ret
    }
    @scala.inline
    def withSegmentsPerSubdirectory(value: integerMin1): Self = {
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
    def withTimedMetadataId3Period(value: integerMin0): Self = {
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
    def withTimestampDeltaMilliseconds(value: integerMin0): Self = {
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
    @scala.inline
    def withTsFileMode(value: HlsTsFileMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TsFileMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTsFileMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TsFileMode")(js.undefined)
        ret
    }
  }
  
}

