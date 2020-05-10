package typingsSlinky.instagramPrivateApi.uploadRepositoryPhotoResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadRepositoryPhotoResponseRootObject extends js.Object {
  var status: String = js.native
  var upload_id: String = js.native
  var xsharing_nonces: UploadRepositoryPhotoResponseXsharingNonces = js.native
}

object UploadRepositoryPhotoResponseRootObject {
  @scala.inline
  def apply(status: String, upload_id: String, xsharing_nonces: UploadRepositoryPhotoResponseXsharingNonces): UploadRepositoryPhotoResponseRootObject = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], upload_id = upload_id.asInstanceOf[js.Any], xsharing_nonces = xsharing_nonces.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadRepositoryPhotoResponseRootObject]
  }
  @scala.inline
  implicit class UploadRepositoryPhotoResponseRootObjectOps[Self <: UploadRepositoryPhotoResponseRootObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withXsharing_nonces(value: UploadRepositoryPhotoResponseXsharingNonces): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xsharing_nonces")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

