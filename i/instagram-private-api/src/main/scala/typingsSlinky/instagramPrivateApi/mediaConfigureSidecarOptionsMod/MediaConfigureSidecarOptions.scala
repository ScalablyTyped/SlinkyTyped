package typingsSlinky.instagramPrivateApi.mediaConfigureSidecarOptionsMod

import typingsSlinky.instagramPrivateApi.anon.Androidversion
import typingsSlinky.instagramPrivateApi.mediaConfigureOptionsMod.MediaLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaConfigureSidecarOptions extends js.Object {
  var _csrftoken: js.UndefOr[String] = js.native
  var _uid: js.UndefOr[String] = js.native
  var _uuid: js.UndefOr[String] = js.native
  var caption: js.UndefOr[String] = js.native
  var children_metadata: js.Array[MediaConfigureSidecarItem] = js.native
  var client_sidecar_id: js.UndefOr[String] = js.native
  var device: js.UndefOr[Androidversion] = js.native
  var device_id: js.UndefOr[String] = js.native
  var location: js.UndefOr[MediaLocation | String] = js.native
  var source_type: js.UndefOr[String] = js.native
  var timezone_offset: js.UndefOr[String] = js.native
  var upload_id: js.UndefOr[String] = js.native
}

object MediaConfigureSidecarOptions {
  @scala.inline
  def apply(children_metadata: js.Array[MediaConfigureSidecarItem]): MediaConfigureSidecarOptions = {
    val __obj = js.Dynamic.literal(children_metadata = children_metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaConfigureSidecarOptions]
  }
  @scala.inline
  implicit class MediaConfigureSidecarOptionsOps[Self <: MediaConfigureSidecarOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildren_metadata(value: js.Array[MediaConfigureSidecarItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children_metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_csrftoken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_csrftoken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_csrftoken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_csrftoken")(js.undefined)
        ret
    }
    @scala.inline
    def with_uid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_uid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_uid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_uid")(js.undefined)
        ret
    }
    @scala.inline
    def with_uuid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_uuid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_uuid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_uuid")(js.undefined)
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
    def withClient_sidecar_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_sidecar_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient_sidecar_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_sidecar_id")(js.undefined)
        ret
    }
    @scala.inline
    def withDevice(value: Androidversion): Self = {
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
    def withUpload_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upload_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpload_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upload_id")(js.undefined)
        ret
    }
  }
  
}

