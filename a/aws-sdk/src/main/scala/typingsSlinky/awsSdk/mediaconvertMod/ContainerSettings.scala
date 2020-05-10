package typingsSlinky.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContainerSettings extends js.Object {
  /**
    * Settings for MP4 segments in CMAF
    */
  var CmfcSettings: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.CmfcSettings] = js.native
  /**
    * Container for this output. Some containers require a container settings object. If not specified, the default object will be created.
    */
  var Container: js.UndefOr[ContainerType] = js.native
  /**
    * Settings for F4v container
    */
  var F4vSettings: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.F4vSettings] = js.native
  /**
    * MPEG-2 TS container settings. These apply to outputs in a File output group when the output's container (ContainerType) is MPEG-2 Transport Stream (M2TS). In these assets, data is organized by the program map table (PMT). Each transport stream program contains subsets of data, including audio, video, and metadata. Each of these subsets of data has a numerical label called a packet identifier (PID). Each transport stream program corresponds to one MediaConvert output. The PMT lists the types of data in a program along with their PID. Downstream systems and players use the program map table to look up the PID for each type of data it accesses and then uses the PIDs to locate specific data within the asset.
    */
  var M2tsSettings: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.M2tsSettings] = js.native
  /**
    * Settings for TS segments in HLS
    */
  var M3u8Settings: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.M3u8Settings] = js.native
  /**
    * Settings for MOV Container.
    */
  var MovSettings: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.MovSettings] = js.native
  /**
    * Settings for MP4 container. You can create audio-only AAC outputs with this container.
    */
  var Mp4Settings: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.Mp4Settings] = js.native
  /**
    * Settings for MP4 segments in DASH
    */
  var MpdSettings: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.MpdSettings] = js.native
}

object ContainerSettings {
  @scala.inline
  def apply(): ContainerSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerSettings]
  }
  @scala.inline
  implicit class ContainerSettingsOps[Self <: ContainerSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCmfcSettings(value: CmfcSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CmfcSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCmfcSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CmfcSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withContainer(value: ContainerType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Container")(js.undefined)
        ret
    }
    @scala.inline
    def withF4vSettings(value: F4vSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("F4vSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutF4vSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("F4vSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withM2tsSettings(value: M2tsSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("M2tsSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutM2tsSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("M2tsSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withM3u8Settings(value: M3u8Settings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("M3u8Settings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutM3u8Settings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("M3u8Settings")(js.undefined)
        ret
    }
    @scala.inline
    def withMovSettings(value: MovSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MovSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMovSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MovSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withMp4Settings(value: Mp4Settings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Mp4Settings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMp4Settings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Mp4Settings")(js.undefined)
        ret
    }
    @scala.inline
    def withMpdSettings(value: MpdSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MpdSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMpdSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MpdSettings")(js.undefined)
        ret
    }
  }
  
}

