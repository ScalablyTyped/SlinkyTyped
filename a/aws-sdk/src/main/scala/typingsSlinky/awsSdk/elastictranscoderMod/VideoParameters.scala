package typingsSlinky.awsSdk.elastictranscoderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideoParameters extends StObject {
  
  /**
    *  To better control resolution and aspect ratio of output videos, we recommend that you use the values MaxWidth, MaxHeight, SizingPolicy, PaddingPolicy, and DisplayAspectRatio instead of Resolution and AspectRatio. The two groups of settings are mutually exclusive. Do not use them together.  The display aspect ratio of the video in the output file. Valid values include:  auto, 1:1, 4:3, 3:2, 16:9  If you specify auto, Elastic Transcoder tries to preserve the aspect ratio of the input file. If you specify an aspect ratio for the output file that differs from aspect ratio of the input file, Elastic Transcoder adds pillarboxing (black bars on the sides) or letterboxing (black bars on the top and bottom) to maintain the aspect ratio of the active region of the video.
    */
  var AspectRatio: js.UndefOr[typingsSlinky.awsSdk.elastictranscoderMod.AspectRatio] = js.native
  
  /**
    * The bit rate of the video stream in the output file, in kilobits/second. Valid values depend on the values of Level and Profile. If you specify auto, Elastic Transcoder uses the detected bit rate of the input source. If you specify a value other than auto, we recommend that you specify a value less than or equal to the maximum H.264-compliant value listed for your level and profile:  Level - Maximum video bit rate in kilobits/second (baseline and main Profile) : maximum video bit rate in kilobits/second (high Profile)    1 - 64 : 80   1b - 128 : 160   1.1 - 192 : 240   1.2 - 384 : 480   1.3 - 768 : 960   2 - 2000 : 2500   3 - 10000 : 12500   3.1 - 14000 : 17500   3.2 - 20000 : 25000   4 - 20000 : 25000   4.1 - 50000 : 62500  
    */
  var BitRate: js.UndefOr[VideoBitRate] = js.native
  
  /**
    * The video codec for the output file. Valid values include gif, H.264, mpeg2, vp8, and vp9. You can only specify vp8 and vp9 when the container type is webm, gif when the container type is gif, and mpeg2 when the container type is mpg.
    */
  var Codec: js.UndefOr[VideoCodec] = js.native
  
  /**
    *  Profile (H.264/VP8/VP9 Only)  The H.264 profile that you want to use for the output file. Elastic Transcoder supports the following profiles:    baseline: The profile most commonly used for videoconferencing and for mobile applications.    main: The profile used for standard-definition digital TV broadcasts.    high: The profile used for high-definition digital TV broadcasts and for Blu-ray discs.    Level (H.264 Only)  The H.264 level that you want to use for the output file. Elastic Transcoder supports the following levels:  1, 1b, 1.1, 1.2, 1.3, 2, 2.1, 2.2, 3, 3.1, 3.2, 4, 4.1   MaxReferenceFrames (H.264 Only)  Applicable only when the value of Video:Codec is H.264. The maximum number of previously decoded frames to use as a reference for decoding future frames. Valid values are integers 0 through 16, but we recommend that you not use a value greater than the following:  Min(Floor(Maximum decoded picture buffer in macroblocks * 256 / (Width in pixels * Height in pixels)), 16)  where Width in pixels and Height in pixels represent either MaxWidth and MaxHeight, or Resolution. Maximum decoded picture buffer in macroblocks depends on the value of the Level object. See the list below. (A macroblock is a block of pixels measuring 16x16.)    1 - 396   1b - 396   1.1 - 900   1.2 - 2376   1.3 - 2376   2 - 2376   2.1 - 4752   2.2 - 8100   3 - 8100   3.1 - 18000   3.2 - 20480   4 - 32768   4.1 - 32768    MaxBitRate (Optional, H.264/MPEG2/VP8/VP9 only)  The maximum number of bits per second in a video buffer; the size of the buffer is specified by BufferSize. Specify a value between 16 and 62,500. You can reduce the bandwidth required to stream a video by reducing the maximum bit rate, but this also reduces the quality of the video.  BufferSize (Optional, H.264/MPEG2/VP8/VP9 only)  The maximum number of bits in any x seconds of the output video. This window is commonly 10 seconds, the standard segment duration when you're using FMP4 or MPEG-TS for the container type of the output video. Specify an integer greater than 0. If you specify MaxBitRate and omit BufferSize, Elastic Transcoder sets BufferSize to 10 times the value of MaxBitRate.  InterlacedMode (Optional, H.264/MPEG2 Only)  The interlace mode for the output video. Interlaced video is used to double the perceived frame rate for a video by interlacing two fields (one field on every other line, the other field on the other lines) so that the human eye registers multiple pictures per frame. Interlacing reduces the bandwidth required for transmitting a video, but can result in blurred images and flickering. Valid values include Progressive (no interlacing, top to bottom), TopFirst (top field first), BottomFirst (bottom field first), and Auto. If InterlaceMode is not specified, Elastic Transcoder uses Progressive for the output. If Auto is specified, Elastic Transcoder interlaces the output.  ColorSpaceConversionMode (Optional, H.264/MPEG2 Only)  The color space conversion Elastic Transcoder applies to the output video. Color spaces are the algorithms used by the computer to store information about how to render color. Bt.601 is the standard for standard definition video, while Bt.709 is the standard for high definition video. Valid values include None, Bt709toBt601, Bt601toBt709, and Auto. If you chose Auto for ColorSpaceConversionMode and your output is interlaced, your frame rate is one of 23.97, 24, 25, 29.97, 50, or 60, your SegmentDuration is null, and you are using one of the resolution changes from the list below, Elastic Transcoder applies the following color space conversions:    Standard to HD, 720x480 to 1920x1080 - Elastic Transcoder applies Bt601ToBt709     Standard to HD, 720x576 to 1920x1080 - Elastic Transcoder applies Bt601ToBt709     HD to Standard, 1920x1080 to 720x480 - Elastic Transcoder applies Bt709ToBt601     HD to Standard, 1920x1080 to 720x576 - Elastic Transcoder applies Bt709ToBt601     Elastic Transcoder may change the behavior of the ColorspaceConversionMode Auto mode in the future. All outputs in a playlist must use the same ColorSpaceConversionMode.  If you do not specify a ColorSpaceConversionMode, Elastic Transcoder does not change the color space of a file. If you are unsure what ColorSpaceConversionMode was applied to your output file, you can check the AppliedColorSpaceConversion parameter included in your job response. If your job does not have an AppliedColorSpaceConversion in its response, no ColorSpaceConversionMode was applied.  ChromaSubsampling  The sampling pattern for the chroma (color) channels of the output video. Valid values include yuv420p and yuv422p.  yuv420p samples the chroma information of every other horizontal and every other vertical line, yuv422p samples the color information of every horizontal line and every other vertical line.  LoopCount (Gif Only)  The number of times you want the output gif to loop. Valid values include Infinite and integers between 0 and 100, inclusive.
    */
  var CodecOptions: js.UndefOr[typingsSlinky.awsSdk.elastictranscoderMod.CodecOptions] = js.native
  
  /**
    * The value that Elastic Transcoder adds to the metadata in the output file.
    */
  var DisplayAspectRatio: js.UndefOr[AspectRatio] = js.native
  
  /**
    * Applicable only when the value of Video:Codec is one of H.264, MPEG2, or VP8. Whether to use a fixed value for FixedGOP. Valid values are true and false:    true: Elastic Transcoder uses the value of KeyframesMaxDist for the distance between key frames (the number of frames in a group of pictures, or GOP).    false: The distance between key frames can vary.     FixedGOP must be set to true for fmp4 containers. 
    */
  var FixedGOP: js.UndefOr[typingsSlinky.awsSdk.elastictranscoderMod.FixedGOP] = js.native
  
  /**
    * The frames per second for the video stream in the output file. Valid values include:  auto, 10, 15, 23.97, 24, 25, 29.97, 30, 60  If you specify auto, Elastic Transcoder uses the detected frame rate of the input source. If you specify a frame rate, we recommend that you perform the following calculation:  Frame rate = maximum recommended decoding speed in luma samples/second / (width in pixels * height in pixels)  where:    width in pixels and height in pixels represent the Resolution of the output video.    maximum recommended decoding speed in Luma samples/second is less than or equal to the maximum value listed in the following table, based on the value that you specified for Level.   The maximum recommended decoding speed in Luma samples/second for each level is described in the following list (Level - Decoding speed):   1 - 380160   1b - 380160   1.1 - 76800   1.2 - 1536000   1.3 - 3041280   2 - 3041280   2.1 - 5068800   2.2 - 5184000   3 - 10368000   3.1 - 27648000   3.2 - 55296000   4 - 62914560   4.1 - 62914560  
    */
  var FrameRate: js.UndefOr[typingsSlinky.awsSdk.elastictranscoderMod.FrameRate] = js.native
  
  /**
    * Applicable only when the value of Video:Codec is one of H.264, MPEG2, or VP8. The maximum number of frames between key frames. Key frames are fully encoded frames; the frames between key frames are encoded based, in part, on the content of the key frames. The value is an integer formatted as a string; valid values are between 1 (every frame is a key frame) and 100000, inclusive. A higher value results in higher compression but may also discernibly decrease video quality. For Smooth outputs, the FrameRate must have a constant ratio to the KeyframesMaxDist. This allows Smooth playlists to switch between different quality levels while the file is being played. For example, an input file can have a FrameRate of 30 with a KeyframesMaxDist of 90. The output file then needs to have a ratio of 1:3. Valid outputs would have FrameRate of 30, 25, and 10, and KeyframesMaxDist of 90, 75, and 30, respectively. Alternately, this can be achieved by setting FrameRate to auto and having the same values for MaxFrameRate and KeyframesMaxDist.
    */
  var KeyframesMaxDist: js.UndefOr[typingsSlinky.awsSdk.elastictranscoderMod.KeyframesMaxDist] = js.native
  
  /**
    * If you specify auto for FrameRate, Elastic Transcoder uses the frame rate of the input video for the frame rate of the output video. Specify the maximum frame rate that you want Elastic Transcoder to use when the frame rate of the input video is greater than the desired maximum frame rate of the output video. Valid values include: 10, 15, 23.97, 24, 25, 29.97, 30, 60.
    */
  var MaxFrameRate: js.UndefOr[typingsSlinky.awsSdk.elastictranscoderMod.MaxFrameRate] = js.native
  
  /**
    * The maximum height of the output video in pixels. If you specify auto, Elastic Transcoder uses 1080 (Full HD) as the default value. If you specify a numeric value, enter an even integer between 96 and 3072.
    */
  var MaxHeight: js.UndefOr[DigitsOrAuto] = js.native
  
  /**
    *  The maximum width of the output video in pixels. If you specify auto, Elastic Transcoder uses 1920 (Full HD) as the default value. If you specify a numeric value, enter an even integer between 128 and 4096. 
    */
  var MaxWidth: js.UndefOr[DigitsOrAuto] = js.native
  
  /**
    * When you set PaddingPolicy to Pad, Elastic Transcoder may add black bars to the top and bottom and/or left and right sides of the output video to make the total size of the output video match the values that you specified for MaxWidth and MaxHeight.
    */
  var PaddingPolicy: js.UndefOr[typingsSlinky.awsSdk.elastictranscoderMod.PaddingPolicy] = js.native
  
  /**
    *  To better control resolution and aspect ratio of output videos, we recommend that you use the values MaxWidth, MaxHeight, SizingPolicy, PaddingPolicy, and DisplayAspectRatio instead of Resolution and AspectRatio. The two groups of settings are mutually exclusive. Do not use them together.  The width and height of the video in the output file, in pixels. Valid values are auto and width x height:    auto: Elastic Transcoder attempts to preserve the width and height of the input file, subject to the following rules.     width x height : The width and height of the output video in pixels.   Note the following about specifying the width and height:   The width must be an even integer between 128 and 4096, inclusive.   The height must be an even integer between 96 and 3072, inclusive.   If you specify a resolution that is less than the resolution of the input file, Elastic Transcoder rescales the output file to the lower resolution.   If you specify a resolution that is greater than the resolution of the input file, Elastic Transcoder rescales the output to the higher resolution.   We recommend that you specify a resolution for which the product of width and height is less than or equal to the applicable value in the following list (List - Max width x height value):   1 - 25344   1b - 25344   1.1 - 101376   1.2 - 101376   1.3 - 101376   2 - 101376   2.1 - 202752   2.2 - 404720   3 - 404720   3.1 - 921600   3.2 - 1310720   4 - 2097152   4.1 - 2097152    
    */
  var Resolution: js.UndefOr[typingsSlinky.awsSdk.elastictranscoderMod.Resolution] = js.native
  
  /**
    * Specify one of the following values to control scaling of the output video:    Fit: Elastic Transcoder scales the output video so it matches the value that you specified in either MaxWidth or MaxHeight without exceeding the other value.    Fill: Elastic Transcoder scales the output video so it matches the value that you specified in either MaxWidth or MaxHeight and matches or exceeds the other value. Elastic Transcoder centers the output video and then crops it in the dimension (if any) that exceeds the maximum value.    Stretch: Elastic Transcoder stretches the output video to match the values that you specified for MaxWidth and MaxHeight. If the relative proportions of the input video and the output video are different, the output video will be distorted.    Keep: Elastic Transcoder does not scale the output video. If either dimension of the input video exceeds the values that you specified for MaxWidth and MaxHeight, Elastic Transcoder crops the output video.    ShrinkToFit: Elastic Transcoder scales the output video down so that its dimensions match the values that you specified for at least one of MaxWidth and MaxHeight without exceeding either value. If you specify this option, Elastic Transcoder does not scale the video up.    ShrinkToFill: Elastic Transcoder scales the output video down so that its dimensions match the values that you specified for at least one of MaxWidth and MaxHeight without dropping below either value. If you specify this option, Elastic Transcoder does not scale the video up.  
    */
  var SizingPolicy: js.UndefOr[typingsSlinky.awsSdk.elastictranscoderMod.SizingPolicy] = js.native
  
  /**
    * Settings for the size, location, and opacity of graphics that you want Elastic Transcoder to overlay over videos that are transcoded using this preset. You can specify settings for up to four watermarks. Watermarks appear in the specified size and location, and with the specified opacity for the duration of the transcoded video. Watermarks can be in .png or .jpg format. If you want to display a watermark that is not rectangular, use the .png format, which supports transparency. When you create a job that uses this preset, you specify the .png or .jpg graphics that you want Elastic Transcoder to include in the transcoded videos. You can specify fewer graphics in the job than you specify watermark settings in the preset, which allows you to use the same preset for up to four watermarks that have different dimensions.
    */
  var Watermarks: js.UndefOr[PresetWatermarks] = js.native
}
object VideoParameters {
  
