package typingsSlinky.pulumiAws.outputMod.elastictranscoder

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PresetThumbnails extends js.Object {
  /**
    * The display aspect ratio of the video in the output file. Valid values are: `auto`, `1:1`, `4:3`, `3:2`, `16:9`. (Note; to better control resolution and aspect ratio of output videos, we recommend that you use the values `maxWidth`, `maxHeight`, `sizingPolicy`, `paddingPolicy`, and `displayAspectRatio` instead of `resolution` and `aspectRatio`.)
    */
  var aspectRatio: js.UndefOr[String] = js.native
  /**
    * The format of thumbnails, if any. Valid formats are jpg and png.
    */
  var format: js.UndefOr[String] = js.native
  /**
    * The approximate number of seconds between thumbnails. The value must be an integer. The actual interval can vary by several seconds from one thumbnail to the next.
    */
  var interval: js.UndefOr[String] = js.native
  /**
    * The maximum height of the watermark.
    */
  var maxHeight: js.UndefOr[String] = js.native
  /**
    * The maximum width of the watermark.
    */
  var maxWidth: js.UndefOr[String] = js.native
  /**
    * When you set PaddingPolicy to Pad, Elastic Transcoder might add black bars to the top and bottom and/or left and right sides of the output video to make the total size of the output video match the values that you specified for `maxWidth` and `maxHeight`.
    */
  var paddingPolicy: js.UndefOr[String] = js.native
  /**
    * The width and height of the video in the output file, in pixels. Valid values are `auto` and `widthxheight`. (see note for `aspectRatio`)
    */
  var resolution: js.UndefOr[String] = js.native
  /**
    * A value that controls scaling of the watermark. Valid values are: `Fit`, `Stretch`, `ShrinkToFit`
    */
  var sizingPolicy: js.UndefOr[String] = js.native
}

object PresetThumbnails {
  @scala.inline
  def apply(): PresetThumbnails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PresetThumbnails]
  }
  @scala.inline
  implicit class PresetThumbnailsOps[Self <: PresetThumbnails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAspectRatio(value: String): Self = {
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
    def withFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withInterval(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxHeight(value: String): Self = {
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
    def withMaxWidth(value: String): Self = {
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
    def withPaddingPolicy(value: String): Self = {
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
    def withResolution(value: String): Self = {
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
    def withSizingPolicy(value: String): Self = {
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

