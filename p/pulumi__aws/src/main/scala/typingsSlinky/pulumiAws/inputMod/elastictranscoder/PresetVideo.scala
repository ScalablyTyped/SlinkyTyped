package typingsSlinky.pulumiAws.inputMod.elastictranscoder

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PresetVideo extends js.Object {
  /**
    * The display aspect ratio of the video in the output file. Valid values are: `auto`, `1:1`, `4:3`, `3:2`, `16:9`. (Note; to better control resolution and aspect ratio of output videos, we recommend that you use the values `maxWidth`, `maxHeight`, `sizingPolicy`, `paddingPolicy`, and `displayAspectRatio` instead of `resolution` and `aspectRatio`.)
    */
  var aspectRatio: js.UndefOr[Input[String]] = js.native
  /**
    * The bit rate of the video stream in the output file, in kilobits/second. You can configure variable bit rate or constant bit rate encoding.
    */
  var bitRate: js.UndefOr[Input[String]] = js.native
  /**
    * The video codec for the output file. Valid values are `gif`, `H.264`, `mpeg2`, `vp8`, and `vp9`.
    */
  var codec: js.UndefOr[Input[String]] = js.native
  /**
    * The value that Elastic Transcoder adds to the metadata in the output file. If you set DisplayAspectRatio to auto, Elastic Transcoder chooses an aspect ratio that ensures square pixels. If you specify another option, Elastic Transcoder sets that value in the output file.
    */
  var displayAspectRatio: js.UndefOr[Input[String]] = js.native
  /**
    * Whether to use a fixed value for Video:FixedGOP. Not applicable for containers of type gif. Valid values are true and false. Also known as, Fixed Number of Frames Between Keyframes.
    */
  var fixedGop: js.UndefOr[Input[String]] = js.native
  /**
    * The frames per second for the video stream in the output file. The following values are valid: `auto`, `10`, `15`, `23.97`, `24`, `25`, `29.97`, `30`, `50`, `60`.
    */
  var frameRate: js.UndefOr[Input[String]] = js.native
  /**
    * The maximum number of frames between key frames. Not applicable for containers of type gif.
    */
  var keyframesMaxDist: js.UndefOr[Input[String]] = js.native
  /**
    * If you specify auto for FrameRate, Elastic Transcoder uses the frame rate of the input video for the frame rate of the output video, up to the maximum frame rate. If you do not specify a MaxFrameRate, Elastic Transcoder will use a default of 30.
    */
  var maxFrameRate: js.UndefOr[Input[String]] = js.native
  /**
    * The maximum height of the watermark.
    */
  var maxHeight: js.UndefOr[Input[String]] = js.native
  /**
    * The maximum width of the watermark.
    */
  var maxWidth: js.UndefOr[Input[String]] = js.native
  /**
    * When you set PaddingPolicy to Pad, Elastic Transcoder might add black bars to the top and bottom and/or left and right sides of the output video to make the total size of the output video match the values that you specified for `maxWidth` and `maxHeight`.
    */
  var paddingPolicy: js.UndefOr[Input[String]] = js.native
  /**
    * The width and height of the video in the output file, in pixels. Valid values are `auto` and `widthxheight`. (see note for `aspectRatio`)
    */
  var resolution: js.UndefOr[Input[String]] = js.native
  /**
    * A value that controls scaling of the watermark. Valid values are: `Fit`, `Stretch`, `ShrinkToFit`
    */
  var sizingPolicy: js.UndefOr[Input[String]] = js.native
}

object PresetVideo {
  @scala.inline
  def apply(): PresetVideo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PresetVideo]
  }
  @scala.inline
  implicit class PresetVideoOps[Self <: PresetVideo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAspectRatio(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aspectRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAspectRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aspectRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withBitRate(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBitRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitRate")(js.undefined)
        ret
    }
    @scala.inline
    def withCodec(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codec")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayAspectRatio(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayAspectRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayAspectRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayAspectRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withFixedGop(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedGop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixedGop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedGop")(js.undefined)
        ret
    }
    @scala.inline
    def withFrameRate(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrameRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameRate")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyframesMaxDist(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyframesMaxDist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyframesMaxDist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyframesMaxDist")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxFrameRate(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFrameRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxFrameRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFrameRate")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxHeight(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxWidth(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withPaddingPolicy(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaddingPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withResolution(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolution")(js.undefined)
        ret
    }
    @scala.inline
    def withSizingPolicy(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizingPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizingPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizingPolicy")(js.undefined)
        ret
    }
  }
  
}

