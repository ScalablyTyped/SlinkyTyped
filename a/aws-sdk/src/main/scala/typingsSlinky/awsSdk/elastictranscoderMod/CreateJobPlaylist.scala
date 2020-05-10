package typingsSlinky.awsSdk.elastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateJobPlaylist extends js.Object {
  /**
    * The format of the output playlist. Valid formats include HLSv3, HLSv4, and Smooth.
    */
  var Format: js.UndefOr[PlaylistFormat] = js.native
  /**
    * The HLS content protection settings, if any, that you want Elastic Transcoder to apply to the output files associated with this playlist.
    */
  var HlsContentProtection: js.UndefOr[typingsSlinky.awsSdk.elastictranscoderMod.HlsContentProtection] = js.native
  /**
    * The name that you want Elastic Transcoder to assign to the master playlist, for example, nyc-vacation.m3u8. If the name includes a / character, the section of the name before the last / must be identical for all Name objects. If you create more than one master playlist, the values of all Name objects must be unique.   Elastic Transcoder automatically appends the relevant file extension to the file name (.m3u8 for HLSv3 and HLSv4 playlists, and .ism and .ismc for Smooth playlists). If you include a file extension in Name, the file name will have two extensions. 
    */
  var Name: js.UndefOr[Filename] = js.native
  /**
    * For each output in this job that you want to include in a master playlist, the value of the Outputs:Key object.    If your output is not HLS or does not have a segment duration set, the name of the output file is a concatenation of OutputKeyPrefix and Outputs:Key: OutputKeyPrefixOutputs:Key    If your output is HLSv3 and has a segment duration set, or is not included in a playlist, Elastic Transcoder creates an output playlist file with a file extension of .m3u8, and a series of .ts files that include a five-digit sequential counter beginning with 00000: OutputKeyPrefixOutputs:Key.m3u8 OutputKeyPrefixOutputs:Key00000.ts   If your output is HLSv4, has a segment duration set, and is included in an HLSv4 playlist, Elastic Transcoder creates an output playlist file with a file extension of _v4.m3u8. If the output is video, Elastic Transcoder also creates an output file with an extension of _iframe.m3u8: OutputKeyPrefixOutputs:Key_v4.m3u8 OutputKeyPrefixOutputs:Key_iframe.m3u8 OutputKeyPrefixOutputs:Key.ts   Elastic Transcoder automatically appends the relevant file extension to the file name. If you include a file extension in Output Key, the file name will have two extensions. If you include more than one output in a playlist, any segment duration settings, clip settings, or caption settings must be the same for all outputs in the playlist. For Smooth playlists, the Audio:Profile, Video:Profile, and Video:FrameRate to Video:KeyframesMaxDist ratio must be the same for all outputs.
    */
  var OutputKeys: js.UndefOr[typingsSlinky.awsSdk.elastictranscoderMod.OutputKeys] = js.native
  /**
    * The DRM settings, if any, that you want Elastic Transcoder to apply to the output files associated with this playlist.
    */
  var PlayReadyDrm: js.UndefOr[typingsSlinky.awsSdk.elastictranscoderMod.PlayReadyDrm] = js.native
}

object CreateJobPlaylist {
  @scala.inline
  def apply(): CreateJobPlaylist = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateJobPlaylist]
  }
  @scala.inline
  implicit class CreateJobPlaylistOps[Self <: CreateJobPlaylist] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormat(value: PlaylistFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Format")(js.undefined)
        ret
    }
    @scala.inline
    def withHlsContentProtection(value: HlsContentProtection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HlsContentProtection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHlsContentProtection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HlsContentProtection")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Filename): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputKeys(value: OutputKeys): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withPlayReadyDrm(value: PlayReadyDrm): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlayReadyDrm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlayReadyDrm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlayReadyDrm")(js.undefined)
        ret
    }
  }
  
}

