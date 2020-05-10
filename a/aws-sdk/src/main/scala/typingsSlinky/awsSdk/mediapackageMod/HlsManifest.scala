package typingsSlinky.awsSdk.mediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HlsManifest extends js.Object {
  /**
    * This setting controls how ad markers are included in the packaged OriginEndpoint.
  "NONE" will omit all SCTE-35 ad markers from the output.
  "PASSTHROUGH" causes the manifest to contain a copy of the SCTE-35 ad
  markers (comments) taken directly from the input HTTP Live Streaming (HLS) manifest.
  "SCTE35_ENHANCED" generates ad markers and blackout tags based on SCTE-35
  messages in the input source.
    */
  var AdMarkers: js.UndefOr[typingsSlinky.awsSdk.mediapackageMod.AdMarkers] = js.native
  /**
    * The ID of the manifest. The ID must be unique within the OriginEndpoint and it cannot be changed after it is created.
    */
  var Id: string = js.native
  /**
    * When enabled, an I-Frame only stream will be included in the output.
    */
  var IncludeIframeOnlyStream: js.UndefOr[boolean] = js.native
  /**
    * An optional short string appended to the end of the OriginEndpoint URL. If not specified, defaults to the manifestName for the OriginEndpoint.
    */
  var ManifestName: js.UndefOr[string] = js.native
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
    * The URL of the packaged OriginEndpoint for consumption.
    */
  var Url: js.UndefOr[string] = js.native
}

object HlsManifest {
  @scala.inline
  def apply(Id: string): HlsManifest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[HlsManifest]
  }
  @scala.inline
  implicit class HlsManifestOps[Self <: HlsManifest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withManifestName(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ManifestName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManifestName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ManifestName")(js.undefined)
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
    def withUrl(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Url")(js.undefined)
        ret
    }
  }
  
}

