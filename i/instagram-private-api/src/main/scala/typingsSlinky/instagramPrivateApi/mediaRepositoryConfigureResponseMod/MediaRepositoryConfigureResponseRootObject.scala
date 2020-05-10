package typingsSlinky.instagramPrivateApi.mediaRepositoryConfigureResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaRepositoryConfigureResponseRootObject extends js.Object {
  var media: MediaRepositoryConfigureResponseMedia = js.native
  var status: String = js.native
  var upload_id: String = js.native
}

object MediaRepositoryConfigureResponseRootObject {
  @scala.inline
  def apply(media: MediaRepositoryConfigureResponseMedia, status: String, upload_id: String): MediaRepositoryConfigureResponseRootObject = {
    val __obj = js.Dynamic.literal(media = media.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], upload_id = upload_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaRepositoryConfigureResponseRootObject]
  }
  @scala.inline
  implicit class MediaRepositoryConfigureResponseRootObjectOps[Self <: MediaRepositoryConfigureResponseRootObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMedia(value: MediaRepositoryConfigureResponseMedia): Self = {
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
    @scala.inline
    def withUpload_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upload_id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

