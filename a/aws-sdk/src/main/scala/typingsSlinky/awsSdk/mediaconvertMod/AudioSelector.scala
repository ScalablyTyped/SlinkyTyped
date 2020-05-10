package typingsSlinky.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AudioSelector extends js.Object {
  /**
    * Selects a specific language code from within an audio source, using the ISO 639-2 or ISO 639-3 three-letter language code
    */
  var CustomLanguageCode: js.UndefOr[stringMin3Max3PatternAZaZ3] = js.native
  /**
    * Enable this setting on one audio selector to set it as the default for the job. The service uses this default for outputs where it can't find the specified input audio. If you don't set a default, those outputs have no audio.
    */
  var DefaultSelection: js.UndefOr[AudioDefaultSelection] = js.native
  /**
    * Specifies audio data from an external file source.
    */
  var ExternalAudioFileInput: js.UndefOr[
    stringPatternS3MM2VVMMPPEEGGMMPP3AAVVIIMMPP4FFLLVVMMPPTTMMPPGGMM4VVTTRRPPFF4VVMM2TTSSTTSS264HH264MMKKVVMMOOVVMMTTSSMM2TTWWMMVVAASSFFVVOOBB3GGPP3GGPPPPMMXXFFDDIIVVXXXXVVIIDDRRAAWWDDVVGGXXFFMM1VV3GG2VVMMFFMM3UU8LLCCHHGGXXFFMMPPEEGG2MMXXFFMMPPEEGG2MMXXFFHHDDWWAAVVYY4MMAAAACCAAIIFFFFMMPP2AACC3EECC3DDTTSSEEHttpsMM2VVMMPPEEGGMMPP3AAVVIIMMPP4FFLLVVMMPPTTMMPPGGMM4VVTTRRPPFF4VVMM2TTSSTTSS264HH264MMKKVVMMOOVVMMTTSSMM2TTWWMMVVAASSFFVVOOBB3GGPP3GGPPPPMMXXFFDDIIVVXXXXVVIIDDRRAAWWDDVVGGXXFFMM1VV3GG2VVMMFFMM3U
  ] = js.native
  /**
    * Selects a specific language code from within an audio source.
    */
  var LanguageCode: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.LanguageCode] = js.native
  /**
    * Specifies a time delta in milliseconds to offset the audio from the input video.
    */
  var Offset: js.UndefOr[integerMinNegative2147483648Max2147483647] = js.native
  /**
    * Selects a specific PID from within an audio source (e.g. 257 selects PID 0x101).
    */
  var Pids: js.UndefOr[listOfIntegerMin1Max2147483647] = js.native
  /**
    * Use this setting for input streams that contain Dolby E, to have the service extract specific program data from the track. To select multiple programs, create multiple selectors with the same Track and different Program numbers. In the console, this setting is visible when you set Selector type to Track. Choose the program number from the dropdown list. If you are sending a JSON file, provide the program ID, which is part of the audio metadata. If your input file has incorrect metadata, you can choose All channels instead of a program number to have the service ignore the program IDs and include all the programs in the track.
    */
  var ProgramSelection: js.UndefOr[integerMin0Max8] = js.native
  /**
    * Use these settings to reorder the audio channels of one input to match those of another input. This allows you to combine the two files into a single output, one after the other.
    */
  var RemixSettings: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.RemixSettings] = js.native
  /**
    * Specifies the type of the audio selector.
    */
  var SelectorType: js.UndefOr[AudioSelectorType] = js.native
  /**
    * Identify a track from the input audio to include in this selector by entering the track index number. To include several tracks in a single audio selector, specify multiple tracks as follows. Using the console, enter a comma-separated list. For examle, type "1,2,3" to include tracks 1 through 3. Specifying directly in your JSON job file, provide the track numbers in an array. For example, "tracks": [1,2,3].
    */
  var Tracks: js.UndefOr[listOfIntegerMin1Max2147483647] = js.native
}

object AudioSelector {
  @scala.inline
  def apply(): AudioSelector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AudioSelector]
  }
  @scala.inline
  implicit class AudioSelectorOps[Self <: AudioSelector] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomLanguageCode(value: stringMin3Max3PatternAZaZ3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomLanguageCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomLanguageCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomLanguageCode")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultSelection(value: AudioDefaultSelection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withExternalAudioFileInput(
      value: stringPatternS3MM2VVMMPPEEGGMMPP3AAVVIIMMPP4FFLLVVMMPPTTMMPPGGMM4VVTTRRPPFF4VVMM2TTSSTTSS264HH264MMKKVVMMOOVVMMTTSSMM2TTWWMMVVAASSFFVVOOBB3GGPP3GGPPPPMMXXFFDDIIVVXXXXVVIIDDRRAAWWDDVVGGXXFFMM1VV3GG2VVMMFFMM3UU8LLCCHHGGXXFFMMPPEEGG2MMXXFFMMPPEEGG2MMXXFFHHDDWWAAVVYY4MMAAAACCAAIIFFFFMMPP2AACC3EECC3DDTTSSEEHttpsMM2VVMMPPEEGGMMPP3AAVVIIMMPP4FFLLVVMMPPTTMMPPGGMM4VVTTRRPPFF4VVMM2TTSSTTSS264HH264MMKKVVMMOOVVMMTTSSMM2TTWWMMVVAASSFFVVOOBB3GGPP3GGPPPPMMXXFFDDIIVVXXXXVVIIDDRRAAWWDDVVGGXXFFMM1VV3GG2VVMMFFMM3U
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExternalAudioFileInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternalAudioFileInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExternalAudioFileInput")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguageCode(value: LanguageCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LanguageCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguageCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LanguageCode")(js.undefined)
        ret
    }
    @scala.inline
    def withOffset(value: integerMinNegative2147483648Max2147483647): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Offset")(js.undefined)
        ret
    }
    @scala.inline
    def withPids(value: listOfIntegerMin1Max2147483647): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Pids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPids: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Pids")(js.undefined)
        ret
    }
    @scala.inline
    def withProgramSelection(value: integerMin0Max8): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProgramSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgramSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProgramSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withRemixSettings(value: RemixSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemixSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemixSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemixSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectorType(value: AudioSelectorType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SelectorType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectorType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SelectorType")(js.undefined)
        ret
    }
    @scala.inline
    def withTracks(value: listOfIntegerMin1Max2147483647): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tracks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTracks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tracks")(js.undefined)
        ret
    }
  }
  
}