  @scala.inline
  def apply(): VideoParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoParameters]
  }
  
  @scala.inline
  implicit class VideoParametersMutableBuilder[Self <: VideoParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAspectRatio(value: AspectRatio): Self = StObject.set(x, "AspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAspectRatioUndefined: Self = StObject.set(x, "AspectRatio", js.undefined)
    
    @scala.inline
    def setBitRate(value: VideoBitRate): Self = StObject.set(x, "BitRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBitRateUndefined: Self = StObject.set(x, "BitRate", js.undefined)
    
    @scala.inline
    def setCodec(value: VideoCodec): Self = StObject.set(x, "Codec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodecOptions(value: CodecOptions): Self = StObject.set(x, "CodecOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodecOptionsUndefined: Self = StObject.set(x, "CodecOptions", js.undefined)
    
    @scala.inline
    def setCodecUndefined: Self = StObject.set(x, "Codec", js.undefined)
    
    @scala.inline
    def setDisplayAspectRatio(value: AspectRatio): Self = StObject.set(x, "DisplayAspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayAspectRatioUndefined: Self = StObject.set(x, "DisplayAspectRatio", js.undefined)
    
    @scala.inline
    def setFixedGOP(value: FixedGOP): Self = StObject.set(x, "FixedGOP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixedGOPUndefined: Self = StObject.set(x, "FixedGOP", js.undefined)
    
    @scala.inline
    def setFrameRate(value: FrameRate): Self = StObject.set(x, "FrameRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameRateUndefined: Self = StObject.set(x, "FrameRate", js.undefined)
    
    @scala.inline
    def setKeyframesMaxDist(value: KeyframesMaxDist): Self = StObject.set(x, "KeyframesMaxDist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyframesMaxDistUndefined: Self = StObject.set(x, "KeyframesMaxDist", js.undefined)
    
    @scala.inline
    def setMaxFrameRate(value: MaxFrameRate): Self = StObject.set(x, "MaxFrameRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxFrameRateUndefined: Self = StObject.set(x, "MaxFrameRate", js.undefined)
    
    @scala.inline
    def setMaxHeight(value: DigitsOrAuto): Self = StObject.set(x, "MaxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxHeightUndefined: Self = StObject.set(x, "MaxHeight", js.undefined)
    
    @scala.inline
    def setMaxWidth(value: DigitsOrAuto): Self = StObject.set(x, "MaxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxWidthUndefined: Self = StObject.set(x, "MaxWidth", js.undefined)
    
    @scala.inline
    def setPaddingPolicy(value: PaddingPolicy): Self = StObject.set(x, "PaddingPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingPolicyUndefined: Self = StObject.set(x, "PaddingPolicy", js.undefined)
    
    @scala.inline
    def setResolution(value: Resolution): Self = StObject.set(x, "Resolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolutionUndefined: Self = StObject.set(x, "Resolution", js.undefined)
    
    @scala.inline
    def setSizingPolicy(value: SizingPolicy): Self = StObject.set(x, "SizingPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizingPolicyUndefined: Self = StObject.set(x, "SizingPolicy", js.undefined)
    
    @scala.inline
    def setWatermarks(value: PresetWatermarks): Self = StObject.set(x, "Watermarks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWatermarksUndefined: Self = StObject.set(x, "Watermarks", js.undefined)
    
    @scala.inline
    def setWatermarksVarargs(value: PresetWatermark*): Self = StObject.set(x, "Watermarks", js.Array(value :_*))
  }
}
