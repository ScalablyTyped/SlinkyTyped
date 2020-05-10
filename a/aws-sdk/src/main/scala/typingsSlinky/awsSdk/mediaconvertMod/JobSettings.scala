package typingsSlinky.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobSettings extends js.Object {
  /**
    * When specified, this offset (in milliseconds) is added to the input Ad Avail PTS time.
    */
  var AdAvailOffset: js.UndefOr[integerMinNegative1000Max1000] = js.native
  /**
    * Settings for ad avail blanking.  Video can be blanked or overlaid with an image, and audio muted during SCTE-35 triggered ad avails.
    */
  var AvailBlanking: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.AvailBlanking] = js.native
  /**
    * Settings for Event Signaling And Messaging (ESAM).
    */
  var Esam: js.UndefOr[EsamSettings] = js.native
  /**
    * Use Inputs (inputs) to define source file used in the transcode job. There can be multiple inputs add in a job. These inputs will be concantenated together to create the output.
    */
  var Inputs: js.UndefOr[listOfInput] = js.native
  /**
    * Overlay motion graphics on top of your video. The motion graphics that you specify here appear on all outputs in all output groups.
    */
  var MotionImageInserter: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.MotionImageInserter] = js.native
  /**
    * Settings for your Nielsen configuration. If you don't do Nielsen measurement and analytics, ignore these settings. When you enable Nielsen configuration (nielsenConfiguration), MediaConvert enables PCM to ID3 tagging for all outputs in the job. To enable Nielsen configuration programmatically, include an instance of nielsenConfiguration in your JSON job specification. Even if you don't include any children of nielsenConfiguration, you still enable the setting.
    */
  var NielsenConfiguration: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.NielsenConfiguration] = js.native
  /**
    * (OutputGroups) contains one group of settings for each set of outputs that share a common package type. All unpackaged files (MPEG-4, MPEG-2 TS, Quicktime, MXF, and no container) are grouped in a single output group as well. Required in (OutputGroups) is a group of settings that apply to the whole group. This required object depends on the value you set for (Type) under (OutputGroups)>(OutputGroupSettings). Type, settings object pairs are as follows. * FILE_GROUP_SETTINGS, FileGroupSettings * HLS_GROUP_SETTINGS, HlsGroupSettings * DASH_ISO_GROUP_SETTINGS, DashIsoGroupSettings * MS_SMOOTH_GROUP_SETTINGS, MsSmoothGroupSettings * CMAF_GROUP_SETTINGS, CmafGroupSettings
    */
  var OutputGroups: js.UndefOr[listOfOutputGroup] = js.native
  /**
    * Contains settings used to acquire and adjust timecode information from inputs.
    */
  var TimecodeConfig: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.TimecodeConfig] = js.native
  /**
    * Enable Timed metadata insertion (TimedMetadataInsertion) to include ID3 tags in your job. To include timed metadata, you must enable it here, enable it in each output container, and specify tags and timecodes in ID3 insertion (Id3Insertion) objects.
    */
  var TimedMetadataInsertion: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.TimedMetadataInsertion] = js.native
}

object JobSettings {
  @scala.inline
  def apply(): JobSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobSettings]
  }
  @scala.inline
  implicit class JobSettingsOps[Self <: JobSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdAvailOffset(value: integerMinNegative1000Max1000): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdAvailOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdAvailOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdAvailOffset")(js.undefined)
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
    def withEsam(value: EsamSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Esam")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEsam: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Esam")(js.undefined)
        ret
    }
    @scala.inline
    def withInputs(value: listOfInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Inputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Inputs")(js.undefined)
        ret
    }
    @scala.inline
    def withMotionImageInserter(value: MotionImageInserter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MotionImageInserter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMotionImageInserter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MotionImageInserter")(js.undefined)
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
    @scala.inline
    def withOutputGroups(value: listOfOutputGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withTimecodeConfig(value: TimecodeConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimecodeConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimecodeConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimecodeConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withTimedMetadataInsertion(value: TimedMetadataInsertion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimedMetadataInsertion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimedMetadataInsertion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimedMetadataInsertion")(js.undefined)
        ret
    }
  }
  
}

