package typingsSlinky.instagramPrivateApi.mediaConfigureOptionsMod

import typingsSlinky.instagramPrivateApi.postingOptionsMod.PostingUsertags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaConfigureTimelineOptions extends MediaConfigureOptions {
  var camera_make: js.UndefOr[String] = js.native
  var camera_model: js.UndefOr[String] = js.native
  var caption: js.UndefOr[String] = js.native
  var creation_logger_session_id: js.UndefOr[String] = js.native
  var date_time_digitalized: js.UndefOr[String] = js.native
  var date_time_original: js.UndefOr[String] = js.native
  var device_id: js.UndefOr[String] = js.native
  var location: js.UndefOr[MediaLocation | String] = js.native
  var timezone_offset: js.UndefOr[String] = js.native
  var usertags: js.UndefOr[PostingUsertags | String] = js.native
}

object MediaConfigureTimelineOptions {
  @scala.inline
  def apply(upload_id: String): MediaConfigureTimelineOptions = {
    val __obj = js.Dynamic.literal(upload_id = upload_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaConfigureTimelineOptions]
  }
  @scala.inline
  implicit class MediaConfigureTimelineOptionsOps[Self <: MediaConfigureTimelineOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCamera_make(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("camera_make")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCamera_make: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("camera_make")(js.undefined)
        ret
    }
    @scala.inline
    def withCamera_model(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("camera_model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCamera_model: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("camera_model")(js.undefined)
        ret
    }
    @scala.inline
    def withCaption(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caption")(js.undefined)
        ret
    }
    @scala.inline
    def withCreation_logger_session_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creation_logger_session_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreation_logger_session_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creation_logger_session_id")(js.undefined)
        ret
    }
    @scala.inline
    def withDate_time_digitalized(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date_time_digitalized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDate_time_digitalized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date_time_digitalized")(js.undefined)
        ret
    }
    @scala.inline
    def withDate_time_original(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date_time_original")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDate_time_original: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date_time_original")(js.undefined)
        ret
    }
    @scala.inline
    def withDevice_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("device_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDevice_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("device_id")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: MediaLocation | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
    @scala.inline
    def withTimezone_offset(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timezone_offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimezone_offset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timezone_offset")(js.undefined)
        ret
    }
    @scala.inline
    def withUsertags(value: PostingUsertags | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usertags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsertags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usertags")(js.undefined)
        ret
    }
  }
  
}

