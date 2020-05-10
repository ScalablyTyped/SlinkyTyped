package typingsSlinky.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HlsSettings extends js.Object {
  /**
    * Specifies the group to which the audio Rendition belongs.
    */
  var AudioGroupId: js.UndefOr[string] = js.native
  /**
    * Use this setting only in audio-only outputs. Choose MPEG-2 Transport Stream (M2TS) to create a file in an MPEG2-TS container. Keep the default value Automatic (AUTOMATIC) to create an audio-only file in a raw container. Regardless of the value that you specify here, if this output has video, the service will place the output into an MPEG2-TS container.
    */
  var AudioOnlyContainer: js.UndefOr[HlsAudioOnlyContainer] = js.native
  /**
    * List all the audio groups that are used with the video output stream. Input all the audio GROUP-IDs that are associated to the video, separate by ','.
    */
  var AudioRenditionSets: js.UndefOr[string] = js.native
  /**
    * Four types of audio-only tracks are supported: Audio-Only Variant Stream The client can play back this audio-only stream instead of video in low-bandwidth scenarios. Represented as an EXT-X-STREAM-INF in the HLS manifest. Alternate Audio, Auto Select, Default Alternate rendition that the client should try to play back by default. Represented as an EXT-X-MEDIA in the HLS manifest with DEFAULT=YES, AUTOSELECT=YES Alternate Audio, Auto Select, Not Default Alternate rendition that the client may try to play back by default. Represented as an EXT-X-MEDIA in the HLS manifest with DEFAULT=NO, AUTOSELECT=YES Alternate Audio, not Auto Select Alternate rendition that the client will not try to play back by default. Represented as an EXT-X-MEDIA in the HLS manifest with DEFAULT=NO, AUTOSELECT=NO
    */
  var AudioTrackType: js.UndefOr[HlsAudioTrackType] = js.native
  /**
    * When set to INCLUDE, writes I-Frame Only Manifest in addition to the HLS manifest
    */
  var IFrameOnlyManifest: js.UndefOr[HlsIFrameOnlyManifest] = js.native
  /**
    * Use this setting to add an identifying string to the filename of each segment. The service adds this string between the name modifier and segment index number. You can use format identifiers in the string. For more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/using-variables-in-your-job-settings.html
    */
  var SegmentModifier: js.UndefOr[string] = js.native
}

object HlsSettings {
  @scala.inline
  def apply(): HlsSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HlsSettings]
  }
  @scala.inline
  implicit class HlsSettingsOps[Self <: HlsSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAudioGroupId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AudioGroupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudioGroupId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AudioGroupId")(js.undefined)
        ret
    }
    @scala.inline
    def withAudioOnlyContainer(value: HlsAudioOnlyContainer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AudioOnlyContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudioOnlyContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AudioOnlyContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withAudioRenditionSets(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AudioRenditionSets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudioRenditionSets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AudioRenditionSets")(js.undefined)
        ret
    }
    @scala.inline
    def withAudioTrackType(value: HlsAudioTrackType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AudioTrackType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudioTrackType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AudioTrackType")(js.undefined)
        ret
    }
    @scala.inline
    def withIFrameOnlyManifest(value: HlsIFrameOnlyManifest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IFrameOnlyManifest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIFrameOnlyManifest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IFrameOnlyManifest")(js.undefined)
        ret
    }
    @scala.inline
    def withSegmentModifier(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SegmentModifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSegmentModifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SegmentModifier")(js.undefined)
        ret
    }
  }
  
}

