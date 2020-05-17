package typingsSlinky.instagramPrivateApi.mediaConfigureSidecarOptionsMod

import typingsSlinky.instagramPrivateApi.anon.Androidversion
import typingsSlinky.instagramPrivateApi.anon.Cropcenter
import typingsSlinky.instagramPrivateApi.anon.Sourceheight
import typingsSlinky.instagramPrivateApi.postingOptionsMod.PostingUsertags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaConfigureSidecarItem extends js.Object {
  var caption: js.UndefOr[Null] = js.native
  var device: js.UndefOr[Androidversion | String] = js.native
  var edits: js.UndefOr[Cropcenter | String] = js.native
  var extra: js.UndefOr[Sourceheight | String] = js.native
  var height: Double = js.native
  var source_type: js.UndefOr[String] = js.native
  var timezone_offset: js.UndefOr[String] = js.native
  var upload_id: String = js.native
  var usertags: js.UndefOr[PostingUsertags | String] = js.native
  var width: Double = js.native
}

object MediaConfigureSidecarItem {
  @scala.inline
  def apply(height: Double, upload_id: String, width: Double): MediaConfigureSidecarItem = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], upload_id = upload_id.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaConfigureSidecarItem]
  }
  @scala.inline
  implicit class MediaConfigureSidecarItemOps[Self <: MediaConfigureSidecarItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpload_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upload_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDevice(value: Androidversion | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("device")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDevice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("device")(js.undefined)
        ret
    }
    @scala.inline
    def withEdits(value: Cropcenter | String): Self = {
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
    def withExtra(value: Sourceheight | String): Self = {
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

