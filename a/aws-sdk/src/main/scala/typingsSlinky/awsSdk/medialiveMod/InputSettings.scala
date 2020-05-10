package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputSettings extends js.Object {
  /**
    * Used to select the audio stream to decode for inputs that have multiple available.
    */
  var AudioSelectors: js.UndefOr[listOfAudioSelector] = js.native
  /**
    * Used to select the caption input to use for inputs that have multiple available.
    */
  var CaptionSelectors: js.UndefOr[listOfCaptionSelector] = js.native
  /**
    * Enable or disable the deblock filter when filtering.
    */
  var DeblockFilter: js.UndefOr[InputDeblockFilter] = js.native
  /**
    * Enable or disable the denoise filter when filtering.
    */
  var DenoiseFilter: js.UndefOr[InputDenoiseFilter] = js.native
  /**
    * Adjusts the magnitude of filtering from 1 (minimal) to 5 (strongest).
    */
  var FilterStrength: js.UndefOr[integerMin1Max5] = js.native
  /**
    * Turns on the filter for this input. MPEG-2 inputs have the deblocking filter enabled by default.
  1) auto - filtering will be applied depending on input type/quality
  2) disabled - no filtering will be applied to the input
  3) forced - filtering will be applied regardless of input type
    */
  var InputFilter: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.InputFilter] = js.native
  /**
    * Input settings.
    */
  var NetworkInputSettings: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.NetworkInputSettings] = js.native
  /**
    * Loop input if it is a file. This allows a file input to be streamed indefinitely.
    */
  var SourceEndBehavior: js.UndefOr[InputSourceEndBehavior] = js.native
  /**
    * Informs which video elementary stream to decode for input types that have multiple available.
    */
  var VideoSelector: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.VideoSelector] = js.native
}

object InputSettings {
  @scala.inline
  def apply(): InputSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputSettings]
  }
  @scala.inline
  implicit class InputSettingsOps[Self <: InputSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAudioSelectors(value: listOfAudioSelector): Self = {
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
    def withCaptionSelectors(value: listOfCaptionSelector): Self = {
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
    def withFilterStrength(value: integerMin1Max5): Self = {
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
    def withInputFilter(value: InputFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkInputSettings(value: NetworkInputSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkInputSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkInputSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkInputSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceEndBehavior(value: InputSourceEndBehavior): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceEndBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceEndBehavior: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceEndBehavior")(js.undefined)
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

