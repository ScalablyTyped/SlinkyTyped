package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EncoderSettings extends js.Object {
  var AudioDescriptions: listOfAudioDescription = js.native
  /**
    * Settings for ad avail blanking.
    */
  var AvailBlanking: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.AvailBlanking] = js.native
  /**
    * Event-wide configuration settings for ad avail insertion.
    */
  var AvailConfiguration: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.AvailConfiguration] = js.native
  /**
    * Settings for blackout slate.
    */
  var BlackoutSlate: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.BlackoutSlate] = js.native
  /**
    * Settings for caption decriptions
    */
  var CaptionDescriptions: js.UndefOr[listOfCaptionDescription] = js.native
  /**
    * Configuration settings that apply to the event as a whole.
    */
  var GlobalConfiguration: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.GlobalConfiguration] = js.native
  /**
    * Nielsen configuration settings.
    */
  var NielsenConfiguration: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.NielsenConfiguration] = js.native
  var OutputGroups: listOfOutputGroup = js.native
  /**
    * Contains settings used to acquire and adjust timecode information from inputs.
    */
  var TimecodeConfig: typingsSlinky.awsSdk.medialiveMod.TimecodeConfig = js.native
  var VideoDescriptions: listOfVideoDescription = js.native
}

object EncoderSettings {
  @scala.inline
  def apply(
    AudioDescriptions: listOfAudioDescription,
    OutputGroups: listOfOutputGroup,
    TimecodeConfig: TimecodeConfig,
    VideoDescriptions: listOfVideoDescription
  ): EncoderSettings = {
    val __obj = js.Dynamic.literal(AudioDescriptions = AudioDescriptions.asInstanceOf[js.Any], OutputGroups = OutputGroups.asInstanceOf[js.Any], TimecodeConfig = TimecodeConfig.asInstanceOf[js.Any], VideoDescriptions = VideoDescriptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncoderSettings]
  }
  @scala.inline
  implicit class EncoderSettingsOps[Self <: EncoderSettings] (val x: Self) extends AnyVal {
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
    def withOutputGroups(value: listOfOutputGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimecodeConfig(value: TimecodeConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimecodeConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVideoDescriptions(value: listOfVideoDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VideoDescriptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAvailBlanking(value: AvailBlanking): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailBlanking")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailBlanking: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailBlanking")(js.undefined)
        ret
    }
    @scala.inline
    def withAvailConfiguration(value: AvailConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withBlackoutSlate(value: BlackoutSlate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BlackoutSlate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlackoutSlate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BlackoutSlate")(js.undefined)
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
    def withGlobalConfiguration(value: GlobalConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobalConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withNielsenConfiguration(value: NielsenConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NielsenConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNielsenConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NielsenConfiguration")(js.undefined)
        ret
    }
  }
  
}

