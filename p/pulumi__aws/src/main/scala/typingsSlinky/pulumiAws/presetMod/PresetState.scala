package typingsSlinky.pulumiAws.presetMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.inputMod.elastictranscoder.PresetAudio
import typingsSlinky.pulumiAws.inputMod.elastictranscoder.PresetAudioCodecOptions
import typingsSlinky.pulumiAws.inputMod.elastictranscoder.PresetThumbnails
import typingsSlinky.pulumiAws.inputMod.elastictranscoder.PresetVideo
import typingsSlinky.pulumiAws.inputMod.elastictranscoder.PresetVideoWatermark
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PresetState extends js.Object {
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * Audio parameters object (documented below).
    */
  val audio: js.UndefOr[Input[PresetAudio]] = js.native
  /**
    * Codec options for the audio parameters (documented below)
    */
  val audioCodecOptions: js.UndefOr[Input[PresetAudioCodecOptions]] = js.native
  /**
    * The container type for the output file. Valid values are `flac`, `flv`, `fmp4`, `gif`, `mp3`, `mp4`, `mpg`, `mxf`, `oga`, `ogg`, `ts`, and `webm`.
    */
  val container: js.UndefOr[Input[String]] = js.native
  /**
    * A description of the preset (maximum 255 characters)
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the preset. (maximum 40 characters)
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Thumbnail parameters object (documented below)
    */
  val thumbnails: js.UndefOr[Input[PresetThumbnails]] = js.native
  val `type`: js.UndefOr[Input[String]] = js.native
  /**
    * Video parameters object (documented below)
    */
  val video: js.UndefOr[Input[PresetVideo]] = js.native
  val videoCodecOptions: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * Watermark parameters for the video parameters (documented below)
    * * `videoCodecOptions` (Optional, Forces new resource) Codec options for the video parameters
    */
  val videoWatermarks: js.UndefOr[Input[js.Array[Input[PresetVideoWatermark]]]] = js.native
}

object PresetState {
  @scala.inline
  def apply(): PresetState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PresetState]
  }
  @scala.inline
  implicit class PresetStateOps[Self <: PresetState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(js.undefined)
        ret
    }
    @scala.inline
    def withAudio(value: Input[PresetAudio]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audio")(js.undefined)
        ret
    }
    @scala.inline
    def withAudioCodecOptions(value: Input[PresetAudioCodecOptions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioCodecOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudioCodecOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioCodecOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withContainer(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbnails(value: Input[PresetThumbnails]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbnails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnails")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withVideo(value: Input[PresetVideo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("video")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("video")(js.undefined)
        ret
    }
    @scala.inline
    def withVideoCodecOptions(value: Input[StringDictionary[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoCodecOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideoCodecOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoCodecOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withVideoWatermarks(value: Input[js.Array[Input[PresetVideoWatermark]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoWatermarks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideoWatermarks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoWatermarks")(js.undefined)
        ret
    }
  }
  
}

