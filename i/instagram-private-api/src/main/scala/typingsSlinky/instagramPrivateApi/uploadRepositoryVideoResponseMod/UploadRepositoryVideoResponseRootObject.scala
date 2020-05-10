package typingsSlinky.instagramPrivateApi.uploadRepositoryVideoResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadRepositoryVideoResponseRootObject extends js.Object {
  var status: String = js.native
  var xsharing_nonces: UploadRepositoryVideoResponseXsharingNonces = js.native
}

object UploadRepositoryVideoResponseRootObject {
  @scala.inline
  def apply(status: String, xsharing_nonces: UploadRepositoryVideoResponseXsharingNonces): UploadRepositoryVideoResponseRootObject = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], xsharing_nonces = xsharing_nonces.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadRepositoryVideoResponseRootObject]
  }
  @scala.inline
  implicit class UploadRepositoryVideoResponseRootObjectOps[Self <: UploadRepositoryVideoResponseRootObject] (val x: Self) extends AnyVal {
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
    def withXsharing_nonces(value: UploadRepositoryVideoResponseXsharingNonces): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xsharing_nonces")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

