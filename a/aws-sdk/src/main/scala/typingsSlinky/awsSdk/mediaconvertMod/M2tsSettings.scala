package typingsSlinky.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait M2tsSettings extends js.Object {
  /**
    * Selects between the DVB and ATSC buffer models for Dolby Digital audio.
    */
  var AudioBufferModel: js.UndefOr[M2tsAudioBufferModel] = js.native
  /**
    * The number of audio frames to insert for each PES packet.
    */
  var AudioFramesPerPes: js.UndefOr[integerMin0Max2147483647] = js.native
  /**
    * Specify the packet identifiers (PIDs) for any elementary audio streams you include in this output. Specify multiple PIDs as a JSON array. Default is the range 482-492.
    */
  var AudioPids: js.UndefOr[listOfIntegerMin32Max8182] = js.native
  /**
    * Specify the output bitrate of the transport stream in bits per second. Setting to 0 lets the muxer automatically determine the appropriate bitrate. Other common values are 3750000, 7500000, and 15000000.
    */
  var Bitrate: js.UndefOr[integerMin0Max2147483647] = js.native
  /**
    * Controls what buffer model to use for accurate interleaving. If set to MULTIPLEX, use multiplex  buffer model. If set to NONE, this can lead to lower latency, but low-memory devices may not be able to play back the stream without interruptions.
    */
  var BufferModel: js.UndefOr[M2tsBufferModel] = js.native
  /**
    * Inserts DVB Network Information Table (NIT) at the specified table repetition interval.
    */
  var DvbNitSettings: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.DvbNitSettings] = js.native
  /**
    * Inserts DVB Service Description Table (NIT) at the specified table repetition interval.
    */
  var DvbSdtSettings: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.DvbSdtSettings] = js.native
  /**
    * Specify the packet identifiers (PIDs) for DVB subtitle data included in this output. Specify multiple PIDs as a JSON array. Default is the range 460-479.
    */
  var DvbSubPids: js.UndefOr[listOfIntegerMin32Max8182] = js.native
  /**
    * Inserts DVB Time and Date Table (TDT) at the specified table repetition interval.
    */
  var DvbTdtSettings: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.DvbTdtSettings] = js.native
  /**
    * Specify the packet identifier (PID) for DVB teletext data you include in this output. Default is 499.
    */
  var DvbTeletextPid: js.UndefOr[integerMin32Max8182] = js.native
  /**
    * When set to VIDEO_AND_FIXED_INTERVALS, audio EBP markers will be added to partitions 3 and 4. The interval between these additional markers will be fixed, and will be slightly shorter than the video EBP marker interval. When set to VIDEO_INTERVAL, these additional markers will not be inserted. Only applicable when EBP segmentation markers are is selected (segmentationMarkers is EBP or EBP_LEGACY).
    */
  var EbpAudioInterval: js.UndefOr[M2tsEbpAudioInterval] = js.native
  /**
    * Selects which PIDs to place EBP markers on. They can either be placed only on the video PID, or on both the video PID and all audio PIDs. Only applicable when EBP segmentation markers are is selected (segmentationMarkers is EBP or EBP_LEGACY).
    */
  var EbpPlacement: js.UndefOr[M2tsEbpPlacement] = js.native
  /**
    * Controls whether to include the ES Rate field in the PES header.
    */
  var EsRateInPes: js.UndefOr[M2tsEsRateInPes] = js.native
  /**
    * Keep the default value (DEFAULT) unless you know that your audio EBP markers are incorrectly appearing before your video EBP markers. To correct this problem, set this value to Force (FORCE).
    */
  var ForceTsVideoEbpOrder: js.UndefOr[M2tsForceTsVideoEbpOrder] = js.native
  /**
    * The length, in seconds, of each fragment. Only used with EBP markers.
    */
  var FragmentTime: js.UndefOr[doubleMin0] = js.native
  /**
    * Specify the maximum time, in milliseconds, between Program Clock References (PCRs) inserted into the transport stream.
    */
  var MaxPcrInterval: js.UndefOr[integerMin0Max500] = js.native
  /**
    * When set, enforces that Encoder Boundary Points do not come within the specified time interval of each other by looking ahead at input video. If another EBP is going to come in within the specified time interval, the current EBP is not emitted, and the segment is "stretched" to the next marker. The lookahead value does not add latency to the system. The Live Event must be configured elsewhere to create sufficient latency to make the lookahead accurate.
    */
  var MinEbpInterval: js.UndefOr[integerMin0Max10000] = js.native
  /**
    * If INSERT, Nielsen inaudible tones for media tracking will be detected in the input audio and an equivalent ID3 tag will be inserted in the output.
    */
  var NielsenId3: js.UndefOr[M2tsNielsenId3] = js.native
  /**
    * Value in bits per second of extra null packets to insert into the transport stream. This can be used if a downstream encryption system requires periodic null packets.
    */
  var NullPacketBitrate: js.UndefOr[doubleMin0] = js.native
  /**
    * The number of milliseconds between instances of this table in the output transport stream.
    */
  var PatInterval: js.UndefOr[integerMin0Max1000] = js.native
  /**
    * When set to PCR_EVERY_PES_PACKET, a Program Clock Reference value is inserted for every Packetized Elementary Stream (PES) header. This is effective only when the PCR PID is the same as the video or audio elementary stream.
    */
  var PcrControl: js.UndefOr[M2tsPcrControl] = js.native
  /**
    * Specify the packet identifier (PID) for the program clock reference (PCR) in this output. If you do not specify a value, the service will use the value for Video PID (VideoPid).
    */
  var PcrPid: js.UndefOr[integerMin32Max8182] = js.native
  /**
    * Specify the number of milliseconds between instances of the program map table (PMT) in the output transport stream.
    */
  var PmtInterval: js.UndefOr[integerMin0Max1000] = js.native
  /**
    * Specify the packet identifier (PID) for the program map table (PMT) itself. Default is 480.
    */
  var PmtPid: js.UndefOr[integerMin32Max8182] = js.native
  /**
    * Specify the packet identifier (PID) of the private metadata stream. Default is 503.
    */
  var PrivateMetadataPid: js.UndefOr[integerMin32Max8182] = js.native
  /**
    * Use Program number (programNumber) to specify the program number used in the program map table (PMT) for this output. Default is 1. Program numbers and program map tables are parts of MPEG-2 transport stream containers, used for organizing data.
    */
  var ProgramNumber: js.UndefOr[integerMin0Max65535] = js.native
  /**
    * When set to CBR, inserts null packets into transport stream to fill specified bitrate. When set to VBR, the bitrate setting acts as the maximum bitrate, but the output will not be padded up to that bitrate.
    */
  var RateMode: js.UndefOr[M2tsRateMode] = js.native
  /**
    * Include this in your job settings to put SCTE-35 markers in your HLS and transport stream outputs at the insertion points that you specify in an ESAM XML document. Provide the document in the setting SCC XML (sccXml).
    */
  var Scte35Esam: js.UndefOr[M2tsScte35Esam] = js.native
  /**
    * Specify the packet identifier (PID) of the SCTE-35 stream in the transport stream.
    */
  var Scte35Pid: js.UndefOr[integerMin32Max8182] = js.native
  /**
    * For SCTE-35 markers from your input-- Choose Passthrough (PASSTHROUGH) if you want SCTE-35 markers that appear in your input to also appear in this output. Choose None (NONE) if you don't want SCTE-35 markers in this output. For SCTE-35 markers from an ESAM XML document-- Choose None (NONE). Also provide the ESAM XML as a string in the setting Signal processing notification XML (sccXml). Also enable ESAM SCTE-35 (include the property scte35Esam).
    */
  var Scte35Source: js.UndefOr[M2tsScte35Source] = js.native
  /**
    * Inserts segmentation markers at each segmentation_time period. rai_segstart sets the Random Access Indicator bit in the adaptation field. rai_adapt sets the RAI bit and adds the current timecode in the private data bytes. psi_segstart inserts PAT and PMT tables at the start of segments. ebp adds Encoder Boundary Point information to the adaptation field as per OpenCable specification OC-SP-EBP-I01-130118. ebp_legacy adds Encoder Boundary Point information to the adaptation field using a legacy proprietary format.
    */
  var SegmentationMarkers: js.UndefOr[M2tsSegmentationMarkers] = js.native
  /**
    * The segmentation style parameter controls how segmentation markers are inserted into the transport stream. With avails, it is possible that segments may be truncated, which can influence where future segmentation markers are inserted. When a segmentation style of "reset_cadence" is selected and a segment is truncated due to an avail, we will reset the segmentation cadence. This means the subsequent segment will have a duration of of $segmentation_time seconds. When a segmentation style of "maintain_cadence" is selected and a segment is truncated due to an avail, we will not reset the segmentation cadence. This means the subsequent segment will likely be truncated as well. However, all segments after that will have a duration of $segmentation_time seconds. Note that EBP lookahead is a slight exception to this rule.
    */
  var SegmentationStyle: js.UndefOr[M2tsSegmentationStyle] = js.native
  /**
    * Specify the length, in seconds, of each segment. Required unless markers is set to _none_.
    */
  var SegmentationTime: js.UndefOr[doubleMin0] = js.native
  /**
    * Specify the packet identifier (PID) for timed metadata in this output. Default is 502.
    */
  var TimedMetadataPid: js.UndefOr[integerMin32Max8182] = js.native
  /**
    * Specify the ID for the transport stream itself in the program map table for this output. Transport stream IDs and program map tables are parts of MPEG-2 transport stream containers, used for organizing data.
    */
  var TransportStreamId: js.UndefOr[integerMin0Max65535] = js.native
  /**
    * Specify the packet identifier (PID) of the elementary video stream in the transport stream.
    */
  var VideoPid: js.UndefOr[integerMin32Max8182] = js.native
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
    def withBitrate(value: integerMin0Max2147483647): Self = {
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
    def withDvbSubPids(value: listOfIntegerMin32Max8182): Self = {
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
    def withDvbTeletextPid(value: integerMin32Max8182): Self = {
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
    def withEbpAudioInterval(value: M2tsEbpAudioInterval): Self = {
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
    def withForceTsVideoEbpOrder(value: M2tsForceTsVideoEbpOrder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ForceTsVideoEbpOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceTsVideoEbpOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ForceTsVideoEbpOrder")(js.undefined)
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
    def withMaxPcrInterval(value: integerMin0Max500): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxPcrInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxPcrInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxPcrInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withMinEbpInterval(value: integerMin0Max10000): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinEbpInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinEbpInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinEbpInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withNielsenId3(value: M2tsNielsenId3): Self = {
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
    def withScte35Esam(value: M2tsScte35Esam): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Scte35Esam")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScte35Esam: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Scte35Esam")(js.undefined)
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
    def withScte35Source(value: M2tsScte35Source): Self = {
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
    def withSegmentationTime(value: doubleMin0): Self = {
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

