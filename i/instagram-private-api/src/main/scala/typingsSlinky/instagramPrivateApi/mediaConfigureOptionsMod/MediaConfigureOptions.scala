package typingsSlinky.instagramPrivateApi.mediaConfigureOptionsMod

import typingsSlinky.instagramPrivateApi.anon.Croporiginalsize
import typingsSlinky.instagramPrivateApi.anon.Sourceheight
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.`0`
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaConfigureOptions extends js.Object {
  var disable_comments: js.UndefOr[Boolean] = js.native
  var edits: js.UndefOr[Croporiginalsize] = js.native
  var extra: js.UndefOr[Sourceheight] = js.native
  var geotag_enabled: js.UndefOr[`1` | `0`] = js.native
  var height: js.UndefOr[Double] = js.native
  var media_folder: js.UndefOr[String] = js.native
  var media_latitude: js.UndefOr[String] = js.native
  var media_longitude: js.UndefOr[String] = js.native
  var posting_latitude: js.UndefOr[String] = js.native
  var posting_longitude: js.UndefOr[String] = js.native
  var scene_capture_type: js.UndefOr[String] = js.native
  var software: js.UndefOr[String] = js.native
  var source_type: js.UndefOr[String] = js.native
  var upload_id: String = js.native
  var width: js.UndefOr[Double] = js.native
}

object MediaConfigureOptions {
  @scala.inline
  def apply(upload_id: String): MediaConfigureOptions = {
    val __obj = js.Dynamic.literal(upload_id = upload_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaConfigureOptions]
  }
  @scala.inline
  implicit class MediaConfigureOptionsOps[Self <: MediaConfigureOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUpload_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upload_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisable_comments(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable_comments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisable_comments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable_comments")(js.undefined)
        ret
    }
    @scala.inline
    def withEdits(value: Croporiginalsize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEdits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edits")(js.undefined)
        ret
    }
    @scala.inline
    def withExtra(value: Sourceheight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extra")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtra: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extra")(js.undefined)
        ret
    }
    @scala.inline
    def withGeotag_enabled(value: `1` | `0`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geotag_enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeotag_enabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geotag_enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withMedia_folder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media_folder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMedia_folder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media_folder")(js.undefined)
        ret
    }
    @scala.inline
    def withMedia_latitude(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media_latitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMedia_latitude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media_latitude")(js.undefined)
        ret
    }
    @scala.inline
    def withMedia_longitude(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media_longitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMedia_longitude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media_longitude")(js.undefined)
        ret
    }
    @scala.inline
    def withPosting_latitude(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("posting_latitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosting_latitude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("posting_latitude")(js.undefined)
        ret
    }
    @scala.inline
    def withPosting_longitude(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("posting_longitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosting_longitude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("posting_longitude")(js.undefined)
        ret
    }
    @scala.inline
    def withScene_capture_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scene_capture_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScene_capture_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scene_capture_type")(js.undefined)
        ret
    }
    @scala.inline
    def withSoftware(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("software")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSoftware: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("software")(js.undefined)
        ret
    }
    @scala.inline
    def withSource_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source_type")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

