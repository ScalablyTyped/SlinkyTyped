package typingsSlinky.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Output extends js.Object {
  /**
    * (AudioDescriptions) contains groups of audio encoding settings organized by audio codec. Include one instance of (AudioDescriptions) per output. (AudioDescriptions) can contain multiple groups of encoding settings.
    */
  var AudioDescriptions: js.UndefOr[listOfAudioDescription] = js.native
  /**
    * (CaptionDescriptions) contains groups of captions settings. For each output that has captions, include one instance of (CaptionDescriptions). (CaptionDescriptions) can contain multiple groups of captions settings.
    */
  var CaptionDescriptions: js.UndefOr[listOfCaptionDescription] = js.native
  /**
    * Container specific settings.
    */
  var ContainerSettings: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.ContainerSettings] = js.native
  /**
    * Use Extension (Extension) to specify the file extension for outputs in File output groups. If you do not specify a value, the service will use default extensions by container type as follows * MPEG-2 transport stream, m2ts * Quicktime, mov * MXF container, mxf * MPEG-4 container, mp4 * No Container, the service will use codec extensions (e.g. AAC, H265, H265, AC3)
    */
  var Extension: js.UndefOr[string] = js.native
  /**
    * Use Name modifier (NameModifier) to have the service add a string to the end of each output filename. You specify the base filename as part of your destination URI. When you create multiple outputs in the same output group, Name modifier (NameModifier) is required. Name modifier also accepts format identifiers. For DASH ISO outputs, if you use the format identifiers $Number$ or $Time$ in one output, you must use them in the same way in all outputs of the output group.
    */
  var NameModifier: js.UndefOr[stringMin1] = js.native
  /**
    * Specific settings for this type of output.
    */
  var OutputSettings: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.OutputSettings] = js.native
  /**
    * Use Preset (Preset) to specifiy a preset for your transcoding settings. Provide the system or custom preset name. You can specify either Preset (Preset) or Container settings (ContainerSettings), but not both.
    */
  var Preset: js.UndefOr[stringMin0] = js.native
  /**
    * (VideoDescription) contains a group of video encoding settings. The specific video settings depend on the video codec that you choose when you specify a value for Video codec (codec). Include one instance of (VideoDescription) per output.
    */
  var VideoDescription: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.VideoDescription] = js.native
}

object Output {
  @scala.inline
  def apply(): Output = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Output]
  }
  @scala.inline
  implicit class OutputOps[Self <: Output] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAudioDescriptions(value: listOfAudioDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AudioDescriptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudioDescriptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AudioDescriptions")(js.undefined)
        ret
    }
    @scala.inline
    def withCaptionDescriptions(value: listOfCaptionDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CaptionDescriptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaptionDescriptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CaptionDescriptions")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerSettings(value: ContainerSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContainerSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContainerSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withExtension(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Extension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtension: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Extension")(js.undefined)
        ret
    }
    @scala.inline
    def withNameModifier(value: stringMin1): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NameModifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNameModifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NameModifier")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputSettings(value: OutputSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withPreset(value: stringMin0): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Preset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Preset")(js.undefined)
        ret
    }
    @scala.inline
    def withVideoDescription(value: VideoDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VideoDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideoDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VideoDescription")(js.undefined)
        ret
    }
  }
  
}

