package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiplexProgramPacketIdentifiersMap extends js.Object {
  var AudioPids: js.UndefOr[listOfInteger] = js.native
  var DvbSubPids: js.UndefOr[listOfInteger] = js.native
  var DvbTeletextPid: js.UndefOr[integer] = js.native
  var EtvPlatformPid: js.UndefOr[integer] = js.native
  var EtvSignalPid: js.UndefOr[integer] = js.native
  var KlvDataPids: js.UndefOr[listOfInteger] = js.native
  var PcrPid: js.UndefOr[integer] = js.native
  var PmtPid: js.UndefOr[integer] = js.native
  var PrivateMetadataPid: js.UndefOr[integer] = js.native
  var Scte27Pids: js.UndefOr[listOfInteger] = js.native
  var Scte35Pid: js.UndefOr[integer] = js.native
  var TimedMetadataPid: js.UndefOr[integer] = js.native
  var VideoPid: js.UndefOr[integer] = js.native
}

object MultiplexProgramPacketIdentifiersMap {
  @scala.inline
  def apply(): MultiplexProgramPacketIdentifiersMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiplexProgramPacketIdentifiersMap]
  }
  @scala.inline
  implicit class MultiplexProgramPacketIdentifiersMapOps[Self <: MultiplexProgramPacketIdentifiersMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAudioPids(value: listOfInteger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AudioPids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudioPids: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AudioPids")(js.undefined)
        ret
    }
    @scala.inline
    def withDvbSubPids(value: listOfInteger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DvbSubPids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDvbSubPids: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DvbSubPids")(js.undefined)
        ret
    }
    @scala.inline
    def withDvbTeletextPid(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DvbTeletextPid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDvbTeletextPid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DvbTeletextPid")(js.undefined)
        ret
    }
    @scala.inline
    def withEtvPlatformPid(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EtvPlatformPid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEtvPlatformPid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EtvPlatformPid")(js.undefined)
        ret
    }
    @scala.inline
    def withEtvSignalPid(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EtvSignalPid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEtvSignalPid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EtvSignalPid")(js.undefined)
        ret
    }
    @scala.inline
    def withKlvDataPids(value: listOfInteger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KlvDataPids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKlvDataPids: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KlvDataPids")(js.undefined)
        ret
    }
    @scala.inline
    def withPcrPid(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PcrPid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPcrPid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PcrPid")(js.undefined)
        ret
    }
    @scala.inline
    def withPmtPid(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PmtPid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPmtPid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PmtPid")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivateMetadataPid(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrivateMetadataPid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivateMetadataPid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrivateMetadataPid")(js.undefined)
        ret
    }
    @scala.inline
    def withScte27Pids(value: listOfInteger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Scte27Pids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScte27Pids: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Scte27Pids")(js.undefined)
        ret
    }
    @scala.inline
    def withScte35Pid(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Scte35Pid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScte35Pid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Scte35Pid")(js.undefined)
        ret
    }
    @scala.inline
    def withTimedMetadataPid(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimedMetadataPid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimedMetadataPid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimedMetadataPid")(js.undefined)
        ret
    }
    @scala.inline
    def withVideoPid(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VideoPid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideoPid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VideoPid")(js.undefined)
        ret
    }
  }
  
}

