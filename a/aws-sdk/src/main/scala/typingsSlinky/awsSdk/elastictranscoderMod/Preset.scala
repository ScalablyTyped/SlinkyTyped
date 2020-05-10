package typingsSlinky.awsSdk.elastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Preset extends js.Object {
  /**
    * The Amazon Resource Name (ARN) for the preset.
    */
  var Arn: js.UndefOr[String] = js.native
  /**
    * A section of the response body that provides information about the audio preset values.
    */
  var Audio: js.UndefOr[AudioParameters] = js.native
  /**
    * The container type for the output file. Valid values include flac, flv, fmp4, gif, mp3, mp4, mpg, mxf, oga, ogg, ts, and webm.
    */
  var Container: js.UndefOr[PresetContainer] = js.native
  /**
    * A description of the preset.
    */
  var Description: js.UndefOr[typingsSlinky.awsSdk.elastictranscoderMod.Description] = js.native
  /**
    * Identifier for the new preset. You use this value to get settings for the preset or to delete it.
    */
  var Id: js.UndefOr[typingsSlinky.awsSdk.elastictranscoderMod.Id] = js.native
  /**
    * The name of the preset.
    */
  var Name: js.UndefOr[typingsSlinky.awsSdk.elastictranscoderMod.Name] = js.native
  /**
    * A section of the response body that provides information about the thumbnail preset values, if any.
    */
  var Thumbnails: js.UndefOr[typingsSlinky.awsSdk.elastictranscoderMod.Thumbnails] = js.native
  /**
    * Whether the preset is a default preset provided by Elastic Transcoder (System) or a preset that you have defined (Custom).
    */
  var Type: js.UndefOr[PresetType] = js.native
  /**
    * A section of the response body that provides information about the video preset values.
    */
  var Video: js.UndefOr[VideoParameters] = js.native
}

object Preset {
  @scala.inline
  def apply(): Preset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Preset]
  }
  @scala.inline
  implicit class PresetOps[Self <: Preset] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(js.undefined)
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
    def withContainer(value: PresetContainer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Container")(js.undefined)
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
    def withId(value: Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Name): Self = {
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
    def withType(value: PresetType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(js.undefined)
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

