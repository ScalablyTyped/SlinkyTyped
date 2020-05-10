package typingsSlinky.awsSdk.mediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HlsPackage extends js.Object {
  /**
    * This setting controls how ad markers are included in the packaged OriginEndpoint.
  "NONE" will omit all SCTE-35 ad markers from the output.
  "PASSTHROUGH" causes the manifest to contain a copy of the SCTE-35 ad
  markers (comments) taken directly from the input HTTP Live Streaming (HLS) manifest.
  "SCTE35_ENHANCED" generates ad markers and blackout tags based on SCTE-35
  messages in the input source.
    */
  var AdMarkers: js.UndefOr[typingsSlinky.awsSdk.mediapackageMod.AdMarkers] = js.native
  var AdTriggers: js.UndefOr[typingsSlinky.awsSdk.mediapackageMod.AdTriggers] = js.native
  var AdsOnDeliveryRestrictions: js.UndefOr[typingsSlinky.awsSdk.mediapackageMod.AdsOnDeliveryRestrictions] = js.native
  var Encryption: js.UndefOr[HlsEncryption] = js.native
  /**
    * When enabled, an I-Frame only stream will be included in the output.
    */
  var IncludeIframeOnlyStream: js.UndefOr[boolean] = js.native
  /**
    * The HTTP Live Streaming (HLS) playlist type.
  When either "EVENT" or "VOD" is specified, a corresponding EXT-X-PLAYLIST-TYPE
  entry will be included in the media playlist.
    */
  var PlaylistType: js.UndefOr[typingsSlinky.awsSdk.mediapackageMod.PlaylistType] = js.native
  /**
    * Time window (in seconds) contained in each parent manifest.
    */
  var PlaylistWindowSeconds: js.UndefOr[integer] = js.native
  /**
    * The interval (in seconds) between each EXT-X-PROGRAM-DATE-TIME tag
  inserted into manifests. Additionally, when an interval is specified
  ID3Timed Metadata messages will be generated every 5 seconds using the
  ingest time of the content.
  If the interval is not specified, or set to 0, then
  no EXT-X-PROGRAM-DATE-TIME tags will be inserted into manifests and no
  ID3Timed Metadata messages will be generated. Note that irrespective
  of this parameter, if any ID3 Timed Metadata is found in HTTP Live Streaming (HLS) input,
  it will be passed through to HLS output.
    */
  var ProgramDateTimeIntervalSeconds: js.UndefOr[integer] = js.native
  /**
    * Duration (in seconds) of each fragment. Actual fragments will be
  rounded to the nearest multiple of the source fragment duration.
    */
  var SegmentDurationSeconds: js.UndefOr[integer] = js.native
  var StreamSelection: js.UndefOr[typingsSlinky.awsSdk.mediapackageMod.StreamSelection] = js.native
  /**
    * When enabled, audio streams will be placed in rendition groups in the output.
    */
  var UseAudioRenditionGroup: js.UndefOr[boolean] = js.native
}

object HlsPackage {
  @scala.inline
  def apply(): HlsPackage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HlsPackage]
  }
  @scala.inline
  implicit class HlsPackageOps[Self <: HlsPackage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdMarkers(value: AdMarkers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdMarkers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdMarkers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdMarkers")(js.undefined)
        ret
    }
    @scala.inline
    def withAdTriggers(value: AdTriggers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdTriggers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdTriggers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdTriggers")(js.undefined)
        ret
    }
    @scala.inline
    def withAdsOnDeliveryRestrictions(value: AdsOnDeliveryRestrictions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdsOnDeliveryRestrictions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdsOnDeliveryRestrictions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdsOnDeliveryRestrictions")(js.undefined)
        ret
    }
    @scala.inline
    def withEncryption(value: HlsEncryption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Encryption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncryption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Encryption")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeIframeOnlyStream(value: boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncludeIframeOnlyStream")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeIframeOnlyStream: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncludeIframeOnlyStream")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaylistType(value: PlaylistType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlaylistType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaylistType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlaylistType")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaylistWindowSeconds(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlaylistWindowSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaylistWindowSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlaylistWindowSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withProgramDateTimeIntervalSeconds(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProgramDateTimeIntervalSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgramDateTimeIntervalSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProgramDateTimeIntervalSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withSegmentDurationSeconds(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SegmentDurationSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSegmentDurationSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SegmentDurationSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withStreamSelection(value: StreamSelection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreamSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreamSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreamSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withUseAudioRenditionGroup(value: boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UseAudioRenditionGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseAudioRenditionGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UseAudioRenditionGroup")(js.undefined)
        ret
    }
  }
  
}

