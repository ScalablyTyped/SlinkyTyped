package typingsSlinky.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait H264Settings extends StObject {
  
  /**
    * Keep the default value, Auto (AUTO), for this setting to have MediaConvert automatically apply the best types of quantization for your video content. When you want to apply your quantization settings manually, you must set H264AdaptiveQuantization to a value other than Auto (AUTO). Use this setting to specify the strength of any adaptive quantization filters that you enable. If you don't want MediaConvert to do any adaptive quantization in this transcode, set Adaptive quantization (H264AdaptiveQuantization) to Off (OFF). Related settings: The value that you choose here applies to the following settings: H264FlickerAdaptiveQuantization, H264SpatialAdaptiveQuantization, and H264TemporalAdaptiveQuantization.
    */
  var AdaptiveQuantization: js.UndefOr[H264AdaptiveQuantization] = js.native
  
  /**
    * Specify the average bitrate in bits per second. Required for VBR and CBR. For MS Smooth outputs, bitrates must be unique when rounded down to the nearest multiple of 1000.
    */
  var Bitrate: js.UndefOr[integerMin1000Max1152000000] = js.native
  
  /**
    * Specify an H.264 level that is consistent with your output video settings. If you aren't sure what level to specify, choose Auto (AUTO).
    */
  var CodecLevel: js.UndefOr[H264CodecLevel] = js.native
  
  /**
    * H.264 Profile. High 4:2:2 and 10-bit profiles are only available with the AVC-I License.
    */
  var CodecProfile: js.UndefOr[H264CodecProfile] = js.native
  
  /**
    * Choose Adaptive to improve subjective video quality for high-motion content. This will cause the service to use fewer B-frames (which infer information based on other frames) for high-motion portions of the video and more B-frames for low-motion portions. The maximum number of B-frames is limited by the value you provide for the setting B frames between reference frames (numberBFramesBetweenReferenceFrames).
    */
  var DynamicSubGop: js.UndefOr[H264DynamicSubGop] = js.native
  
  /**
    * Entropy encoding mode. Use CABAC (must be in Main or High profile) or CAVLC.
    */
  var EntropyEncoding: js.UndefOr[H264EntropyEncoding] = js.native
  
  /**
    * Keep the default value, PAFF, to have MediaConvert use PAFF encoding for interlaced outputs. Choose Force field (FORCE_FIELD) to disable PAFF encoding and create separate interlaced fields.
    */
  var FieldEncoding: js.UndefOr[H264FieldEncoding] = js.native
  
  /**
    * Only use this setting when you change the default value, AUTO, for the setting H264AdaptiveQuantization. When you keep all defaults, excluding H264AdaptiveQuantization and all other adaptive quantization from your JSON job specification, MediaConvert automatically applies the best types of quantization for your video content. When you set H264AdaptiveQuantization to a value other than AUTO, the default value for H264FlickerAdaptiveQuantization is Disabled (DISABLED). Change this value to Enabled (ENABLED) to reduce I-frame pop. I-frame pop appears as a visual flicker that can arise when the encoder saves bits by copying some macroblocks many times from frame to frame, and then refreshes them at the I-frame. When you enable this setting, the encoder updates these macroblocks slightly more often to smooth out the flicker. To manually enable or disable H264FlickerAdaptiveQuantization, you must set Adaptive quantization (H264AdaptiveQuantization) to a value other than AUTO.
    */
  var FlickerAdaptiveQuantization: js.UndefOr[H264FlickerAdaptiveQuantization] = js.native
  
  /**
    * If you are using the console, use the Framerate setting to specify the frame rate for this output. If you want to keep the same frame rate as the input video, choose Follow source. If you want to do frame rate conversion, choose a frame rate from the dropdown list or choose Custom. The framerates shown in the dropdown list are decimal approximations of fractions. If you choose Custom, specify your frame rate as a fraction. If you are creating your transcoding job specification as a JSON file without the console, use FramerateControl to specify which value the service uses for the frame rate for this output. Choose INITIALIZE_FROM_SOURCE if you want the service to use the frame rate from the input. Choose SPECIFIED if you want the service to use the frame rate you specify in the settings FramerateNumerator and FramerateDenominator.
    */
  var FramerateControl: js.UndefOr[H264FramerateControl] = js.native
  
  /**
    * Choose the method that you want MediaConvert to use when increasing or decreasing the frame rate. We recommend using drop duplicate (DUPLICATE_DROP) for numerically simple conversions, such as 60 fps to 30 fps. For numerically complex conversions, you can use interpolate (INTERPOLATE) to avoid stutter. This results in a smooth picture, but might introduce undesirable video artifacts. For complex frame rate conversions, especially if your source video has already been converted from its original cadence, use FrameFormer (FRAMEFORMER) to do motion-compensated interpolation. FrameFormer chooses the best conversion method frame by frame. Note that using FrameFormer increases the transcoding time and incurs a significant add-on cost.
    */
  var FramerateConversionAlgorithm: js.UndefOr[H264FramerateConversionAlgorithm] = js.native
  
  /**
    * When you use the API for transcode jobs that use frame rate conversion, specify the frame rate as a fraction. For example,  24000 / 1001 = 23.976 fps. Use FramerateDenominator to specify the denominator of this fraction. In this example, use 1001 for the value of FramerateDenominator. When you use the console for transcode jobs that use frame rate conversion, provide the value as a decimal number for Framerate. In this example, specify 23.976.
    */
  var FramerateDenominator: js.UndefOr[integerMin1Max2147483647] = js.native
  
  /**
    * When you use the API for transcode jobs that use frame rate conversion, specify the frame rate as a fraction. For example,  24000 / 1001 = 23.976 fps. Use FramerateNumerator to specify the numerator of this fraction. In this example, use 24000 for the value of FramerateNumerator. When you use the console for transcode jobs that use frame rate conversion, provide the value as a decimal number for Framerate. In this example, specify 23.976.
    */
  var FramerateNumerator: js.UndefOr[integerMin1Max2147483647] = js.native
  
  /**
    * If enable, use reference B frames for GOP structures that have B frames > 1.
    */
  var GopBReference: js.UndefOr[H264GopBReference] = js.native
  
  /**
    * Frequency of closed GOPs. In streaming applications, it is recommended that this be set to 1 so a decoder joining mid-stream will receive an IDR frame as quickly as possible. Setting this value to 0 will break output segmenting.
    */
  var GopClosedCadence: js.UndefOr[integerMin0Max2147483647] = js.native
  
  /**
    * GOP Length (keyframe interval) in frames or seconds. Must be greater than zero.
    */
  var GopSize: js.UndefOr[doubleMin0] = js.native
  
  /**
    * Indicates if the GOP Size in H264 is specified in frames or seconds. If seconds the system will convert the GOP Size into a frame count at run time.
    */
  var GopSizeUnits: js.UndefOr[H264GopSizeUnits] = js.native
  
  /**
    * Percentage of the buffer that should initially be filled (HRD buffer model).
    */
  var HrdBufferInitialFillPercentage: js.UndefOr[integerMin0Max100] = js.native
  
  /**
    * Size of buffer (HRD buffer model) in bits. For example, enter five megabits as 5000000.
    */
  var HrdBufferSize: js.UndefOr[integerMin0Max1152000000] = js.native
  
  /**
    * Choose the scan line type for the output. Keep the default value, Progressive (PROGRESSIVE) to create a progressive output, regardless of the scan type of your input. Use Top field first (TOP_FIELD) or Bottom field first (BOTTOM_FIELD) to create an output that's interlaced with the same field polarity throughout. Use Follow, default top (FOLLOW_TOP_FIELD) or Follow, default bottom (FOLLOW_BOTTOM_FIELD) to produce outputs with the same field polarity as the source. For jobs that have multiple inputs, the output field polarity might change over the course of the output. Follow behavior depends on the input scan type. If the source is interlaced, the output will be interlaced with the same polarity as the source. If the source is progressive, the output will be interlaced with top field bottom field first, depending on which of the Follow options you choose.
    */
  var InterlaceMode: js.UndefOr[H264InterlaceMode] = js.native
  
  /**
    * Maximum bitrate in bits/second. For example, enter five megabits per second as 5000000. Required when Rate control mode is QVBR.
    */
  var MaxBitrate: js.UndefOr[integerMin1000Max1152000000] = js.native
  
  /**
    * Enforces separation between repeated (cadence) I-frames and I-frames inserted by Scene Change Detection. If a scene change I-frame is within I-interval frames of a cadence I-frame, the GOP is shrunk and/or stretched to the scene change I-frame. GOP stretch requires enabling lookahead as well as setting I-interval. The normal cadence resumes for the next GOP. This setting is only used when Scene Change Detect is enabled. Note: Maximum GOP stretch = GOP size + Min-I-interval - 1
    */
  var MinIInterval: js.UndefOr[integerMin0Max30] = js.native
  
  /**
    * Number of B-frames between reference frames.
    */
  var NumberBFramesBetweenReferenceFrames: js.UndefOr[integerMin0Max7] = js.native
  
  /**
    * Number of reference frames to use. The encoder may use more than requested if using B-frames and/or interlaced encoding.
    */
  var NumberReferenceFrames: js.UndefOr[integerMin1Max6] = js.native
  
  /**
    * Optional. Specify how the service determines the pixel aspect ratio (PAR) for this output. The default behavior, Follow source (INITIALIZE_FROM_SOURCE), uses the PAR from your input video for your output. To specify a different PAR in the console, choose any value other than Follow source. To specify a different PAR by editing the JSON job specification, choose SPECIFIED. When you choose SPECIFIED for this setting, you must also specify values for the parNumerator and parDenominator settings.
    */
  var ParControl: js.UndefOr[H264ParControl] = js.native
  
  /**
    * Required when you set Pixel aspect ratio (parControl) to SPECIFIED. On the console, this corresponds to any value other than Follow source. When you specify an output pixel aspect ratio (PAR) that is different from your input video PAR, provide your output PAR as a ratio. For example, for D1/DV NTSC widescreen, you would specify the ratio 40:33. In this example, the value for parDenominator is 33.
    */
  var ParDenominator: js.UndefOr[integerMin1Max2147483647] = js.native
  
  /**
    * Required when you set Pixel aspect ratio (parControl) to SPECIFIED. On the console, this corresponds to any value other than Follow source. When you specify an output pixel aspect ratio (PAR) that is different from your input video PAR, provide your output PAR as a ratio. For example, for D1/DV NTSC widescreen, you would specify the ratio 40:33. In this example, the value for parNumerator is 40.
    */
  var ParNumerator: js.UndefOr[integerMin1Max2147483647] = js.native
  
  /**
    * Optional. Use Quality tuning level (qualityTuningLevel) to choose how you want to trade off encoding speed for output video quality. The default behavior is faster, lower quality, single-pass encoding.
    */
  var QualityTuningLevel: js.UndefOr[H264QualityTuningLevel] = js.native
  
  /**
    * Settings for quality-defined variable bitrate encoding with the H.264 codec. Required when you set Rate control mode to QVBR. Not valid when you set Rate control mode to a value other than QVBR, or when you don't define Rate control mode.
    */
  var QvbrSettings: js.UndefOr[H264QvbrSettings] = js.native
  
  /**
    * Use this setting to specify whether this output has a variable bitrate (VBR), constant bitrate (CBR) or quality-defined variable bitrate (QVBR).
    */
  var RateControlMode: js.UndefOr[H264RateControlMode] = js.native
  
  /**
    * Places a PPS header on each encoded picture, even if repeated.
    */
  var RepeatPps: js.UndefOr[H264RepeatPps] = js.native
  
  /**
    * Enable this setting to insert I-frames at scene changes that the service automatically detects. This improves video quality and is enabled by default. If this output uses QVBR, choose Transition detection (TRANSITION_DETECTION) for further video quality improvement. For more information about QVBR, see https://docs.aws.amazon.com/console/mediaconvert/cbr-vbr-qvbr.
    */
  var SceneChangeDetect: js.UndefOr[H264SceneChangeDetect] = js.native
  
  /**
    * Number of slices per picture. Must be less than or equal to the number of macroblock rows for progressive pictures, and less than or equal to half the number of macroblock rows for interlaced pictures.
    */
  var Slices: js.UndefOr[integerMin1Max32] = js.native
  
  /**
    * Ignore this setting unless your input frame rate is 23.976 or 24 frames per second (fps). Enable slow PAL to create a 25 fps output. When you enable slow PAL, MediaConvert relabels the video frames to 25 fps and resamples your audio to keep it synchronized with the video. Note that enabling this setting will slightly reduce the duration of your video. Required settings: You must also set Framerate to 25. In your JSON job specification, set (framerateControl) to (SPECIFIED), (framerateNumerator) to 25 and (framerateDenominator) to 1.
    */
  var SlowPal: js.UndefOr[H264SlowPal] = js.native
  
  /**
    * Ignore this setting unless you need to comply with a specification that requires a specific value. If you don't have a specification requirement, we recommend that you adjust the softness of your output by using a lower value for the setting Sharpness (sharpness) or by enabling a noise reducer filter (noiseReducerFilter). The Softness (softness) setting specifies the quantization matrices that the encoder uses. Keep the default value, 0, for flat quantization. Choose the value 1 or 16 to use the default JVT softening quantization matricies from the H.264 specification. Choose a value from 17 to 128 to use planar interpolation. Increasing values from 17 to 128 result in increasing reduction of high-frequency data. The value 128 results in the softest video.
    */
  var Softness: js.UndefOr[integerMin0Max128] = js.native
  
  /**
    * Only use this setting when you change the default value, Auto (AUTO), for the setting H264AdaptiveQuantization. When you keep all defaults, excluding H264AdaptiveQuantization and all other adaptive quantization from your JSON job specification, MediaConvert automatically applies the best types of quantization for your video content. When you set H264AdaptiveQuantization to a value other than AUTO, the default value for H264SpatialAdaptiveQuantization is Enabled (ENABLED). Keep this default value to adjust quantization within each frame based on spatial variation of content complexity. When you enable this feature, the encoder uses fewer bits on areas that can sustain more distortion with no noticeable visual degradation and uses more bits on areas where any small distortion will be noticeable. For example, complex textured blocks are encoded with fewer bits and smooth textured blocks are encoded with more bits. Enabling this feature will almost always improve your video quality. Note, though, that this feature doesn't take into account where the viewer's attention is likely to be. If viewers are likely to be focusing their attention on a part of the screen with a lot of complex texture, you might choose to set H264SpatialAdaptiveQuantization to Disabled (DISABLED). Related setting: When you enable spatial adaptive quantization, set the value for Adaptive quantization (H264AdaptiveQuantization) depending on your content. For homogeneous content, such as cartoons and video games, set it to Low. For content with a wider variety of textures, set it to High or Higher. To manually enable or disable H264SpatialAdaptiveQuantization, you must set Adaptive quantization (H264AdaptiveQuantization) to a value other than AUTO.
    */
  var SpatialAdaptiveQuantization: js.UndefOr[H264SpatialAdaptiveQuantization] = js.native
  
  /**
    * Produces a bitstream compliant with SMPTE RP-2027.
    */
  var Syntax: js.UndefOr[H264Syntax] = js.native
  
  /**
    * When you do frame rate conversion from 23.976 frames per second (fps) to 29.97 fps, and your output scan type is interlaced, you can optionally enable hard or soft telecine to create a smoother picture. Hard telecine (HARD) produces a 29.97i output. Soft telecine (SOFT) produces an output with a 23.976 output that signals to the video player device to do the conversion during play back. When you keep the default value, None (NONE), MediaConvert does a standard frame rate conversion to 29.97 without doing anything with the field polarity to create a smoother picture.
    */
  var Telecine: js.UndefOr[H264Telecine] = js.native
  
  /**
    * Only use this setting when you change the default value, AUTO, for the setting H264AdaptiveQuantization. When you keep all defaults, excluding H264AdaptiveQuantization and all other adaptive quantization from your JSON job specification, MediaConvert automatically applies the best types of quantization for your video content. When you set H264AdaptiveQuantization to a value other than AUTO, the default value for H264TemporalAdaptiveQuantization is Enabled (ENABLED). Keep this default value to adjust quantization within each frame based on temporal variation of content complexity. When you enable this feature, the encoder uses fewer bits on areas of the frame that aren't moving and uses more bits on complex objects with sharp edges that move a lot. For example, this feature improves the readability of text tickers on newscasts and scoreboards on sports matches. Enabling this feature will almost always improve your video quality. Note, though, that this feature doesn't take into account where the viewer's attention is likely to be. If viewers are likely to be focusing their attention on a part of the screen that doesn't have moving objects with sharp edges, such as sports athletes' faces, you might choose to set H264TemporalAdaptiveQuantization to Disabled (DISABLED). Related setting: When you enable temporal quantization, adjust the strength of the filter with the setting Adaptive quantization (adaptiveQuantization). To manually enable or disable H264TemporalAdaptiveQuantization, you must set Adaptive quantization (H264AdaptiveQuantization) to a value other than AUTO.
    */
  var TemporalAdaptiveQuantization: js.UndefOr[H264TemporalAdaptiveQuantization] = js.native
  
  /**
    * Inserts timecode for each frame as 4 bytes of an unregistered SEI message.
    */
  var UnregisteredSeiTimecode: js.UndefOr[H264UnregisteredSeiTimecode] = js.native
}
object H264Settings {
  
