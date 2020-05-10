package typingsSlinky.awsSdk.iotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetUploadStatusRequest extends js.Object {
  /**
    * The ID of the upload. This value is returned by the UploadEntityDefinitions action.
    */
  var uploadId: UploadId = js.native
}

object GetUploadStatusRequest {
  @scala.inline
  def apply(uploadId: UploadId): GetUploadStatusRequest = {
    val __obj = js.Dynamic.literal(uploadId = uploadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUploadStatusRequest]
  }
  @scala.inline
  implicit class GetUploadStatusRequestOps[Self <: GetUploadStatusRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUploadId(value: UploadId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

