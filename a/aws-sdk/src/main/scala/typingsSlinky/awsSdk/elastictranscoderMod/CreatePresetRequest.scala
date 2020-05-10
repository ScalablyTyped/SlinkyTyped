package typingsSlinky.awsSdk.elastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePresetRequest extends js.Object {
  /**
    * A section of the request body that specifies the audio parameters.
    */
  var Audio: js.UndefOr[AudioParameters] = js.native
  /**
    * The container type for the output file. Valid values include flac, flv, fmp4, gif, mp3, mp4, mpg, mxf, oga, ogg, ts, and webm.
    */
  var Container: PresetContainer = js.native
  /**
    * A description of the preset.
    */
  var Description: js.UndefOr[typingsSlinky.awsSdk.elastictranscoderMod.Description] = js.native
  /**
    * The name of the preset. We recommend that the name be unique within the AWS account, but uniqueness is not enforced.
    */
  var Name: typingsSlinky.awsSdk.elastictranscoderMod.Name = js.native
  /**
    * A section of the request body that specifies the thumbnail parameters, if any.
    */
  var Thumbnails: js.UndefOr[typingsSlinky.awsSdk.elastictranscoderMod.Thumbnails] = js.native
  /**
    * A section of the request body that specifies the video parameters.
    */
  var Video: js.UndefOr[VideoParameters] = js.native
}

object CreatePresetRequest {
  @scala.inline
  def apply(Container: PresetContainer, Name: Name): CreatePresetRequest = {
    val __obj = js.Dynamic.literal(Container = Container.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePresetRequest]
  }
  @scala.inline
  implicit class CreatePresetRequestOps[Self <: CreatePresetRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainer(value: PresetContainer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: Name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAudio(value: AudioParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Audio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Audio")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: Description): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbnails(value: Thumbnails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Thumbnails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbnails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Thumbnails")(js.undefined)
        ret
    }
    @scala.inline
    def withVideo(value: VideoParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Video")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Video")(js.undefined)
        ret
    }
  }
  
}

