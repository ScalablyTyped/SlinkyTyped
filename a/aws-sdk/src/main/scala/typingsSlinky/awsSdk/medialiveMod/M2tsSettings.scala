package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait M2tsSettings extends js.Object {
  /**
    * When set to drop, output audio streams will be removed from the program if the selected input audio stream is removed from the input. This allows the output audio configuration to dynamically change based on input configuration. If this is set to encodeSilence, all output audio streams will output encoded silence when not connected to an active input stream.
    */
  var AbsentInputAudioBehavior: js.UndefOr[M2tsAbsentInputAudioBehavior] = js.native
  /**
    * When set to enabled, uses ARIB-compliant field muxing and removes video descriptor.
    */
  var Arib: js.UndefOr[M2tsArib] = js.native
  /**
    * Packet Identifier (PID) for ARIB Captions in the transport stream. Can be entered as a decimal or hexadecimal value.  Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
    */
  var AribCaptionsPid: js.UndefOr[string] = js.native
  /**
    * If set to auto, pid number used for ARIB Captions will be auto-selected from unused pids.  If set to useConfigured, ARIB Captions will be on the configured pid number.
    */
  var AribCaptionsPidControl: js.UndefOr[M2tsAribCaptionsPidControl] = js.native
  /**
    * When set to dvb, uses DVB buffer model for Dolby Digital audio.  When set to atsc, the ATSC model is used.
    */
  var AudioBufferModel: js.UndefOr[M2tsAudioBufferModel] = js.native
  /**
    * The number of audio frames to insert for each PES packet.
    */
  var AudioFramesPerPes: js.UndefOr[integerMin0] = js.native
  /**
    * Packet Identifier (PID) of the elementary audio stream(s) in the transport stream. Multiple values are accepted, and can be entered in ranges and/or by comma separation. Can be entered as decimal or hexadecimal values. Each PID specified must be in the range of 32 (or 0x20)..8182 (or 0x1ff6).
    */
  var AudioPids: js.UndefOr[string] = js.native
  /**
    * When set to atsc, uses stream type = 0x81 for AC3 and stream type = 0x87 for EAC3. When set to dvb, uses stream type = 0x06.
    */
  var AudioStreamType: js.UndefOr[M2tsAudioStreamType] = js.native
  /**
    * The output bitrate of the transport stream in bits per second. Setting to 0 lets the muxer automatically determine the appropriate bitrate.
    */
  var Bitrate: js.UndefOr[integerMin0] = js.native
  /**
    * If set to multiplex, use multiplex buffer model for accurate interleaving.  Setting to bufferModel to none can lead to lower latency, but low-memory devices may not be able to play back the stream without interruptions.
    */
  var BufferModel: js.UndefOr[M2tsBufferModel] = js.native
  /**
    * When set to enabled, generates captionServiceDescriptor in PMT.
    */
  var CcDescriptor: js.UndefOr[M2tsCcDescriptor] = js.native
  /**
    * Inserts DVB Network Information Table (NIT) at the specified table repetition interval.
    */
  var DvbNitSettings: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.DvbNitSettings] = js.native
  /**
    * Inserts DVB Service Description Table (SDT) at the specified table repetition interval.
    */
  var DvbSdtSettings: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.DvbSdtSettings] = js.native
  /**
    * Packet Identifier (PID) for input source DVB Subtitle data to this output. Multiple values are accepted, and can be entered in ranges and/or by comma separation. Can be entered as decimal or hexadecimal values.  Each PID specified must be in the range of 32 (or 0x20)..8182 (or 0x1ff6).
    */
  var DvbSubPids: js.UndefOr[string] = js.native
  /**
    * Inserts DVB Time and Date Table (TDT) at the specified table repetition interval.
    */
  var DvbTdtSettings: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.DvbTdtSettings] = js.native
  /**
    * Packet Identifier (PID) for input source DVB Teletext data to this output. Can be entered as a decimal or hexadecimal value.  Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
    */
  var DvbTeletextPid: js.UndefOr[string] = js.native
  /**
    * If set to passthrough, passes any EBIF data from the input source to this output.
    */
  var Ebif: js.UndefOr[M2tsEbifControl] = js.native
  /**
    * When videoAndFixedIntervals is selected, audio EBP markers will be added to partitions 3 and 4. The interval between these additional markers will be fixed, and will be slightly shorter than the video EBP marker interval. Only available when EBP Cablelabs segmentation markers are selected.  Partitions 1 and 2 will always follow the video interval.
    */
  var EbpAudioInterval: js.UndefOr[M2tsAudioInterval] = js.native
  /**
    * When set, enforces that Encoder Boundary Points do not come within the specified time interval of each other by looking ahead at input video. If another EBP is going to come in within the specified time interval, the current EBP is not emitted, and the segment is "stretched" to the next marker.  The lookahead value does not add latency to the system. The Live Event must be configured elsewhere to create sufficient latency to make the lookahead accurate.
    */
  var EbpLookaheadMs: js.UndefOr[integerMin0Max10000] = js.native
  /**
    * Controls placement of EBP on Audio PIDs. If set to videoAndAudioPids, EBP markers will be placed on the video PID and all audio PIDs.  If set to videoPid, EBP markers will be placed on only the video PID.
    */
  var EbpPlacement: js.UndefOr[M2tsEbpPlacement] = js.native
  /**
    * This field is unused and deprecated.
    */
  var EcmPid: js.UndefOr[string] = js.native
  /**
    * Include or exclude the ES Rate field in the PES header.
    */
  var EsRateInPes: js.UndefOr[M2tsEsRateInPes] = js.native
  /**
    * Packet Identifier (PID) for input source ETV Platform data to this output. Can be entered as a decimal or hexadecimal value.  Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
    */
  var EtvPlatformPid: js.UndefOr[string] = js.native
  /**
    * Packet Identifier (PID) for input source ETV Signal data to this output. Can be entered as a decimal or hexadecimal value.  Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
    */
  var EtvSignalPid: js.UndefOr[string] = js.native
  /**
    * The length in seconds of each fragment. Only used with EBP markers.
    */
  var FragmentTime: js.UndefOr[doubleMin0] = js.native
  /**
    * If set to passthrough, passes any KLV data from the input source to this output.
    */
  var Klv: js.UndefOr[M2tsKlv] = js.native
  /**
    * Packet Identifier (PID) for input source KLV data to this output. Multiple values are accepted, and can be entered in ranges and/or by comma separation. Can be entered as decimal or hexadecimal values.  Each PID specified must be in the range of 32 (or 0x20)..8182 (or 0x1ff6).
    */
  var KlvDataPids: js.UndefOr[string] = js.native
  /**
    * If set to passthrough, Nielsen inaudible tones for media tracking will be detected in the input audio and an equivalent ID3 tag will be inserted in the output.
    */
  var NielsenId3Behavior: js.UndefOr[M2tsNielsenId3Behavior] = js.native
  /**
    * Value in bits per second of extra null packets to insert into the transport stream. This can be used if a downstream encryption system requires periodic null packets.
    */
  var NullPacketBitrate: js.UndefOr[doubleMin0] = js.native
  /**
    * The number of milliseconds between instances of this table in the output transport stream.  Valid values are 0, 10..1000.
    */
  var PatInterval: js.UndefOr[integerMin0Max1000] = js.native
  /**
    * When set to pcrEveryPesPacket, a Program Clock Reference value is inserted for every Packetized Elementary Stream (PES) header. This parameter is effective only when the PCR PID is the same as the video or audio elementary stream.
    */
  var PcrControl: js.UndefOr[M2tsPcrControl] = js.native
  /**
    * Maximum time in milliseconds between Program Clock Reference (PCRs) inserted into the transport stream.
    */
  var PcrPeriod: js.UndefOr[integerMin0Max500] = js.native
  /**
    * Packet Identifier (PID) of the Program Clock Reference (PCR) in the transport stream. When no value is given, the encoder will assign the same value as the Video PID. Can be entered as a decimal or hexadecimal value.  Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
    */
  var PcrPid: js.UndefOr[string] = js.native
  /**
    * The number of milliseconds between instances of this table in the output transport stream. Valid values are 0, 10..1000.
    */
  var PmtInterval: js.UndefOr[integerMin0Max1000] = js.native
  /**
    * Packet Identifier (PID) for the Program Map Table (PMT) in the transport stream. Can be entered as a decimal or hexadecimal value. Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
    */
  var PmtPid: js.UndefOr[string] = js.native
  /**
    * The value of the program number field in the Program Map Table.
    */
  var ProgramNum: js.UndefOr[integerMin0Max65535] = js.native
  /**
    * When vbr, does not insert null packets into transport stream to fill specified bitrate. The bitrate setting acts as the maximum bitrate when vbr is set.
    */
  var RateMode: js.UndefOr[M2tsRateMode] = js.native
  /**
    * Packet Identifier (PID) for input source SCTE-27 data to this output. Multiple values are accepted, and can be entered in ranges and/or by comma separation. Can be entered as decimal or hexadecimal values.  Each PID specified must be in the range of 32 (or 0x20)..8182 (or 0x1ff6).
    */
  var Scte27Pids: js.UndefOr[string] = js.native
  /**
    * Optionally pass SCTE-35 signals from the input source to this output.
    */
  var Scte35Control: js.UndefOr[M2tsScte35Control] = js.native
  /**
    * Packet Identifier (PID) of the SCTE-35 stream in the transport stream. Can be entered as a decimal or hexadecimal value.  Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
    */
  var Scte35Pid: js.UndefOr[string] = js.native
  /**
    * Inserts segmentation markers at each segmentationTime period. raiSegstart sets the Random Access Indicator bit in the adaptation field. raiAdapt sets the RAI bit and adds the current timecode in the private data bytes. psiSegstart inserts PAT and PMT tables at the start of segments. ebp adds Encoder Boundary Point information to the adaptation field as per OpenCable specification OC-SP-EBP-I01-130118. ebpLegacy adds Encoder Boundary Point information to the adaptation field using a legacy proprietary format.
    */
  var SegmentationMarkers: js.UndefOr[M2tsSegmentationMarkers] = js.native
  /**
    * The segmentation style parameter controls how segmentation markers are inserted into the transport stream. With avails, it is possible that segments may be truncated, which can influence where future segmentation markers are inserted.
  When a segmentation style of "resetCadence" is selected and a segment is truncated due to an avail, we will reset the segmentation cadence. This means the subsequent segment will have a duration of $segmentationTime seconds.
  When a segmentation style of "maintainCadence" is selected and a segment is truncated due to an avail, we will not reset the segmentation cadence. This means the subsequent segment will likely be truncated as well. However, all segments after that will have a duration of $segmentationTime seconds. Note that EBP lookahead is a slight exception to this rule.
    */
  var SegmentationStyle: js.UndefOr[M2tsSegmentationStyle] = js.native
  /**
    * The length in seconds of each segment. Required unless markers is set to None_.
    */
  var SegmentationTime: js.UndefOr[doubleMin1] = js.native
  /**
    * When set to passthrough, timed metadata will be passed through from input to output.
    */
  var TimedMetadataBehavior: js.UndefOr[M2tsTimedMetadataBehavior] = js.native
  /**
    * Packet Identifier (PID) of the timed metadata stream in the transport stream. Can be entered as a decimal or hexadecimal value.  Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
    */
  var TimedMetadataPid: js.UndefOr[string] = js.native
  /**
    * The value of the transport stream ID field in the Program Map Table.
    */
  var TransportStreamId: js.UndefOr[integerMin0Max65535] = js.native
  /**
    * Packet Identifier (PID) of the elementary video stream in the transport stream. Can be entered as a decimal or hexadecimal value.  Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
    */
  var VideoPid: js.UndefOr[string] = js.native
}

