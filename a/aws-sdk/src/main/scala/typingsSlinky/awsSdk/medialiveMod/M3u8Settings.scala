package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait M3u8Settings extends js.Object {
  /**
    * The number of audio frames to insert for each PES packet.
    */
  var AudioFramesPerPes: js.UndefOr[integerMin0] = js.native
  /**
    * Packet Identifier (PID) of the elementary audio stream(s) in the transport stream. Multiple values are accepted, and can be entered in ranges and/or by comma separation. Can be entered as decimal or hexadecimal values.
    */
  var AudioPids: js.UndefOr[string] = js.native
  /**
    * This parameter is unused and deprecated.
    */
  var EcmPid: js.UndefOr[string] = js.native
  /**
    * If set to passthrough, Nielsen inaudible tones for media tracking will be detected in the input audio and an equivalent ID3 tag will be inserted in the output.
    */
  var NielsenId3Behavior: js.UndefOr[M3u8NielsenId3Behavior] = js.native
  /**
    * The number of milliseconds between instances of this table in the output transport stream. A value of \"0\" writes out the PMT once per segment file.
    */
  var PatInterval: js.UndefOr[integerMin0Max1000] = js.native
  /**
    * When set to pcrEveryPesPacket, a Program Clock Reference value is inserted for every Packetized Elementary Stream (PES) header. This parameter is effective only when the PCR PID is the same as the video or audio elementary stream.
    */
  var PcrControl: js.UndefOr[M3u8PcrControl] = js.native
  /**
    * Maximum time in milliseconds between Program Clock References (PCRs) inserted into the transport stream.
    */
  var PcrPeriod: js.UndefOr[integerMin0Max500] = js.native
  /**
    * Packet Identifier (PID) of the Program Clock Reference (PCR) in the transport stream. When no value is given, the encoder will assign the same value as the Video PID. Can be entered as a decimal or hexadecimal value.
    */
  var PcrPid: js.UndefOr[string] = js.native
  /**
    * The number of milliseconds between instances of this table in the output transport stream. A value of \"0\" writes out the PMT once per segment file.
    */
  var PmtInterval: js.UndefOr[integerMin0Max1000] = js.native
  /**
    * Packet Identifier (PID) for the Program Map Table (PMT) in the transport stream. Can be entered as a decimal or hexadecimal value.
    */
  var PmtPid: js.UndefOr[string] = js.native
  /**
    * The value of the program number field in the Program Map Table.
    */
  var ProgramNum: js.UndefOr[integerMin0Max65535] = js.native
  /**
    * If set to passthrough, passes any SCTE-35 signals from the input source to this output.
    */
  var Scte35Behavior: js.UndefOr[M3u8Scte35Behavior] = js.native
  /**
    * Packet Identifier (PID) of the SCTE-35 stream in the transport stream. Can be entered as a decimal or hexadecimal value.
    */
  var Scte35Pid: js.UndefOr[string] = js.native
  /**
    * When set to passthrough, timed metadata is passed through from input to output.
    */
  var TimedMetadataBehavior: js.UndefOr[M3u8TimedMetadataBehavior] = js.native
  /**
    * Packet Identifier (PID) of the timed metadata stream in the transport stream. Can be entered as a decimal or hexadecimal value.  Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
    */
  var TimedMetadataPid: js.UndefOr[string] = js.native
  /**
    * The value of the transport stream ID field in the Program Map Table.
    */
  var TransportStreamId: js.UndefOr[integerMin0Max65535] = js.native
  /**
    * Packet Identifier (PID) of the elementary video stream in the transport stream. Can be entered as a decimal or hexadecimal value.
    */
  var VideoPid: js.UndefOr[string] = js.native
}

object M3u8Settings {
  @scala.inline
  def apply(): M3u8Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[M3u8Settings]
  }
  @scala.inline
  implicit class M3u8SettingsOps[Self <: M3u8Settings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAudioFramesPerPes(value: integerMin0): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AudioFramesPerPes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudioFramesPerPes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AudioFramesPerPes")(js.undefined)
        ret
    }
    @scala.inline
    def withAudioPids(value: string): Self = {
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
    def withEcmPid(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EcmPid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEcmPid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EcmPid")(js.undefined)
        ret
    }
    @scala.inline
    def withNielsenId3Behavior(value: M3u8NielsenId3Behavior): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NielsenId3Behavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNielsenId3Behavior: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NielsenId3Behavior")(js.undefined)
        ret
    }
    @scala.inline
    def withPatInterval(value: integerMin0Max1000): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PatInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPatInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PatInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withPcrControl(value: M3u8PcrControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PcrControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPcrControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PcrControl")(js.undefined)
        ret
    }
    @scala.inline
    def withPcrPeriod(value: integerMin0Max500): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PcrPeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPcrPeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PcrPeriod")(js.undefined)
        ret
    }
    @scala.inline
    def withPcrPid(value: string): Self = {
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
    def withPmtInterval(value: integerMin0Max1000): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PmtInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPmtInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PmtInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withPmtPid(value: string): Self = {
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
    def withProgramNum(value: integerMin0Max65535): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProgramNum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgramNum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProgramNum")(js.undefined)
        ret
    }
    @scala.inline
    def withScte35Behavior(value: M3u8Scte35Behavior): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Scte35Behavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScte35Behavior: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Scte35Behavior")(js.undefined)
        ret
    }
    @scala.inline
    def withScte35Pid(value: string): Self = {
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
    def withTimedMetadataBehavior(value: M3u8TimedMetadataBehavior): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimedMetadataBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimedMetadataBehavior: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimedMetadataBehavior")(js.undefined)
        ret
    }
    @scala.inline
    def withTimedMetadataPid(value: string): Self = {
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
    def withTransportStreamId(value: integerMin0Max65535): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransportStreamId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransportStreamId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransportStreamId")(js.undefined)
        ret
    }
    @scala.inline
    def withVideoPid(value: string): Self = {
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

