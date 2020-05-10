package typingsSlinky.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait M3u8Settings extends js.Object {
  /**
    * The number of audio frames to insert for each PES packet.
    */
  var AudioFramesPerPes: js.UndefOr[integerMin0Max2147483647] = js.native
  /**
    * Packet Identifier (PID) of the elementary audio stream(s) in the transport stream. Multiple values are accepted, and can be entered in ranges and/or by comma separation.
    */
  var AudioPids: js.UndefOr[listOfIntegerMin32Max8182] = js.native
  /**
    * If INSERT, Nielsen inaudible tones for media tracking will be detected in the input audio and an equivalent ID3 tag will be inserted in the output.
    */
  var NielsenId3: js.UndefOr[M3u8NielsenId3] = js.native
  /**
    * The number of milliseconds between instances of this table in the output transport stream.
    */
  var PatInterval: js.UndefOr[integerMin0Max1000] = js.native
  /**
    * When set to PCR_EVERY_PES_PACKET a Program Clock Reference value is inserted for every Packetized Elementary Stream (PES) header. This parameter is effective only when the PCR PID is the same as the video or audio elementary stream.
    */
  var PcrControl: js.UndefOr[M3u8PcrControl] = js.native
  /**
    * Packet Identifier (PID) of the Program Clock Reference (PCR) in the transport stream. When no value is given, the encoder will assign the same value as the Video PID.
    */
  var PcrPid: js.UndefOr[integerMin32Max8182] = js.native
  /**
    * The number of milliseconds between instances of this table in the output transport stream.
    */
  var PmtInterval: js.UndefOr[integerMin0Max1000] = js.native
  /**
    * Packet Identifier (PID) for the Program Map Table (PMT) in the transport stream.
    */
  var PmtPid: js.UndefOr[integerMin32Max8182] = js.native
  /**
    * Packet Identifier (PID) of the private metadata stream in the transport stream.
    */
  var PrivateMetadataPid: js.UndefOr[integerMin32Max8182] = js.native
  /**
    * The value of the program number field in the Program Map Table.
    */
  var ProgramNumber: js.UndefOr[integerMin0Max65535] = js.native
  /**
    * Packet Identifier (PID) of the SCTE-35 stream in the transport stream.
    */
  var Scte35Pid: js.UndefOr[integerMin32Max8182] = js.native
  /**
    * For SCTE-35 markers from your input-- Choose Passthrough (PASSTHROUGH) if you want SCTE-35 markers that appear in your input to also appear in this output. Choose None (NONE) if you don't want SCTE-35 markers in this output. For SCTE-35 markers from an ESAM XML document-- Choose None (NONE) if you don't want manifest conditioning. Choose Passthrough (PASSTHROUGH) and choose Ad markers (adMarkers) if you do want manifest conditioning. In both cases, also provide the ESAM XML as a string in the setting Signal processing notification XML (sccXml).
    */
  var Scte35Source: js.UndefOr[M3u8Scte35Source] = js.native
  /**
    * Applies only to HLS outputs. Use this setting to specify whether the service inserts the ID3 timed metadata from the input in this output.
    */
  var TimedMetadata: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.TimedMetadata] = js.native
  /**
    * Packet Identifier (PID) of the timed metadata stream in the transport stream.
    */
  var TimedMetadataPid: js.UndefOr[integerMin32Max8182] = js.native
  /**
    * The value of the transport stream ID field in the Program Map Table.
    */
  var TransportStreamId: js.UndefOr[integerMin0Max65535] = js.native
  /**
    * Packet Identifier (PID) of the elementary video stream in the transport stream.
    */
  var VideoPid: js.UndefOr[integerMin32Max8182] = js.native
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
    def withAudioFramesPerPes(value: integerMin0Max2147483647): Self = {
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
    def withAudioPids(value: listOfIntegerMin32Max8182): Self = {
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
    def withNielsenId3(value: M3u8NielsenId3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NielsenId3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNielsenId3: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NielsenId3")(js.undefined)
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
    def withPcrPid(value: integerMin32Max8182): Self = {
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
    def withPmtPid(value: integerMin32Max8182): Self = {
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
    def withPrivateMetadataPid(value: integerMin32Max8182): Self = {
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
    def withProgramNumber(value: integerMin0Max65535): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProgramNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgramNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProgramNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withScte35Pid(value: integerMin32Max8182): Self = {
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
    def withScte35Source(value: M3u8Scte35Source): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Scte35Source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScte35Source: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Scte35Source")(js.undefined)
        ret
    }
    @scala.inline
    def withTimedMetadata(value: TimedMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimedMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimedMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimedMetadata")(js.undefined)
        ret
    }
    @scala.inline
    def withTimedMetadataPid(value: integerMin32Max8182): Self = {
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
    def withVideoPid(value: integerMin32Max8182): Self = {
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

