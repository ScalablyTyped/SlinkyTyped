package typingsSlinky.instagramPrivateApi.mediaRepositoryConfigureVideoResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaRepositoryConfigureVideoResponseRootObject extends js.Object {
  var media: MediaRepositoryConfigureVideoResponseMedia = js.native
  var status: String = js.native
  var upload_id: String = js.native
}

object MediaRepositoryConfigureVideoResponseRootObject {
  @scala.inline
  def apply(media: MediaRepositoryConfigureVideoResponseMedia, status: String, upload_id: String): MediaRepositoryConfigureVideoResponseRootObject = {
    val __obj = js.Dynamic.literal(media = media.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], upload_id = upload_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaRepositoryConfigureVideoResponseRootObject]
  }
  @scala.inline
  implicit class MediaRepositoryConfigureVideoResponseRootObjectOps[Self <: MediaRepositoryConfigureVideoResponseRootObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMedia(value: MediaRepositoryConfigureVideoResponseMedia): Self = {
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

