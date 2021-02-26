package typingsSlinky.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HlsGroupSettings extends StObject {
  
  /**
    * Choose one or more ad marker types to decorate your Apple HLS manifest. This setting does not determine whether SCTE-35 markers appear in the outputs themselves.
    */
  var AdMarkers: js.UndefOr[listOfHlsAdMarkers] = js.native
  
  /**
    * By default, the service creates one top-level .m3u8 HLS manifest for each HLS output group in your job. This default manifest references every output in the output group. To create additional top-level manifests that reference a subset of the outputs in the output group, specify a list of them here.
    */
  var AdditionalManifests: js.UndefOr[listOfHlsAdditionalManifest] = js.native
  
  /**
    * Ignore this setting unless you are using FairPlay DRM with Verimatrix and you encounter playback issues. Keep the default value, Include (INCLUDE), to output audio-only headers. Choose Exclude (EXCLUDE) to remove the audio-only headers from your audio segments.
    */
  var AudioOnlyHeader: js.UndefOr[HlsAudioOnlyHeader] = js.native
  
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
  implicit class HlsGroupSettingsMutableBuilder[Self <: HlsGroupSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdMarkers(value: listOfHlsAdMarkers): Self = StObject.set(x, "AdMarkers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdMarkersUndefined: Self = StObject.set(x, "AdMarkers", js.undefined)
    
    @scala.inline
    def setAdMarkersVarargs(value: HlsAdMarkers*): Self = StObject.set(x, "AdMarkers", js.Array(value :_*))
    
    @scala.inline
    def setAdditionalManifests(value: listOfHlsAdditionalManifest): Self = StObject.set(x, "AdditionalManifests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalManifestsUndefined: Self = StObject.set(x, "AdditionalManifests", js.undefined)
    
    @scala.inline
    def setAdditionalManifestsVarargs(value: HlsAdditionalManifest*): Self = StObject.set(x, "AdditionalManifests", js.Array(value :_*))
    
    @scala.inline
    def setAudioOnlyHeader(value: HlsAudioOnlyHeader): Self = StObject.set(x, "AudioOnlyHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioOnlyHeaderUndefined: Self = StObject.set(x, "AudioOnlyHeader", js.undefined)
    
    @scala.inline
    def setBaseUrl(value: string): Self = StObject.set(x, "BaseUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseUrlUndefined: Self = StObject.set(x, "BaseUrl", js.undefined)
    
    @scala.inline
    def setCaptionLanguageMappings(value: listOfHlsCaptionLanguageMapping): Self = StObject.set(x, "CaptionLanguageMappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptionLanguageMappingsUndefined: Self = StObject.set(x, "CaptionLanguageMappings", js.undefined)
    
    @scala.inline
    def setCaptionLanguageMappingsVarargs(value: HlsCaptionLanguageMapping*): Self = StObject.set(x, "CaptionLanguageMappings", js.Array(value :_*))
    
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
    def setDestination(value: stringPatternS3): Self = StObject.set(x, "Destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationSettings(value: DestinationSettings): Self = StObject.set(x, "DestinationSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationSettingsUndefined: Self = StObject.set(x, "DestinationSettings", js.undefined)
    
    @scala.inline
    def setDestinationUndefined: Self = StObject.set(x, "Destination", js.undefined)
    
    @scala.inline
    def setDirectoryStructure(value: HlsDirectoryStructure): Self = StObject.set(x, "DirectoryStructure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectoryStructureUndefined: Self = StObject.set(x, "DirectoryStructure", js.undefined)
    
    @scala.inline
    def setEncryption(value: HlsEncryptionSettings): Self = StObject.set(x, "Encryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionUndefined: Self = StObject.set(x, "Encryption", js.undefined)
    
    @scala.inline
    def setManifestCompression(value: HlsManifestCompression): Self = StObject.set(x, "ManifestCompression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManifestCompressionUndefined: Self = StObject.set(x, "ManifestCompression", js.undefined)
    
    @scala.inline
    def setManifestDurationFormat(value: HlsManifestDurationFormat): Self = StObject.set(x, "ManifestDurationFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManifestDurationFormatUndefined: Self = StObject.set(x, "ManifestDurationFormat", js.undefined)
    
    @scala.inline
    def setMinFinalSegmentLength(value: doubleMin0Max2147483647): Self = StObject.set(x, "MinFinalSegmentLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinFinalSegmentLengthUndefined: Self = StObject.set(x, "MinFinalSegmentLength", js.undefined)
    
    @scala.inline
    def setMinSegmentLength(value: integerMin0Max2147483647): Self = StObject.set(x, "MinSegmentLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinSegmentLengthUndefined: Self = StObject.set(x, "MinSegmentLength", js.undefined)
    
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
    def setSegmentControl(value: HlsSegmentControl): Self = StObject.set(x, "SegmentControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentControlUndefined: Self = StObject.set(x, "SegmentControl", js.undefined)
    
    @scala.inline
    def setSegmentLength(value: integerMin1Max2147483647): Self = StObject.set(x, "SegmentLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentLengthUndefined: Self = StObject.set(x, "SegmentLength", js.undefined)
    
    @scala.inline
    def setSegmentsPerSubdirectory(value: integerMin1Max2147483647): Self = StObject.set(x, "SegmentsPerSubdirectory", value.asInstanceOf[js.Any])
    
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
    def setTimedMetadataId3Period(value: integerMinNegative2147483648Max2147483647): Self = StObject.set(x, "TimedMetadataId3Period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimedMetadataId3PeriodUndefined: Self = StObject.set(x, "TimedMetadataId3Period", js.undefined)
    
    @scala.inline
    def setTimestampDeltaMilliseconds(value: integerMinNegative2147483648Max2147483647): Self = StObject.set(x, "TimestampDeltaMilliseconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampDeltaMillisecondsUndefined: Self = StObject.set(x, "TimestampDeltaMilliseconds", js.undefined)
  }
}
