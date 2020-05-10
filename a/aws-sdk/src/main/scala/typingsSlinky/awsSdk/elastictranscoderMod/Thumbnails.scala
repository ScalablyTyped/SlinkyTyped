package typingsSlinky.awsSdk.elastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Thumbnails extends js.Object {
  /**
    *  To better control resolution and aspect ratio of thumbnails, we recommend that you use the values MaxWidth, MaxHeight, SizingPolicy, and PaddingPolicy instead of Resolution and AspectRatio. The two groups of settings are mutually exclusive. Do not use them together.  The aspect ratio of thumbnails. Valid values include:  auto, 1:1, 4:3, 3:2, 16:9  If you specify auto, Elastic Transcoder tries to preserve the aspect ratio of the video in the output file.
    */
  var AspectRatio: js.UndefOr[typingsSlinky.awsSdk.elastictranscoderMod.AspectRatio] = js.native
  /**
    * The format of thumbnails, if any. Valid values are jpg and png.  You specify whether you want Elastic Transcoder to create thumbnails when you create a job.
    */
  var Format: js.UndefOr[JpgOrPng] = js.native
  /**
    * The approximate number of seconds between thumbnails. Specify an integer value.
    */
  var Interval: js.UndefOr[Digits] = js.native
  /**
    * The maximum height of thumbnails in pixels. If you specify auto, Elastic Transcoder uses 1080 (Full HD) as the default value. If you specify a numeric value, enter an even integer between 32 and 3072.
    */
  var MaxHeight: js.UndefOr[DigitsOrAuto] = js.native
  /**
    * The maximum width of thumbnails in pixels. If you specify auto, Elastic Transcoder uses 1920 (Full HD) as the default value. If you specify a numeric value, enter an even integer between 32 and 4096.
    */
  var MaxWidth: js.UndefOr[DigitsOrAuto] = js.native
  /**
    * When you set PaddingPolicy to Pad, Elastic Transcoder may add black bars to the top and bottom and/or left and right sides of thumbnails to make the total size of the thumbnails match the values that you specified for thumbnail MaxWidth and MaxHeight settings.
    */
  var PaddingPolicy: js.UndefOr[typingsSlinky.awsSdk.elastictranscoderMod.PaddingPolicy] = js.native
  /**
    *  To better control resolution and aspect ratio of thumbnails, we recommend that you use the values MaxWidth, MaxHeight, SizingPolicy, and PaddingPolicy instead of Resolution and AspectRatio. The two groups of settings are mutually exclusive. Do not use them together.  The width and height of thumbnail files in pixels. Specify a value in the format  width  x  height  where both values are even integers. The values cannot exceed the width and height that you specified in the Video:Resolution object.
    */
  var Resolution: js.UndefOr[ThumbnailResolution] = js.native
  /**
    * Specify one of the following values to control scaling of thumbnails:    Fit: Elastic Transcoder scales thumbnails so they match the value that you specified in thumbnail MaxWidth or MaxHeight settings without exceeding the other value.     Fill: Elastic Transcoder scales thumbnails so they match the value that you specified in thumbnail MaxWidth or MaxHeight settings and matches or exceeds the other value. Elastic Transcoder centers the image in thumbnails and then crops in the dimension (if any) that exceeds the maximum value.    Stretch: Elastic Transcoder stretches thumbnails to match the values that you specified for thumbnail MaxWidth and MaxHeight settings. If the relative proportions of the input video and thumbnails are different, the thumbnails will be distorted.    Keep: Elastic Transcoder does not scale thumbnails. If either dimension of the input video exceeds the values that you specified for thumbnail MaxWidth and MaxHeight settings, Elastic Transcoder crops the thumbnails.    ShrinkToFit: Elastic Transcoder scales thumbnails down so that their dimensions match the values that you specified for at least one of thumbnail MaxWidth and MaxHeight without exceeding either value. If you specify this option, Elastic Transcoder does not scale thumbnails up.    ShrinkToFill: Elastic Transcoder scales thumbnails down so that their dimensions match the values that you specified for at least one of MaxWidth and MaxHeight without dropping below either value. If you specify this option, Elastic Transcoder does not scale thumbnails up.  
    */
  var SizingPolicy: js.UndefOr[typingsSlinky.awsSdk.elastictranscoderMod.SizingPolicy] = js.native
}

object Thumbnails {
  @scala.inline
  def apply(): Thumbnails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Thumbnails]
  }
  @scala.inline
  implicit class ThumbnailsOps[Self <: Thumbnails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAspectRatio(value: AspectRatio): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AspectRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAspectRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AspectRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: JpgOrPng): Self = {
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
    def withInterval(value: Digits): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Interval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Interval")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxHeight(value: DigitsOrAuto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxWidth(value: DigitsOrAuto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withPaddingPolicy(value: PaddingPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PaddingPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaddingPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PaddingPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withResolution(value: ThumbnailResolution): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Resolution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Resolution")(js.undefined)
        ret
    }
    @scala.inline
    def withSizingPolicy(value: SizingPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SizingPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizingPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SizingPolicy")(js.undefined)
        ret
    }
  }
  
}

