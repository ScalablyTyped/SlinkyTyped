package typingsSlinky.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PresetSettings extends js.Object {
  /**
    * (AudioDescriptions) contains groups of audio encoding settings organized by audio codec. Include one instance of (AudioDescriptions) per output. (AudioDescriptions) can contain multiple groups of encoding settings.
    */
  var AudioDescriptions: js.UndefOr[listOfAudioDescription] = js.native
  /**
    * Caption settings for this preset. There can be multiple caption settings in a single output.
    */
  var CaptionDescriptions: js.UndefOr[listOfCaptionDescriptionPreset] = js.native
  /**
    * Container specific settings.
    */
  var ContainerSettings: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.ContainerSettings] = js.native
  /**
    * (VideoDescription) contains a group of video encoding settings. The specific video settings depend on the video codec that you choose when you specify a value for Video codec (codec). Include one instance of (VideoDescription) per output.
    */
  var VideoDescription: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.VideoDescription] = js.native
}

object PresetSettings {
  @scala.inline
  def apply(): PresetSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PresetSettings]
  }
  @scala.inline
  implicit class PresetSettingsOps[Self <: PresetSettings] (val x: Self) extends AnyVal {
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
    def withCaptionDescriptions(value: listOfCaptionDescriptionPreset): Self = {
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

