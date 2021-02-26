package typingsSlinky.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HlsGroupSettings extends StObject {
  
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
    * Specifies whether to insert EXT-X-DISCONTINUITY tags in the HLS child manifests for this output group.
  Typically, choose Insert because these tags are required in the manifest (according to the HLS specification) and serve an important purpose.
  Choose Never Insert only if the downstream system is doing real-time failover (without using the MediaLive automatic failover feature) and only if that downstream system has advised you to exclude the tags.
    */
  var DiscontinuityTags: js.UndefOr[HlsDiscontinuityTags] = js.native
  
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
    * Specifies whether to include the final (incomplete) segment in the media output when the pipeline stops producing output because of a channel stop, a channel pause or a loss of input to the pipeline.
  Auto means that MediaLive decides whether to include the final segment, depending on the channel class and the types of output groups.
  Suppress means to never include the incomplete segment. We recommend you choose Auto and let MediaLive control the behavior.
    */
  var IncompleteSegmentBehavior: js.UndefOr[HlsIncompleteSegmentBehavior] = js.native
  
  /**
    * Applies only if Mode field is LIVE.
  Specifies the maximum number of segments in the media manifest file. After this maximum, older segments are removed from the media manifest. This number must be smaller than the number in the Keep Segments field.
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
    * Applies only if Mode field is LIVE.
  Specifies the number of media segments to retain in the destination directory. This number should be bigger than indexNSegments (Num segments). We recommend (value = (2 x indexNsegments) + 1).
  If this "keep segments" number is too low, the following might happen: the player is still reading a media manifest file that lists this segment, but that segment has been removed from the destination directory (as directed by indexNSegments). This situation would result in a 404 HTTP error on the player.
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
    * MANIFESTS_AND_SEGMENTS: Generates manifests (master manifest, if applicable, and media manifests) for this output group.
  VARIANT_MANIFESTS_AND_SEGMENTS: Generates media manifests for this output group, but not a master manifest.
  SEGMENTS_ONLY: Does not generate any manifests for this output group.
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
    * SEGMENTED_FILES: Emit the program as segments - multiple .ts media files.
  SINGLE_FILE: Applies only if Mode field is VOD. Emit the program as a single .ts media file. The media manifest includes #EXT-X-BYTERANGE tags to index segments for playback. A typical use for this value is when sending the output to AWS Elemental MediaConvert, which can accept only a single media file. Playback while the channel is running is not guaranteed due to HTTP server caching.
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
  implicit class HlsGroupSettingsMutableBuilder[Self <: HlsGroupSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdMarkers(value: listOfHlsAdMarkers): Self = StObject.set(x, "AdMarkers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdMarkersUndefined: Self = StObject.set(x, "AdMarkers", js.undefined)
    
    @scala.inline
    def setAdMarkersVarargs(value: HlsAdMarkers*): Self = StObject.set(x, "AdMarkers", js.Array(value :_*))
    
    @scala.inline
    def setBaseUrlContent(value: string): Self = StObject.set(x, "BaseUrlContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseUrlContent1(value: string): Self = StObject.set(x, "BaseUrlContent1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseUrlContent1Undefined: Self = StObject.set(x, "BaseUrlContent1", js.undefined)
    
    @scala.inline
    def setBaseUrlContentUndefined: Self = StObject.set(x, "BaseUrlContent", js.undefined)
    
    @scala.inline
    def setBaseUrlManifest(value: string): Self = StObject.set(x, "BaseUrlManifest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseUrlManifest1(value: string): Self = StObject.set(x, "BaseUrlManifest1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseUrlManifest1Undefined: Self = StObject.set(x, "BaseUrlManifest1", js.undefined)
    
    @scala.inline
    def setBaseUrlManifestUndefined: Self = StObject.set(x, "BaseUrlManifest", js.undefined)
    
    @scala.inline
    def setCaptionLanguageMappings(value: listOfCaptionLanguageMapping): Self = StObject.set(x, "CaptionLanguageMappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptionLanguageMappingsUndefined: Self = StObject.set(x, "CaptionLanguageMappings", js.undefined)
    
    @scala.inline
    def setCaptionLanguageMappingsVarargs(value: CaptionLanguageMapping*): Self = StObject.set(x, "CaptionLanguageMappings", js.Array(value :_*))
    
    @scala.inline
    def setCaptionLanguageSetting(value: HlsCaptionLanguageSetting): Self = StObject.set(x, "CaptionLanguageSetting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptionLanguageSettingUndefined: Self = StObject.set(x, "CaptionLanguageSetting", js.undefined)
    
    @scala.inline
    def setClientCache(value: HlsClientCache): Self = StObject.set(x, "ClientCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientCacheUndefined: Self = StObject.set(x, "ClientCache", js.undefined)
    
    @scala.inline
    def setCodecSpecification(value: HlsCodecSpecification): Self = StObject.set(x, "CodecSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodecSpecificationUndefined: Self = StObject.set(x, "CodecSpecification", js.undefined)
    
    @scala.inline
    def setConstantIv(value: stringMin32Max32): Self = StObject.set(x, "ConstantIv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstantIvUndefined: Self = StObject.set(x, "ConstantIv", js.undefined)
    
    @scala.inline
    def setDestination(value: OutputLocationRef): Self = StObject.set(x, "Destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectoryStructure(value: HlsDirectoryStructure): Self = StObject.set(x, "DirectoryStructure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectoryStructureUndefined: Self = StObject.set(x, "DirectoryStructure", js.undefined)
    
    @scala.inline
    def setDiscontinuityTags(value: HlsDiscontinuityTags): Self = StObject.set(x, "DiscontinuityTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiscontinuityTagsUndefined: Self = StObject.set(x, "DiscontinuityTags", js.undefined)
    
    @scala.inline
    def setEncryptionType(value: HlsEncryptionType): Self = StObject.set(x, "EncryptionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionTypeUndefined: Self = StObject.set(x, "EncryptionType", js.undefined)
    
    @scala.inline
    def setHlsCdnSettings(value: HlsCdnSettings): Self = StObject.set(x, "HlsCdnSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHlsCdnSettingsUndefined: Self = StObject.set(x, "HlsCdnSettings", js.undefined)
    
    @scala.inline
    def setHlsId3SegmentTagging(value: HlsId3SegmentTaggingState): Self = StObject.set(x, "HlsId3SegmentTagging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHlsId3SegmentTaggingUndefined: Self = StObject.set(x, "HlsId3SegmentTagging", js.undefined)
    
    @scala.inline
    def setIFrameOnlyPlaylists(value: IFrameOnlyPlaylistType): Self = StObject.set(x, "IFrameOnlyPlaylists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIFrameOnlyPlaylistsUndefined: Self = StObject.set(x, "IFrameOnlyPlaylists", js.undefined)
    
    @scala.inline
    def setIncompleteSegmentBehavior(value: HlsIncompleteSegmentBehavior): Self = StObject.set(x, "IncompleteSegmentBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncompleteSegmentBehaviorUndefined: Self = StObject.set(x, "IncompleteSegmentBehavior", js.undefined)
    
    @scala.inline
    def setIndexNSegments(value: integerMin3): Self = StObject.set(x, "IndexNSegments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexNSegmentsUndefined: Self = StObject.set(x, "IndexNSegments", js.undefined)
    
    @scala.inline
    def setInputLossAction(value: InputLossActionForHlsOut): Self = StObject.set(x, "InputLossAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputLossActionUndefined: Self = StObject.set(x, "InputLossAction", js.undefined)
    
    @scala.inline
    def setIvInManifest(value: HlsIvInManifest): Self = StObject.set(x, "IvInManifest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIvInManifestUndefined: Self = StObject.set(x, "IvInManifest", js.undefined)
    
    @scala.inline
    def setIvSource(value: HlsIvSource): Self = StObject.set(x, "IvSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIvSourceUndefined: Self = StObject.set(x, "IvSource", js.undefined)
    
    @scala.inline
    def setKeepSegments(value: integerMin1): Self = StObject.set(x, "KeepSegments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepSegmentsUndefined: Self = StObject.set(x, "KeepSegments", js.undefined)
    
    @scala.inline
    def setKeyFormat(value: string): Self = StObject.set(x, "KeyFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyFormatUndefined: Self = StObject.set(x, "KeyFormat", js.undefined)
    
    @scala.inline
    def setKeyFormatVersions(value: string): Self = StObject.set(x, "KeyFormatVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyFormatVersionsUndefined: Self = StObject.set(x, "KeyFormatVersions", js.undefined)
    
    @scala.inline
    def setKeyProviderSettings(value: KeyProviderSettings): Self = StObject.set(x, "KeyProviderSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyProviderSettingsUndefined: Self = StObject.set(x, "KeyProviderSettings", js.undefined)
    
    @scala.inline
    def setManifestCompression(value: HlsManifestCompression): Self = StObject.set(x, "ManifestCompression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManifestCompressionUndefined: Self = StObject.set(x, "ManifestCompression", js.undefined)
    
    @scala.inline
    def setManifestDurationFormat(value: HlsManifestDurationFormat): Self = StObject.set(x, "ManifestDurationFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManifestDurationFormatUndefined: Self = StObject.set(x, "ManifestDurationFormat", js.undefined)
    
    @scala.inline
    def setMinSegmentLength(value: integerMin0): Self = StObject.set(x, "MinSegmentLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinSegmentLengthUndefined: Self = StObject.set(x, "MinSegmentLength", js.undefined)
    
    @scala.inline
    def setMode(value: HlsMode): Self = StObject.set(x, "Mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "Mode", js.undefined)
    
    @scala.inline
    def setOutputSelection(value: HlsOutputSelection): Self = StObject.set(x, "OutputSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputSelectionUndefined: Self = StObject.set(x, "OutputSelection", js.undefined)
    
    @scala.inline
    def setProgramDateTime(value: HlsProgramDateTime): Self = StObject.set(x, "ProgramDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgramDateTimePeriod(value: integerMin0Max3600): Self = StObject.set(x, "ProgramDateTimePeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgramDateTimePeriodUndefined: Self = StObject.set(x, "ProgramDateTimePeriod", js.undefined)
    
    @scala.inline
    def setProgramDateTimeUndefined: Self = StObject.set(x, "ProgramDateTime", js.undefined)
    
    @scala.inline
    def setRedundantManifest(value: HlsRedundantManifest): Self = StObject.set(x, "RedundantManifest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedundantManifestUndefined: Self = StObject.set(x, "RedundantManifest", js.undefined)
    
    @scala.inline
    def setSegmentLength(value: integerMin1): Self = StObject.set(x, "SegmentLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentLengthUndefined: Self = StObject.set(x, "SegmentLength", js.undefined)
    
    @scala.inline
    def setSegmentationMode(value: HlsSegmentationMode): Self = StObject.set(x, "SegmentationMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentationModeUndefined: Self = StObject.set(x, "SegmentationMode", js.undefined)
    
    @scala.inline
    def setSegmentsPerSubdirectory(value: integerMin1): Self = StObject.set(x, "SegmentsPerSubdirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentsPerSubdirectoryUndefined: Self = StObject.set(x, "SegmentsPerSubdirectory", js.undefined)
    
    @scala.inline
    def setStreamInfResolution(value: HlsStreamInfResolution): Self = StObject.set(x, "StreamInfResolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamInfResolutionUndefined: Self = StObject.set(x, "StreamInfResolution", js.undefined)
    
    @scala.inline
    def setTimedMetadataId3Frame(value: HlsTimedMetadataId3Frame): Self = StObject.set(x, "TimedMetadataId3Frame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimedMetadataId3FrameUndefined: Self = StObject.set(x, "TimedMetadataId3Frame", js.undefined)
    
    @scala.inline
    def setTimedMetadataId3Period(value: integerMin0): Self = StObject.set(x, "TimedMetadataId3Period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimedMetadataId3PeriodUndefined: Self = StObject.set(x, "TimedMetadataId3Period", js.undefined)
    
    @scala.inline
    def setTimestampDeltaMilliseconds(value: integerMin0): Self = StObject.set(x, "TimestampDeltaMilliseconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampDeltaMillisecondsUndefined: Self = StObject.set(x, "TimestampDeltaMilliseconds", js.undefined)
    
    @scala.inline
    def setTsFileMode(value: HlsTsFileMode): Self = StObject.set(x, "TsFileMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTsFileModeUndefined: Self = StObject.set(x, "TsFileMode", js.undefined)
  }
}
