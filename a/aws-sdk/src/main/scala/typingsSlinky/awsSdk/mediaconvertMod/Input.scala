package typingsSlinky.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Input extends js.Object {
  /**
    * Specifies set of audio selectors within an input to combine. An input may have multiple audio selector groups. See "Audio Selector Group":#inputs-audio_selector_group for more information.
    */
  var AudioSelectorGroups: js.UndefOr[mapOfAudioSelectorGroup] = js.native
  /**
    * Use Audio selectors (AudioSelectors) to specify a track or set of tracks from the input that you will use in your outputs. You can use mutiple Audio selectors per input.
    */
  var AudioSelectors: js.UndefOr[mapOfAudioSelector] = js.native
  /**
    * Use Captions selectors (CaptionSelectors) to specify the captions data from the input that you will use in your outputs. You can use mutiple captions selectors per input.
    */
  var CaptionSelectors: js.UndefOr[mapOfCaptionSelector] = js.native
  /**
    * Use Cropping selection (crop) to specify the video area that the service will include in the output video frame. If you specify a value here, it will override any value that you specify in the output setting Cropping selection (crop).
    */
  var Crop: js.UndefOr[Rectangle] = js.native
  /**
    * Enable Deblock (InputDeblockFilter) to produce smoother motion in the output. Default is disabled. Only manaully controllable for MPEG2 and uncompressed video inputs.
    */
  var DeblockFilter: js.UndefOr[InputDeblockFilter] = js.native
  /**
    * Settings for decrypting any input files that you encrypt before you upload them to Amazon S3. MediaConvert can decrypt files only when you use AWS Key Management Service (KMS) to encrypt the data key that you use to encrypt your content.
    */
  var DecryptionSettings: js.UndefOr[InputDecryptionSettings] = js.native
  /**
    * Enable Denoise (InputDenoiseFilter) to filter noise from the input.  Default is disabled. Only applicable to MPEG2, H.264, H.265, and uncompressed video inputs.
    */
  var DenoiseFilter: js.UndefOr[InputDenoiseFilter] = js.native
  /**
    * Specify the source file for your transcoding job. You can use multiple inputs in a single job. The service concatenates these inputs, in the order that you specify them in the job, to create the outputs. If your input format is IMF, specify your input by providing the path to your CPL. For example, "s3://bucket/vf/cpl.xml". If the CPL is in an incomplete IMP, make sure to use *Supplemental IMPs* (SupplementalImps) to specify any supplemental IMPs that contain assets referenced by the CPL.
    */
  var FileInput: js.UndefOr[
    stringPatternS3MM2VVMMPPEEGGMMPP3AAVVIIMMPP4FFLLVVMMPPTTMMPPGGMM4VVTTRRPPFF4VVMM2TTSSTTSS264HH264MMKKVVMMOOVVMMTTSSMM2TTWWMMVVAASSFFVVOOBB3GGPP3GGPPPPMMXXFFDDIIVVXXXXVVIIDDRRAAWWDDVVGGXXFFMM1VV3GG2VVMMFFMM3UU8WWEEBBMMLLCCHHGGXXFFMMPPEEGG2MMXXFFMMPPEEGG2MMXXFFHHDDWWAAVVYY4MMXXMMLLHttpsMM2VVMMPPEEGGMMPP3AAVVIIMMPP4FFLLVVMMPPTTMMPPGGMM4VVTTRRPPFF4VVMM2TTSSTTSS264HH264MMKKVVMMOOVVMMTTSSMM2TTWWMMVVAASSFFVVOOBB3GGPP3GGPPPPMMXXFFDDIIVVXXXXVVIIDDRRAAWWDDVVGGXXFFMM1VV3GG2VVMMFFMM3UU8WWEEBBMMLLCCHHGGXXFFM
  ] = js.native
  /**
    * Use Filter enable (InputFilterEnable) to specify how the transcoding service applies the denoise and deblock filters. You must also enable the filters separately, with Denoise (InputDenoiseFilter) and Deblock (InputDeblockFilter). * Auto - The transcoding service determines whether to apply filtering, depending on input type and quality. * Disable - The input is not filtered. This is true even if you use the API to enable them in (InputDeblockFilter) and (InputDeblockFilter). * Force - The in put is filtered regardless of input type.
    */
  var FilterEnable: js.UndefOr[InputFilterEnable] = js.native
  /**
    * Use Filter strength (FilterStrength) to adjust the magnitude the input filter settings (Deblock and Denoise). The range is -5 to 5. Default is 0.
    */
  var FilterStrength: js.UndefOr[integerMinNegative5Max5] = js.native
  /**
    * Enable the image inserter feature to include a graphic overlay on your video. Enable or disable this feature for each input individually. This setting is disabled by default.
    */
  var ImageInserter: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.ImageInserter] = js.native
  /**
    * (InputClippings) contains sets of start and end times that together specify a portion of the input to be used in the outputs. If you provide only a start time, the clip will be the entire input from that point to the end. If you provide only an end time, it will be the entire input up to that point. When you specify more than one input clip, the transcoding service creates the job outputs by stringing the clips together in the order you specify them.
    */
  var InputClippings: js.UndefOr[listOfInputClipping] = js.native
  /**
    * Use Selection placement (position) to define the video area in your output frame. The area outside of the rectangle that you specify here is black. If you specify a value here, it will override any value that you specify in the output setting Selection placement (position). If you specify a value here, this will override any AFD values in your input, even if you set Respond to AFD (RespondToAfd) to Respond (RESPOND). If you specify a value here, this will ignore anything that you specify for the setting Scaling Behavior (scalingBehavior).
    */
  var Position: js.UndefOr[Rectangle] = js.native
  /**
    * Use Program (programNumber) to select a specific program from within a multi-program transport stream. Note that Quad 4K is not currently supported. Default is the first program within the transport stream. If the program you specify doesn't exist, the transcoding service will use this default.
    */
  var ProgramNumber: js.UndefOr[integerMin1Max2147483647] = js.native
  /**
    * Set PSI control (InputPsiControl) for transport stream inputs to specify which data the demux process to scans. * Ignore PSI - Scan all PIDs for audio and video. * Use PSI - Scan only PSI data.
    */
  var PsiControl: js.UndefOr[InputPsiControl] = js.native
  /**
    * Provide a list of any necessary supplemental IMPs. You need supplemental IMPs if the CPL that you're using for your input is in an incomplete IMP. Specify either the supplemental IMP directories with a trailing slash or the ASSETMAP.xml files. For example ["s3://bucket/ov/", "s3://bucket/vf2/ASSETMAP.xml"]. You don't need to specify the IMP that contains your input CPL, because the service automatically detects it.
    */
  var SupplementalImps: js.UndefOr[listOfStringPatternS3ASSETMAPXml] = js.native
  /**
    * Use this Timecode source setting, located under the input settings (InputTimecodeSource), to specify how the service counts input video frames. This input frame count affects only the behavior of features that apply to a single input at a time, such as input clipping and synchronizing some captions formats. Choose Embedded (EMBEDDED) to use the timecodes in your input video. Choose Start at zero (ZEROBASED) to start the first frame at zero. Choose Specified start (SPECIFIEDSTART) to start the first frame at the timecode that you specify in the setting Start timecode (timecodeStart). If you don't specify a value for Timecode source, the service will use Embedded by default. For more information about timecodes, see https://docs.aws.amazon.com/console/mediaconvert/timecode.
    */
  var TimecodeSource: js.UndefOr[InputTimecodeSource] = js.native
  /**
    * Specify the timecode that you want the service to use for this input's initial frame. To use this setting, you must set the Timecode source setting, located under the input settings (InputTimecodeSource), to Specified start (SPECIFIEDSTART). For more information about timecodes, see https://docs.aws.amazon.com/console/mediaconvert/timecode.
    */
  var TimecodeStart: js.UndefOr[stringMin11Max11Pattern01D20305D205D] = js.native
  /**
    * Selector for video.
    */
  var VideoSelector: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.VideoSelector] = js.native
}

