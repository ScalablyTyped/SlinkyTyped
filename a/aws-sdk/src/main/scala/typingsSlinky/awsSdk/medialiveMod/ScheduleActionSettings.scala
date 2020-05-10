package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScheduleActionSettings extends js.Object {
  /**
    * Action to insert HLS ID3 segment tagging
    */
  var HlsId3SegmentTaggingSettings: js.UndefOr[HlsId3SegmentTaggingScheduleActionSettings] = js.native
  /**
    * Action to insert HLS metadata
    */
  var HlsTimedMetadataSettings: js.UndefOr[HlsTimedMetadataScheduleActionSettings] = js.native
  /**
    * Action to switch the input
    */
  var InputSwitchSettings: js.UndefOr[InputSwitchScheduleActionSettings] = js.native
  /**
    * Action to pause or unpause one or both channel pipelines
    */
  var PauseStateSettings: js.UndefOr[PauseStateScheduleActionSettings] = js.native
  /**
    * Action to insert SCTE-35 return_to_network message
    */
  var Scte35ReturnToNetworkSettings: js.UndefOr[Scte35ReturnToNetworkScheduleActionSettings] = js.native
  /**
    * Action to insert SCTE-35 splice_insert message
    */
  var Scte35SpliceInsertSettings: js.UndefOr[Scte35SpliceInsertScheduleActionSettings] = js.native
  /**
    * Action to insert SCTE-35 time_signal message
    */
  var Scte35TimeSignalSettings: js.UndefOr[Scte35TimeSignalScheduleActionSettings] = js.native
  /**
    * Action to activate a static image overlay
    */
  var StaticImageActivateSettings: js.UndefOr[StaticImageActivateScheduleActionSettings] = js.native
  /**
    * Action to deactivate a static image overlay
    */
  var StaticImageDeactivateSettings: js.UndefOr[StaticImageDeactivateScheduleActionSettings] = js.native
}

object ScheduleActionSettings {
  @scala.inline
  def apply(): ScheduleActionSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduleActionSettings]
  }
  @scala.inline
  implicit class ScheduleActionSettingsOps[Self <: ScheduleActionSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHlsId3SegmentTaggingSettings(value: HlsId3SegmentTaggingScheduleActionSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HlsId3SegmentTaggingSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHlsId3SegmentTaggingSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HlsId3SegmentTaggingSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withHlsTimedMetadataSettings(value: HlsTimedMetadataScheduleActionSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HlsTimedMetadataSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHlsTimedMetadataSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HlsTimedMetadataSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withInputSwitchSettings(value: InputSwitchScheduleActionSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputSwitchSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputSwitchSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputSwitchSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withPauseStateSettings(value: PauseStateScheduleActionSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PauseStateSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPauseStateSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PauseStateSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withScte35ReturnToNetworkSettings(value: Scte35ReturnToNetworkScheduleActionSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Scte35ReturnToNetworkSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScte35ReturnToNetworkSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Scte35ReturnToNetworkSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withScte35SpliceInsertSettings(value: Scte35SpliceInsertScheduleActionSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Scte35SpliceInsertSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScte35SpliceInsertSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Scte35SpliceInsertSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withScte35TimeSignalSettings(value: Scte35TimeSignalScheduleActionSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Scte35TimeSignalSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScte35TimeSignalSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Scte35TimeSignalSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withStaticImageActivateSettings(value: StaticImageActivateScheduleActionSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StaticImageActivateSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStaticImageActivateSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StaticImageActivateSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withStaticImageDeactivateSettings(value: StaticImageDeactivateScheduleActionSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StaticImageDeactivateSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStaticImageDeactivateSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StaticImageDeactivateSettings")(js.undefined)
        ret
    }
  }
  
}