object M2tsSettings {
  @scala.inline
  def apply(): M2tsSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[M2tsSettings]
  }
  @scala.inline
  implicit class M2tsSettingsOps[Self <: M2tsSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbsentInputAudioBehavior(value: M2tsAbsentInputAudioBehavior): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AbsentInputAudioBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbsentInputAudioBehavior: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AbsentInputAudioBehavior")(js.undefined)
        ret
    }
    @scala.inline
    def withArib(value: M2tsArib): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arib")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArib: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arib")(js.undefined)
        ret
    }
    @scala.inline
    def withAribCaptionsPid(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AribCaptionsPid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAribCaptionsPid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AribCaptionsPid")(js.undefined)
        ret
    }
    @scala.inline
    def withAribCaptionsPidControl(value: M2tsAribCaptionsPidControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AribCaptionsPidControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAribCaptionsPidControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AribCaptionsPidControl")(js.undefined)
        ret
    }
    @scala.inline
    def withAudioBufferModel(value: M2tsAudioBufferModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AudioBufferModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudioBufferModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AudioBufferModel")(js.undefined)
        ret
    }
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
    def withAudioStreamType(value: M2tsAudioStreamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AudioStreamType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudioStreamType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AudioStreamType")(js.undefined)
        ret
    }
    @scala.inline
    def withBitrate(value: integerMin0): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Bitrate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBitrate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Bitrate")(js.undefined)
        ret
    }
    @scala.inline
    def withBufferModel(value: M2tsBufferModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BufferModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBufferModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BufferModel")(js.undefined)
        ret
    }
    @scala.inline
    def withCcDescriptor(value: M2tsCcDescriptor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CcDescriptor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCcDescriptor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CcDescriptor")(js.undefined)
        ret
    }
    @scala.inline
    def withDvbNitSettings(value: DvbNitSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DvbNitSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDvbNitSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DvbNitSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withDvbSdtSettings(value: DvbSdtSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DvbSdtSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDvbSdtSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DvbSdtSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withDvbSubPids(value: string): Self = {
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
    def withDvbTdtSettings(value: DvbTdtSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DvbTdtSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDvbTdtSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DvbTdtSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withDvbTeletextPid(value: string): Self = {
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
    def withEbif(value: M2tsEbifControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ebif")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEbif: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ebif")(js.undefined)
        ret
    }
    @scala.inline
    def withEbpAudioInterval(value: M2tsAudioInterval): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EbpAudioInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEbpAudioInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EbpAudioInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withEbpLookaheadMs(value: integerMin0Max10000): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EbpLookaheadMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEbpLookaheadMs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EbpLookaheadMs")(js.undefined)
        ret
    }
    @scala.inline
    def withEbpPlacement(value: M2tsEbpPlacement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EbpPlacement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEbpPlacement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EbpPlacement")(js.undefined)
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
    def withEsRateInPes(value: M2tsEsRateInPes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EsRateInPes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEsRateInPes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EsRateInPes")(js.undefined)
        ret
    }
    @scala.inline
    def withEtvPlatformPid(value: string): Self = {
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
    def withEtvSignalPid(value: string): Self = {
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
    def withFragmentTime(value: doubleMin0): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FragmentTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFragmentTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FragmentTime")(js.undefined)
        ret
    }
    @scala.inline
    def withKlv(value: M2tsKlv): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Klv")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKlv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Klv")(js.undefined)
        ret
    }
    @scala.inline
    def withKlvDataPids(value: string): Self = {
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
    def withNielsenId3Behavior(value: M2tsNielsenId3Behavior): Self = {
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
    def withNullPacketBitrate(value: doubleMin0): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NullPacketBitrate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNullPacketBitrate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NullPacketBitrate")(js.undefined)
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
    def withPcrControl(value: M2tsPcrControl): Self = {
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
    def withRateMode(value: M2tsRateMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RateMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRateMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RateMode")(js.undefined)
        ret
    }
    @scala.inline
    def withScte27Pids(value: string): Self = {
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
    def withScte35Control(value: M2tsScte35Control): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Scte35Control")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScte35Control: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Scte35Control")(js.undefined)
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
    def withSegmentationMarkers(value: M2tsSegmentationMarkers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SegmentationMarkers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSegmentationMarkers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SegmentationMarkers")(js.undefined)
        ret
    }
    @scala.inline
    def withSegmentationStyle(value: M2tsSegmentationStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SegmentationStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSegmentationStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SegmentationStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withSegmentationTime(value: doubleMin1): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SegmentationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSegmentationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SegmentationTime")(js.undefined)
        ret
    }
    @scala.inline
    def withTimedMetadataBehavior(value: M2tsTimedMetadataBehavior): Self = {
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