object Input {
  @scala.inline
  def apply(): Input = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Input]
  }
  @scala.inline
  implicit class InputOps[Self <: Input] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAudioSelectorGroups(value: mapOfAudioSelectorGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AudioSelectorGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudioSelectorGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AudioSelectorGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withAudioSelectors(value: mapOfAudioSelector): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AudioSelectors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudioSelectors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AudioSelectors")(js.undefined)
        ret
    }
    @scala.inline
    def withCaptionSelectors(value: mapOfCaptionSelector): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CaptionSelectors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaptionSelectors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CaptionSelectors")(js.undefined)
        ret
    }
    @scala.inline
    def withCrop(value: Rectangle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Crop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Crop")(js.undefined)
        ret
    }
    @scala.inline
    def withDeblockFilter(value: InputDeblockFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeblockFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeblockFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeblockFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withDecryptionSettings(value: InputDecryptionSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DecryptionSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecryptionSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DecryptionSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withDenoiseFilter(value: InputDenoiseFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DenoiseFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDenoiseFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DenoiseFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withFileInput(
      value: stringPatternS3MM2VVMMPPEEGGMMPP3AAVVIIMMPP4FFLLVVMMPPTTMMPPGGMM4VVTTRRPPFF4VVMM2TTSSTTSS264HH264MMKKVVMMOOVVMMTTSSMM2TTWWMMVVAASSFFVVOOBB3GGPP3GGPPPPMMXXFFDDIIVVXXXXVVIIDDRRAAWWDDVVGGXXFFMM1VV3GG2VVMMFFMM3UU8WWEEBBMMLLCCHHGGXXFFMMPPEEGG2MMXXFFMMPPEEGG2MMXXFFHHDDWWAAVVYY4MMXXMMLLHttpsMM2VVMMPPEEGGMMPP3AAVVIIMMPP4FFLLVVMMPPTTMMPPGGMM4VVTTRRPPFF4VVMM2TTSSTTSS264HH264MMKKVVMMOOVVMMTTSSMM2TTWWMMVVAASSFFVVOOBB3GGPP3GGPPPPMMXXFFDDIIVVXXXXVVIIDDRRAAWWDDVVGGXXFFMM1VV3GG2VVMMFFMM3UU8WWEEBBMMLLCCHHGGXXFFM
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileInput")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterEnable(value: InputFilterEnable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FilterEnable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterEnable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FilterEnable")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterStrength(value: integerMinNegative5Max5): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FilterStrength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterStrength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FilterStrength")(js.undefined)
        ret
    }
    @scala.inline
    def withImageInserter(value: ImageInserter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImageInserter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageInserter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImageInserter")(js.undefined)
        ret
    }
    @scala.inline
    def withInputClippings(value: listOfInputClipping): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputClippings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputClippings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputClippings")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: Rectangle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Position")(js.undefined)
        ret
    }
    @scala.inline
    def withProgramNumber(value: integerMin1Max2147483647): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProgramNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgramNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProgramNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withPsiControl(value: InputPsiControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PsiControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPsiControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PsiControl")(js.undefined)
        ret
    }
    @scala.inline
    def withSupplementalImps(value: listOfStringPatternS3ASSETMAPXml): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupplementalImps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupplementalImps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupplementalImps")(js.undefined)
        ret
    }
    @scala.inline
    def withTimecodeSource(value: InputTimecodeSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimecodeSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimecodeSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimecodeSource")(js.undefined)
        ret
    }
    @scala.inline
    def withTimecodeStart(value: stringMin11Max11Pattern01D20305D205D): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimecodeStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimecodeStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimecodeStart")(js.undefined)
        ret
    }
    @scala.inline
    def withVideoSelector(value: VideoSelector): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VideoSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideoSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VideoSelector")(js.undefined)
        ret
    }
  }
  
}

