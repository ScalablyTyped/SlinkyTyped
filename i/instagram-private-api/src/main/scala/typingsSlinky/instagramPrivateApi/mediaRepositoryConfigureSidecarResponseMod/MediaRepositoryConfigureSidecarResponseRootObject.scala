package typingsSlinky.instagramPrivateApi.mediaRepositoryConfigureSidecarResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaRepositoryConfigureSidecarResponseRootObject extends js.Object {
  var client_sidecar_id: String = js.native
  var media: MediaRepositoryConfigureSidecarResponseMedia = js.native
  var status: String = js.native
}

object MediaRepositoryConfigureSidecarResponseRootObject {
  @scala.inline
  def apply(client_sidecar_id: String, media: MediaRepositoryConfigureSidecarResponseMedia, status: String): MediaRepositoryConfigureSidecarResponseRootObject = {
    val __obj = js.Dynamic.literal(client_sidecar_id = client_sidecar_id.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaRepositoryConfigureSidecarResponseRootObject]
  }
  @scala.inline
  implicit class MediaRepositoryConfigureSidecarResponseRootObjectOps[Self <: MediaRepositoryConfigureSidecarResponseRootObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClient_sidecar_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_sidecar_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMedia(value: MediaRepositoryConfigureSidecarResponseMedia): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

