package typingsSlinky.ffmpeg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  start_time  :string | number,   duration_time  :string | number,   frame_rate  :number,   size  :string,   number  :number,   every_n_frames  :number,   every_n_seconds  :number,   every_n_percentage  :number,   keep_pixel_aspect_ratio  :boolean,   keep_aspect_ration  :boolean,   padding_color  :string,   file_name ? :string}> */
@js.native
trait FrameToJPGSettings extends js.Object {
  var duration_time: js.UndefOr[String | Double] = js.native
  var every_n_frames: js.UndefOr[Double] = js.native
  var every_n_percentage: js.UndefOr[Double] = js.native
  var every_n_seconds: js.UndefOr[Double] = js.native
  var file_name: js.UndefOr[String] = js.native
  var frame_rate: js.UndefOr[Double] = js.native
  var keep_aspect_ration: js.UndefOr[Boolean] = js.native
  var keep_pixel_aspect_ratio: js.UndefOr[Boolean] = js.native
  var number: js.UndefOr[Double] = js.native
  var padding_color: js.UndefOr[String] = js.native
  var size: js.UndefOr[String] = js.native
  var start_time: js.UndefOr[String | Double] = js.native
}

object FrameToJPGSettings {
  @scala.inline
  def apply(): FrameToJPGSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FrameToJPGSettings]
  }
  @scala.inline
  implicit class FrameToJPGSettingsOps[Self <: FrameToJPGSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDuration_time(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration_time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration_time: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration_time")(js.undefined)
        ret
    }
    @scala.inline
    def withEvery_n_frames(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("every_n_frames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvery_n_frames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("every_n_frames")(js.undefined)
        ret
    }
    @scala.inline
    def withEvery_n_percentage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("every_n_percentage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvery_n_percentage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("every_n_percentage")(js.undefined)
        ret
    }
    @scala.inline
    def withEvery_n_seconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("every_n_seconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvery_n_seconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("every_n_seconds")(js.undefined)
        ret
    }
    @scala.inline
    def withFile_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFile_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file_name")(js.undefined)
        ret
    }
    @scala.inline
    def withFrame_rate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frame_rate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrame_rate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frame_rate")(js.undefined)
        ret
    }
    @scala.inline
    def withKeep_aspect_ration(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keep_aspect_ration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeep_aspect_ration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keep_aspect_ration")(js.undefined)
        ret
    }
    @scala.inline
    def withKeep_pixel_aspect_ratio(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keep_pixel_aspect_ratio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeep_pixel_aspect_ratio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keep_pixel_aspect_ratio")(js.undefined)
        ret
    }
    @scala.inline
    def withNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(js.undefined)
        ret
    }
    @scala.inline
    def withPadding_color(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding_color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPadding_color: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding_color")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withStart_time(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start_time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart_time: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start_time")(js.undefined)
        ret
    }
  }
  
}