  @scala.inline
  def apply(): H264Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[H264Settings]
  }
  
  @scala.inline
  implicit class H264SettingsMutableBuilder[Self <: H264Settings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdaptiveQuantization(value: H264AdaptiveQuantization): Self = StObject.set(x, "AdaptiveQuantization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdaptiveQuantizationUndefined: Self = StObject.set(x, "AdaptiveQuantization", js.undefined)
    
    @scala.inline
    def setBitrate(value: integerMin1000Max1152000000): Self = StObject.set(x, "Bitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBitrateUndefined: Self = StObject.set(x, "Bitrate", js.undefined)
    
    @scala.inline
    def setCodecLevel(value: H264CodecLevel): Self = StObject.set(x, "CodecLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodecLevelUndefined: Self = StObject.set(x, "CodecLevel", js.undefined)
    
    @scala.inline
    def setCodecProfile(value: H264CodecProfile): Self = StObject.set(x, "CodecProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodecProfileUndefined: Self = StObject.set(x, "CodecProfile", js.undefined)
    
    @scala.inline
    def setDynamicSubGop(value: H264DynamicSubGop): Self = StObject.set(x, "DynamicSubGop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamicSubGopUndefined: Self = StObject.set(x, "DynamicSubGop", js.undefined)
    
    @scala.inline
    def setEntropyEncoding(value: H264EntropyEncoding): Self = StObject.set(x, "EntropyEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntropyEncodingUndefined: Self = StObject.set(x, "EntropyEncoding", js.undefined)
    
    @scala.inline
    def setFieldEncoding(value: H264FieldEncoding): Self = StObject.set(x, "FieldEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldEncodingUndefined: Self = StObject.set(x, "FieldEncoding", js.undefined)
    
    @scala.inline
    def setFlickerAdaptiveQuantization(value: H264FlickerAdaptiveQuantization): Self = StObject.set(x, "FlickerAdaptiveQuantization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlickerAdaptiveQuantizationUndefined: Self = StObject.set(x, "FlickerAdaptiveQuantization", js.undefined)
    
    @scala.inline
    def setFramerateControl(value: H264FramerateControl): Self = StObject.set(x, "FramerateControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFramerateControlUndefined: Self = StObject.set(x, "FramerateControl", js.undefined)
    
    @scala.inline
    def setFramerateConversionAlgorithm(value: H264FramerateConversionAlgorithm): Self = StObject.set(x, "FramerateConversionAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFramerateConversionAlgorithmUndefined: Self = StObject.set(x, "FramerateConversionAlgorithm", js.undefined)
    
    @scala.inline
    def setFramerateDenominator(value: integerMin1Max2147483647): Self = StObject.set(x, "FramerateDenominator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFramerateDenominatorUndefined: Self = StObject.set(x, "FramerateDenominator", js.undefined)
    
    @scala.inline
    def setFramerateNumerator(value: integerMin1Max2147483647): Self = StObject.set(x, "FramerateNumerator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFramerateNumeratorUndefined: Self = StObject.set(x, "FramerateNumerator", js.undefined)
    
    @scala.inline
    def setGopBReference(value: H264GopBReference): Self = StObject.set(x, "GopBReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGopBReferenceUndefined: Self = StObject.set(x, "GopBReference", js.undefined)
    
    @scala.inline
    def setGopClosedCadence(value: integerMin0Max2147483647): Self = StObject.set(x, "GopClosedCadence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGopClosedCadenceUndefined: Self = StObject.set(x, "GopClosedCadence", js.undefined)
    
    @scala.inline
    def setGopSize(value: doubleMin0): Self = StObject.set(x, "GopSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGopSizeUndefined: Self = StObject.set(x, "GopSize", js.undefined)
    
    @scala.inline
    def setGopSizeUnits(value: H264GopSizeUnits): Self = StObject.set(x, "GopSizeUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGopSizeUnitsUndefined: Self = StObject.set(x, "GopSizeUnits", js.undefined)
    
    @scala.inline
    def setHrdBufferInitialFillPercentage(value: integerMin0Max100): Self = StObject.set(x, "HrdBufferInitialFillPercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHrdBufferInitialFillPercentageUndefined: Self = StObject.set(x, "HrdBufferInitialFillPercentage", js.undefined)
    
    @scala.inline
    def setHrdBufferSize(value: integerMin0Max1152000000): Self = StObject.set(x, "HrdBufferSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHrdBufferSizeUndefined: Self = StObject.set(x, "HrdBufferSize", js.undefined)
    
    @scala.inline
    def setInterlaceMode(value: H264InterlaceMode): Self = StObject.set(x, "InterlaceMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterlaceModeUndefined: Self = StObject.set(x, "InterlaceMode", js.undefined)
    
    @scala.inline
    def setMaxBitrate(value: integerMin1000Max1152000000): Self = StObject.set(x, "MaxBitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxBitrateUndefined: Self = StObject.set(x, "MaxBitrate", js.undefined)
    
    @scala.inline
    def setMinIInterval(value: integerMin0Max30): Self = StObject.set(x, "MinIInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinIIntervalUndefined: Self = StObject.set(x, "MinIInterval", js.undefined)
    
    @scala.inline
    def setNumberBFramesBetweenReferenceFrames(value: integerMin0Max7): Self = StObject.set(x, "NumberBFramesBetweenReferenceFrames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberBFramesBetweenReferenceFramesUndefined: Self = StObject.set(x, "NumberBFramesBetweenReferenceFrames", js.undefined)
    
    @scala.inline
    def setNumberReferenceFrames(value: integerMin1Max6): Self = StObject.set(x, "NumberReferenceFrames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberReferenceFramesUndefined: Self = StObject.set(x, "NumberReferenceFrames", js.undefined)
    
    @scala.inline
    def setParControl(value: H264ParControl): Self = StObject.set(x, "ParControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParControlUndefined: Self = StObject.set(x, "ParControl", js.undefined)
    
    @scala.inline
    def setParDenominator(value: integerMin1Max2147483647): Self = StObject.set(x, "ParDenominator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParDenominatorUndefined: Self = StObject.set(x, "ParDenominator", js.undefined)
    
    @scala.inline
    def setParNumerator(value: integerMin1Max2147483647): Self = StObject.set(x, "ParNumerator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParNumeratorUndefined: Self = StObject.set(x, "ParNumerator", js.undefined)
    
    @scala.inline
    def setQualityTuningLevel(value: H264QualityTuningLevel): Self = StObject.set(x, "QualityTuningLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQualityTuningLevelUndefined: Self = StObject.set(x, "QualityTuningLevel", js.undefined)
    
    @scala.inline
    def setQvbrSettings(value: H264QvbrSettings): Self = StObject.set(x, "QvbrSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQvbrSettingsUndefined: Self = StObject.set(x, "QvbrSettings", js.undefined)
    
    @scala.inline
    def setRateControlMode(value: H264RateControlMode): Self = StObject.set(x, "RateControlMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRateControlModeUndefined: Self = StObject.set(x, "RateControlMode", js.undefined)
    
    @scala.inline
    def setRepeatPps(value: H264RepeatPps): Self = StObject.set(x, "RepeatPps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepeatPpsUndefined: Self = StObject.set(x, "RepeatPps", js.undefined)
    
    @scala.inline
    def setSceneChangeDetect(value: H264SceneChangeDetect): Self = StObject.set(x, "SceneChangeDetect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSceneChangeDetectUndefined: Self = StObject.set(x, "SceneChangeDetect", js.undefined)
    
    @scala.inline
    def setSlices(value: integerMin1Max32): Self = StObject.set(x, "Slices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlicesUndefined: Self = StObject.set(x, "Slices", js.undefined)
    
    @scala.inline
    def setSlowPal(value: H264SlowPal): Self = StObject.set(x, "SlowPal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlowPalUndefined: Self = StObject.set(x, "SlowPal", js.undefined)
    
    @scala.inline
    def setSoftness(value: integerMin0Max128): Self = StObject.set(x, "Softness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoftnessUndefined: Self = StObject.set(x, "Softness", js.undefined)
    
    @scala.inline
    def setSpatialAdaptiveQuantization(value: H264SpatialAdaptiveQuantization): Self = StObject.set(x, "SpatialAdaptiveQuantization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpatialAdaptiveQuantizationUndefined: Self = StObject.set(x, "SpatialAdaptiveQuantization", js.undefined)
    
    @scala.inline
    def setSyntax(value: H264Syntax): Self = StObject.set(x, "Syntax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyntaxUndefined: Self = StObject.set(x, "Syntax", js.undefined)
    
    @scala.inline
    def setTelecine(value: H264Telecine): Self = StObject.set(x, "Telecine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTelecineUndefined: Self = StObject.set(x, "Telecine", js.undefined)
    
    @scala.inline
    def setTemporalAdaptiveQuantization(value: H264TemporalAdaptiveQuantization): Self = StObject.set(x, "TemporalAdaptiveQuantization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemporalAdaptiveQuantizationUndefined: Self = StObject.set(x, "TemporalAdaptiveQuantization", js.undefined)
    
    @scala.inline
    def setUnregisteredSeiTimecode(value: H264UnregisteredSeiTimecode): Self = StObject.set(x, "UnregisteredSeiTimecode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnregisteredSeiTimecodeUndefined: Self = StObject.set(x, "UnregisteredSeiTimecode", js.undefined)
  }
}
